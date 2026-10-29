package com.nothing.cardwidget.mediaplayer.entity;

import kotlin.jvm.internal.AbstractC1457h;
import p149o8.a;
import p149o8.b;

/* JADX INFO: loaded from: classes2.dex */
public enum PlaybackStateAction {
    ACTION_NONE(0),
    ACTION_SKIP_TO_PREVIOUS(1),
    ACTION_SKIP_TO_NEXT(2),
    ACTION_SEEK_TO(4);

    private final long action;
    private static final /* synthetic */ a $ENTRIES = b.a(values());
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1457h abstractC1457h) {
            this();
        }

        private final boolean supportNextAction(byte b10) {
            return ((byte) (((byte) ((int) PlaybackStateAction.ACTION_SKIP_TO_NEXT.getAction())) & b10)) != 0;
        }

        private final boolean supportPreviousAction(byte b10) {
            return ((byte) (((byte) ((int) PlaybackStateAction.ACTION_SKIP_TO_PREVIOUS.getAction())) & b10)) != 0;
        }

        private final boolean supportSeekAction(byte b10) {
            return ((byte) (((byte) ((int) PlaybackStateAction.ACTION_SEEK_TO.getAction())) & b10)) != 0;
        }

        public final boolean supportSlideNext(byte b10) {
            return supportNextAction(b10) || supportSeekAction(b10);
        }

        public final boolean supportSlidePrevious(byte b10) {
            return supportPreviousAction(b10) || supportSeekAction(b10);
        }

        private Companion() {
        }
    }

    PlaybackStateAction(long j9) {
        this.action = j9;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public final long getAction() {
        return this.action;
    }
}
