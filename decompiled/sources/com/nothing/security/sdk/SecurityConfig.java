package com.nothing.security.sdk;

import android.content.Context;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class SecurityConfig {
    public static final a Companion = new a(null);
    private final long nativeHandle;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    static {
        System.loadLibrary("securityJni");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SecurityConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final native long nativeInit(String str);

    public final native String fetchCustomData(Context context);

    public final native String fetchKey1(Context context);

    public final native String fetchKey2(Context context);

    public final native String fetchKey3(Context context);

    public final native String fetchKey4(Context context);

    public final native String fetchKey5(Context context);

    public SecurityConfig(String dir) {
        n.h(dir, "dir");
        this.nativeHandle = nativeInit(dir);
    }

    public /* synthetic */ SecurityConfig(String str, int i10, AbstractC1457h abstractC1457h) {
        this((i10 & 1) != 0 ? "" : str);
    }
}
