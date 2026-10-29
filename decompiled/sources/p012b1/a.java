package p012b1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.constraintlayout.core.widgets.Optimizer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f14676f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static a f14677g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f14678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap f14679b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap f14680c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayList f14681d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Handler f14682e;

    /* JADX INFO: renamed from: b1.a$a, reason: collision with other inner class name */
    class HandlerC0423a extends Handler {
        HandlerC0423a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                super.handleMessage(message);
            } else {
                a.this.a();
            }
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Intent f14684a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ArrayList f14685b;

        b(Intent intent, ArrayList arrayList) {
            this.f14684a = intent;
            this.f14685b = arrayList;
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final IntentFilter f14686a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final BroadcastReceiver f14687b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f14688c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f14689d;

        c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f14686a = intentFilter;
            this.f14687b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(Optimizer.OPTIMIZATION_GRAPH_WRAP);
            sb.append("Receiver{");
            sb.append(this.f14687b);
            sb.append(" filter=");
            sb.append(this.f14686a);
            if (this.f14689d) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    private a(Context context) {
        this.f14678a = context;
        this.f14682e = new HandlerC0423a(context.getMainLooper());
    }

    public static a b(Context context) {
        a aVar;
        synchronized (f14676f) {
            try {
                if (f14677g == null) {
                    f14677g = new a(context.getApplicationContext());
                }
                aVar = f14677g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    void a() {
        int size;
        b[] bVarArr;
        while (true) {
            synchronized (this.f14679b) {
                try {
                    size = this.f14681d.size();
                    if (size <= 0) {
                        return;
                    }
                    bVarArr = new b[size];
                    this.f14681d.toArray(bVarArr);
                    this.f14681d.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            for (int i10 = 0; i10 < size; i10++) {
                b bVar = bVarArr[i10];
                int size2 = bVar.f14685b.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    c cVar = (c) bVar.f14685b.get(i11);
                    if (!cVar.f14689d) {
                        cVar.f14687b.onReceive(this.f14678a, bVar.f14684a);
                    }
                }
            }
        }
    }

    public void c(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f14679b) {
            try {
                c cVar = new c(intentFilter, broadcastReceiver);
                ArrayList arrayList = (ArrayList) this.f14679b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                    this.f14679b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(cVar);
                for (int i10 = 0; i10 < intentFilter.countActions(); i10++) {
                    String action = intentFilter.getAction(i10);
                    ArrayList arrayList2 = (ArrayList) this.f14680c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                        this.f14680c.put(action, arrayList2);
                    }
                    arrayList2.add(cVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean d(Intent intent) {
        String str;
        synchronized (this.f14679b) {
            try {
                String action = intent.getAction();
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f14678a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z9 = (intent.getFlags() & 8) != 0;
                if (z9) {
                    Log.v("LocalBroadcastManager", "Resolving type " + strResolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList arrayList = (ArrayList) this.f14680c.get(intent.getAction());
                if (arrayList != null) {
                    if (z9) {
                        Log.v("LocalBroadcastManager", "Action list: " + arrayList);
                    }
                    ArrayList arrayList2 = null;
                    int i10 = 0;
                    while (i10 < arrayList.size()) {
                        c cVar = (c) arrayList.get(i10);
                        if (z9) {
                            Log.v("LocalBroadcastManager", "Matching against filter " + cVar.f14686a);
                        }
                        if (cVar.f14688c) {
                            if (z9) {
                                Log.v("LocalBroadcastManager", "  Filter's target already added");
                            }
                            action = action;
                        } else {
                            int iMatch = cVar.f14686a.match(action, strResolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                            if (iMatch >= 0) {
                                if (z9) {
                                    Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(iMatch));
                                }
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                }
                                arrayList2.add(cVar);
                                cVar.f14688c = true;
                            } else {
                                action = action;
                                if (z9) {
                                    if (iMatch == -4) {
                                        str = "category";
                                    } else if (iMatch == -3) {
                                        str = "action";
                                    } else if (iMatch != -2) {
                                        str = iMatch != -1 ? "unknown reason" : "type";
                                    } else {
                                        str = "data";
                                    }
                                    Log.v("LocalBroadcastManager", "  Filter did not match: " + str);
                                }
                            }
                        }
                        i10++;
                        action = action;
                    }
                    if (arrayList2 != null) {
                        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                            ((c) arrayList2.get(i11)).f14688c = false;
                        }
                        this.f14681d.add(new b(intent, arrayList2));
                        if (!this.f14682e.hasMessages(1)) {
                            this.f14682e.sendEmptyMessage(1);
                        }
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f14679b) {
            try {
                ArrayList arrayList = (ArrayList) this.f14679b.remove(broadcastReceiver);
                if (arrayList == null) {
                    return;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    c cVar = (c) arrayList.get(size);
                    cVar.f14689d = true;
                    for (int i10 = 0; i10 < cVar.f14686a.countActions(); i10++) {
                        String action = cVar.f14686a.getAction(i10);
                        ArrayList arrayList2 = (ArrayList) this.f14680c.get(action);
                        if (arrayList2 != null) {
                            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                                c cVar2 = (c) arrayList2.get(size2);
                                if (cVar2.f14687b == broadcastReceiver) {
                                    cVar2.f14689d = true;
                                    arrayList2.remove(size2);
                                }
                            }
                            if (arrayList2.size() <= 0) {
                                this.f14680c.remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
