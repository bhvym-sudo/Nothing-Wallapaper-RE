package com.nothing.cardwidget.battery;

import J5.a;
import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.nothing.cardwidget.R;
import java.util.Map;
import kotlin.jvm.internal.n;
import p079h8.v;
import p089i8.N;

/* JADX INFO: loaded from: classes2.dex */
public final class AttributeHelper {
    private Animator animBatteryEnter;
    private Animator animBatteryExit;
    private Animator animChargingEnter;
    private Animator animChargingExit;
    private Animator animDeviceEnter;
    private Animator animDeviceExit;
    private Drawable aodPermissionDrawable;
    private Integer batteryLevelTvColor;
    private Drawable chargingDrawable;
    private Boolean isAod = Boolean.FALSE;
    private Integer lowBatteryLevelColor;
    private Integer normalLevelColor;
    private Drawable permissionBgDrawable;
    private String permissionStr;
    private Integer permissionTvColor;
    private Drawable powerSaveDrawable;

    public final Animator getAnimBatteryEnter() {
        return this.animBatteryEnter;
    }

    public final Animator getAnimBatteryExit() {
        return this.animBatteryExit;
    }

    public final Animator getAnimChargingEnter() {
        return this.animChargingEnter;
    }

    public final Animator getAnimChargingExit() {
        return this.animChargingExit;
    }

    public final Animator getAnimDeviceEnter() {
        return this.animDeviceEnter;
    }

    public final Animator getAnimDeviceExit() {
        return this.animDeviceExit;
    }

    public final Drawable getAodPermissionDrawable() {
        return this.aodPermissionDrawable;
    }

    public final Integer getBatteryLevelTvColor() {
        return this.batteryLevelTvColor;
    }

    public final Drawable getChargingDrawable() {
        return this.chargingDrawable;
    }

    public final Integer getLowBatteryLevelColor() {
        return this.lowBatteryLevelColor;
    }

    public final Integer getNormalLevelColor() {
        return this.normalLevelColor;
    }

    public final Drawable getPermissionBgDrawable() {
        return this.permissionBgDrawable;
    }

    public final String getPermissionStr() {
        return this.permissionStr;
    }

    public final Integer getPermissionTvColor() {
        return this.permissionTvColor;
    }

    public final Drawable getPowerSaveDrawable() {
        return this.powerSaveDrawable;
    }

    public final void getRemoteResource(AttributeSet attributeSet, Context context) {
        n.h(context, "context");
        a.C0120a c0120a = a.f3535a;
        for (Map.Entry entry : c0120a.k(attributeSet, N.i(v.a(Integer.valueOf(c0120a.c(context, "permissionStr")), Integer.valueOf(R.attr.permissionStr)), v.a(Integer.valueOf(c0120a.c(context, "isAod")), Integer.valueOf(R.attr.isAod)), v.a(Integer.valueOf(c0120a.c(context, "animChargingEnter")), Integer.valueOf(R.attr.animChargingEnter)), v.a(Integer.valueOf(c0120a.c(context, "animChargingExit")), Integer.valueOf(R.attr.animChargingExit)), v.a(Integer.valueOf(c0120a.c(context, "animDeviceEnter")), Integer.valueOf(R.attr.animDeviceEnter)), v.a(Integer.valueOf(c0120a.c(context, "animDeviceExit")), Integer.valueOf(R.attr.animDeviceExit)), v.a(Integer.valueOf(c0120a.c(context, "animBatteryEnter")), Integer.valueOf(R.attr.animBatteryEnter)), v.a(Integer.valueOf(c0120a.c(context, "animBatteryExit")), Integer.valueOf(R.attr.animBatteryExit)), v.a(Integer.valueOf(c0120a.c(context, "aodPermissionDrawable")), Integer.valueOf(R.attr.aodPermissionDrawable)), v.a(Integer.valueOf(c0120a.c(context, "chargingDrawable")), Integer.valueOf(R.attr.chargingDrawable)), v.a(Integer.valueOf(c0120a.c(context, "powerSaveDrawable")), Integer.valueOf(R.attr.powerSaveDrawable)), v.a(Integer.valueOf(c0120a.c(context, "permissionBgDrawable")), Integer.valueOf(R.attr.permissionBgDrawable)), v.a(Integer.valueOf(c0120a.c(context, "normalLevelColor")), Integer.valueOf(R.attr.normalLevelColor)), v.a(Integer.valueOf(c0120a.c(context, "lowBatteryLevelColor")), Integer.valueOf(R.attr.lowBatteryLevelColor)), v.a(Integer.valueOf(c0120a.c(context, "batteryLevelTvColor")), Integer.valueOf(R.attr.batteryLevelTvColor)), v.a(Integer.valueOf(c0120a.c(context, "permissionTvColor")), Integer.valueOf(R.attr.permissionTvColor)))).entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            if (iIntValue == R.attr.permissionStr) {
                this.permissionStr = attributeSet != null ? a.f3535a.j(context, attributeSet, ((Number) entry.getValue()).intValue()) : null;
            } else if (iIntValue == R.attr.isAod) {
                this.isAod = attributeSet != null ? Boolean.valueOf(a.f3535a.d(context, attributeSet, ((Number) entry.getValue()).intValue(), false)) : null;
            } else if (iIntValue == R.attr.animChargingEnter) {
                this.animChargingEnter = attributeSet != null ? a.f3535a.b(context, attributeSet, ((Number) entry.getValue()).intValue()) : null;
            } else if (iIntValue == R.attr.animChargingExit) {
                this.animChargingExit = attributeSet != null ? a.f3535a.b(context, attributeSet, ((Number) entry.getValue()).intValue()) : null;
            } else if (iIntValue == R.attr.animDeviceEnter) {
                this.animDeviceEnter = attributeSet != null ? a.f3535a.b(context, attributeSet, ((Number) entry.getValue()).intValue()) : null;
            } else if (iIntValue == R.attr.animDeviceExit) {
                this.animDeviceExit = attributeSet != null ? a.f3535a.b(context, attributeSet, ((Number) entry.getValue()).intValue()) : null;
            } else if (iIntValue == R.attr.animBatteryEnter) {
                this.animBatteryEnter = attributeSet != null ? a.f3535a.b(context, attributeSet, ((Number) entry.getValue()).intValue()) : null;
            } else if (iIntValue == R.attr.animBatteryExit) {
                this.animBatteryExit = attributeSet != null ? a.f3535a.b(context, attributeSet, ((Number) entry.getValue()).intValue()) : null;
            } else if (iIntValue == R.attr.aodPermissionDrawable) {
                this.aodPermissionDrawable = attributeSet != null ? a.f3535a.g(context, attributeSet, ((Number) entry.getValue()).intValue()) : null;
            } else if (iIntValue == R.attr.chargingDrawable) {
                this.chargingDrawable = attributeSet != null ? a.f3535a.g(context, attributeSet, ((Number) entry.getValue()).intValue()) : null;
            } else if (iIntValue == R.attr.powerSaveDrawable) {
                this.powerSaveDrawable = attributeSet != null ? a.f3535a.g(context, attributeSet, ((Number) entry.getValue()).intValue()) : null;
            } else if (iIntValue == R.attr.permissionBgDrawable) {
                this.permissionBgDrawable = attributeSet != null ? a.f3535a.g(context, attributeSet, ((Number) entry.getValue()).intValue()) : null;
            } else if (iIntValue == R.attr.normalLevelColor) {
                this.normalLevelColor = attributeSet != null ? Integer.valueOf(a.f3535a.e(context, attributeSet, ((Number) entry.getValue()).intValue())) : null;
            } else if (iIntValue == R.attr.lowBatteryLevelColor) {
                this.lowBatteryLevelColor = attributeSet != null ? Integer.valueOf(a.f3535a.e(context, attributeSet, ((Number) entry.getValue()).intValue())) : null;
            } else if (iIntValue == R.attr.batteryLevelTvColor) {
                this.batteryLevelTvColor = attributeSet != null ? Integer.valueOf(a.f3535a.e(context, attributeSet, ((Number) entry.getValue()).intValue())) : null;
            } else if (iIntValue == R.attr.permissionTvColor) {
                this.permissionTvColor = attributeSet != null ? Integer.valueOf(a.f3535a.e(context, attributeSet, ((Number) entry.getValue()).intValue())) : null;
            }
        }
    }

    public final Boolean isAod() {
        return this.isAod;
    }

    public final void setAnimBatteryEnter(Animator animator) {
        this.animBatteryEnter = animator;
    }

    public final void setAnimBatteryExit(Animator animator) {
        this.animBatteryExit = animator;
    }

    public final void setAnimChargingEnter(Animator animator) {
        this.animChargingEnter = animator;
    }

    public final void setAnimChargingExit(Animator animator) {
        this.animChargingExit = animator;
    }

    public final void setAnimDeviceEnter(Animator animator) {
        this.animDeviceEnter = animator;
    }

    public final void setAnimDeviceExit(Animator animator) {
        this.animDeviceExit = animator;
    }

    public final void setAod(Boolean bool) {
        this.isAod = bool;
    }

    public final void setAodPermissionDrawable(Drawable drawable) {
        this.aodPermissionDrawable = drawable;
    }

    public final void setBatteryLevelTvColor(Integer num) {
        this.batteryLevelTvColor = num;
    }

    public final void setChargingDrawable(Drawable drawable) {
        this.chargingDrawable = drawable;
    }

    public final void setLowBatteryLevelColor(Integer num) {
        this.lowBatteryLevelColor = num;
    }

    public final void setNormalLevelColor(Integer num) {
        this.normalLevelColor = num;
    }

    public final void setPermissionBgDrawable(Drawable drawable) {
        this.permissionBgDrawable = drawable;
    }

    public final void setPermissionStr(String str) {
        this.permissionStr = str;
    }

    public final void setPermissionTvColor(Integer num) {
        this.permissionTvColor = num;
    }

    public final void setPowerSaveDrawable(Drawable drawable) {
        this.powerSaveDrawable = drawable;
    }
}
