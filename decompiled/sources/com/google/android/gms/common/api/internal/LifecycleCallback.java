package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p015b4.C1185e;
import p015b4.InterfaceC1186f;
import p025c4.AbstractC1202p;

/* JADX INFO: loaded from: classes.dex */
public class LifecycleCallback {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected final InterfaceC1186f f16224q;

    protected LifecycleCallback(InterfaceC1186f interfaceC1186f) {
        this.f16224q = interfaceC1186f;
    }

    public static InterfaceC1186f c(Activity activity) {
        return d(new C1185e(activity));
    }

    protected static InterfaceC1186f d(C1185e c1185e) {
        if (c1185e.d()) {
            return p015b4.F.f0(c1185e.b());
        }
        if (c1185e.c()) {
            return p015b4.D.c(c1185e.a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    @Keep
    private static InterfaceC1186f getChimeraLifecycleFragmentImpl(C1185e c1185e) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public Activity b() {
        Activity activityZ = this.f16224q.z();
        AbstractC1202p.i(activityZ);
        return activityZ;
    }

    public void e(int i10, int i11, Intent intent) {
    }

    public void f(Bundle bundle) {
    }

    public void g() {
    }

    public void h() {
    }

    public void i(Bundle bundle) {
    }

    public void j() {
    }

    public void k() {
    }
}
