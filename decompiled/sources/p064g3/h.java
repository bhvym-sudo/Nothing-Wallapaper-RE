package p064g3;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.provider.MediaStore;
import androidx.constraintlayout.core.widgets.Optimizer;
import com.android.wallpaper.asset.a;
import com.android.wallpaper.asset.g;

/* JADX INFO: loaded from: classes.dex */
public abstract class h extends AbstractC1356a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f21165d;

    public h(String str, String str2, int i10, int i11) {
        super(str, str2, i10);
        this.f21165d = i11;
    }

    private boolean o(Context context) {
        return context.getPackageManager().checkPermission("android.permission.READ_MEDIA_IMAGES", context.getPackageName()) == 0;
    }

    @Override // p064g3.AbstractC1356a
    public Drawable c(Context context) {
        if (g(context) != null || this.f21165d <= 0) {
            return null;
        }
        return context.getResources().getDrawable(this.f21165d);
    }

    @Override // p064g3.AbstractC1356a
    public int d() {
        return Optimizer.OPTIMIZATION_GRAPH_WRAP;
    }

    @Override // p064g3.AbstractC1356a
    public a g(Context context) {
        g gVar = null;
        if (!o(context)) {
            return null;
        }
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        Cursor cursorQuery = contentResolver.query(uri, new String[]{"_id", "date_modified"}, null, null, "date_modified DESC");
        if (cursorQuery != null) {
            if (cursorQuery.moveToNext()) {
                gVar = new g(context, Uri.parse(uri + "/" + cursorQuery.getString(0)));
            }
            cursorQuery.close();
        }
        return gVar;
    }

    @Override // p064g3.AbstractC1356a
    public void k(Activity activity, int i10) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("image/*");
        activity.startActivityForResult(intent, i10);
    }

    @Override // p064g3.AbstractC1356a
    public boolean l() {
        return true;
    }
}
