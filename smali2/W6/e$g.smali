.class public final LW6/e$g;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LW6/e;->x(Landroid/view/View;FFJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LW6/e;

.field final synthetic b:Landroid/view/View;

.field final synthetic c:Landroid/animation/ValueAnimator;


# direct methods
.method constructor <init>(LW6/e;Landroid/view/View;Landroid/animation/ValueAnimator;)V
    .registers 4

    iput-object p1, p0, LW6/e$g;->a:LW6/e;

    iput-object p2, p0, LW6/e$g;->b:Landroid/view/View;

    iput-object p3, p0, LW6/e$g;->c:Landroid/animation/ValueAnimator;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .registers 3

    const-string v0, "animation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationCancel(Landroid/animation/Animator;)V

    iget-object p1, p0, LW6/e$g;->a:LW6/e;

    invoke-static {p1}, LW6/e;->f(LW6/e;)Ljava/util/HashMap;

    move-result-object p1

    iget-object p0, p0, LW6/e$g;->b:Landroid/view/View;

    invoke-virtual {p1, p0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .registers 3

    const-string v0, "animation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    iget-object p1, p0, LW6/e$g;->a:LW6/e;

    invoke-static {p1}, LW6/e;->f(LW6/e;)Ljava/util/HashMap;

    move-result-object p1

    iget-object p0, p0, LW6/e$g;->b:Landroid/view/View;

    invoke-virtual {p1, p0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .registers 3

    const-string v0, "animation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LW6/e$g;->a:LW6/e;

    invoke-static {p1}, LW6/e;->f(LW6/e;)Ljava/util/HashMap;

    move-result-object p1

    iget-object v0, p0, LW6/e$g;->b:Landroid/view/View;

    iget-object p0, p0, LW6/e$g;->c:Landroid/animation/ValueAnimator;

    invoke-interface {p1, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
