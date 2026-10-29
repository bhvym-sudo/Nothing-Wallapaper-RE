package androidx.slice.compat;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.widget.TextView;
import androidx.appcompat.app.b;
import p102k1.a;
import p112l1.c;

/* JADX INFO: loaded from: classes.dex */
public class SlicePermissionActivity extends Activity implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Uri f13701q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f13702r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f13703s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private b f13704t;

    private CharSequence a(PackageManager packageManager, ApplicationInfo applicationInfo) {
        String string = Html.fromHtml(applicationInfo.loadLabel(packageManager).toString()).toString();
        int length = string.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = string.codePointAt(iCharCount);
            int type = Character.getType(iCodePointAt);
            if (type == 13 || type == 15 || type == 14) {
                string = string.substring(0, iCharCount);
                break;
            }
            if (type == 12) {
                string = string.substring(0, iCharCount) + " " + string.substring(Character.charCount(iCodePointAt) + iCharCount);
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        String strTrim = string.trim();
        if (strTrim.isEmpty()) {
            return applicationInfo.packageName;
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(42.0f);
        return TextUtils.ellipsize(strTrim, textPaint, 500.0f, TextUtils.TruncateAt.END);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i10) {
        if (i10 == -1) {
            a.b(this, getPackageName(), this.f13702r, this.f13701q.buildUpon().path("").build());
        }
        finish();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f13701q = (Uri) getIntent().getParcelableExtra("slice_uri");
        this.f13702r = getIntent().getStringExtra("pkg");
        this.f13703s = getIntent().getStringExtra("provider_pkg");
        try {
            PackageManager packageManager = getPackageManager();
            String strJ = p251z0.a.c().j(a(packageManager, packageManager.getApplicationInfo(this.f13702r, 0)).toString());
            String strJ2 = p251z0.a.c().j(a(packageManager, packageManager.getApplicationInfo(this.f13703s, 0)).toString());
            b bVarO = new b.a(this).l(getString(c.f22861e, strJ, strJ2)).m(p112l1.b.f22856a).f(c.f22858b, this).j(c.f22857a, this).h(this).o();
            this.f13704t = bVarO;
            ((TextView) bVarO.getWindow().getDecorView().findViewById(p112l1.a.f22854a)).setText(getString(c.f22859c, strJ2));
            ((TextView) this.f13704t.getWindow().getDecorView().findViewById(p112l1.a.f22855b)).setText(getString(c.f22860d, strJ2));
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("SlicePermissionActivity", "Couldn't find package", e10);
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        b bVar = this.f13704t;
        if (bVar == null || !bVar.isShowing()) {
            return;
        }
        this.f13704t.cancel();
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        finish();
    }
}
