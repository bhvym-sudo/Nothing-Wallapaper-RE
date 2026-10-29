package X8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f9217a = a.f9219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f9218b = new a.C0326a();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f9219a = new a();

        /* JADX INFO: renamed from: X8.l$a$a, reason: collision with other inner class name */
        private static final class C0326a implements l {
            @Override // X8.l
            public boolean a(int i10, e9.g source, int i11, boolean z9) {
                kotlin.jvm.internal.n.h(source, "source");
                source.skip(i11);
                return true;
            }

            @Override // X8.l
            public void b(int i10, b errorCode) {
                kotlin.jvm.internal.n.h(errorCode, "errorCode");
            }

            @Override // X8.l
            public boolean c(int i10, List requestHeaders) {
                kotlin.jvm.internal.n.h(requestHeaders, "requestHeaders");
                return true;
            }

            @Override // X8.l
            public boolean d(int i10, List responseHeaders, boolean z9) {
                kotlin.jvm.internal.n.h(responseHeaders, "responseHeaders");
                return true;
            }
        }

        private a() {
        }
    }

    boolean a(int i10, e9.g gVar, int i11, boolean z9);

    void b(int i10, b bVar);

    boolean c(int i10, List list);

    boolean d(int i10, List list, boolean z9);
}
