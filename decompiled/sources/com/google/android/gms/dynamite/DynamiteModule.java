package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.util.DynamiteApi;
import dalvik.system.DelegateLastClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import javax.annotation.concurrent.GuardedBy;
import p025c4.AbstractC1201o;
import p025c4.AbstractC1202p;

/* JADX INFO: loaded from: classes.dex */
public final class DynamiteModule {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static Boolean f16333h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static String f16334i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static boolean f16335j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f16336k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static Boolean f16337l;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static l f16342q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static m f16343r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f16344a;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final ThreadLocal f16338m = new ThreadLocal();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ThreadLocal f16339n = new com.google.android.gms.dynamite.a();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final b.a f16340o = new com.google.android.gms.dynamite.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f16327b = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f16328c = new d();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f16329d = new e();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f16330e = new f();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f16331f = new g();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f16332g = new h();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final b f16341p = new i();

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {

        @GuardedBy("DynamiteLoaderClassLoader.class")
        public static ClassLoader sClassLoader;
    }

    public static class a extends Exception {
        /* synthetic */ a(String str, p125m4.d dVar) {
            super(str);
        }

        /* synthetic */ a(String str, Throwable th, p125m4.d dVar) {
            super(str, th);
        }
    }

    public interface b {

        public interface a {
            int a(Context context, String str, boolean z9);

            int b(Context context, String str);
        }

        /* JADX INFO: renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b, reason: collision with other inner class name */
        public static class C0456b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f16345a = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f16346b = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f16347c = 0;
        }

        C0456b a(Context context, String str, a aVar);
    }

    private DynamiteModule(Context context) {
        AbstractC1202p.i(context);
        this.f16344a = context;
    }

    public static int a(Context context, String str) {
        try {
            Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (AbstractC1201o.a(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e10) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e10.getMessage())));
            return 0;
        }
    }

    public static int b(Context context, String str) {
        return e(context, str, false);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:105:0x01f0 A[Catch: all -> 0x0114, a -> 0x0117, RemoteException -> 0x011a, TRY_ENTER, TryCatch #8 {RemoteException -> 0x011a, a -> 0x0117, all -> 0x0114, blocks: (B:32:0x00a1, B:38:0x00ad, B:40:0x00b4, B:41:0x00d4, B:45:0x00da, B:47:0x00e2, B:49:0x00e8, B:50:0x00f3, B:58:0x0100, B:66:0x0130, B:68:0x0138, B:69:0x013f, B:70:0x0148, B:65:0x011d, B:73:0x014b, B:74:0x014c, B:75:0x0154, B:76:0x0155, B:77:0x015d, B:80:0x0160, B:81:0x0161, B:83:0x0185, B:85:0x018c, B:87:0x0194, B:93:0x01cd, B:95:0x01d3, B:105:0x01f0, B:106:0x01f8, B:88:0x01a3, B:89:0x01ab, B:91:0x01ae, B:92:0x01be, B:107:0x01f9, B:108:0x0201, B:109:0x0202, B:110:0x020a, B:116:0x0217), top: B:164:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x01f9 A[Catch: all -> 0x0114, a -> 0x0117, RemoteException -> 0x011a, TryCatch #8 {RemoteException -> 0x011a, a -> 0x0117, all -> 0x0114, blocks: (B:32:0x00a1, B:38:0x00ad, B:40:0x00b4, B:41:0x00d4, B:45:0x00da, B:47:0x00e2, B:49:0x00e8, B:50:0x00f3, B:58:0x0100, B:66:0x0130, B:68:0x0138, B:69:0x013f, B:70:0x0148, B:65:0x011d, B:73:0x014b, B:74:0x014c, B:75:0x0154, B:76:0x0155, B:77:0x015d, B:80:0x0160, B:81:0x0161, B:83:0x0185, B:85:0x018c, B:87:0x0194, B:93:0x01cd, B:95:0x01d3, B:105:0x01f0, B:106:0x01f8, B:88:0x01a3, B:89:0x01ab, B:91:0x01ae, B:92:0x01be, B:107:0x01f9, B:108:0x0201, B:109:0x0202, B:110:0x020a, B:116:0x0217), top: B:164:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x0202 A[Catch: all -> 0x0114, a -> 0x0117, RemoteException -> 0x011a, TryCatch #8 {RemoteException -> 0x011a, a -> 0x0117, all -> 0x0114, blocks: (B:32:0x00a1, B:38:0x00ad, B:40:0x00b4, B:41:0x00d4, B:45:0x00da, B:47:0x00e2, B:49:0x00e8, B:50:0x00f3, B:58:0x0100, B:66:0x0130, B:68:0x0138, B:69:0x013f, B:70:0x0148, B:65:0x011d, B:73:0x014b, B:74:0x014c, B:75:0x0154, B:76:0x0155, B:77:0x015d, B:80:0x0160, B:81:0x0161, B:83:0x0185, B:85:0x018c, B:87:0x0194, B:93:0x01cd, B:95:0x01d3, B:105:0x01f0, B:106:0x01f8, B:88:0x01a3, B:89:0x01ab, B:91:0x01ae, B:92:0x01be, B:107:0x01f9, B:108:0x0201, B:109:0x0202, B:110:0x020a, B:116:0x0217), top: B:164:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x020d A[Catch: all -> 0x020b, TRY_ENTER, TryCatch #5 {, blocks: (B:33:0x00a2, B:35:0x00a8, B:36:0x00aa, B:113:0x020d, B:114:0x0215), top: B:159:0x00a2 }] */
    /* JADX WARN: Code duplicated, block: B:140:0x0286 A[Catch: all -> 0x0075, TryCatch #2 {all -> 0x0075, blocks: (B:5:0x003a, B:9:0x006f, B:16:0x007b, B:19:0x0081, B:30:0x009d, B:117:0x0218, B:118:0x0223, B:121:0x0226, B:122:0x0227, B:123:0x022f, B:140:0x0286, B:141:0x029d, B:124:0x0230, B:126:0x024e, B:128:0x025d, B:138:0x027d, B:139:0x0285, B:142:0x029e, B:143:0x02ce), top: B:155:0x003a, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:158:0x009d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x00a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x00d5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x0081 A[Catch: all -> 0x0075, TRY_LEAVE, TryCatch #2 {all -> 0x0075, blocks: (B:5:0x003a, B:9:0x006f, B:16:0x007b, B:19:0x0081, B:30:0x009d, B:117:0x0218, B:118:0x0223, B:121:0x0226, B:122:0x0227, B:123:0x022f, B:140:0x0286, B:141:0x029d, B:124:0x0230, B:126:0x024e, B:128:0x025d, B:138:0x027d, B:139:0x0285, B:142:0x029e, B:143:0x02ce), top: B:155:0x003a, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0089  */
    /* JADX WARN: Code duplicated, block: B:23:0x008d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0094  */
    /* JADX WARN: Code duplicated, block: B:29:0x009b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a8 A[Catch: all -> 0x020b, TryCatch #5 {, blocks: (B:33:0x00a2, B:35:0x00a8, B:36:0x00aa, B:113:0x020d, B:114:0x0215), top: B:159:0x00a2 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ad A[Catch: all -> 0x0114, a -> 0x0117, RemoteException -> 0x011a, TRY_ENTER, TryCatch #8 {RemoteException -> 0x011a, a -> 0x0117, all -> 0x0114, blocks: (B:32:0x00a1, B:38:0x00ad, B:40:0x00b4, B:41:0x00d4, B:45:0x00da, B:47:0x00e2, B:49:0x00e8, B:50:0x00f3, B:58:0x0100, B:66:0x0130, B:68:0x0138, B:69:0x013f, B:70:0x0148, B:65:0x011d, B:73:0x014b, B:74:0x014c, B:75:0x0154, B:76:0x0155, B:77:0x015d, B:80:0x0160, B:81:0x0161, B:83:0x0185, B:85:0x018c, B:87:0x0194, B:93:0x01cd, B:95:0x01d3, B:105:0x01f0, B:106:0x01f8, B:88:0x01a3, B:89:0x01ab, B:91:0x01ae, B:92:0x01be, B:107:0x01f9, B:108:0x0201, B:109:0x0202, B:110:0x020a, B:116:0x0217), top: B:164:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00b4 A[Catch: all -> 0x0114, a -> 0x0117, RemoteException -> 0x011a, TryCatch #8 {RemoteException -> 0x011a, a -> 0x0117, all -> 0x0114, blocks: (B:32:0x00a1, B:38:0x00ad, B:40:0x00b4, B:41:0x00d4, B:45:0x00da, B:47:0x00e2, B:49:0x00e8, B:50:0x00f3, B:58:0x0100, B:66:0x0130, B:68:0x0138, B:69:0x013f, B:70:0x0148, B:65:0x011d, B:73:0x014b, B:74:0x014c, B:75:0x0154, B:76:0x0155, B:77:0x015d, B:80:0x0160, B:81:0x0161, B:83:0x0185, B:85:0x018c, B:87:0x0194, B:93:0x01cd, B:95:0x01d3, B:105:0x01f0, B:106:0x01f8, B:88:0x01a3, B:89:0x01ab, B:91:0x01ae, B:92:0x01be, B:107:0x01f9, B:108:0x0201, B:109:0x0202, B:110:0x020a, B:116:0x0217), top: B:164:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00da A[Catch: all -> 0x0114, a -> 0x0117, RemoteException -> 0x011a, TRY_ENTER, TryCatch #8 {RemoteException -> 0x011a, a -> 0x0117, all -> 0x0114, blocks: (B:32:0x00a1, B:38:0x00ad, B:40:0x00b4, B:41:0x00d4, B:45:0x00da, B:47:0x00e2, B:49:0x00e8, B:50:0x00f3, B:58:0x0100, B:66:0x0130, B:68:0x0138, B:69:0x013f, B:70:0x0148, B:65:0x011d, B:73:0x014b, B:74:0x014c, B:75:0x0154, B:76:0x0155, B:77:0x015d, B:80:0x0160, B:81:0x0161, B:83:0x0185, B:85:0x018c, B:87:0x0194, B:93:0x01cd, B:95:0x01d3, B:105:0x01f0, B:106:0x01f8, B:88:0x01a3, B:89:0x01ab, B:91:0x01ae, B:92:0x01be, B:107:0x01f9, B:108:0x0201, B:109:0x0202, B:110:0x020a, B:116:0x0217), top: B:164:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0155 A[Catch: all -> 0x0114, a -> 0x0117, RemoteException -> 0x011a, TryCatch #8 {RemoteException -> 0x011a, a -> 0x0117, all -> 0x0114, blocks: (B:32:0x00a1, B:38:0x00ad, B:40:0x00b4, B:41:0x00d4, B:45:0x00da, B:47:0x00e2, B:49:0x00e8, B:50:0x00f3, B:58:0x0100, B:66:0x0130, B:68:0x0138, B:69:0x013f, B:70:0x0148, B:65:0x011d, B:73:0x014b, B:74:0x014c, B:75:0x0154, B:76:0x0155, B:77:0x015d, B:80:0x0160, B:81:0x0161, B:83:0x0185, B:85:0x018c, B:87:0x0194, B:93:0x01cd, B:95:0x01d3, B:105:0x01f0, B:106:0x01f8, B:88:0x01a3, B:89:0x01ab, B:91:0x01ae, B:92:0x01be, B:107:0x01f9, B:108:0x0201, B:109:0x0202, B:110:0x020a, B:116:0x0217), top: B:164:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0161 A[Catch: all -> 0x0114, a -> 0x0117, RemoteException -> 0x011a, TryCatch #8 {RemoteException -> 0x011a, a -> 0x0117, all -> 0x0114, blocks: (B:32:0x00a1, B:38:0x00ad, B:40:0x00b4, B:41:0x00d4, B:45:0x00da, B:47:0x00e2, B:49:0x00e8, B:50:0x00f3, B:58:0x0100, B:66:0x0130, B:68:0x0138, B:69:0x013f, B:70:0x0148, B:65:0x011d, B:73:0x014b, B:74:0x014c, B:75:0x0154, B:76:0x0155, B:77:0x015d, B:80:0x0160, B:81:0x0161, B:83:0x0185, B:85:0x018c, B:87:0x0194, B:93:0x01cd, B:95:0x01d3, B:105:0x01f0, B:106:0x01f8, B:88:0x01a3, B:89:0x01ab, B:91:0x01ae, B:92:0x01be, B:107:0x01f9, B:108:0x0201, B:109:0x0202, B:110:0x020a, B:116:0x0217), top: B:164:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0185 A[Catch: all -> 0x0114, a -> 0x0117, RemoteException -> 0x011a, TryCatch #8 {RemoteException -> 0x011a, a -> 0x0117, all -> 0x0114, blocks: (B:32:0x00a1, B:38:0x00ad, B:40:0x00b4, B:41:0x00d4, B:45:0x00da, B:47:0x00e2, B:49:0x00e8, B:50:0x00f3, B:58:0x0100, B:66:0x0130, B:68:0x0138, B:69:0x013f, B:70:0x0148, B:65:0x011d, B:73:0x014b, B:74:0x014c, B:75:0x0154, B:76:0x0155, B:77:0x015d, B:80:0x0160, B:81:0x0161, B:83:0x0185, B:85:0x018c, B:87:0x0194, B:93:0x01cd, B:95:0x01d3, B:105:0x01f0, B:106:0x01f8, B:88:0x01a3, B:89:0x01ab, B:91:0x01ae, B:92:0x01be, B:107:0x01f9, B:108:0x0201, B:109:0x0202, B:110:0x020a, B:116:0x0217), top: B:164:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x018c A[Catch: all -> 0x0114, a -> 0x0117, RemoteException -> 0x011a, TryCatch #8 {RemoteException -> 0x011a, a -> 0x0117, all -> 0x0114, blocks: (B:32:0x00a1, B:38:0x00ad, B:40:0x00b4, B:41:0x00d4, B:45:0x00da, B:47:0x00e2, B:49:0x00e8, B:50:0x00f3, B:58:0x0100, B:66:0x0130, B:68:0x0138, B:69:0x013f, B:70:0x0148, B:65:0x011d, B:73:0x014b, B:74:0x014c, B:75:0x0154, B:76:0x0155, B:77:0x015d, B:80:0x0160, B:81:0x0161, B:83:0x0185, B:85:0x018c, B:87:0x0194, B:93:0x01cd, B:95:0x01d3, B:105:0x01f0, B:106:0x01f8, B:88:0x01a3, B:89:0x01ab, B:91:0x01ae, B:92:0x01be, B:107:0x01f9, B:108:0x0201, B:109:0x0202, B:110:0x020a, B:116:0x0217), top: B:164:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0194 A[Catch: all -> 0x0114, a -> 0x0117, RemoteException -> 0x011a, TryCatch #8 {RemoteException -> 0x011a, a -> 0x0117, all -> 0x0114, blocks: (B:32:0x00a1, B:38:0x00ad, B:40:0x00b4, B:41:0x00d4, B:45:0x00da, B:47:0x00e2, B:49:0x00e8, B:50:0x00f3, B:58:0x0100, B:66:0x0130, B:68:0x0138, B:69:0x013f, B:70:0x0148, B:65:0x011d, B:73:0x014b, B:74:0x014c, B:75:0x0154, B:76:0x0155, B:77:0x015d, B:80:0x0160, B:81:0x0161, B:83:0x0185, B:85:0x018c, B:87:0x0194, B:93:0x01cd, B:95:0x01d3, B:105:0x01f0, B:106:0x01f8, B:88:0x01a3, B:89:0x01ab, B:91:0x01ae, B:92:0x01be, B:107:0x01f9, B:108:0x0201, B:109:0x0202, B:110:0x020a, B:116:0x0217), top: B:164:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x01a3 A[Catch: all -> 0x0114, a -> 0x0117, RemoteException -> 0x011a, TryCatch #8 {RemoteException -> 0x011a, a -> 0x0117, all -> 0x0114, blocks: (B:32:0x00a1, B:38:0x00ad, B:40:0x00b4, B:41:0x00d4, B:45:0x00da, B:47:0x00e2, B:49:0x00e8, B:50:0x00f3, B:58:0x0100, B:66:0x0130, B:68:0x0138, B:69:0x013f, B:70:0x0148, B:65:0x011d, B:73:0x014b, B:74:0x014c, B:75:0x0154, B:76:0x0155, B:77:0x015d, B:80:0x0160, B:81:0x0161, B:83:0x0185, B:85:0x018c, B:87:0x0194, B:93:0x01cd, B:95:0x01d3, B:105:0x01f0, B:106:0x01f8, B:88:0x01a3, B:89:0x01ab, B:91:0x01ae, B:92:0x01be, B:107:0x01f9, B:108:0x0201, B:109:0x0202, B:110:0x020a, B:116:0x0217), top: B:164:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x01ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x01ae A[Catch: all -> 0x0114, a -> 0x0117, RemoteException -> 0x011a, TryCatch #8 {RemoteException -> 0x011a, a -> 0x0117, all -> 0x0114, blocks: (B:32:0x00a1, B:38:0x00ad, B:40:0x00b4, B:41:0x00d4, B:45:0x00da, B:47:0x00e2, B:49:0x00e8, B:50:0x00f3, B:58:0x0100, B:66:0x0130, B:68:0x0138, B:69:0x013f, B:70:0x0148, B:65:0x011d, B:73:0x014b, B:74:0x014c, B:75:0x0154, B:76:0x0155, B:77:0x015d, B:80:0x0160, B:81:0x0161, B:83:0x0185, B:85:0x018c, B:87:0x0194, B:93:0x01cd, B:95:0x01d3, B:105:0x01f0, B:106:0x01f8, B:88:0x01a3, B:89:0x01ab, B:91:0x01ae, B:92:0x01be, B:107:0x01f9, B:108:0x0201, B:109:0x0202, B:110:0x020a, B:116:0x0217), top: B:164:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x01be A[Catch: all -> 0x0114, a -> 0x0117, RemoteException -> 0x011a, TryCatch #8 {RemoteException -> 0x011a, a -> 0x0117, all -> 0x0114, blocks: (B:32:0x00a1, B:38:0x00ad, B:40:0x00b4, B:41:0x00d4, B:45:0x00da, B:47:0x00e2, B:49:0x00e8, B:50:0x00f3, B:58:0x0100, B:66:0x0130, B:68:0x0138, B:69:0x013f, B:70:0x0148, B:65:0x011d, B:73:0x014b, B:74:0x014c, B:75:0x0154, B:76:0x0155, B:77:0x015d, B:80:0x0160, B:81:0x0161, B:83:0x0185, B:85:0x018c, B:87:0x0194, B:93:0x01cd, B:95:0x01d3, B:105:0x01f0, B:106:0x01f8, B:88:0x01a3, B:89:0x01ab, B:91:0x01ae, B:92:0x01be, B:107:0x01f9, B:108:0x0201, B:109:0x0202, B:110:0x020a, B:116:0x0217), top: B:164:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x01d3 A[Catch: all -> 0x0114, a -> 0x0117, RemoteException -> 0x011a, TRY_LEAVE, TryCatch #8 {RemoteException -> 0x011a, a -> 0x0117, all -> 0x0114, blocks: (B:32:0x00a1, B:38:0x00ad, B:40:0x00b4, B:41:0x00d4, B:45:0x00da, B:47:0x00e2, B:49:0x00e8, B:50:0x00f3, B:58:0x0100, B:66:0x0130, B:68:0x0138, B:69:0x013f, B:70:0x0148, B:65:0x011d, B:73:0x014b, B:74:0x014c, B:75:0x0154, B:76:0x0155, B:77:0x015d, B:80:0x0160, B:81:0x0161, B:83:0x0185, B:85:0x018c, B:87:0x0194, B:93:0x01cd, B:95:0x01d3, B:105:0x01f0, B:106:0x01f8, B:88:0x01a3, B:89:0x01ab, B:91:0x01ae, B:92:0x01be, B:107:0x01f9, B:108:0x0201, B:109:0x0202, B:110:0x020a, B:116:0x0217), top: B:164:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x01de  */
    /* JADX WARN: Code duplicated, block: B:99:0x01e2  */
    /* JADX WARN: Instruction removed from duplicated block: B:140:0x0286, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:40:0x00b4, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:81:0x0161, please report this as an issue */
    public static DynamiteModule d(Context context, b bVar, String str) throws Throwable {
        long j9;
        int i10;
        Boolean bool;
        l lVarK;
        int iE;
        p115l4.a aVarZ;
        Object objE;
        DynamiteModule dynamiteModule;
        j jVar;
        Cursor cursor;
        m mVar;
        j jVar2;
        boolean z9;
        p115l4.a aVarE;
        Cursor cursor2;
        ThreadLocal threadLocal = f16338m;
        j jVar3 = (j) threadLocal.get();
        p125m4.d dVar = null;
        j jVar4 = new j(null);
        threadLocal.set(jVar4);
        ThreadLocal threadLocal2 = f16339n;
        Long l9 = (Long) threadLocal2.get();
        long jLongValue = l9.longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
            b.C0456b c0456bA = bVar.a(context, str, f16340o);
            j9 = 0;
            try {
                Log.i("DynamiteModule", "Considering local module " + str + ":" + c0456bA.f16345a + " and remote module " + str + ":" + c0456bA.f16346b);
                int i11 = c0456bA.f16347c;
                if (i11 != 0) {
                    if (i11 != -1) {
                        if (i11 == 1 || c0456bA.f16346b != 0) {
                            if (i11 == -1) {
                                DynamiteModule dynamiteModuleG = g(context, str);
                                if (jLongValue == 0) {
                                    threadLocal2.remove();
                                } else {
                                    threadLocal2.set(l9);
                                }
                                cursor2 = jVar4.f16348a;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                threadLocal.set(jVar3);
                                return dynamiteModuleG;
                            }
                            if (i11 == 1) {
                                throw new a("VersionPolicy returned invalid code:" + i11, null);
                            }
                            try {
                                i10 = c0456bA.f16346b;
                                try {
                                    synchronized (DynamiteModule.class) {
                                        if (j(context)) {
                                            throw new a("Remote loading disabled", null);
                                        }
                                        bool = f16333h;
                                    }
                                    if (bool != null) {
                                        throw new a("Failed to determine which loading route to use.", null);
                                    }
                                    if (bool.booleanValue()) {
                                        Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i10);
                                        synchronized (DynamiteModule.class) {
                                            mVar = f16343r;
                                        }
                                        if (mVar != null) {
                                            throw new a("DynamiteLoaderV2 was not cached.", null);
                                        }
                                        jVar2 = (j) threadLocal.get();
                                        if (jVar2 != null || jVar2.f16348a == null) {
                                            throw new a("No result cursor", null);
                                        }
                                        Context applicationContext = context.getApplicationContext();
                                        Cursor cursor3 = jVar2.f16348a;
                                        p115l4.b.X(null);
                                        synchronized (DynamiteModule.class) {
                                            z9 = f16336k >= 2;
                                        }
                                        if (z9) {
                                            Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                            aVarE = mVar.X(p115l4.b.X(applicationContext), str, i10, p115l4.b.X(cursor3));
                                        } else {
                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                            aVarE = mVar.e(p115l4.b.X(applicationContext), str, i10, p115l4.b.X(cursor3));
                                        }
                                        Context context2 = (Context) p115l4.b.e(aVarE);
                                        if (context2 == null) {
                                            throw new a("Failed to get module context", dVar);
                                        }
                                        dynamiteModule = new DynamiteModule(context2);
                                    } else {
                                        Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i10);
                                        lVarK = k(context);
                                        if (lVarK != null) {
                                            throw new a("Failed to create IDynamiteLoader.", null);
                                        }
                                        iE = lVarK.e();
                                        if (iE >= 3) {
                                            jVar = (j) threadLocal.get();
                                            if (jVar != null) {
                                                throw new a("No cached result cursor holder", null);
                                            }
                                            aVarZ = lVarK.a0(p115l4.b.X(context), str, i10, p115l4.b.X(jVar.f16348a));
                                        } else if (iE == 2) {
                                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                                            aVarZ = lVarK.b0(p115l4.b.X(context), str, i10);
                                        } else {
                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                            aVarZ = lVarK.Z(p115l4.b.X(context), str, i10);
                                        }
                                        objE = p115l4.b.e(aVarZ);
                                        if (objE != null) {
                                            throw new a("Failed to load remote module.", null);
                                        }
                                        dynamiteModule = new DynamiteModule((Context) objE);
                                    }
                                    if (jLongValue == 0) {
                                        threadLocal2.remove();
                                    } else {
                                        threadLocal2.set(l9);
                                    }
                                    cursor = jVar4.f16348a;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    threadLocal.set(jVar3);
                                    return dynamiteModule;
                                } catch (RemoteException e10) {
                                    throw new a("Failed to load remote module.", e10, null);
                                } catch (a e11) {
                                    throw e11;
                                } catch (Throwable th) {
                                    p085i4.c.a(context, th);
                                    throw new a("Failed to load remote module.", th, null);
                                }
                            } catch (a e12) {
                                Log.w("DynamiteModule", "Failed to load remote module: " + e12.getMessage());
                                int i12 = c0456bA.f16345a;
                                if (i12 == 0 || bVar.a(context, str, new k(i12, 0)).f16347c != -1) {
                                    throw new a("Remote load failed. No local fallback found.", e12, null);
                                }
                                DynamiteModule dynamiteModuleG2 = g(context, str);
                                if (jLongValue == 0) {
                                    f16339n.remove();
                                } else {
                                    f16339n.set(l9);
                                }
                                Cursor cursor4 = jVar4.f16348a;
                                if (cursor4 != null) {
                                    cursor4.close();
                                }
                                f16338m.set(jVar3);
                                return dynamiteModuleG2;
                            }
                        }
                    } else if (c0456bA.f16345a != 0) {
                        i11 = -1;
                        if (i11 == 1) {
                        }
                        if (i11 == -1) {
                            DynamiteModule dynamiteModuleG3 = g(context, str);
                            if (jLongValue == 0) {
                                threadLocal2.remove();
                            } else {
                                threadLocal2.set(l9);
                            }
                            cursor2 = jVar4.f16348a;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            threadLocal.set(jVar3);
                            return dynamiteModuleG3;
                        }
                        if (i11 == 1) {
                            throw new a("VersionPolicy returned invalid code:" + i11, null);
                        }
                        i10 = c0456bA.f16346b;
                        synchronized (DynamiteModule.class) {
                            if (j(context)) {
                                throw new a("Remote loading disabled", null);
                            }
                            bool = f16333h;
                            if (bool != null) {
                                throw new a("Failed to determine which loading route to use.", null);
                            }
                            if (bool.booleanValue()) {
                                Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i10);
                                synchronized (DynamiteModule.class) {
                                    mVar = f16343r;
                                    if (mVar != null) {
                                        throw new a("DynamiteLoaderV2 was not cached.", null);
                                    }
                                    jVar2 = (j) threadLocal.get();
                                    if (jVar2 != null) {
                                    }
                                    throw new a("No result cursor", null);
                                }
                            }
                            Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i10);
                            lVarK = k(context);
                            if (lVarK != null) {
                                throw new a("Failed to create IDynamiteLoader.", null);
                            }
                            iE = lVarK.e();
                            if (iE >= 3) {
                                jVar = (j) threadLocal.get();
                                if (jVar != null) {
                                    throw new a("No cached result cursor holder", null);
                                }
                                aVarZ = lVarK.a0(p115l4.b.X(context), str, i10, p115l4.b.X(jVar.f16348a));
                            } else if (iE == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2");
                                aVarZ = lVarK.b0(p115l4.b.X(context), str, i10);
                            } else {
                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                aVarZ = lVarK.Z(p115l4.b.X(context), str, i10);
                            }
                            objE = p115l4.b.e(aVarZ);
                            if (objE != null) {
                                throw new a("Failed to load remote module.", null);
                            }
                            dynamiteModule = new DynamiteModule((Context) objE);
                            if (jLongValue == 0) {
                                threadLocal2.remove();
                            } else {
                                threadLocal2.set(l9);
                            }
                            cursor = jVar4.f16348a;
                            if (cursor != null) {
                                cursor.close();
                            }
                            threadLocal.set(jVar3);
                            return dynamiteModule;
                        }
                    }
                }
                throw new a("No acceptable module " + str + " found. Local version is " + c0456bA.f16345a + " and remote version is " + c0456bA.f16346b + ".", null);
            } catch (Throwable th2) {
                th = th2;
                if (jLongValue == j9) {
                    f16339n.remove();
                } else {
                    f16339n.set(l9);
                }
                Cursor cursor5 = jVar4.f16348a;
                if (cursor5 != null) {
                    cursor5.close();
                }
                f16338m.set(jVar3);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            j9 = 0;
        }
    }

    /* JADX INFO: Removed unreachable split cross block B:132:0x01b0 */
    /* JADX WARN: Code duplicated, block: B:48:0x0098 A[Catch: all -> 0x0036, TryCatch #3 {all -> 0x0036, blocks: (B:9:0x0026, B:11:0x0032, B:49:0x00a1, B:16:0x003b, B:18:0x0041, B:20:0x0047, B:25:0x004e, B:27:0x0052, B:31:0x005c, B:33:0x0064, B:36:0x006b, B:40:0x0080, B:41:0x0088, B:39:0x0072, B:44:0x008b, B:47:0x008e, B:48:0x0098, B:17:0x003e), top: B:128:0x0026, inners: #9 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0161 A[Catch: all -> 0x00d0, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00d0, blocks: (B:3:0x0002, B:57:0x00c5, B:59:0x00cb, B:67:0x00f1, B:95:0x0153, B:99:0x0161, B:117:0x01b6, B:118:0x01b9, B:112:0x01ad, B:65:0x00d6, B:120:0x01bb, B:4:0x0003, B:7:0x0009, B:8:0x0025, B:55:0x00c2, B:21:0x0048, B:42:0x0089, B:45:0x008c, B:52:0x00a4, B:56:0x00c4, B:54:0x00a6), top: B:124:0x0002, inners: #4, #6 }] */
    public static int e(Context context, String str, boolean z9) {
        Throwable th;
        RemoteException remoteException;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = f16333h;
                Cursor cursor2 = null;
                int iX = 0;
                if (bool == null) {
                    try {
                        Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            try {
                                ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                                if (classLoader == ClassLoader.getSystemClassLoader()) {
                                    bool = Boolean.FALSE;
                                } else {
                                    if (classLoader == null) {
                                        if (!j(context)) {
                                            return 0;
                                        }
                                        if (f16335j) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                            bool = Boolean.FALSE;
                                        } else {
                                            Boolean bool2 = Boolean.TRUE;
                                            if (bool2.equals(null)) {
                                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                                bool = Boolean.FALSE;
                                            } else {
                                                try {
                                                    int iF = f(context, str, z9, true);
                                                    String str2 = f16334i;
                                                    if (str2 != null && !str2.isEmpty()) {
                                                        ClassLoader classLoaderA = p125m4.b.a();
                                                        if (classLoaderA == null) {
                                                            String str3 = f16334i;
                                                            AbstractC1202p.i(str3);
                                                            classLoaderA = new DelegateLastClassLoader(str3, ClassLoader.getSystemClassLoader());
                                                        }
                                                        h(classLoaderA);
                                                        declaredField.set(null, classLoaderA);
                                                        f16333h = bool2;
                                                        return iF;
                                                    }
                                                    return iF;
                                                } catch (a unused) {
                                                    declaredField.set(null, ClassLoader.getSystemClassLoader());
                                                    bool = Boolean.FALSE;
                                                }
                                            }
                                        }
                                        p085i4.c.a(context, th);
                                        throw th;
                                    }
                                    try {
                                        h(classLoader);
                                    } catch (a unused2) {
                                    }
                                    bool = Boolean.TRUE;
                                }
                                f16333h = bool;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e10) {
                        Log.w("DynamiteModule", "Failed to load module via V2: " + e10.toString());
                        bool = Boolean.FALSE;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return f(context, str, z9, false);
                    } catch (a e11) {
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e11.getMessage());
                        return 0;
                    }
                }
                l lVarK = k(context);
                try {
                    if (lVarK != null) {
                        try {
                            int iE = lVarK.e();
                            if (iE >= 3) {
                                j jVar = (j) f16338m.get();
                                if (jVar == null || (cursor = jVar.f16348a) == null) {
                                    Cursor cursor3 = (Cursor) p115l4.b.e(lVarK.c0(p115l4.b.X(context), str, z9, ((Long) f16339n.get()).longValue()));
                                    if (cursor3 != null) {
                                        try {
                                            if (cursor3.moveToFirst()) {
                                                int i10 = cursor3.getInt(0);
                                                cursor2 = (i10 <= 0 || !i(cursor3)) ? cursor3 : null;
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                                iX = i10;
                                            } else {
                                                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                                if (cursor3 != null) {
                                                    cursor3.close();
                                                }
                                            }
                                        } catch (RemoteException e12) {
                                            remoteException = e12;
                                            cursor2 = cursor3;
                                            Log.w("DynamiteModule", "Failed to retrieve remote module version: " + remoteException.getMessage());
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            cursor2 = cursor3;
                                            if (cursor2 == null) {
                                                throw th;
                                            }
                                            cursor2.close();
                                            throw th;
                                        }
                                    } else {
                                        Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                        if (cursor3 != null) {
                                            cursor3.close();
                                        }
                                    }
                                } else {
                                    iX = cursor.getInt(0);
                                }
                            } else if (iE == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                iX = lVarK.Y(p115l4.b.X(context), str, z9);
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                iX = lVarK.X(p115l4.b.X(context), str, z9);
                            }
                        } catch (RemoteException e13) {
                            remoteException = e13;
                        }
                    }
                    return iX;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        } catch (Throwable th5) {
            p085i4.c.a(context, th5);
            throw th5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:65:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    private static int f(Context context, String str, boolean z9, boolean z10) throws Throwable {
        Throwable th;
        Exception exc;
        ?? r9 = 0;
        ?? r10 = 0;
        ?? r11 = 0;
        ?? r12 = 0;
        try {
            try {
                boolean z11 = true;
                Cursor cursorQuery = context.getContentResolver().query(new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z9 ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartTime", String.valueOf(((Long) f16339n.get()).longValue())).build(), null, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            boolean z12 = false;
                            int i10 = cursorQuery.getInt(0);
                            if (i10 > 0) {
                                synchronized (DynamiteModule.class) {
                                    try {
                                        f16334i = cursorQuery.getString(2);
                                        int columnIndex = cursorQuery.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            f16336k = cursorQuery.getInt(columnIndex);
                                        }
                                        int columnIndex2 = cursorQuery.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            if (cursorQuery.getInt(columnIndex2) == 0) {
                                                z11 = false;
                                            }
                                            f16335j = z11;
                                            z12 = z11;
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                                if (i(cursorQuery)) {
                                    cursorQuery = null;
                                }
                            }
                            if (z10 && z12) {
                                throw new a("forcing fallback to container DynamiteLoader impl", r11 == true ? 1 : 0);
                            }
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            return i10;
                        }
                    } catch (Exception e10) {
                        exc = e10;
                        if (exc instanceof a) {
                            throw exc;
                        }
                        throw new a("V2 version check failed", exc, r10 == true ? 1 : 0);
                    }
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new a("Failed to connect to dynamite module ContentResolver.", r12 == true ? 1 : 0);
            } catch (Throwable th3) {
                th = th3;
                r9 = context;
                if (r9 != 0) {
                    throw th;
                }
                r9.close();
                throw th;
            }
        } catch (Exception e11) {
            exc = e11;
        } catch (Throwable th4) {
            th = th4;
            if (r9 != 0) {
                throw th;
            }
            r9.close();
            throw th;
        }
    }

    private static DynamiteModule g(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
        return new DynamiteModule(context.getApplicationContext());
    }

    private static void h(ClassLoader classLoader) throws a {
        m mVar;
        p125m4.d dVar = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                mVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                mVar = iInterfaceQueryLocalInterface instanceof m ? (m) iInterfaceQueryLocalInterface : new m(iBinder);
            }
            f16343r = mVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
            throw new a("Failed to instantiate dynamite loader", e10, dVar);
        }
    }

    private static boolean i(Cursor cursor) {
        j jVar = (j) f16338m.get();
        if (jVar == null || jVar.f16348a != null) {
            return false;
        }
        jVar.f16348a = cursor;
        return true;
    }

    private static boolean j(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f16337l)) {
            return true;
        }
        boolean z9 = false;
        if (f16337l == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (Z3.e.e().g(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z9 = true;
            }
            f16337l = Boolean.valueOf(z9);
            if (z9 && providerInfoResolveContentProvider != null && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f16335j = true;
            }
        }
        if (!z9) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z9;
    }

    private static l k(Context context) {
        l lVar;
        synchronized (DynamiteModule.class) {
            l lVar2 = f16342q;
            if (lVar2 != null) {
                return lVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    lVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    lVar = iInterfaceQueryLocalInterface instanceof l ? (l) iInterfaceQueryLocalInterface : new l(iBinder);
                }
                if (lVar != null) {
                    f16342q = lVar;
                    return lVar;
                }
            } catch (Exception e10) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e10.getMessage());
            }
            return null;
        }
    }

    public IBinder c(String str) throws a {
        try {
            return (IBinder) this.f16344a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e10) {
            throw new a("Failed to instantiate module class: ".concat(String.valueOf(str)), e10, null);
        }
    }
}
