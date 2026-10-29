.class public final LW6/e$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LW6/e;->s(Landroid/view/View;Landroid/view/View;Lcom/airbnb/lottie/LottieAnimationView;Lcom/airbnb/lottie/LottieAnimationView;Landroid/view/View;IZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LW6/e;

.field final synthetic b:Landroid/view/View;

.field final synthetic c:Landroid/view/animation/Animation;

.field final synthetic d:Z

.field final synthetic e:Lcom/airbnb/lottie/LottieAnimationView;

.field final synthetic f:Lcom/airbnb/lottie/LottieAnimationView;

.field final synthetic g:Landroid/view/View;

.field final synthetic h:Landroid/view/View;

.field final synthetic i:I


# direct methods
.method constructor <init>(LW6/e;Landroid/view/View;Landroid/view/animation/Animation;ZLcom/airbnb/lottie/LottieAnimationView;Lcom/airbnb/lottie/LottieAnimationView;Landroid/view/View;Landroid/view/View;I)V
    .registers 10

    iput-object p1, p0, LW6/e$d;->a:LW6/e;

    iput-object p2, p0, LW6/e$d;->b:Landroid/view/View;

    iput-object p3, p0, LW6/e$d;->c:Landroid/view/animation/Animation;

    iput-boolean p4, p0, LW6/e$d;->d:Z

    iput-object p5, p0, LW6/e$d;->e:Lcom/airbnb/lottie/LottieAnimationView;

    iput-object p6, p0, LW6/e$d;->f:Lcom/airbnb/lottie/LottieAnimationView;

    iput-object p7, p0, LW6/e$d;->g:Landroid/view/View;

    iput-object p8, p0, LW6/e$d;->h:Landroid/view/View;

    iput p9, p0, LW6/e$d;->i:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .registers 5

    iget-object p1, p0, LW6/e$d;->a:LW6/e;

    invoke-static {p1}, LW6/e;->e(LW6/e;)Ljava/util/HashMap;

    move-result-object p1

    iget-object v0, p0, LW6/e$d;->b:Landroid/view/View;

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean p1, p0, LW6/e$d;->d:Z

    if-eqz p1, :cond_39

    iget-object p1, p0, LW6/e$d;->a:LW6/e;

    invoke-virtual {p1}, LW6/e;->r()Lv8/a;

    move-result-object p1

    if-eqz p1, :cond_39

    invoke-interface {p1}, Lv8/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_39

    iget-object p1, p0, LW6/e$d;->a:LW6/e;

    iget-object v1, p0, LW6/e$d;->e:Lcom/airbnb/lottie/LottieAnimationView;

    iget-object v2, p0, LW6/e$d;->f:Lcom/airbnb/lottie/LottieAnimationView;

    invoke-virtual {p1, v1, v2, v0}, LW6/e;->D(Lcom/airbnb/lottie/LottieAnimationView;Lcom/airbnb/lottie/LottieAnimationView;Z)V

    iget-object p1, p0, LW6/e$d;->a:LW6/e;

    iget-object v0, p0, LW6/e$d;->g:Landroid/view/View;

    iget-object v1, p0, LW6/e$d;->h:Landroid/view/View;

    iget p0, p0, LW6/e$d;->i:I

    int-to-float p0, p0

    invoke-static {p1, v0, v1, p0}, LW6/e;->h(LW6/e;Landroid/view/View;Landroid/view/View;F)V

    :cond_39
    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .registers 2

    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .registers 3

    iget-object p1, p0, LW6/e$d;->a:LW6/e;

    invoke-static {p1}, LW6/e;->e(LW6/e;)Ljava/util/HashMap;

    move-result-object p1

    iget-object v0, p0, LW6/e$d;->b:Landroid/view/View;

    iget-object p0, p0, LW6/e$d;->c:Landroid/view/animation/Animation;

    invoke-interface {p1, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
