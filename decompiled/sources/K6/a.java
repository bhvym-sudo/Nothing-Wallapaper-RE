package K6;

import J6.h;
import J6.i;
import J6.l;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import com.nothing.wallpaper.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p064g3.AbstractC1356a;
import p064g3.p;
import p064g3.r;
import p064g3.x;
import p074h3.AbstractC1374n;
import p074h3.H;
import p074h3.I;
import p079h8.q;
import p087i6.e;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends AbstractC1374n {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C0142a f4118h = new C0142a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final List f4119i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static List f4120j;

    /* JADX INFO: renamed from: K6.a$a, reason: collision with other inner class name */
    public static final class C0142a {
        public /* synthetic */ C0142a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final List a() {
            return b();
        }

        public final List b() {
            return a.f4120j;
        }

        public final List c() {
            return AbstractC1374n.f21698g;
        }

        public final void d(List list) {
            a.f4120j = list;
        }

        private C0142a() {
        }
    }

    public static final class b extends AbstractC1374n.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final p197t6.c f4121d;

        /* JADX INFO: renamed from: K6.a$b$a, reason: collision with other inner class name */
        public static final class C0143a implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return p109k8.a.d(Integer.valueOf(((p) obj2).A()), Integer.valueOf(((p) obj).A()));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p064g3.c receiver, Context context) {
            super(receiver, context);
            n.h(receiver, "receiver");
            n.h(context, "context");
            p034d3.a aVarC = I.a().C();
            n.f(aVarC, "null cannot be cast to non-null type com.nothing.wallpaper.config.NTFlags");
            this.f4121d = (p197t6.c) aVarC;
        }

        private final void m(r.a aVar, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            p pVarY;
            String packageName = this.f21707c.getPackageName();
            int depth = xmlPullParser.getDepth();
            while (true) {
                int next = xmlPullParser.next();
                if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                    return;
                }
                if (next == 2) {
                    if (n.d("color-wallpaper", xmlPullParser.getName())) {
                        J6.c.a aVar2 = J6.c.f3547G;
                        String strC = aVar.c();
                        n.g(strC, "getId(...)");
                        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
                        n.g(attributeSetAsAttributeSet, "asAttributeSet(...)");
                        J6.c cVarB = aVar2.b(strC, attributeSetAsAttributeSet);
                        if (cVarB != null) {
                            aVar.a(cVarB);
                        }
                    } else if (n.d("static-wallpaper", xmlPullParser.getName()) && (pVarY = p.y(packageName, aVar.c(), Xml.asAttributeSet(xmlPullParser))) != null) {
                        aVar.a(pVarY);
                    }
                }
            }
        }

        private final AbstractC1356a n(Context context) {
            String string = context.getString(R.string.my_photos_category_title);
            n.g(string, "getString(...)");
            String string2 = context.getString(R.string.image_wallpaper_collection_id);
            n.g(string2, "getString(...)");
            return new l(string, string2, AbstractC1374n.j(context), R.drawable.wallpaperpicker_emptystate);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void o(b bVar, AbstractC1356a abstractC1356a) {
            bVar.publishProgress(abstractC1356a);
        }

        private final void p() {
            if (p007a6.a.a("NTF_CO_CA")) {
                a.f4118h.d(f("business_partner"));
            }
        }

        private final void q() {
            List<r> listR = r(R.xml.wallpapers);
            if (listR != null) {
                for (r rVar : listR) {
                    List listQ = rVar.q();
                    n.g(listQ, "getUnmodifiableWallpapers(...)");
                    if (!listQ.isEmpty()) {
                        a.f4119i.add(rVar);
                        publishProgress(rVar);
                    }
                }
            }
        }

        private final List r(int i10) {
            Object objB;
            Resources resources = this.f21707c.getResources();
            if (i10 == 0) {
                return null;
            }
            try {
                q.a aVar = q.f21862r;
                ArrayList arrayList = new ArrayList();
                XmlResourceParser xml = resources.getXml(i10);
                n.g(xml, "getXml(...)");
                int depth = xml.getDepth();
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    int next = xml.next();
                    if (next == 3 && xml.getDepth() <= depth) {
                        break;
                    }
                    if (next == 1) {
                        break;
                    }
                    if (next == 2) {
                        if (n.d("color-category", xml.getName())) {
                            n.e(resources);
                            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                            n.g(attributeSetAsAttributeSet, "asAttributeSet(...)");
                            J6.b.a aVar2 = new J6.b.a(resources, attributeSetAsAttributeSet);
                            aVar2.d(i11 + 150);
                            m(aVar2, xml);
                            arrayList.add(aVar2.b());
                            i11++;
                        } else if (n.d("category", xml.getName())) {
                            r.a aVar3 = new r.a(resources, Xml.asAttributeSet(xml));
                            int i13 = i12 + 1;
                            aVar3.d(i12 + 100);
                            m(aVar3, xml);
                            r rVarB = aVar3.b();
                            n.g(rVarB, "build(...)");
                            arrayList.add(rVarB);
                            i12 = i13;
                        }
                    }
                }
                objB = q.b(arrayList);
            } catch (Throwable th) {
                q.a aVar4 = q.f21862r;
                objB = q.b(p079h8.r.a(th));
            }
            return (List) (q.f(objB) ? null : objB);
        }

        private final r s(r rVar, r rVar2) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            List<x> listQ = rVar2.q();
            n.g(listQ, "getUnmodifiableWallpapers(...)");
            for (x xVar : listQ) {
                if (!(xVar instanceof p) || ((p) xVar).A() == 0) {
                    n.e(xVar);
                    arrayList.add(xVar);
                } else {
                    arrayList2.add(xVar);
                }
            }
            List<x> listQ2 = rVar.q();
            n.g(listQ2, "getUnmodifiableWallpapers(...)");
            for (x xVar2 : listQ2) {
                if (!(xVar2 instanceof p) || ((p) xVar2).A() == 0) {
                    n.e(xVar2);
                    arrayList.add(xVar2);
                } else {
                    arrayList2.add(xVar2);
                }
            }
            if (arrayList2.size() > 1) {
                AbstractC1444s.y(arrayList2, new C0143a());
            }
            arrayList.addAll(0, arrayList2);
            return new r(rVar.h(), rVar.b(), arrayList, rVar.e());
        }

        private final void t() {
            if (a.f4119i.isEmpty()) {
                q();
                return;
            }
            Iterator it = a.f4119i.iterator();
            while (it.hasNext()) {
                publishProgress((AbstractC1356a) it.next());
            }
        }

        private final void u() {
            if (this.f4121d.x()) {
                i.a aVar = i.f3591F;
                String strA = aVar.a(this.f21707c);
                Context mAppContext = this.f21707c;
                n.g(mAppContext, "mAppContext");
                List listB = aVar.b(mAppContext, strA);
                String string = this.f21707c.getString(R.string.nt_ai_wallpaper_title);
                n.g(string, "getString(...)");
                publishProgress(new h(string, strA, listB, 1));
            }
        }

        @Override // p074h3.AbstractC1374n.a
        protected List b(List list) {
            r rVar;
            Object objPrevious;
            Object obj;
            List listR = r(R.xml.nt_wallpapers);
            if (listR != null) {
                ListIterator listIterator = listR.listIterator(listR.size());
                do {
                    rVar = null;
                    obj = null;
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                } while (!n.d(((r) objPrevious).b(), "nothing_category"));
                r rVar2 = (r) objPrevious;
                if (rVar2 != null) {
                    if (list != null) {
                        ListIterator listIterator2 = list.listIterator(list.size());
                        while (listIterator2.hasPrevious()) {
                            Object objPrevious2 = listIterator2.previous();
                            if (n.d(((r) objPrevious2).b(), "nothing_category")) {
                                obj = objPrevious2;
                                break;
                            }
                        }
                        rVar = (r) obj;
                    }
                    ArrayList arrayList = new ArrayList();
                    if (list != null) {
                        arrayList.addAll(list);
                    }
                    if (rVar == null) {
                        arrayList.add(rVar2);
                        return arrayList;
                    }
                    r rVarS = s(rVar, rVar2);
                    arrayList.remove(rVar);
                    arrayList.add(rVarS);
                    return arrayList;
                }
            }
            return list;
        }

        @Override // p074h3.AbstractC1374n.a
        protected boolean c(x xVar) {
            String strC;
            p pVar = xVar instanceof p ? (p) xVar : null;
            return (pVar == null || (strC = pVar.C()) == null || ((p007a6.a.a("NTF_ASTEROIDS") || p007a6.a.a("NTF_PJ_FRB") || p007a6.a.a("NTF_PJ_FRP")) && E8.i.B(e.f22188a.e(), strC, true))) ? false : true;
        }

        @Override // p074h3.AbstractC1374n.a
        protected List g(String str, UnaryOperator unaryOperator) {
            List list;
            ArrayList arrayList = new ArrayList();
            Resources resourcesA = this.f21706b.a();
            String strB = this.f21706b.b();
            if (resourcesA != null && strB != null) {
                com.nothing.wallpaper.common.log.c.d("NTCategoryProvider", "getSystemCategories pkg:" + strB);
                if (!n.d(strB, "com.nothing.wallpapersstub")) {
                    List listG = super.g(str, unaryOperator);
                    n.g(listG, "getSystemCategories(...)");
                    return listG;
                }
                U7.b bVar = U7.b.f7987a;
                Context mAppContext = this.f21707c;
                n.g(mAppContext, "mAppContext");
                ContentProviderClient contentProviderClientD = bVar.d(mAppContext);
                if (contentProviderClientD == null) {
                    List listG2 = super.g(str, unaryOperator);
                    n.g(listG2, "getSystemCategories(...)");
                    return listG2;
                }
                List listG3 = bVar.g(resourcesA, strB, contentProviderClientD);
                if (unaryOperator != null && (list = (List) unaryOperator.apply(listG3)) != null) {
                    listG3 = list;
                }
                arrayList.addAll(listG3);
                arrayList.forEach(new Consumer() { // from class: K6.b
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        a.b.o(this.f4124a, (AbstractC1356a) obj);
                    }
                });
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voids) {
            n.h(voids, "voids");
            H hA = I.a();
            Context mAppContext = this.f21707c;
            n.g(mAppContext, "mAppContext");
            this.f21706b = hA.v(mAppContext);
            Context mAppContext2 = this.f21707c;
            n.g(mAppContext2, "mAppContext");
            publishProgress(n(mAppContext2));
            u();
            j();
            t();
            p();
            return null;
        }
    }

    public static final class c implements p064g3.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p064g3.c f4122a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f4123b;

        c(p064g3.c cVar, a aVar) {
            this.f4122a = cVar;
            this.f4123b = aVar;
        }

        @Override // p064g3.c
        public void a() {
            this.f4122a.a();
            ((AbstractC1374n) this.f4123b).f21701c = true;
        }

        @Override // p064g3.c
        public void b(AbstractC1356a category) {
            n.h(category, "category");
            if (n.d("cape_category", category.b())) {
                return;
            }
            this.f4122a.b(category);
            int iR = this.f4123b.r(category);
            if (iR < 0) {
                ((AbstractC1374n) this.f4123b).f21700b.add(category);
            } else {
                ((AbstractC1374n) this.f4123b).f21700b.remove(iR);
                ((AbstractC1374n) this.f4123b).f21700b.add(iR, category);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        n.h(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int r(AbstractC1356a abstractC1356a) {
        ArrayList mCategories = this.f21700b;
        n.g(mCategories, "mCategories");
        int i10 = 0;
        for (Object obj : mCategories) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC1444s.t();
            }
            if (n.d(abstractC1356a.b(), ((AbstractC1356a) obj).b())) {
                return i10;
            }
            i10 = i11;
        }
        return -1;
    }

    @Override // p074h3.AbstractC1374n
    protected void h(p064g3.c receiver, boolean z9) {
        n.h(receiver, "receiver");
        c cVar = new c(receiver, this);
        Context mAppContext = this.f21699a;
        n.g(mAppContext, "mAppContext");
        new b(cVar, mAppContext).execute(new Void[0]);
    }
}
