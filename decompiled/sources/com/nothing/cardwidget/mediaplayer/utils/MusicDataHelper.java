package com.nothing.cardwidget.mediaplayer.utils;

import N5.b;
import android.os.Bundle;
import android.util.SparseArray;
import com.nothing.cardwidget.mediaplayer.entity.MusicPlaybackState;
import com.nothing.cardwidget.mediaplayer.entity.MusicPlayingPosition;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.n;
import p079h8.u;

/* JADX INFO: loaded from: classes2.dex */
public final class MusicDataHelper {
    private static Bundle musicMetaData;
    private static Bundle musicPlaybackState;
    private static Bundle playingPosition;
    public static final MusicDataHelper INSTANCE = new MusicDataHelper();
    private static Map<Integer, Boolean> widgetsEnableRecords = new LinkedHashMap();
    private static SparseArray<String> musicIdentifyMap = new SparseArray<>(1);

    private MusicDataHelper() {
    }

    public final void cacheData(Bundle bundleData) {
        n.h(bundleData, "bundleData");
        if (b.f5369m.a(bundleData)) {
            musicMetaData = bundleData;
        } else if (MusicPlaybackState.Companion.belongTo(bundleData)) {
            musicPlaybackState = bundleData;
        } else if (MusicPlayingPosition.Companion.belongTo(bundleData)) {
            playingPosition = bundleData;
        }
    }

    public final void clearCachedData() {
        widgetsEnableRecords.clear();
        Bundle bundle = musicMetaData;
        if (bundle != null) {
            bundle.clear();
        }
        Bundle bundle2 = musicPlaybackState;
        if (bundle2 != null) {
            bundle2.clear();
        }
        Bundle bundle3 = playingPosition;
        if (bundle3 != null) {
            bundle3.clear();
        }
        musicIdentifyMap.clear();
    }

    public final String getAppName() {
        Bundle bundle = musicMetaData;
        if (bundle != null) {
            N5.a musicData = INSTANCE.parseMusicData(bundle);
            b bVar = musicData instanceof b ? (b) musicData : null;
            if (bVar != null) {
                return bVar.l();
            }
        }
        return null;
    }

    public final u getCachedData() {
        return new u(musicMetaData, musicPlaybackState, playingPosition);
    }

    public final String getMusicFlag(int i10) {
        return musicIdentifyMap.get(i10);
    }

    public final Integer getPlaybackState() {
        Bundle bundle = musicPlaybackState;
        if (bundle != null) {
            N5.a musicData = INSTANCE.parseMusicData(bundle);
            MusicPlaybackState musicPlaybackState2 = musicData instanceof MusicPlaybackState ? (MusicPlaybackState) musicData : null;
            if (musicPlaybackState2 != null) {
                return Integer.valueOf(musicPlaybackState2.getState());
            }
        }
        return null;
    }

    public final Boolean isWidgetEnabled(int i10) {
        return widgetsEnableRecords.get(Integer.valueOf(i10));
    }

    public final void markMusicFlag(int i10, b data) {
        n.h(data, "data");
        musicIdentifyMap.put(i10, data.j());
    }

    public final N5.a parseMusicData(Bundle bundleData) {
        n.h(bundleData, "bundleData");
        b.a aVar = b.f5369m;
        if (aVar.a(bundleData)) {
            return aVar.b(bundleData);
        }
        MusicPlaybackState.Companion companion = MusicPlaybackState.Companion;
        if (companion.belongTo(bundleData)) {
            return companion.parseData(bundleData);
        }
        MusicPlayingPosition.Companion companion2 = MusicPlayingPosition.Companion;
        if (companion2.belongTo(bundleData)) {
            return companion2.parseData(bundleData);
        }
        return null;
    }

    public final void setWidgetEnabled(int i10, boolean z9) {
        widgetsEnableRecords.put(Integer.valueOf(i10), Boolean.valueOf(z9));
    }
}
