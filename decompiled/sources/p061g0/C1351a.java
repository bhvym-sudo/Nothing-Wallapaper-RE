package p061g0;

import kotlin.jvm.internal.n;
import p031d0.a;

/* JADX INFO: renamed from: g0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1351a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f20913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f20914b;

    public C1351a(a aVar, int i10) {
        this.f20913a = aVar;
        this.f20914b = i10;
    }

    public final String a() {
        return this.f20913a.h();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1351a)) {
            return false;
        }
        C1351a c1351a = (C1351a) obj;
        return n.d(a(), c1351a.a()) && this.f20914b == c1351a.f20914b;
    }

    public int hashCode() {
        return (a().hashCode() * 31) + this.f20914b;
    }

    public String toString() {
        return "CommitTextCommand(text='" + a() + "', newCursorPosition=" + this.f20914b + ')';
    }

    public C1351a(String str, int i10) {
        this(new a(str, null, null, 6, null), i10);
    }
}
