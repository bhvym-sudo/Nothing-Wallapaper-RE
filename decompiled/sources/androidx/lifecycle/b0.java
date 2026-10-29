package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public abstract class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p002a1.e f13366a = new p002a1.e();

    public static final F8.L a(a0 a0Var) {
        p002a1.a aVarA;
        kotlin.jvm.internal.n.h(a0Var, "<this>");
        synchronized (f13366a) {
            aVarA = (p002a1.a) a0Var.c("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (aVarA == null) {
                aVarA = p002a1.b.a();
                a0Var.a("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", aVarA);
            }
        }
        return aVarA;
    }
}
