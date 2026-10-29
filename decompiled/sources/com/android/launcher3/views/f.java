package com.android.launcher3.views;

import F2.w;
import android.content.Context;
import android.content.ContextWrapper;
import com.android.launcher3.Workspace;
import com.android.launcher3.dragndrop.DragLayer;
import com.android.launcher3.m;
import com.nothing.launcher.card.p;

/* JADX INFO: loaded from: classes.dex */
public interface f {
    static Context F(Context context) {
        if (context instanceof f) {
            return context;
        }
        if (context instanceof ContextWrapper) {
            return F(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    static Context y(Context context) {
        Context contextF = F(context);
        if (contextF != null) {
            return contextF;
        }
        throw new IllegalArgumentException("Cannot find ActivityContext in parent tree");
    }

    default boolean A() {
        return true;
    }

    DragLayer J();

    com.android.launcher3.f K();

    Workspace M();

    default boolean O() {
        return false;
    }

    default boolean Q() {
        return false;
    }

    p R();

    default p213v2.b S() {
        return null;
    }

    default void U(m mVar, int[] iArr, int i10, int i11) {
    }

    default p233x2.c getCellPosMapper() {
        return new p233x2.c();
    }

    default boolean h() {
        return false;
    }

    default void i(C2.b bVar, int i10, int i11, int i12, int i13, boolean z9) {
        bVar.f595s = i10;
        bVar.f596t = i11;
        bVar.f597u = i12;
        bVar.f598v = i13;
        if (z9) {
            k(bVar);
        }
    }

    default void k(C2.b bVar) {
    }

    default void o(C2.b bVar) {
    }

    default com.android.launcher3.dragndrop.a p() {
        return null;
    }

    default boolean s() {
        return false;
    }

    w[] x();
}
