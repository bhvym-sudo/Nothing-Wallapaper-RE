package com.nothing.cardwidget.mediaplayer.entity;

import p149o8.a;
import p149o8.b;

/* JADX INFO: loaded from: classes2.dex */
public enum MusicControlEvent {
    PLAY("play_music"),
    PAUSE("pause_music"),
    PREVIOUS("previous_music"),
    NEXT("next_music");

    private static final /* synthetic */ a $ENTRIES = b.a(values());
    private final String event;

    MusicControlEvent(String str) {
        this.event = str;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public final String getEvent() {
        return this.event;
    }
}
