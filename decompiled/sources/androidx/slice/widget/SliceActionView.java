package androidx.slice.widget;

import android.R;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Switch;
import androidx.slice.SliceItem;

/* JADX INFO: loaded from: classes.dex */
public class SliceActionView extends FrameLayout implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    static final int[] f13833x = {R.attr.state_checked};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private p112l1.e f13834q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private androidx.slice.widget.a f13835r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private b f13836s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private View f13837t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ProgressBar f13838u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f13839v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f13840w;

    private static class a extends ImageView implements Checkable, View.OnClickListener {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private boolean f13841q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private View.OnClickListener f13842r;

        a(Context context) {
            super(context);
            super.setOnClickListener(this);
        }

        @Override // android.widget.Checkable
        public boolean isChecked() {
            return this.f13841q;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            toggle();
        }

        @Override // android.widget.ImageView, android.view.View
        public int[] onCreateDrawableState(int i10) {
            int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
            if (this.f13841q) {
                View.mergeDrawableStates(iArrOnCreateDrawableState, SliceActionView.f13833x);
            }
            return iArrOnCreateDrawableState;
        }

        @Override // android.widget.Checkable
        public void setChecked(boolean z9) {
            if (this.f13841q != z9) {
                this.f13841q = z9;
                refreshDrawableState();
                View.OnClickListener onClickListener = this.f13842r;
                if (onClickListener != null) {
                    onClickListener.onClick(this);
                }
            }
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            this.f13842r = onClickListener;
        }

        @Override // android.widget.Checkable
        public void toggle() {
            setChecked(!isChecked());
        }
    }

    interface b {
        void a(SliceItem sliceItem, int i10);
    }

    public SliceActionView(Context context) {
        super(context);
        Resources resources = getContext().getResources();
        this.f13839v = resources.getDimensionPixelSize(p122m1.b.f23111l);
        this.f13840w = resources.getDimensionPixelSize(p122m1.b.f23119t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void b() {
        Intent intentPutExtra;
        p112l1.e eVar = this.f13834q;
        if (eVar == null || eVar.d() == null) {
            return;
        }
        try {
            if (this.f13834q.b()) {
                boolean zIsChecked = ((Checkable) this.f13837t).isChecked();
                intentPutExtra = new Intent().addFlags(268435456).putExtra("android.app.slice.extra.TOGGLE_STATE", zIsChecked);
                androidx.slice.widget.a aVar = this.f13835r;
                if (aVar != null) {
                    aVar.f13892h = zIsChecked ? 1 : 0;
                }
            } else {
                intentPutExtra = null;
            }
            if (this.f13834q.d().b(getContext(), intentPutExtra)) {
                setLoading(true);
                b bVar = this.f13836s;
                if (bVar != null) {
                    androidx.slice.widget.a aVar2 = this.f13835r;
                    bVar.a(this.f13834q.f(), aVar2 != null ? aVar2.f13888d : -1);
                }
            }
        } catch (PendingIntent.CanceledException e10) {
            View view = this.f13837t;
            if (view instanceof Checkable) {
                view.setSelected(true ^ ((Checkable) view).isChecked());
            }
            Log.e("SliceActionView", "PendingIntent for slice cannot be sent", e10);
        }
    }

    public void a() {
        p112l1.e eVar = this.f13834q;
        if (eVar == null) {
            return;
        }
        if (eVar.b()) {
            d();
        } else {
            b();
        }
    }

    public void c(p112l1.e eVar, androidx.slice.widget.a aVar, SliceView.d dVar, int i10, b bVar) {
        View view = this.f13837t;
        if (view != null) {
            removeView(view);
            this.f13837t = null;
        }
        View view2 = this.f13838u;
        if (view2 != null) {
            removeView(view2);
            this.f13838u = null;
        }
        this.f13834q = eVar;
        this.f13835r = aVar;
        this.f13837t = null;
        this.f13836s = bVar;
        if (eVar.i()) {
            Switch r9 = (Switch) LayoutInflater.from(getContext()).inflate(p122m1.d.f23138k, (ViewGroup) this, false);
            addView(r9);
            r9.setChecked(eVar.h());
            r9.setOnCheckedChangeListener(this);
            r9.setMinimumHeight(this.f13840w);
            r9.setMinimumWidth(this.f13840w);
            if (i10 != -1) {
                Drawable drawableR = p201u0.a.r(r9.getTrackDrawable());
                p201u0.a.n(drawableR, i10);
                r9.setTrackDrawable(drawableR);
                Drawable drawableR2 = p201u0.a.r(r9.getThumbDrawable());
                p201u0.a.n(drawableR2, i10);
                r9.setThumbDrawable(drawableR2);
            }
            this.f13837t = r9;
        } else if (eVar.getIcon() != null) {
            if (eVar.b()) {
                a aVar2 = new a(getContext());
                aVar2.setChecked(eVar.h());
                this.f13837t = aVar2;
            } else {
                this.f13837t = new ImageView(getContext());
            }
            addView(this.f13837t);
            Drawable drawableN = this.f13834q.getIcon().n(getContext());
            ((ImageView) this.f13837t).setImageDrawable(drawableN);
            if (i10 != -1 && this.f13834q.c() == 0 && drawableN != null) {
                p201u0.a.n(drawableN, i10);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f13837t.getLayoutParams();
            int i11 = this.f13840w;
            layoutParams.width = i11;
            layoutParams.height = i11;
            this.f13837t.setLayoutParams(layoutParams);
            int i12 = eVar.c() == 0 ? this.f13839v / 2 : 0;
            this.f13837t.setPadding(i12, i12, i12, i12);
            this.f13837t.setBackground(k.f(getContext(), R.attr.selectableItemBackgroundBorderless));
            this.f13837t.setOnClickListener(this);
        }
        if (this.f13837t != null) {
            this.f13837t.setContentDescription(eVar.e() != null ? eVar.e() : eVar.g());
        }
    }

    public void d() {
        p112l1.e eVar;
        if (this.f13837t == null || (eVar = this.f13834q) == null || !eVar.b()) {
            return;
        }
        ((Checkable) this.f13837t).toggle();
    }

    public p112l1.e getAction() {
        return this.f13834q;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z9) {
        if (this.f13834q == null || this.f13837t == null) {
            return;
        }
        b();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f13834q == null || this.f13837t == null) {
            return;
        }
        b();
    }

    public void setLoading(boolean z9) {
        if (z9) {
            if (this.f13838u == null) {
                ProgressBar progressBar = (ProgressBar) LayoutInflater.from(getContext()).inflate(p122m1.d.f23133f, (ViewGroup) this, false);
                this.f13838u = progressBar;
                addView(progressBar);
            }
            k.i(getContext(), this.f13838u);
        }
        this.f13837t.setVisibility(z9 ? 8 : 0);
        this.f13838u.setVisibility(z9 ? 0 : 8);
    }
}
