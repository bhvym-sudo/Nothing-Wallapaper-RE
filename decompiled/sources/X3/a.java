package X3;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import p025c4.AbstractC1202p;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Lock f8977c = new ReentrantLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static a f8978d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Lock f8979a = new ReentrantLock();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SharedPreferences f8980b;

    a(Context context) {
        this.f8980b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static a a(Context context) {
        AbstractC1202p.i(context);
        f8977c.lock();
        try {
            if (f8978d == null) {
                f8978d = new a(context.getApplicationContext());
            }
            return f8978d;
        } finally {
            f8977c.unlock();
        }
    }

    private static final String d(String str, String str2) {
        return str + ":" + str2;
    }

    public GoogleSignInAccount b() {
        String strC;
        String strC2 = c("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(strC2) && (strC = c(d("googleSignInAccount", strC2))) != null) {
            try {
                return GoogleSignInAccount.m(strC);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    protected final String c(String str) {
        this.f8979a.lock();
        try {
            return this.f8980b.getString(str, null);
        } finally {
            this.f8979a.unlock();
        }
    }
}
