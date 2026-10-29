package p039d8;

import android.os.Process;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static short f19743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Hashtable f19744b = new Hashtable();

    public static synchronized int[] a(String str) {
        try {
            if (str == null) {
                d.a.d("SenderIdManager", "getSenderId, param == null");
                return null;
            }
            int[] iArr = (int[]) f19744b.get(str);
            if (iArr == null || 2 != iArr.length) {
                d.a.d("SenderIdManager", "getSenderId, param: " + str + " fail!");
                return null;
            }
            iArr[1] = ((short) (Math.abs((int) ((short) (((short) (iArr[1] & 65535)) + 1))) % 32767)) | (iArr[1] & (-65536));
            d.a.a("SenderIdManager", "getSenderId, tidAndTime:" + str + " pid:" + iArr[0] + ", gid:" + (iArr[1] & (-65536)) + ", seq:" + (iArr[1] & 65535));
            return iArr;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized void b(String str) {
        try {
            if (str == null) {
                d.a.d("SenderIdManager", "registerSender, param == null");
                return;
            }
            int iMyPid = Process.myPid();
            d.a.a("SenderIdManager", "registerSender groupId:" + ((int) f19743a));
            short s9 = (short) (f19743a + 1);
            f19743a = s9;
            short sAbs = (short) (Math.abs((int) s9) % 32767);
            f19743a = sAbs;
            int[] iArr = {iMyPid, sAbs << 16};
            d.a.a("SenderIdManager", "registerSender, tidAndTime:" + str + " senderId:" + iArr[0] + "," + iArr[1]);
            f19744b.put(str, iArr);
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized void c(String str) {
        try {
            if (str == null) {
                d.a.d("SenderIdManager", "registerSender, param == null");
            } else {
                f19744b.remove(str);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
