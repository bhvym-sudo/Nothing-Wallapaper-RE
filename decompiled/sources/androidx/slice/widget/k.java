package androidx.slice.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.format.DateUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    public static void a(Context context, int i10, IconCompat iconCompat, boolean z9, ViewGroup viewGroup) {
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(iconCompat.n(context));
        imageView.setScaleType(z9 ? ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.CENTER_INSIDE);
        viewGroup.addView(imageView);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        if (z9) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i10, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            imageView.layout(0, 0, i10, i10);
            imageView.draw(canvas);
            imageView.setImageBitmap(c(bitmapCreateBitmap));
        } else {
            imageView.setColorFilter(-1);
        }
        layoutParams.width = i10;
        layoutParams.height = i10;
        layoutParams.gravity = 17;
    }

    public static IconCompat b(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return IconCompat.e(((BitmapDrawable) drawable).getBitmap());
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return IconCompat.e(bitmapCreateBitmap);
    }

    public static Bitmap c(Bitmap bitmap) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        canvas.drawCircle(bitmap.getWidth() / 2, bitmap.getHeight() / 2, bitmap.getWidth() / 2, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return bitmapCreateBitmap;
    }

    public static int d(Context context) {
        return e(context, R.attr.colorAccent);
    }

    public static int e(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{i10});
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }

    public static Drawable f(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{i10});
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        return drawable;
    }

    public static CharSequence g(Context context, long j9) {
        return (j9 < System.currentTimeMillis() || DateUtils.isToday(j9)) ? DateUtils.getRelativeTimeSpanString(j9, Calendar.getInstance().getTimeInMillis(), 60000L, 262144) : DateUtils.formatDateTime(context, j9, 8);
    }

    public static int h(int i10) {
        if (i10 == 2 || i10 == 3 || i10 == 1 || i10 == 0) {
            return i10;
        }
        return -1;
    }

    public static void i(Context context, ProgressBar progressBar) {
        int iE = e(context, p122m1.a.f23098a);
        Drawable drawableR = p201u0.a.r(progressBar.getIndeterminateDrawable());
        if (drawableR != null) {
            drawableR.setColorFilter(iE, PorterDuff.Mode.MULTIPLY);
            progressBar.setProgressDrawable(drawableR);
        }
    }
}
