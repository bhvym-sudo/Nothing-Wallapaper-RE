package androidx.slice;

import android.content.Context;
import android.util.Log;
import androidx.collection.C1022b;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    private static android.app.slice.SliceSpec a(SliceSpec sliceSpec) {
        if (sliceSpec == null) {
            return null;
        }
        return new android.app.slice.SliceSpec(sliceSpec.b(), sliceSpec.a());
    }

    static Set b(Set set) {
        C1022b c1022b = new C1022b();
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                c1022b.add(a((SliceSpec) it.next()));
            }
        }
        return c1022b;
    }

    public static Slice c(android.app.slice.Slice slice, Context context) {
        if (slice == null || slice.getUri() == null) {
            return null;
        }
        Slice.a aVar = new Slice.a(slice.getUri());
        aVar.b(slice.getHints());
        aVar.p(d(slice.getSpec()));
        for (android.app.slice.SliceItem sliceItem : slice.getItems()) {
            String format = sliceItem.getFormat();
            format.getClass();
            switch (format) {
                case "action":
                    aVar.a(sliceItem.getAction(), c(sliceItem.getSlice(), context), sliceItem.getSubType());
                    break;
                case "int":
                    aVar.f(sliceItem.getInt(), sliceItem.getSubType(), sliceItem.getHints());
                    break;
                case "long":
                    aVar.h(sliceItem.getLong(), sliceItem.getSubType(), sliceItem.getHints());
                    break;
                case "text":
                    aVar.m(sliceItem.getText(), sliceItem.getSubType(), sliceItem.getHints());
                    break;
                case "image":
                    try {
                        aVar.d(IconCompat.b(context, sliceItem.getIcon()), sliceItem.getSubType(), sliceItem.getHints());
                        break;
                    } catch (IllegalArgumentException e10) {
                        Log.w("SliceConvert", "The icon resource isn't available.", e10);
                        break;
                    }
                    break;
                case "input":
                    aVar.j(sliceItem.getRemoteInput(), sliceItem.getSubType(), sliceItem.getHints());
                    break;
                case "slice":
                    aVar.l(c(sliceItem.getSlice(), context), sliceItem.getSubType());
                    break;
            }
        }
        return aVar.o();
    }

    private static SliceSpec d(android.app.slice.SliceSpec sliceSpec) {
        if (sliceSpec == null) {
            return null;
        }
        return new SliceSpec(sliceSpec.getType(), sliceSpec.getRevision());
    }
}
