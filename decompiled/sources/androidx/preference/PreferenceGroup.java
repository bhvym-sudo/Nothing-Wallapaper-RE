package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import androidx.collection.P;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.ArrayList;
import java.util.List;
import p032d1.g;
import p181s0.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class PreferenceGroup extends Preference {

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    final P f13532T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private final Handler f13533U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private final List f13534V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private boolean f13535W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private int f13536X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private boolean f13537Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private int f13538Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final Runnable f13539a0;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                PreferenceGroup.this.f13532T.clear();
            }
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f13532T = new P();
        this.f13533U = new Handler(Looper.getMainLooper());
        this.f13535W = true;
        this.f13536X = 0;
        this.f13537Y = false;
        this.f13538Z = SubsamplingScaleImageView.TILE_SIZE_AUTO;
        this.f13539a0 = new a();
        this.f13534V = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f19534v0, i10, i11);
        int i12 = g.f19538x0;
        this.f13535W = k.b(typedArrayObtainStyledAttributes, i12, i12, true);
        int i13 = g.f19536w0;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            L(k.d(typedArrayObtainStyledAttributes, i13, i13, SubsamplingScaleImageView.TILE_SIZE_AUTO));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public Preference J(int i10) {
        return (Preference) this.f13534V.get(i10);
    }

    public int K() {
        return this.f13534V.size();
    }

    public void L(int i10) {
        if (i10 != Integer.MAX_VALUE && !s()) {
            Log.e("PreferenceGroup", getClass().getSimpleName() + " should have a key defined if it contains an expandable preference");
        }
        this.f13538Z = i10;
    }

    @Override // androidx.preference.Preference
    public void w(boolean z9) {
        super.w(z9);
        int iK = K();
        for (int i10 = 0; i10 < iK; i10++) {
            J(i10).A(this, z9);
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
