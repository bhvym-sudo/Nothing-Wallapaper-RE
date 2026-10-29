package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.AbstractC1157q;
import androidx.lifecycle.f0;

/* JADX INFO: loaded from: classes.dex */
class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C f12974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Q f12975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AbstractComponentCallbacksC1132q f12976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f12977d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f12978e = -1;

    class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ View f12979q;

        a(View view) {
            this.f12979q = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f12979q.removeOnAttachStateChangeListener(this);
            androidx.core.view.H.d0(this.f12979q);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12981a;

        static {
            int[] iArr = new int[AbstractC1157q.b.values().length];
            f12981a = iArr;
            try {
                iArr[AbstractC1157q.b.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12981a[AbstractC1157q.b.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12981a[AbstractC1157q.b.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12981a[AbstractC1157q.b.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    P(C c10, Q q9, AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
        this.f12974a = c10;
        this.f12975b = q9;
        this.f12976c = abstractComponentCallbacksC1132q;
    }

    private boolean l(View view) {
        if (view == this.f12976c.mView) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f12976c.mView) {
                return true;
            }
        }
        return false;
    }

    void a() {
        if (J.L0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f12976c);
        }
        Bundle bundle = this.f12976c.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        this.f12976c.performActivityCreated(bundle2);
        this.f12974a.a(this.f12976c, bundle2, false);
    }

    void b() {
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qN0 = J.n0(this.f12976c.mContainer);
        AbstractComponentCallbacksC1132q parentFragment = this.f12976c.getParentFragment();
        if (abstractComponentCallbacksC1132qN0 != null && !abstractComponentCallbacksC1132qN0.equals(parentFragment)) {
            AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q = this.f12976c;
            U0.c.o(abstractComponentCallbacksC1132q, abstractComponentCallbacksC1132qN0, abstractComponentCallbacksC1132q.mContainerId);
        }
        int iJ = this.f12975b.j(this.f12976c);
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q2 = this.f12976c;
        abstractComponentCallbacksC1132q2.mContainer.addView(abstractComponentCallbacksC1132q2.mView, iJ);
    }

    void c() {
        if (J.L0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f12976c);
        }
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q = this.f12976c;
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q2 = abstractComponentCallbacksC1132q.mTarget;
        P pN = null;
        if (abstractComponentCallbacksC1132q2 != null) {
            P pN2 = this.f12975b.n(abstractComponentCallbacksC1132q2.mWho);
            if (pN2 == null) {
                throw new IllegalStateException("Fragment " + this.f12976c + " declared target fragment " + this.f12976c.mTarget + " that does not belong to this FragmentManager!");
            }
            AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q3 = this.f12976c;
            abstractComponentCallbacksC1132q3.mTargetWho = abstractComponentCallbacksC1132q3.mTarget.mWho;
            abstractComponentCallbacksC1132q3.mTarget = null;
            pN = pN2;
        } else {
            String str = abstractComponentCallbacksC1132q.mTargetWho;
            if (str != null && (pN = this.f12975b.n(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f12976c + " declared target fragment " + this.f12976c.mTargetWho + " that does not belong to this FragmentManager!");
            }
        }
        if (pN != null) {
            pN.m();
        }
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q4 = this.f12976c;
        abstractComponentCallbacksC1132q4.mHost = abstractComponentCallbacksC1132q4.mFragmentManager.y0();
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q5 = this.f12976c;
        abstractComponentCallbacksC1132q5.mParentFragment = abstractComponentCallbacksC1132q5.mFragmentManager.B0();
        this.f12974a.g(this.f12976c, false);
        this.f12976c.performAttach();
        this.f12974a.b(this.f12976c, false);
    }

    int d() {
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q = this.f12976c;
        if (abstractComponentCallbacksC1132q.mFragmentManager == null) {
            return abstractComponentCallbacksC1132q.mState;
        }
        int iMin = this.f12978e;
        int i10 = b.f12981a[abstractComponentCallbacksC1132q.mMaxState.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                iMin = Math.min(iMin, 5);
            } else if (i10 != 3) {
                iMin = i10 != 4 ? Math.min(iMin, -1) : Math.min(iMin, 0);
            } else {
                iMin = Math.min(iMin, 1);
            }
        }
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q2 = this.f12976c;
        if (abstractComponentCallbacksC1132q2.mFromLayout) {
            if (abstractComponentCallbacksC1132q2.mInLayout) {
                iMin = Math.max(this.f12978e, 2);
                View view = this.f12976c.mView;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f12978e < 4 ? Math.min(iMin, abstractComponentCallbacksC1132q2.mState) : Math.min(iMin, 1);
            }
        }
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q3 = this.f12976c;
        if (abstractComponentCallbacksC1132q3.mInDynamicContainer && abstractComponentCallbacksC1132q3.mContainer == null) {
            iMin = Math.min(iMin, 4);
        }
        if (!this.f12976c.mAdded) {
            iMin = Math.min(iMin, 1);
        }
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q4 = this.f12976c;
        ViewGroup viewGroup = abstractComponentCallbacksC1132q4.mContainer;
        b0.d.a aVarS = viewGroup != null ? b0.u(viewGroup, abstractComponentCallbacksC1132q4.getParentFragmentManager()).s(this) : null;
        if (aVarS == b0.d.a.ADDING) {
            iMin = Math.min(iMin, 6);
        } else if (aVarS == b0.d.a.REMOVING) {
            iMin = Math.max(iMin, 3);
        } else {
            AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q5 = this.f12976c;
            if (abstractComponentCallbacksC1132q5.mRemoving) {
                iMin = abstractComponentCallbacksC1132q5.isInBackStack() ? Math.min(iMin, 1) : Math.min(iMin, -1);
            }
        }
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q6 = this.f12976c;
        if (abstractComponentCallbacksC1132q6.mDeferStart && abstractComponentCallbacksC1132q6.mState < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (this.f12976c.mTransitioning) {
            iMin = Math.max(iMin, 3);
        }
        if (J.L0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + this.f12976c);
        }
        return iMin;
    }

    void e() {
        if (J.L0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f12976c);
        }
        Bundle bundle = this.f12976c.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q = this.f12976c;
        if (abstractComponentCallbacksC1132q.mIsCreated) {
            abstractComponentCallbacksC1132q.mState = 1;
            abstractComponentCallbacksC1132q.restoreChildFragmentState();
        } else {
            this.f12974a.h(abstractComponentCallbacksC1132q, bundle2, false);
            this.f12976c.performCreate(bundle2);
            this.f12974a.c(this.f12976c, bundle2, false);
        }
    }

    void f() {
        String resourceName;
        if (this.f12976c.mFromLayout) {
            return;
        }
        if (J.L0(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f12976c);
        }
        Bundle bundle = this.f12976c.mSavedFragmentState;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterPerformGetLayoutInflater = this.f12976c.performGetLayoutInflater(bundle2);
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q = this.f12976c;
        ViewGroup viewGroup2 = abstractComponentCallbacksC1132q.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i10 = abstractComponentCallbacksC1132q.mContainerId;
            if (i10 != 0) {
                if (i10 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f12976c + " for a container view with no id");
                }
                viewGroup = (ViewGroup) abstractComponentCallbacksC1132q.mFragmentManager.t0().c(this.f12976c.mContainerId);
                if (viewGroup == null) {
                    AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q2 = this.f12976c;
                    if (!abstractComponentCallbacksC1132q2.mRestored && !abstractComponentCallbacksC1132q2.mInDynamicContainer) {
                        try {
                            resourceName = abstractComponentCallbacksC1132q2.getResources().getResourceName(this.f12976c.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f12976c.mContainerId) + " (" + resourceName + ") for fragment " + this.f12976c);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    U0.c.n(this.f12976c, viewGroup);
                }
            }
        }
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q3 = this.f12976c;
        abstractComponentCallbacksC1132q3.mContainer = viewGroup;
        abstractComponentCallbacksC1132q3.performCreateView(layoutInflaterPerformGetLayoutInflater, viewGroup, bundle2);
        if (this.f12976c.mView != null) {
            if (J.L0(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + this.f12976c);
            }
            this.f12976c.mView.setSaveFromParentEnabled(false);
            AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q4 = this.f12976c;
            abstractComponentCallbacksC1132q4.mView.setTag(T0.b.f7401a, abstractComponentCallbacksC1132q4);
            if (viewGroup != null) {
                b();
            }
            AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q5 = this.f12976c;
            if (abstractComponentCallbacksC1132q5.mHidden) {
                abstractComponentCallbacksC1132q5.mView.setVisibility(8);
            }
            if (this.f12976c.mView.isAttachedToWindow()) {
                androidx.core.view.H.d0(this.f12976c.mView);
            } else {
                View view = this.f12976c.mView;
                view.addOnAttachStateChangeListener(new a(view));
            }
            this.f12976c.performViewCreated();
            C c10 = this.f12974a;
            AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q6 = this.f12976c;
            c10.m(abstractComponentCallbacksC1132q6, abstractComponentCallbacksC1132q6.mView, bundle2, false);
            int visibility = this.f12976c.mView.getVisibility();
            this.f12976c.setPostOnViewCreatedAlpha(this.f12976c.mView.getAlpha());
            AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q7 = this.f12976c;
            if (abstractComponentCallbacksC1132q7.mContainer != null && visibility == 0) {
                View viewFindFocus = abstractComponentCallbacksC1132q7.mView.findFocus();
                if (viewFindFocus != null) {
                    this.f12976c.setFocusedView(viewFindFocus);
                    if (J.L0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + this.f12976c);
                    }
                }
                this.f12976c.mView.setAlpha(0.0f);
            }
        }
        this.f12976c.mState = 2;
    }

    void g() {
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qF;
        if (J.L0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f12976c);
        }
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q = this.f12976c;
        boolean zIsChangingConfigurations = true;
        boolean z9 = abstractComponentCallbacksC1132q.mRemoving && !abstractComponentCallbacksC1132q.isInBackStack();
        if (z9) {
            AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q2 = this.f12976c;
            if (!abstractComponentCallbacksC1132q2.mBeingSaved) {
                this.f12975b.B(abstractComponentCallbacksC1132q2.mWho, null);
            }
        }
        if (!z9 && !this.f12975b.p().q(this.f12976c)) {
            String str = this.f12976c.mTargetWho;
            if (str != null && (abstractComponentCallbacksC1132qF = this.f12975b.f(str)) != null && abstractComponentCallbacksC1132qF.mRetainInstance) {
                this.f12976c.mTarget = abstractComponentCallbacksC1132qF;
            }
            this.f12976c.mState = 0;
            return;
        }
        A a10 = this.f12976c.mHost;
        if (a10 instanceof f0) {
            zIsChangingConfigurations = this.f12975b.p().n();
        } else if (a10.h() instanceof Activity) {
            zIsChangingConfigurations = true ^ ((Activity) a10.h()).isChangingConfigurations();
        }
        if ((z9 && !this.f12976c.mBeingSaved) || zIsChangingConfigurations) {
            this.f12975b.p().f(this.f12976c, false);
        }
        this.f12976c.performDestroy();
        this.f12974a.d(this.f12976c, false);
        for (P p9 : this.f12975b.k()) {
            if (p9 != null) {
                AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qK = p9.k();
                if (this.f12976c.mWho.equals(abstractComponentCallbacksC1132qK.mTargetWho)) {
                    abstractComponentCallbacksC1132qK.mTarget = this.f12976c;
                    abstractComponentCallbacksC1132qK.mTargetWho = null;
                }
            }
        }
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q3 = this.f12976c;
        String str2 = abstractComponentCallbacksC1132q3.mTargetWho;
        if (str2 != null) {
            abstractComponentCallbacksC1132q3.mTarget = this.f12975b.f(str2);
        }
        this.f12975b.s(this);
    }

    void h() {
        View view;
        if (J.L0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f12976c);
        }
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q = this.f12976c;
        ViewGroup viewGroup = abstractComponentCallbacksC1132q.mContainer;
        if (viewGroup != null && (view = abstractComponentCallbacksC1132q.mView) != null) {
            viewGroup.removeView(view);
        }
        this.f12976c.performDestroyView();
        this.f12974a.n(this.f12976c, false);
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q2 = this.f12976c;
        abstractComponentCallbacksC1132q2.mContainer = null;
        abstractComponentCallbacksC1132q2.mView = null;
        abstractComponentCallbacksC1132q2.mViewLifecycleOwner = null;
        abstractComponentCallbacksC1132q2.mViewLifecycleOwnerLiveData.n(null);
        this.f12976c.mInLayout = false;
    }

    void i() {
        if (J.L0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f12976c);
        }
        this.f12976c.performDetach();
        this.f12974a.e(this.f12976c, false);
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q = this.f12976c;
        abstractComponentCallbacksC1132q.mState = -1;
        abstractComponentCallbacksC1132q.mHost = null;
        abstractComponentCallbacksC1132q.mParentFragment = null;
        abstractComponentCallbacksC1132q.mFragmentManager = null;
        if ((!abstractComponentCallbacksC1132q.mRemoving || abstractComponentCallbacksC1132q.isInBackStack()) && !this.f12975b.p().q(this.f12976c)) {
            return;
        }
        if (J.L0(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + this.f12976c);
        }
        this.f12976c.initState();
    }

    void j() {
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q = this.f12976c;
        if (abstractComponentCallbacksC1132q.mFromLayout && abstractComponentCallbacksC1132q.mInLayout && !abstractComponentCallbacksC1132q.mPerformedCreateView) {
            if (J.L0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f12976c);
            }
            Bundle bundle = this.f12976c.mSavedFragmentState;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q2 = this.f12976c;
            abstractComponentCallbacksC1132q2.performCreateView(abstractComponentCallbacksC1132q2.performGetLayoutInflater(bundle2), null, bundle2);
            View view = this.f12976c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q3 = this.f12976c;
                abstractComponentCallbacksC1132q3.mView.setTag(T0.b.f7401a, abstractComponentCallbacksC1132q3);
                AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q4 = this.f12976c;
                if (abstractComponentCallbacksC1132q4.mHidden) {
                    abstractComponentCallbacksC1132q4.mView.setVisibility(8);
                }
                this.f12976c.performViewCreated();
                C c10 = this.f12974a;
                AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q5 = this.f12976c;
                c10.m(abstractComponentCallbacksC1132q5, abstractComponentCallbacksC1132q5.mView, bundle2, false);
                this.f12976c.mState = 2;
            }
        }
    }

    AbstractComponentCallbacksC1132q k() {
        return this.f12976c;
    }

    void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f12977d) {
            if (J.L0(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + k());
                return;
            }
            return;
        }
        try {
            this.f12977d = true;
            boolean z9 = false;
            while (true) {
                int iD = d();
                AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q = this.f12976c;
                int i10 = abstractComponentCallbacksC1132q.mState;
                if (iD == i10) {
                    if (!z9 && i10 == -1 && abstractComponentCallbacksC1132q.mRemoving && !abstractComponentCallbacksC1132q.isInBackStack() && !this.f12976c.mBeingSaved) {
                        if (J.L0(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + this.f12976c);
                        }
                        this.f12975b.p().f(this.f12976c, true);
                        this.f12975b.s(this);
                        if (J.L0(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + this.f12976c);
                        }
                        this.f12976c.initState();
                    }
                    AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q2 = this.f12976c;
                    if (abstractComponentCallbacksC1132q2.mHiddenChanged) {
                        if (abstractComponentCallbacksC1132q2.mView != null && (viewGroup = abstractComponentCallbacksC1132q2.mContainer) != null) {
                            b0 b0VarU = b0.u(viewGroup, abstractComponentCallbacksC1132q2.getParentFragmentManager());
                            if (this.f12976c.mHidden) {
                                b0VarU.k(this);
                            } else {
                                b0VarU.m(this);
                            }
                        }
                        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q3 = this.f12976c;
                        J j9 = abstractComponentCallbacksC1132q3.mFragmentManager;
                        if (j9 != null) {
                            j9.J0(abstractComponentCallbacksC1132q3);
                        }
                        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q4 = this.f12976c;
                        abstractComponentCallbacksC1132q4.mHiddenChanged = false;
                        abstractComponentCallbacksC1132q4.onHiddenChanged(abstractComponentCallbacksC1132q4.mHidden);
                        this.f12976c.mChildFragmentManager.K();
                    }
                    return;
                }
                if (iD <= i10) {
                    switch (i10 - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            if (abstractComponentCallbacksC1132q.mBeingSaved && this.f12975b.q(abstractComponentCallbacksC1132q.mWho) == null) {
                                this.f12975b.B(this.f12976c.mWho, r());
                            }
                            g();
                            break;
                        case 1:
                            h();
                            this.f12976c.mState = 1;
                            break;
                        case 2:
                            abstractComponentCallbacksC1132q.mInLayout = false;
                            abstractComponentCallbacksC1132q.mState = 2;
                            break;
                        case 3:
                            if (J.L0(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f12976c);
                            }
                            AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q5 = this.f12976c;
                            if (abstractComponentCallbacksC1132q5.mBeingSaved) {
                                this.f12975b.B(abstractComponentCallbacksC1132q5.mWho, r());
                            } else if (abstractComponentCallbacksC1132q5.mView != null && abstractComponentCallbacksC1132q5.mSavedViewState == null) {
                                s();
                            }
                            AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q6 = this.f12976c;
                            if (abstractComponentCallbacksC1132q6.mView != null && (viewGroup2 = abstractComponentCallbacksC1132q6.mContainer) != null) {
                                b0.u(viewGroup2, abstractComponentCallbacksC1132q6.getParentFragmentManager()).l(this);
                            }
                            this.f12976c.mState = 3;
                            break;
                        case 4:
                            v();
                            break;
                        case 5:
                            abstractComponentCallbacksC1132q.mState = 5;
                            break;
                        case 6:
                            n();
                            break;
                    }
                } else {
                    switch (i10 + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (abstractComponentCallbacksC1132q.mView != null && (viewGroup3 = abstractComponentCallbacksC1132q.mContainer) != null) {
                                b0.u(viewGroup3, abstractComponentCallbacksC1132q.getParentFragmentManager()).j(b0.d.b.f(this.f12976c.mView.getVisibility()), this);
                            }
                            this.f12976c.mState = 4;
                            break;
                        case 5:
                            u();
                            break;
                        case 6:
                            abstractComponentCallbacksC1132q.mState = 6;
                            break;
                        case 7:
                            p();
                            break;
                    }
                }
                z9 = true;
            }
        } finally {
            this.f12977d = false;
        }
    }

    void n() {
        if (J.L0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f12976c);
        }
        this.f12976c.performPause();
        this.f12974a.f(this.f12976c, false);
    }

    void o(ClassLoader classLoader) {
        Bundle bundle = this.f12976c.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (this.f12976c.mSavedFragmentState.getBundle("savedInstanceState") == null) {
            this.f12976c.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
        }
        try {
            AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q = this.f12976c;
            abstractComponentCallbacksC1132q.mSavedViewState = abstractComponentCallbacksC1132q.mSavedFragmentState.getSparseParcelableArray("viewState");
            AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q2 = this.f12976c;
            abstractComponentCallbacksC1132q2.mSavedViewRegistryState = abstractComponentCallbacksC1132q2.mSavedFragmentState.getBundle("viewRegistryState");
            O o9 = (O) this.f12976c.mSavedFragmentState.getParcelable("state");
            if (o9 != null) {
                AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q3 = this.f12976c;
                abstractComponentCallbacksC1132q3.mTargetWho = o9.f12961C;
                abstractComponentCallbacksC1132q3.mTargetRequestCode = o9.f12962D;
                Boolean bool = abstractComponentCallbacksC1132q3.mSavedUserVisibleHint;
                if (bool != null) {
                    abstractComponentCallbacksC1132q3.mUserVisibleHint = bool.booleanValue();
                    this.f12976c.mSavedUserVisibleHint = null;
                } else {
                    abstractComponentCallbacksC1132q3.mUserVisibleHint = o9.f12963E;
                }
            }
            AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q4 = this.f12976c;
            if (abstractComponentCallbacksC1132q4.mUserVisibleHint) {
                return;
            }
            abstractComponentCallbacksC1132q4.mDeferStart = true;
        } catch (BadParcelableException e10) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + k(), e10);
        }
    }

    void p() {
        if (J.L0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f12976c);
        }
        View focusedView = this.f12976c.getFocusedView();
        if (focusedView != null && l(focusedView)) {
            boolean zRequestFocus = focusedView.requestFocus();
            if (J.L0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("requestFocus: Restoring focused view ");
                sb.append(focusedView);
                sb.append(" ");
                sb.append(zRequestFocus ? "succeeded" : "failed");
                sb.append(" on Fragment ");
                sb.append(this.f12976c);
                sb.append(" resulting in focused view ");
                sb.append(this.f12976c.mView.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        this.f12976c.setFocusedView(null);
        this.f12976c.performResume();
        this.f12974a.i(this.f12976c, false);
        this.f12975b.B(this.f12976c.mWho, null);
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q = this.f12976c;
        abstractComponentCallbacksC1132q.mSavedFragmentState = null;
        abstractComponentCallbacksC1132q.mSavedViewState = null;
        abstractComponentCallbacksC1132q.mSavedViewRegistryState = null;
    }

    AbstractComponentCallbacksC1132q.n q() {
        if (this.f12976c.mState > -1) {
            return new AbstractComponentCallbacksC1132q.n(r());
        }
        return null;
    }

    Bundle r() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q = this.f12976c;
        if (abstractComponentCallbacksC1132q.mState == -1 && (bundle = abstractComponentCallbacksC1132q.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new O(this.f12976c));
        if (this.f12976c.mState > -1) {
            Bundle bundle3 = new Bundle();
            this.f12976c.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f12974a.j(this.f12976c, bundle3, false);
            Bundle bundle4 = new Bundle();
            this.f12976c.mSavedStateRegistryController.e(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle bundleQ1 = this.f12976c.mChildFragmentManager.q1();
            if (!bundleQ1.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundleQ1);
            }
            if (this.f12976c.mView != null) {
                s();
            }
            SparseArray<Parcelable> sparseArray = this.f12976c.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = this.f12976c.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = this.f12976c.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    void s() {
        if (this.f12976c.mView == null) {
            return;
        }
        if (J.L0(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + this.f12976c + " with view " + this.f12976c.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f12976c.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f12976c.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f12976c.mViewLifecycleOwner.e(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f12976c.mSavedViewRegistryState = bundle;
    }

    void t(int i10) {
        this.f12978e = i10;
    }

    void u() {
        if (J.L0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f12976c);
        }
        this.f12976c.performStart();
        this.f12974a.k(this.f12976c, false);
    }

    void v() {
        if (J.L0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f12976c);
        }
        this.f12976c.performStop();
        this.f12974a.l(this.f12976c, false);
    }

    P(C c10, Q q9, ClassLoader classLoader, AbstractC1140z abstractC1140z, Bundle bundle) {
        this.f12974a = c10;
        this.f12975b = q9;
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qA = ((O) bundle.getParcelable("state")).a(abstractC1140z, classLoader);
        this.f12976c = abstractComponentCallbacksC1132qA;
        abstractComponentCallbacksC1132qA.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        abstractComponentCallbacksC1132qA.setArguments(bundle2);
        if (J.L0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + abstractComponentCallbacksC1132qA);
        }
    }

    P(C c10, Q q9, AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q, Bundle bundle) {
        this.f12974a = c10;
        this.f12975b = q9;
        this.f12976c = abstractComponentCallbacksC1132q;
        abstractComponentCallbacksC1132q.mSavedViewState = null;
        abstractComponentCallbacksC1132q.mSavedViewRegistryState = null;
        abstractComponentCallbacksC1132q.mBackStackNesting = 0;
        abstractComponentCallbacksC1132q.mInLayout = false;
        abstractComponentCallbacksC1132q.mAdded = false;
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q2 = abstractComponentCallbacksC1132q.mTarget;
        abstractComponentCallbacksC1132q.mTargetWho = abstractComponentCallbacksC1132q2 != null ? abstractComponentCallbacksC1132q2.mWho : null;
        abstractComponentCallbacksC1132q.mTarget = null;
        abstractComponentCallbacksC1132q.mSavedFragmentState = bundle;
        abstractComponentCallbacksC1132q.mArguments = bundle.getBundle("arguments");
    }
}
