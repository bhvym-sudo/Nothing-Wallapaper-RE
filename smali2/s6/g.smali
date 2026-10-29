.class public final synthetic Ls6/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Ls6/h;

.field public final synthetic r:Landroid/view/SurfaceView;


# direct methods
.method public synthetic constructor <init>(Ls6/h;Landroid/view/SurfaceView;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls6/g;->q:Ls6/h;

    iput-object p2, p0, Ls6/g;->r:Landroid/view/SurfaceView;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    iget-object v0, p0, Ls6/g;->q:Ls6/h;

    iget-object p0, p0, Ls6/g;->r:Landroid/view/SurfaceView;

    invoke-static {v0, p0}, Ls6/h;->g(Ls6/h;Landroid/view/SurfaceView;)V

    return-void
.end method
