package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1157q;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC1140z f12986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ClassLoader f12987b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f12989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f12990e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f12991f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f12992g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f12993h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f12994i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    String f12996k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f12997l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    CharSequence f12998m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f12999n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    CharSequence f13000o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    ArrayList f13001p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    ArrayList f13002q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    ArrayList f13004s;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    ArrayList f12988c = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    boolean f12995j = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    boolean f13003r = false;

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f13005a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        AbstractComponentCallbacksC1132q f13006b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f13007c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f13008d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f13009e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f13010f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f13011g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        AbstractC1157q.b f13012h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        AbstractC1157q.b f13013i;

        a() {
        }

        a(int i10, AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
            this.f13005a = i10;
            this.f13006b = abstractComponentCallbacksC1132q;
            this.f13007c = false;
            AbstractC1157q.b bVar = AbstractC1157q.b.RESUMED;
            this.f13012h = bVar;
            this.f13013i = bVar;
        }

        a(int i10, AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q, boolean z9) {
            this.f13005a = i10;
            this.f13006b = abstractComponentCallbacksC1132q;
            this.f13007c = z9;
            AbstractC1157q.b bVar = AbstractC1157q.b.RESUMED;
            this.f13012h = bVar;
            this.f13013i = bVar;
        }

        a(int i10, AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q, AbstractC1157q.b bVar) {
            this.f13005a = i10;
            this.f13006b = abstractComponentCallbacksC1132q;
            this.f13007c = false;
            this.f13012h = abstractComponentCallbacksC1132q.mMaxState;
            this.f13013i = bVar;
        }
    }

    S(AbstractC1140z abstractC1140z, ClassLoader classLoader) {
        this.f12986a = abstractC1140z;
        this.f12987b = classLoader;
    }

    public S b(int i10, AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
        o(i10, abstractComponentCallbacksC1132q, null, 1);
        return this;
    }

    public S c(int i10, AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q, String str) {
        o(i10, abstractComponentCallbacksC1132q, str, 1);
        return this;
    }

    public final S d(ViewGroup viewGroup, AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q, String str) {
        abstractComponentCallbacksC1132q.mContainer = viewGroup;
        abstractComponentCallbacksC1132q.mInDynamicContainer = true;
        return c(viewGroup.getId(), abstractComponentCallbacksC1132q, str);
    }

    public S e(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q, String str) {
        o(0, abstractComponentCallbacksC1132q, str, 1);
        return this;
    }

    void f(a aVar) {
        this.f12988c.add(aVar);
        aVar.f13008d = this.f12989d;
        aVar.f13009e = this.f12990e;
        aVar.f13010f = this.f12991f;
        aVar.f13011g = this.f12992g;
    }

    public S g(String str) {
        if (!this.f12995j) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.f12994i = true;
        this.f12996k = str;
        return this;
    }

    public S h(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
        f(new a(7, abstractComponentCallbacksC1132q));
        return this;
    }

    public abstract int i();

    public abstract int j();

    public abstract void k();

    public abstract void l();

    public S m(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
        f(new a(6, abstractComponentCallbacksC1132q));
        return this;
    }

    public S n() {
        if (this.f12994i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f12995j = false;
        return this;
    }

    void o(int i10, AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q, String str, int i11) {
        String str2 = abstractComponentCallbacksC1132q.mPreviousWho;
        if (str2 != null) {
            U0.c.f(abstractComponentCallbacksC1132q, str2);
        }
        Class<?> cls = abstractComponentCallbacksC1132q.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = abstractComponentCallbacksC1132q.mTag;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + abstractComponentCallbacksC1132q + ": was " + abstractComponentCallbacksC1132q.mTag + " now " + str);
            }
            abstractComponentCallbacksC1132q.mTag = str;
        }
        if (i10 != 0) {
            if (i10 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + abstractComponentCallbacksC1132q + " with tag " + str + " to container view with no id");
            }
            int i12 = abstractComponentCallbacksC1132q.mFragmentId;
            if (i12 != 0 && i12 != i10) {
                throw new IllegalStateException("Can't change container ID of fragment " + abstractComponentCallbacksC1132q + ": was " + abstractComponentCallbacksC1132q.mFragmentId + " now " + i10);
            }
            abstractComponentCallbacksC1132q.mFragmentId = i10;
            abstractComponentCallbacksC1132q.mContainerId = i10;
        }
        f(new a(i11, abstractComponentCallbacksC1132q));
    }

    public abstract boolean p();

    public S q(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
        f(new a(3, abstractComponentCallbacksC1132q));
        return this;
    }

    public S r(int i10, AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
        return s(i10, abstractComponentCallbacksC1132q, null);
    }

    public S s(int i10, AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q, String str) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        o(i10, abstractComponentCallbacksC1132q, str, 2);
        return this;
    }

    S t(boolean z9, Runnable runnable) {
        if (!z9) {
            n();
        }
        if (this.f13004s == null) {
            this.f13004s = new ArrayList();
        }
        this.f13004s.add(runnable);
        return this;
    }

    public S u(int i10, int i11, int i12, int i13) {
        this.f12989d = i10;
        this.f12990e = i11;
        this.f12991f = i12;
        this.f12992g = i13;
        return this;
    }

    public S v(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q, AbstractC1157q.b bVar) {
        f(new a(10, abstractComponentCallbacksC1132q, bVar));
        return this;
    }

    public S w(boolean z9) {
        this.f13003r = z9;
        return this;
    }
}
