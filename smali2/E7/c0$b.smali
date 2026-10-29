.class public final LE7/c0$b;
.super Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$DefaultOnStateChangedListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE7/c0;->o()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LE7/c0;


# direct methods
.method constructor <init>(LE7/c0;)V
    .registers 2

    iput-object p1, p0, LE7/c0$b;->a:LE7/c0;

    invoke-direct {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$DefaultOnStateChangedListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onCenterChanged(Landroid/graphics/PointF;I)V
    .registers 4

    const-string v0, "newCenter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$DefaultOnStateChangedListener;->onCenterChanged(Landroid/graphics/PointF;I)V

    iget-object p2, p0, LE7/c0$b;->a:LE7/c0;

    invoke-static {p2}, LE7/c0;->d(LE7/c0;)V

    iget-object p0, p0, LE7/c0$b;->a:LE7/c0;

    invoke-static {p0}, LE7/c0;->c(LE7/c0;)Lo7/g;

    move-result-object p0

    if-eqz p0, :cond_1b

    const/4 p2, 0x0

    const-string v0, "onCenterChanged"

    invoke-virtual {p0, p1, p2, v0}, Lo7/g;->j0(Landroid/graphics/PointF;Ljava/lang/Float;Ljava/lang/String;)V

    :cond_1b
    return-void
.end method

.method public onScaleChanged(FI)V
    .registers 4

    invoke-super {p0, p1, p2}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$DefaultOnStateChangedListener;->onScaleChanged(FI)V

    iget-object p2, p0, LE7/c0$b;->a:LE7/c0;

    invoke-static {p2}, LE7/c0;->d(LE7/c0;)V

    iget-object p0, p0, LE7/c0$b;->a:LE7/c0;

    invoke-static {p0}, LE7/c0;->c(LE7/c0;)Lo7/g;

    move-result-object p0

    if-eqz p0, :cond_1a

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    const-string p2, "onScaleChanged"

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1, p2}, Lo7/g;->j0(Landroid/graphics/PointF;Ljava/lang/Float;Ljava/lang/String;)V

    :cond_1a
    return-void
.end method
