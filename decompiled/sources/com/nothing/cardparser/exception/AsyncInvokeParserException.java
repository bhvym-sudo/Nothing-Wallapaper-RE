package com.nothing.cardparser.exception;

import androidx.annotation.Keep;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
@Keep
public final class AsyncInvokeParserException extends RuntimeException {
    private final long serialVersionUID;

    /* JADX WARN: Multi-variable type inference failed */
    public AsyncInvokeParserException() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final long getSerialVersionUID() {
        return this.serialVersionUID;
    }

    public /* synthetic */ AsyncInvokeParserException(String str, Throwable th, int i10, AbstractC1457h abstractC1457h) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : th);
    }

    public AsyncInvokeParserException(String str, Throwable th) {
        super(str, th);
        this.serialVersionUID = -7034897190745755931L;
    }
}
