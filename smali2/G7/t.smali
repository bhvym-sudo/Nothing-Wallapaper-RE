.class public final synthetic LG7/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/a;


# instance fields
.field public final synthetic q:Landroid/view/SurfaceView;

.field public final synthetic r:Landroid/widget/ImageView;

.field public final synthetic s:Lv8/a;


# direct methods
.method public synthetic constructor <init>(Landroid/view/SurfaceView;Landroid/widget/ImageView;Lv8/a;)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LG7/t;->q:Landroid/view/SurfaceView;

    iput-object p2, p0, LG7/t;->r:Landroid/widget/ImageView;

    iput-object p3, p0, LG7/t;->s:Lv8/a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .registers 3

    iget-object v0, p0, LG7/t;->q:Landroid/view/SurfaceView;

    iget-object v1, p0, LG7/t;->r:Landroid/widget/ImageView;

    iget-object p0, p0, LG7/t;->s:Lv8/a;

    invoke-static {v0, v1, p0}, LG7/v;->b(Landroid/view/SurfaceView;Landroid/widget/ImageView;Lv8/a;)Lh8/A;

    move-result-object p0

    return-object p0
.end method
