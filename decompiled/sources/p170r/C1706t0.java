package p170r;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;
import p089i8.AbstractC1444s;

/* JADX INFO: renamed from: r.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1706t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f25580a;

    public C1706t0(List list) {
        this.f25580a = list;
    }

    public final void a(int i10) {
        if (!this.f25580a.isEmpty()) {
            if (((Number) this.f25580a.get(0)).intValue() == i10) {
                return;
            }
            List list = this.f25580a;
            if (((Number) list.get(list.size() - 1)).intValue() == i10) {
                return;
            }
        }
        int size = this.f25580a.size();
        this.f25580a.add(Integer.valueOf(i10));
        while (size > 0) {
            int i11 = ((size + 1) >>> 1) - 1;
            int iIntValue = ((Number) this.f25580a.get(i11)).intValue();
            if (i10 <= iIntValue) {
                break;
            }
            this.f25580a.set(size, Integer.valueOf(iIntValue));
            size = i11;
        }
        this.f25580a.set(size, Integer.valueOf(i10));
    }

    public final boolean b() {
        return !this.f25580a.isEmpty();
    }

    public final int c() {
        return ((Number) AbstractC1444s.S(this.f25580a)).intValue();
    }

    public final int d() {
        int iIntValue;
        if (!(this.f25580a.size() > 0)) {
            AbstractC1696o.r("Set is empty");
        }
        int iIntValue2 = ((Number) this.f25580a.get(0)).intValue();
        while (!this.f25580a.isEmpty() && ((Number) this.f25580a.get(0)).intValue() == iIntValue2) {
            List list = this.f25580a;
            list.set(0, AbstractC1444s.c0(list));
            List list2 = this.f25580a;
            list2.remove(list2.size() - 1);
            int size = this.f25580a.size();
            int size2 = this.f25580a.size() >>> 1;
            int i10 = 0;
            while (i10 < size2) {
                int iIntValue3 = ((Number) this.f25580a.get(i10)).intValue();
                int i11 = (i10 + 1) * 2;
                int i12 = i11 - 1;
                int iIntValue4 = ((Number) this.f25580a.get(i12)).intValue();
                if (i11 < size && (iIntValue = ((Number) this.f25580a.get(i11)).intValue()) > iIntValue4) {
                    if (iIntValue <= iIntValue3) {
                        break;
                    }
                    this.f25580a.set(i10, Integer.valueOf(iIntValue));
                    this.f25580a.set(i11, Integer.valueOf(iIntValue3));
                    i10 = i11;
                } else {
                    if (iIntValue4 <= iIntValue3) {
                        break;
                    }
                    this.f25580a.set(i10, Integer.valueOf(iIntValue4));
                    this.f25580a.set(i12, Integer.valueOf(iIntValue3));
                    i10 = i12;
                }
            }
        }
        return iIntValue2;
    }

    public /* synthetic */ C1706t0(List list, int i10, AbstractC1457h abstractC1457h) {
        this((i10 & 1) != 0 ? new ArrayList() : list);
    }
}
