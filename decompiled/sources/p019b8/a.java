package p019b8;

import java.util.ArrayList;
import p009a8.b;
import p009a8.c;
import p009a8.e;

/* JADX INFO: loaded from: classes2.dex */
public class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f14984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f14985b;

    @Override // p009a8.c
    public int a() {
        return this.f14984a.f14986a;
    }

    @Override // p009a8.c
    public int c() {
        try {
            ArrayList arrayList = this.f14985b;
            b bVar = ((e) arrayList.get(arrayList.size() - 1)).f9961a;
            return "continuous".equals(bVar.f9953a) ? bVar.f9954b + bVar.f9955c : bVar.f9954b + 48;
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }
}
