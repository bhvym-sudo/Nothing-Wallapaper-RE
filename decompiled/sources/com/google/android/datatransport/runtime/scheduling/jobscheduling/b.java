package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final JobInfoSchedulerService f16174q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final JobParameters f16175r;

    private b(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        this.f16174q = jobInfoSchedulerService;
        this.f16175r = jobParameters;
    }

    public static Runnable a(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        return new b(jobInfoSchedulerService, jobParameters);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f16174q.jobFinished(this.f16175r, false);
    }
}
