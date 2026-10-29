package p101k0;

import I.AbstractC0868l;
import I.r;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
final class b implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f22623b;

    public /* synthetic */ b(long j9, AbstractC1457h abstractC1457h) {
        this(j9);
    }

    @Override // p101k0.j
    public AbstractC0868l a() {
        return null;
    }

    @Override // p101k0.j
    public float b() {
        return r.m(c());
    }

    @Override // p101k0.j
    public long c() {
        return this.f22623b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && r.l(this.f22623b, ((b) obj).f22623b);
    }

    public int hashCode() {
        return r.r(this.f22623b);
    }

    public String toString() {
        return "ColorStyle(value=" + ((Object) r.s(this.f22623b)) + ')';
    }

    private b(long j9) {
        this.f22623b = j9;
        if (j9 == 16) {
            throw new IllegalArgumentException("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
        }
    }
}
