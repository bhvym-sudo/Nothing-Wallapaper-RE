package C0;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f568a;

    static class a extends AccessibilityNodeProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final e f569a;

        a(e eVar) {
            this.f569a = eVar;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
            d dVarB = this.f569a.b(i10);
            if (dVarB == null) {
                return null;
            }
            return dVarB.T0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List findAccessibilityNodeInfosByText(String str, int i10) {
            List listC = this.f569a.c(str, i10);
            if (listC == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = listC.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(((d) listC.get(i11)).T0());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i10) {
            d dVarD = this.f569a.d(i10);
            if (dVarD == null) {
                return null;
            }
            return dVarD.T0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i10, int i11, Bundle bundle) {
            return this.f569a.f(i10, i11, bundle);
        }
    }

    static class b extends a {
        b(e eVar) {
            super(eVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f569a.a(i10, d.U0(accessibilityNodeInfo), str, bundle);
        }
    }

    public e() {
        this.f568a = new b(this);
    }

    public void a(int i10, d dVar, String str, Bundle bundle) {
    }

    public d b(int i10) {
        return null;
    }

    public List c(String str, int i10) {
        return null;
    }

    public d d(int i10) {
        return null;
    }

    public Object e() {
        return this.f568a;
    }

    public boolean f(int i10, int i11, Bundle bundle) {
        return false;
    }

    public e(Object obj) {
        this.f568a = obj;
    }
}
