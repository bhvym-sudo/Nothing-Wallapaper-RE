package h9;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import g9.h;
import g9.y;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Gson f21879a;

    private a(Gson gson) {
        this.f21879a = gson;
    }

    public static a f() {
        return g(new Gson());
    }

    public static a g(Gson gson) {
        if (gson != null) {
            return new a(gson);
        }
        throw new NullPointerException("gson == null");
    }

    @Override // g9.h.a
    public h c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, y yVar) {
        return new b(this.f21879a, this.f21879a.getAdapter(TypeToken.get(type)));
    }

    @Override // g9.h.a
    public h d(Type type, Annotation[] annotationArr, y yVar) {
        return new c(this.f21879a, this.f21879a.getAdapter(TypeToken.get(type)));
    }
}
