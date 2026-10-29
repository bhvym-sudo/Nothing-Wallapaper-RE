package R0;

import android.text.Editable;
import androidx.emoji2.text.n;

/* JADX INFO: loaded from: classes.dex */
final class b extends Editable.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f6941a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile Editable.Factory f6942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Class f6943c;

    private b() {
        try {
            f6943c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f6942b == null) {
            synchronized (f6941a) {
                try {
                    if (f6942b == null) {
                        f6942b = new b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f6942b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(CharSequence charSequence) {
        Class cls = f6943c;
        return cls != null ? n.c(cls, charSequence) : super.newEditable(charSequence);
    }
}
