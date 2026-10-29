package L1;

import F8.I;
import F8.L;
import Q2.k;
import V2.l;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import java.util.List;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.n;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f4593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final L f4594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final I f4595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final I f4596d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p079h8.h f4597e;

    public static final class a implements V2.i {
        a() {
        }

        @Override // V2.i
        public boolean a(ComponentName component) {
            n.h(component, "component");
            return true;
        }

        @Override // V2.i
        public void b(ComponentName component) {
            n.h(component, "component");
        }

        @Override // V2.i
        public int c(ComponentName componentName) {
            n.h(componentName, "componentName");
            return 0;
        }

        @Override // V2.i
        public void d(ComponentName component, int i10) {
            n.h(component, "component");
        }
    }

    public i(Context context, L coroutineScope, I mainDispatcher, I backgroundDispatcher) {
        n.h(context, "context");
        n.h(coroutineScope, "coroutineScope");
        n.h(mainDispatcher, "mainDispatcher");
        n.h(backgroundDispatcher, "backgroundDispatcher");
        this.f4593a = context;
        this.f4594b = coroutineScope;
        this.f4595c = mainDispatcher;
        this.f4596d = backgroundDispatcher;
        this.f4597e = p079h8.i.b(new p219v8.a() { // from class: L1.h
            @Override // p219v8.a
            public final Object invoke() {
                return i.b(this.f4592q);
            }
        });
        e().Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k b(i iVar) {
        p034d3.a aVarA = p034d3.a.f19546c.a();
        Context context = iVar.f4593a;
        M2.d dVarC = iVar.c(context);
        L l9 = iVar.f4594b;
        I i10 = iVar.f4595c;
        I i11 = iVar.f4596d;
        Context context2 = iVar.f4593a;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context2);
        n.g(layoutInflaterFrom, "from(...)");
        Resources resources = iVar.f4593a.getResources();
        n.g(resources, "getResources(...)");
        return new k(context, dVarC, l9, i10, i11, true, false, new p037d6.e(context2, layoutInflaterFrom, resources, aVarA.f(), null), null, null, true, "Picker", null, 4864, null);
    }

    private final M2.d c(Context context) {
        List listL = AbstractC1444s.l();
        V2.k.a aVar = new V2.k.a(i.class.getClassLoader(), new V2.k.b(), new V2.k.e(), listL, true);
        a aVar2 = new a();
        return new l(context, new V2.g.a(context, context.getPackageManager(), context.getMainExecutor(), Executors.newSingleThreadExecutor(), (NotificationManager) context.getSystemService(NotificationManager.class), aVar2, listL, aVar), true, Y2.c.a().get(), aVar2, new V2.n(context), AbstractC1444s.l());
    }

    private final k e() {
        return (k) this.f4597e.getValue();
    }

    public final k d() {
        return e();
    }
}
