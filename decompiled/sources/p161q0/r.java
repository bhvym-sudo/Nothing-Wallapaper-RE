package p161q0;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class r implements Iterable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ArrayList f23875q = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Context f23876r;

    public interface a {
        Intent p();
    }

    private r(Context context) {
        this.f23876r = context;
    }

    public static r f(Context context) {
        return new r(context);
    }

    public r a(Intent intent) {
        this.f23875q.add(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r b(Activity activity) {
        Intent intentP = activity instanceof a ? ((a) activity).p() : null;
        if (intentP == null) {
            intentP = h.a(activity);
        }
        if (intentP != null) {
            ComponentName component = intentP.getComponent();
            if (component == null) {
                component = intentP.resolveActivity(this.f23876r.getPackageManager());
            }
            e(component);
            a(intentP);
        }
        return this;
    }

    public r e(ComponentName componentName) {
        int size = this.f23875q.size();
        try {
            Intent intentB = h.b(this.f23876r, componentName);
            while (intentB != null) {
                this.f23875q.add(size, intentB);
                intentB = h.b(this.f23876r, intentB.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e10);
        }
    }

    public void g() {
        j(null);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f23875q.iterator();
    }

    public void j(Bundle bundle) {
        if (this.f23875q.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f23875q.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (p171r0.a.f(this.f23876r, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f23876r.startActivity(intent);
    }
}
