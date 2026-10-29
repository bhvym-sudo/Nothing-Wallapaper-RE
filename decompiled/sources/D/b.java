package D;

import android.util.SparseArray;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.appcompat.app.o;
import java.util.Map;
import p079h8.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final void a(a aVar, SparseArray sparseArray) {
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            int iKeyAt = sparseArray.keyAt(i10);
            AutofillValue autofillValue = (AutofillValue) sparseArray.get(iKeyAt);
            e eVar = e.f692a;
            if (eVar.d(autofillValue)) {
                aVar.b().b(iKeyAt, eVar.i(autofillValue).toString());
            } else {
                if (eVar.b(autofillValue)) {
                    throw new n("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
                if (eVar.c(autofillValue)) {
                    throw new n("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
                if (eVar.e(autofillValue)) {
                    throw new n("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }

    public static final void b(a aVar, ViewStructure viewStructure) {
        int iA = d.f691a.a(viewStructure, aVar.b().a().size());
        for (Map.Entry entry : aVar.b().a().entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            o.a(entry.getValue());
            d dVar = d.f691a;
            ViewStructure viewStructureB = dVar.b(viewStructure, iA);
            if (viewStructureB != null) {
                e eVar = e.f692a;
                AutofillId autofillIdA = eVar.a(viewStructure);
                kotlin.jvm.internal.n.e(autofillIdA);
                eVar.g(viewStructureB, autofillIdA, iIntValue);
                dVar.d(viewStructureB, iIntValue, aVar.c().getContext().getPackageName(), null, null);
                eVar.h(viewStructureB, h.f695a.a());
                throw null;
            }
            iA++;
        }
    }
}
