package com.nothing.wallpaper.picker.creative.network;

import androidx.annotation.Keep;
import com.nothing.wallpaper.picker.creative.network.entity.PromptResponse;
import com.nothing.wallpaper.picker.creative.network.entity.WallpaperResponse;
import g9.d;
import i9.o;
import java.util.List;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public interface WallpaperApi {

    @Keep
    public static final class DeviceParam {
        private final String color;
        private final String language;
        private final String model;
        private final int version;

        public DeviceParam(String language, int i10, String model, String color) {
            n.h(language, "language");
            n.h(model, "model");
            n.h(color, "color");
            this.language = language;
            this.version = i10;
            this.model = model;
            this.color = color;
        }

        public static /* synthetic */ DeviceParam copy$default(DeviceParam deviceParam, String str, int i10, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = deviceParam.language;
            }
            if ((i11 & 2) != 0) {
                i10 = deviceParam.version;
            }
            if ((i11 & 4) != 0) {
                str2 = deviceParam.model;
            }
            if ((i11 & 8) != 0) {
                str3 = deviceParam.color;
            }
            return deviceParam.copy(str, i10, str2, str3);
        }

        public final String component1() {
            return this.language;
        }

        public final int component2() {
            return this.version;
        }

        public final String component3() {
            return this.model;
        }

        public final String component4() {
            return this.color;
        }

        public final DeviceParam copy(String language, int i10, String model, String color) {
            n.h(language, "language");
            n.h(model, "model");
            n.h(color, "color");
            return new DeviceParam(language, i10, model, color);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeviceParam)) {
                return false;
            }
            DeviceParam deviceParam = (DeviceParam) obj;
            return n.d(this.language, deviceParam.language) && this.version == deviceParam.version && n.d(this.model, deviceParam.model) && n.d(this.color, deviceParam.color);
        }

        public final String getColor() {
            return this.color;
        }

        public final String getLanguage() {
            return this.language;
        }

        public final String getModel() {
            return this.model;
        }

        public final int getVersion() {
            return this.version;
        }

        public int hashCode() {
            return (((((this.language.hashCode() * 31) + Integer.hashCode(this.version)) * 31) + this.model.hashCode()) * 31) + this.color.hashCode();
        }

        public String toString() {
            return "DeviceParam(language=" + this.language + ", version=" + this.version + ", model=" + this.model + ", color=" + this.color + ")";
        }
    }

    @Keep
    public static final class PromptParam {
        private final String category;
        private final String promptWordEn;
        private final long promptWordId;

        public PromptParam(long j9, String category, String promptWordEn) {
            n.h(category, "category");
            n.h(promptWordEn, "promptWordEn");
            this.promptWordId = j9;
            this.category = category;
            this.promptWordEn = promptWordEn;
        }

        public static /* synthetic */ PromptParam copy$default(PromptParam promptParam, long j9, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j9 = promptParam.promptWordId;
            }
            if ((i10 & 2) != 0) {
                str = promptParam.category;
            }
            if ((i10 & 4) != 0) {
                str2 = promptParam.promptWordEn;
            }
            return promptParam.copy(j9, str, str2);
        }

        public final long component1() {
            return this.promptWordId;
        }

        public final String component2() {
            return this.category;
        }

        public final String component3() {
            return this.promptWordEn;
        }

        public final PromptParam copy(long j9, String category, String promptWordEn) {
            n.h(category, "category");
            n.h(promptWordEn, "promptWordEn");
            return new PromptParam(j9, category, promptWordEn);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PromptParam)) {
                return false;
            }
            PromptParam promptParam = (PromptParam) obj;
            return this.promptWordId == promptParam.promptWordId && n.d(this.category, promptParam.category) && n.d(this.promptWordEn, promptParam.promptWordEn);
        }

        public final String getCategory() {
            return this.category;
        }

        public final String getPromptWordEn() {
            return this.promptWordEn;
        }

        public final long getPromptWordId() {
            return this.promptWordId;
        }

        public int hashCode() {
            return (((Long.hashCode(this.promptWordId) * 31) + this.category.hashCode()) * 31) + this.promptWordEn.hashCode();
        }

        public String toString() {
            return "PromptParam(promptWordId=" + this.promptWordId + ", category=" + this.category + ", promptWordEn=" + this.promptWordEn + ")";
        }
    }

    @Keep
    public static final class WallpaperCountParam {
        private final long styleId;
        private final long subjectId;

        public WallpaperCountParam(long j9, long j10) {
            this.subjectId = j9;
            this.styleId = j10;
        }

        public static /* synthetic */ WallpaperCountParam copy$default(WallpaperCountParam wallpaperCountParam, long j9, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j9 = wallpaperCountParam.subjectId;
            }
            if ((i10 & 2) != 0) {
                j10 = wallpaperCountParam.styleId;
            }
            return wallpaperCountParam.copy(j9, j10);
        }

        public final long component1() {
            return this.subjectId;
        }

        public final long component2() {
            return this.styleId;
        }

        public final WallpaperCountParam copy(long j9, long j10) {
            return new WallpaperCountParam(j9, j10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WallpaperCountParam)) {
                return false;
            }
            WallpaperCountParam wallpaperCountParam = (WallpaperCountParam) obj;
            return this.subjectId == wallpaperCountParam.subjectId && this.styleId == wallpaperCountParam.styleId;
        }

        public final long getStyleId() {
            return this.styleId;
        }

        public final long getSubjectId() {
            return this.subjectId;
        }

        public int hashCode() {
            return (Long.hashCode(this.subjectId) * 31) + Long.hashCode(this.styleId);
        }

        public String toString() {
            return "WallpaperCountParam(subjectId=" + this.subjectId + ", styleId=" + this.styleId + ")";
        }
    }

    @Keep
    public static final class WallpaperParam {
        private final int clue;
        private final List<PromptParam> promptSet;
        private final String pseudoUserId;

        public WallpaperParam(String pseudoUserId, int i10, List<PromptParam> promptSet) {
            n.h(pseudoUserId, "pseudoUserId");
            n.h(promptSet, "promptSet");
            this.pseudoUserId = pseudoUserId;
            this.clue = i10;
            this.promptSet = promptSet;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ WallpaperParam copy$default(WallpaperParam wallpaperParam, String str, int i10, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = wallpaperParam.pseudoUserId;
            }
            if ((i11 & 2) != 0) {
                i10 = wallpaperParam.clue;
            }
            if ((i11 & 4) != 0) {
                list = wallpaperParam.promptSet;
            }
            return wallpaperParam.copy(str, i10, list);
        }

        public final String component1() {
            return this.pseudoUserId;
        }

        public final int component2() {
            return this.clue;
        }

        public final List<PromptParam> component3() {
            return this.promptSet;
        }

        public final WallpaperParam copy(String pseudoUserId, int i10, List<PromptParam> promptSet) {
            n.h(pseudoUserId, "pseudoUserId");
            n.h(promptSet, "promptSet");
            return new WallpaperParam(pseudoUserId, i10, promptSet);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WallpaperParam)) {
                return false;
            }
            WallpaperParam wallpaperParam = (WallpaperParam) obj;
            return n.d(this.pseudoUserId, wallpaperParam.pseudoUserId) && this.clue == wallpaperParam.clue && n.d(this.promptSet, wallpaperParam.promptSet);
        }

        public final int getClue() {
            return this.clue;
        }

        public final List<PromptParam> getPromptSet() {
            return this.promptSet;
        }

        public final String getPseudoUserId() {
            return this.pseudoUserId;
        }

        public int hashCode() {
            return (((this.pseudoUserId.hashCode() * 31) + Integer.hashCode(this.clue)) * 31) + this.promptSet.hashCode();
        }

        public String toString() {
            return "WallpaperParam(pseudoUserId=" + this.pseudoUserId + ", clue=" + this.clue + ", promptSet=" + this.promptSet + ")";
        }
    }

    @o("/wallpaper/aiApi/v1/getClue")
    d<ResponseData<Integer>> a(@i9.a WallpaperCountParam wallpaperCountParam);

    @o("/wallpaper/aiApi/v2/getSettings")
    d<ResponseData<PromptResponse>> b(@i9.a DeviceParam deviceParam);

    @o("/wallpaper/aiApi/v2/getWallpapers")
    d<ResponseData<WallpaperResponse>> c(@i9.a WallpaperParam wallpaperParam);
}
