package androidx.viewpager2.adapter;

import B0.i;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.collection.C1022b;
import androidx.collection.r;
import androidx.core.view.H;
import androidx.fragment.app.AbstractActivityC1136v;
import androidx.fragment.app.AbstractComponentCallbacksC1132q;
import androidx.fragment.app.J;
import androidx.fragment.app.S;
import androidx.lifecycle.AbstractC1157q;
import androidx.lifecycle.InterfaceC1160u;
import androidx.lifecycle.InterfaceC1163x;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class FragmentStateAdapter extends RecyclerView.Adapter<FragmentViewHolder> implements StatefulAdapter {
    private static final long GRACE_WINDOW_TIME_MS = 10000;
    private static final String KEY_PREFIX_FRAGMENT = "f#";
    private static final String KEY_PREFIX_STATE = "s#";
    FragmentEventDispatcher mFragmentEventDispatcher;
    final J mFragmentManager;
    private FragmentMaxLifecycleEnforcer mFragmentMaxLifecycleEnforcer;
    final r mFragments;
    private boolean mHasStaleFragments;
    boolean mIsInGracePeriod;
    private final r mItemIdToViewHolder;
    final AbstractC1157q mLifecycle;
    private final r mSavedStates;

    private static abstract class DataSetChangeObserver extends RecyclerView.AdapterDataObserver {
        private DataSetChangeObserver() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public abstract void onChanged();

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i10, int i11) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeInserted(int i10, int i11) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeMoved(int i10, int i11, int i12) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeRemoved(int i10, int i11) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i10, int i11, Object obj) {
            onChanged();
        }
    }

    public @interface ExperimentalFragmentStateAdapterApi {
    }

    static class FragmentEventDispatcher {
        private List<FragmentTransactionCallback> mCallbacks = new CopyOnWriteArrayList();

        FragmentEventDispatcher() {
        }

        public List<FragmentTransactionCallback.OnPostEventListener> dispatchMaxLifecyclePreUpdated(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q, AbstractC1157q.b bVar) {
            ArrayList arrayList = new ArrayList();
            Iterator<FragmentTransactionCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().onFragmentMaxLifecyclePreUpdated(abstractComponentCallbacksC1132q, bVar));
            }
            return arrayList;
        }

        public void dispatchPostEvents(List<FragmentTransactionCallback.OnPostEventListener> list) {
            Iterator<FragmentTransactionCallback.OnPostEventListener> it = list.iterator();
            while (it.hasNext()) {
                it.next().onPost();
            }
        }

        public List<FragmentTransactionCallback.OnPostEventListener> dispatchPreAdded(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
            ArrayList arrayList = new ArrayList();
            Iterator<FragmentTransactionCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().onFragmentPreAdded(abstractComponentCallbacksC1132q));
            }
            return arrayList;
        }

        public List<FragmentTransactionCallback.OnPostEventListener> dispatchPreRemoved(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
            ArrayList arrayList = new ArrayList();
            Iterator<FragmentTransactionCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().onFragmentPreRemoved(abstractComponentCallbacksC1132q));
            }
            return arrayList;
        }

        public List<FragmentTransactionCallback.OnPostEventListener> dispatchPreSavedInstanceState(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
            ArrayList arrayList = new ArrayList();
            Iterator<FragmentTransactionCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().onFragmentPreSavedInstanceState(abstractComponentCallbacksC1132q));
            }
            return arrayList;
        }

        public void registerCallback(FragmentTransactionCallback fragmentTransactionCallback) {
            this.mCallbacks.add(fragmentTransactionCallback);
        }

        public void unregisterCallback(FragmentTransactionCallback fragmentTransactionCallback) {
            this.mCallbacks.remove(fragmentTransactionCallback);
        }
    }

    class FragmentMaxLifecycleEnforcer {
        private RecyclerView.AdapterDataObserver mDataObserver;
        private InterfaceC1160u mLifecycleObserver;
        private ViewPager2.OnPageChangeCallback mPageChangeCallback;
        private long mPrimaryItemId = -1;
        private ViewPager2 mViewPager;

        FragmentMaxLifecycleEnforcer() {
        }

        private ViewPager2 inferViewPager(RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        void register(RecyclerView recyclerView) {
            this.mViewPager = inferViewPager(recyclerView);
            ViewPager2.OnPageChangeCallback onPageChangeCallback = new ViewPager2.OnPageChangeCallback() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.1
                @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
                public void onPageScrollStateChanged(int i10) {
                    FragmentMaxLifecycleEnforcer.this.updateFragmentMaxLifecycle(false);
                }

                @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
                public void onPageSelected(int i10) {
                    FragmentMaxLifecycleEnforcer.this.updateFragmentMaxLifecycle(false);
                }
            };
            this.mPageChangeCallback = onPageChangeCallback;
            this.mViewPager.registerOnPageChangeCallback(onPageChangeCallback);
            DataSetChangeObserver dataSetChangeObserver = new DataSetChangeObserver() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.2
                @Override // androidx.viewpager2.adapter.FragmentStateAdapter.DataSetChangeObserver, androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
                public void onChanged() {
                    FragmentMaxLifecycleEnforcer.this.updateFragmentMaxLifecycle(true);
                }
            };
            this.mDataObserver = dataSetChangeObserver;
            FragmentStateAdapter.this.registerAdapterDataObserver(dataSetChangeObserver);
            InterfaceC1160u interfaceC1160u = new InterfaceC1160u() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.3
                @Override // androidx.lifecycle.InterfaceC1160u
                public void onStateChanged(InterfaceC1163x interfaceC1163x, AbstractC1157q.a aVar) {
                    FragmentMaxLifecycleEnforcer.this.updateFragmentMaxLifecycle(false);
                }
            };
            this.mLifecycleObserver = interfaceC1160u;
            FragmentStateAdapter.this.mLifecycle.a(interfaceC1160u);
        }

        void unregister(RecyclerView recyclerView) {
            inferViewPager(recyclerView).unregisterOnPageChangeCallback(this.mPageChangeCallback);
            FragmentStateAdapter.this.unregisterAdapterDataObserver(this.mDataObserver);
            FragmentStateAdapter.this.mLifecycle.d(this.mLifecycleObserver);
            this.mViewPager = null;
        }

        void updateFragmentMaxLifecycle(boolean z9) {
            int currentItem;
            AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q;
            if (FragmentStateAdapter.this.shouldDelayFragmentTransactions() || this.mViewPager.getScrollState() != 0 || FragmentStateAdapter.this.mFragments.j() || FragmentStateAdapter.this.getItemCount() == 0 || (currentItem = this.mViewPager.getCurrentItem()) >= FragmentStateAdapter.this.getItemCount()) {
                return;
            }
            long itemId = FragmentStateAdapter.this.getItemId(currentItem);
            if ((itemId != this.mPrimaryItemId || z9) && (abstractComponentCallbacksC1132q = (AbstractComponentCallbacksC1132q) FragmentStateAdapter.this.mFragments.h(itemId)) != null && abstractComponentCallbacksC1132q.isAdded()) {
                this.mPrimaryItemId = itemId;
                S sP = FragmentStateAdapter.this.mFragmentManager.p();
                ArrayList arrayList = new ArrayList();
                AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q2 = null;
                for (int i10 = 0; i10 < FragmentStateAdapter.this.mFragments.o(); i10++) {
                    long jK = FragmentStateAdapter.this.mFragments.k(i10);
                    AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q3 = (AbstractComponentCallbacksC1132q) FragmentStateAdapter.this.mFragments.p(i10);
                    if (abstractComponentCallbacksC1132q3.isAdded()) {
                        if (jK != this.mPrimaryItemId) {
                            AbstractC1157q.b bVar = AbstractC1157q.b.STARTED;
                            sP.v(abstractComponentCallbacksC1132q3, bVar);
                            arrayList.add(FragmentStateAdapter.this.mFragmentEventDispatcher.dispatchMaxLifecyclePreUpdated(abstractComponentCallbacksC1132q3, bVar));
                        } else {
                            abstractComponentCallbacksC1132q2 = abstractComponentCallbacksC1132q3;
                        }
                        abstractComponentCallbacksC1132q3.setMenuVisibility(jK == this.mPrimaryItemId);
                    }
                }
                if (abstractComponentCallbacksC1132q2 != null) {
                    AbstractC1157q.b bVar2 = AbstractC1157q.b.RESUMED;
                    sP.v(abstractComponentCallbacksC1132q2, bVar2);
                    arrayList.add(FragmentStateAdapter.this.mFragmentEventDispatcher.dispatchMaxLifecyclePreUpdated(abstractComponentCallbacksC1132q2, bVar2));
                }
                if (sP.p()) {
                    return;
                }
                sP.k();
                Collections.reverse(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    FragmentStateAdapter.this.mFragmentEventDispatcher.dispatchPostEvents((List) it.next());
                }
            }
        }
    }

    public static abstract class FragmentTransactionCallback {
        private static final OnPostEventListener NO_OP = new OnPostEventListener() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.FragmentTransactionCallback.1
            @Override // androidx.viewpager2.adapter.FragmentStateAdapter.FragmentTransactionCallback.OnPostEventListener
            public void onPost() {
            }
        };

        public interface OnPostEventListener {
            void onPost();
        }

        public OnPostEventListener onFragmentMaxLifecyclePreUpdated(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q, AbstractC1157q.b bVar) {
            return NO_OP;
        }

        public OnPostEventListener onFragmentPreAdded(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
            return NO_OP;
        }

        public OnPostEventListener onFragmentPreRemoved(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
            return NO_OP;
        }

        @ExperimentalFragmentStateAdapterApi
        public OnPostEventListener onFragmentPreSavedInstanceState(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
            return NO_OP;
        }
    }

    public FragmentStateAdapter(AbstractActivityC1136v abstractActivityC1136v) {
        this(abstractActivityC1136v.o0(), abstractActivityC1136v.getLifecycle());
    }

    private static String createKey(String str, long j9) {
        return str + j9;
    }

    private void ensureFragment(int i10) {
        long itemId = getItemId(i10);
        if (this.mFragments.e(itemId)) {
            return;
        }
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qCreateFragment = createFragment(i10);
        abstractComponentCallbacksC1132qCreateFragment.setInitialSavedState((AbstractComponentCallbacksC1132q.n) this.mSavedStates.h(itemId));
        this.mFragments.l(itemId, abstractComponentCallbacksC1132qCreateFragment);
    }

    private boolean isFragmentViewBound(long j9) {
        View view;
        if (this.mItemIdToViewHolder.e(j9)) {
            return true;
        }
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q = (AbstractComponentCallbacksC1132q) this.mFragments.h(j9);
        return (abstractComponentCallbacksC1132q == null || (view = abstractComponentCallbacksC1132q.getView()) == null || view.getParent() == null) ? false : true;
    }

    private static boolean isValidKey(String str, String str2) {
        return str.startsWith(str2) && str.length() > str2.length();
    }

    private Long itemForViewHolder(int i10) {
        Long lValueOf = null;
        for (int i11 = 0; i11 < this.mItemIdToViewHolder.o(); i11++) {
            if (((Integer) this.mItemIdToViewHolder.p(i11)).intValue() == i10) {
                if (lValueOf != null) {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
                lValueOf = Long.valueOf(this.mItemIdToViewHolder.k(i11));
            }
        }
        return lValueOf;
    }

    private static long parseIdFromKey(String str, String str2) {
        return Long.parseLong(str.substring(str2.length()));
    }

    private void removeFragment(long j9) {
        ViewParent parent;
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q = (AbstractComponentCallbacksC1132q) this.mFragments.h(j9);
        if (abstractComponentCallbacksC1132q == null) {
            return;
        }
        if (abstractComponentCallbacksC1132q.getView() != null && (parent = abstractComponentCallbacksC1132q.getView().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        if (!containsItem(j9)) {
            this.mSavedStates.m(j9);
        }
        if (!abstractComponentCallbacksC1132q.isAdded()) {
            this.mFragments.m(j9);
            return;
        }
        if (shouldDelayFragmentTransactions()) {
            this.mHasStaleFragments = true;
            return;
        }
        if (abstractComponentCallbacksC1132q.isAdded() && containsItem(j9)) {
            List<FragmentTransactionCallback.OnPostEventListener> listDispatchPreSavedInstanceState = this.mFragmentEventDispatcher.dispatchPreSavedInstanceState(abstractComponentCallbacksC1132q);
            AbstractComponentCallbacksC1132q.n nVarR1 = this.mFragmentManager.r1(abstractComponentCallbacksC1132q);
            this.mFragmentEventDispatcher.dispatchPostEvents(listDispatchPreSavedInstanceState);
            this.mSavedStates.l(j9, nVarR1);
        }
        List<FragmentTransactionCallback.OnPostEventListener> listDispatchPreRemoved = this.mFragmentEventDispatcher.dispatchPreRemoved(abstractComponentCallbacksC1132q);
        try {
            this.mFragmentManager.p().q(abstractComponentCallbacksC1132q).k();
            this.mFragments.m(j9);
        } finally {
            this.mFragmentEventDispatcher.dispatchPostEvents(listDispatchPreRemoved);
        }
    }

    private void scheduleGracePeriodEnd() {
        final Handler handler = new Handler(Looper.getMainLooper());
        final Runnable runnable = new Runnable() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.3
            @Override // java.lang.Runnable
            public void run() {
                FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
                fragmentStateAdapter.mIsInGracePeriod = false;
                fragmentStateAdapter.gcFragments();
            }
        };
        this.mLifecycle.a(new InterfaceC1160u() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.4
            @Override // androidx.lifecycle.InterfaceC1160u
            public void onStateChanged(InterfaceC1163x interfaceC1163x, AbstractC1157q.a aVar) {
                if (aVar == AbstractC1157q.a.ON_DESTROY) {
                    handler.removeCallbacks(runnable);
                    interfaceC1163x.getLifecycle().d(this);
                }
            }
        });
        handler.postDelayed(runnable, GRACE_WINDOW_TIME_MS);
    }

    private void scheduleViewAttach(final AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q, final FrameLayout frameLayout) {
        this.mFragmentManager.j1(new J.k() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.2
            @Override // androidx.fragment.app.J.k
            public void onFragmentViewCreated(J j9, AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q2, View view, Bundle bundle) {
                if (abstractComponentCallbacksC1132q2 == abstractComponentCallbacksC1132q) {
                    j9.A1(this);
                    FragmentStateAdapter.this.addViewToContainer(view, frameLayout);
                }
            }
        }, false);
    }

    void addViewToContainer(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }

    public boolean containsItem(long j9) {
        return j9 >= 0 && j9 < ((long) getItemCount());
    }

    public abstract AbstractComponentCallbacksC1132q createFragment(int i10);

    void gcFragments() {
        if (!this.mHasStaleFragments || shouldDelayFragmentTransactions()) {
            return;
        }
        C1022b c1022b = new C1022b();
        for (int i10 = 0; i10 < this.mFragments.o(); i10++) {
            long jK = this.mFragments.k(i10);
            if (!containsItem(jK)) {
                c1022b.add(Long.valueOf(jK));
                this.mItemIdToViewHolder.m(jK);
            }
        }
        if (!this.mIsInGracePeriod) {
            this.mHasStaleFragments = false;
            for (int i11 = 0; i11 < this.mFragments.o(); i11++) {
                long jK2 = this.mFragments.k(i11);
                if (!isFragmentViewBound(jK2)) {
                    c1022b.add(Long.valueOf(jK2));
                }
            }
        }
        Iterator it = c1022b.iterator();
        while (it.hasNext()) {
            removeFragment(((Long) it.next()).longValue());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        i.a(this.mFragmentMaxLifecycleEnforcer == null);
        FragmentMaxLifecycleEnforcer fragmentMaxLifecycleEnforcer = new FragmentMaxLifecycleEnforcer();
        this.mFragmentMaxLifecycleEnforcer = fragmentMaxLifecycleEnforcer;
        fragmentMaxLifecycleEnforcer.register(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.mFragmentMaxLifecycleEnforcer.unregister(recyclerView);
        this.mFragmentMaxLifecycleEnforcer = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final boolean onFailedToRecycleView(FragmentViewHolder fragmentViewHolder) {
        return true;
    }

    void placeFragmentInViewHolder(final FragmentViewHolder fragmentViewHolder) {
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q = (AbstractComponentCallbacksC1132q) this.mFragments.h(fragmentViewHolder.getItemId());
        if (abstractComponentCallbacksC1132q == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        FrameLayout container = fragmentViewHolder.getContainer();
        View view = abstractComponentCallbacksC1132q.getView();
        if (!abstractComponentCallbacksC1132q.isAdded() && view != null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (abstractComponentCallbacksC1132q.isAdded() && view == null) {
            scheduleViewAttach(abstractComponentCallbacksC1132q, container);
            return;
        }
        if (abstractComponentCallbacksC1132q.isAdded() && view.getParent() != null) {
            if (view.getParent() != container) {
                addViewToContainer(view, container);
                return;
            }
            return;
        }
        if (abstractComponentCallbacksC1132q.isAdded()) {
            addViewToContainer(view, container);
            return;
        }
        if (shouldDelayFragmentTransactions()) {
            if (this.mFragmentManager.K0()) {
                return;
            }
            this.mLifecycle.a(new InterfaceC1160u() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.1
                @Override // androidx.lifecycle.InterfaceC1160u
                public void onStateChanged(InterfaceC1163x interfaceC1163x, AbstractC1157q.a aVar) {
                    if (FragmentStateAdapter.this.shouldDelayFragmentTransactions()) {
                        return;
                    }
                    interfaceC1163x.getLifecycle().d(this);
                    if (H.L(fragmentViewHolder.getContainer())) {
                        FragmentStateAdapter.this.placeFragmentInViewHolder(fragmentViewHolder);
                    }
                }
            });
            return;
        }
        scheduleViewAttach(abstractComponentCallbacksC1132q, container);
        List<FragmentTransactionCallback.OnPostEventListener> listDispatchPreAdded = this.mFragmentEventDispatcher.dispatchPreAdded(abstractComponentCallbacksC1132q);
        try {
            abstractComponentCallbacksC1132q.setMenuVisibility(false);
            this.mFragmentManager.p().e(abstractComponentCallbacksC1132q, "f" + fragmentViewHolder.getItemId()).v(abstractComponentCallbacksC1132q, AbstractC1157q.b.STARTED).k();
            this.mFragmentMaxLifecycleEnforcer.updateFragmentMaxLifecycle(false);
        } finally {
            this.mFragmentEventDispatcher.dispatchPostEvents(listDispatchPreAdded);
        }
    }

    public void registerFragmentTransactionCallback(FragmentTransactionCallback fragmentTransactionCallback) {
        this.mFragmentEventDispatcher.registerCallback(fragmentTransactionCallback);
    }

    @Override // androidx.viewpager2.adapter.StatefulAdapter
    public final void restoreState(Parcelable parcelable) {
        if (!this.mSavedStates.j() || !this.mFragments.j()) {
            throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
        }
        Bundle bundle = (Bundle) parcelable;
        if (bundle.getClassLoader() == null) {
            bundle.setClassLoader(getClass().getClassLoader());
        }
        for (String str : bundle.keySet()) {
            if (isValidKey(str, KEY_PREFIX_FRAGMENT)) {
                this.mFragments.l(parseIdFromKey(str, KEY_PREFIX_FRAGMENT), this.mFragmentManager.u0(bundle, str));
            } else {
                if (!isValidKey(str, KEY_PREFIX_STATE)) {
                    throw new IllegalArgumentException("Unexpected key in savedState: " + str);
                }
                long idFromKey = parseIdFromKey(str, KEY_PREFIX_STATE);
                AbstractComponentCallbacksC1132q.n nVar = (AbstractComponentCallbacksC1132q.n) bundle.getParcelable(str);
                if (containsItem(idFromKey)) {
                    this.mSavedStates.l(idFromKey, nVar);
                }
            }
        }
        if (this.mFragments.j()) {
            return;
        }
        this.mHasStaleFragments = true;
        this.mIsInGracePeriod = true;
        gcFragments();
        scheduleGracePeriodEnd();
    }

    @Override // androidx.viewpager2.adapter.StatefulAdapter
    public final Parcelable saveState() {
        Bundle bundle = new Bundle(this.mFragments.o() + this.mSavedStates.o());
        for (int i10 = 0; i10 < this.mFragments.o(); i10++) {
            long jK = this.mFragments.k(i10);
            AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q = (AbstractComponentCallbacksC1132q) this.mFragments.h(jK);
            if (abstractComponentCallbacksC1132q != null && abstractComponentCallbacksC1132q.isAdded()) {
                this.mFragmentManager.i1(bundle, createKey(KEY_PREFIX_FRAGMENT, jK), abstractComponentCallbacksC1132q);
            }
        }
        for (int i11 = 0; i11 < this.mSavedStates.o(); i11++) {
            long jK2 = this.mSavedStates.k(i11);
            if (containsItem(jK2)) {
                bundle.putParcelable(createKey(KEY_PREFIX_STATE, jK2), (Parcelable) this.mSavedStates.h(jK2));
            }
        }
        return bundle;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void setHasStableIds(boolean z9) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    boolean shouldDelayFragmentTransactions() {
        return this.mFragmentManager.S0();
    }

    public void unregisterFragmentTransactionCallback(FragmentTransactionCallback fragmentTransactionCallback) {
        this.mFragmentEventDispatcher.unregisterCallback(fragmentTransactionCallback);
    }

    public FragmentStateAdapter(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
        this(abstractComponentCallbacksC1132q.getChildFragmentManager(), abstractComponentCallbacksC1132q.getLifecycle());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(FragmentViewHolder fragmentViewHolder, int i10) {
        long itemId = fragmentViewHolder.getItemId();
        int id = fragmentViewHolder.getContainer().getId();
        Long lItemForViewHolder = itemForViewHolder(id);
        if (lItemForViewHolder != null && lItemForViewHolder.longValue() != itemId) {
            removeFragment(lItemForViewHolder.longValue());
            this.mItemIdToViewHolder.m(lItemForViewHolder.longValue());
        }
        this.mItemIdToViewHolder.l(itemId, Integer.valueOf(id));
        ensureFragment(i10);
        if (H.L(fragmentViewHolder.getContainer())) {
            placeFragmentInViewHolder(fragmentViewHolder);
        }
        gcFragments();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final FragmentViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return FragmentViewHolder.create(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(FragmentViewHolder fragmentViewHolder) {
        placeFragmentInViewHolder(fragmentViewHolder);
        gcFragments();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(FragmentViewHolder fragmentViewHolder) {
        Long lItemForViewHolder = itemForViewHolder(fragmentViewHolder.getContainer().getId());
        if (lItemForViewHolder != null) {
            removeFragment(lItemForViewHolder.longValue());
            this.mItemIdToViewHolder.m(lItemForViewHolder.longValue());
        }
    }

    public FragmentStateAdapter(J j9, AbstractC1157q abstractC1157q) {
        this.mFragments = new r();
        this.mSavedStates = new r();
        this.mItemIdToViewHolder = new r();
        this.mFragmentEventDispatcher = new FragmentEventDispatcher();
        this.mIsInGracePeriod = false;
        this.mHasStaleFragments = false;
        this.mFragmentManager = j9;
        this.mLifecycle = abstractC1157q;
        super.setHasStableIds(true);
    }
}
