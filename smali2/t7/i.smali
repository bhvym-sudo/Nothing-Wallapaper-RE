.class public final synthetic Lt7/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/l;


# instance fields
.field public final synthetic q:Landroid/graphics/Bitmap;

.field public final synthetic r:Landroid/widget/ImageView$ScaleType;

.field public final synthetic s:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;

.field public final synthetic t:Lg3/x;

.field public final synthetic u:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Landroid/graphics/Bitmap;Landroid/widget/ImageView$ScaleType;Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;Lg3/x;Landroid/app/Activity;)V
    .registers 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt7/i;->q:Landroid/graphics/Bitmap;

    iput-object p2, p0, Lt7/i;->r:Landroid/widget/ImageView$ScaleType;

    iput-object p3, p0, Lt7/i;->s:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;

    iput-object p4, p0, Lt7/i;->t:Lg3/x;

    iput-object p5, p0, Lt7/i;->u:Landroid/app/Activity;

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 8

    iget-object v0, p0, Lt7/i;->q:Landroid/graphics/Bitmap;

    iget-object v1, p0, Lt7/i;->r:Landroid/widget/ImageView$ScaleType;

    iget-object v2, p0, Lt7/i;->s:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;

    iget-object v3, p0, Lt7/i;->t:Lg3/x;

    iget-object v4, p0, Lt7/i;->u:Landroid/app/Activity;

    move-object v5, p1

    check-cast v5, Landroid/widget/ImageView;

    invoke-static/range {v0 .. v5}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->e(Landroid/graphics/Bitmap;Landroid/widget/ImageView$ScaleType;Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;Lg3/x;Landroid/app/Activity;Landroid/widget/ImageView;)Lh8/A;

    move-result-object p0

    return-object p0
.end method
