package p086i5;

import p036d5.AbstractC1306e;
import p036d5.C1310i;
import p175r4.C1784f9;
import p175r4.C1806h9;
import p175r4.q9;

/* JADX INFO: loaded from: classes.dex */
public final class e extends AbstractC1306e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1310i f22165b;

    public e(C1310i c1310i) {
        this.f22165b = c1310i;
    }

    @Override // p036d5.AbstractC1306e
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        C1310i c1310i = this.f22165b;
        C1784f9 c1784f9B = q9.b("subject-segmentation");
        C1806h9 c1806h9A = C1806h9.a(c1310i.b());
        return new j(this.f22165b, (p076h5.e) obj, c1784f9B, c1806h9A);
    }
}
