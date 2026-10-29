package com.nothing.cardwidget.mediaplayer.entity;

import N5.a;
import android.os.Bundle;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class MusicPlayingPosition implements a {
    public static final Companion Companion = new Companion(null);
    private static final String KEY_PLAYING_POSITION = "playingPosition";
    private final int playingPosition;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1457h abstractC1457h) {
            this();
        }

        public final boolean belongTo(Bundle data) {
            n.h(data, "data");
            return data.containsKey(MusicPlayingPosition.KEY_PLAYING_POSITION);
        }

        public final a parseData(Bundle bundle) {
            n.h(bundle, "bundle");
            return new MusicPlayingPosition(bundle.getInt(MusicPlayingPosition.KEY_PLAYING_POSITION, 0));
        }

        private Companion() {
        }
    }

    public MusicPlayingPosition() {
        this(0, 1, null);
    }

    public static /* synthetic */ MusicPlayingPosition copy$default(MusicPlayingPosition musicPlayingPosition, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = musicPlayingPosition.playingPosition;
        }
        return musicPlayingPosition.copy(i10);
    }

    public final int component1() {
        return this.playingPosition;
    }

    public final MusicPlayingPosition copy(int i10) {
        return new MusicPlayingPosition(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MusicPlayingPosition) && this.playingPosition == ((MusicPlayingPosition) obj).playingPosition;
    }

    public final int getPlayingPosition() {
        return this.playingPosition;
    }

    public int hashCode() {
        return Integer.hashCode(this.playingPosition);
    }

    public String toString() {
        return "MusicPlayingPosition(playingPosition=" + this.playingPosition + ")";
    }

    public MusicPlayingPosition(int i10) {
        this.playingPosition = i10;
    }

    public /* synthetic */ MusicPlayingPosition(int i10, int i11, AbstractC1457h abstractC1457h) {
        this((i11 & 1) != 0 ? 0 : i10);
    }
}
