.class public final synthetic LT7/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Lcom/nothing/wallpaper/widget/MoreGuideView;


# direct methods
.method public synthetic constructor <init>(Lcom/nothing/wallpaper/widget/MoreGuideView;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LT7/c;->a:Lcom/nothing/wallpaper/widget/MoreGuideView;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .registers 2

    iget-object p0, p0, LT7/c;->a:Lcom/nothing/wallpaper/widget/MoreGuideView;

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/widget/MoreGuideView;->b(Lcom/nothing/wallpaper/widget/MoreGuideView;Landroid/animation/ValueAnimator;)V

    return-void
.end method
