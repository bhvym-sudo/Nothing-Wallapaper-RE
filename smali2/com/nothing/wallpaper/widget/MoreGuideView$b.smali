.class public final Lcom/nothing/wallpaper/widget/MoreGuideView$b;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nothing/wallpaper/widget/MoreGuideView;->m()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/nothing/wallpaper/widget/MoreGuideView;

.field final synthetic b:Landroid/animation/ValueAnimator;

.field final synthetic c:Landroid/animation/ObjectAnimator;


# direct methods
.method constructor <init>(Lcom/nothing/wallpaper/widget/MoreGuideView;Landroid/animation/ValueAnimator;Landroid/animation/ObjectAnimator;)V
    .registers 4

    iput-object p1, p0, Lcom/nothing/wallpaper/widget/MoreGuideView$b;->a:Lcom/nothing/wallpaper/widget/MoreGuideView;

    iput-object p2, p0, Lcom/nothing/wallpaper/widget/MoreGuideView$b;->b:Landroid/animation/ValueAnimator;

    iput-object p3, p0, Lcom/nothing/wallpaper/widget/MoreGuideView$b;->c:Landroid/animation/ObjectAnimator;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .registers 3

    const-string v0, "animation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/nothing/wallpaper/widget/MoreGuideView$b;->a:Lcom/nothing/wallpaper/widget/MoreGuideView;

    invoke-static {p1}, Lcom/nothing/wallpaper/widget/MoreGuideView;->h(Lcom/nothing/wallpaper/widget/MoreGuideView;)V

    iget-object p1, p0, Lcom/nothing/wallpaper/widget/MoreGuideView$b;->b:Landroid/animation/ValueAnimator;

    invoke-virtual {p1}, Landroid/animation/Animator;->removeAllListeners()V

    iget-object p1, p0, Lcom/nothing/wallpaper/widget/MoreGuideView$b;->a:Lcom/nothing/wallpaper/widget/MoreGuideView;

    invoke-static {p1}, Lcom/nothing/wallpaper/widget/MoreGuideView;->c(Lcom/nothing/wallpaper/widget/MoreGuideView;)Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lcom/nothing/wallpaper/widget/MoreGuideView$b;->b:Landroid/animation/ValueAnimator;

    invoke-interface {p1, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/nothing/wallpaper/widget/MoreGuideView$b;->a:Lcom/nothing/wallpaper/widget/MoreGuideView;

    invoke-static {p1}, Lcom/nothing/wallpaper/widget/MoreGuideView;->c(Lcom/nothing/wallpaper/widget/MoreGuideView;)Ljava/util/List;

    move-result-object p1

    iget-object p0, p0, Lcom/nothing/wallpaper/widget/MoreGuideView$b;->c:Landroid/animation/ObjectAnimator;

    invoke-interface {p1, p0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method
