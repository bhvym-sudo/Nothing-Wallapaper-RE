.class public final Ls6/h$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/SurfaceHolder$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls6/h;->z(Landroid/view/SurfaceView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic q:Ls6/h;

.field final synthetic r:Landroid/view/SurfaceView;


# direct methods
.method constructor <init>(Ls6/h;Landroid/view/SurfaceView;)V
    .registers 3

    iput-object p1, p0, Ls6/h$c;->q:Ls6/h;

    iput-object p2, p0, Ls6/h$c;->r:Landroid/view/SurfaceView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public surfaceChanged(Landroid/view/SurfaceHolder;III)V
    .registers 5

    const-string p0, "surfaceHolder"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public surfaceCreated(Landroid/view/SurfaceHolder;)V
    .registers 3

    const-string v0, "surfaceHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Ls6/h$c;->q:Ls6/h;

    invoke-static {p1}, Ls6/h;->i(Ls6/h;)Ls6/p;

    move-result-object p1

    iget-object v0, p0, Ls6/h$c;->r:Landroid/view/SurfaceView;

    invoke-virtual {p1, v0}, Ls6/p;->l0(Landroid/view/SurfaceView;)V

    iget-object p1, p0, Ls6/h$c;->r:Landroid/view/SurfaceView;

    invoke-virtual {p1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object p1

    invoke-interface {p1, p0}, Landroid/view/SurfaceHolder;->removeCallback(Landroid/view/SurfaceHolder$Callback;)V

    return-void
.end method

.method public surfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .registers 2

    const-string p0, "surfaceHolder"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
