package com.google.android.material.button;

import N4.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import androidx.core.view.AbstractC1080l;
import androidx.core.view.C1069a;
import androidx.core.view.H;
import com.google.android.material.internal.k;
import com.google.android.material.internal.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import p225w4.j;

/* JADX INFO: loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final int f16638A = j.f28925v;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final List f16639q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final e f16640r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final LinkedHashSet f16641s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Comparator f16642t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Integer[] f16643u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f16644v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f16645w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f16646x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final int f16647y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Set f16648z;

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            int iCompareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            return iCompareTo2 != 0 ? iCompareTo2 : Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
        }
    }

    class b extends C1069a {
        b() {
        }

        @Override // androidx.core.view.C1069a
        public void onInitializeAccessibilityNodeInfo(View view, C0.d dVar) {
            super.onInitializeAccessibilityNodeInfo(view, dVar);
            dVar.j0(C0.d.f.a(0, 1, MaterialButtonToggleGroup.this.i(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    private static class c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final N4.d f16651e = new N4.a(0.0f);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        N4.d f16652a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        N4.d f16653b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        N4.d f16654c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        N4.d f16655d;

        c(N4.d dVar, N4.d dVar2, N4.d dVar3, N4.d dVar4) {
            this.f16652a = dVar;
            this.f16653b = dVar3;
            this.f16654c = dVar4;
            this.f16655d = dVar2;
        }

        public static c a(c cVar) {
            N4.d dVar = f16651e;
            return new c(dVar, cVar.f16655d, dVar, cVar.f16654c);
        }

        public static c b(c cVar, View view) {
            return n.g(view) ? c(cVar) : d(cVar);
        }

        public static c c(c cVar) {
            N4.d dVar = cVar.f16652a;
            N4.d dVar2 = cVar.f16655d;
            N4.d dVar3 = f16651e;
            return new c(dVar, dVar2, dVar3, dVar3);
        }

        public static c d(c cVar) {
            N4.d dVar = f16651e;
            return new c(dVar, dVar, cVar.f16653b, cVar.f16654c);
        }

        public static c e(c cVar, View view) {
            return n.g(view) ? d(cVar) : c(cVar);
        }

        public static c f(c cVar) {
            N4.d dVar = cVar.f16652a;
            N4.d dVar2 = f16651e;
            return new c(dVar, dVar2, cVar.f16653b, dVar2);
        }
    }

    public interface d {
        void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i10, boolean z9);
    }

    private class e implements MaterialButton.a {
        private e() {
        }

        @Override // com.google.android.material.button.MaterialButton.a
        public void a(MaterialButton materialButton, boolean z9) {
            MaterialButtonToggleGroup.this.invalidate();
        }

        /* synthetic */ e(MaterialButtonToggleGroup materialButtonToggleGroup, a aVar) {
            this();
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p225w4.a.f28722y);
    }

    private void c() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i10 = firstVisibleChildIndex + 1; i10 < getChildCount(); i10++) {
            MaterialButton materialButtonH = h(i10);
            int iMin = Math.min(materialButtonH.getStrokeWidth(), h(i10 - 1).getStrokeWidth());
            LinearLayout.LayoutParams layoutParamsD = d(materialButtonH);
            if (getOrientation() == 0) {
                AbstractC1080l.c(layoutParamsD, 0);
                AbstractC1080l.d(layoutParamsD, -iMin);
                layoutParamsD.topMargin = 0;
            } else {
                layoutParamsD.bottomMargin = 0;
                layoutParamsD.topMargin = -iMin;
                AbstractC1080l.d(layoutParamsD, 0);
            }
            materialButtonH.setLayoutParams(layoutParamsD);
        }
        n(firstVisibleChildIndex);
    }

    private LinearLayout.LayoutParams d(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    private void e(int i10, boolean z9) {
        if (i10 == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i10);
            return;
        }
        HashSet hashSet = new HashSet(this.f16648z);
        if (z9 && !hashSet.contains(Integer.valueOf(i10))) {
            if (this.f16645w && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i10));
        } else {
            if (z9 || !hashSet.contains(Integer.valueOf(i10))) {
                return;
            }
            if (!this.f16646x || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i10));
            }
        }
        q(hashSet);
    }

    private void g(int i10, boolean z9) {
        Iterator it = this.f16641s.iterator();
        while (it.hasNext()) {
            ((d) it.next()).a(this, i10, z9);
        }
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (k(i10)) {
                return i10;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (k(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof MaterialButton) && k(i11)) {
                i10++;
            }
        }
        return i10;
    }

    private MaterialButton h(int i10) {
        return (MaterialButton) getChildAt(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int i(View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) == view) {
                return i10;
            }
            if ((getChildAt(i11) instanceof MaterialButton) && k(i11)) {
                i10++;
            }
        }
        return -1;
    }

    private c j(int i10, int i11, int i12) {
        c cVar = (c) this.f16639q.get(i10);
        if (i11 == i12) {
            return cVar;
        }
        boolean z9 = getOrientation() == 0;
        if (i10 == i11) {
            return z9 ? c.e(cVar, this) : c.f(cVar);
        }
        if (i10 == i12) {
            return z9 ? c.b(cVar, this) : c.a(cVar);
        }
        return null;
    }

    private boolean k(int i10) {
        return getChildAt(i10).getVisibility() != 8;
    }

    private void n(int i10) {
        if (getChildCount() == 0 || i10 == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) h(i10).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 0;
        } else {
            AbstractC1080l.c(layoutParams, 0);
            AbstractC1080l.d(layoutParams, 0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    private void o(int i10, boolean z9) {
        View viewFindViewById = findViewById(i10);
        if (viewFindViewById instanceof MaterialButton) {
            this.f16644v = true;
            ((MaterialButton) viewFindViewById).setChecked(z9);
            this.f16644v = false;
        }
    }

    private static void p(l.b bVar, c cVar) {
        if (cVar == null) {
            bVar.o(0.0f);
        } else {
            bVar.B(cVar.f16652a).t(cVar.f16655d).F(cVar.f16653b).x(cVar.f16654c);
        }
    }

    private void q(Set set) {
        Set set2 = this.f16648z;
        this.f16648z = new HashSet(set);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id = h(i10).getId();
            o(id, set.contains(Integer.valueOf(id)));
            if (set2.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                g(id, set.contains(Integer.valueOf(id)));
            }
        }
        invalidate();
    }

    private void r() {
        TreeMap treeMap = new TreeMap(this.f16642t);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            treeMap.put(h(i10), Integer.valueOf(i10));
        }
        this.f16643u = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(H.i());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f16640r);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    private void t() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            h(i10).setA11yClassName((this.f16645w ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i10, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        e(materialButton.getId(), materialButton.isChecked());
        l shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f16639q.add(new c(shapeAppearanceModel.r(), shapeAppearanceModel.j(), shapeAppearanceModel.t(), shapeAppearanceModel.l()));
        materialButton.setEnabled(isEnabled());
        H.g0(materialButton, new b());
    }

    public void b(d dVar) {
        this.f16641s.add(dVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        r();
        super.dispatchDraw(canvas);
    }

    public void f() {
        q(new HashSet());
    }

    public int getCheckedButtonId() {
        if (!this.f16645w || this.f16648z.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f16648z.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id = h(i10).getId();
            if (this.f16648z.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        Integer[] numArr = this.f16643u;
        if (numArr != null && i11 < numArr.length) {
            return numArr[i11].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i11;
    }

    public boolean l() {
        return this.f16645w;
    }

    void m(MaterialButton materialButton, boolean z9) {
        if (this.f16644v) {
            return;
        }
        e(materialButton.getId(), z9);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.f16647y;
        if (i10 != -1) {
            q(Collections.singleton(Integer.valueOf(i10)));
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C0.d.U0(accessibilityNodeInfo).i0(C0.d.e.a(1, getVisibleButtonCount(), false, l() ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        s();
        c();
        super.onMeasure(i10, i11);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f16639q.remove(iIndexOfChild);
        }
        s();
        c();
    }

    void s() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i10 = 0; i10 < childCount; i10++) {
            MaterialButton materialButtonH = h(i10);
            if (materialButtonH.getVisibility() != 8) {
                l.b bVarV = materialButtonH.getShapeAppearanceModel().v();
                p(bVarV, j(i10, firstVisibleChildIndex, lastVisibleChildIndex));
                materialButtonH.setShapeAppearanceModel(bVarV.m());
            }
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z9) {
        super.setEnabled(z9);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            h(i10).setEnabled(z9);
        }
    }

    public void setSelectionRequired(boolean z9) {
        this.f16646x = z9;
    }

    public void setSingleSelection(boolean z9) {
        if (this.f16645w != z9) {
            this.f16645w = z9;
            f();
        }
        t();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f16638A;
        super(Q4.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f16639q = new ArrayList();
        this.f16640r = new e(this, null);
        this.f16641s = new LinkedHashSet();
        this.f16642t = new a();
        this.f16644v = false;
        this.f16648z = new HashSet();
        TypedArray typedArrayI = k.i(getContext(), attributeSet, p225w4.k.f29013I3, i10, i11, new int[0]);
        setSingleSelection(typedArrayI.getBoolean(p225w4.k.f29049M3, false));
        this.f16647y = typedArrayI.getResourceId(p225w4.k.f29031K3, -1);
        this.f16646x = typedArrayI.getBoolean(p225w4.k.f29040L3, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayI.getBoolean(p225w4.k.f29022J3, true));
        typedArrayI.recycle();
        H.q0(this, 1);
    }

    public void setSingleSelection(int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }
}
