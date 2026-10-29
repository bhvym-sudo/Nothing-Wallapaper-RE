package Z4;

import p025c4.AbstractC1202p;

/* JADX INFO: loaded from: classes.dex */
public class a extends Exception {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f9481q;

    public a(String str, int i10) {
        super(AbstractC1202p.f(str, "Provided message must not be empty."));
        this.f9481q = i10;
    }

    public a(String str, int i10, Throwable th) {
        super(AbstractC1202p.f(str, "Provided message must not be empty."), th);
        this.f9481q = i10;
    }
}
