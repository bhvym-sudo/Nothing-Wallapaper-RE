package com.google.android.datatransport.runtime.scheduling.jobscheduling;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final a f16173q = new a();

    private a() {
    }

    public static Runnable a() {
        return f16173q;
    }

    @Override // java.lang.Runnable
    public void run() {
        AlarmManagerSchedulerBroadcastReceiver.a();
    }
}
