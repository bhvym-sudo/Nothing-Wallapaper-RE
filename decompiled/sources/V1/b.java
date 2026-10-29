package V1;

import android.util.Log;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.A;
import p129m8.e;

/* JADX INFO: loaded from: classes.dex */
public final class b implements D3.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f8105d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V1.a f8106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private D3.b f8107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private W1.a f8108c;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public b(V1.a interactor) {
        n.h(interactor, "interactor");
        this.f8106a = interactor;
        this.f8107b = D3.b.a.f714a;
    }

    private final E3.a c(W1.a aVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (aVar != null) {
            linkedHashMap.put("color_packages", aVar.a().d());
            linkedHashMap.put("color_style", aVar.a().f().toString());
        }
        return new E3.a(linkedHashMap);
    }

    @Override // D3.a
    public Object a(E3.a aVar, e eVar) {
        String str = (String) aVar.a().get("color_packages");
        W1.a aVar2 = this.f8108c;
        if (aVar2 != null) {
            if (!n.d(aVar2.a().d(), str) || !n.d(aVar2.a().f().toString(), aVar.a().get("color_style"))) {
                Log.wtf("ColorPickerSnapshotRestorer", " Original packages does not match snapshot packages to restore to. The \n current implementation doesn't support undo, only a reset back to the \n original color option.");
            }
            Object objE = this.f8106a.e(aVar2, eVar);
            if (objE == p139n8.b.e()) {
                return objE;
            }
        }
        return A.f21846a;
    }

    @Override // D3.a
    public Object b(D3.b bVar, e eVar) {
        this.f8107b = bVar;
        W1.a aVarC = this.f8106a.c();
        this.f8108c = aVarC;
        return c(aVarC);
    }

    public final void d(W1.a colorOptionModel) {
        n.h(colorOptionModel, "colorOptionModel");
        this.f8107b.a(c(colorOptionModel));
    }
}
