package V5;

import F2.C0795b;
import F2.C0798e;
import android.graphics.Rect;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f8193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f8194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f8195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C0798e f8196d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C0798e f8197e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f8198f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean[][] f8199g;

    public b(int i10, int i11, int i12) {
        this.f8193a = i10;
        this.f8194b = i11;
        this.f8195c = i12;
        C0798e c0798e = new C0798e(i10, i11);
        this.f8196d = c0798e;
        this.f8197e = new C0798e(i10, i12);
        boolean[][] cells = c0798e.f1566c;
        n.g(cells, "cells");
        this.f8199g = cells;
    }

    private final C0798e f() {
        return this.f8198f ? this.f8196d : this.f8197e;
    }

    public final void a() {
        this.f8196d.b();
        this.f8197e.b();
    }

    public final void b(b dest) {
        n.h(dest, "dest");
        this.f8196d.c(dest.f8196d);
        this.f8197e.c(dest.f8197e);
    }

    public final boolean c(int[] vacantOut, int i10, int i11) {
        n.h(vacantOut, "vacantOut");
        return f().d(vacantOut, i10, i11);
    }

    public final boolean[][] d() {
        boolean[][] cells = f().f1566c;
        n.g(cells, "cells");
        return cells;
    }

    public final int e() {
        return this.f8198f ? this.f8194b : this.f8195c;
    }

    public final boolean g(int i10, int i11, int i12, int i13) {
        return f().e(i10, i11, i12, i13);
    }

    public final boolean h(int i10, int i11, int i12, int i13) {
        return f().f(i10, i11, i12, i13);
    }

    public final void i(int i10, int i11, int i12, int i13, boolean z9) {
        this.f8196d.g(i10, i11, i12, i13, z9);
        this.f8197e.g(i10, i11, i12, i13, z9);
    }

    public final void j(C2.b item, boolean z9) {
        n.h(item, "item");
        this.f8196d.h(item, z9);
        this.f8197e.h(item, z9);
    }

    public final void k(C0795b cell, boolean z9) {
        n.h(cell, "cell");
        this.f8196d.i(cell, z9);
        this.f8197e.i(cell, z9);
    }

    public final void l(Rect r9, boolean z9) {
        n.h(r9, "r");
        this.f8196d.j(r9, z9);
        this.f8197e.j(r9, z9);
    }

    public String toString() {
        return "occupied4X4=" + this.f8196d + " \n occupied4X2=" + this.f8197e + " \n curOccupied=" + f();
    }
}
