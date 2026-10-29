#!/usr/bin/env bash
set -euo pipefail

BASE_URL="${NOTHINGWALL_BASE_URL:-https://wallpaper.nothingtech.link}"
SECRET_KEY="${NOTHINGWALL_SECRET_KEY:?Set NOTHINGWALL_SECRET_KEY in your environment}"

usage() {
  cat <<'EOF'
Usage:
  ./nothingwall_api.sh settings [language] [model] [color]
  ./nothingwall_api.sh clue <subject-id> <style-id>
  ./nothingwall_api.sh generate <subject-id> <subject-word> <style-id> <style-word> [clue] [user-id]

Examples:
  ./nothingwall_api.sh settings en-in A063 black
  ./nothingwall_api.sh clue 1 20
  ./nothingwall_api.sh generate 1 Flora 20 "Black and white" 0

The settings response contains the valid subject/style IDs and English prompt words.
EOF
}

require_command() {
  command -v "$1" >/dev/null 2>&1 || {
    printf 'Missing required command: %s\n' "$1" >&2
    exit 1
  }
}

post_json() {
  local endpoint="$1"
  local body="$2"
  local timestamp auth

  timestamp="$(date +%s%3N)"
  auth="$(printf '%s' "${SECRET_KEY}${timestamp}" | md5sum | cut -d' ' -f1)"

  curl --fail-with-body --silent --show-error \
    --request POST "${BASE_URL}${endpoint}" \
    --header 'Accept: application/json;charset=utf-8' \
    --header 'Content-Type: application/json' \
    --header "timestamp: ${timestamp}" \
    --header "auth: ${auth}" \
    --data-raw "$body"
}

new_user_id() {
  if command -v uuidgen >/dev/null 2>&1; then
    uuidgen | tr '[:upper:]' '[:lower:]'
  else
    cat /proc/sys/kernel/random/uuid
  fi
}

require_command curl
require_command jq
require_command md5sum

command_name="${1:-}"
case "$command_name" in
  settings)
    language="${2:-en-in}"
    model="${3:-A063}"
    color="${4:-black}"
    body="$(jq -cn \
      --arg language "$language" \
      --arg model "$model" \
      --arg color "$color" \
      '{language: $language, version: 0, model: $model, color: $color}')"
    post_json '/wallpaper/aiApi/v2/getSettings' "$body" | jq .
    ;;

  clue)
    [[ $# -eq 3 ]] || { usage >&2; exit 1; }
    body="$(jq -cn \
      --argjson subjectId "$2" \
      --argjson styleId "$3" \
      '{subjectId: $subjectId, styleId: $styleId}')"
    post_json '/wallpaper/aiApi/v1/getClue' "$body" | jq .
    ;;

  generate)
    [[ $# -ge 5 && $# -le 7 ]] || { usage >&2; exit 1; }
    subject_id="$2"
    subject_word="$3"
    style_id="$4"
    style_word="$5"
    clue="${6:-0}"
    user_id="${7:-$(new_user_id)}"
    body="$(jq -cn \
      --arg pseudoUserId "$user_id" \
      --argjson clue "$clue" \
      --argjson subjectId "$subject_id" \
      --arg subjectWord "$subject_word" \
      --argjson styleId "$style_id" \
      --arg styleWord "$style_word" \
      '{
        pseudoUserId: $pseudoUserId,
        clue: $clue,
        promptSet: [
          {promptWordId: $subjectId, category: "subject", promptWordEn: $subjectWord},
          {promptWordId: $styleId, category: "style", promptWordEn: $styleWord}
        ]
      }')"
    post_json '/wallpaper/aiApi/v2/getWallpapers' "$body" | jq .
    ;;

  *)
    usage >&2
    exit 1
    ;;
esac
