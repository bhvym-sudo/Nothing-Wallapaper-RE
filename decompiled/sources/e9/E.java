package e9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class E {
    public static final byte[] a(String str) {
        kotlin.jvm.internal.n.h(str, "<this>");
        byte[] bytes = str.getBytes(E8.d.f1445b);
        kotlin.jvm.internal.n.g(bytes, "getBytes(...)");
        return bytes;
    }

    public static final String b(byte[] bArr) {
        kotlin.jvm.internal.n.h(bArr, "<this>");
        return new String(bArr, E8.d.f1445b);
    }
}
