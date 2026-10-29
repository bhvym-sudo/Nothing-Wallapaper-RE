package com.bumptech.glide.util;

import androidx.collection.C1021a;
import androidx.collection.P;

/* JADX INFO: loaded from: classes.dex */
public final class CachedHashCodeArrayMap<K, V> extends C1021a {
    private int hashCode;

    @Override // androidx.collection.P, java.util.Map
    public void clear() {
        this.hashCode = 0;
        super.clear();
    }

    @Override // androidx.collection.P, java.util.Map
    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = super.hashCode();
        }
        return this.hashCode;
    }

    @Override // androidx.collection.P, java.util.Map
    public V put(K k9, V v9) {
        this.hashCode = 0;
        return (V) super.put(k9, v9);
    }

    @Override // androidx.collection.P
    public void putAll(P p9) {
        this.hashCode = 0;
        super.putAll(p9);
    }

    @Override // androidx.collection.P
    public V removeAt(int i10) {
        this.hashCode = 0;
        return (V) super.removeAt(i10);
    }

    @Override // androidx.collection.P
    public V setValueAt(int i10, V v9) {
        this.hashCode = 0;
        return (V) super.setValueAt(i10, v9);
    }
}
