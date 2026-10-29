package p164q3;

import android.content.Context;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0636a f23887a = new C0636a(null);

    /* JADX INFO: renamed from: q3.a$a, reason: collision with other inner class name */
    public static final class C0636a {
        public /* synthetic */ C0636a(AbstractC1457h abstractC1457h) {
            this();
        }

        private C0636a() {
        }
    }

    public static final class b extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f23888b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String text) {
            super(null);
            n.h(text, "text");
            this.f23888b = text;
        }

        public final String b() {
            return this.f23888b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && n.d(this.f23888b, ((b) obj).f23888b);
        }

        public int hashCode() {
            return this.f23888b.hashCode();
        }

        public String toString() {
            return "Loaded(text=" + this.f23888b + ")";
        }
    }

    public static final class c extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f23889b;

        public c(int i10) {
            super(null);
            this.f23889b = i10;
        }

        public final int b() {
            return this.f23889b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f23889b == ((c) obj).f23889b;
        }

        public int hashCode() {
            return Integer.hashCode(this.f23889b);
        }

        public String toString() {
            return "Resource(res=" + this.f23889b + ")";
        }
    }

    public /* synthetic */ a(AbstractC1457h abstractC1457h) {
        this();
    }

    public final String a(Context context) {
        n.h(context, "context");
        if (this instanceof c) {
            String string = context.getString(((c) this).b());
            n.g(string, "getString(...)");
            return string;
        }
        if (this instanceof b) {
            return ((b) this).b();
        }
        throw new m();
    }

    private a() {
    }
}
