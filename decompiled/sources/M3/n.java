package M3;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class n implements K3.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f4972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f4973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q f4974c;

    n(Set set, m mVar, q qVar) {
        this.f4972a = set;
        this.f4973b = mVar;
        this.f4974c = qVar;
    }

    @Override // K3.g
    public K3.f a(String str, Class cls, K3.b bVar, K3.e eVar) {
        if (this.f4972a.contains(bVar)) {
            return new p(this.f4973b, str, bVar, eVar, this.f4974c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", bVar, this.f4972a));
    }
}
