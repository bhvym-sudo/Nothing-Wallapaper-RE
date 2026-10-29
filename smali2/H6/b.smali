.class public abstract LH6/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroid/view/SurfaceView;F)V
    .registers 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x3f666666    # 0.9f

    mul-float/2addr p1, v0

    invoke-virtual {p0, p1}, Landroid/view/SurfaceView;->setCornerRadius(F)V

    return-void
.end method
