package p259z8;

import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a extends c {
    @Override // p259z8.c
    public int b() {
        return d().nextInt();
    }

    @Override // p259z8.c
    public int c(int i10) {
        return d().nextInt(i10);
    }

    public abstract Random d();
}
