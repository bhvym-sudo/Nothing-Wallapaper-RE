package K1;

import android.content.Context;
import p074h3.A;

/* JADX INFO: loaded from: classes.dex */
public class c extends A implements b {
    public c(Context context) {
        super(context);
    }

    @Override // K1.b
    public void f0(boolean z9) {
        s0().edit().putBoolean("themepicker_themed_icon_enabled", z9).apply();
    }

    @Override // K1.b
    public boolean n() {
        return s0().getBoolean("themepicker_themed_icon_enabled", false);
    }
}
