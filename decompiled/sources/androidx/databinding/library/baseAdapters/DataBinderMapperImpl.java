package androidx.databinding.library.baseAdapters;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.d;
import androidx.databinding.e;
import androidx.databinding.g;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class DataBinderMapperImpl extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final SparseIntArray f12381a = new SparseIntArray(0);

    @Override // androidx.databinding.d
    public List a() {
        return new ArrayList(0);
    }

    @Override // androidx.databinding.d
    public g b(e eVar, View view, int i10) {
        if (f12381a.get(i10) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // androidx.databinding.d
    public g c(e eVar, View[] viewArr, int i10) {
        if (viewArr == null || viewArr.length == 0 || f12381a.get(i10) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
