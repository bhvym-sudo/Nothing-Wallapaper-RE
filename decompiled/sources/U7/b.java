package U7;

import F2.AbstractC0797d;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.android.wallpaper.asset.m;
import com.nothing.wallpaper.common.log.c;
import com.nothing.wallpapersstub.model.StubWallpaperCategory;
import com.nothing.wallpapersstub.model.StubWallpaperInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.n;
import p064g3.p;
import p064g3.r;
import p079h8.q;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f7987a = new b();

    private b() {
    }

    private final List b(Resources resources, String str, ArrayList arrayList) {
        String string;
        ArrayList arrayList2 = new ArrayList();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                StubWallpaperCategory stubWallpaperCategory = (StubWallpaperCategory) it.next();
                int iC = f7987a.c(resources, str, stubWallpaperCategory.getThumbRes());
                ArrayList arrayList3 = new ArrayList();
                r rVar = iC == 0 ? new r(stubWallpaperCategory.getTitle(), stubWallpaperCategory.getCollectionId(), new m(resources, iC), arrayList3, stubWallpaperCategory.getPriority()) : new r(stubWallpaperCategory.getTitle(), stubWallpaperCategory.getCollectionId(), stubWallpaperCategory.getFeaturedThumbnailIndex(), arrayList3, stubWallpaperCategory.getPriority());
                List<StubWallpaperInfo> wallpapers = stubWallpaperCategory.getWallpapers();
                if (wallpapers != null) {
                    for (StubWallpaperInfo stubWallpaperInfo : wallpapers) {
                        Bundle extra = stubWallpaperInfo.getExtra();
                        if (extra == null || (string = extra.getString("resType")) == null) {
                            string = "drawable";
                        }
                        String wallpaperId = stubWallpaperInfo.getWallpaperId();
                        r rVar2 = rVar;
                        String collectionId = stubWallpaperInfo.getCollectionId();
                        b bVar = f7987a;
                        ArrayList arrayList4 = arrayList3;
                        p pVar = new p(str, wallpaperId, collectionId, bVar.e(resources, str, string, stubWallpaperInfo.getDrawableResId()), bVar.f(resources, str, stubWallpaperInfo.getTitleResId()), bVar.f(resources, str, stubWallpaperInfo.getSubtitle1ResId()), 0, 0, 0, stubWallpaperInfo.getCoverPriority(), stubWallpaperInfo.getGridPriority(), null, stubWallpaperInfo.getSupportDepth());
                        pVar.D(n.d(string, "raw"));
                        arrayList4.add(pVar);
                        arrayList2 = arrayList2;
                        str = str;
                        arrayList3 = arrayList4;
                        rVar = rVar2;
                        resources = resources;
                    }
                }
                ArrayList arrayList5 = arrayList2;
                arrayList5.add(rVar);
                arrayList2 = arrayList5;
            }
        }
        return arrayList2;
    }

    private final int c(Resources resources, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return 0;
        }
        return resources.getIdentifier(str2, "drawable", str);
    }

    private final int e(Resources resources, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3)) {
            return 0;
        }
        return n.d(str2, "raw") ? resources.getIdentifier(str3, "raw", str) : resources.getIdentifier(str3, "drawable", str);
    }

    private final int f(Resources resources, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return 0;
        }
        return resources.getIdentifier(str2, TypedValues.Custom.S_STRING, str);
    }

    public static final void h(final Context context) {
        n.h(context, "context");
        AbstractC0797d.f1558f.execute(new Runnable() { // from class: U7.a
            @Override // java.lang.Runnable
            public final void run() {
                b.i(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(Context context) {
        b bVar = f7987a;
        try {
            q.a aVar = q.f21862r;
            ContentProviderClient contentProviderClientD = bVar.d(context);
            Bundle bundle = null;
            if (contentProviderClientD != null) {
                try {
                    Bundle bundleCall = contentProviderClientD.call("warm", null, null);
                    p199t8.a.a(contentProviderClientD, null);
                    bundle = bundleCall;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        p199t8.a.a(contentProviderClientD, th);
                        throw th2;
                    }
                }
            }
            q.b(bundle);
        } catch (Throwable th3) {
            q.a aVar2 = q.f21862r;
            q.b(p079h8.r.a(th3));
        }
    }

    public final ContentProviderClient d(Context context) {
        n.h(context, "context");
        return context.getContentResolver().acquireContentProviderClient(Uri.parse("content://com.nothing.wallpapersstub.share"));
    }

    public final List g(Resources resource, String pkgName, ContentProviderClient provider) {
        Object objB;
        n.h(resource, "resource");
        n.h(pkgName, "pkgName");
        n.h(provider, "provider");
        ArrayList arrayList = new ArrayList();
        try {
            q.a aVar = q.f21862r;
            try {
                Bundle bundleCall = provider.call("wallpaper", null, null);
                if (bundleCall != null) {
                    bundleCall.setClassLoader(StubWallpaperCategory.class.getClassLoader());
                    ArrayList parcelableArrayList = bundleCall.getParcelableArrayList("result", StubWallpaperCategory.class);
                    if (parcelableArrayList != null) {
                        arrayList.addAll(b(resource, pkgName, parcelableArrayList));
                    }
                } else {
                    bundleCall = null;
                }
                p199t8.a.a(provider, null);
                objB = q.b(bundleCall);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    p199t8.a.a(provider, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            q.a aVar2 = q.f21862r;
            objB = q.b(p079h8.r.a(th3));
        }
        Throwable thD = q.d(objB);
        if (thD != null) {
            c.f("NTWallpaperCategoryParser", "parse stub wallpapers failure: " + thD.getMessage());
        }
        return arrayList;
    }
}
