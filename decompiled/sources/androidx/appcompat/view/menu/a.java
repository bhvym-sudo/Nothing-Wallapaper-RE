package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements j {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected Context f10403q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected Context f10404r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected e f10405s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected LayoutInflater f10406t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected LayoutInflater f10407u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private j.a f10408v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f10409w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f10410x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected k f10411y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f10412z;

    public a(Context context, int i10, int i11) {
        this.f10403q = context;
        this.f10406t = LayoutInflater.from(context);
        this.f10409w = i10;
        this.f10410x = i11;
    }

    protected void a(View view, int i10) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f10411y).addView(view, i10);
    }

    public abstract void b(g gVar, k.a aVar);

    @Override // androidx.appcompat.view.menu.j
    public void c(e eVar, boolean z9) {
        j.a aVar = this.f10408v;
        if (aVar != null) {
            aVar.c(eVar, z9);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.j
    public void d(boolean z9) {
        ViewGroup viewGroup = (ViewGroup) this.f10411y;
        if (viewGroup == null) {
            return;
        }
        e eVar = this.f10405s;
        int i10 = 0;
        if (eVar != null) {
            eVar.r();
            ArrayList arrayListE = this.f10405s.E();
            int size = arrayListE.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                g gVar = (g) arrayListE.get(i12);
                if (q(i11, gVar)) {
                    View childAt = viewGroup.getChildAt(i11);
                    g itemData = childAt instanceof k.a ? ((k.a) childAt).getItemData() : null;
                    View viewN = n(gVar, childAt, viewGroup);
                    if (gVar != itemData) {
                        viewN.setPressed(false);
                        viewN.jumpDrawablesToCurrentState();
                    }
                    if (viewN != childAt) {
                        a(viewN, i11);
                    }
                    i11++;
                }
            }
            i10 = i11;
        }
        while (i10 < viewGroup.getChildCount()) {
            if (!l(viewGroup, i10)) {
                i10++;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean f(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean g(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void h(j.a aVar) {
        this.f10408v = aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public void i(Context context, e eVar) {
        this.f10404r = context;
        this.f10407u = LayoutInflater.from(context);
        this.f10405s = eVar;
    }

    public k.a j(ViewGroup viewGroup) {
        return (k.a) this.f10406t.inflate(this.f10410x, viewGroup, false);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.appcompat.view.menu.j
    public boolean k(m mVar) {
        j.a aVar = this.f10408v;
        e eVar = mVar;
        if (aVar == null) {
            return false;
        }
        if (mVar == null) {
            eVar = this.f10405s;
        }
        return aVar.d(eVar);
    }

    protected boolean l(ViewGroup viewGroup, int i10) {
        viewGroup.removeViewAt(i10);
        return true;
    }

    public j.a m() {
        return this.f10408v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View n(g gVar, View view, ViewGroup viewGroup) {
        k.a aVarJ = view instanceof k.a ? (k.a) view : j(viewGroup);
        b(gVar, aVarJ);
        return (View) aVarJ;
    }

    public k o(ViewGroup viewGroup) {
        if (this.f10411y == null) {
            k kVar = (k) this.f10406t.inflate(this.f10409w, viewGroup, false);
            this.f10411y = kVar;
            kVar.b(this.f10405s);
            d(true);
        }
        return this.f10411y;
    }

    public void p(int i10) {
        this.f10412z = i10;
    }

    public abstract boolean q(int i10, g gVar);
}
