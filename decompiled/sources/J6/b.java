package J6;

import android.content.res.Resources;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p064g3.r;
import p064g3.x;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends r {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C0122b f3541h = new C0122b(null);

    public static final class a extends r.a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final String f3542h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f3543i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final int f3544j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final String f3545k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final List f3546l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Resources res, AttributeSet attrs) {
            super(res, attrs);
            n.h(res, "res");
            n.h(attrs, "attrs");
            String attributeValue = attrs.getAttributeValue(null, "id");
            String string = "";
            this.f3542h = attributeValue == null ? "" : attributeValue;
            this.f3543i = attrs.getAttributeIntValue(null, "priority", -1);
            int attributeResourceValue = attrs.getAttributeResourceValue(null, "title", 0);
            this.f3544j = attributeResourceValue;
            if (attributeResourceValue != 0) {
                string = res.getString(attributeResourceValue);
                n.g(string, "getString(...)");
            }
            this.f3545k = string;
            this.f3546l = new ArrayList();
        }

        @Override // g3.r.a
        public String c() {
            return this.f3542h;
        }

        @Override // g3.r.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public a a(x info) {
            n.h(info, "info");
            this.f3546l.add(info);
            return this;
        }

        @Override // g3.r.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public b b() {
            return new b(this.f3545k, this.f3542h, this.f3546l, this.f3543i);
        }

        @Override // g3.r.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public a d(int i10) {
            if (this.f3543i < 0) {
                this.f3543i = i10;
            }
            return this;
        }
    }

    /* JADX INFO: renamed from: J6.b$b, reason: collision with other inner class name */
    public static final class C0122b {
        public /* synthetic */ C0122b(AbstractC1457h abstractC1457h) {
            this();
        }

        private C0122b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String title, String collectionId, List wallpapers, int i10) {
        super(title, collectionId, wallpapers, i10);
        n.h(title, "title");
        n.h(collectionId, "collectionId");
        n.h(wallpapers, "wallpapers");
    }
}
