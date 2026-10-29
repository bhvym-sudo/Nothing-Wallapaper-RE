.class public final synthetic LT7/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Landroid/animation/ValueAnimator;

.field public final synthetic b:Lcom/nothing/wallpaper/widget/MoreGuideView;


# direct methods
.method public synthetic constructor <init>(Landroid/animation/ValueAnimator;Lcom/nothing/wallpaper/widget/MoreGuideView;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LT7/d;->a:Landroid/animation/ValueAnimator;

    iput-object p2, p0, LT7/d;->b:Lcom/nothing/wallpaper/widget/MoreGuideView;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .registers 3

    iget-object v0, p0, LT7/d;->a:Landroid/animation/ValueAnimator;

    iget-object p0, p0, LT7/d;->b:Lcom/nothing/wallpaper/widget/MoreGuideView;

    invoke-static {v0, p0, p1}, Lcom/nothing/wallpaper/widget/MoreGuideView;->a(Landroid/animation/ValueAnimator;Lcom/nothing/wallpaper/widget/MoreGuideView;Landroid/animation/ValueAnimator;)V

    return-void
.end method
