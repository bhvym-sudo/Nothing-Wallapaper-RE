package com.nothing.cardwidget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import java.util.function.Consumer;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class TestView extends View {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "TestView";
    private Consumer<JSONObject> mCallback;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1457h abstractC1457h) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TestView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        n.h(context, "context");
        setOnClickListener(new View.OnClickListener() { // from class: com.nothing.cardwidget.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TestView._init_$lambda$0(this.f18040q, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(TestView this$0, View view) {
        n.h(this$0, "this$0");
        Consumer<JSONObject> consumer = this$0.mCallback;
        if (consumer != null) {
            consumer.accept(null);
        }
    }

    public final void setOnClick(Consumer<JSONObject> r9, String one, String two) {
        n.h(r9, "r");
        n.h(one, "one");
        n.h(two, "two");
        Log.d(TAG, "setOnClick: one=" + one + ", two:" + two);
        this.mCallback = r9;
    }

    public final void test() {
        Log.d(TAG, "test");
    }

    public final void test(String s9, String s10) {
        n.h(s9, "s1");
        n.h(s10, "s2");
        Log.d(TAG, "test: s1=" + s9 + ", s2=" + s10);
    }

    public final void setOnClick(Consumer<JSONObject> r9) {
        n.h(r9, "r");
        Log.d(TAG, "setOnClick");
        this.mCallback = r9;
    }
}
