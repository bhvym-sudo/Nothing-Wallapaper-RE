package com.android.wallpaper.picker;

import H3.AbstractC0851a;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.AbstractActivityC1136v;
import p074h3.J;

/* JADX INFO: loaded from: classes.dex */
public class TrampolinePickerActivity extends AbstractActivityC1136v {
    private void u0() {
        J j9 = new J();
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        if (j9.b(this)) {
            AbstractC0851a.m(this, new Intent(this, (Class<?>) CustomizationPickerActivity.class).putExtras(extras), 0);
        } else {
            AbstractC0851a.m(this, new Intent(this, (Class<?>) PassThroughCustomizationPickerActivity.class).putExtras(extras), 0);
        }
        finish();
    }

    @Override // androidx.fragment.app.AbstractActivityC1136v, p010b.j, p161q0.f, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        u0();
    }
}
