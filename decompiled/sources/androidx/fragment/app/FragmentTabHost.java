package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.TabHost;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class FragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ArrayList f12870q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private J f12871r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private TabHost.OnTabChangeListener f12872s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f12873t;

    static class a extends View.BaseSavedState {
        public static final Parcelable.Creator<a> CREATOR = new C0390a();

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        String f12874q;

        /* JADX INFO: renamed from: androidx.fragment.app.FragmentTabHost$a$a, reason: collision with other inner class name */
        class C0390a implements Parcelable.Creator {
            C0390a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public a[] newArray(int i10) {
                return new a[i10];
            }
        }

        a(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentTabHost.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " curTab=" + this.f12874q + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f12874q);
        }

        a(Parcel parcel) {
            super(parcel);
            this.f12874q = parcel.readString();
        }
    }

    static final class b {
    }

    private S a(String str, S s9) {
        b(str);
        return s9;
    }

    private b b(String str) {
        if (this.f12870q.size() <= 0) {
            return null;
        }
        androidx.appcompat.app.o.a(this.f12870q.get(0));
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        if (this.f12870q.size() > 0) {
            androidx.appcompat.app.o.a(this.f12870q.get(0));
            throw null;
        }
        this.f12873t = true;
        S sA = a(currentTabTag, null);
        if (sA != null) {
            sA.i();
            this.f12871r.g0();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f12873t = false;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.getSuperState());
        setCurrentTabByTag(aVar.f12874q);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.f12874q = getCurrentTabTag();
        return aVar;
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    public void onTabChanged(String str) {
        S sA;
        if (this.f12873t && (sA = a(str, null)) != null) {
            sA.i();
        }
        TabHost.OnTabChangeListener onTabChangeListener = this.f12872s;
        if (onTabChangeListener != null) {
            onTabChangeListener.onTabChanged(str);
        }
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setOnTabChangedListener(TabHost.OnTabChangeListener onTabChangeListener) {
        this.f12872s = onTabChangeListener;
    }

    @Override // android.widget.TabHost
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }
}
