package com.android.customization.picker.mode;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import com.nothing.wallpaper.R;
import p084i3.s0;

/* JADX INFO: loaded from: classes.dex */
public final class DarkModeSectionView extends s0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f15373s;

    public DarkModeSectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setTitle(context.getString(R.string.mode_title));
        this.f15373s = (context.getResources().getConfiguration().uiMode & 32) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Switch r9, CompoundButton compoundButton, boolean z9) {
        r9.setChecked(this.f15373s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        e();
    }

    private void e() {
        boolean z9 = !this.f15373s;
        this.f15373s = z9;
        f(z9);
    }

    private void f(boolean z9) {
        s0.a aVar = this.f22091q;
        if (aVar != null) {
            aVar.a(getContext(), z9);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        final Switch r9 = (Switch) findViewById(R.id.dark_mode_toggle);
        r9.setChecked(this.f15373s);
        r9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: d2.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z9) {
                this.f19543q.c(r9, compoundButton, z9);
            }
        });
        setOnClickListener(new View.OnClickListener() { // from class: d2.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f19545q.d(view);
            }
        });
    }

    @Override // android.view.View
    public void setEnabled(boolean z9) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).setEnabled(z9);
        }
    }
}
