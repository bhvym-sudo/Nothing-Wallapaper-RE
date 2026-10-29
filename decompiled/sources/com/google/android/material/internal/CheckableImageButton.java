package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.core.view.C1069a;
import androidx.core.view.H;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public class CheckableImageButton extends AppCompatImageButton implements Checkable {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int[] f16993t = {R.attr.state_checked};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f16994q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f16995r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f16996s;

    class a extends C1069a {
        a() {
        }

        @Override // androidx.core.view.C1069a
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        @Override // androidx.core.view.C1069a
        public void onInitializeAccessibilityNodeInfo(View view, C0.d dVar) {
            super.onInitializeAccessibilityNodeInfo(view, dVar);
            dVar.e0(CheckableImageButton.this.a());
            dVar.f0(CheckableImageButton.this.isChecked());
        }
    }

    static class b extends H0.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        boolean f16998q;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        private void a(Parcel parcel) {
            this.f16998q = parcel.readInt() == 1;
        }

        @Override // H0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f16998q ? 1 : 0);
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            a(parcel);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p050f.a.f20323C);
    }

    public boolean a() {
        return this.f16995r;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f16994q;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i10) {
        if (!this.f16994q) {
            return super.onCreateDrawableState(i10);
        }
        int[] iArr = f16993t;
        return View.mergeDrawableStates(super.onCreateDrawableState(i10 + iArr.length), iArr);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        setChecked(bVar.f16998q);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f16998q = this.f16994q;
        return bVar;
    }

    public void setCheckable(boolean z9) {
        if (this.f16995r != z9) {
            this.f16995r = z9;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z9) {
        if (!this.f16995r || this.f16994q == z9) {
            return;
        }
        this.f16994q = z9;
        refreshDrawableState();
        sendAccessibilityEvent(RecyclerView.ItemAnimator.FLAG_MOVED);
    }

    public void setPressable(boolean z9) {
        this.f16996s = z9;
    }

    @Override // android.view.View
    public void setPressed(boolean z9) {
        if (this.f16996s) {
            super.setPressed(z9);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f16994q);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f16995r = true;
        this.f16996s = true;
        H.g0(this, new a());
    }
}
