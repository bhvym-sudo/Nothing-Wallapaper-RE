package M4;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[] f4991i = new int[3];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float[] f4992j = {0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int[] f4993k = new int[4];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final float[] f4994l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint f4995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Paint f4996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Paint f4997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f4998d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f4999e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f5000f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Path f5001g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Paint f5002h;

    public a() {
        this(-16777216);
    }

    public void a(Canvas canvas, Matrix matrix, RectF rectF, int i10, float f10, float f11) {
        float f12;
        boolean z9 = f11 < 0.0f;
        Path path = this.f5001g;
        if (z9) {
            int[] iArr = f4993k;
            iArr[0] = 0;
            iArr[1] = this.f5000f;
            iArr[2] = this.f4999e;
            iArr[3] = this.f4998d;
            f12 = f10;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            f12 = f10;
            path.arcTo(rectF, f12, f11);
            path.close();
            float f13 = -i10;
            rectF.inset(f13, f13);
            int[] iArr2 = f4993k;
            iArr2[0] = 0;
            iArr2[1] = this.f4998d;
            iArr2[2] = this.f4999e;
            iArr2[3] = this.f5000f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f14 = 1.0f - (i10 / fWidth);
        float[] fArr = f4994l;
        fArr[1] = f14;
        fArr[2] = ((1.0f - f14) / 2.0f) + f14;
        this.f4996b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, f4993k, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z9) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f5002h);
        }
        canvas.drawArc(rectF, f12, f11, true, this.f4996b);
        canvas.restore();
    }

    public void b(Canvas canvas, Matrix matrix, RectF rectF, int i10) {
        rectF.bottom += i10;
        rectF.offset(0.0f, -i10);
        int[] iArr = f4991i;
        iArr[0] = this.f5000f;
        iArr[1] = this.f4999e;
        iArr[2] = this.f4998d;
        Paint paint = this.f4997c;
        float f10 = rectF.left;
        paint.setShader(new LinearGradient(f10, rectF.top, f10, rectF.bottom, iArr, f4992j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f4997c);
        canvas.restore();
    }

    public Paint c() {
        return this.f4995a;
    }

    public void d(int i10) {
        this.f4998d = p191t0.a.x(i10, 68);
        this.f4999e = p191t0.a.x(i10, 20);
        this.f5000f = p191t0.a.x(i10, 0);
        this.f4995a.setColor(this.f4998d);
    }

    public a(int i10) {
        this.f5001g = new Path();
        Paint paint = new Paint();
        this.f5002h = paint;
        this.f4995a = new Paint();
        d(i10);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f4996b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f4997c = new Paint(paint2);
    }
}
