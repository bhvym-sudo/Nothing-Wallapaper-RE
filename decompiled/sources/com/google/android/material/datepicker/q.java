package com.google.android.material.datepicker;

import androidx.fragment.app.AbstractComponentCallbacksC1132q;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
abstract class q extends AbstractComponentCallbacksC1132q {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected final LinkedHashSet f16974q = new LinkedHashSet();

    q() {
    }

    boolean d0(p pVar) {
        return this.f16974q.add(pVar);
    }

    void e0() {
        this.f16974q.clear();
    }
}
