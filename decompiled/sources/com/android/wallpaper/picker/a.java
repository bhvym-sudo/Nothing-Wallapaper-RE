package com.android.wallpaper.picker;

import H3.r;
import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toolbar;
import androidx.fragment.app.AbstractActivityC1136v;
import com.android.wallpaper.widget.BottomActionBar;
import p084i3.C1395d;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends C1395d implements Toolbar.OnMenuItemClickListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected InterfaceC0448a f15943r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f15944s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected Toolbar f15945t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private TextView f15946u;

    /* JADX INFO: renamed from: com.android.wallpaper.picker.a$a, reason: collision with other inner class name */
    public interface InterfaceC0448a {
        void k();

        boolean q();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Bundle g0(CharSequence charSequence) {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("ToolbarFragment.title", charSequence);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m0(View view) {
        this.f15943r.k();
    }

    private void u0() {
        Drawable drawableMutate = getResources().getDrawable(2131231193, null).mutate();
        drawableMutate.setAutoMirrored(true);
        drawableMutate.setTint(r.a(getActivity(), R.attr.textColorPrimary));
        this.f15945t.setNavigationIcon(drawableMutate);
        this.f15945t.setNavigationContentDescription(com.nothing.wallpaper.R.string.bottom_action_bar_back);
        this.f15945t.setNavigationOnClickListener(new View.OnClickListener() { // from class: i3.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22025q.m0(view);
            }
        });
    }

    @Override // p084i3.C1395d
    protected void e0(BottomActionBar bottomActionBar) {
        bottomActionBar.setBackButtonVisibility((this.f15944s && this.f15943r.q()) ? 8 : 0);
        super.e0(bottomActionBar);
    }

    protected String h0() {
        return null;
    }

    public CharSequence i0() {
        return null;
    }

    protected int j0() {
        return com.nothing.wallpaper.R.color.toolbar_color;
    }

    protected int k0() {
        return com.nothing.wallpaper.R.id.toolbar;
    }

    protected boolean l0() {
        return this.f15943r.q();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void n0(CharSequence charSequence) {
        Toolbar toolbar = this.f15945t;
        if (toolbar == null) {
            return;
        }
        if (this.f15946u != null) {
            toolbar.setTitle((CharSequence) null);
            this.f15946u.setText(charSequence);
        } else {
            toolbar.setTitle(charSequence);
        }
        if (getActivity() != null) {
            String strH0 = h0();
            AbstractActivityC1136v activity = getActivity();
            if (!TextUtils.isEmpty(strH0)) {
                charSequence = strH0;
            }
            activity.setTitle(charSequence);
        }
    }

    protected void o0(int i10) {
        this.f15945t.setBackgroundResource(i10);
        getActivity().getWindow().setStatusBarColor(getActivity().getResources().getColor(i10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onAttach(Context context) {
        super.onAttach(context);
        this.f15943r = (InterfaceC0448a) context;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onDestroyView() {
        super.onDestroyView();
        this.f15945t = null;
        this.f15946u = null;
    }

    @Override // android.widget.Toolbar.OnMenuItemClickListener
    public boolean onMenuItemClick(MenuItem menuItem) {
        return false;
    }

    public void p0(boolean z9) {
        this.f15944s = z9;
    }

    public void q0(View view) {
        r0(view, true);
    }

    protected void r0(View view, boolean z9) {
        this.f15944s = z9;
        Toolbar toolbar = (Toolbar) view.findViewById(k0());
        this.f15945t = toolbar;
        this.f15946u = (TextView) toolbar.findViewById(com.nothing.wallpaper.R.id.custom_toolbar_title);
        o0(j0());
        CharSequence charSequence = getArguments() != null ? getArguments().getCharSequence("ToolbarFragment.title", i0()) : i0();
        if (!TextUtils.isEmpty(charSequence)) {
            n0(charSequence);
        }
        if (z9 && l0()) {
            u0();
        }
    }

    public void s0(int i10) {
        this.f15945t.inflateMenu(i10);
        this.f15945t.setOnMenuItemClickListener(this);
    }

    protected void t0(int i10, View.OnClickListener onClickListener) {
        this.f15945t.getMenu().findItem(i10).getActionView().setOnClickListener(onClickListener);
    }
}
