package L4;

import N4.h;
import N4.l;
import N4.o;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public class a extends Drawable implements o {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private b f4783q;

    @Override // android.graphics.drawable.Drawable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public a mutate() {
        this.f4783q = new b(this.f4783q);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        b bVar = this.f4783q;
        if (bVar.f4785b) {
            bVar.f4784a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f4783q;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f4783q.f4784a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f4783q.f4784a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        if (this.f4783q.f4784a.setState(iArr)) {
            zOnStateChange = true;
        }
        boolean zE = L4.b.e(iArr);
        b bVar = this.f4783q;
        if (bVar.f4785b == zE) {
            return zOnStateChange;
        }
        bVar.f4785b = zE;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f4783q.f4784a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f4783q.f4784a.setColorFilter(colorFilter);
    }

    @Override // N4.o
    public void setShapeAppearanceModel(l lVar) {
        this.f4783q.f4784a.setShapeAppearanceModel(lVar);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        this.f4783q.f4784a.setTint(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f4783q.f4784a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f4783q.f4784a.setTintMode(mode);
    }

    public a(l lVar) {
        this(new b(new h(lVar)));
    }

    static final class b extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        h f4784a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f4785b;

        public b(h hVar) {
            this.f4784a = hVar;
            this.f4785b = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a newDrawable() {
            return new a(new b(this));
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        public b(b bVar) {
            this.f4784a = (h) bVar.f4784a.getConstantState().newDrawable();
            this.f4785b = bVar.f4785b;
        }
    }

    private a(b bVar) {
        this.f4783q = bVar;
    }
}
