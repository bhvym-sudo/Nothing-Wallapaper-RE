package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d extends a {
    private final p129m8.i _context;
    private transient p129m8.e<Object> intercepted;

    public d(p129m8.e eVar, p129m8.i iVar) {
        super(eVar);
        this._context = iVar;
    }

    @Override // p129m8.e
    public p129m8.i getContext() {
        p129m8.i iVar = this._context;
        n.e(iVar);
        return iVar;
    }

    public final p129m8.e<Object> intercepted() {
        p129m8.e eVarU = this.intercepted;
        if (eVarU == null) {
            p129m8.f fVar = (p129m8.f) getContext().b(p129m8.f.f23250l);
            if (fVar == null || (eVarU = fVar.U(this)) == null) {
                eVarU = this;
            }
            this.intercepted = eVarU;
        }
        return eVarU;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    protected void releaseIntercepted() {
        p129m8.e<Object> eVar = this.intercepted;
        if (eVar != null && eVar != this) {
            m8.i.b bVarB = getContext().b(p129m8.f.f23250l);
            n.e(bVarB);
            ((p129m8.f) bVarB).Y(eVar);
        }
        this.intercepted = c.f22767q;
    }

    public d(p129m8.e eVar) {
        this(eVar, eVar != null ? eVar.getContext() : null);
    }
}
