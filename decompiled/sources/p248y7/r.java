package p248y7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.RectF;
import android.util.Property;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.android.launcher3.CellLayout;
import com.android.launcher3.Workspace;
import com.android.launcher3.dragndrop.DragLayer;
import com.android.launcher3.f;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.picker.lockscreen.ui.view.E;
import com.nothing.wallpaper.picker.lockscreen.ui.view.ShortCutPreview;
import com.nothing.wallpaper.widget.RoundImageView;
import com.nothing.wallpaper.widget.RoundedOverlayImageView;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p044e3.AbstractC1340u;
import p079h8.h;
import p079h8.i;
import p087i6.e;

/* JADX INFO: loaded from: classes2.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final E f30517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final J7.b f30518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CardView f30519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Button f30520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final RoundedOverlayImageView f30521e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final View f30522f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ShortCutPreview f30523g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ImageView f30524h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final CardView f30525i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final CardView f30526j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final RoundImageView f30527k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Workspace f30528l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final DragLayer f30529m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final CellLayout f30530n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final TextView f30531o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final ImageButton f30532p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final TextView f30533q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final TextView f30534r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private c f30535s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final f f30536t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private AnimatorSet f30537u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Context f30538v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final float f30539w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f30540x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final h f30541y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final b f30516z = new b(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final a f30515A = new a(RectF.class);

    public static final class a extends Property {
        a(Class cls) {
            super(cls, "nonTranslations");
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public RectF get(c changeAnimator) {
            n.h(changeAnimator, "changeAnimator");
            return changeAnimator.a();
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(c changeAnimator, RectF value) {
            n.h(changeAnimator, "changeAnimator");
            n.h(value, "value");
            changeAnimator.b(value);
        }
    }

    public static final class b {
        public /* synthetic */ b(AbstractC1457h abstractC1457h) {
            this();
        }

        public final RectF a(View view) {
            n.h(view, "view");
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int i10 = iArr[0];
            int i11 = iArr[1];
            return new RectF(i10, i11, view.getWidth() + i10, view.getHeight() + i11);
        }

        private b() {
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View[] f30542a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f30543b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f30544c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f30545d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f30546e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private RectF f30547f;

        public c(RectF startValue, View... animView) {
            n.h(startValue, "startValue");
            n.h(animView, "animView");
            this.f30542a = animView;
            int width = animView[0].getWidth();
            this.f30543b = width;
            int height = animView[0].getHeight();
            this.f30544c = height;
            this.f30545d = width / 2.0f;
            this.f30546e = height / 2.0f;
            this.f30547f = startValue;
            for (View view : animView) {
                view.setPivotX(this.f30545d);
                view.setPivotY(this.f30546e);
            }
            b(startValue);
        }

        public final RectF a() {
            return this.f30547f;
        }

        public final void b(RectF value) {
            n.h(value, "value");
            this.f30547f = value;
            if (this.f30543b == 0 || this.f30544c == 0) {
                return;
            }
            float fWidth = value.width() / this.f30543b;
            float fHeight = value.height() / this.f30544c;
            float fCenterX = value.centerX() - this.f30545d;
            float fCenterY = value.centerY() - this.f30546e;
            for (View view : this.f30542a) {
                view.setScaleX(fWidth);
                view.setScaleY(fHeight);
                view.setTranslationX(fCenterX);
                view.setTranslationY(fCenterY);
            }
        }
    }

    public static final class d extends AnimatorListenerAdapter {
        d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            n.h(animation, "animation");
            r.this.f30530n.o(false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            n.h(animation, "animation");
            r.this.f30530n.o(true);
        }
    }

    public r(AbstractC1340u binding, E clockHost, com.android.launcher3.views.f activityContext, J7.b shareViewModel) {
        n.h(binding, "binding");
        n.h(clockHost, "clockHost");
        n.h(activityContext, "activityContext");
        n.h(shareViewModel, "shareViewModel");
        this.f30517a = clockHost;
        this.f30518b = shareViewModel;
        CardView translationAll = binding.f20129H;
        n.g(translationAll, "translationAll");
        this.f30519c = translationAll;
        Button btnWallpaper = binding.f20122A;
        n.g(btnWallpaper, "btnWallpaper");
        this.f30520d = btnWallpaper;
        RoundedOverlayImageView wallpaperThumbnail = binding.f20138Q;
        n.g(wallpaperThumbnail, "wallpaperThumbnail");
        this.f30521e = wallpaperThumbnail;
        this.f30522f = clockHost.getIndicator();
        ShortCutPreview shortcutPreview = binding.f20128G;
        n.g(shortcutPreview, "shortcutPreview");
        this.f30523g = shortcutPreview;
        ImageView fingerprintView = binding.f20126E;
        n.g(fingerprintView, "fingerprintView");
        this.f30524h = fingerprintView;
        CardView wallpaperPreview = binding.f20136O;
        n.g(wallpaperPreview, "wallpaperPreview");
        this.f30525i = wallpaperPreview;
        CardView wallpaperDepthPreview = binding.f20133L;
        n.g(wallpaperDepthPreview, "wallpaperDepthPreview");
        this.f30526j = wallpaperDepthPreview;
        RoundImageView previewDimmingScrim = binding.f20127F;
        n.g(previewDimmingScrim, "previewDimmingScrim");
        this.f30527k = previewDimmingScrim;
        Workspace workspace = binding.f20139R;
        n.g(workspace, "workspace");
        this.f30528l = workspace;
        DragLayer dragLayer = binding.f20125D;
        n.g(dragLayer, "dragLayer");
        this.f30529m = dragLayer;
        this.f30530n = binding.f20139R.f(0);
        TextView tvPinchTip = binding.f20131J;
        n.g(tvPinchTip, "tvPinchTip");
        this.f30531o = tvPinchTip;
        ImageButton btnEffects = binding.f20144z;
        n.g(btnEffects, "btnEffects");
        this.f30532p = btnEffects;
        TextView actionDone = binding.f20142x;
        n.g(actionDone, "actionDone");
        this.f30533q = actionDone;
        TextView actionCancel = binding.f20141w;
        n.g(actionCancel, "actionCancel");
        this.f30534r = actionCancel;
        this.f30536t = activityContext.K();
        Context context = translationAll.getContext();
        this.f30538v = context;
        this.f30541y = i.b(new p219v8.a() { // from class: y7.q
            @Override // p219v8.a
            public final Object invoke() {
                return Boolean.valueOf(r.h());
            }
        });
        if (shareViewModel.l() || shareViewModel.g() == null) {
            return;
        }
        p258z7.a aVarG = shareViewModel.g();
        n.e(aVarG);
        this.f30540x = Math.min(aVarG.a().width() / aVarG.b().width(), aVarG.a().height() / aVarG.b().height()) * context.getResources().getDimension(R.dimen.wallpaper_picker_entry_card_corner_radius);
        if (shareViewModel.i()) {
            this.f30535s = new c(aVarG.a(), translationAll);
            l(1.0f);
            shortcutPreview.setShowPreview(false);
        } else {
            translationAll.setBackgroundColor(0);
            this.f30535s = new c(aVarG.b(), translationAll);
            l(0.0f);
            shortcutPreview.setShowPreview(true);
        }
        m(shareViewModel.i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(boolean z9, r rVar, ValueAnimator it) {
        float fD;
        n.h(it, "it");
        if (z9) {
            Object animatedValue = it.getAnimatedValue();
            n.g(animatedValue, "getAnimatedValue(...)");
            fD = p206u5.a.d(animatedValue);
        } else {
            Object animatedValue2 = it.getAnimatedValue();
            n.g(animatedValue2, "getAnimatedValue(...)");
            fD = 1 - p206u5.a.d(animatedValue2);
        }
        rVar.l(fD);
    }

    private final boolean g() {
        return ((Boolean) this.f30541y.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h() {
        return e.j();
    }

    private final void l(float f10) {
        float f11 = 1 - f10;
        this.f30524h.setAlpha(f11);
        this.f30523g.g(f10, this.f30518b.p());
        if (g()) {
            this.f30530n.setGridAlpha(f10);
            if (!this.f30518b.q()) {
                this.f30517a.h(f10);
            }
        } else {
            this.f30530n.getAnimBackground().setAlpha((int) (255 * f10));
        }
        this.f30530n.getEmptyView().setAlpha(f10);
        this.f30525i.setRadius((f11 * this.f30540x) + (this.f30539w * f10));
        this.f30526j.setRadius(this.f30525i.getRadius());
        this.f30527k.setRoundRadius(this.f30525i.getRadius());
        float f12 = this.f30518b.q() ? 0.1f : f10;
        if (this.f30518b.q()) {
            f10 = 0.0f;
        }
        this.f30520d.setAlpha(f10);
        this.f30521e.setAlpha(f10);
        this.f30528l.setTranslationY(this.f30536t.f15537F * f10);
        View view = this.f30522f;
        if (view != null) {
            view.setAlpha(f10);
        }
        this.f30531o.setAlpha(f10);
        this.f30532p.setAlpha(f10);
        this.f30533q.setAlpha(f12);
        this.f30534r.setAlpha(f12);
    }

    private final void m(boolean z9) {
        this.f30529m.setImportantForAccessibility(z9 ? 2 : 4);
    }

    public final AnimatorSet d(final boolean z9) {
        m(z9);
        p258z7.a aVarG = this.f30518b.g();
        if (aVarG == null) {
            return new AnimatorSet();
        }
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(this.f30535s, f30515A, new S7.d(), z9 ? new RectF(aVarG.a()) : new RectF(aVarG.b()));
        n.g(objectAnimatorOfObject, "ofObject(...)");
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: y7.p
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                r.e(z9, this, valueAnimator);
            }
        });
        this.f30523g.setShowPreview(!z9);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimatorOfObject);
        animatorSet.play(valueAnimatorOfFloat);
        animatorSet.addListener(new d());
        this.f30537u = animatorSet;
        return animatorSet;
    }

    public final void f() {
        p258z7.a aVarG = this.f30518b.g();
        if (aVarG == null) {
            return;
        }
        c cVar = this.f30535s;
        if (cVar != null) {
            cVar.b(aVarG.a());
        }
        l(1.0f);
        this.f30523g.setShowPreview(false);
    }

    public final boolean i() {
        AnimatorSet animatorSet = this.f30537u;
        return animatorSet != null && animatorSet.isRunning();
    }

    public final void j(float f10) {
        i();
    }

    public final void k(float f10) {
        if (i()) {
            return;
        }
        float f11 = 1 - f10;
        this.f30520d.setAlpha(f11);
        this.f30521e.setAlpha(f11);
        this.f30532p.setAlpha(f11);
        this.f30534r.setAlpha(B8.h.e(0.1f, f11));
        this.f30533q.setAlpha(B8.h.e(0.1f, f11));
        this.f30528l.setTranslationY(this.f30536t.f15537F * f11);
        View view = this.f30522f;
        if (view != null) {
            view.setAlpha(f11);
        }
    }
}
