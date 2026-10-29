package p029c8;

import java.util.ArrayList;
import p009a8.b;
import p009a8.c;
import p009a8.e;

/* JADX INFO: loaded from: classes2.dex */
public class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f15243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f15244b;

    @Override // p009a8.c
    public int a() {
        return this.f15243a.f15245a;
    }

    @Override // p009a8.c
    public int c() {
        int i10;
        try {
            ArrayList arrayList = this.f15244b;
            c cVar = (c) arrayList.get(arrayList.size() - 1);
            int i11 = 0;
            for (e eVar : cVar.f15249b) {
                if (eVar.f9961a.f9953a.equals("continuous")) {
                    b bVar = eVar.f9961a;
                    i10 = bVar.f9954b + bVar.f9955c;
                } else {
                    i10 = eVar.f9961a.f9954b + 48;
                }
                if (i10 > i11) {
                    i11 = i10;
                }
            }
            return i11 + cVar.f15248a;
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public int d(int i10) {
        for (int i11 = 0; i11 < this.f15244b.size(); i11++) {
            try {
                for (int i12 = 0; i12 < ((c) this.f15244b.get(i11)).f15249b.size(); i12++) {
                    if (((c) this.f15244b.get(i11)).f15248a <= i10 && ((c) this.f15244b.get(i11)).f15248a + ((e) ((c) this.f15244b.get(i11)).f15249b.get(i12)).f9961a.f9954b >= i10) {
                        return i11;
                    }
                    if (((c) this.f15244b.get(i11)).f15248a > i10) {
                        return i11 - 1;
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
                return Integer.MIN_VALUE;
            }
        }
        return Integer.MIN_VALUE;
    }
}
