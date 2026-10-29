package com.android.wallpaper.picker;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import androidx.fragment.app.AbstractActivityC1136v;
import com.nothing.wallpaper.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p064g3.AbstractC1356a;
import p064g3.InterfaceC1357b;
import p064g3.j;
import p064g3.x;
import p074h3.H;
import p074h3.O;
import p074h3.U;
import p074h3.W;
import p084i3.K0;

/* JADX INFO: loaded from: classes.dex */
public class i implements com.android.wallpaper.picker.f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static boolean f16036o = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractActivityC1136v f16037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final K0 f16038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.android.wallpaper.picker.f.a f16039c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private W f16042f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private O f16043g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private O.a f16045i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private O.a f16046j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private O.a f16047k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f16048l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private InterfaceC1357b f16049m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private U f16050n;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private j f16040d = new PreviewActivity.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private j f16041e = new ViewOnlyPreviewActivity.a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List f16044h = new ArrayList();

    class a implements com.android.wallpaper.picker.f.b {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ com.android.wallpaper.picker.f.b f16051q;

        a(com.android.wallpaper.picker.f.b bVar) {
            this.f16051q = bVar;
        }

        @Override // com.android.wallpaper.picker.f.b
        public void b(boolean z9) {
            this.f16051q.b(z9);
        }

        @Override // com.android.wallpaper.picker.f.b
        public void c() {
            this.f16051q.c();
            i.this.A();
        }
    }

    class b implements p064g3.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f16053a;

        b(String str) {
            this.f16053a = str;
        }

        @Override // p064g3.c
        public void a() {
        }

        @Override // p064g3.c
        public void b(AbstractC1356a abstractC1356a) {
            if (abstractC1356a.m() && abstractC1356a.a(this.f16053a)) {
                i.this.h(abstractC1356a, false);
            }
        }
    }

    class c implements p064g3.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC1356a f16055a;

        c(AbstractC1356a abstractC1356a) {
            this.f16055a = abstractC1356a;
        }

        @Override // p064g3.c
        public void a() {
            i.this.x(this.f16055a);
        }

        @Override // p064g3.c
        public void b(AbstractC1356a abstractC1356a) {
        }
    }

    class d implements p064g3.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f16057a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC1356a f16058b;

        d(String str, AbstractC1356a abstractC1356a) {
            this.f16057a = str;
            this.f16058b = abstractC1356a;
        }

        @Override // p064g3.c
        public void a() {
            AbstractC1356a abstractC1356aF = i.this.f16049m.f(this.f16057a);
            if (abstractC1356aF == null) {
                i.this.x(this.f16058b);
            } else if (this.f16058b != null) {
                i.this.C(abstractC1356aF);
            } else {
                i.this.h(abstractC1356aF, false);
            }
        }

        @Override // p064g3.c
        public void b(AbstractC1356a abstractC1356a) {
        }
    }

    class e implements p064g3.c {
        e(i iVar) {
        }

        @Override // p064g3.c
        public void a() {
        }

        @Override // p064g3.c
        public void b(AbstractC1356a abstractC1356a) {
        }
    }

    class f implements p064g3.c {
        f() {
        }

        @Override // p064g3.c
        public void a() {
            i.this.t();
        }

        @Override // p064g3.c
        public void b(AbstractC1356a abstractC1356a) {
            i.this.h(abstractC1356a, true);
        }
    }

    public i(K0 k9, AbstractActivityC1136v abstractActivityC1136v, H h10) {
        this.f16038b = k9;
        this.f16037a = abstractActivityC1136v;
        this.f16049m = h10.a(abstractActivityC1136v);
        this.f16042f = h10.f(abstractActivityC1136v);
        this.f16043g = h10.s(abstractActivityC1136v);
        this.f16050n = h10.A(abstractActivityC1136v);
        this.f16048l = h10.h();
        this.f16039c = h10.E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A() {
        try {
            this.f16037a.startActivityForResult(this.f16039c.b(this.f16037a), 0);
        } catch (ActivityNotFoundException e10) {
            Intent intentA = this.f16039c.a(this.f16037a);
            if (intentA == null) {
                Log.e("WallpaperPickerDelegate", "Couldn't launch photo picker with main intent and no fallback is available");
                throw e10;
            }
            Log.i("WallpaperPickerDelegate", "Couldn't launch photo picker with main intent, trying with fallback");
            this.f16037a.startActivityForResult(intentA, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D(String str, int i10) {
        String string = this.f16037a.getString(R.string.live_wallpaper_collection_id);
        AbstractC1356a abstractC1356aF = this.f16049m.f(string);
        if (i10 != 3 || (abstractC1356aF != null && abstractC1356aF.a(str))) {
            this.f16049m.c(new d(string, abstractC1356aF), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E(String str, int i10) {
        if (i10 == 1) {
            this.f16049m.c(new b(str), true);
            return;
        }
        if (i10 != 3) {
            v(true);
            return;
        }
        AbstractC1356a abstractC1356aK = k(str);
        if (abstractC1356aK != null) {
            this.f16049m.c(new c(abstractC1356aK), true);
        }
    }

    private AbstractC1356a k(String str) {
        int size = this.f16049m.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC1356a abstractC1356aE = this.f16049m.e(i10);
            if (abstractC1356aE.m() && abstractC1356aE.a(str)) {
                return abstractC1356aE;
            }
        }
        return null;
    }

    private com.android.wallpaper.picker.b m() {
        return this.f16038b.x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s(String str, int i10) {
        if (i10 != 3) {
            v(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        com.android.wallpaper.picker.b bVarM = m();
        if (bVarM != null) {
            bVarM.G0();
        }
    }

    public void B(x xVar, boolean z9) {
        ((ViewOnlyPreviewActivity.a) this.f16041e).c(true, z9);
        xVar.x(this.f16037a, this.f16041e, 2, true);
    }

    public void C(AbstractC1356a abstractC1356a) {
        com.android.wallpaper.picker.b bVarM = m();
        if (bVarM != null) {
            bVarM.N0(abstractC1356a);
        }
    }

    @Override // com.android.wallpaper.picker.f
    public void a(com.android.wallpaper.picker.f.b bVar) {
        if (!f16036o || r()) {
            A();
        } else {
            y(new a(bVar));
        }
    }

    public void h(AbstractC1356a abstractC1356a, boolean z9) {
        com.android.wallpaper.picker.b bVarM = m();
        if (bVarM != null) {
            bVarM.E0(abstractC1356a, z9);
        }
    }

    public void i() {
        O o9 = this.f16043g;
        if (o9 != null) {
            o9.b(this.f16045i);
            this.f16043g.b(this.f16046j);
            this.f16043g.b(this.f16047k);
        }
    }

    public AbstractC1356a j(String str) {
        return this.f16049m.f(str);
    }

    public InterfaceC1357b l() {
        return this.f16049m;
    }

    public List n() {
        return this.f16044h;
    }

    public j o() {
        return this.f16040d;
    }

    public boolean p(int i10, int i11, Intent intent) {
        if (i11 != -1) {
            return false;
        }
        if (i10 == 0) {
            Uri data = intent == null ? null : intent.getData();
            if (data == null) {
                com.nothing.wallpaper.common.log.c.f("WallpaperPickerDelegate", "No data returned from photo picker.");
                return true;
            }
            p064g3.i iVar = new p064g3.i(data, 1);
            this.f16050n.e(iVar);
            iVar.x(this.f16037a, o(), 1, true);
            return false;
        }
        if (i10 == 1) {
            if (intent != null && intent.getBooleanExtra("isLiveWallpaper", false)) {
                v(true);
            }
            return true;
        }
        if (i10 != 2) {
            if (i10 != 4) {
                return false;
            }
            v(true);
        }
        return true;
    }

    public void q(boolean z9) {
        v(z9);
        this.f16045i = new O.a() { // from class: i3.G0
            @Override // h3.O.a
            public final void a(String str, int i10) {
                this.f21961a.D(str, i10);
            }
        };
        this.f16046j = new O.a() { // from class: i3.H0
            @Override // h3.O.a
            public final void a(String str, int i10) {
                this.f21963a.E(str, i10);
            }
        };
        this.f16043g.a(this.f16045i, "android.service.wallpaper.WallpaperService");
        this.f16043g.a(this.f16046j, "android.intent.action.SET_WALLPAPER");
        if (this.f16048l != null) {
            O.a aVar = new O.a() { // from class: i3.I0
                @Override // h3.O.a
                public final void a(String str, int i10) {
                    this.f21965a.s(str, i10);
                }
            };
            this.f16047k = aVar;
            this.f16043g.a(aVar, this.f16048l);
        }
    }

    public boolean r() {
        return this.f16037a.getPackageManager().checkPermission("android.permission.READ_MEDIA_IMAGES", this.f16037a.getPackageName()) == 0;
    }

    public void u(int i10, String[] strArr, int[] iArr) {
        if (i10 == 3 && strArr.length > 0 && strArr[0].equals("android.permission.READ_MEDIA_IMAGES") && iArr.length > 0) {
            if (iArr[0] == 0) {
                Iterator it = n().iterator();
                while (it.hasNext()) {
                    ((com.android.wallpaper.picker.f.b) it.next()).c();
                }
            } else if (this.f16037a.shouldShowRequestPermissionRationale("android.permission.READ_MEDIA_IMAGES")) {
                Iterator it2 = n().iterator();
                while (it2.hasNext()) {
                    ((com.android.wallpaper.picker.f.b) it2.next()).b(false);
                }
            } else {
                Iterator it3 = n().iterator();
                while (it3.hasNext()) {
                    ((com.android.wallpaper.picker.f.b) it3.next()).b(true);
                }
            }
        }
        n().clear();
    }

    public void v(boolean z9) {
        com.android.wallpaper.picker.b bVarM = m();
        if (z9 && bVarM != null) {
            bVarM.F0();
        }
        this.f16049m.c(new f(), z9);
    }

    public void w() {
        this.f16049m.c(new e(this), this.f16049m.b());
    }

    public void x(AbstractC1356a abstractC1356a) {
        com.android.wallpaper.picker.b bVarM;
        if (abstractC1356a == null || (bVarM = m()) == null) {
            return;
        }
        bVarM.K0(abstractC1356a);
    }

    public void y(com.android.wallpaper.picker.f.b bVar) {
        this.f16044h.add(bVar);
        this.f16037a.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES"}, 3);
    }

    public void z(String str) {
        AbstractC1356a abstractC1356aJ = j(str);
        if (abstractC1356aJ == null) {
            return;
        }
        abstractC1356aJ.k(this.f16037a, 0);
    }
}
