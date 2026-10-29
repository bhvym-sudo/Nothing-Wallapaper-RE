package com.android.customization.picker.themedicon;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Switch;
import com.nothing.wallpaper.R;
import p084i3.s0;

/* JADX INFO: loaded from: classes.dex */
public class ThemedIconSectionView extends s0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Switch f15374s;

    public ThemedIconSectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setTitle(context.getString(R.string.themed_icon_title));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.f15374s.toggle();
        s0.a aVar = this.f22091q;
        if (aVar != null) {
            aVar.a(getContext(), this.f15374s.isChecked());
        }
    }

    public Switch getSwitch() {
        return this.f15374s;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f15374s = (Switch) findViewById(R.id.themed_icon_toggle);
        setOnClickListener(new View.OnClickListener() { // from class: t2.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f27875q.b(view);
            }
        });
    }
}
