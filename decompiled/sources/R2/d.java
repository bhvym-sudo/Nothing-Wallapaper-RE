package R2;

import android.net.Uri;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f7061a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Uri f7062b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f7063a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final Uri f7064b;

        static {
            Uri uriBuild = d.f7062b.buildUpon().path("flags").build();
            n.g(uriBuild, "build(...)");
            f7064b = uriBuild;
        }

        private a() {
        }

        public final Uri a() {
            return f7064b;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f7065a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final Uri f7066b;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f7067a = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final Uri f7068b;

            static {
                Uri uriBuild = b.f7066b.buildUpon().appendPath("affordances").build();
                n.g(uriBuild, "build(...)");
                f7068b = uriBuild;
            }

            private a() {
            }

            public final Uri a() {
                return f7068b;
            }
        }

        /* JADX INFO: renamed from: R2.d$b$b, reason: collision with other inner class name */
        public static final class C0257b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0257b f7069a = new C0257b();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final Uri f7070b;

            static {
                Uri uriBuild = b.f7066b.buildUpon().appendPath("selections").build();
                n.g(uriBuild, "build(...)");
                f7070b = uriBuild;
            }

            private C0257b() {
            }

            public final Uri a() {
                return f7070b;
            }
        }

        public static final class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f7071a = new c();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final Uri f7072b;

            static {
                Uri uriBuild = b.f7066b.buildUpon().appendPath("slots").build();
                n.g(uriBuild, "build(...)");
                f7072b = uriBuild;
            }

            private c() {
            }

            public final Uri a() {
                return f7072b;
            }
        }

        static {
            Uri uriBuild = d.f7062b.buildUpon().path("lockscreen_quickaffordance").build();
            n.g(uriBuild, "build(...)");
            f7066b = uriBuild;
        }

        private b() {
        }
    }

    static {
        Uri uriBuild = new Uri.Builder().scheme("content").authority("com.android.systemui.customization").build();
        n.g(uriBuild, "build(...)");
        f7062b = uriBuild;
    }

    private d() {
    }
}
