package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.collection.P;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class f extends ActionMode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f10314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final b f10315b;

    public static class a implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ActionMode.Callback f10316a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Context f10317b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final ArrayList f10318c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final P f10319d = new P();

        public a(Context context, ActionMode.Callback callback) {
            this.f10317b = context;
            this.f10316a = callback;
        }

        private Menu f(Menu menu) {
            Menu menu2 = (Menu) this.f10319d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            p100k.d dVar = new p100k.d(this.f10317b, (p211v0.a) menu);
            this.f10319d.put(menu, dVar);
            return dVar;
        }

        @Override // androidx.appcompat.view.b.a
        public void a(b bVar) {
            this.f10316a.onDestroyActionMode(e(bVar));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean b(b bVar, Menu menu) {
            return this.f10316a.onCreateActionMode(e(bVar), f(menu));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean c(b bVar, Menu menu) {
            return this.f10316a.onPrepareActionMode(e(bVar), f(menu));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean d(b bVar, MenuItem menuItem) {
            return this.f10316a.onActionItemClicked(e(bVar), new p100k.c(this.f10317b, (p211v0.b) menuItem));
        }

        public ActionMode e(b bVar) {
            int size = this.f10318c.size();
            for (int i10 = 0; i10 < size; i10++) {
                f fVar = (f) this.f10318c.get(i10);
                if (fVar != null && fVar.f10315b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f10317b, bVar);
            this.f10318c.add(fVar2);
            return fVar2;
        }
    }

    public f(Context context, b bVar) {
        this.f10314a = context;
        this.f10315b = bVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f10315b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f10315b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new p100k.d(this.f10314a, (p211v0.a) this.f10315b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f10315b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f10315b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f10315b.h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f10315b.i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f10315b.j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f10315b.k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f10315b.l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f10315b.m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f10315b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f10315b.p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f10315b.r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z9) {
        this.f10315b.s(z9);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i10) {
        this.f10315b.n(i10);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i10) {
        this.f10315b.q(i10);
    }
}
