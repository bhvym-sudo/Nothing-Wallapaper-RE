package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class A extends AbstractC1138x {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Activity f12850q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Context f12851r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Handler f12852s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f12853t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final J f12854u;

    public A(Activity activity, Context context, Handler handler, int i10) {
        kotlin.jvm.internal.n.h(context, "context");
        kotlin.jvm.internal.n.h(handler, "handler");
        this.f12850q = activity;
        this.f12851r = context;
        this.f12852s = handler;
        this.f12853t = i10;
        this.f12854u = new K();
    }

    public final Activity e() {
        return this.f12850q;
    }

    public final Context h() {
        return this.f12851r;
    }

    public final J j() {
        return this.f12854u;
    }

    public final Handler k() {
        return this.f12852s;
    }

    public abstract void p(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract Object q();

    public abstract LayoutInflater t();

    public void u(AbstractComponentCallbacksC1132q fragment, String[] permissions, int i10) {
        kotlin.jvm.internal.n.h(fragment, "fragment");
        kotlin.jvm.internal.n.h(permissions, "permissions");
    }

    public abstract boolean w(String str);

    public void x(AbstractComponentCallbacksC1132q fragment, Intent intent, int i10, Bundle bundle) {
        kotlin.jvm.internal.n.h(fragment, "fragment");
        kotlin.jvm.internal.n.h(intent, "intent");
        if (i10 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        p171r0.a.g(this.f12851r, intent, bundle);
    }

    public void y(AbstractComponentCallbacksC1132q fragment, IntentSender intent, int i10, Intent intent2, int i11, int i12, int i13, Bundle bundle) {
        kotlin.jvm.internal.n.h(fragment, "fragment");
        kotlin.jvm.internal.n.h(intent, "intent");
        if (i10 != -1) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        Activity activity = this.f12850q;
        if (activity == null) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        p161q0.a.m(activity, intent, i10, intent2, i11, i12, i13, bundle);
    }

    public abstract void z();

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public A(AbstractActivityC1136v activity) {
        this(activity, activity, new Handler(), 0);
        kotlin.jvm.internal.n.h(activity, "activity");
    }
}
