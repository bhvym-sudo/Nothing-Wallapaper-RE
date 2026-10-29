package p161q0;

import android.app.RemoteInput;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    static class a {
        public static RemoteInput a(p pVar) {
            throw null;
        }
    }

    static RemoteInput a(p pVar) {
        return a.a(pVar);
    }

    static RemoteInput[] b(p[] pVarArr) {
        if (pVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[pVarArr.length];
        for (int i10 = 0; i10 < pVarArr.length; i10++) {
            p pVar = pVarArr[i10];
            remoteInputArr[i10] = a(null);
        }
        return remoteInputArr;
    }
}
