package p025c4;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
final class A extends C {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final /* synthetic */ Intent f15052q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ Activity f15053r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final /* synthetic */ int f15054s;

    A(Intent intent, Activity activity, int i10) {
        this.f15052q = intent;
        this.f15053r = activity;
        this.f15054s = i10;
    }

    @Override // p025c4.C
    public final void a() {
        Intent intent = this.f15052q;
        if (intent != null) {
            this.f15053r.startActivityForResult(intent, this.f15054s);
        }
    }
}
