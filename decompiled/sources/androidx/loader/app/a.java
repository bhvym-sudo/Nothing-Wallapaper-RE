package androidx.loader.app;

import androidx.lifecycle.InterfaceC1163x;
import androidx.lifecycle.f0;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static a b(InterfaceC1163x interfaceC1163x) {
        return new b(interfaceC1163x, ((f0) interfaceC1163x).getViewModelStore());
    }

    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract void c();
}
