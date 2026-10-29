package com.nothing.launcher.card;

import android.content.Context;
import android.content.ContextWrapper;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes2.dex */
public final class u extends ContextWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f18164a = new a(null);

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Context context) {
        super(context);
        kotlin.jvm.internal.n.h(context, "context");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public String getPackageName() {
        return "com.android.systemui";
    }
}
