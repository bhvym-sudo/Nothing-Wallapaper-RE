package K0;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final File a(Context context, String fileName) {
        n.h(context, "<this>");
        n.h(fileName, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), "datastore/" + fileName);
    }
}
