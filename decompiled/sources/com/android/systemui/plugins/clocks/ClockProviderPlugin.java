package com.android.systemui.plugins.clocks;

import N2.c;
import O2.h;
import O2.r;
import O2.t;
import O2.u;
import O2.v;
import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@c(action = ClockProviderPlugin.ACTION, version = 1)
public interface ClockProviderPlugin extends M2.a, u {
    public static final String ACTION = "com.android.systemui.action.PLUGIN_CLOCK_PROVIDER";
    public static final a Companion = a.f15772a;
    public static final int VERSION = 1;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f15772a = new a();

        private a() {
        }
    }

    @Override // O2.u
    /* synthetic */ h createClock(v vVar);

    @Override // O2.u
    /* synthetic */ t getClockPickerConfig(v vVar);

    @Override // O2.u
    /* synthetic */ List getClocks();

    @Override // M2.a
    @Deprecated
    /* bridge */ /* synthetic */ default int getVersion() {
        return super.getVersion();
    }

    @Override // O2.u
    /* synthetic */ void initialize(r rVar);

    @Override // M2.a
    /* bridge */ /* synthetic */ default void onCreate(Context context, Context context2) {
        super.onCreate(context, context2);
    }

    @Override // M2.a
    /* bridge */ /* synthetic */ default void onDestroy() {
        super.onDestroy();
    }
}
