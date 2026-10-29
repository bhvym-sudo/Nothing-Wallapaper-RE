package p036d5;

import S4.c;
import S4.d;
import S4.g;
import S4.o;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f19616b = c.a(m.class).b(o.g(C1310i.class)).b(o.g(Context.class)).d(new g() { // from class: d5.E
        @Override // S4.g
        public final Object a(d dVar) {
            return new m((Context) dVar.a(Context.class));
        }
    }).c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Context f19617a;

    public m(Context context) {
        this.f19617a = context;
    }

    public synchronized String a() {
        String string = b().getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        b().edit().putString("ml_sdk_instance_id", string2).apply();
        return string2;
    }

    protected final SharedPreferences b() {
        return this.f19617a.getSharedPreferences("com.google.mlkit.internal", 0);
    }
}
