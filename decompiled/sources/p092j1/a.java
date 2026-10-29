package p092j1;

import android.content.Context;
import androidx.slice.Slice;
import androidx.slice.SliceItem;
import androidx.slice.widget.d;
import java.util.ArrayList;
import java.util.List;
import p112l1.e;
import p112l1.f;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Slice f22279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f22280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f22281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f22282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private d f22283e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private SliceItem f22284f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private e f22285g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List f22286h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f22287i;

    private a(Context context, Slice slice) {
        SliceItem sliceItem;
        this.f22279a = slice;
        this.f22280b = context;
        SliceItem sliceItemF = f.f(slice, "long", "ttl", null);
        if (sliceItemF != null) {
            this.f22281c = sliceItemF.h();
        }
        SliceItem sliceItemF2 = f.f(slice, "long", "last_updated", null);
        if (sliceItemF2 != null) {
            this.f22282d = sliceItemF2.h();
        }
        d dVar = new d(context, slice, null, 0, 0);
        this.f22283e = dVar;
        this.f22284f = dVar.c();
        this.f22287i = this.f22283e.d();
        SliceItem sliceItemJ = this.f22283e.j();
        if (sliceItemJ != null) {
            this.f22285g = new e(sliceItemJ);
        }
        List listO = this.f22283e.o();
        this.f22286h = listO;
        if (listO != null || (sliceItem = this.f22284f) == null || !f.t(sliceItem, "list_item") || f.t(this.f22284f, "horizontal")) {
            return;
        }
        ArrayList arrayListE = new androidx.slice.widget.e(this.f22280b, this.f22284f, false).e();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < arrayListE.size(); i10++) {
            if (f.h((SliceItem) arrayListE.get(i10), "action") != null) {
                arrayList.add(new e((SliceItem) arrayListE.get(i10)));
            }
        }
        if (arrayList.size() > 0) {
            this.f22286h = arrayList;
        }
    }

    public static a a(Context context, Slice slice) {
        return new a(context, slice);
    }

    public static List f(Slice slice) {
        SliceItem sliceItemF = f.f(slice, "slice", "actions", null);
        List listM = sliceItemF != null ? f.m(sliceItemF, "slice", new String[]{"actions", "shortcut"}, null) : null;
        if (listM == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(listM.size());
        for (int i10 = 0; i10 < listM.size(); i10++) {
            arrayList.add(new e((SliceItem) listM.get(i10)));
        }
        return arrayList;
    }

    public long b() {
        return this.f22281c;
    }

    public long c() {
        return this.f22282d;
    }

    public int d() {
        boolean z9 = f.f(this.f22279a, null, "partial", null) != null;
        if (this.f22283e.s()) {
            return z9 ? 1 : 2;
        }
        return 0;
    }

    public List e() {
        return this.f22286h;
    }

    public boolean g() {
        return this.f22279a.g("permission_request");
    }
}
