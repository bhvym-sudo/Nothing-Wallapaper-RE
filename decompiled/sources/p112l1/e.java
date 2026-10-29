package p112l1;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.slice.SliceItem;

/* JADX INFO: loaded from: classes.dex */
public class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private PendingIntent f22862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IconCompat f22863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f22864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private CharSequence f22865d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CharSequence f22866e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f22867f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f22868g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f22869h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private SliceItem f22870i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private SliceItem f22871j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f22872k;

    public e(SliceItem sliceItem) {
        int i10;
        this.f22864c = 3;
        this.f22869h = -1;
        this.f22870i = sliceItem;
        SliceItem sliceItemH = f.h(sliceItem, "action");
        if (sliceItemH == null) {
            return;
        }
        this.f22871j = sliceItemH;
        this.f22862a = sliceItemH.c();
        SliceItem sliceItemE = f.e(sliceItemH.j(), "image");
        if (sliceItemE != null) {
            this.f22863b = sliceItemE.f();
            if (sliceItemE.n("no_tint")) {
                i10 = sliceItemE.n("large") ? 2 : 1;
            } else {
                i10 = 0;
            }
            this.f22864c = i10;
        }
        SliceItem sliceItemF = f.f(sliceItemH.j(), "text", "title", null);
        if (sliceItemF != null) {
            this.f22865d = sliceItemF.l();
        }
        SliceItem sliceItemO = f.o(sliceItemH.j(), "text", "content_description");
        if (sliceItemO != null) {
            this.f22866e = sliceItemO.l();
        }
        boolean zEquals = "toggle".equals(sliceItemH.k());
        this.f22867f = zEquals;
        if (zEquals) {
            this.f22868g = sliceItemH.n("selected");
        }
        this.f22872k = this.f22870i.n("activity");
        SliceItem sliceItemO2 = f.o(sliceItemH.j(), "int", "priority");
        this.f22869h = sliceItemO2 != null ? sliceItemO2.g() : -1;
    }

    @Override // p112l1.d
    public int a() {
        return this.f22869h;
    }

    @Override // p112l1.d
    public boolean b() {
        return this.f22867f;
    }

    @Override // p112l1.d
    public int c() {
        return this.f22864c;
    }

    public SliceItem d() {
        return this.f22871j;
    }

    public CharSequence e() {
        return this.f22866e;
    }

    public SliceItem f() {
        return this.f22870i;
    }

    public CharSequence g() {
        return this.f22865d;
    }

    @Override // p112l1.d
    public IconCompat getIcon() {
        return this.f22863b;
    }

    public boolean h() {
        return this.f22868g;
    }

    public boolean i() {
        return this.f22867f && this.f22863b == null;
    }
}
