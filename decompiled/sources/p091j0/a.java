package p091j0;

import android.os.LocaleList;
import android.text.style.LocaleSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import p071h0.d;
import p071h0.e;
import p081i0.b;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f22278a = new a();

    private a() {
    }

    public final Object a(e eVar) {
        ArrayList arrayList = new ArrayList(AbstractC1444s.u(eVar, 10));
        Iterator<E> it = eVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((d) it.next()).a());
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    public final void b(b bVar, e eVar) {
        ArrayList arrayList = new ArrayList(AbstractC1444s.u(eVar, 10));
        Iterator<E> it = eVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((d) it.next()).a());
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
        throw null;
    }
}
