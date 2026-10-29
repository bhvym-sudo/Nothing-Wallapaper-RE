package p025c4;

import android.content.Intent;
import p015b4.InterfaceC1186f;

/* JADX INFO: loaded from: classes.dex */
final class B extends C {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final /* synthetic */ Intent f15055q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ InterfaceC1186f f15056r;

    B(Intent intent, InterfaceC1186f interfaceC1186f, int i10) {
        this.f15055q = intent;
        this.f15056r = interfaceC1186f;
    }

    @Override // p025c4.C
    public final void a() {
        Intent intent = this.f15055q;
        if (intent != null) {
            this.f15056r.startActivityForResult(intent, 2);
        }
    }
}
