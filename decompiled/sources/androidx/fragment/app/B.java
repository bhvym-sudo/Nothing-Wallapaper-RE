package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
class B implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final J f12855q;

    class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ P f12856q;

        a(P p9) {
            this.f12856q = p9;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qK = this.f12856q.k();
            this.f12856q.m();
            b0.u((ViewGroup) abstractComponentCallbacksC1132qK.mView.getParent(), B.this.f12855q).q();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    B(J j9) {
        this.f12855q = j9;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        P pX;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f12855q);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, T0.c.f7404a);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(T0.c.f7405b);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(T0.c.f7406c, -1);
        String string = typedArrayObtainStyledAttributes.getString(T0.c.f7407d);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue == null || !AbstractC1140z.b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qJ0 = resourceId != -1 ? this.f12855q.j0(resourceId) : null;
        if (abstractComponentCallbacksC1132qJ0 == null && string != null) {
            abstractComponentCallbacksC1132qJ0 = this.f12855q.k0(string);
        }
        if (abstractComponentCallbacksC1132qJ0 == null && id != -1) {
            abstractComponentCallbacksC1132qJ0 = this.f12855q.j0(id);
        }
        if (abstractComponentCallbacksC1132qJ0 == null) {
            abstractComponentCallbacksC1132qJ0 = this.f12855q.w0().a(context.getClassLoader(), attributeValue);
            abstractComponentCallbacksC1132qJ0.mFromLayout = true;
            abstractComponentCallbacksC1132qJ0.mFragmentId = resourceId != 0 ? resourceId : id;
            abstractComponentCallbacksC1132qJ0.mContainerId = id;
            abstractComponentCallbacksC1132qJ0.mTag = string;
            abstractComponentCallbacksC1132qJ0.mInLayout = true;
            J j9 = this.f12855q;
            abstractComponentCallbacksC1132qJ0.mFragmentManager = j9;
            abstractComponentCallbacksC1132qJ0.mHost = j9.y0();
            abstractComponentCallbacksC1132qJ0.onInflate(this.f12855q.y0().h(), attributeSet, abstractComponentCallbacksC1132qJ0.mSavedFragmentState);
            pX = this.f12855q.j(abstractComponentCallbacksC1132qJ0);
            if (J.L0(2)) {
                Log.v("FragmentManager", "Fragment " + abstractComponentCallbacksC1132qJ0 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else {
            if (abstractComponentCallbacksC1132qJ0.mInLayout) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
            }
            abstractComponentCallbacksC1132qJ0.mInLayout = true;
            J j10 = this.f12855q;
            abstractComponentCallbacksC1132qJ0.mFragmentManager = j10;
            abstractComponentCallbacksC1132qJ0.mHost = j10.y0();
            abstractComponentCallbacksC1132qJ0.onInflate(this.f12855q.y0().h(), attributeSet, abstractComponentCallbacksC1132qJ0.mSavedFragmentState);
            pX = this.f12855q.x(abstractComponentCallbacksC1132qJ0);
            if (J.L0(2)) {
                Log.v("FragmentManager", "Retained Fragment " + abstractComponentCallbacksC1132qJ0 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        }
        ViewGroup viewGroup = (ViewGroup) view;
        U0.c.g(abstractComponentCallbacksC1132qJ0, viewGroup);
        abstractComponentCallbacksC1132qJ0.mContainer = viewGroup;
        pX.m();
        pX.j();
        View view2 = abstractComponentCallbacksC1132qJ0.mView;
        if (view2 == null) {
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        if (resourceId != 0) {
            view2.setId(resourceId);
        }
        if (abstractComponentCallbacksC1132qJ0.mView.getTag() == null) {
            abstractComponentCallbacksC1132qJ0.mView.setTag(string);
        }
        abstractComponentCallbacksC1132qJ0.mView.addOnAttachStateChangeListener(new a(pX));
        return abstractComponentCallbacksC1132qJ0.mView;
    }
}
