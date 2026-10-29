package p233x2;

import C2.b;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f29769a = new c();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f29770a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f29771b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f29772c;

        public a(int i10, int i11, int i12) {
            this.f29770a = i10;
            this.f29771b = i11;
            this.f29772c = i12;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f29770a == aVar.f29770a && this.f29771b == aVar.f29771b && this.f29772c == aVar.f29772c;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f29770a), Integer.valueOf(this.f29771b), Integer.valueOf(this.f29772c));
        }

        public String toString() {
            return "CellPos{cellX=" + this.f29770a + ", cellY=" + this.f29771b + ", screenId=" + this.f29772c + '}';
        }
    }

    public a a(b bVar) {
        return new a(bVar.f595s, bVar.f596t, bVar.f594r);
    }
}
