package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.constraintlayout.core.widgets.Optimizer;
import androidx.lifecycle.AbstractC1157q;

/* JADX INFO: loaded from: classes.dex */
final class O implements Parcelable {
    public static final Parcelable.Creator<O> CREATOR = new a();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    final boolean f12959A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    final int f12960B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final String f12961C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final int f12962D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final boolean f12963E;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final String f12964q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final String f12965r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final boolean f12966s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final boolean f12967t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    final int f12968u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    final int f12969v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    final String f12970w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    final boolean f12971x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    final boolean f12972y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    final boolean f12973z;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public O createFromParcel(Parcel parcel) {
            return new O(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public O[] newArray(int i10) {
            return new O[i10];
        }
    }

    O(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
        this.f12964q = abstractComponentCallbacksC1132q.getClass().getName();
        this.f12965r = abstractComponentCallbacksC1132q.mWho;
        this.f12966s = abstractComponentCallbacksC1132q.mFromLayout;
        this.f12967t = abstractComponentCallbacksC1132q.mInDynamicContainer;
        this.f12968u = abstractComponentCallbacksC1132q.mFragmentId;
        this.f12969v = abstractComponentCallbacksC1132q.mContainerId;
        this.f12970w = abstractComponentCallbacksC1132q.mTag;
        this.f12971x = abstractComponentCallbacksC1132q.mRetainInstance;
        this.f12972y = abstractComponentCallbacksC1132q.mRemoving;
        this.f12973z = abstractComponentCallbacksC1132q.mDetached;
        this.f12959A = abstractComponentCallbacksC1132q.mHidden;
        this.f12960B = abstractComponentCallbacksC1132q.mMaxState.ordinal();
        this.f12961C = abstractComponentCallbacksC1132q.mTargetWho;
        this.f12962D = abstractComponentCallbacksC1132q.mTargetRequestCode;
        this.f12963E = abstractComponentCallbacksC1132q.mUserVisibleHint;
    }

    AbstractComponentCallbacksC1132q a(AbstractC1140z abstractC1140z, ClassLoader classLoader) {
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qA = abstractC1140z.a(classLoader, this.f12964q);
        abstractComponentCallbacksC1132qA.mWho = this.f12965r;
        abstractComponentCallbacksC1132qA.mFromLayout = this.f12966s;
        abstractComponentCallbacksC1132qA.mInDynamicContainer = this.f12967t;
        abstractComponentCallbacksC1132qA.mRestored = true;
        abstractComponentCallbacksC1132qA.mFragmentId = this.f12968u;
        abstractComponentCallbacksC1132qA.mContainerId = this.f12969v;
        abstractComponentCallbacksC1132qA.mTag = this.f12970w;
        abstractComponentCallbacksC1132qA.mRetainInstance = this.f12971x;
        abstractComponentCallbacksC1132qA.mRemoving = this.f12972y;
        abstractComponentCallbacksC1132qA.mDetached = this.f12973z;
        abstractComponentCallbacksC1132qA.mHidden = this.f12959A;
        abstractComponentCallbacksC1132qA.mMaxState = AbstractC1157q.b.values()[this.f12960B];
        abstractComponentCallbacksC1132qA.mTargetWho = this.f12961C;
        abstractComponentCallbacksC1132qA.mTargetRequestCode = this.f12962D;
        abstractComponentCallbacksC1132qA.mUserVisibleHint = this.f12963E;
        return abstractComponentCallbacksC1132qA;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(Optimizer.OPTIMIZATION_GRAPH_WRAP);
        sb.append("FragmentState{");
        sb.append(this.f12964q);
        sb.append(" (");
        sb.append(this.f12965r);
        sb.append(")}:");
        if (this.f12966s) {
            sb.append(" fromLayout");
        }
        if (this.f12967t) {
            sb.append(" dynamicContainer");
        }
        if (this.f12969v != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f12969v));
        }
        String str = this.f12970w;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f12970w);
        }
        if (this.f12971x) {
            sb.append(" retainInstance");
        }
        if (this.f12972y) {
            sb.append(" removing");
        }
        if (this.f12973z) {
            sb.append(" detached");
        }
        if (this.f12959A) {
            sb.append(" hidden");
        }
        if (this.f12961C != null) {
            sb.append(" targetWho=");
            sb.append(this.f12961C);
            sb.append(" targetRequestCode=");
            sb.append(this.f12962D);
        }
        if (this.f12963E) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f12964q);
        parcel.writeString(this.f12965r);
        parcel.writeInt(this.f12966s ? 1 : 0);
        parcel.writeInt(this.f12967t ? 1 : 0);
        parcel.writeInt(this.f12968u);
        parcel.writeInt(this.f12969v);
        parcel.writeString(this.f12970w);
        parcel.writeInt(this.f12971x ? 1 : 0);
        parcel.writeInt(this.f12972y ? 1 : 0);
        parcel.writeInt(this.f12973z ? 1 : 0);
        parcel.writeInt(this.f12959A ? 1 : 0);
        parcel.writeInt(this.f12960B);
        parcel.writeString(this.f12961C);
        parcel.writeInt(this.f12962D);
        parcel.writeInt(this.f12963E ? 1 : 0);
    }

    O(Parcel parcel) {
        this.f12964q = parcel.readString();
        this.f12965r = parcel.readString();
        this.f12966s = parcel.readInt() != 0;
        this.f12967t = parcel.readInt() != 0;
        this.f12968u = parcel.readInt();
        this.f12969v = parcel.readInt();
        this.f12970w = parcel.readString();
        this.f12971x = parcel.readInt() != 0;
        this.f12972y = parcel.readInt() != 0;
        this.f12973z = parcel.readInt() != 0;
        this.f12959A = parcel.readInt() != 0;
        this.f12960B = parcel.readInt();
        this.f12961C = parcel.readString();
        this.f12962D = parcel.readInt();
        this.f12963E = parcel.readInt() != 0;
    }
}
