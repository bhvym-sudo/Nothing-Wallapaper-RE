package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.collection.C1021a;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p181s0.h;
import p181s0.k;

/* JADX INFO: loaded from: classes.dex */
public class c extends e implements Animatable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private C0419c f14247r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Context f14248s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ArgbEvaluator f14249t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    d f14250u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Animator.AnimatorListener f14251v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    ArrayList f14252w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    final Drawable.Callback f14253x;

    class a implements Drawable.Callback {
        a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            c.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j9) {
            c.this.scheduleSelf(runnable, j9);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            c.this.unscheduleSelf(runnable);
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ArrayList arrayList = new ArrayList(c.this.f14252w);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((androidx.vectordrawable.graphics.drawable.b) arrayList.get(i10)).b(c.this);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ArrayList arrayList = new ArrayList(c.this.f14252w);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((androidx.vectordrawable.graphics.drawable.b) arrayList.get(i10)).c(c.this);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.c$c, reason: collision with other inner class name */
    private static class C0419c extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f14256a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        f f14257b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        AnimatorSet f14258c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        ArrayList f14259d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        C1021a f14260e;

        public C0419c(Context context, C0419c c0419c, Drawable.Callback callback, Resources resources) {
            if (c0419c != null) {
                this.f14256a = c0419c.f14256a;
                f fVar = c0419c.f14257b;
                if (fVar != null) {
                    Drawable.ConstantState constantState = fVar.getConstantState();
                    if (resources != null) {
                        this.f14257b = (f) constantState.newDrawable(resources);
                    } else {
                        this.f14257b = (f) constantState.newDrawable();
                    }
                    f fVar2 = (f) this.f14257b.mutate();
                    this.f14257b = fVar2;
                    fVar2.setCallback(callback);
                    this.f14257b.setBounds(c0419c.f14257b.getBounds());
                    this.f14257b.g(false);
                }
                ArrayList arrayList = c0419c.f14259d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f14259d = new ArrayList(size);
                    this.f14260e = new C1021a(size);
                    for (int i10 = 0; i10 < size; i10++) {
                        Animator animator = (Animator) c0419c.f14259d.get(i10);
                        Animator animatorClone = animator.clone();
                        String str = (String) c0419c.f14260e.get(animator);
                        animatorClone.setTarget(this.f14257b.c(str));
                        this.f14259d.add(animatorClone);
                        this.f14260e.put(animatorClone, str);
                    }
                    a();
                }
            }
        }

        public void a() {
            if (this.f14258c == null) {
                this.f14258c = new AnimatorSet();
            }
            this.f14258c.playTogether(this.f14259d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f14256a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    c() {
        this(null, null, null);
    }

    public static c a(Context context, int i10) {
        c cVar = new c(context);
        Drawable drawableE = h.e(context.getResources(), i10, context.getTheme());
        cVar.f14262q = drawableE;
        drawableE.setCallback(cVar.f14253x);
        cVar.f14250u = new d(cVar.f14262q.getConstantState());
        return cVar;
    }

    private static void c(AnimatedVectorDrawable animatedVectorDrawable, androidx.vectordrawable.graphics.drawable.b bVar) {
        animatedVectorDrawable.registerAnimationCallback(bVar.a());
    }

    private void d() {
        Animator.AnimatorListener animatorListener = this.f14251v;
        if (animatorListener != null) {
            this.f14247r.f14258c.removeListener(animatorListener);
            this.f14251v = null;
        }
    }

    private void e(String str, Animator animator) {
        animator.setTarget(this.f14247r.f14257b.c(str));
        C0419c c0419c = this.f14247r;
        if (c0419c.f14259d == null) {
            c0419c.f14259d = new ArrayList();
            this.f14247r.f14260e = new C1021a();
        }
        this.f14247r.f14259d.add(animator);
        this.f14247r.f14260e.put(animator, str);
    }

    private static boolean g(AnimatedVectorDrawable animatedVectorDrawable, androidx.vectordrawable.graphics.drawable.b bVar) {
        return animatedVectorDrawable.unregisterAnimationCallback(bVar.a());
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f14262q;
        if (drawable != null) {
            p201u0.a.a(drawable, theme);
        }
    }

    public void b(androidx.vectordrawable.graphics.drawable.b bVar) {
        Drawable drawable = this.f14262q;
        if (drawable != null) {
            c((AnimatedVectorDrawable) drawable, bVar);
            return;
        }
        if (bVar == null) {
            return;
        }
        if (this.f14252w == null) {
            this.f14252w = new ArrayList();
        }
        if (this.f14252w.contains(bVar)) {
            return;
        }
        this.f14252w.add(bVar);
        if (this.f14251v == null) {
            this.f14251v = new b();
        }
        this.f14247r.f14258c.addListener(this.f14251v);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f14262q;
        if (drawable != null) {
            return p201u0.a.b(drawable);
        }
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f14262q;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f14247r.f14257b.draw(canvas);
        if (this.f14247r.f14258c.isStarted()) {
            invalidateSelf();
        }
    }

    public boolean f(androidx.vectordrawable.graphics.drawable.b bVar) {
        Drawable drawable = this.f14262q;
        if (drawable != null) {
            g((AnimatedVectorDrawable) drawable, bVar);
        }
        ArrayList arrayList = this.f14252w;
        if (arrayList == null || bVar == null) {
            return false;
        }
        boolean zRemove = arrayList.remove(bVar);
        if (this.f14252w.size() == 0) {
            d();
        }
        return zRemove;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f14262q;
        return drawable != null ? p201u0.a.d(drawable) : this.f14247r.f14257b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f14262q;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return this.f14247r.f14256a | super.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f14262q;
        return drawable != null ? p201u0.a.e(drawable) : this.f14247r.f14257b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f14262q != null) {
            return new d(this.f14262q.getConstantState());
        }
        return null;
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f14262q;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f14247r.f14257b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f14262q;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f14247r.f14257b.getIntrinsicWidth();
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f14262q;
        return drawable != null ? drawable.getOpacity() : this.f14247r.f14257b.getOpacity();
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f14262q;
        if (drawable != null) {
            p201u0.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayQ = k.q(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f14237e);
                    int resourceId = typedArrayQ.getResourceId(0, 0);
                    if (resourceId != 0) {
                        f fVarB = f.b(resources, resourceId, theme);
                        fVarB.g(false);
                        fVarB.setCallback(this.f14253x);
                        f fVar = this.f14247r.f14257b;
                        if (fVar != null) {
                            fVar.setCallback(null);
                        }
                        this.f14247r.f14257b = fVarB;
                    }
                    typedArrayQ.recycle();
                } else if (TypedValues.AttributesType.S_TARGET.equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, androidx.vectordrawable.graphics.drawable.a.f14238f);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f14248s;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        e(string, androidx.vectordrawable.graphics.drawable.d.a(context, resourceId2));
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f14247r.a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f14262q;
        return drawable != null ? p201u0.a.h(drawable) : this.f14247r.f14257b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f14262q;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f14247r.f14258c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f14262q;
        return drawable != null ? drawable.isStateful() : this.f14247r.f14257b.isStateful();
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f14262q;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f14262q;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f14247r.f14257b.setBounds(rect);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        Drawable drawable = this.f14262q;
        return drawable != null ? drawable.setLevel(i10) : this.f14247r.f14257b.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f14262q;
        return drawable != null ? drawable.setState(iArr) : this.f14247r.f14257b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Drawable drawable = this.f14262q;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else {
            this.f14247r.f14257b.setAlpha(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z9) {
        Drawable drawable = this.f14262q;
        if (drawable != null) {
            p201u0.a.j(drawable, z9);
        } else {
            this.f14247r.f14257b.setAutoMirrored(z9);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i10) {
        super.setChangingConfigurations(i10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i10, PorterDuff.Mode mode) {
        super.setColorFilter(i10, mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z9) {
        super.setFilterBitmap(z9);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f10, float f11) {
        super.setHotspot(f10, f11);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        Drawable drawable = this.f14262q;
        if (drawable != null) {
            p201u0.a.n(drawable, i10);
        } else {
            this.f14247r.f14257b.setTint(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f14262q;
        if (drawable != null) {
            p201u0.a.o(drawable, colorStateList);
        } else {
            this.f14247r.f14257b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f14262q;
        if (drawable != null) {
            p201u0.a.p(drawable, mode);
        } else {
            this.f14247r.f14257b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z9, boolean z10) {
        Drawable drawable = this.f14262q;
        if (drawable != null) {
            return drawable.setVisible(z9, z10);
        }
        this.f14247r.f14257b.setVisible(z9, z10);
        return super.setVisible(z9, z10);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f14262q;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.f14247r.f14258c.isStarted()) {
                return;
            }
            this.f14247r.f14258c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f14262q;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f14247r.f14258c.end();
        }
    }

    private c(Context context) {
        this(context, null, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f14262q;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f14247r.f14257b.setColorFilter(colorFilter);
        }
    }

    private static class d extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Drawable.ConstantState f14261a;

        public d(Drawable.ConstantState constantState) {
            this.f14261a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f14261a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f14261a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            c cVar = new c();
            Drawable drawableNewDrawable = this.f14261a.newDrawable();
            cVar.f14262q = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.f14253x);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            c cVar = new c();
            Drawable drawableNewDrawable = this.f14261a.newDrawable(resources);
            cVar.f14262q = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.f14253x);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            c cVar = new c();
            Drawable drawableNewDrawable = this.f14261a.newDrawable(resources, theme);
            cVar.f14262q = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.f14253x);
            return cVar;
        }
    }

    private c(Context context, C0419c c0419c, Resources resources) {
        this.f14249t = null;
        this.f14251v = null;
        this.f14252w = null;
        a aVar = new a();
        this.f14253x = aVar;
        this.f14248s = context;
        if (c0419c != null) {
            this.f14247r = c0419c;
        } else {
            this.f14247r = new C0419c(context, c0419c, aVar, resources);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
