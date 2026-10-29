package X6;

import E8.i;
import com.nothing.wallpaper.picker.creative.model.PromptCategory;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {
    public static final boolean a(PromptCategory promptCategory) {
        n.h(promptCategory, "<this>");
        return i.B(promptCategory.getCategory(), "Style", true);
    }

    public static final boolean b(PromptCategory promptCategory) {
        n.h(promptCategory, "<this>");
        return i.B(promptCategory.getCategory(), "Subject", true);
    }
}
