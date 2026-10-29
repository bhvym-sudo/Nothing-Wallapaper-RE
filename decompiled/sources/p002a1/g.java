package p002a1;

import C8.c;
import androidx.lifecycle.InterfaceC1155o;
import androidx.lifecycle.a0;
import androidx.lifecycle.d0;
import androidx.lifecycle.f0;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f9601a = new g();

    public static final class a implements Z0.a.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f9602a = new a();

        private a() {
        }
    }

    private g() {
    }

    public final Z0.a a(f0 owner) {
        n.h(owner, "owner");
        return owner instanceof InterfaceC1155o ? ((InterfaceC1155o) owner).getDefaultViewModelCreationExtras() : Z0.a.C0345a.f9384b;
    }

    public final d0.c b(f0 owner) {
        n.h(owner, "owner");
        return owner instanceof InterfaceC1155o ? ((InterfaceC1155o) owner).getDefaultViewModelProviderFactory() : c.f9595b;
    }

    public final String c(c modelClass) {
        n.h(modelClass, "modelClass");
        String strA = h.a(modelClass);
        if (strA == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return "androidx.lifecycle.ViewModelProvider.DefaultKey:" + strA;
    }

    public final a0 d() {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }
}
