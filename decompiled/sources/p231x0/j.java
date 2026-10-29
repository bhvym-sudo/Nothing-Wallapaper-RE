package p231x0;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
final class j implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LocaleList f29684a;

    j(Object obj) {
        this.f29684a = (LocaleList) obj;
    }

    @Override // p231x0.i
    public String a() {
        return this.f29684a.toLanguageTags();
    }

    @Override // p231x0.i
    public Object b() {
        return this.f29684a;
    }

    public boolean equals(Object obj) {
        return this.f29684a.equals(((i) obj).b());
    }

    @Override // p231x0.i
    public Locale get(int i10) {
        return this.f29684a.get(i10);
    }

    public int hashCode() {
        return this.f29684a.hashCode();
    }

    @Override // p231x0.i
    public boolean isEmpty() {
        return this.f29684a.isEmpty();
    }

    @Override // p231x0.i
    public int size() {
        return this.f29684a.size();
    }

    public String toString() {
        return this.f29684a.toString();
    }
}
