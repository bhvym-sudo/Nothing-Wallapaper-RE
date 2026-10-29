package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.constraintlayout.core.widgets.Optimizer;
import androidx.core.view.AbstractC1079k;
import androidx.lifecycle.AbstractC1157q;
import androidx.lifecycle.C1165z;
import androidx.lifecycle.InterfaceC1155o;
import androidx.lifecycle.InterfaceC1160u;
import androidx.lifecycle.InterfaceC1163x;
import androidx.lifecycle.e0;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import androidx.lifecycle.h0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: androidx.fragment.app.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC1132q implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC1163x, f0, InterfaceC1155o, p082i1.f {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    k mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    androidx.lifecycle.d0.c mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    J mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    A mHost;
    boolean mInDynamicContainer;
    boolean mInLayout;
    boolean mIsCreated;
    LayoutInflater mLayoutInflater;
    C1165z mLifecycleRegistry;
    AbstractComponentCallbacksC1132q mParentFragment;
    boolean mPerformedCreateView;
    Handler mPostponedHandler;
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    p082i1.e mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    String mTag;
    AbstractComponentCallbacksC1132q mTarget;
    int mTargetRequestCode;
    boolean mTransitioning;
    View mView;
    W mViewLifecycleOwner;
    int mState = -1;
    String mWho = UUID.randomUUID().toString();
    String mTargetWho = null;
    private Boolean mIsPrimaryNavigationFragment = null;
    J mChildFragmentManager = new K();
    boolean mMenuVisible = true;
    boolean mUserVisibleHint = true;
    Runnable mPostponedDurationRunnable = new b();
    AbstractC1157q.b mMaxState = AbstractC1157q.b.RESUMED;
    androidx.lifecycle.H mViewLifecycleOwnerLiveData = new androidx.lifecycle.H();
    private final AtomicInteger mNextLocalRequestCode = new AtomicInteger();
    private final ArrayList<m> mOnPreAttachedListeners = new ArrayList<>();
    private final m mSavedStateAttachListener = new c();

    /* JADX INFO: renamed from: androidx.fragment.app.q$a */
    class a extends p030d.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AtomicReference f13197a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p040e.a f13198b;

        a(AtomicReference atomicReference, p040e.a aVar) {
            this.f13197a = atomicReference;
            this.f13198b = aVar;
        }

        @Override // p030d.c
        public p040e.a a() {
            return this.f13198b;
        }

        @Override // p030d.c
        public void c(Object obj, p161q0.c cVar) {
            p030d.c cVar2 = (p030d.c) this.f13197a.get();
            if (cVar2 == null) {
                throw new IllegalStateException("Operation cannot be started before fragment is in created state");
            }
            cVar2.c(obj, cVar);
        }

        @Override // p030d.c
        public void d() {
            p030d.c cVar = (p030d.c) this.f13197a.getAndSet(null);
            if (cVar != null) {
                cVar.d();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.q$b */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractComponentCallbacksC1132q.this.startPostponedEnterTransition();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.q$c */
    class c extends m {
        c() {
            super(null);
        }

        @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q.m
        void a() {
            AbstractComponentCallbacksC1132q.this.mSavedStateRegistryController.c();
            androidx.lifecycle.U.c(AbstractComponentCallbacksC1132q.this);
            Bundle bundle = AbstractComponentCallbacksC1132q.this.mSavedFragmentState;
            AbstractComponentCallbacksC1132q.this.mSavedStateRegistryController.d(bundle != null ? bundle.getBundle("registryState") : null);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.q$d */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractComponentCallbacksC1132q.this.callStartTransitionListener(false);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.q$e */
    class e implements Runnable {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ b0 f13203q;

        e(b0 b0Var) {
            this.f13203q = b0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f13203q.y()) {
                this.f13203q.n();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.q$f */
    class f extends AbstractC1138x {
        f() {
        }

        @Override // androidx.fragment.app.AbstractC1138x
        public View c(int i10) {
            View view = AbstractComponentCallbacksC1132q.this.mView;
            if (view != null) {
                return view.findViewById(i10);
            }
            throw new IllegalStateException("Fragment " + AbstractComponentCallbacksC1132q.this + " does not have a view");
        }

        @Override // androidx.fragment.app.AbstractC1138x
        public boolean d() {
            return AbstractComponentCallbacksC1132q.this.mView != null;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.q$g */
    class g implements InterfaceC1160u {
        g() {
        }

        @Override // androidx.lifecycle.InterfaceC1160u
        public void onStateChanged(InterfaceC1163x interfaceC1163x, AbstractC1157q.a aVar) {
            View view;
            if (aVar != AbstractC1157q.a.ON_STOP || (view = AbstractComponentCallbacksC1132q.this.mView) == null) {
                return;
            }
            view.cancelPendingInputEvents();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.q$h */
    class h implements p130n.a {
        h() {
        }

        @Override // p130n.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p030d.e apply(Void r9) {
            AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q = AbstractComponentCallbacksC1132q.this;
            Object obj = abstractComponentCallbacksC1132q.mHost;
            return obj instanceof p030d.f ? ((p030d.f) obj).n() : abstractComponentCallbacksC1132q.requireActivity().n();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.q$i */
    class i implements p130n.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p030d.e f13208a;

        i(p030d.e eVar) {
            this.f13208a = eVar;
        }

        @Override // p130n.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p030d.e apply(Void r9) {
            return this.f13208a;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.q$j */
    class j extends m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p130n.a f13210a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AtomicReference f13211b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p040e.a f13212c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p030d.b f13213d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(p130n.a aVar, AtomicReference atomicReference, p040e.a aVar2, p030d.b bVar) {
            super(null);
            this.f13210a = aVar;
            this.f13211b = atomicReference;
            this.f13212c = aVar2;
            this.f13213d = bVar;
        }

        @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q.m
        void a() {
            String strGenerateActivityResultKey = AbstractComponentCallbacksC1132q.this.generateActivityResultKey();
            this.f13211b.set(((p030d.e) this.f13210a.apply(null)).l(strGenerateActivityResultKey, AbstractComponentCallbacksC1132q.this, this.f13212c, this.f13213d));
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.q$k */
    static class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        View f13215a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f13216b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f13217c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f13218d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f13219e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f13220f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f13221g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        ArrayList f13222h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        ArrayList f13223i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f13224j = null;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f13225k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f13226l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f13227m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f13228n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f13229o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Boolean f13230p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Boolean f13231q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        float f13232r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        View f13233s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        boolean f13234t;

        k() {
            Object obj = AbstractComponentCallbacksC1132q.USE_DEFAULT_TRANSITION;
            this.f13225k = obj;
            this.f13226l = null;
            this.f13227m = obj;
            this.f13228n = null;
            this.f13229o = obj;
            this.f13232r = 1.0f;
            this.f13233s = null;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.q$l */
    public static class l extends RuntimeException {
        public l(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.q$m */
    private static abstract class m {
        private m() {
        }

        abstract void a();

        /* synthetic */ m(b bVar) {
            this();
        }
    }

    public AbstractComponentCallbacksC1132q() {
        Z();
    }

    public static /* synthetic */ void V(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
        abstractComponentCallbacksC1132q.mViewLifecycleOwner.d(abstractComponentCallbacksC1132q.mSavedViewRegistryState);
        abstractComponentCallbacksC1132q.mSavedViewRegistryState = null;
    }

    private k W() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new k();
        }
        return this.mAnimationInfo;
    }

    private int X() {
        AbstractC1157q.b bVar = this.mMaxState;
        return (bVar == AbstractC1157q.b.INITIALIZED || this.mParentFragment == null) ? bVar.ordinal() : Math.min(bVar.ordinal(), this.mParentFragment.X());
    }

    private AbstractComponentCallbacksC1132q Y(boolean z9) {
        String str;
        if (z9) {
            U0.c.j(this);
        }
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q = this.mTarget;
        if (abstractComponentCallbacksC1132q != null) {
            return abstractComponentCallbacksC1132q;
        }
        J j9 = this.mFragmentManager;
        if (j9 == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return j9.h0(str);
    }

    private void Z() {
        this.mLifecycleRegistry = new C1165z(this);
        this.mSavedStateRegistryController = p082i1.e.a(this);
        this.mDefaultFactory = null;
        if (this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            return;
        }
        b0(this.mSavedStateAttachListener);
    }

    private p030d.c a0(p040e.a aVar, p130n.a aVar2, p030d.b bVar) {
        if (this.mState <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            b0(new j(aVar2, atomicReference, aVar, bVar));
            return new a(atomicReference, aVar);
        }
        throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
    }

    private void b0(m mVar) {
        if (this.mState >= 0) {
            mVar.a();
        } else {
            this.mOnPreAttachedListeners.add(mVar);
        }
    }

    private void c0() {
        if (J.L0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.mView != null) {
            Bundle bundle = this.mSavedFragmentState;
            restoreViewState(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        }
        this.mSavedFragmentState = null;
    }

    @Deprecated
    public static AbstractComponentCallbacksC1132q instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    void callStartTransitionListener(boolean z9) {
        ViewGroup viewGroup;
        J j9;
        k kVar = this.mAnimationInfo;
        if (kVar != null) {
            kVar.f13234t = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (j9 = this.mFragmentManager) == null) {
            return;
        }
        b0 b0VarU = b0.u(viewGroup, j9);
        b0VarU.z();
        if (z9) {
            this.mHost.k().post(new e(b0VarU));
        } else {
            b0VarU.n();
        }
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
            this.mPostponedHandler = null;
        }
    }

    AbstractC1138x createFragmentContainer() {
        return new f();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qY = Y(false);
        if (abstractComponentCallbacksC1132qY != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(abstractComponentCallbacksC1132qY);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            androidx.loader.app.a.b(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.Y(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    AbstractComponentCallbacksC1132q findFragmentByWho(String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.l0(str);
    }

    String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    public final AbstractActivityC1136v getActivity() {
        A a10 = this.mHost;
        if (a10 == null) {
            return null;
        }
        return (AbstractActivityC1136v) a10.e();
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        k kVar = this.mAnimationInfo;
        if (kVar == null || (bool = kVar.f13231q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        k kVar = this.mAnimationInfo;
        if (kVar == null || (bool = kVar.f13230p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    View getAnimatingAway() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f13215a;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final J getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public Context getContext() {
        A a10 = this.mHost;
        if (a10 == null) {
            return null;
        }
        return a10.h();
    }

    @Override // androidx.lifecycle.InterfaceC1155o
    public Z0.a getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && J.L0(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        Z0.b bVar = new Z0.b();
        if (application != null) {
            bVar.c(androidx.lifecycle.d0.a.f13396h, application);
        }
        bVar.c(androidx.lifecycle.U.f13345a, this);
        bVar.c(androidx.lifecycle.U.f13346b, this);
        if (getArguments() != null) {
            bVar.c(androidx.lifecycle.U.f13347c, getArguments());
        }
        return bVar;
    }

    @Override // androidx.lifecycle.InterfaceC1155o
    public androidx.lifecycle.d0.c getDefaultViewModelProviderFactory() {
        Application application;
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.mDefaultFactory == null) {
            Context applicationContext = requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && J.L0(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.mDefaultFactory = new androidx.lifecycle.X(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    int getEnterAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f13217c;
    }

    public Object getEnterTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f13224j;
    }

    p161q0.q getEnterTransitionCallback() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        kVar.getClass();
        return null;
    }

    int getExitAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f13218d;
    }

    public Object getExitTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f13226l;
    }

    p161q0.q getExitTransitionCallback() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        kVar.getClass();
        return null;
    }

    View getFocusedView() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f13233s;
    }

    @Deprecated
    public final J getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        A a10 = this.mHost;
        if (a10 == null) {
            return null;
        }
        return a10.q();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Override // androidx.lifecycle.InterfaceC1163x
    public AbstractC1157q getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public androidx.loader.app.a getLoaderManager() {
        return androidx.loader.app.a.b(this);
    }

    int getNextTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f13221g;
    }

    public final AbstractComponentCallbacksC1132q getParentFragment() {
        return this.mParentFragment;
    }

    public final J getParentFragmentManager() {
        J j9 = this.mFragmentManager;
        if (j9 != null) {
            return j9;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    boolean getPopDirection() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return false;
        }
        return kVar.f13216b;
    }

    int getPopEnterAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f13219e;
    }

    int getPopExitAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f13220f;
    }

    float getPostOnViewCreatedAlpha() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 1.0f;
        }
        return kVar.f13232r;
    }

    public Object getReenterTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        Object obj = kVar.f13227m;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        U0.c.h(this);
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        Object obj = kVar.f13225k;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // p082i1.f
    public final p082i1.d getSavedStateRegistry() {
        return this.mSavedStateRegistryController.b();
    }

    public Object getSharedElementEnterTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f13228n;
    }

    public Object getSharedElementReturnTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        Object obj = kVar.f13229o;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        k kVar = this.mAnimationInfo;
        return (kVar == null || (arrayList = kVar.f13222h) == null) ? new ArrayList<>() : arrayList;
    }

    ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        k kVar = this.mAnimationInfo;
        return (kVar == null || (arrayList = kVar.f13223i) == null) ? new ArrayList<>() : arrayList;
    }

    public final String getString(int i10) {
        return getResources().getString(i10);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final AbstractComponentCallbacksC1132q getTargetFragment() {
        return Y(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        U0.c.i(this);
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i10) {
        return getResources().getText(i10);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public InterfaceC1163x getViewLifecycleOwner() {
        W w9 = this.mViewLifecycleOwner;
        if (w9 != null) {
            return w9;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner for " + this + " when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public androidx.lifecycle.C getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // androidx.lifecycle.f0
    public e0 getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (X() != AbstractC1157q.b.INITIALIZED.ordinal()) {
            return this.mFragmentManager.G0(this);
        }
        throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    void initState() {
        Z();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new K();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        if (this.mHidden) {
            return true;
        }
        J j9 = this.mFragmentManager;
        return j9 != null && j9.O0(this.mParentFragment);
    }

    final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        if (!this.mMenuVisible) {
            return false;
        }
        J j9 = this.mFragmentManager;
        return j9 == null || j9.P0(this.mParentFragment);
    }

    boolean isPostponed() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return false;
        }
        return kVar.f13234t;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        J j9 = this.mFragmentManager;
        if (j9 == null) {
            return false;
        }
        return j9.S0();
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    void noteStateNotSaved() {
        this.mChildFragmentManager.X0();
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (J.L0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i10 + " resultCode: " + i11 + " data: " + intent);
        }
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        A a10 = this.mHost;
        Activity activityE = a10 == null ? null : a10.e();
        if (activityE != null) {
            this.mCalled = false;
            onAttach(activityE);
        }
    }

    @Deprecated
    public void onAttachFragment(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState();
        if (this.mChildFragmentManager.R0(1)) {
            return;
        }
        this.mChildFragmentManager.D();
    }

    public Animation onCreateAnimation(int i10, boolean z9, int i11) {
        return null;
    }

    public Animator onCreateAnimator(int i10, boolean z9, int i11) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Deprecated
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10 = this.mContentLayoutId;
        if (i10 != 0) {
            return layoutInflater.inflate(i10, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onHiddenChanged(boolean z9) {
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        A a10 = this.mHost;
        Activity activityE = a10 == null ? null : a10.e();
        if (activityE != null) {
            this.mCalled = false;
            onInflate(activityE, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z9) {
    }

    @Deprecated
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    @Deprecated
    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z9) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z9) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.X0();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            c0();
            this.mChildFragmentManager.z();
        } else {
            throw new d0("Fragment " + this + " did not call through to super.onActivityCreated()");
        }
    }

    void performAttach() {
        Iterator<m> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.n(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.h());
        if (this.mCalled) {
            this.mFragmentManager.J(this);
            this.mChildFragmentManager.A();
        } else {
            throw new d0("Fragment " + this + " did not call through to super.onAttach()");
        }
    }

    void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.C(menuItem);
    }

    void performCreate(Bundle bundle) {
        this.mChildFragmentManager.X0();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.a(new g());
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.i(AbstractC1157q.a.ON_CREATE);
            return;
        }
        throw new d0("Fragment " + this + " did not call through to super.onCreate()");
    }

    boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z9 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z9 = true;
        }
        return this.mChildFragmentManager.E(menu, menuInflater) | z9;
    }

    void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.X0();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new W(this, getViewModelStore(), new Runnable() { // from class: androidx.fragment.app.p
            @Override // java.lang.Runnable
            public final void run() {
                AbstractComponentCallbacksC1132q.V(this.f13196q);
            }
        });
        View viewOnCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = viewOnCreateView;
        if (viewOnCreateView == null) {
            if (this.mViewLifecycleOwner.c()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.mViewLifecycleOwner = null;
            return;
        }
        this.mViewLifecycleOwner.b();
        if (J.L0(3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.mView + " for Fragment " + this);
        }
        g0.b(this.mView, this.mViewLifecycleOwner);
        h0.a(this.mView, this.mViewLifecycleOwner);
        p082i1.g.b(this.mView, this.mViewLifecycleOwner);
        this.mViewLifecycleOwnerLiveData.n(this.mViewLifecycleOwner);
    }

    void performDestroy() {
        this.mChildFragmentManager.F();
        this.mLifecycleRegistry.i(AbstractC1157q.a.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (this.mCalled) {
            return;
        }
        throw new d0("Fragment " + this + " did not call through to super.onDestroy()");
    }

    void performDestroyView() {
        this.mChildFragmentManager.G();
        if (this.mView != null && this.mViewLifecycleOwner.getLifecycle().b().e(AbstractC1157q.b.CREATED)) {
            this.mViewLifecycleOwner.a(AbstractC1157q.a.ON_DESTROY);
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            androidx.loader.app.a.b(this).c();
            this.mPerformedCreateView = false;
        } else {
            throw new d0("Fragment " + this + " did not call through to super.onDestroyView()");
        }
    }

    void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (this.mCalled) {
            if (this.mChildFragmentManager.K0()) {
                return;
            }
            this.mChildFragmentManager.F();
            this.mChildFragmentManager = new K();
            return;
        }
        throw new d0("Fragment " + this + " did not call through to super.onDetach()");
    }

    LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = layoutInflaterOnGetLayoutInflater;
        return layoutInflaterOnGetLayoutInflater;
    }

    void performLowMemory() {
        onLowMemory();
    }

    void performMultiWindowModeChanged(boolean z9) {
        onMultiWindowModeChanged(z9);
    }

    boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.L(menuItem);
    }

    void performOptionsMenuClosed(Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.M(menu);
    }

    void performPause() {
        this.mChildFragmentManager.O();
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(AbstractC1157q.a.ON_PAUSE);
        }
        this.mLifecycleRegistry.i(AbstractC1157q.a.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (this.mCalled) {
            return;
        }
        throw new d0("Fragment " + this + " did not call through to super.onPause()");
    }

    void performPictureInPictureModeChanged(boolean z9) {
        onPictureInPictureModeChanged(z9);
    }

    boolean performPrepareOptionsMenu(Menu menu) {
        boolean z9 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z9 = true;
        }
        return this.mChildFragmentManager.Q(menu) | z9;
    }

    void performPrimaryNavigationFragmentChanged() {
        boolean zQ0 = this.mFragmentManager.Q0(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != zQ0) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(zQ0);
            onPrimaryNavigationFragmentChanged(zQ0);
            this.mChildFragmentManager.R();
        }
    }

    void performResume() {
        this.mChildFragmentManager.X0();
        this.mChildFragmentManager.c0(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new d0("Fragment " + this + " did not call through to super.onResume()");
        }
        C1165z c1165z = this.mLifecycleRegistry;
        AbstractC1157q.a aVar = AbstractC1157q.a.ON_RESUME;
        c1165z.i(aVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(aVar);
        }
        this.mChildFragmentManager.S();
    }

    void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
    }

    void performStart() {
        this.mChildFragmentManager.X0();
        this.mChildFragmentManager.c0(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new d0("Fragment " + this + " did not call through to super.onStart()");
        }
        C1165z c1165z = this.mLifecycleRegistry;
        AbstractC1157q.a aVar = AbstractC1157q.a.ON_START;
        c1165z.i(aVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(aVar);
        }
        this.mChildFragmentManager.T();
    }

    void performStop() {
        this.mChildFragmentManager.V();
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(AbstractC1157q.a.ON_STOP);
        }
        this.mLifecycleRegistry.i(AbstractC1157q.a.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (this.mCalled) {
            return;
        }
        throw new d0("Fragment " + this + " did not call through to super.onStop()");
    }

    void performViewCreated() {
        Bundle bundle = this.mSavedFragmentState;
        onViewCreated(this.mView, bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.mChildFragmentManager.W();
    }

    public void postponeEnterTransition() {
        W().f13234t = true;
    }

    public final <I, O> p030d.c registerForActivityResult(p040e.a aVar, p030d.b bVar) {
        return a0(aVar, new h(), bVar);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(String[] strArr, int i10) {
        if (this.mHost != null) {
            getParentFragmentManager().T0(this, strArr, i10);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public final AbstractActivityC1136v requireActivity() {
        AbstractActivityC1136v activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @Deprecated
    public final J requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a host.");
    }

    public final AbstractComponentCallbacksC1132q requireParentFragment() {
        AbstractComponentCallbacksC1132q parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException("Fragment " + this + " is not attached to any Fragment or host");
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    void restoreChildFragmentState() {
        Bundle bundle;
        Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.mChildFragmentManager.o1(bundle);
        this.mChildFragmentManager.D();
    }

    final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (this.mCalled) {
            if (this.mView != null) {
                this.mViewLifecycleOwner.a(AbstractC1157q.a.ON_CREATE);
            }
        } else {
            throw new d0("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z9) {
        W().f13231q = Boolean.valueOf(z9);
    }

    public void setAllowReturnTransitionOverlap(boolean z9) {
        W().f13230p = Boolean.valueOf(z9);
    }

    void setAnimations(int i10, int i11, int i12, int i13) {
        if (this.mAnimationInfo == null && i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return;
        }
        W().f13217c = i10;
        W().f13218d = i11;
        W().f13219e = i12;
        W().f13220f = i13;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(p161q0.q qVar) {
        W().getClass();
    }

    public void setEnterTransition(Object obj) {
        W().f13224j = obj;
    }

    public void setExitSharedElementCallback(p161q0.q qVar) {
        W().getClass();
    }

    public void setExitTransition(Object obj) {
        W().f13226l = obj;
    }

    void setFocusedView(View view) {
        W().f13233s = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z9) {
        if (this.mHasMenu != z9) {
            this.mHasMenu = z9;
            if (!isAdded() || isHidden()) {
                return;
            }
            this.mHost.z();
        }
    }

    public void setInitialSavedState(n nVar) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            throw new IllegalStateException("Fragment already added");
        }
        if (nVar == null || (bundle = nVar.f13235q) == null) {
            bundle = null;
        }
        this.mSavedFragmentState = bundle;
    }

    public void setMenuVisibility(boolean z9) {
        if (this.mMenuVisible != z9) {
            this.mMenuVisible = z9;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.z();
            }
        }
    }

    void setNextTransition(int i10) {
        if (this.mAnimationInfo == null && i10 == 0) {
            return;
        }
        W();
        this.mAnimationInfo.f13221g = i10;
    }

    void setPopDirection(boolean z9) {
        if (this.mAnimationInfo == null) {
            return;
        }
        W().f13216b = z9;
    }

    void setPostOnViewCreatedAlpha(float f10) {
        W().f13232r = f10;
    }

    public void setReenterTransition(Object obj) {
        W().f13227m = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z9) {
        U0.c.k(this);
        this.mRetainInstance = z9;
        J j9 = this.mFragmentManager;
        if (j9 == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z9) {
            j9.l(this);
        } else {
            j9.m1(this);
        }
    }

    public void setReturnTransition(Object obj) {
        W().f13225k = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        W().f13228n = obj;
    }

    void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        W();
        k kVar = this.mAnimationInfo;
        kVar.f13222h = arrayList;
        kVar.f13223i = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        W().f13229o = obj;
    }

    @Deprecated
    public void setTargetFragment(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q, int i10) {
        if (abstractComponentCallbacksC1132q != null) {
            U0.c.l(this, abstractComponentCallbacksC1132q, i10);
        }
        J j9 = this.mFragmentManager;
        J j10 = abstractComponentCallbacksC1132q != null ? abstractComponentCallbacksC1132q.mFragmentManager : null;
        if (j9 != null && j10 != null && j9 != j10) {
            throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC1132q + " must share the same FragmentManager to be set as a target fragment");
        }
        for (AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qY = abstractComponentCallbacksC1132q; abstractComponentCallbacksC1132qY != null; abstractComponentCallbacksC1132qY = abstractComponentCallbacksC1132qY.Y(false)) {
            if (abstractComponentCallbacksC1132qY.equals(this)) {
                throw new IllegalArgumentException("Setting " + abstractComponentCallbacksC1132q + " as the target of " + this + " would create a target cycle");
            }
        }
        if (abstractComponentCallbacksC1132q == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager == null || abstractComponentCallbacksC1132q.mFragmentManager == null) {
            this.mTargetWho = null;
            this.mTarget = abstractComponentCallbacksC1132q;
        } else {
            this.mTargetWho = abstractComponentCallbacksC1132q.mWho;
            this.mTarget = null;
        }
        this.mTargetRequestCode = i10;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z9) {
        U0.c.m(this, z9);
        if (!this.mUserVisibleHint && z9 && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            J j9 = this.mFragmentManager;
            j9.Z0(j9.x(this));
        }
        this.mUserVisibleHint = z9;
        this.mDeferStart = this.mState < 5 && !z9;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z9);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        A a10 = this.mHost;
        if (a10 != null) {
            return a10.w(str);
        }
        return false;
    }

    public void startActivity(Intent intent) {
        startActivity(intent, null);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i10) {
        startActivityForResult(intent, i10, null);
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        Bundle bundle2;
        if (this.mHost == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        if (J.L0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" received the following in startIntentSenderForResult() requestCode: ");
            sb.append(i10);
            sb.append(" IntentSender: ");
            sb.append(intentSender);
            sb.append(" fillInIntent: ");
            sb.append(intent);
            sb.append(" options: ");
            bundle2 = bundle;
            sb.append(bundle2);
            Log.v("FragmentManager", sb.toString());
        } else {
            bundle2 = bundle;
        }
        getParentFragmentManager().V0(this, intentSender, i10, intent, i11, i12, i13, bundle2);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !W().f13234t) {
            return;
        }
        if (this.mHost == null) {
            W().f13234t = false;
        } else if (Looper.myLooper() != this.mHost.k().getLooper()) {
            this.mHost.k().postAtFrontOfQueue(new d());
        } else {
            callStartTransitionListener(true);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(Optimizer.OPTIMIZATION_GRAPH_WRAP);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" tag=");
            sb.append(this.mTag);
        }
        sb.append(")");
        return sb.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    /* JADX INFO: renamed from: androidx.fragment.app.q$n */
    public static class n implements Parcelable {
        public static final Parcelable.Creator<n> CREATOR = new a();

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final Bundle f13235q;

        /* JADX INFO: renamed from: androidx.fragment.app.q$n$a */
        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public n createFromParcel(Parcel parcel) {
                return new n(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public n createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new n(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public n[] newArray(int i10) {
                return new n[i10];
            }
        }

        n(Bundle bundle) {
            this.f13235q = bundle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeBundle(this.f13235q);
        }

        n(Parcel parcel, ClassLoader classLoader) {
            Bundle bundle = parcel.readBundle();
            this.f13235q = bundle;
            if (classLoader == null || bundle == null) {
                return;
            }
            bundle.setClassLoader(classLoader);
        }
    }

    @Deprecated
    public static AbstractComponentCallbacksC1132q instantiate(Context context, String str, Bundle bundle) {
        try {
            AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q = (AbstractComponentCallbacksC1132q) AbstractC1140z.d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle == null) {
                return abstractComponentCallbacksC1132q;
            }
            bundle.setClassLoader(abstractComponentCallbacksC1132q.getClass().getClassLoader());
            abstractComponentCallbacksC1132q.setArguments(bundle);
            return abstractComponentCallbacksC1132q;
        } catch (IllegalAccessException e10) {
            throw new l("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e10);
        } catch (InstantiationException e11) {
            throw new l("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e11);
        } catch (NoSuchMethodException e12) {
            throw new l("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e12);
        } catch (InvocationTargetException e13) {
            throw new l("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e13);
        }
    }

    public final String getString(int i10, Object... objArr) {
        return getResources().getString(i10, objArr);
    }

    public final void postponeEnterTransition(long j9, TimeUnit timeUnit) {
        W().f13234t = true;
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
        }
        J j10 = this.mFragmentManager;
        if (j10 != null) {
            this.mPostponedHandler = j10.y0().k();
        } else {
            this.mPostponedHandler = new Handler(Looper.getMainLooper());
        }
        this.mPostponedHandler.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j9));
    }

    public final <I, O> p030d.c registerForActivityResult(p040e.a aVar, p030d.e eVar, p030d.b bVar) {
        return a0(aVar, new i(eVar), bVar);
    }

    public void startActivity(Intent intent, Bundle bundle) {
        A a10 = this.mHost;
        if (a10 != null) {
            a10.x(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i10, Bundle bundle) {
        if (this.mHost != null) {
            getParentFragmentManager().U0(this, intent, i10, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        A a10 = this.mHost;
        if (a10 != null) {
            LayoutInflater layoutInflaterT = a10.t();
            AbstractC1079k.a(layoutInflaterT, this.mChildFragmentManager.z0());
            return layoutInflaterT;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }
}
