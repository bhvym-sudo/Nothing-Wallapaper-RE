package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f12403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f12404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f12405c;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r0.b f12406a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f12407b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final r0.b f12408c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f12409d;

        public a(r0.b bVar, Object obj, r0.b bVar2, Object obj2) {
            this.f12406a = bVar;
            this.f12407b = obj;
            this.f12408c = bVar2;
            this.f12409d = obj2;
        }
    }

    private I(r0.b bVar, Object obj, r0.b bVar2, Object obj2) {
        this.f12403a = new a(bVar, obj, bVar2, obj2);
        this.f12404b = obj;
        this.f12405c = obj2;
    }

    static int b(a aVar, Object obj, Object obj2) {
        return C1108s.b(aVar.f12406a, 1, obj) + C1108s.b(aVar.f12408c, 2, obj2);
    }

    public static I d(r0.b bVar, Object obj, r0.b bVar2, Object obj2) {
        return new I(bVar, obj, bVar2, obj2);
    }

    static void e(AbstractC1100j abstractC1100j, a aVar, Object obj, Object obj2) {
        C1108s.u(abstractC1100j, aVar.f12406a, 1, obj);
        C1108s.u(abstractC1100j, aVar.f12408c, 2, obj2);
    }

    public int a(int i10, Object obj, Object obj2) {
        return AbstractC1100j.O(i10) + AbstractC1100j.y(b(this.f12403a, obj, obj2));
    }

    a c() {
        return this.f12403a;
    }
}
