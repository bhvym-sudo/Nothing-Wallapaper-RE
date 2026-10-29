package E8;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public abstract class j {
    public static void a(Appendable appendable, Object obj, p219v8.l lVar) throws IOException {
        kotlin.jvm.internal.n.h(appendable, "<this>");
        if (lVar != null) {
            appendable.append((CharSequence) lVar.f(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(obj.toString());
        }
    }
}
