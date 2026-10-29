package p049e8;

import Z7.a;
import android.content.Context;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import p039d8.d;

/* JADX INFO: loaded from: classes2.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AtomicInteger f20221a = new AtomicInteger();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinkedHashMap f20222b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f20223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f20224d;

    public f(Context context, int i10) {
        this.f20223c = context;
        this.f20224d = i10;
    }

    private synchronized int c() {
        int iIncrementAndGet;
        d();
        iIncrementAndGet = this.f20221a.incrementAndGet() % SubsamplingScaleImageView.TILE_SIZE_AUTO;
        a aVarG = a.g(this.f20223c, 2);
        if (aVarG != null) {
            this.f20222b.put(Integer.valueOf(iIncrementAndGet), aVarG);
        }
        return iIncrementAndGet;
    }

    private synchronized void d() {
        try {
            d.a.a("PlayerObjectPool", "PlayerObjectPool shrink() mPlayers.size():" + this.f20222b.size() + ", MAX_SIZE:4");
            if (4 <= this.f20222b.size()) {
                if (d.d()) {
                    String str = "";
                    Iterator it = this.f20222b.keySet().iterator();
                    while (it.hasNext()) {
                        str = str + ((Integer) it.next()).intValue() + " ";
                    }
                    d.a.a("PlayerObjectPool", "PlayerObjectPool mPlayers keys before shrink:" + str);
                }
                ArrayList<Integer> arrayList = new ArrayList();
                for (Map.Entry entry : this.f20222b.entrySet()) {
                    if (!((a) entry.getValue()).e()) {
                        arrayList.add((Integer) entry.getKey());
                    }
                }
                for (Integer num : arrayList) {
                    d.a.a("PlayerObjectPool", "PlayerObjectPool will remove :" + num.intValue() + " as not playing!");
                    ((a) this.f20222b.get(num)).a();
                    this.f20222b.remove(num);
                }
                int size = this.f20222b.size() - 3;
                if (size <= 0) {
                    d.a.a("PlayerObjectPool", "PlayerObjectPool, no need to shrink the playing ones!");
                    return;
                }
                ArrayList<Integer> arrayList2 = new ArrayList();
                for (Map.Entry entry2 : this.f20222b.entrySet()) {
                    ((a) entry2.getValue()).stop();
                    ((a) entry2.getValue()).a();
                    arrayList2.add((Integer) entry2.getKey());
                    size--;
                    if (size == 0) {
                        break;
                    }
                }
                for (Integer num2 : arrayList2) {
                    d.a.a("PlayerObjectPool", "PlayerObjectPool will remove :" + num2.intValue() + " as oversize!");
                    this.f20222b.remove(num2);
                }
                if (d.d()) {
                    String str2 = "";
                    Iterator it2 = this.f20222b.keySet().iterator();
                    while (it2.hasNext()) {
                        str2 = str2 + ((Integer) it2.next()).intValue() + " ";
                    }
                    d.a.a("PlayerObjectPool", "PlayerObjectPool mPlayers current keys after shrink:" + str2);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized int a(String str, int i10, int i11, int i12, int i13, p059f8.a aVar) {
        try {
            if (32 > this.f20224d) {
                e();
            }
            int iC = c();
            a aVar2 = (a) this.f20222b.get(Integer.valueOf(iC));
            if (aVar2 == null) {
                d.a.b("PlayerObjectPool", "PlayerObjectPool, playHaptic, null == player");
                return -1;
            }
            aVar2.d(str, i12, i13, i10, i11, aVar);
            aVar2.c();
            aVar2.start();
            return iC;
        } catch (Throwable th) {
            th.printStackTrace();
            return -1;
        }
    }

    public synchronized void b() {
        try {
            for (Map.Entry entry : this.f20222b.entrySet()) {
                ((a) entry.getValue()).stop();
                ((a) entry.getValue()).a();
            }
            this.f20222b.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void e() {
        for (Map.Entry entry : this.f20222b.entrySet()) {
            if (entry.getValue() != null) {
                ((a) entry.getValue()).stop();
            }
        }
    }
}
