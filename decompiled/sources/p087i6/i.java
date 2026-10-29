package p087i6;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import com.nothing.wallpaper.common.log.c;
import java.io.File;
import java.io.OutputStream;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f22194a = new i();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Uri f22195a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f22196b;

        public a(Uri uri, String path) {
            n.h(uri, "uri");
            n.h(path, "path");
            this.f22195a = uri;
            this.f22196b = path;
        }

        public final String a() {
            return this.f22196b;
        }

        public final Uri b() {
            return this.f22195a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return n.d(this.f22195a, aVar.f22195a) && n.d(this.f22196b, aVar.f22196b);
        }

        public int hashCode() {
            return (this.f22195a.hashCode() * 31) + this.f22196b.hashCode();
        }

        public String toString() {
            return "MediaImageData(uri=" + this.f22195a + ", path=" + this.f22196b + ")";
        }
    }

    private i() {
    }

    public static final a a(Context context, String relativePath, String title) {
        n.h(context, "context");
        n.h(relativePath, "relativePath");
        n.h(title, "title");
        Cursor cursorQuery = context.getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "_data"}, "relative_path=? and title=?", new String[]{relativePath + File.separator, title}, null);
        a aVar = null;
        while (cursorQuery != null && cursorQuery.moveToNext()) {
            long j9 = cursorQuery.getLong(cursorQuery.getColumnIndex("_id"));
            String string = cursorQuery.getString(cursorQuery.getColumnIndex("_data"));
            Uri uri = Uri.parse(MediaStore.Images.Media.EXTERNAL_CONTENT_URI + "/" + j9);
            n.e(uri);
            n.e(string);
            aVar = new a(uri, string);
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0125 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x00b6: MOVE (r6 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]), block:B:17:0x00b6 */
    public static final boolean b(Context context, String relativePath, Bitmap image, String fileName) throws Throwable {
        OutputStream outputStreamOpenOutputStream;
        OutputStream outputStream;
        String message;
        StringBuilder sb;
        n.h(context, "context");
        n.h(relativePath, "relativePath");
        n.h(image, "image");
        n.h(fileName, "fileName");
        c.d("MediaStoreUtil", "saveImageToGallery fileName:" + fileName);
        long jCurrentTimeMillis = System.currentTimeMillis();
        a aVarA = a(context, relativePath, fileName);
        boolean z9 = true;
        if (aVarA != null) {
            c(context, aVarA, jCurrentTimeMillis);
            return true;
        }
        ContentValues contentValues = new ContentValues();
        ContentResolver contentResolver = context.getContentResolver();
        contentValues.put("relative_path", relativePath);
        contentValues.put("_display_name", fileName);
        contentValues.put("title", fileName);
        contentValues.put("mime_type", "image/png");
        long j9 = 1000;
        long j10 = jCurrentTimeMillis / j9;
        contentValues.put("date_added", Long.valueOf(j10));
        contentValues.put("date_modified", Long.valueOf(j10));
        contentValues.put("date_expires", Long.valueOf((jCurrentTimeMillis + 86400000) / j9));
        contentValues.put("is_pending", (Integer) 1);
        Uri uriInsert = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
        boolean z10 = false;
        if (uriInsert == null) {
            return false;
        }
        OutputStream outputStream2 = null;
        try {
            try {
                outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert);
                if (outputStreamOpenOutputStream != null) {
                    try {
                        if (image.compress(Bitmap.CompressFormat.PNG, 100, outputStreamOpenOutputStream)) {
                            contentValues.clear();
                            contentValues.put("is_pending", (Integer) 0);
                            contentValues.putNull("date_expires");
                            contentResolver.update(uriInsert, contentValues, null, null);
                        } else {
                            contentResolver.delete(uriInsert, null);
                            z9 = false;
                        }
                        c.n("MediaStoreUtil", "saveImageToGallery uri:" + uriInsert);
                        z10 = z9;
                    } catch (Exception e10) {
                        e = e10;
                        contentResolver.delete(uriInsert, null);
                        c.f("MediaStoreUtil", "saveImageToGallery save failed, msg:" + e.getMessage());
                        if (outputStreamOpenOutputStream != null) {
                            try {
                                outputStreamOpenOutputStream.close();
                            } catch (Exception e11) {
                                message = e11.getMessage();
                                sb = new StringBuilder();
                                sb.append("saveImageToGallery close stream failed, msg:");
                                sb.append(message);
                                c.f("MediaStoreUtil", sb.toString());
                            }
                        }
                    }
                }
                if (outputStreamOpenOutputStream != null) {
                    try {
                        outputStreamOpenOutputStream.close();
                    } catch (Exception e12) {
                        message = e12.getMessage();
                        sb = new StringBuilder();
                        sb.append("saveImageToGallery close stream failed, msg:");
                        sb.append(message);
                        c.f("MediaStoreUtil", sb.toString());
                    }
                }
            } catch (Throwable th) {
                th = th;
                outputStream2 = outputStream;
                if (outputStream2 != null) {
                    try {
                        outputStream2.close();
                    } catch (Exception e13) {
                        c.f("MediaStoreUtil", "saveImageToGallery close stream failed, msg:" + e13.getMessage());
                    }
                }
                throw th;
            }
        } catch (Exception e14) {
            e = e14;
            outputStreamOpenOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            if (outputStream2 != null) {
                outputStream2.close();
            }
            throw th;
        }
        return z10;
    }

    public static final boolean c(Context context, a mediaData, long j9) {
        n.h(context, "context");
        n.h(mediaData, "mediaData");
        File file = new File(mediaData.a());
        if (file.exists() && file.isFile()) {
            file.setLastModified(j9);
        }
        ContentValues contentValues = new ContentValues();
        ContentResolver contentResolver = context.getContentResolver();
        contentValues.put("is_pending", (Integer) 1);
        contentValues.put("date_modified", Long.valueOf(j9));
        boolean z9 = false;
        try {
            int iUpdate = contentResolver.update(mediaData.b(), contentValues, null, null);
            contentValues.put("is_pending", (Integer) 0);
            int iUpdate2 = contentResolver.update(mediaData.b(), contentValues, null, null);
            boolean z10 = iUpdate > 0 && iUpdate2 > 0;
            try {
                c.d("MediaStoreUtil", "updateImage count1:" + iUpdate + " count2:" + iUpdate2);
                return z10;
            } catch (Exception e10) {
                e = e10;
                z9 = z10;
                c.f("MediaStoreUtil", "updateImage occur error, exception:" + e.getMessage());
                return z9;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }
}
