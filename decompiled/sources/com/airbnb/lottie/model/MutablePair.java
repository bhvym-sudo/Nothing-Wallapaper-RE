package com.airbnb.lottie.model;

import B0.e;

/* JADX INFO: loaded from: classes.dex */
public class MutablePair<T> {
    T first;
    T second;

    private static boolean objectsEqual(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return objectsEqual(eVar.f328a, this.first) && objectsEqual(eVar.f329b, this.second);
    }

    public int hashCode() {
        T t9 = this.first;
        int iHashCode = t9 == null ? 0 : t9.hashCode();
        T t10 = this.second;
        return iHashCode ^ (t10 != null ? t10.hashCode() : 0);
    }

    public void set(T t9, T t10) {
        this.first = t9;
        this.second = t10;
    }

    public String toString() {
        return "Pair{" + this.first + " " + this.second + "}";
    }
}
