package F0;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, F0.b.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected boolean f1494q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected boolean f1495r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected Cursor f1496s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected Context f1497t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected int f1498u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected C0060a f1499v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected DataSetObserver f1500w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected F0.b f1501x;

    /* JADX INFO: renamed from: F0.a$a, reason: collision with other inner class name */
    private class C0060a extends ContentObserver {
        C0060a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z9) {
            a.this.e();
        }
    }

    private class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a aVar = a.this;
            aVar.f1494q = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a aVar = a.this;
            aVar.f1494q = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z9) {
        b(context, cursor, z9 ? 1 : 2);
    }

    public abstract void a(View view, Context context, Cursor cursor);

    void b(Context context, Cursor cursor, int i10) {
        if ((i10 & 1) == 1) {
            i10 |= 2;
            this.f1495r = true;
        } else {
            this.f1495r = false;
        }
        boolean z9 = cursor != null;
        this.f1496s = cursor;
        this.f1494q = z9;
        this.f1497t = context;
        this.f1498u = z9 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i10 & 2) == 2) {
            this.f1499v = new C0060a();
            this.f1500w = new b();
        } else {
            this.f1499v = null;
            this.f1500w = null;
        }
        if (z9) {
            C0060a c0060a = this.f1499v;
            if (c0060a != null) {
                cursor.registerContentObserver(c0060a);
            }
            DataSetObserver dataSetObserver = this.f1500w;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View c(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // F0.b.a
    public void changeCursor(Cursor cursor) {
        Cursor cursorF = f(cursor);
        if (cursorF != null) {
            cursorF.close();
        }
    }

    public abstract View d(Context context, Cursor cursor, ViewGroup viewGroup);

    protected void e() {
        Cursor cursor;
        if (!this.f1495r || (cursor = this.f1496s) == null || cursor.isClosed()) {
            return;
        }
        this.f1494q = this.f1496s.requery();
    }

    public Cursor f(Cursor cursor) {
        Cursor cursor2 = this.f1496s;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0060a c0060a = this.f1499v;
            if (c0060a != null) {
                cursor2.unregisterContentObserver(c0060a);
            }
            DataSetObserver dataSetObserver = this.f1500w;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1496s = cursor;
        if (cursor == null) {
            this.f1498u = -1;
            this.f1494q = false;
            notifyDataSetInvalidated();
            return cursor2;
        }
        C0060a c0060a2 = this.f1499v;
        if (c0060a2 != null) {
            cursor.registerContentObserver(c0060a2);
        }
        DataSetObserver dataSetObserver2 = this.f1500w;
        if (dataSetObserver2 != null) {
            cursor.registerDataSetObserver(dataSetObserver2);
        }
        this.f1498u = cursor.getColumnIndexOrThrow("_id");
        this.f1494q = true;
        notifyDataSetChanged();
        return cursor2;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f1494q || (cursor = this.f1496s) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // F0.b.a
    public Cursor getCursor() {
        return this.f1496s;
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f1494q) {
            return null;
        }
        this.f1496s.moveToPosition(i10);
        if (view == null) {
            view = c(this.f1497t, this.f1496s, viewGroup);
        }
        a(view, this.f1497t, this.f1496s);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f1501x == null) {
            this.f1501x = new F0.b(this);
        }
        return this.f1501x;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        Cursor cursor;
        if (!this.f1494q || (cursor = this.f1496s) == null) {
            return null;
        }
        cursor.moveToPosition(i10);
        return this.f1496s;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        Cursor cursor;
        if (this.f1494q && (cursor = this.f1496s) != null && cursor.moveToPosition(i10)) {
            return this.f1496s.getLong(this.f1498u);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f1494q) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.f1496s.moveToPosition(i10)) {
            if (view == null) {
                view = d(this.f1497t, this.f1496s, viewGroup);
            }
            a(view, this.f1497t, this.f1496s);
            return view;
        }
        throw new IllegalStateException("couldn't move cursor to position " + i10);
    }
}
