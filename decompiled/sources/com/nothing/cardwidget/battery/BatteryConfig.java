package com.nothing.cardwidget.battery;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.List;
import kotlin.jvm.internal.n;
import p079h8.q;
import p079h8.r;
import p089i8.AbstractC1444s;
import p149o8.a;
import p149o8.b;
import p181s0.h;

/* JADX INFO: loaded from: classes2.dex */
public final class BatteryConfig {
    public static final double ALPHA_BATTERY_PROGRESSBAR = 102.0d;
    public static final float CARD_DEFAULT_HEIGHT = 172.0f;
    public static final String DEFAULT_PACKAGE_NAME = "com.nothing.hearthstone";
    public static final long DURATION_CHARGING_ANIMATION = 400;
    public static final long DURATION_DEBOUNCE_UPDATE_INDICATOR = 800;
    public static final long DURATION_TASK_AWAITING = 30000;
    public static final BatteryConfig INSTANCE = new BatteryConfig();
    public static final int LOW_BATTERY = 20;
    public static final float SIZE_BROADER_AOD = 1.0f;
    public static final int SIZE_DEVICE_ICON_HEIGHT = 30;
    public static final int SIZE_DEVICE_ICON_WIDTH = 50;
    public static final int SIZE_INDICATOR = 16;
    public static final int SIZE_ITEM_CONTAINER = 70;
    public static final float SIZE_LEVEL_TEXT = 76.0f;
    public static final int SIZE_MARGIN_10DP = 10;
    public static final int SIZE_MARGIN_16DP = 16;
    public static final int SIZE_MARGIN_3DP = 3;
    public static final int SIZE_MARGIN_48DP = 48;
    public static final int SIZE_MARGIN_4DP = 4;
    public static final int SIZE_MARGIN_6DP = 6;
    public static final float SIZE_NO_PERMISSION_TEXT = 51.0f;
    public static final int SIZE_PERMISSION_HEIGHT = 32;
    public static final int SIZE_PERMISSION_WIDTH = 18;
    public static final float SMALL_1x1_HEIGHT = 72.0f;
    public static final float VALUE_DEVICE_TRANSLATION_Y = -22.0f;

    public enum BatteryState {
        INIT_IN_CASE,
        OUT_OF_CASE,
        OUT_OF_CASE_COUNTING,
        NORMAL;

        private static final /* synthetic */ a $ENTRIES = b.a(values());

        public static a getEntries() {
            return $ENTRIES;
        }
    }

    private BatteryConfig() {
    }

    public final Drawable getDeviceIcon(M5.a aVar, Context context, boolean z9) {
        Object objB;
        n.h(aVar, "<this>");
        n.h(context, "context");
        try {
            q.a aVar2 = q.f21862r;
            Resources resourcesForApplication = context.getPackageManager().getResourcesForApplication(DEFAULT_PACKAGE_NAME);
            n.g(resourcesForApplication, "getResourcesForApplication(...)");
            List listI = aVar.i();
            objB = q.b(h.e(resourcesForApplication, resourcesForApplication.getIdentifier(String.valueOf(listI != null ? (Integer) AbstractC1444s.V(listI, INSTANCE.toInt(z9)) : null), "drawable", DEFAULT_PACKAGE_NAME), null));
        } catch (Throwable th) {
            q.a aVar3 = q.f21862r;
            objB = q.b(r.a(th));
        }
        return (Drawable) (q.f(objB) ? null : objB);
    }

    public final boolean isLowBattery(M5.a aVar) {
        n.h(aVar, "<this>");
        if (n.d(aVar.b(), "LOW")) {
            return true;
        }
        return n.d(aVar.b(), "NORMAL") && aVar.l() <= 20;
    }

    public final int toInt(boolean z9) {
        return z9 ? 1 : 0;
    }
}
