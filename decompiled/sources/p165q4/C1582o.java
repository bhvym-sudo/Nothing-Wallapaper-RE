package p165q4;

import U4.d;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: renamed from: q4.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1582o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f24690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f24691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f24692c;

    C1582o(Map map, Map map2, d dVar) {
        this.f24690a = map;
        this.f24691b = map2;
        this.f24692c = dVar;
    }

    public final byte[] a(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new C1561l(byteArrayOutputStream, this.f24690a, this.f24691b, this.f24692c).h(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
