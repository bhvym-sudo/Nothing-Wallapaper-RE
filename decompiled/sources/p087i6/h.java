package p087i6;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.nothing.wallpaper.common.log.c;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f22192a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Gson f22193b = new Gson();

    public static final class a extends TypeToken<List<? extends Integer>> {
        a() {
        }
    }

    private h() {
    }

    public static final List a(String input) {
        n.h(input, "input");
        try {
            return (List) new Gson().fromJson(input, new a());
        } catch (Exception e10) {
            c.f("JSONUtil", "parseIntList " + e10.getMessage());
            return null;
        }
    }

    public static final Object b(InputStream inputStream, Class clazz) {
        n.h(inputStream, "inputStream");
        n.h(clazz, "clazz");
        return f22193b.fromJson((Reader) new InputStreamReader(inputStream, StandardCharsets.UTF_8), clazz);
    }

    public static final String c(Object any) {
        n.h(any, "any");
        String json = f22193b.toJson(any);
        n.g(json, "toJson(...)");
        return json;
    }
}
