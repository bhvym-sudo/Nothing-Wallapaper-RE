package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f17114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f17115d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private K4.d f17118g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextPaint f17112a = new TextPaint(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final K4.f f17113b = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f17116e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private WeakReference f17117f = new WeakReference(null);

    class a extends K4.f {
        a() {
        }

        @Override // K4.f
        public void a(int i10) {
            i.this.f17116e = true;
            b bVar = (b) i.this.f17117f.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // K4.f
        public void b(Typeface typeface, boolean z9) {
            if (z9) {
                return;
            }
            i.this.f17116e = true;
            b bVar = (b) i.this.f17117f.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public i(b bVar) {
        j(bVar);
    }

    private float c(String str) {
        if (str == null) {
            return 0.0f;
        }
        return Math.abs(this.f17112a.getFontMetrics().ascent);
    }

    private float d(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f17112a.measureText(charSequence, 0, charSequence.length());
    }

    private void i(String str) {
        this.f17114c = d(str);
        this.f17115d = c(str);
        this.f17116e = false;
    }

    public K4.d e() {
        return this.f17118g;
    }

    public float f(String str) {
        if (!this.f17116e) {
            return this.f17115d;
        }
        i(str);
        return this.f17115d;
    }

    public TextPaint g() {
        return this.f17112a;
    }

    public float h(String str) {
        if (!this.f17116e) {
            return this.f17114c;
        }
        i(str);
        return this.f17114c;
    }

    public void j(b bVar) {
        this.f17117f = new WeakReference(bVar);
    }

    public void k(K4.d dVar, Context context) {
        if (this.f17118g != dVar) {
            this.f17118g = dVar;
            if (dVar != null) {
                dVar.o(context, this.f17112a, this.f17113b);
                b bVar = (b) this.f17117f.get();
                if (bVar != null) {
                    this.f17112a.drawableState = bVar.getState();
                }
                dVar.n(context, this.f17112a, this.f17113b);
                this.f17116e = true;
            }
            b bVar2 = (b) this.f17117f.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void l(boolean z9) {
        this.f17116e = z9;
    }

    public void m(boolean z9) {
        this.f17116e = z9;
    }

    public void n(Context context) {
        this.f17118g.n(context, this.f17112a, this.f17113b);
    }
}
