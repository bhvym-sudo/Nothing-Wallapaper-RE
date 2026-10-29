package androidx.transition;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f14231b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f14230a = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final ArrayList f14232c = new ArrayList();

    public z(View view) {
        this.f14231b = view;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f14231b == zVar.f14231b && this.f14230a.equals(zVar.f14230a);
    }

    public int hashCode() {
        return (this.f14231b.hashCode() * 31) + this.f14230a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f14231b + "\n") + "    values:";
        for (String str2 : this.f14230a.keySet()) {
            str = str + "    " + str2 + ": " + this.f14230a.get(str2) + "\n";
        }
        return str;
    }
}
