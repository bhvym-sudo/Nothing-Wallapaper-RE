package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.view.H;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.j;
import com.google.android.material.internal.n;
import com.google.android.material.textfield.TextInputLayout;
import p225w4.g;

/* JADX INFO: loaded from: classes.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Chip f17580q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final TextInputLayout f17581r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final EditText f17582s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private TextWatcher f17583t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private TextView f17584u;

    private class b extends j {
        private b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.f17580q.setText(ChipTextInputComboView.this.c("00"));
                return;
            }
            String strC = ChipTextInputComboView.this.c(editable);
            Chip chip = ChipTextInputComboView.this.f17580q;
            if (TextUtils.isEmpty(strC)) {
                strC = ChipTextInputComboView.this.c("00");
            }
            chip.setText(strC);
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c(CharSequence charSequence) {
        return e.a(getResources(), charSequence);
    }

    private void d() {
        this.f17582s.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f17580q.isChecked();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        d();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z9) {
        this.f17580q.setChecked(z9);
        this.f17582s.setVisibility(z9 ? 0 : 4);
        this.f17580q.setVisibility(z9 ? 8 : 0);
        if (isChecked()) {
            n.j(this.f17582s, false);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f17580q.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i10, Object obj) {
        this.f17580q.setTag(i10, obj);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.f17580q.toggle();
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        Chip chip = (Chip) layoutInflaterFrom.inflate(g.f28861l, (ViewGroup) this, false);
        this.f17580q = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) layoutInflaterFrom.inflate(g.f28862m, (ViewGroup) this, false);
        this.f17581r = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f17582s = editText;
        editText.setVisibility(4);
        b bVar = new b();
        this.f17583t = bVar;
        editText.addTextChangedListener(bVar);
        d();
        addView(chip);
        addView(textInputLayout);
        this.f17584u = (TextView) findViewById(p225w4.e.f28837p);
        editText.setId(H.i());
        H.t0(this.f17584u, editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }
}
