package W4;

import U4.f;
import U4.g;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public final class d implements V4.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final U4.d f8657e = W4.a.b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final f f8658f = W4.b.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final f f8659g = c.b();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final b f8660h = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f8661a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f8662b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private U4.d f8663c = f8657e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f8664d = false;

    class a implements U4.a {
        a() {
        }

        @Override // U4.a
        public void a(Object obj, Writer writer) {
            e eVar = new e(writer, d.this.f8661a, d.this.f8662b, d.this.f8663c, d.this.f8664d);
            eVar.f(obj, false);
            eVar.m();
        }

        @Override // U4.a
        public String b(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                a(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    private static final class b implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final DateFormat f8666a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f8666a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        private b() {
        }

        @Override // U4.f
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Date date, g gVar) {
            gVar.c(f8666a.format(date));
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    public d() {
        m(String.class, f8658f);
        m(Boolean.class, f8659g);
        m(Date.class, f8660h);
    }

    static /* synthetic */ void i(Object obj, U4.e eVar) {
        throw new U4.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    public U4.a f() {
        return new a();
    }

    public d g(V4.a aVar) {
        aVar.a(this);
        return this;
    }

    public d h(boolean z9) {
        this.f8664d = z9;
        return this;
    }

    @Override // V4.b
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public d a(Class cls, U4.d dVar) {
        this.f8661a.put(cls, dVar);
        this.f8662b.remove(cls);
        return this;
    }

    public d m(Class cls, f fVar) {
        this.f8662b.put(cls, fVar);
        this.f8661a.remove(cls);
        return this;
    }
}
