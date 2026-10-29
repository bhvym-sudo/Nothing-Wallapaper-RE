package com.bumptech.glide.load;

import com.bumptech.glide.load.engine.Resource;

/* JADX INFO: loaded from: classes.dex */
public interface ResourceDecoder<T, Z> {
    Resource<Z> decode(T t9, int i10, int i11, Options options);

    boolean handles(T t9, Options options);
}
