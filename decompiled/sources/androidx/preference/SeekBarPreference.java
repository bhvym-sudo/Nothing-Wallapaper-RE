package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import p032d1.c;
import p032d1.g;

/* JADX INFO: loaded from: classes.dex */
public class SeekBarPreference extends Preference {

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    int f13542T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    int f13543U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private int f13544V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private int f13545W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    boolean f13546X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    SeekBar f13547Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private TextView f13548Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    boolean f13549a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private boolean f13550b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    boolean f13551c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private final SeekBar.OnSeekBarChangeListener f13552d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private final View.OnKeyListener f13553e0;

    class a implements SeekBar.OnSeekBarChangeListener {
        a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z9) {
            if (z9) {
                SeekBarPreference seekBarPreference = SeekBarPreference.this;
                if (seekBarPreference.f13551c0 || !seekBarPreference.f13546X) {
                    seekBarPreference.M(seekBar);
                    return;
                }
            }
            SeekBarPreference seekBarPreference2 = SeekBarPreference.this;
            seekBarPreference2.N(i10 + seekBarPreference2.f13543U);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.f13546X = true;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.f13546X = false;
            int progress = seekBar.getProgress();
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if (progress + seekBarPreference.f13543U != seekBarPreference.f13542T) {
                seekBarPreference.M(seekBar);
            }
        }
    }

    class b implements View.OnKeyListener {
        b() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if ((!seekBarPreference.f13549a0 && (i10 == 21 || i10 == 22)) || i10 == 23 || i10 == 66) {
                return false;
            }
            SeekBar seekBar = seekBarPreference.f13547Y;
            if (seekBar != null) {
                return seekBar.onKeyDown(i10, keyEvent);
            }
            Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
            return false;
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f13552d0 = new a();
        this.f13553e0 = new b();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f19439C0, i10, i11);
        this.f13543U = typedArrayObtainStyledAttributes.getInt(g.f19445F0, 0);
        J(typedArrayObtainStyledAttributes.getInt(g.f19441D0, 100));
        K(typedArrayObtainStyledAttributes.getInt(g.f19447G0, 0));
        this.f13549a0 = typedArrayObtainStyledAttributes.getBoolean(g.f19443E0, true);
        this.f13550b0 = typedArrayObtainStyledAttributes.getBoolean(g.f19449H0, false);
        this.f13551c0 = typedArrayObtainStyledAttributes.getBoolean(g.f19451I0, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void L(int i10, boolean z9) {
        int i11 = this.f13543U;
        if (i10 < i11) {
            i10 = i11;
        }
        int i12 = this.f13544V;
        if (i10 > i12) {
            i10 = i12;
        }
        if (i10 != this.f13542T) {
            this.f13542T = i10;
            N(i10);
            E(i10);
            if (z9) {
                v();
            }
        }
    }

    public final void J(int i10) {
        int i11 = this.f13543U;
        if (i10 < i11) {
            i10 = i11;
        }
        if (i10 != this.f13544V) {
            this.f13544V = i10;
            v();
        }
    }

    public final void K(int i10) {
        if (i10 != this.f13545W) {
            this.f13545W = Math.min(this.f13544V - this.f13543U, Math.abs(i10));
            v();
        }
    }

    void M(SeekBar seekBar) {
        int progress = this.f13543U + seekBar.getProgress();
        if (progress != this.f13542T) {
            if (d(Integer.valueOf(progress))) {
                L(progress, false);
            } else {
                seekBar.setProgress(this.f13542T - this.f13543U);
                N(this.f13542T);
            }
        }
    }

    void N(int i10) {
        TextView textView = this.f13548Z;
        if (textView != null) {
            textView.setText(String.valueOf(i10));
        }
    }

    @Override // androidx.preference.Preference
    protected Object z(TypedArray typedArray, int i10) {
        return Integer.valueOf(typedArray.getInt(i10, 0));
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.f19428h);
    }
}
