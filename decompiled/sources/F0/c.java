package F0;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private LayoutInflater f1505A;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f1506y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f1507z;

    public c(Context context, int i10, Cursor cursor, boolean z9) {
        super(context, cursor, z9);
        this.f1507z = i10;
        this.f1506y = i10;
        this.f1505A = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // F0.a
    public View c(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f1505A.inflate(this.f1507z, viewGroup, false);
    }

    @Override // F0.a
    public View d(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f1505A.inflate(this.f1506y, viewGroup, false);
    }
}
