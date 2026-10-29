package com.nothing.wallpaper.effects.data.model;

import android.graphics.Point;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class ViewScope implements Parcelable {
    public static final Parcelable.Creator<ViewScope> CREATOR = new a();
    private final PointF center;
    private String reason;
    private final float scale;
    private final Point viewSize;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ViewScope createFromParcel(Parcel parcel) {
            n.h(parcel, "parcel");
            return new ViewScope(parcel.readFloat(), (PointF) parcel.readParcelable(ViewScope.class.getClassLoader()), (Point) parcel.readParcelable(ViewScope.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ViewScope[] newArray(int i10) {
            return new ViewScope[i10];
        }
    }

    public ViewScope(float f10, PointF center, Point viewSize) {
        n.h(center, "center");
        n.h(viewSize, "viewSize");
        this.scale = f10;
        this.center = center;
        this.viewSize = viewSize;
    }

    public static /* synthetic */ ViewScope copy$default(ViewScope viewScope, float f10, PointF pointF, Point point, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = viewScope.scale;
        }
        if ((i10 & 2) != 0) {
            pointF = viewScope.center;
        }
        if ((i10 & 4) != 0) {
            point = viewScope.viewSize;
        }
        return viewScope.copy(f10, pointF, point);
    }

    public final float component1() {
        return this.scale;
    }

    public final PointF component2() {
        return this.center;
    }

    public final Point component3() {
        return this.viewSize;
    }

    public final ViewScope copy(float f10, PointF center, Point viewSize) {
        n.h(center, "center");
        n.h(viewSize, "viewSize");
        return new ViewScope(f10, center, viewSize);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewScope)) {
            return false;
        }
        ViewScope viewScope = (ViewScope) obj;
        return Float.compare(this.scale, viewScope.scale) == 0 && n.d(this.center, viewScope.center) && n.d(this.viewSize, viewScope.viewSize);
    }

    public final PointF getCenter() {
        return this.center;
    }

    public final String getReason() {
        return this.reason;
    }

    public final float getScale() {
        return this.scale;
    }

    public final Point getViewSize() {
        return this.viewSize;
    }

    public int hashCode() {
        return (((Float.hashCode(this.scale) * 31) + this.center.hashCode()) * 31) + this.viewSize.hashCode();
    }

    public final void setReason(String str) {
        this.reason = str;
    }

    public String toString() {
        return "ViewScope(scale=" + this.scale + ", center=" + this.center + ", viewSize=" + this.viewSize + ", reason=" + this.reason + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        n.h(dest, "dest");
        dest.writeFloat(this.scale);
        dest.writeParcelable(this.center, i10);
        dest.writeParcelable(this.viewSize, i10);
    }
}
