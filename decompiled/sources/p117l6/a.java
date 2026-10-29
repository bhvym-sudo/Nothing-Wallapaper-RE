package p117l6;

import E8.i;
import android.text.TextUtils;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0583a f22963e = new C0583a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f22964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f22965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f22966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f22967d;

    /* JADX INFO: renamed from: l6.a$a, reason: collision with other inner class name */
    public static final class C0583a {
        public /* synthetic */ C0583a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final a a(String key) {
            n.h(key, "key");
            List listD0 = i.D0(key, new String[]{"_"}, false, 0, 6, null);
            return new a((String) listD0.get(0), (String) listD0.get(1), (String) listD0.get(2));
        }

        public final a b(String path) {
            n.h(path, "path");
            String name = new File(path).getName();
            n.g(name, "getName(...)");
            return a(name);
        }

        public final String c(String path) {
            n.h(path, "path");
            return b(path).c();
        }

        private C0583a() {
        }
    }

    public a(String effect, String image, String group) {
        n.h(effect, "effect");
        n.h(image, "image");
        n.h(group, "group");
        this.f22964a = effect;
        this.f22965b = image;
        this.f22966c = group;
        this.f22967d = toString();
    }

    public final String a() {
        return this.f22964a;
    }

    public final String b() {
        return this.f22967d;
    }

    public final String c() {
        return this.f22966c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return n.d(this.f22964a, aVar.f22964a) && n.d(this.f22965b, aVar.f22965b) && n.d(this.f22966c, aVar.f22966c);
    }

    public int hashCode() {
        return (((this.f22964a.hashCode() * 31) + this.f22965b.hashCode()) * 31) + this.f22966c.hashCode();
    }

    public String toString() {
        String strJoin = TextUtils.join("_", AbstractC1444s.h(this.f22964a, this.f22965b, this.f22966c));
        n.g(strJoin, "join(...)");
        return strJoin;
    }
}
