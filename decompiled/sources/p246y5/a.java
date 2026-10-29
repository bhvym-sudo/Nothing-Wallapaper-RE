package p246y5;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.nothing.cardwidget.BlinkChronometer;
import kotlin.jvm.internal.n;
import org.json.JSONObject;
import p079h8.A;
import p079h8.q;
import p079h8.r;
import p206u5.c;
import p226w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class a implements k {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final JSONObject f30290q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private AnimationDrawable f30291r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Boolean f30292s;

    public a(JSONObject jSONObject) {
        this.f30290q = jSONObject;
        this.f30292s = jSONObject != null ? (Boolean) c.c(jSONObject, "playOnce", Boolean.FALSE) : null;
    }

    @Override // p226w5.k
    public void a() {
        AnimationDrawable animationDrawable = this.f30291r;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
    }

    @Override // p226w5.k
    public void b() {
        AnimationDrawable animationDrawable;
        if (!n.d(this.f30292s, Boolean.FALSE) || (animationDrawable = this.f30291r) == null) {
            return;
        }
        animationDrawable.stop();
    }

    public final void c(View target) {
        Object objB;
        n.h(target, "target");
        try {
            q.a aVar = q.f21862r;
            JSONObject jSONObject = this.f30290q;
            A a10 = null;
            if (jSONObject != null) {
                boolean zOptBoolean = jSONObject.optBoolean("set_one_shot");
                boolean zOptBoolean2 = jSONObject.optBoolean(BlinkChronometer.METHOD_START);
                Drawable background = target.getBackground();
                n.f(background, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
                AnimationDrawable animationDrawable = (AnimationDrawable) background;
                this.f30291r = animationDrawable;
                if (animationDrawable != null) {
                    animationDrawable.setOneShot(zOptBoolean);
                }
                if (zOptBoolean2) {
                    AnimationDrawable animationDrawable2 = this.f30291r;
                    if (animationDrawable2 != null) {
                        animationDrawable2.start();
                        a10 = A.f21846a;
                    }
                } else {
                    cancel();
                    a10 = A.f21846a;
                }
            }
            objB = q.b(a10);
        } catch (Throwable th) {
            q.a aVar2 = q.f21862r;
            objB = q.b(r.a(th));
        }
        Throwable thD = q.d(objB);
        if (thD != null) {
            G5.c.f1948a.c("AnimationDrawable parse error: " + thD);
        }
    }

    @Override // p226w5.k
    public void cancel() {
        AnimationDrawable animationDrawable = this.f30291r;
        if (animationDrawable != null) {
            animationDrawable.stop();
        }
    }

    @Override // p226w5.k
    public void pause() {
        AnimationDrawable animationDrawable = this.f30291r;
        if (animationDrawable != null) {
            animationDrawable.stop();
        }
    }

    @Override // p226w5.k
    public void registerAnimListener() {
    }

    @Override // p226w5.k
    public void start() {
        AnimationDrawable animationDrawable;
        if (!n.d(this.f30292s, Boolean.FALSE) || (animationDrawable = this.f30291r) == null) {
            return;
        }
        animationDrawable.start();
    }

    @Override // p226w5.k
    public void unregisterAnimListener() {
    }
}
