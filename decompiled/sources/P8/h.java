package P8;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f6191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f6192b;

    public h(String scheme, Map authParams) {
        String lowerCase;
        kotlin.jvm.internal.n.h(scheme, "scheme");
        kotlin.jvm.internal.n.h(authParams, "authParams");
        this.f6191a = scheme;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : authParams.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (str != null) {
                Locale US = Locale.US;
                kotlin.jvm.internal.n.g(US, "US");
                lowerCase = str.toLowerCase(US);
                kotlin.jvm.internal.n.g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            } else {
                lowerCase = null;
            }
            linkedHashMap.put(lowerCase, str2);
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        kotlin.jvm.internal.n.g(mapUnmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.f6192b = mapUnmodifiableMap;
    }

    public final Charset a() {
        String str = (String) this.f6192b.get("charset");
        if (str != null) {
            try {
                Charset charsetForName = Charset.forName(str);
                kotlin.jvm.internal.n.g(charsetForName, "forName(charset)");
                return charsetForName;
            } catch (Exception unused) {
            }
        }
        Charset ISO_8859_1 = StandardCharsets.ISO_8859_1;
        kotlin.jvm.internal.n.g(ISO_8859_1, "ISO_8859_1");
        return ISO_8859_1;
    }

    public final String b() {
        return (String) this.f6192b.get("realm");
    }

    public final String c() {
        return this.f6191a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return kotlin.jvm.internal.n.d(hVar.f6191a, this.f6191a) && kotlin.jvm.internal.n.d(hVar.f6192b, this.f6192b);
    }

    public int hashCode() {
        return ((899 + this.f6191a.hashCode()) * 31) + this.f6192b.hashCode();
    }

    public String toString() {
        return this.f6191a + " authParams=" + this.f6192b;
    }
}
