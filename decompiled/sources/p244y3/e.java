package p244y3;

import H3.r;
import android.R;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.wallpaper.asset.g;
import com.android.wallpaper.picker.f;

/* JADX INFO: loaded from: classes.dex */
public class e extends RecyclerView.ViewHolder implements View.OnClickListener, f.b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Activity f30221q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final f f30222r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final ImageView f30223s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ImageView f30224t;

    class a extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f30225a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f30226b;

        a(Context context, c cVar) {
            this.f30225a = context;
            this.f30226b = cVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.android.wallpaper.asset.a doInBackground(Void... voidArr) {
            ContentResolver contentResolver = this.f30225a.getContentResolver();
            Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            Cursor cursorQuery = contentResolver.query(uri, new String[]{"_id", "date_modified"}, null, null, "date_modified DESC LIMIT 1");
            g gVar = null;
            if (cursorQuery != null) {
                if (cursorQuery.moveToNext()) {
                    gVar = new g(this.f30225a, Uri.parse(uri + "/" + cursorQuery.getString(0)));
                }
                cursorQuery.close();
            }
            return gVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(com.android.wallpaper.asset.a aVar) {
            this.f30226b.a(aVar);
        }
    }

    class b implements c {
        b() {
        }

        @Override // y3.e.c
        public void a(com.android.wallpaper.asset.a aVar) {
            if (aVar == null) {
                return;
            }
            aVar.n(e.this.f30221q, e.this.f30223s, r.a(e.this.f30221q, R.attr.colorSecondary));
        }
    }

    private interface c {
        void a(com.android.wallpaper.asset.a aVar);
    }

    private void g() {
        h(this.f30221q, new b());
    }

    private static void h(Context context, c cVar) {
        if (!i(context)) {
            cVar.a(null);
        }
        new a(context, cVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    private static boolean i(Context context) {
        return context.getPackageManager().checkPermission("android.permission.READ_MEDIA_IMAGES", context.getPackageName()) == 0;
    }

    @Override // com.android.wallpaper.picker.f.b
    public void b(boolean z9) {
    }

    @Override // com.android.wallpaper.picker.f.b
    public void c() {
        f();
    }

    void f() {
        if (i(this.f30221q)) {
            this.f30224t.setVisibility(8);
            g();
        } else {
            this.f30224t.setVisibility(0);
            this.f30224t.setImageDrawable(this.f30221q.getDrawable(2131231264));
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f30222r.a(this);
    }
}
