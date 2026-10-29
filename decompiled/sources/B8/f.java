package B8;

import java.util.NoSuchElementException;
import p089i8.L;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends L {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f436q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f437r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f438s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f439t;

    public f(int i10, int i11, int i12) {
        this.f436q = i12;
        this.f437r = i11;
        boolean z9 = false;
        if (i12 <= 0 ? i10 >= i11 : i10 <= i11) {
            z9 = true;
        }
        this.f438s = z9;
        this.f439t = z9 ? i10 : i11;
    }

    @Override // p089i8.L
    public int a() {
        int i10 = this.f439t;
        if (i10 != this.f437r) {
            this.f439t = this.f436q + i10;
            return i10;
        }
        if (!this.f438s) {
            throw new NoSuchElementException();
        }
        this.f438s = false;
        return i10;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f438s;
    }
}
