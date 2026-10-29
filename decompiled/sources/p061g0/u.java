package p061g0;

import android.R;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import java.util.ArrayList;
import java.util.List;
import p031d0.n;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes.dex */
public final class u implements InputConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f20978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f20979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f20980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private y f20981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f20982e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f20983f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f20984g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f20985h = true;

    public u(y yVar, l lVar, boolean z9) {
        this.f20978a = lVar;
        this.f20979b = z9;
        this.f20981d = yVar;
    }

    private final void a(h hVar) {
        b();
        try {
            this.f20984g.add(hVar);
        } finally {
            c();
        }
    }

    private final boolean b() {
        this.f20980c++;
        return true;
    }

    private final boolean c() {
        int i10 = this.f20980c - 1;
        this.f20980c = i10;
        if (i10 == 0 && !this.f20984g.isEmpty()) {
            this.f20978a.e(AbstractC1444s.u0(this.f20984g));
            this.f20984g.clear();
        }
        return this.f20980c > 0;
    }

    private final void d(int i10) {
        sendKeyEvent(new KeyEvent(0, i10));
        sendKeyEvent(new KeyEvent(1, i10));
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        boolean z9 = this.f20985h;
        return z9 ? b() : z9;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i10) {
        boolean z9 = this.f20985h;
        if (z9) {
            return false;
        }
        return z9;
    }

    @Override // android.view.inputmethod.InputConnection
    public void closeConnection() {
        this.f20984g.clear();
        this.f20980c = 0;
        this.f20985h = false;
        this.f20978a.a(this);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z9 = this.f20985h;
        if (z9) {
            return false;
        }
        return z9;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        boolean z9 = this.f20985h;
        if (z9) {
            return false;
        }
        return z9;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z9 = this.f20985h;
        return z9 ? this.f20979b : z9;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i10) {
        boolean z9 = this.f20985h;
        if (z9) {
            a(new C1351a(String.valueOf(charSequence), i10));
        }
        return z9;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i10, int i11) {
        boolean z9 = this.f20985h;
        if (!z9) {
            return z9;
        }
        a(new f(i10, i11));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        boolean z9 = this.f20985h;
        if (!z9) {
            return z9;
        }
        a(new g(i10, i11));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        return c();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        boolean z9 = this.f20985h;
        if (!z9) {
            return z9;
        }
        a(new i());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int i10) {
        return TextUtils.getCapsMode(this.f20981d.d(), n.i(this.f20981d.c()), i10);
    }

    @Override // android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i10) {
        boolean z9 = (i10 & 1) != 0;
        this.f20983f = z9;
        if (z9) {
            this.f20982e = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return o.a(this.f20981d);
    }

    @Override // android.view.inputmethod.InputConnection
    public Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getSelectedText(int i10) {
        if (n.f(this.f20981d.c())) {
            return null;
        }
        return z.a(this.f20981d).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextAfterCursor(int i10, int i11) {
        return z.b(this.f20981d, i10).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextBeforeCursor(int i10, int i11) {
        return z.c(this.f20981d, i10).toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i10) {
        boolean z9 = this.f20985h;
        if (z9) {
            z9 = false;
            switch (i10) {
                case R.id.selectAll:
                    a(new x(0, this.f20981d.d().length()));
                    break;
                case R.id.cut:
                    d(277);
                    break;
                case R.id.copy:
                    d(278);
                    break;
                case R.id.paste:
                    d(279);
                    break;
            }
        }
        return z9;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i10) {
        int iA;
        boolean z9 = this.f20985h;
        if (!z9) {
            return z9;
        }
        if (i10 != 0) {
            switch (i10) {
                case 2:
                    iA = j.f20938b.c();
                    break;
                case 3:
                    iA = j.f20938b.g();
                    break;
                case 4:
                    iA = j.f20938b.h();
                    break;
                case 5:
                    iA = j.f20938b.d();
                    break;
                case 6:
                    iA = j.f20938b.b();
                    break;
                case 7:
                    iA = j.f20938b.f();
                    break;
                default:
                    Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i10);
                    iA = j.f20938b.a();
                    break;
            }
        } else {
            iA = j.f20938b.a();
        }
        this.f20978a.d(iA);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z9 = this.f20985h;
        if (z9) {
            return true;
        }
        return z9;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean z9) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i10) {
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13 = this.f20985h;
        if (!z13) {
            return z13;
        }
        boolean z14 = (i10 & 1) != 0;
        boolean z15 = (i10 & 2) != 0;
        boolean z16 = (i10 & 16) != 0;
        boolean z17 = (i10 & 8) != 0;
        boolean z18 = (i10 & 4) != 0;
        boolean z19 = (i10 & 32) != 0;
        if (z16 || z17 || z18 || z19) {
            z9 = z19;
            z10 = z17;
            z11 = z18;
            z12 = z16;
        } else {
            z12 = true;
            z10 = true;
            z11 = true;
            z9 = true;
        }
        this.f20978a.c(z14, z15, z12, z10, z11, z9);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z9 = this.f20985h;
        if (!z9) {
            return z9;
        }
        this.f20978a.b(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i10, int i11) {
        boolean z9 = this.f20985h;
        if (z9) {
            a(new v(i10, i11));
        }
        return z9;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i10) {
        boolean z9 = this.f20985h;
        if (z9) {
            a(new w(String.valueOf(charSequence), i10));
        }
        return z9;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int i10, int i11) {
        boolean z9 = this.f20985h;
        if (!z9) {
            return z9;
        }
        a(new x(i10, i11));
        return true;
    }
}
