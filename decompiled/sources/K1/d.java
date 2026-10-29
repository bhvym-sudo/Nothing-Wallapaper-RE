package K1;

import android.app.WallpaperManager;
import android.os.Bundle;
import androidx.fragment.app.AbstractActivityC1136v;
import androidx.lifecycle.InterfaceC1163x;
import androidx.lifecycle.d0;
import java.util.ArrayList;
import java.util.List;
import p064g3.v;
import p064g3.z;
import p074h3.InterfaceC1363c;
import p074h3.InterfaceC1364d;

/* JADX INFO: loaded from: classes.dex */
public final class d implements InterfaceC1364d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b2.c.d f3985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r2.c.a f3986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p073h2.a.C0546a f3987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p034d3.a f3988d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final T1.b.C0264b f3989e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final S1.a f3990f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final J1.b f3991g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final J1.a f3992h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final p228w7.b f3993i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final p228w7.a f3994j;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3995a;

        static {
            int[] iArr = new int[InterfaceC1364d.a.values().length];
            f3995a = iArr;
            try {
                iArr[InterfaceC1364d.a.LOCK_SCREEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3995a[InterfaceC1364d.a.HOME_SCREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public d(b2.c.d dVar, r2.c.a aVar, p073h2.a.C0546a c0546a, p034d3.a aVar2, T1.b.C0264b c0264b, S1.a aVar3, J1.b bVar, J1.a aVar4, p228w7.b bVar2, p228w7.a aVar5) {
        this.f3985a = dVar;
        this.f3986b = aVar;
        this.f3987c = c0546a;
        this.f3988d = aVar2;
        this.f3989e = c0264b;
        this.f3990f = aVar3;
        this.f3991g = bVar;
        this.f3992h = aVar4;
        this.f3993i = bVar2;
        this.f3994j = aVar5;
    }

    @Override // p074h3.InterfaceC1364d
    public List a(InterfaceC1364d.a aVar, AbstractActivityC1136v abstractActivityC1136v, InterfaceC1163x interfaceC1163x, v vVar, p064g3.m mVar, z zVar, g3.f.a aVar2, Bundle bundle, InterfaceC1363c interfaceC1363c, H3.k kVar, p234x3.b bVar, p194t3.a aVar3, WallpaperManager wallpaperManager, boolean z9) {
        ArrayList arrayList;
        p083i2.f cVar;
        AbstractActivityC1136v abstractActivityC1136v2;
        InterfaceC1163x interfaceC1163x2;
        g3.f.a aVar4;
        Bundle bundle2;
        InterfaceC1364d.a aVar5;
        ArrayList arrayList2 = new ArrayList();
        if (this.f3988d.g(abstractActivityC1136v)) {
            arrayList = arrayList2;
            cVar = new p083i2.c(abstractActivityC1136v, interfaceC1163x, aVar, interfaceC1363c, vVar, kVar, this.f3989e, this.f3990f, zVar, aVar2, aVar3, this.f3992h, wallpaperManager, z9);
        } else {
            arrayList = arrayList2;
            cVar = new p178r7.c(abstractActivityC1136v, interfaceC1163x, aVar, interfaceC1363c, vVar, kVar, zVar, aVar3, this.f3992h, this.f3993i, wallpaperManager, z9);
        }
        ArrayList arrayList3 = arrayList;
        arrayList3.add(cVar);
        if (this.f3988d.l()) {
            bundle2 = bundle;
            abstractActivityC1136v2 = abstractActivityC1136v;
            interfaceC1163x2 = interfaceC1163x;
            aVar4 = aVar2;
            arrayList3.add(new p078h7.o(abstractActivityC1136v, ((p088i7.a) bVar).n(), interfaceC1163x, aVar2, bundle2 == null));
            aVar5 = aVar;
        } else {
            abstractActivityC1136v2 = abstractActivityC1136v;
            interfaceC1163x2 = interfaceC1163x;
            aVar4 = aVar2;
            bundle2 = bundle;
            aVar5 = aVar;
            arrayList3.add(new p224w3.a(new p003a2.b(aVar4, (p013b2.c) new d0(abstractActivityC1136v2, this.f3985a).b(p013b2.c.class), interfaceC1163x2), new p224w3.f(bVar.i(aVar5), interfaceC1163x2, aVar4, bundle2 == null), true));
        }
        int i10 = a.f3995a[aVar5.ordinal()];
        if (i10 == 1) {
            if (this.f3988d.l()) {
                arrayList3.add(new p078h7.k(new p078h7.q(aVar4), new p078h7.j(aVar4, (p173r2.c) new d0(abstractActivityC1136v2, this.f3986b).b(p173r2.c.class), interfaceC1163x2), new p078h7.m()));
                return arrayList3;
            }
            arrayList3.add(new p163q2.b(aVar4, (p173r2.c) new d0(abstractActivityC1136v2, this.f3986b).b(p173r2.c.class), interfaceC1163x2));
            arrayList3.add(new p063g2.a((p073h2.a) new d0(abstractActivityC1136v2, this.f3987c).b(p073h2.a.class), interfaceC1163x2));
            arrayList3.add(new p183s2.b());
            return arrayList3;
        }
        if (i10 != 2) {
            return arrayList3;
        }
        if (this.f3988d.l()) {
            arrayList3.add(new p078h7.g(new p078h7.b(aVar4, (p013b2.c) new d0(abstractActivityC1136v2, this.f3985a).b(p013b2.c.class), interfaceC1163x2), new p078h7.h(interfaceC1163x2, this.f3994j), new p078h7.f(this.f3993i, p242y1.e.f(abstractActivityC1136v2))));
            return arrayList3;
        }
        arrayList3.add(new H1.d(H1.i.f(abstractActivityC1136v2), this.f3992h, bundle2, this.f3991g));
        arrayList3.add(new p242y1.i(p242y1.e.f(abstractActivityC1136v2), aVar4, interfaceC1163x2));
        return arrayList3;
    }
}
