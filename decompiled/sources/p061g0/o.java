package p061g0;

import E8.i;
import android.view.inputmethod.ExtractedText;
import p031d0.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {
    public static final ExtractedText a(y yVar) {
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = yVar.d();
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = yVar.d().length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = n.i(yVar.c());
        extractedText.selectionEnd = n.h(yVar.c());
        extractedText.flags = !i.R(yVar.d(), '\n', false, 2, null) ? 1 : 0;
        return extractedText;
    }
}
