.class public final synthetic Lr6/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Lr6/g;

.field public final synthetic r:Landroid/view/SurfaceControl;

.field public final synthetic s:Landroid/graphics/Rect;


# direct methods
.method public synthetic constructor <init>(Lr6/g;Landroid/view/SurfaceControl;Landroid/graphics/Rect;)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr6/e;->q:Lr6/g;

    iput-object p2, p0, Lr6/e;->r:Landroid/view/SurfaceControl;

    iput-object p3, p0, Lr6/e;->s:Landroid/graphics/Rect;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    iget-object v0, p0, Lr6/e;->q:Lr6/g;

    iget-object v1, p0, Lr6/e;->r:Landroid/view/SurfaceControl;

    iget-object p0, p0, Lr6/e;->s:Landroid/graphics/Rect;

    invoke-static {v0, v1, p0}, Lr6/g;->e(Lr6/g;Landroid/view/SurfaceControl;Landroid/graphics/Rect;)V

    return-void
.end method
