package p144o3;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p164q3.a f23428a;

    /* JADX INFO: renamed from: o3.a$a, reason: collision with other inner class name */
    public static final class C0618a extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Drawable f23429b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final p164q3.a f23430c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0618a(Drawable drawable, p164q3.a aVar) {
            super(aVar, null);
            n.h(drawable, "drawable");
            this.f23429b = drawable;
            this.f23430c = aVar;
        }

        @Override // p144o3.a
        public p164q3.a a() {
            return this.f23430c;
        }

        public final Drawable b() {
            return this.f23429b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0618a)) {
                return false;
            }
            C0618a c0618a = (C0618a) obj;
            return n.d(this.f23429b, c0618a.f23429b) && n.d(this.f23430c, c0618a.f23430c);
        }

        public int hashCode() {
            int iHashCode = this.f23429b.hashCode() * 31;
            p164q3.a aVar = this.f23430c;
            return iHashCode + (aVar == null ? 0 : aVar.hashCode());
        }

        public String toString() {
            return "Loaded(drawable=" + this.f23429b + ", contentDescription=" + this.f23430c + ")";
        }
    }

    public static final class b extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f23431b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final p164q3.a f23432c;

        public b(int i10, p164q3.a aVar) {
            super(aVar, null);
            this.f23431b = i10;
            this.f23432c = aVar;
        }

        @Override // p144o3.a
        public p164q3.a a() {
            return this.f23432c;
        }

        public final int b() {
            return this.f23431b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f23431b == bVar.f23431b && n.d(this.f23432c, bVar.f23432c);
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.f23431b) * 31;
            p164q3.a aVar = this.f23432c;
            return iHashCode + (aVar == null ? 0 : aVar.hashCode());
        }

        public String toString() {
            return "Resource(res=" + this.f23431b + ", contentDescription=" + this.f23432c + ")";
        }
    }

    public /* synthetic */ a(p164q3.a aVar, AbstractC1457h abstractC1457h) {
        this(aVar);
    }

    public abstract p164q3.a a();

    private a(p164q3.a aVar) {
        this.f23428a = aVar;
    }
}
