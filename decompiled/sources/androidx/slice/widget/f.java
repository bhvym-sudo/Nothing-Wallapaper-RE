package androidx.slice.widget;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.slice.Slice;
import androidx.slice.SliceItem;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SliceItem f13974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SliceItem f13975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SliceItem f13976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private SliceItem f13977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f13978e;

    public f(d dVar) {
        Slice sliceN = dVar.n();
        SliceItem sliceItemB = dVar.b();
        this.f13976c = sliceItemB;
        boolean z9 = sliceItemB != null;
        this.f13978e = z9;
        if (!z9) {
            this.f13976c = p112l1.f.o(sliceN, "int", TypedValues.Custom.S_COLOR);
        }
        SliceItem sliceItemJ = dVar.j();
        if (sliceItemJ != null) {
            p112l1.e eVar = new p112l1.e(sliceItemJ);
            this.f13977d = eVar.d();
            this.f13974a = p112l1.f.i(eVar.f(), "image", "title", null);
            this.f13975b = p112l1.f.i(eVar.f(), "text", null, null);
        }
        if (this.f13977d == null) {
            this.f13977d = p112l1.f.f(sliceN, "action", null, null);
        }
        SliceItem sliceItem = this.f13974a;
        if (sliceItem == null || sliceItem.f() == null) {
            this.f13974a = p112l1.f.f(sliceN, "image", "title", null);
        }
        if (this.f13975b == null) {
            this.f13975b = p112l1.f.f(sliceN, "text", "title", null);
        }
        SliceItem sliceItem2 = this.f13974a;
        if (sliceItem2 == null || sliceItem2.f() == null) {
            this.f13974a = p112l1.f.f(sliceN, "image", null, null);
        }
        if (this.f13975b == null) {
            this.f13975b = p112l1.f.f(sliceN, "text", null, null);
        }
    }

    public SliceItem a() {
        return this.f13977d;
    }

    public SliceItem b() {
        return this.f13976c;
    }

    public SliceItem c() {
        return this.f13974a;
    }

    public SliceItem d() {
        return this.f13975b;
    }
}
