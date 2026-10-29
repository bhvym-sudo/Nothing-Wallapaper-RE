package p235x4;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f29946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f29947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TimeInterpolator f29948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f29949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f29950e;

    public d(long j9, long j10) {
        this.f29948c = null;
        this.f29949d = 0;
        this.f29950e = 1;
        this.f29946a = j9;
        this.f29947b = j10;
    }

    static d a(ValueAnimator valueAnimator) {
        d dVar = new d(valueAnimator.getStartDelay(), valueAnimator.getDuration(), e(valueAnimator));
        dVar.f29949d = valueAnimator.getRepeatCount();
        dVar.f29950e = valueAnimator.getRepeatMode();
        return dVar;
    }

    private static TimeInterpolator e(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
            return a.f29940b;
        }
        if (interpolator instanceof AccelerateInterpolator) {
            return a.f29941c;
        }
        return interpolator instanceof DecelerateInterpolator ? a.f29942d : interpolator;
    }

    public long b() {
        return this.f29946a;
    }

    public long c() {
        return this.f29947b;
    }

    public TimeInterpolator d() {
        TimeInterpolator timeInterpolator = this.f29948c;
        return timeInterpolator != null ? timeInterpolator : a.f29940b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (b() == dVar.b() && c() == dVar.c() && f() == dVar.f() && g() == dVar.g()) {
            return d().getClass().equals(dVar.d().getClass());
        }
        return false;
    }

    public int f() {
        return this.f29949d;
    }

    public int g() {
        return this.f29950e;
    }

    public int hashCode() {
        return (((((((((int) (b() ^ (b() >>> 32))) * 31) + ((int) (c() ^ (c() >>> 32)))) * 31) + d().getClass().hashCode()) * 31) + f()) * 31) + g();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + b() + " duration: " + c() + " interpolator: " + d().getClass() + " repeatCount: " + f() + " repeatMode: " + g() + "}\n";
    }

    public d(long j9, long j10, TimeInterpolator timeInterpolator) {
        this.f29949d = 0;
        this.f29950e = 1;
        this.f29946a = j9;
        this.f29947b = j10;
        this.f29948c = timeInterpolator;
    }
}
