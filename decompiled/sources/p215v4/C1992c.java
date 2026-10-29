package p215v4;

/* JADX INFO: renamed from: v4.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1992c extends IllegalStateException {
    private C1992c(String str, Throwable th) {
        super(str, th);
    }

    public static IllegalStateException a(k kVar) {
        String strConcat;
        if (!kVar.k()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception excH = kVar.h();
        if (excH != null) {
            strConcat = "failure";
        } else if (kVar.l()) {
            strConcat = "result ".concat(String.valueOf(kVar.i()));
        } else {
            strConcat = kVar.j() ? "cancellation" : "unknown issue";
        }
        return new C1992c("Complete with: ".concat(strConcat), excH);
    }
}
