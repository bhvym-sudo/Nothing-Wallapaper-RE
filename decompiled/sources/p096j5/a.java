package p096j5;

import p116l5.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static b a(b bVar) {
        return b(bVar) ? b.a(bVar.d(), bVar.c(), 70.0d) : bVar;
    }

    public static boolean b(b bVar) {
        return ((((double) Math.round(bVar.d())) > 90.0d ? 1 : (((double) Math.round(bVar.d())) == 90.0d ? 0 : -1)) >= 0 && (((double) Math.round(bVar.d())) > 111.0d ? 1 : (((double) Math.round(bVar.d())) == 111.0d ? 0 : -1)) <= 0) && ((((double) Math.round(bVar.c())) > 16.0d ? 1 : (((double) Math.round(bVar.c())) == 16.0d ? 0 : -1)) > 0) && ((((double) Math.round(bVar.e())) > 65.0d ? 1 : (((double) Math.round(bVar.e())) == 65.0d ? 0 : -1)) < 0);
    }
}
