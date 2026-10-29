package N0;

import L0.C0927d;
import androidx.datastore.preferences.protobuf.C1115z;
import java.io.InputStream;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f5190a = new a(null);

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final f a(InputStream input) throws C0927d {
            n.h(input, "input");
            try {
                f fVarV = f.V(input);
                n.g(fVarV, "{\n                Prefer…From(input)\n            }");
                return fVarV;
            } catch (C1115z e10) {
                throw new C0927d("Unable to parse preferences proto.", e10);
            }
        }

        private a() {
        }
    }
}
