package com.google.android.material.theme;

import B4.a;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.app.l;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.v;

/* JADX INFO: loaded from: classes.dex */
public class MaterialComponentsViewInflater extends l {
    @Override // androidx.appcompat.app.l
    protected AppCompatAutoCompleteTextView c(Context context, AttributeSet attributeSet) {
        return new v(context, attributeSet);
    }

    @Override // androidx.appcompat.app.l
    protected AppCompatButton d(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // androidx.appcompat.app.l
    protected AppCompatCheckBox e(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    @Override // androidx.appcompat.app.l
    protected AppCompatRadioButton k(Context context, AttributeSet attributeSet) {
        return new J4.a(context, attributeSet);
    }

    @Override // androidx.appcompat.app.l
    protected AppCompatTextView o(Context context, AttributeSet attributeSet) {
        return new P4.a(context, attributeSet);
    }
}
