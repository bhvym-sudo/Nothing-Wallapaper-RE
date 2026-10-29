package p240y;

import E8.a;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f30091a;

    public d(int i10) {
        this.f30091a = i10;
    }

    public final int a() {
        return this.f30091a;
    }

    public final void b(int i10) {
        this.f30091a = i10;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IntRef(element = ");
        sb.append(this.f30091a);
        sb.append(")@");
        String string = Integer.toString(hashCode(), a.a(16));
        n.g(string, "toString(this, checkRadix(radix))");
        sb.append(string);
        return sb.toString();
    }

    public /* synthetic */ d(int i10, int i11, AbstractC1457h abstractC1457h) {
        this((i11 & 1) != 0 ? 0 : i10);
    }
}
