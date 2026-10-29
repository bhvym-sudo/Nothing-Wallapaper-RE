package androidx.lifecycle;

import android.content.Context;
import java.util.List;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements p172r1.a {
    @Override // p172r1.a
    public List a() {
        return AbstractC1444s.l();
    }

    @Override // p172r1.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC1163x b(Context context) {
        kotlin.jvm.internal.n.h(context, "context");
        androidx.startup.a aVarE = androidx.startup.a.e(context);
        kotlin.jvm.internal.n.g(aVarE, "getInstance(context)");
        if (!aVarE.g(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        C1159t.a(context);
        L.b bVar = L.f13286y;
        bVar.b(context);
        return bVar.a();
    }
}
