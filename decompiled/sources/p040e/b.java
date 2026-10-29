package p040e;

import B8.h;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.o;
import p079h8.v;
import p089i8.AbstractC1439m;
import p089i8.AbstractC1444s;
import p089i8.N;

/* JADX INFO: loaded from: classes.dex */
public final class b extends p040e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f19756a = new a(null);

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final Intent a(String[] input) {
            n.h(input, "input");
            Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input);
            n.g(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
            return intentPutExtra;
        }

        private a() {
        }
    }

    @Override // p040e.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, String[] input) {
        n.h(context, "context");
        n.h(input, "input");
        return f19756a.a(input);
    }

    @Override // p040e.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public p040e.a.C0528a b(Context context, String[] input) {
        n.h(context, "context");
        n.h(input, "input");
        if (input.length == 0) {
            return new p040e.a.C0528a(N.g());
        }
        for (String str : input) {
            if (p171r0.a.a(context, str) != 0) {
                return null;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(h.f(N.d(input.length), 16));
        for (String str2 : input) {
            o oVarA = v.a(str2, Boolean.TRUE);
            linkedHashMap.put(oVarA.c(), oVarA.d());
        }
        return new p040e.a.C0528a(linkedHashMap);
    }

    @Override // p040e.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Map c(int i10, Intent intent) {
        if (i10 == -1 && intent != null) {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra == null || stringArrayExtra == null) {
                return N.g();
            }
            ArrayList arrayList = new ArrayList(intArrayExtra.length);
            for (int i11 : intArrayExtra) {
                arrayList.add(Boolean.valueOf(i11 == 0));
            }
            return N.n(AbstractC1444s.z0(AbstractC1439m.D(stringArrayExtra), arrayList));
        }
        return N.g();
    }
}
