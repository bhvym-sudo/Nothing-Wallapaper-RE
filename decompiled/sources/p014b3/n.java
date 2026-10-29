package p014b3;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.drawable.DrawableResource;

/* JADX INFO: loaded from: classes.dex */
public class n implements ResourceDecoder {

    class a extends DrawableResource {
        a(n nVar, Drawable drawable) {
            super(drawable);
        }

        @Override // com.bumptech.glide.load.engine.Resource
        public Class getResourceClass() {
            return Drawable.class;
        }

        @Override // com.bumptech.glide.load.engine.Resource
        public int getSize() {
            return get().getIntrinsicWidth() * get().getIntrinsicHeight() * 4;
        }

        @Override // com.bumptech.glide.load.engine.Resource
        public void recycle() {
        }
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Resource decode(Drawable drawable, int i10, int i11, Options options) {
        return new a(this, drawable);
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean handles(Drawable drawable, Options options) {
        return true;
    }
}
