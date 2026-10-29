.class public final Ll7/r$c;
.super Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$DefaultOnStateChangedListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ll7/r;->D1(Lcom/davemorrissey/labs/subscaleview/ImageSource;Landroid/graphics/Point;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ll7/r;


# direct methods
.method constructor <init>(Ll7/r;)V
    .registers 2

    iput-object p1, p0, Ll7/r$c;->a:Ll7/r;

    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$DefaultOnStateChangedListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onCenterChanged(Landroid/graphics/PointF;I)V
    .registers 7

    const-string v0, "newCenter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$DefaultOnStateChangedListener;->onCenterChanged(Landroid/graphics/PointF;I)V

    iget-object p2, p0, Ll7/r$c;->a:Ll7/r;

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p2, v0, v1, v2, v3}, Ll7/r;->v1(Ll7/r;ZZILjava/lang/Object;)V

    iget-object p0, p0, Ll7/r$c;->a:Ll7/r;

    invoke-virtual {p0}, Ll7/r;->y1()Lo7/g;

    move-result-object p0

    const-string p2, "onCenterChanged"

    invoke-virtual {p0, p1, v3, p2}, Lo7/g;->j0(Landroid/graphics/PointF;Ljava/lang/Float;Ljava/lang/String;)V

    return-void
.end method

.method public onScaleChanged(FI)V
    .registers 7

    invoke-super {p0, p1, p2}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$DefaultOnStateChangedListener;->onScaleChanged(FI)V

    iget-object p2, p0, Ll7/r$c;->a:Ll7/r;

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p2, v0, v1, v2, v3}, Ll7/r;->v1(Ll7/r;ZZILjava/lang/Object;)V

    iget-object p0, p0, Ll7/r$c;->a:Ll7/r;

    invoke-virtual {p0}, Ll7/r;->y1()Lo7/g;

    move-result-object p0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    const-string p2, "onScaleChanged"

    invoke-virtual {p0, v3, p1, p2}, Lo7/g;->j0(Landroid/graphics/PointF;Ljava/lang/Float;Ljava/lang/String;)V

    return-void
.end method
