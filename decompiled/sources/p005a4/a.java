package p005a4;

import android.content.Context;
import android.os.Looper;
import java.util.Set;
import p015b4.InterfaceC1183c;
import p015b4.h;
import p025c4.AbstractC1189c;
import p025c4.AbstractC1202p;
import p025c4.C1190d;
import p025c4.InterfaceC1196j;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC0351a f9821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f9822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f9823c;

    /* JADX INFO: renamed from: a4.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0351a extends e {
        public f a(Context context, Looper looper, C1190d c1190d, Object obj, a4.e.a aVar, a4.e.b bVar) {
            return b(context, looper, c1190d, obj, aVar, bVar);
        }

        public f b(Context context, Looper looper, C1190d c1190d, Object obj, InterfaceC1183c interfaceC1183c, h hVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    public interface b {
    }

    public static class c {
    }

    public interface d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0352a f9824a = new C0352a(null);

        /* JADX INFO: renamed from: a4.a$d$a, reason: collision with other inner class name */
        public static final class C0352a implements d {
            /* synthetic */ C0352a(i iVar) {
            }
        }
    }

    public static abstract class e {
    }

    public interface f extends b {
        void a(AbstractC1189c.InterfaceC0435c interfaceC0435c);

        Set b();

        void c(String str);

        boolean d();

        String e();

        void f();

        boolean g();

        void i(InterfaceC1196j interfaceC1196j, Set set);

        void j(AbstractC1189c.e eVar);

        boolean k();

        int l();

        Z3.c[] m();

        String n();

        boolean o();
    }

    public static final class g extends c {
    }

    public a(String str, AbstractC0351a abstractC0351a, g gVar) {
        AbstractC1202p.j(abstractC0351a, "Cannot construct an Api with a null ClientBuilder");
        AbstractC1202p.j(gVar, "Cannot construct an Api with a null ClientKey");
        this.f9823c = str;
        this.f9821a = abstractC0351a;
        this.f9822b = gVar;
    }

    public final AbstractC0351a a() {
        return this.f9821a;
    }

    public final String b() {
        return this.f9823c;
    }
}
