package R2;

import I8.InterfaceC0880f;
import android.content.Intent;
import kotlin.jvm.internal.n;
import p129m8.e;

/* JADX INFO: loaded from: classes.dex */
public interface a {

    /* JADX INFO: renamed from: R2.a$a, reason: collision with other inner class name */
    public static final class C0252a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f6976a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f6977b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f6978c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f6979d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f6980e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f6981f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Intent f6982g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Intent f6983h;

        public C0252a(String id, String name, int i10, boolean z9, String str, String str2, Intent intent, Intent intent2) {
            n.h(id, "id");
            n.h(name, "name");
            this.f6976a = id;
            this.f6977b = name;
            this.f6978c = i10;
            this.f6979d = z9;
            this.f6980e = str;
            this.f6981f = str2;
            this.f6982g = intent;
            this.f6983h = intent2;
        }

        public final Intent a() {
            return this.f6983h;
        }

        public final Intent b() {
            return this.f6982g;
        }

        public final String c() {
            return this.f6981f;
        }

        public final String d() {
            return this.f6980e;
        }

        public final int e() {
            return this.f6978c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0252a)) {
                return false;
            }
            C0252a c0252a = (C0252a) obj;
            return n.d(this.f6976a, c0252a.f6976a) && n.d(this.f6977b, c0252a.f6977b) && this.f6978c == c0252a.f6978c && this.f6979d == c0252a.f6979d && n.d(this.f6980e, c0252a.f6980e) && n.d(this.f6981f, c0252a.f6981f) && n.d(this.f6982g, c0252a.f6982g) && n.d(this.f6983h, c0252a.f6983h);
        }

        public final String f() {
            return this.f6976a;
        }

        public final String g() {
            return this.f6977b;
        }

        public final boolean h() {
            return this.f6979d;
        }

        public int hashCode() {
            int iHashCode = ((((((this.f6976a.hashCode() * 31) + this.f6977b.hashCode()) * 31) + Integer.hashCode(this.f6978c)) * 31) + Boolean.hashCode(this.f6979d)) * 31;
            String str = this.f6980e;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f6981f;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Intent intent = this.f6982g;
            int iHashCode4 = (iHashCode3 + (intent == null ? 0 : intent.hashCode())) * 31;
            Intent intent2 = this.f6983h;
            return iHashCode4 + (intent2 != null ? intent2.hashCode() : 0);
        }

        public String toString() {
            return "Affordance(id=" + this.f6976a + ", name=" + this.f6977b + ", iconResourceId=" + this.f6978c + ", isEnabled=" + this.f6979d + ", enablementExplanation=" + this.f6980e + ", enablementActionText=" + this.f6981f + ", enablementActionIntent=" + this.f6982g + ", configureIntent=" + this.f6983h + ")";
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f6984a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f6985b;

        public b(String name, boolean z9) {
            n.h(name, "name");
            this.f6984a = name;
            this.f6985b = z9;
        }

        public final String a() {
            return this.f6984a;
        }

        public final boolean b() {
            return this.f6985b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return n.d(this.f6984a, bVar.f6984a) && this.f6985b == bVar.f6985b;
        }

        public int hashCode() {
            return (this.f6984a.hashCode() * 31) + Boolean.hashCode(this.f6985b);
        }

        public String toString() {
            return "Flag(name=" + this.f6984a + ", value=" + this.f6985b + ")";
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f6986a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f6987b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f6988c;

        public c(String slotId, String affordanceId, String affordanceName) {
            n.h(slotId, "slotId");
            n.h(affordanceId, "affordanceId");
            n.h(affordanceName, "affordanceName");
            this.f6986a = slotId;
            this.f6987b = affordanceId;
            this.f6988c = affordanceName;
        }

        public final String a() {
            return this.f6987b;
        }

        public final String b() {
            return this.f6986a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return n.d(this.f6986a, cVar.f6986a) && n.d(this.f6987b, cVar.f6987b) && n.d(this.f6988c, cVar.f6988c);
        }

        public int hashCode() {
            return (((this.f6986a.hashCode() * 31) + this.f6987b.hashCode()) * 31) + this.f6988c.hashCode();
        }

        public String toString() {
            return "Selection(slotId=" + this.f6986a + ", affordanceId=" + this.f6987b + ", affordanceName=" + this.f6988c + ")";
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f6989a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f6990b;

        public d(String id, int i10) {
            n.h(id, "id");
            this.f6989a = id;
            this.f6990b = i10;
        }

        public final int a() {
            return this.f6990b;
        }

        public final String b() {
            return this.f6989a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return n.d(this.f6989a, dVar.f6989a) && this.f6990b == dVar.f6990b;
        }

        public int hashCode() {
            return (this.f6989a.hashCode() * 31) + Integer.hashCode(this.f6990b);
        }

        public String toString() {
            return "Slot(id=" + this.f6989a + ", capacity=" + this.f6990b + ")";
        }
    }

    static /* synthetic */ Object g(a aVar, int i10, int i11, e eVar, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAffordanceIcon");
        }
        if ((i12 & 2) != 0) {
            i11 = -1;
        }
        return aVar.i(i10, i11, eVar);
    }

    Object a(e eVar);

    InterfaceC0880f b();

    Object c(e eVar);

    InterfaceC0880f d();

    Object e(String str, String str2, e eVar);

    Object f(String str, e eVar);

    InterfaceC0880f h();

    Object i(int i10, int i11, e eVar);

    Object j(e eVar);
}
