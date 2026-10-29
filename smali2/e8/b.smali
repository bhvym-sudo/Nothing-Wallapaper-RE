.class public interface abstract Le8/b;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract a(Ljava/lang/String;)V
.end method

.method public b(I)V
    .registers 2

    const-string p0, "IHapticEffectPerformer"

    const-string p1, "default setGain"

    invoke-static {p0, p1}, Ld8/d$a;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public c(Ljava/lang/String;)V
    .registers 2

    const-string p0, "IHapticEffectPerformer"

    const-string p1, "default setSenderId(int[])"

    invoke-static {p0, p1}, Ld8/d$a;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public d()I
    .registers 2

    const-string p0, "IHapticEffectPerformer"

    const-string v0, "default getRichTapCoreMajorVersion"

    invoke-static {p0, v0}, Ld8/d$a;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p0, -0x1

    return p0
.end method

.method public abstract stop()V
.end method
