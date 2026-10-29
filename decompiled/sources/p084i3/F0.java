package p084i3;

import android.os.Bundle;
import com.nothing.wallpaper.R;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import p064g3.f;
import p224w3.a;
import p224w3.d;

/* JADX INFO: loaded from: classes.dex */
public class F0 extends C1416o {
    public static /* synthetic */ boolean Q0(f fVar) {
        return (fVar instanceof d) || (fVar instanceof a);
    }

    public static F0 R0() {
        F0 f10 = new F0();
        f10.setArguments(new Bundle());
        return f10;
    }

    @Override // p084i3.C1416o
    protected List A0(List list) {
        return super.A0((List) list.stream().filter(new Predicate() { // from class: i3.E0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return F0.Q0((f) obj);
            }
        }).collect(Collectors.toList()));
    }

    @Override // p084i3.C1416o, com.android.wallpaper.picker.a
    public CharSequence i0() {
        return getString(R.string.wallpaper_app_name);
    }
}
