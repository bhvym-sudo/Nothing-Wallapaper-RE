package P8;

import java.util.List;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes2.dex */
public interface n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f6346a = a.f6348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f6347b = new a.C0211a();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f6348a = new a();

        /* JADX INFO: renamed from: P8.n$a$a, reason: collision with other inner class name */
        private static final class C0211a implements n {
            @Override // P8.n
            public void a(v url, List cookies) {
                kotlin.jvm.internal.n.h(url, "url");
                kotlin.jvm.internal.n.h(cookies, "cookies");
            }

            @Override // P8.n
            public List b(v url) {
                kotlin.jvm.internal.n.h(url, "url");
                return AbstractC1444s.l();
            }
        }

        private a() {
        }
    }

    void a(v vVar, List list);

    List b(v vVar);
}
