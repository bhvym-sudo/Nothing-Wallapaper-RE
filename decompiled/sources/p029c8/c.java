package p029c8;

import java.util.ArrayList;
import p009a8.b;
import p009a8.e;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f15249b;

    public int a() {
        int i10;
        try {
            int i11 = 0;
            for (e eVar : this.f15249b) {
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
            return i11;
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }
}
