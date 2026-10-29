package p031d0;

import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    public static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f19320a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final m f19321b;

        public a(String str, m mVar, e eVar) {
            super(null);
            this.f19320a = str;
            this.f19321b = mVar;
        }

        @Override // p031d0.d
        public e a() {
            return null;
        }

        public m b() {
            return this.f19321b;
        }

        public final String c() {
            return this.f19320a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!n.d(this.f19320a, aVar.f19320a) || !n.d(b(), aVar.b())) {
                return false;
            }
            a();
            aVar.a();
            return n.d(null, null);
        }

        public int hashCode() {
            int iHashCode = this.f19320a.hashCode() * 31;
            m mVarB = b();
            int iHashCode2 = (iHashCode + (mVarB != null ? mVarB.hashCode() : 0)) * 31;
            a();
            return iHashCode2;
        }

        public String toString() {
            return "LinkAnnotation.Clickable(tag=" + this.f19320a + ')';
        }
    }

    public static final class b extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f19322a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final m f19323b;

        public /* synthetic */ b(String str, m mVar, e eVar, int i10, AbstractC1457h abstractC1457h) {
            this(str, (i10 & 2) != 0 ? null : mVar, (i10 & 4) != 0 ? null : eVar);
        }

        @Override // p031d0.d
        public e a() {
            return null;
        }

        public m b() {
            return this.f19323b;
        }

        public final String c() {
            return this.f19322a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (!n.d(this.f19322a, bVar.f19322a) || !n.d(b(), bVar.b())) {
                return false;
            }
            a();
            bVar.a();
            return n.d(null, null);
        }

        public int hashCode() {
            int iHashCode = this.f19322a.hashCode() * 31;
            m mVarB = b();
            int iHashCode2 = (iHashCode + (mVarB != null ? mVarB.hashCode() : 0)) * 31;
            a();
            return iHashCode2;
        }

        public String toString() {
            return "LinkAnnotation.Url(url=" + this.f19322a + ')';
        }

        public b(String str, m mVar, e eVar) {
            super(null);
            this.f19322a = str;
            this.f19323b = mVar;
        }
    }

    public /* synthetic */ d(AbstractC1457h abstractC1457h) {
        this();
    }

    public abstract e a();

    private d() {
    }
}
