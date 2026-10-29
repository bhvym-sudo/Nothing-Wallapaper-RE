.class public final synthetic Lt7/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/l;


# instance fields
.field public final synthetic q:Landroid/graphics/Bitmap;

.field public final synthetic r:Landroid/widget/ImageView$ScaleType;


# direct methods
.method public synthetic constructor <init>(Landroid/graphics/Bitmap;Landroid/widget/ImageView$ScaleType;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt7/h;->q:Landroid/graphics/Bitmap;

    iput-object p2, p0, Lt7/h;->r:Landroid/widget/ImageView$ScaleType;

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    iget-object v0, p0, Lt7/h;->q:Landroid/graphics/Bitmap;

    iget-object p0, p0, Lt7/h;->r:Landroid/widget/ImageView$ScaleType;

    check-cast p1, Landroid/widget/ImageView;

    invoke-static {v0, p0, p1}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->a(Landroid/graphics/Bitmap;Landroid/widget/ImageView$ScaleType;Landroid/widget/ImageView;)Lh8/A;

    move-result-object p0

    return-object p0
.end method
