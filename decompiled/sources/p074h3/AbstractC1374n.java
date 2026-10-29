package p074h3;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.AsyncTask;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import org.xmlpull.v1.XmlPullParserException;
import p064g3.AbstractC1356a;
import p064g3.InterfaceC1357b;
import p064g3.c;
import p064g3.k;
import p064g3.p;
import p064g3.r;
import p064g3.x;

/* JADX INFO: renamed from: h3.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1374n implements InterfaceC1357b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected static List f21698g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Context f21699a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected boolean f21701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private M f21702d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Locale f21704f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected ArrayList f21700b = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f21703e = -1;

    /* JADX INFO: renamed from: h3.n$a */
    public static class a extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final c f21705a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected P f21706b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected final Context f21707c;

        public a(c cVar, Context context) {
            this.f21705a = cVar;
            this.f21707c = context.getApplicationContext();
        }

        protected abstract List b(List list);

        protected abstract boolean c(x xVar);

        protected List d() {
            return g("wallpapers", new UnaryOperator() { // from class: h3.l
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return this.f21696a.b((List) obj);
                }
            });
        }

        protected List e(XmlResourceParser xmlResourceParser) {
            x xVarY;
            int depth = xmlResourceParser.getDepth();
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (true) {
                try {
                    int next = xmlResourceParser.next();
                    if ((next == 3 && xmlResourceParser.getDepth() <= depth) || next == 1) {
                        break;
                    }
                    if (next == 2 && "category".equals(xmlResourceParser.getName())) {
                        r.a aVar = new r.a(this.f21706b.a(), Xml.asAttributeSet(xmlResourceParser));
                        int i11 = i10 + 1;
                        aVar.d(i10 + 100);
                        int depth2 = xmlResourceParser.getDepth();
                        boolean z9 = false;
                        while (true) {
                            int next2 = xmlResourceParser.next();
                            if ((next2 == 3 && xmlResourceParser.getDepth() <= depth2) || next2 == 1) {
                                break;
                            }
                            if (next2 == 2) {
                                if ("static-wallpaper".equals(xmlResourceParser.getName())) {
                                    xVarY = p.y(this.f21706b.b(), aVar.c(), Xml.asAttributeSet(xmlResourceParser));
                                    if (c(xVarY)) {
                                    }
                                } else {
                                    xVarY = "live-wallpaper".equals(xmlResourceParser.getName()) ? k.y(this.f21707c, aVar.c(), Xml.asAttributeSet(xmlResourceParser)) : null;
                                }
                                if (xVarY != null) {
                                    aVar.a(xVarY);
                                    if (!z9) {
                                        z9 = true;
                                    }
                                }
                            }
                        }
                        r rVarB = aVar.b();
                        if (!rVarB.q().isEmpty()) {
                            arrayList.add(rVarB);
                        }
                        i10 = i11;
                    }
                } catch (IOException | XmlPullParserException e10) {
                    Log.w("DefaultCategoryProvider", "Couldn't read system wallpapers definition", e10);
                    return Collections.EMPTY_LIST;
                }
            }
            return arrayList;
        }

        protected List f(String str) {
            return g(str, null);
        }

        protected List g(String str, UnaryOperator unaryOperator) {
            Resources resourcesA = this.f21706b.a();
            String strB = this.f21706b.b();
            ArrayList arrayList = new ArrayList();
            if (resourcesA == null || strB == null) {
                return arrayList;
            }
            int identifier = resourcesA.getIdentifier(str, "xml", strB);
            if (identifier == 0) {
                com.nothing.wallpaper.common.log.c.f("DefaultCategoryProvider", "No wallpapers resource found:" + identifier);
                return arrayList;
            }
            XmlResourceParser xml = resourcesA.getXml(identifier);
            try {
                Collection collectionE = e(xml);
                if (xml != null) {
                    xml.close();
                }
                if (unaryOperator != null) {
                    collectionE = (Collection) unaryOperator.apply(collectionE);
                }
                arrayList.addAll(collectionE);
                arrayList.forEach(new Consumer() { // from class: h3.m
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        this.f21697a.publishProgress((AbstractC1356a) obj);
                    }
                });
                return arrayList;
            } catch (Throwable th) {
                if (xml != null) {
                    try {
                        xml.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void r9) {
            this.f21705a.a();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void onProgressUpdate(AbstractC1356a... abstractC1356aArr) {
            super.onProgressUpdate(abstractC1356aArr);
            for (AbstractC1356a abstractC1356a : abstractC1356aArr) {
                if (abstractC1356a != null) {
                    this.f21705a.b(abstractC1356a);
                }
            }
        }

        protected void j() {
            if (AbstractC1374n.f21698g == null) {
                AbstractC1374n.f21698g = d();
                return;
            }
            for (int i10 = 0; i10 < AbstractC1374n.f21698g.size(); i10++) {
                publishProgress((AbstractC1356a) AbstractC1374n.f21698g.get(i10));
            }
        }
    }

    public AbstractC1374n(Context context) {
        this.f21699a = context.getApplicationContext();
        this.f21702d = I.a().d(context);
    }

    private Locale i() {
        return this.f21699a.getResources().getConfiguration().getLocales().get(0);
    }

    public static int j(Context context) {
        return I.a().C().e(context) ? 51 : 1;
    }

    @Override // p064g3.InterfaceC1357b
    public boolean b() {
        if (this.f21703e == this.f21702d.b() && this.f21704f == i()) {
            return false;
        }
        this.f21700b.clear();
        this.f21701c = false;
        return true;
    }

    @Override // p064g3.InterfaceC1357b
    public void c(c cVar, boolean z9) {
        if (!z9 && this.f21701c) {
            Iterator it = this.f21700b.iterator();
            while (it.hasNext()) {
                cVar.b((AbstractC1356a) it.next());
            }
            cVar.a();
            return;
        }
        if (z9) {
            this.f21700b.clear();
            this.f21701c = false;
        }
        this.f21703e = this.f21702d.b();
        this.f21704f = i();
        h(cVar, z9);
    }

    @Override // p064g3.InterfaceC1357b
    public boolean d() {
        return false;
    }

    @Override // p064g3.InterfaceC1357b
    public AbstractC1356a e(int i10) {
        if (this.f21701c) {
            return (AbstractC1356a) this.f21700b.get(i10);
        }
        throw new IllegalStateException("Categories are not available");
    }

    @Override // p064g3.InterfaceC1357b
    public AbstractC1356a f(String str) {
        for (int i10 = 0; i10 < this.f21700b.size(); i10++) {
            AbstractC1356a abstractC1356a = (AbstractC1356a) this.f21700b.get(i10);
            if (abstractC1356a.b().equals(str)) {
                return abstractC1356a;
            }
        }
        return null;
    }

    @Override // p064g3.InterfaceC1357b
    public boolean g() {
        return false;
    }

    @Override // p064g3.InterfaceC1357b
    public int getSize() {
        if (this.f21701c) {
            return this.f21700b.size();
        }
        return 0;
    }

    protected abstract void h(c cVar, boolean z9);
}
