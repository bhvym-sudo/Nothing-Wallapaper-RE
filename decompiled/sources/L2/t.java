package L2;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.recyclerview.widget.ItemTouchHelper;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes.dex */
public class t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final List f4620d = Arrays.asList(0, 10, 50, 100, Integer.valueOf(ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION), 300, 400, 500, 600, Integer.valueOf(TypedValues.TransitionType.TYPE_DURATION), 800, Integer.valueOf(TypedValues.Custom.TYPE_INT), 1000);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p126m5.a f4621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f4622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f4623c;

    t(p126m5.a aVar) {
        this.f4621a = aVar;
        List list = f4620d;
        this.f4622b = (List) list.stream().map(new Function() { // from class: L2.q
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f4618a.l((Integer) obj);
            }
        }).collect(Collectors.toList());
        this.f4623c = (Map) list.stream().collect(Collectors.toMap(new Function() { // from class: L2.r
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return t.b((Integer) obj);
            }
        }, new Function() { // from class: L2.s
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f4619a.m((Integer) obj);
            }
        }));
    }

    public static /* synthetic */ Integer b(Integer num) {
        return num;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer l(Integer num) {
        return Integer.valueOf(d(num.floatValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer m(Integer num) {
        return Integer.valueOf(d(num.floatValue()));
    }

    public int d(float f10) {
        return this.f4621a.c((int) ((1000.0f - f10) / 10.0f));
    }

    public int e() {
        return ((Integer) this.f4622b.get(1)).intValue();
    }

    public int f() {
        return ((Integer) this.f4622b.get(3)).intValue();
    }

    public int g() {
        return ((Integer) this.f4622b.get(12)).intValue();
    }

    public int h() {
        return ((Integer) this.f4622b.get(4)).intValue();
    }

    public int i() {
        return ((Integer) this.f4622b.get(5)).intValue();
    }

    public int j() {
        return ((Integer) this.f4622b.get(7)).intValue();
    }

    public int k() {
        return ((Integer) this.f4622b.get(8)).intValue();
    }
}
