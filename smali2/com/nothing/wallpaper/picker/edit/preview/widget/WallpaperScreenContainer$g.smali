.class final Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$g;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->L(Landroid/app/Activity;Lg3/x;Landroid/graphics/Bitmap;Landroid/widget/ImageView$ScaleType;Lm8/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:Ljava/lang/Object;

.field r:Ljava/lang/Object;

.field s:Ljava/lang/Object;

.field t:Ljava/lang/Object;

.field u:Ljava/lang/Object;

.field synthetic v:Ljava/lang/Object;

.field final synthetic w:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;

.field x:I


# direct methods
.method constructor <init>(Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;Lm8/e;)V
    .registers 3

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$g;->w:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Lm8/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 8

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$g;->v:Ljava/lang/Object;

    iget p1, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$g;->x:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$g;->x:I

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$g;->w:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v5, p0

    invoke-virtual/range {v0 .. v5}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->L(Landroid/app/Activity;Lg3/x;Landroid/graphics/Bitmap;Landroid/widget/ImageView$ScaleType;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
