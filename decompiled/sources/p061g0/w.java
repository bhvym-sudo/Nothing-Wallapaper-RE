package p061g0;

import kotlin.jvm.internal.n;
import p031d0.a;

/* JADX INFO: loaded from: classes.dex */
public final class w implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f20988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f20989b;

    public w(a aVar, int i10) {
        this.f20988a = aVar;
        this.f20989b = i10;
    }

    public final String a() {
        return this.f20988a.h();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return n.d(a(), wVar.a()) && this.f20989b == wVar.f20989b;
    }

    public int hashCode() {
        return (a().hashCode() * 31) + this.f20989b;
    }

    public String toString() {
        return "SetComposingTextCommand(text='" + a() + "', newCursorPosition=" + this.f20989b + ')';
    }

    public w(String str, int i10) {
        this(new a(str, null, null, 6, null), i10);
    }
}
