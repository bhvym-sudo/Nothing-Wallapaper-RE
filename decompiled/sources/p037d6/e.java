package p037d6;

import I2.c;
import I2.f;
import O2.r;
import O2.s;
import O2.t;
import O2.u;
import O2.v;
import Q2.y;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemProperties;
import android.os.Vibrator;
import android.util.Log;
import android.view.LayoutInflater;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.n;
import p007a6.a;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f19670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LayoutInflater f19671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Resources f19672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f19673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Vibrator f19674e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f19675f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f19676g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f19677h;

    public e(Context context, LayoutInflater layoutInflater, Resources resources, boolean z9, Vibrator vibrator) {
        n.h(context, "context");
        n.h(layoutInflater, "layoutInflater");
        n.h(resources, "resources");
        this.f19670a = context;
        this.f19671b = layoutInflater;
        this.f19672c = resources;
        this.f19673d = z9;
        this.f19674e = vibrator;
        this.f19675f = "NTClockProvider";
        this.f19676g = n.d("Community Edition", SystemProperties.get("ro.phone.shell.persist_color")) && n.d("Asteroids", SystemProperties.get("ro.product.device"));
        Log.d("NTClockProvider", "init");
        this.f19677h = b();
    }

    private final boolean b() {
        return a.a("NTF_SUPPORT_OLD_QUICKLOOK");
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0035 A[PHI: r2
      0x0035: PHI (r2v7 d6.f) = 
      (r2v1 d6.f)
      (r2v2 d6.f)
      (r2v3 d6.f)
      (r2v4 d6.f)
      (r2v5 d6.f)
      (r2v9 d6.f)
      (r2v10 d6.f)
      (r2v11 d6.f)
      (r2v12 d6.f)
      (r2v13 d6.f)
      (r2v14 d6.f)
      (r2v15 d6.f)
      (r2v16 d6.f)
     binds: [B:35:0x00e5, B:38:0x00f9, B:41:0x010d, B:44:0x0121, B:47:0x0135, B:8:0x0033, B:11:0x0048, B:14:0x005b, B:17:0x006e, B:20:0x0081, B:23:0x0094, B:26:0x00a7, B:29:0x00ba] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // O2.u
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public b createClock(v settings) {
        f fVar;
        f fVar2;
        n.h(settings, "settings");
        if (Build.VERSION.SDK_INT > 35) {
            String strH = settings.h();
            Context context = this.f19670a;
            fVar = f.f19691z;
            if (!n.d(strH, context.getString(fVar.e()))) {
                Context context2 = this.f19670a;
                fVar2 = f.f19685t;
                if (n.d(strH, context2.getString(fVar2.e()))) {
                    fVar = fVar2;
                } else {
                    Context context3 = this.f19670a;
                    fVar2 = f.f19678A;
                    if (n.d(strH, context3.getString(fVar2.e()))) {
                        fVar = fVar2;
                    } else {
                        Context context4 = this.f19670a;
                        fVar2 = f.f19684s;
                        if (n.d(strH, context4.getString(fVar2.e()))) {
                            fVar = fVar2;
                        } else {
                            Context context5 = this.f19670a;
                            fVar2 = f.f19679B;
                            if (n.d(strH, context5.getString(fVar2.e()))) {
                                fVar = fVar2;
                            } else {
                                Context context6 = this.f19670a;
                                fVar2 = f.f19680C;
                                if (n.d(strH, context6.getString(fVar2.e()))) {
                                    fVar = fVar2;
                                } else {
                                    Context context7 = this.f19670a;
                                    fVar2 = f.f19690y;
                                    if (n.d(strH, context7.getString(fVar2.e()))) {
                                        fVar = fVar2;
                                    } else {
                                        Context context8 = this.f19670a;
                                        fVar2 = f.f19689x;
                                        if (n.d(strH, context8.getString(fVar2.e()))) {
                                            fVar = fVar2;
                                        } else {
                                            Context context9 = this.f19670a;
                                            fVar2 = f.f19681D;
                                            if (n.d(strH, context9.getString(fVar2.e()))) {
                                                fVar = fVar2;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            String strH2 = settings.h();
            Context context10 = this.f19670a;
            fVar = f.f19688w;
            if (!n.d(strH2, context10.getString(fVar.e()))) {
                Context context11 = this.f19670a;
                fVar2 = f.f19687v;
                if (n.d(strH2, context11.getString(fVar2.e()))) {
                    fVar = fVar2;
                } else {
                    Context context12 = this.f19670a;
                    fVar2 = f.f19685t;
                    if (n.d(strH2, context12.getString(fVar2.e()))) {
                        fVar = fVar2;
                    } else {
                        Context context13 = this.f19670a;
                        fVar2 = f.f19678A;
                        if (n.d(strH2, context13.getString(fVar2.e()))) {
                            fVar = fVar2;
                        } else {
                            Context context14 = this.f19670a;
                            fVar2 = f.f19684s;
                            if (n.d(strH2, context14.getString(fVar2.e()))) {
                                fVar = fVar2;
                            } else {
                                Context context15 = this.f19670a;
                                fVar2 = f.f19686u;
                                if (n.d(strH2, context15.getString(fVar2.e()))) {
                                    fVar = fVar2;
                                }
                            }
                        }
                    }
                }
            }
        }
        return new b(this.f19670a, fVar, this.f19671b, null);
    }

    @Override // O2.u
    public t getClockPickerConfig(v settings) {
        n.h(settings, "settings");
        List clocks = getClocks();
        if (!(clocks instanceof Collection) || !clocks.isEmpty()) {
            Iterator it = clocks.iterator();
            while (it.hasNext()) {
                if (n.d(((s) it.next()).a(), settings.h())) {
                    List listL = !this.f19673d ? AbstractC1444s.l() : O2.n.f5787h.a(y.f6811a.a(settings), settings.g());
                    Log.d(this.f19675f, " getClockPickerConfig:" + settings.h());
                    String strH = settings.h();
                    if (strH == null) {
                        strH = "DEFAULT";
                    }
                    String str = strH;
                    String string = this.f19672c.getString(f.f2983d);
                    n.g(string, "getString(...)");
                    String string2 = this.f19672c.getString(f.f2982c);
                    n.g(string2, "getString(...)");
                    Drawable drawable = this.f19672c.getDrawable(c.f2895a, null);
                    n.g(drawable, "getDrawable(...)");
                    return new t(str, string, string2, drawable, true, listL, null, 64, null);
                }
            }
        }
        throw new IllegalArgumentException(settings.h() + " is unsupported by " + this.f19675f);
    }

    @Override // O2.u
    public List getClocks() {
        ArrayList arrayList = new ArrayList();
        boolean z9 = Build.VERSION.SDK_INT <= 35;
        if (this.f19676g) {
            String string = this.f19670a.getString(f.f19681D.e());
            n.g(string, "getString(...)");
            arrayList.add(new s(string, false, null, false, 14, null));
        }
        String string2 = this.f19670a.getString((z9 ? f.f19688w : f.f19691z).e());
        n.g(string2, "getString(...)");
        arrayList.add(new s(string2, false, null, false, 14, null));
        String string3 = this.f19670a.getString((z9 ? f.f19687v : f.f19690y).e());
        n.g(string3, "getString(...)");
        arrayList.add(new s(string3, false, null, false, 14, null));
        String string4 = this.f19670a.getString(f.f19685t.e());
        n.g(string4, "getString(...)");
        arrayList.add(new s(string4, false, null, false, 14, null));
        String string5 = this.f19670a.getString(f.f19684s.e());
        n.g(string5, "getString(...)");
        arrayList.add(new s(string5, false, null, false, 14, null));
        String string6 = this.f19670a.getString((z9 ? f.f19686u : f.f19689x).e());
        n.g(string6, "getString(...)");
        arrayList.add(new s(string6, false, null, false, 14, null));
        if (this.f19677h) {
            String string7 = this.f19670a.getString(f.f19678A.e());
            n.g(string7, "getString(...)");
            arrayList.add(new s(string7, false, null, false, 14, null));
        }
        if (!z9) {
            String string8 = this.f19670a.getString(f.f19679B.e());
            n.g(string8, "getString(...)");
            arrayList.add(new s(string8, false, null, a.a("NTF_KEYGUARD_SPACE_AGE_CLOCKFACE_SUPPORT_TRANSITION"), 6, null));
            String string9 = this.f19670a.getString(f.f19680C.e());
            n.g(string9, "getString(...)");
            arrayList.add(new s(string9, false, null, false, 14, null));
            if (!this.f19676g && a.a("NTF_COMMUNITY_KEYGUARD_CLOCK")) {
                String string10 = this.f19670a.getString(f.f19681D.e());
                n.g(string10, "getString(...)");
                arrayList.add(new s(string10, false, null, true, 6, null));
            }
        }
        return arrayList;
    }

    @Override // O2.u
    public void initialize(r rVar) {
    }
}
