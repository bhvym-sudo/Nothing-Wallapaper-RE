.class public final Lcom/nothing/wallpaper/widget/MoreGuideView$c;
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

.field final synthetic b:Landroid/animation/ObjectAnimator;

.field final synthetic c:Landroid/animation/ObjectAnimator;

.field final synthetic d:Landroid/animation/ObjectAnimator;


# direct methods
.method constructor <init>(Lcom/nothing/wallpaper/widget/MoreGuideView;Landroid/animation/ObjectAnimator;Landroid/animation/ObjectAnimator;Landroid/animation/ObjectAnimator;)V
    .registers 5

    iput-object p1, p0, Lcom/nothing/wallpaper/widget/MoreGuideView$c;->a:Lcom/nothing/wallpaper/widget/MoreGuideView;

    iput-object p2, p0, Lcom/nothing/wallpaper/widget/MoreGuideView$c;->b:Landroid/animation/ObjectAnimator;

    iput-object p3, p0, Lcom/nothing/wallpaper/widget/MoreGuideView$c;->c:Landroid/animation/ObjectAnimator;

    iput-object p4, p0, Lcom/nothing/wallpaper/widget/MoreGuideView$c;->d:Landroid/animation/ObjectAnimator;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .registers 3

    const-string v0, "animation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/nothing/wallpaper/widget/MoreGuideView$c;->b:Landroid/animation/ObjectAnimator;

    invoke-virtual {p1}, Landroid/animation/ObjectAnimator;->start()V

    iget-object p1, p0, Lcom/nothing/wallpaper/widget/MoreGuideView$c;->a:Lcom/nothing/wallpaper/widget/MoreGuideView;

    invoke-static {p1}, Lcom/nothing/wallpaper/widget/MoreGuideView;->f(Lcom/nothing/wallpaper/widget/MoreGuideView;)Landroid/widget/TextView;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lcom/nothing/wallpaper/widget/MoreGuideView$c;->a:Lcom/nothing/wallpaper/widget/MoreGuideView;

    invoke-static {p1}, Lcom/nothing/wallpaper/widget/MoreGuideView;->c(Lcom/nothing/wallpaper/widget/MoreGuideView;)Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lcom/nothing/wallpaper/widget/MoreGuideView$c;->b:Landroid/animation/ObjectAnimator;

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/nothing/wallpaper/widget/MoreGuideView$c;->a:Lcom/nothing/wallpaper/widget/MoreGuideView;

    invoke-static {p1}, Lcom/nothing/wallpaper/widget/MoreGuideView;->e(Lcom/nothing/wallpaper/widget/MoreGuideView;)Landroid/widget/ImageView;

    move-result-object p1

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object p1, p0, Lcom/nothing/wallpaper/widget/MoreGuideView$c;->a:Lcom/nothing/wallpaper/widget/MoreGuideView;

    invoke-static {p1}, Lcom/nothing/wallpaper/widget/MoreGuideView;->c(Lcom/nothing/wallpaper/widget/MoreGuideView;)Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lcom/nothing/wallpaper/widget/MoreGuideView$c;->c:Landroid/animation/ObjectAnimator;

    invoke-interface {p1, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/nothing/wallpaper/widget/MoreGuideView$c;->a:Lcom/nothing/wallpaper/widget/MoreGuideView;

    invoke-static {p1}, Lcom/nothing/wallpaper/widget/MoreGuideView;->c(Lcom/nothing/wallpaper/widget/MoreGuideView;)Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lcom/nothing/wallpaper/widget/MoreGuideView$c;->d:Landroid/animation/ObjectAnimator;

    invoke-interface {p1, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/nothing/wallpaper/widget/MoreGuideView$c;->d:Landroid/animation/ObjectAnimator;

    invoke-virtual {p1}, Landroid/animation/Animator;->removeAllListeners()V

    iget-object p0, p0, Lcom/nothing/wallpaper/widget/MoreGuideView$c;->d:Landroid/animation/ObjectAnimator;

    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->removeAllUpdateListeners()V

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .registers 3

    const-string v0, "animation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/nothing/wallpaper/widget/MoreGuideView$c;->a:Lcom/nothing/wallpaper/widget/MoreGuideView;

    invoke-static {p1}, Lcom/nothing/wallpaper/widget/MoreGuideView;->d(Lcom/nothing/wallpaper/widget/MoreGuideView;)Landroid/widget/ImageView;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object p0, p0, Lcom/nothing/wallpaper/widget/MoreGuideView$c;->a:Lcom/nothing/wallpaper/widget/MoreGuideView;

    invoke-static {p0}, Lcom/nothing/wallpaper/widget/MoreGuideView;->e(Lcom/nothing/wallpaper/widget/MoreGuideView;)Landroid/widget/ImageView;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void
.end method
