package p025c4;

import Z3.d;
import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import p005a4.a;
import p005a4.e;
import p015b4.InterfaceC1183c;
import p015b4.h;

/* JADX INFO: renamed from: c4.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1193g extends AbstractC1189c implements a.f {

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private final C1190d f15176V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private final Set f15177W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private final Account f15178X;

    protected AbstractC1193g(Context context, Looper looper, int i10, C1190d c1190d, e.a aVar, e.b bVar) {
        this(context, looper, i10, c1190d, (InterfaceC1183c) aVar, (h) bVar);
    }

    private final Set i0(Set set) {
        Set setH0 = h0(set);
        Iterator it = setH0.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return setH0;
    }

    @Override // p025c4.AbstractC1189c
    protected final Set B() {
        return this.f15177W;
    }

    @Override // a4.a.f
    public Set b() {
        return o() ? this.f15177W : Collections.EMPTY_SET;
    }

    protected Set h0(Set set) {
        return set;
    }

    @Override // p025c4.AbstractC1189c
    public final Account t() {
        return this.f15178X;
    }

    @Override // p025c4.AbstractC1189c
    protected final Executor v() {
        return null;
    }

    protected AbstractC1193g(Context context, Looper looper, int i10, C1190d c1190d, InterfaceC1183c interfaceC1183c, h hVar) {
        this(context, looper, AbstractC1194h.b(context), d.l(), i10, c1190d, (InterfaceC1183c) AbstractC1202p.i(interfaceC1183c), (h) AbstractC1202p.i(hVar));
    }

    protected AbstractC1193g(Context context, Looper looper, AbstractC1194h abstractC1194h, d dVar, int i10, C1190d c1190d, InterfaceC1183c interfaceC1183c, h hVar) {
        super(context, looper, abstractC1194h, dVar, i10, interfaceC1183c == null ? null : new D(interfaceC1183c), hVar != null ? new E(hVar) : null, c1190d.h());
        this.f15176V = c1190d;
        this.f15178X = c1190d.a();
        this.f15177W = i0(c1190d.c());
    }
}
