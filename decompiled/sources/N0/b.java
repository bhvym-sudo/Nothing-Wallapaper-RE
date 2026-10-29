package N0;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final File a(Context context, String name) {
        n.h(context, "<this>");
        n.h(name, "name");
        return K0.a.a(context, name + ".preferences_pb");
    }
}
