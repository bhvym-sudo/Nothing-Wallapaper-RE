.class public final synthetic Lt7/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;

.field public final synthetic b:Z


# direct methods
.method public synthetic constructor <init>(Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;Z)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt7/d;->a:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;

    iput-boolean p2, p0, Lt7/d;->b:Z

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .registers 3

    iget-object v0, p0, Lt7/d;->a:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;

    iget-boolean p0, p0, Lt7/d;->b:Z

    invoke-static {v0, p0, p1}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->g(Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;ZLandroid/animation/ValueAnimator;)V

    return-void
.end method
