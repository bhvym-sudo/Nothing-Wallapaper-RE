package p171r0;

import B0.d;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Process;
import p181s0.h;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f25614a = new Object();

    /* JADX INFO: renamed from: r0.a$a, reason: collision with other inner class name */
    static class C0649a {
        static Drawable a(Context context, int i10) {
            return context.getDrawable(i10);
        }
    }

    static class b {
        static int a(Context context, int i10) {
            return context.getColor(i10);
        }

        static Object b(Context context, Class cls) {
            return context.getSystemService(cls);
        }
    }

    public static int a(Context context, String str) {
        d.d(str, "permission must be non-null");
        return context.checkPermission(str, Process.myPid(), Process.myUid());
    }

    public static int b(Context context, int i10) {
        return b.a(context, i10);
    }

    public static ColorStateList c(Context context, int i10) {
        return h.d(context.getResources(), i10, context.getTheme());
    }

    public static Drawable d(Context context, int i10) {
        return C0649a.a(context, i10);
    }

    public static Object e(Context context, Class cls) {
        return b.b(context, cls);
    }

    public static boolean f(Context context, Intent[] intentArr, Bundle bundle) {
        context.startActivities(intentArr, bundle);
        return true;
    }

    public static void g(Context context, Intent intent, Bundle bundle) {
        context.startActivity(intent, bundle);
    }
}
