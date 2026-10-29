package com.nothing.cardwidget;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.widget.SeekBar;
import java.util.Map;
import java.util.function.Consumer;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import org.json.JSONException;
import org.json.JSONObject;
import p079h8.v;
import p089i8.N;

/* JADX INFO: loaded from: classes.dex */
public final class NTSeekBar extends SeekBar implements IWidget {
    public static final Companion Companion = new Companion(null);
    private static final int MSG_PROGRESS_CALLBACK = 0;
    public static final String RESULT_PROGRESS = "result_progress";
    private final H mH;
    private Consumer<JSONObject> mSeekBarListener;
    private int reactDelay;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1457h abstractC1457h) {
            this();
        }

        private Companion() {
        }
    }

    public final class H extends Handler {
        final /* synthetic */ NTSeekBar this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public H(NTSeekBar nTSeekBar, Looper looper) {
            super(looper);
            n.h(looper, "looper");
            this.this$0 = nTSeekBar;
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) throws JSONException {
            n.h(msg, "msg");
            if (msg.what == 0) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(NTSeekBar.RESULT_PROGRESS, msg.arg1);
                Consumer consumer = this.this$0.mSeekBarListener;
                if (consumer != null) {
                    consumer.accept(jSONObject);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NTSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        n.h(context, "context");
        Looper mainLooper = Looper.getMainLooper();
        n.g(mainLooper, "getMainLooper(...)");
        this.mH = new H(this, mainLooper);
        J5.a.C0120a c0120a = J5.a.f3535a;
        for (Map.Entry entry : c0120a.k(attributeSet, N.e(v.a(Integer.valueOf(c0120a.c(context, "react_delay")), Integer.valueOf(R.attr.react_delay)))).entrySet()) {
            if (((Number) entry.getKey()).intValue() == R.attr.react_delay) {
                J5.a.C0120a c0120a2 = J5.a.f3535a;
                n.e(attributeSet);
                setReactDelay(c0120a2.i(context, attributeSet, ((Number) entry.getValue()).intValue(), 0));
            }
        }
        setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.nothing.cardwidget.NTSeekBar.2
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar, int i10, boolean z9) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar seekBar) {
                NTSeekBar.this.mH.removeMessages(0);
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar seekBar) {
                if (NTSeekBar.this.mSeekBarListener == null || seekBar == null) {
                    return;
                }
                NTSeekBar nTSeekBar = NTSeekBar.this;
                Message messageObtainMessage = nTSeekBar.mH.obtainMessage(0, seekBar.getProgress(), 0);
                n.g(messageObtainMessage, "obtainMessage(...)");
                nTSeekBar.send(messageObtainMessage);
            }
        });
    }

    @Override // com.nothing.cardwidget.IWidget
    public final int getReactDelay() {
        return this.reactDelay;
    }

    @Override // com.nothing.cardwidget.IWidget
    public void send(Runnable runnable) {
        IWidget.DefaultImpls.send(this, runnable);
    }

    public final void setReactDelay(int i10) {
        this.reactDelay = i10;
    }

    public final void setSeekBarListener(Consumer<JSONObject> listener) {
        n.h(listener, "listener");
        this.mSeekBarListener = listener;
    }

    @Override // com.nothing.cardwidget.IWidget
    public long getReactDelay() {
        return this.reactDelay;
    }

    @Override // com.nothing.cardwidget.IWidget
    public void send(Message msg) {
        n.h(msg, "msg");
        Handler target = msg.getTarget();
        target.removeMessages(msg.what);
        target.sendMessageDelayed(msg, getReactDelay());
    }
}
