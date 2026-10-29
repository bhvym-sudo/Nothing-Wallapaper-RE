package com.google.android.material.textfield;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: loaded from: classes.dex */
abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final TextInputLayout f17516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final r f17517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Context f17518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final CheckableImageButton f17519d;

    s(r rVar) {
        this.f17516a = rVar.f17499q;
        this.f17517b = rVar;
        this.f17518c = rVar.getContext();
        this.f17519d = rVar.r();
    }

    void a(Editable editable) {
    }

    void b(CharSequence charSequence, int i10, int i11, int i12) {
    }

    int c() {
        return 0;
    }

    int d() {
        return 0;
    }

    View.OnFocusChangeListener e() {
        return null;
    }

    View.OnClickListener f() {
        return null;
    }

    View.OnFocusChangeListener g() {
        return null;
    }

    C0.c.a h() {
        return null;
    }

    boolean i(int i10) {
        return true;
    }

    boolean j() {
        return false;
    }

    boolean k() {
        return false;
    }

    boolean l() {
        return false;
    }

    boolean m() {
        return false;
    }

    void n(EditText editText) {
    }

    void o(View view, C0.d dVar) {
    }

    void p(View view, AccessibilityEvent accessibilityEvent) {
    }

    void q(boolean z9) {
    }

    final void r() {
        this.f17517b.L(false);
    }

    void s() {
    }

    boolean t() {
        return false;
    }

    void u() {
    }
}
