package com.nothing.wallpaper.picker.lockscreen.depth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public abstract class DepthEffectState implements Parcelable {

    @Keep
    public static final class DepthNotApplicable extends DepthEffectState {
        public static final Parcelable.Creator<DepthNotApplicable> CREATOR = new a();
        private final NotApplicableReason reason;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final DepthNotApplicable createFromParcel(Parcel parcel) {
                n.h(parcel, "parcel");
                return new DepthNotApplicable(NotApplicableReason.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final DepthNotApplicable[] newArray(int i10) {
                return new DepthNotApplicable[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DepthNotApplicable(NotApplicableReason reason) {
            super(null);
            n.h(reason, "reason");
            this.reason = reason;
        }

        public static /* synthetic */ DepthNotApplicable copy$default(DepthNotApplicable depthNotApplicable, NotApplicableReason notApplicableReason, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                notApplicableReason = depthNotApplicable.reason;
            }
            return depthNotApplicable.copy(notApplicableReason);
        }

        public final NotApplicableReason component1() {
            return this.reason;
        }

        public final DepthNotApplicable copy(NotApplicableReason reason) {
            n.h(reason, "reason");
            return new DepthNotApplicable(reason);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DepthNotApplicable) && this.reason == ((DepthNotApplicable) obj).reason;
        }

        public final NotApplicableReason getReason() {
            return this.reason;
        }

        public int hashCode() {
            return this.reason.hashCode();
        }

        @Override // com.nothing.wallpaper.picker.lockscreen.depth.DepthEffectState
        public String toString() {
            return "DepthNotApplicable(reason=" + this.reason + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i10) {
            n.h(dest, "dest");
            dest.writeString(this.reason.name());
        }
    }

    @Keep
    public static final class DepthOff extends DepthEffectState {
        public static final DepthOff INSTANCE = new DepthOff();
        public static final Parcelable.Creator<DepthOff> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final DepthOff createFromParcel(Parcel parcel) {
                n.h(parcel, "parcel");
                parcel.readInt();
                return DepthOff.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final DepthOff[] newArray(int i10) {
                return new DepthOff[i10];
            }
        }

        private DepthOff() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i10) {
            n.h(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Keep
    public static final class DepthOn extends DepthEffectState {
        public static final DepthOn INSTANCE = new DepthOn();
        public static final Parcelable.Creator<DepthOn> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final DepthOn createFromParcel(Parcel parcel) {
                n.h(parcel, "parcel");
                parcel.readInt();
                return DepthOn.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final DepthOn[] newArray(int i10) {
                return new DepthOn[i10];
            }
        }

        private DepthOn() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i10) {
            n.h(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Keep
    public static final class Initializing extends DepthEffectState {
        public static final Initializing INSTANCE = new Initializing();
        public static final Parcelable.Creator<Initializing> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Initializing createFromParcel(Parcel parcel) {
                n.h(parcel, "parcel");
                parcel.readInt();
                return Initializing.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Initializing[] newArray(int i10) {
                return new Initializing[i10];
            }
        }

        private Initializing() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i10) {
            n.h(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Keep
    public static final class ModuleUnavailable extends DepthEffectState {
        public static final Parcelable.Creator<ModuleUnavailable> CREATOR = new a();
        private final boolean isInstalling;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ModuleUnavailable createFromParcel(Parcel parcel) {
                n.h(parcel, "parcel");
                return new ModuleUnavailable(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ModuleUnavailable[] newArray(int i10) {
                return new ModuleUnavailable[i10];
            }
        }

        public ModuleUnavailable(boolean z9) {
            super(null);
            this.isInstalling = z9;
        }

        public static /* synthetic */ ModuleUnavailable copy$default(ModuleUnavailable moduleUnavailable, boolean z9, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z9 = moduleUnavailable.isInstalling;
            }
            return moduleUnavailable.copy(z9);
        }

        public final boolean component1() {
            return this.isInstalling;
        }

        public final ModuleUnavailable copy(boolean z9) {
            return new ModuleUnavailable(z9);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ModuleUnavailable) && this.isInstalling == ((ModuleUnavailable) obj).isInstalling;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isInstalling);
        }

        public final boolean isInstalling() {
            return this.isInstalling;
        }

        @Override // com.nothing.wallpaper.picker.lockscreen.depth.DepthEffectState
        public String toString() {
            return "ModuleUnavailable(isInstalling=" + this.isInstalling + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i10) {
            n.h(dest, "dest");
            dest.writeInt(this.isInstalling ? 1 : 0);
        }
    }

    public /* synthetic */ DepthEffectState(AbstractC1457h abstractC1457h) {
        this();
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        n.g(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    private DepthEffectState() {
    }
}
