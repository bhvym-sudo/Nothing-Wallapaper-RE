package p175r4;

import U4.d;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: renamed from: r4.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1840l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f26786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f26787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f26788c;

    C1840l0(Map map, Map map2, d dVar) {
        this.f26786a = map;
        this.f26787b = map2;
        this.f26788c = dVar;
    }

    public final byte[] a(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new C1808i0(byteArrayOutputStream, this.f26786a, this.f26787b, this.f26788c).h(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
