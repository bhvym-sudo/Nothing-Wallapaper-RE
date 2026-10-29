package E8;

import com.bumptech.glide.load.Key;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f1444a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f1445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f1446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Charset f1447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Charset f1448e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Charset f1449f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Charset f1450g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile Charset f1451h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static volatile Charset f1452i;

    static {
        Charset charsetForName = Charset.forName(Key.STRING_CHARSET_NAME);
        kotlin.jvm.internal.n.g(charsetForName, "forName(...)");
        f1445b = charsetForName;
        Charset charsetForName2 = Charset.forName("UTF-16");
        kotlin.jvm.internal.n.g(charsetForName2, "forName(...)");
        f1446c = charsetForName2;
        Charset charsetForName3 = Charset.forName("UTF-16BE");
        kotlin.jvm.internal.n.g(charsetForName3, "forName(...)");
        f1447d = charsetForName3;
        Charset charsetForName4 = Charset.forName("UTF-16LE");
        kotlin.jvm.internal.n.g(charsetForName4, "forName(...)");
        f1448e = charsetForName4;
        Charset charsetForName5 = Charset.forName("US-ASCII");
        kotlin.jvm.internal.n.g(charsetForName5, "forName(...)");
        f1449f = charsetForName5;
        Charset charsetForName6 = Charset.forName("ISO-8859-1");
        kotlin.jvm.internal.n.g(charsetForName6, "forName(...)");
        f1450g = charsetForName6;
    }

    private d() {
    }

    public final Charset a() {
        Charset charset = f1452i;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32BE");
        kotlin.jvm.internal.n.g(charsetForName, "forName(...)");
        f1452i = charsetForName;
        return charsetForName;
    }

    public final Charset b() {
        Charset charset = f1451h;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32LE");
        kotlin.jvm.internal.n.g(charsetForName, "forName(...)");
        f1451h = charsetForName;
        return charsetForName;
    }
}
