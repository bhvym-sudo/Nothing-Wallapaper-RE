package p189s8;

import E8.i;
import java.io.File;
import kotlin.jvm.internal.n;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public abstract class g extends f {
    public static String a(File file) {
        n.h(file, "<this>");
        String name = file.getName();
        n.g(name, "getName(...)");
        return i.L0(name, '.', "");
    }
}
