package com.bumptech.glide.util;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class LruCache<T, Y> {
    private final Map<T, Entry<Y>> cache = new LinkedHashMap(100, 0.75f, true);
    private long currentSize;
    private final long initialMaxSize;
    private long maxSize;

    static final class Entry<Y> {
        final int size;
        final Y value;

        Entry(Y y9, int i10) {
            this.value = y9;
            this.size = i10;
        }
    }

    public LruCache(long j9) {
        this.initialMaxSize = j9;
        this.maxSize = j9;
    }

    private void evict() {
        trimToSize(this.maxSize);
    }

    public void clearMemory() {
        trimToSize(0L);
    }

    public synchronized boolean contains(T t9) {
        return this.cache.containsKey(t9);
    }

    public synchronized Y get(T t9) {
        Entry<Y> entry;
        entry = this.cache.get(t9);
        return entry != null ? entry.value : null;
    }

    protected synchronized int getCount() {
        return this.cache.size();
    }

    public synchronized long getCurrentSize() {
        return this.currentSize;
    }

    public synchronized long getMaxSize() {
        return this.maxSize;
    }

    protected int getSize(Y y9) {
        return 1;
    }

    protected void onItemEvicted(T t9, Y y9) {
    }

    public synchronized Y put(T t9, Y y9) {
        int size = getSize(y9);
        long j9 = size;
        if (j9 >= this.maxSize) {
            onItemEvicted(t9, y9);
            return null;
        }
        if (y9 != null) {
            this.currentSize += j9;
        }
        Entry<Y> entryPut = this.cache.put(t9, y9 == null ? null : new Entry<>(y9, size));
        if (entryPut != null) {
            this.currentSize -= (long) entryPut.size;
            if (!entryPut.value.equals(y9)) {
                onItemEvicted(t9, entryPut.value);
            }
        }
        evict();
        return entryPut != null ? entryPut.value : null;
    }

    public synchronized Y remove(T t9) {
        Entry<Y> entryRemove = this.cache.remove(t9);
        if (entryRemove == null) {
            return null;
        }
        this.currentSize -= (long) entryRemove.size;
        return entryRemove.value;
    }

    public synchronized void setSizeMultiplier(float f10) {
        try {
            if (f10 < 0.0f) {
                throw new IllegalArgumentException("Multiplier must be >= 0");
            }
            this.maxSize = Math.round(this.initialMaxSize * f10);
            evict();
        } catch (Throwable th) {
            throw th;
        }
    }

    protected synchronized void trimToSize(long j9) {
        while (this.currentSize > j9) {
            Iterator<Map.Entry<T, Entry<Y>>> it = this.cache.entrySet().iterator();
            Map.Entry<T, Entry<Y>> next = it.next();
            Entry<Y> value = next.getValue();
            this.currentSize -= (long) value.size;
            T key = next.getKey();
            it.remove();
            onItemEvicted(key, value.value);
        }
    }
}
