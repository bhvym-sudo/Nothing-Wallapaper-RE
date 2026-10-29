package p074h3;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class r implements F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f21719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f21720b = new HashMap();

    private class a extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f21721a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Uri f21722b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private F.a f21723c;

        public a(Context context, Uri uri, F.a aVar) {
            this.f21721a = context;
            this.f21722b = uri;
            this.f21723c = aVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Intent doInBackground(Void... voidArr) {
            Intent intent = new Intent("android.intent.action.VIEW", this.f21722b);
            if (this.f21721a.getPackageManager().queryIntentActivities(intent, 0).isEmpty()) {
                intent = null;
            }
            r.this.f21720b.put(this.f21722b, intent);
            return intent;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Intent intent) {
            this.f21723c.a(intent);
        }
    }

    public r(Context context) {
        this.f21719a = context;
    }

    @Override // p074h3.F
    public void a(Uri uri, F.a aVar) {
        if (this.f21720b.containsKey(uri)) {
            aVar.a((Intent) this.f21720b.get(uri));
        } else {
            new a(this.f21719a, uri, aVar).execute(new Void[0]);
        }
    }
}
