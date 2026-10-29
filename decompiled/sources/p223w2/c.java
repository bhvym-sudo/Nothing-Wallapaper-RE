package p223w2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.FloatProperty;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final FloatProperty f28555e = new a("value");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Runnable f28556f = new Runnable() { // from class: w2.b
        @Override // java.lang.Runnable
        public final void run() {
            c.a();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runnable f28557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ObjectAnimator f28558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Float f28559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f28560d;

    class a extends FloatProperty {
        a(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(c cVar) {
            return Float.valueOf(cVar.f28560d);
        }

        @Override // android.util.FloatProperty
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void setValue(c cVar, float f10) {
            cVar.h(f10);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(Object obj, Float f10) {
            super.set(obj, f10);
        }
    }

    class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f28561a;

        b(float f10) {
            this.f28561a = f10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (c.this.f28558b == animator) {
                c.this.f28558b = null;
                c.this.f28559c = null;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (c.this.f28558b == animator) {
                c.this.f28559c = Float.valueOf(this.f28561a);
            }
        }
    }

    public c(Runnable runnable) {
        this.f28557a = runnable;
    }

    public static /* synthetic */ void a() {
    }

    public ObjectAnimator e(float f10) {
        return f(this.f28560d, f10);
    }

    public ObjectAnimator f(float f10, float f11) {
        g();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f28555e, f10, f11);
        this.f28558b = objectAnimatorOfFloat;
        objectAnimatorOfFloat.addListener(new b(f11));
        return this.f28558b;
    }

    public void g() {
        ObjectAnimator objectAnimator = this.f28558b;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            ObjectAnimator objectAnimator2 = this.f28558b;
            if (objectAnimator2 != null) {
                objectAnimator2.setValues(new PropertyValuesHolder[0]);
                this.f28558b = null;
            }
        }
    }

    public void h(float f10) {
        if (Float.compare(f10, this.f28560d) != 0) {
            this.f28560d = f10;
            this.f28557a.run();
        }
    }

    public c(Runnable runnable, float f10) {
        this(runnable);
        this.f28560d = f10;
    }
}
