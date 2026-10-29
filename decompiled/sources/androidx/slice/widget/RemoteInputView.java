package androidx.slice.widget;

import android.animation.Animator;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.widget.l;
import androidx.slice.SliceItem;

/* JADX INFO: loaded from: classes.dex */
public class RemoteInputView extends LinearLayout implements View.OnClickListener, TextWatcher {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final Object f13765A = new Object();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    RemoteEditText f13766q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ImageButton f13767r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private ProgressBar f13768s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private SliceItem f13769t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private RemoteInput[] f13770u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private RemoteInput f13771v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f13772w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f13773x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f13774y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f13775z;

    public static class RemoteEditText extends EditText {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final Drawable f13776q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        RemoteInputView f13777r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        boolean f13778s;

        class a implements Runnable {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InputMethodManager f13779q;

            a(InputMethodManager inputMethodManager) {
                this.f13779q = inputMethodManager;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f13779q.viewClicked(RemoteEditText.this);
                this.f13779q.showSoftInput(RemoteEditText.this, 0);
            }
        }

        public RemoteEditText(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f13776q = getBackground();
        }

        private void a(boolean z9) {
            if (this.f13777r != null || b()) {
                b();
                return;
            }
            if (isFocusable() && isEnabled()) {
                setInnerFocusable(false);
                RemoteInputView remoteInputView = this.f13777r;
                if (remoteInputView != null) {
                    remoteInputView.e();
                }
                this.f13778s = false;
            }
        }

        private boolean b() {
            return isTemporarilyDetached();
        }

        @Override // android.widget.TextView, android.view.View
        public void getFocusedRect(Rect rect) {
            super.getFocusedRect(rect);
            rect.top = getScrollY();
            rect.bottom = getScrollY() + (getBottom() - getTop());
        }

        @Override // android.widget.TextView
        public void onCommitCompletion(CompletionInfo completionInfo) {
            clearComposingText();
            setText(completionInfo.getText());
            setSelection(getText().length());
        }

        @Override // android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputMethodManager inputMethodManager;
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f13778s && inputConnectionOnCreateInputConnection != null && (inputMethodManager = (InputMethodManager) p171r0.a.e(getContext(), InputMethodManager.class)) != null) {
                post(new a(inputMethodManager));
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z9, int i10, Rect rect) {
            super.onFocusChanged(z9, i10, rect);
            if (z9) {
                return;
            }
            a(true);
        }

        @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i10, KeyEvent keyEvent) {
            if (i10 == 4) {
                return true;
            }
            return super.onKeyDown(i10, keyEvent);
        }

        @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyUp(int i10, KeyEvent keyEvent) {
            if (i10 != 4) {
                return super.onKeyUp(i10, keyEvent);
            }
            a(true);
            return true;
        }

        @Override // android.widget.TextView, android.view.View
        protected void onVisibilityChanged(View view, int i10) {
            super.onVisibilityChanged(view, i10);
            if (isShown()) {
                return;
            }
            a(false);
        }

        @Override // android.widget.TextView
        public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
            super.setCustomSelectionActionModeCallback(l.r(this, callback));
        }

        void setInnerFocusable(boolean z9) {
            setFocusableInTouchMode(z9);
            setFocusable(z9);
            setCursorVisible(z9);
            if (!z9) {
                setBackground(null);
            } else {
                requestFocus();
                setBackground(this.f13776q);
            }
        }
    }

    class a implements TextView.OnEditorActionListener {
        a() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            boolean z9 = keyEvent == null && (i10 == 6 || i10 == 5 || i10 == 4);
            boolean z10 = keyEvent != null && RemoteInputView.d(keyEvent.getKeyCode()) && keyEvent.getAction() == 0;
            if (!z9 && !z10) {
                return false;
            }
            if (RemoteInputView.this.f13766q.length() > 0) {
                RemoteInputView.this.g();
            }
            return true;
        }
    }

    public RemoteInputView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void a() {
        setVisibility(0);
        this.f13766q.setInnerFocusable(true);
        RemoteEditText remoteEditText = this.f13766q;
        remoteEditText.f13778s = true;
        remoteEditText.setSelection(remoteEditText.getText().length());
        this.f13766q.requestFocus();
        j();
    }

    public static RemoteInputView c(Context context, ViewGroup viewGroup) {
        RemoteInputView remoteInputView = (RemoteInputView) LayoutInflater.from(context).inflate(p122m1.d.f23134g, viewGroup, false);
        remoteInputView.setTag(f13765A);
        return remoteInputView;
    }

    public static final boolean d(int i10) {
        return i10 == 23 || i10 == 62 || i10 == 66 || i10 == 160;
    }

    private void f() {
        this.f13775z = true;
        this.f13766q.getText().clear();
        this.f13766q.setEnabled(true);
        this.f13767r.setVisibility(0);
        this.f13768s.setVisibility(4);
        j();
        e();
        this.f13775z = false;
    }

    private void j() {
        this.f13767r.setEnabled(this.f13766q.getText().length() != 0);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        j();
    }

    public void b() {
        if (getVisibility() != 0) {
            Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(this, this.f13772w, this.f13773x, 0.0f, this.f13774y);
            animatorCreateCircularReveal.setDuration(200L);
            animatorCreateCircularReveal.start();
        }
        a();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchFinishTemporaryDetach() {
        if (isAttachedToWindow()) {
            RemoteEditText remoteEditText = this.f13766q;
            attachViewToParent(remoteEditText, 0, remoteEditText.getLayoutParams());
        } else {
            removeDetachedView(this.f13766q, false);
        }
        super.dispatchFinishTemporaryDetach();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchStartTemporaryDetach() {
        super.dispatchStartTemporaryDetach();
        detachViewFromParent(this.f13766q);
    }

    void e() {
        setVisibility(4);
    }

    void g() {
        Bundle bundle = new Bundle();
        bundle.putString(this.f13771v.getResultKey(), this.f13766q.getText().toString());
        Intent intentAddFlags = new Intent().addFlags(268435456);
        RemoteInput.addResultsToIntent(this.f13770u, intentAddFlags, bundle);
        this.f13766q.setEnabled(false);
        this.f13767r.setVisibility(4);
        this.f13768s.setVisibility(0);
        this.f13766q.f13778s = false;
        try {
            this.f13769t.a(getContext(), intentAddFlags);
            f();
        } catch (PendingIntent.CanceledException e10) {
            Log.i("RemoteInput", "Unable to send remote input result", e10);
            Toast.makeText(getContext(), "Failure sending pending intent for inline reply :(", 0).show();
            f();
        }
    }

    public void h(RemoteInput[] remoteInputArr, RemoteInput remoteInput) {
        this.f13770u = remoteInputArr;
        this.f13771v = remoteInput;
        this.f13766q.setHint(remoteInput.getLabel());
    }

    public void i(int i10, int i11, int i12) {
        this.f13772w = i10;
        this.f13773x = i11;
        this.f13774y = i12;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.f13767r) {
            g();
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f13768s = (ProgressBar) findViewById(p122m1.c.f23124e);
        ImageButton imageButton = (ImageButton) findViewById(p122m1.c.f23125f);
        this.f13767r = imageButton;
        imageButton.setOnClickListener(this);
        RemoteEditText remoteEditText = (RemoteEditText) getChildAt(0);
        this.f13766q = remoteEditText;
        remoteEditText.setOnEditorActionListener(new a());
        this.f13766q.addTextChangedListener(this);
        this.f13766q.setInnerFocusable(false);
        this.f13766q.f13777r = this;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        if (this.f13775z && view == this.f13766q) {
            return false;
        }
        return super.onRequestSendAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setAction(SliceItem sliceItem) {
        this.f13769t = sliceItem;
    }
}
