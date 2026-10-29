package K;

import I.H;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    public static final class a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f3978a;

        a(d dVar) {
            this.f3978a = dVar;
        }

        @Override // K.h
        public void a(H h10, int i10) {
            this.f3978a.i().a(h10, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h b(d dVar) {
        return new a(dVar);
    }
}
