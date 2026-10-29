package p005a4;

import Z3.c;

/* JADX INFO: loaded from: classes.dex */
public final class h extends UnsupportedOperationException {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final c f9842q;

    public h(c cVar) {
        this.f9842q = cVar;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.f9842q));
    }
}
