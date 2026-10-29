package p088i7;

import D8.k;
import I8.A;
import I8.AbstractC0882h;
import I8.O;
import I8.Q;
import android.content.Context;
import android.content.SharedPreferences;
import com.nothing.wallpaper.NTPickerApplication;
import com.nothing.wallpaper.picker.creative.CreativeWallpaperActivity;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import p064g3.AbstractC1356a;
import p064g3.p;
import p064g3.r;
import p064g3.x;
import p074h3.I;
import p087i6.n;
import p089i8.AbstractC1444s;
import p219v8.l;

/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f22240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final A f22241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final O f22242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f22243d;

    public static final class a implements SharedPreferences.OnSharedPreferenceChangeListener {
        a() {
        }

        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            g.this.f22241b.setValue(Boolean.valueOf(!CreativeWallpaperActivity.f18470T.a(NTPickerApplication.f18424q.a())));
        }
    }

    public static final class b implements p064g3.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f22245a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f22246b;

        b(l lVar, g gVar) {
            this.f22245a = lVar;
            this.f22246b = gVar;
        }

        @Override // p064g3.c
        public void a() {
            ArrayList arrayList = new ArrayList();
            K6.a.C0142a c0142a = K6.a.f4118h;
            List listA = c0142a.a();
            if (listA != null) {
                g gVar = this.f22246b;
                gVar.i(arrayList, listA, gVar.f22240a);
            }
            List listC = c0142a.c();
            if (listC != null) {
                g gVar2 = this.f22246b;
                gVar2.i(arrayList, listC, gVar2.f22240a);
            }
            this.f22245a.f(arrayList);
        }

        @Override // p064g3.c
        public void b(AbstractC1356a abstractC1356a) {
        }
    }

    public static final class c implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return p109k8.a.d(Integer.valueOf(((p) obj2).z()), Integer.valueOf(((p) obj).z()));
        }
    }

    public g(int i10) {
        this.f22240a = i10;
        CreativeWallpaperActivity.a aVar = CreativeWallpaperActivity.f18470T;
        NTPickerApplication.a aVar2 = NTPickerApplication.f18424q;
        A a10 = Q.a(Boolean.valueOf(!aVar.a(aVar2.a())));
        this.f22241b = a10;
        this.f22242c = AbstractC0882h.b(a10);
        a aVar3 = new a();
        this.f22243d = aVar3;
        n.d(aVar2.a()).registerOnSharedPreferenceChangeListener(aVar3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(List list, List list2, int i10) {
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            AbstractC1356a abstractC1356a = (AbstractC1356a) it.next();
            int size = i10 - list.size();
            if (size <= 0) {
                return;
            }
            if (abstractC1356a instanceof r) {
                List listQ = ((r) abstractC1356a).q();
                kotlin.jvm.internal.n.g(listQ, "getUnmodifiableWallpapers(...)");
                list.addAll(k.D(k.A(k.z(k.x(k.o(AbstractC1444s.K(listQ), new l() { // from class: i7.e
                    @Override // p219v8.l
                    public final Object f(Object obj) {
                        return Boolean.valueOf(g.j((x) obj));
                    }
                }), new l() { // from class: i7.f
                    @Override // p219v8.l
                    public final Object f(Object obj) {
                        return g.k((x) obj);
                    }
                }), new c()), size)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j(x xVar) {
        return xVar instanceof p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p k(x xVar) {
        kotlin.jvm.internal.n.f(xVar, "null cannot be cast to non-null type com.android.wallpaper.model.SystemStaticWallpaperInfo");
        return (p) xVar;
    }

    public final O f() {
        return this.f22242c;
    }

    public final void g() {
        n.d(NTPickerApplication.f18424q.a()).unregisterOnSharedPreferenceChangeListener(this.f22243d);
    }

    public final void h(Context context, l onCategoryLoadedCallback) {
        kotlin.jvm.internal.n.h(context, "context");
        kotlin.jvm.internal.n.h(onCategoryLoadedCallback, "onCategoryLoadedCallback");
        I.a().a(context).c(new b(onCategoryLoadedCallback, this), false);
    }
}
