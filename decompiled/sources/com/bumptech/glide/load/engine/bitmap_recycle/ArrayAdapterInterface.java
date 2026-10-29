package com.bumptech.glide.load.engine.bitmap_recycle;

/* JADX INFO: loaded from: classes.dex */
interface ArrayAdapterInterface<T> {
    int getArrayLength(T t9);

    int getElementSizeInBytes();

    String getTag();

    T newArray(int i10);
}
