package p257z6;

import Y8.a;
import e9.z;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.n;
import p079h8.A;
import p189s8.b;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e {
    public static final boolean a(a aVar, File file) throws IOException {
        n.h(aVar, "<this>");
        n.h(file, "file");
        z zVarB = aVar.b(file);
        try {
            try {
                aVar.f(file);
                b.a(zVarB, null);
                return true;
            } catch (IOException unused) {
                A a10 = A.f21846a;
                b.a(zVarB, null);
                aVar.f(file);
                return false;
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                b.a(zVarB, th);
                throw th2;
            }
        }
    }
}
