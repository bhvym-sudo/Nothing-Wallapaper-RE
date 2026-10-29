package androidx.slice.widget;

import android.R;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.util.TypedValue;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.slice.SliceItem;

/* JADX INFO: loaded from: classes.dex */
public class MessageView extends SliceChildView {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private TextView f13762A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private ImageView f13763B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f13764C;

    @Override // androidx.slice.widget.SliceChildView
    public void a() {
    }

    @Override // androidx.slice.widget.SliceChildView
    public void c(SliceItem sliceItem, boolean z9, int i10, int i11, SliceView.d dVar) {
        Drawable drawableN;
        setSliceActionListener(dVar);
        this.f13764C = i10;
        SliceItem sliceItemP = p112l1.f.p(sliceItem, "image", "source");
        if (sliceItemP != null && sliceItemP.f() != null && (drawableN = sliceItemP.f().n(getContext())) != null) {
            int iApplyDimension = (int) TypedValue.applyDimension(1, 24.0f, getContext().getResources().getDisplayMetrics());
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iApplyDimension, iApplyDimension, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableN.setBounds(0, 0, iApplyDimension, iApplyDimension);
            drawableN.draw(canvas);
            this.f13763B.setImageBitmap(k.c(bitmapCreateBitmap));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (SliceItem sliceItem2 : p112l1.f.k(sliceItem, "text")) {
            if (spannableStringBuilder.length() != 0) {
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append(sliceItem2.l());
        }
        this.f13762A.setText(spannableStringBuilder.toString());
    }

    @Override // androidx.slice.widget.SliceChildView
    public int getMode() {
        return 2;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f13762A = (TextView) findViewById(R.id.summary);
        this.f13763B = (ImageView) findViewById(R.id.icon);
    }
}
