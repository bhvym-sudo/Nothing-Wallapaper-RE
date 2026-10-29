package p064g3;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import com.android.wallpaper.asset.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class r extends AbstractC1356a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final Object f21212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f21213e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.android.wallpaper.asset.a f21214f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f21215g;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f21216a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Resources f21217b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f21218c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f21219d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f21220e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f21221f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f21222g;

        public a(Resources resources, AttributeSet attributeSet) {
            this.f21217b = resources;
            this.f21218c = attributeSet.getAttributeValue(null, "id");
            int attributeResourceValue = attributeSet.getAttributeResourceValue(null, "title", 0);
            this.f21219d = attributeResourceValue != 0 ? resources.getString(attributeResourceValue) : "";
            this.f21221f = attributeSet.getAttributeValue(null, "featured");
            this.f21220e = attributeSet.getAttributeIntValue(null, "priority", -1);
            this.f21222g = attributeSet.getAttributeResourceValue(null, "thumbnail", 0);
        }

        public a a(x xVar) {
            this.f21216a.add(xVar);
            return this;
        }

        public r b() {
            int i10;
            if (this.f21222g != 0) {
                return new r(this.f21219d, this.f21218c, new m(this.f21217b, this.f21222g), this.f21216a, this.f21220e);
            }
            for (int i11 = 0; i11 < this.f21216a.size(); i11++) {
                if (((x) this.f21216a.get(i11)).r().equals(this.f21221f)) {
                    i10 = i11;
                    return new r(this.f21219d, this.f21218c, i10, this.f21216a, this.f21220e);
                }
            }
            i10 = 0;
            return new r(this.f21219d, this.f21218c, i10, this.f21216a, this.f21220e);
        }

        public String c() {
            return this.f21218c;
        }

        public a d(int i10) {
            if (this.f21220e < 0) {
                this.f21220e = i10;
            }
            return this;
        }
    }

    public r(String str, String str2, List list, int i10) {
        this(str, str2, 0, list, i10);
    }

    @Override // p064g3.AbstractC1356a
    public boolean a(String str) {
        return false;
    }

    @Override // p064g3.AbstractC1356a
    public x f() {
        if (j()) {
            return (x) this.f21213e.get(0);
        }
        return null;
    }

    @Override // p064g3.AbstractC1356a
    public com.android.wallpaper.asset.a g(Context context) {
        synchronized (this.f21212d) {
            try {
                if (this.f21214f == null && this.f21213e.size() > 0) {
                    this.f21214f = ((x) this.f21213e.get(this.f21215g)).o(context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f21214f;
    }

    @Override // p064g3.AbstractC1356a
    public boolean j() {
        List list = this.f21213e;
        return list != null && list.size() == 1;
    }

    @Override // p064g3.AbstractC1356a
    public void k(Activity activity, int i10) {
    }

    @Override // p064g3.AbstractC1356a
    public boolean m() {
        return false;
    }

    public void o(Context context, A a10, boolean z9) {
        a10.a(new ArrayList(this.f21213e));
    }

    protected List p() {
        return this.f21213e;
    }

    public List q() {
        return Collections.unmodifiableList(this.f21213e);
    }

    public r(String str, String str2, int i10, List list, int i11) {
        super(str, str2, i11);
        this.f21213e = list;
        this.f21212d = new Object();
        this.f21215g = i10;
    }

    public r(String str, String str2, com.android.wallpaper.asset.a aVar, List list, int i10) {
        super(str, str2, i10);
        this.f21213e = list;
        this.f21212d = new Object();
        this.f21214f = aVar;
    }
}
