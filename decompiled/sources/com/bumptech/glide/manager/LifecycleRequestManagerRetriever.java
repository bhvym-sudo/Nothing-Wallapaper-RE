package com.bumptech.glide.manager;

import android.content.Context;
import androidx.fragment.app.AbstractComponentCallbacksC1132q;
import androidx.fragment.app.J;
import androidx.lifecycle.AbstractC1157q;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.util.Util;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class LifecycleRequestManagerRetriever {
    private final RequestManagerRetriever.RequestManagerFactory factory;
    final Map<AbstractC1157q, RequestManager> lifecycleToRequestManager = new HashMap();

    private final class SupportRequestManagerTreeNode implements RequestManagerTreeNode {
        private final J childFragmentManager;

        SupportRequestManagerTreeNode(J j9) {
            this.childFragmentManager = j9;
        }

        private void getChildFragmentsRecursive(J j9, Set<RequestManager> set) {
            List listX0 = j9.x0();
            int size = listX0.size();
            for (int i10 = 0; i10 < size; i10++) {
                AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q = (AbstractComponentCallbacksC1132q) listX0.get(i10);
                getChildFragmentsRecursive(abstractComponentCallbacksC1132q.getChildFragmentManager(), set);
                RequestManager only = LifecycleRequestManagerRetriever.this.getOnly(abstractComponentCallbacksC1132q.getLifecycle());
                if (only != null) {
                    set.add(only);
                }
            }
        }

        @Override // com.bumptech.glide.manager.RequestManagerTreeNode
        public Set<RequestManager> getDescendants() {
            HashSet hashSet = new HashSet();
            getChildFragmentsRecursive(this.childFragmentManager, hashSet);
            return hashSet;
        }
    }

    LifecycleRequestManagerRetriever(RequestManagerRetriever.RequestManagerFactory requestManagerFactory) {
        this.factory = requestManagerFactory;
    }

    RequestManager getOnly(AbstractC1157q abstractC1157q) {
        Util.assertMainThread();
        return this.lifecycleToRequestManager.get(abstractC1157q);
    }

    RequestManager getOrCreate(Context context, Glide glide, final AbstractC1157q abstractC1157q, J j9, boolean z9) {
        Util.assertMainThread();
        RequestManager only = getOnly(abstractC1157q);
        if (only != null) {
            return only;
        }
        LifecycleLifecycle lifecycleLifecycle = new LifecycleLifecycle(abstractC1157q);
        RequestManager requestManagerBuild = this.factory.build(glide, lifecycleLifecycle, new SupportRequestManagerTreeNode(j9), context);
        this.lifecycleToRequestManager.put(abstractC1157q, requestManagerBuild);
        lifecycleLifecycle.addListener(new LifecycleListener() { // from class: com.bumptech.glide.manager.LifecycleRequestManagerRetriever.1
            @Override // com.bumptech.glide.manager.LifecycleListener
            public void onDestroy() {
                LifecycleRequestManagerRetriever.this.lifecycleToRequestManager.remove(abstractC1157q);
            }

            @Override // com.bumptech.glide.manager.LifecycleListener
            public void onStart() {
            }

            @Override // com.bumptech.glide.manager.LifecycleListener
            public void onStop() {
            }
        });
        if (z9) {
            requestManagerBuild.onStart();
        }
        return requestManagerBuild;
    }
}
