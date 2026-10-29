package S3;

import T3.InterfaceC0949c;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.bumptech.glide.load.Key;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;

/* JADX INFO: loaded from: classes.dex */
public class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f7234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0949c f7235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f7236c;

    public c(Context context, InterfaceC0949c interfaceC0949c, d dVar) {
        this.f7234a = context;
        this.f7235b = interfaceC0949c;
        this.f7236c = dVar;
    }

    private boolean d(JobScheduler jobScheduler, int i10, int i11) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i12 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i10) {
                if (i12 >= i11) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // S3.p
    public void a(M3.m mVar, int i10, boolean z9) {
        ComponentName componentName = new ComponentName(this.f7234a, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f7234a.getSystemService("jobscheduler");
        int iC = c(mVar);
        if (!z9 && d(jobScheduler, iC, i10)) {
            P3.a.a("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", mVar);
            return;
        }
        long J9 = this.f7235b.J(mVar);
        JobInfo.Builder builderC = this.f7236c.c(new JobInfo.Builder(iC, componentName), mVar.d(), J9, i10);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i10);
        persistableBundle.putString("backendName", mVar.b());
        persistableBundle.putInt("priority", W3.a.a(mVar.d()));
        if (mVar.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(mVar.c(), 0));
        }
        builderC.setExtras(persistableBundle);
        P3.a.b("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", mVar, Integer.valueOf(iC), Long.valueOf(this.f7236c.g(mVar.d(), J9, i10)), Long.valueOf(J9), Integer.valueOf(i10));
        jobScheduler.schedule(builderC.build());
    }

    @Override // S3.p
    public void b(M3.m mVar, int i10) {
        a(mVar, i10, false);
    }

    int c(M3.m mVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f7234a.getPackageName().getBytes(Charset.forName(Key.STRING_CHARSET_NAME)));
        adler32.update(mVar.b().getBytes(Charset.forName(Key.STRING_CHARSET_NAME)));
        adler32.update(ByteBuffer.allocate(4).putInt(W3.a.a(mVar.d())).array());
        if (mVar.c() != null) {
            adler32.update(mVar.c());
        }
        return (int) adler32.getValue();
    }
}
