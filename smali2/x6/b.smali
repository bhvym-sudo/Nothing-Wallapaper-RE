.class public final synthetic Lx6/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Lx6/c;

.field public final synthetic r:I

.field public final synthetic s:I

.field public final synthetic t:Landroid/graphics/Rect;

.field public final synthetic u:Lcom/android/wallpaper/asset/a$d;


# direct methods
.method public synthetic constructor <init>(Lx6/c;IILandroid/graphics/Rect;Lcom/android/wallpaper/asset/a$d;)V
    .registers 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx6/b;->q:Lx6/c;

    iput p2, p0, Lx6/b;->r:I

    iput p3, p0, Lx6/b;->s:I

    iput-object p4, p0, Lx6/b;->t:Landroid/graphics/Rect;

    iput-object p5, p0, Lx6/b;->u:Lcom/android/wallpaper/asset/a$d;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 5

    iget-object v0, p0, Lx6/b;->q:Lx6/c;

    iget v1, p0, Lx6/b;->r:I

    iget v2, p0, Lx6/b;->s:I

    iget-object v3, p0, Lx6/b;->t:Landroid/graphics/Rect;

    iget-object p0, p0, Lx6/b;->u:Lcom/android/wallpaper/asset/a$d;

    invoke-static {v0, v1, v2, v3, p0}, Lx6/c;->t(Lx6/c;IILandroid/graphics/Rect;Lcom/android/wallpaper/asset/a$d;)V

    return-void
.end method
