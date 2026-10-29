package p092j1;

import androidx.slice.Slice;
import androidx.slice.SliceItem;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f22291a;

    public c(Slice slice) {
        StringBuilder sb = new StringBuilder();
        a(slice, sb);
        this.f22291a = sb.toString();
    }

    private static void a(Slice slice, StringBuilder sb) {
        sb.append("s{");
        Iterator it = slice.e().iterator();
        while (it.hasNext()) {
            b((SliceItem) it.next(), sb);
        }
        sb.append("}");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x005f  */
    private static void b(SliceItem sliceItem, StringBuilder sb) {
        byte b10;
        switch (sliceItem.d()) {
            case "action":
                b10 = 1;
                break;
            case "bundle":
                b10 = 7;
                break;
            case "int":
                b10 = 4;
                break;
            case "long":
                b10 = 5;
                break;
            case "text":
                b10 = 2;
                break;
            case "image":
                b10 = 3;
                break;
            case "input":
                b10 = 6;
                break;
            case "slice":
                b10 = 0;
                break;
            default:
                b10 = -1;
                break;
        }
        if (b10 == 0) {
            a(sliceItem.j(), sb);
            return;
        }
        if (b10 == 1) {
            sb.append('a');
            if ("range".equals(sliceItem.k())) {
                sb.append('r');
            }
            a(sliceItem.j(), sb);
            return;
        }
        if (b10 == 2) {
            sb.append('t');
        } else {
            if (b10 != 3) {
                return;
            }
            sb.append('i');
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.f22291a.equals(((c) obj).f22291a);
        }
        return false;
    }

    public int hashCode() {
        return this.f22291a.hashCode();
    }

    public c(SliceItem sliceItem) {
        StringBuilder sb = new StringBuilder();
        b(sliceItem, sb);
        this.f22291a = sb.toString();
    }
}
