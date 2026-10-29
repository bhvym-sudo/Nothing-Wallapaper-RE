package com.bumptech.glide.manager;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import androidx.collection.C1021a;
import androidx.fragment.app.AbstractActivityC1136v;
import androidx.fragment.app.AbstractComponentCallbacksC1132q;
import androidx.fragment.app.J;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.load.resource.bitmap.HardwareConfigState;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class RequestManagerRetriever implements Handler.Callback {
    private static final RequestManagerFactory DEFAULT_FACTORY = new RequestManagerFactory() { // from class: com.bumptech.glide.manager.RequestManagerRetriever.1
        @Override // com.bumptech.glide.manager.RequestManagerRetriever.RequestManagerFactory
        public RequestManager build(Glide glide, Lifecycle lifecycle, RequestManagerTreeNode requestManagerTreeNode, Context context) {
            return new RequestManager(glide, lifecycle, requestManagerTreeNode, context);
        }
    };
    static final String FRAGMENT_TAG = "com.bumptech.glide.manager";
    private volatile RequestManager applicationManager;
    private final RequestManagerFactory factory;
    private final FrameWaiter frameWaiter;
    private final LifecycleRequestManagerRetriever lifecycleRequestManagerRetriever;
    private final C1021a tempViewToSupportFragment = new C1021a();

    public interface RequestManagerFactory {
        RequestManager build(Glide glide, Lifecycle lifecycle, RequestManagerTreeNode requestManagerTreeNode, Context context);
    }

    public RequestManagerRetriever(RequestManagerFactory requestManagerFactory) {
        requestManagerFactory = requestManagerFactory == null ? DEFAULT_FACTORY : requestManagerFactory;
        this.factory = requestManagerFactory;
        this.lifecycleRequestManagerRetriever = new LifecycleRequestManagerRetriever(requestManagerFactory);
        this.frameWaiter = buildFrameWaiter();
    }

    @TargetApi(17)
    private static void assertNotDestroyed(Activity activity) {
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    private static FrameWaiter buildFrameWaiter() {
        return (HardwareConfigState.HARDWARE_BITMAPS_SUPPORTED && HardwareConfigState.BLOCK_HARDWARE_BITMAPS_WHEN_GL_CONTEXT_MIGHT_NOT_BE_INITIALIZED) ? new FirstFrameWaiter() : new DoNothingFirstFrameWaiter();
    }

    private static Activity findActivity(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return findActivity(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    private static void findAllSupportFragmentsWithViews(Collection<AbstractComponentCallbacksC1132q> collection, Map<View, AbstractComponentCallbacksC1132q> map) {
        if (collection == null) {
            return;
        }
        for (AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q : collection) {
            if (abstractComponentCallbacksC1132q != null && abstractComponentCallbacksC1132q.getView() != null) {
                map.put(abstractComponentCallbacksC1132q.getView(), abstractComponentCallbacksC1132q);
                findAllSupportFragmentsWithViews(abstractComponentCallbacksC1132q.getChildFragmentManager().x0(), map);
            }
        }
    }

    private AbstractComponentCallbacksC1132q findSupportFragment(View view, AbstractActivityC1136v abstractActivityC1136v) {
        this.tempViewToSupportFragment.clear();
        findAllSupportFragmentsWithViews(abstractActivityC1136v.o0().x0(), this.tempViewToSupportFragment);
        View viewFindViewById = abstractActivityC1136v.findViewById(R.id.content);
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q = null;
        while (!view.equals(viewFindViewById) && (abstractComponentCallbacksC1132q = (AbstractComponentCallbacksC1132q) this.tempViewToSupportFragment.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.tempViewToSupportFragment.clear();
        return abstractComponentCallbacksC1132q;
    }

    private RequestManager getApplicationManager(Context context) {
        if (this.applicationManager == null) {
            synchronized (this) {
                try {
                    if (this.applicationManager == null) {
                        this.applicationManager = this.factory.build(Glide.get(context.getApplicationContext()), new ApplicationLifecycle(), new EmptyRequestManagerTreeNode(), context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.applicationManager;
    }

    private static boolean isActivityVisible(Context context) {
        Activity activityFindActivity = findActivity(context);
        return activityFindActivity == null || !activityFindActivity.isFinishing();
    }

    public RequestManager get(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (Util.isOnMainThread() && !(context instanceof Application)) {
            if (context instanceof AbstractActivityC1136v) {
                return get((AbstractActivityC1136v) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return get(contextWrapper.getBaseContext());
                }
            }
        }
        return getApplicationManager(context);
    }

    @Override // android.os.Handler.Callback
    @Deprecated
    public boolean handleMessage(Message message) {
        return false;
    }

    public RequestManager get(AbstractActivityC1136v abstractActivityC1136v) {
        if (Util.isOnBackgroundThread()) {
            return get(abstractActivityC1136v.getApplicationContext());
        }
        assertNotDestroyed(abstractActivityC1136v);
        this.frameWaiter.registerSelf(abstractActivityC1136v);
        boolean zIsActivityVisible = isActivityVisible(abstractActivityC1136v);
        return this.lifecycleRequestManagerRetriever.getOrCreate(abstractActivityC1136v, Glide.get(abstractActivityC1136v.getApplicationContext()), abstractActivityC1136v.getLifecycle(), abstractActivityC1136v.o0(), zIsActivityVisible);
    }

    public RequestManager get(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
        Preconditions.checkNotNull(abstractComponentCallbacksC1132q.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (Util.isOnBackgroundThread()) {
            return get(abstractComponentCallbacksC1132q.getContext().getApplicationContext());
        }
        if (abstractComponentCallbacksC1132q.getActivity() != null) {
            this.frameWaiter.registerSelf(abstractComponentCallbacksC1132q.getActivity());
        }
        J childFragmentManager = abstractComponentCallbacksC1132q.getChildFragmentManager();
        Context context = abstractComponentCallbacksC1132q.getContext();
        return this.lifecycleRequestManagerRetriever.getOrCreate(context, Glide.get(context.getApplicationContext()), abstractComponentCallbacksC1132q.getLifecycle(), childFragmentManager, abstractComponentCallbacksC1132q.isVisible());
    }

    @Deprecated
    public RequestManager get(Activity activity) {
        return get(activity.getApplicationContext());
    }

    public RequestManager get(View view) {
        if (Util.isOnBackgroundThread()) {
            return get(view.getContext().getApplicationContext());
        }
        Preconditions.checkNotNull(view);
        Preconditions.checkNotNull(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity activityFindActivity = findActivity(view.getContext());
        if (activityFindActivity == null) {
            return get(view.getContext().getApplicationContext());
        }
        if (activityFindActivity instanceof AbstractActivityC1136v) {
            AbstractActivityC1136v abstractActivityC1136v = (AbstractActivityC1136v) activityFindActivity;
            AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qFindSupportFragment = findSupportFragment(view, abstractActivityC1136v);
            return abstractComponentCallbacksC1132qFindSupportFragment != null ? get(abstractComponentCallbacksC1132qFindSupportFragment) : get(abstractActivityC1136v);
        }
        return get(view.getContext().getApplicationContext());
    }

    @TargetApi(17)
    @Deprecated
    public RequestManager get(Fragment fragment) {
        if (fragment.getActivity() != null) {
            return get(fragment.getActivity().getApplicationContext());
        }
        throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
    }
}
