package p203u2;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import p191t0.d;

/* JADX INFO: loaded from: classes.dex */
public class a extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f27963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f27964b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Path f27966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Path f27967e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Matrix f27968f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Paint f27965c = new Paint(1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f27969g = -1.0f;

    public a(int i10, int i11, String str) {
        this.f27963a = i10;
        this.f27964b = i11;
        Path pathE = d.e(str);
        this.f27966d = pathE;
        this.f27967e = new Path(pathE);
        this.f27968f = new Matrix();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        double dWidth = getBounds().width();
        for (int i10 = 0; i10 < this.f27964b; i10++) {
            for (int i11 = 0; i11 < this.f27963a; i11++) {
                int iSave = canvas.save();
                canvas.translate((float) (((((double) i10) * dWidth) / ((double) this.f27964b)) + 6.0d), (float) (((((double) i11) * dWidth) / ((double) this.f27963a)) + 6.0d));
                canvas.drawPath(this.f27967e, this.f27965c);
                canvas.restoreToCount(iSave);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        float fWidth = rect.width() / Math.max(this.f27964b, this.f27963a);
        this.f27969g = fWidth;
        float f10 = (fWidth - 12.0f) / 100.0f;
        this.f27968f.setScale(f10, f10);
        this.f27966d.transform(this.f27968f, this.f27967e);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f27965c.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f27965c.setColorFilter(colorFilter);
    }
}
