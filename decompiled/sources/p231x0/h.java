package p231x0;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final h f29681b = a(new Locale[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f29682a;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Locale[] f29683a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    static class b {
        static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }
    }

    private h(i iVar) {
        this.f29682a = iVar;
    }

    public static h a(Locale... localeArr) {
        return h(b.a(localeArr));
    }

    public static h b(String str) {
        if (str == null || str.isEmpty()) {
            return d();
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i10 = 0; i10 < length; i10++) {
            localeArr[i10] = a.a(strArrSplit[i10]);
        }
        return a(localeArr);
    }

    public static h d() {
        return f29681b;
    }

    public static h h(LocaleList localeList) {
        return new h(new j(localeList));
    }

    public Locale c(int i10) {
        return this.f29682a.get(i10);
    }

    public boolean e() {
        return this.f29682a.isEmpty();
    }

    public boolean equals(Object obj) {
        return (obj instanceof h) && this.f29682a.equals(((h) obj).f29682a);
    }

    public int f() {
        return this.f29682a.size();
    }

    public String g() {
        return this.f29682a.a();
    }

    public int hashCode() {
        return this.f29682a.hashCode();
    }

    public String toString() {
        return this.f29682a.toString();
    }
}
