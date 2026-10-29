package com.nothing.cardwidget.mediaplayer.entity;

import N5.a;
import android.os.Bundle;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class MusicPlaybackState implements a {
    private static final int CONNECTED = 1;
    public static final Companion Companion = new Companion(null);
    private static final int DISCONNECTED = 0;
    private static final String KEY_PLAY_STATE = "playingState";
    private static final int NEXT = 5;
    private static final int PAUSE = 3;
    private static final int PLAYING = 2;
    private static final int PREVIOUS = 4;
    private static final int UNAUTHORIZED = -1;
    private final int state;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1457h abstractC1457h) {
            this();
        }

        public final boolean belongTo(Bundle data) {
            n.h(data, "data");
            return data.containsKey(MusicPlaybackState.KEY_PLAY_STATE);
        }

        public final boolean isConnected(int i10) {
            return i10 >= 1;
        }

        public final boolean isPause(int i10) {
            return i10 == 3;
        }

        public final boolean isPlaying(int i10) {
            return i10 == 2;
        }

        public final boolean needEnableMusicService(int i10) {
            return i10 == 0;
        }

        public final boolean needNotificationAuth(int i10) {
            return i10 == -1;
        }

        public final a parseData(Bundle bundle) {
            n.h(bundle, "bundle");
            return new MusicPlaybackState(bundle.getInt(MusicPlaybackState.KEY_PLAY_STATE, 1));
        }

        private Companion() {
        }
    }

    public MusicPlaybackState(int i10) {
        this.state = i10;
    }

    public final int getState() {
        return this.state;
    }
}
