.class public final LW6/e$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LW6/e;->p(Landroid/view/View;Lv8/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LW6/e;

.field final synthetic b:Landroid/view/View;

.field final synthetic c:Landroid/view/animation/AlphaAnimation;

.field final synthetic d:Landroid/view/animation/AlphaAnimation;

.field final synthetic e:Lv8/a;


# direct methods
.method constructor <init>(LW6/e;Landroid/view/View;Landroid/view/animation/AlphaAnimation;Landroid/view/animation/AlphaAnimation;Lv8/a;)V
    .registers 6

    iput-object p1, p0, LW6/e$c;->a:LW6/e;

    iput-object p2, p0, LW6/e$c;->b:Landroid/view/View;

    iput-object p3, p0, LW6/e$c;->c:Landroid/view/animation/AlphaAnimation;

    iput-object p4, p0, LW6/e$c;->d:Landroid/view/animation/AlphaAnimation;

    iput-object p5, p0, LW6/e$c;->e:Lv8/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .registers 6

    iget-object p1, p0, LW6/e$c;->d:Landroid/view/animation/AlphaAnimation;

    invoke-virtual {p1}, Landroid/view/animation/Animation;->getStartTime()J

    move-result-wide v0

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long p1, v0, v2

    if-eqz p1, :cond_19

    iget-object p1, p0, LW6/e$c;->b:Landroid/view/View;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, LW6/e$c;->e:Lv8/a;

    if-eqz p1, :cond_19

    invoke-interface {p1}, Lv8/a;->invoke()Ljava/lang/Object;

    :cond_19
    iget-object p1, p0, LW6/e$c;->a:LW6/e;

    invoke-static {p1}, LW6/e;->g(LW6/e;)Ljava/util/HashMap;

    move-result-object p1

    iget-object p0, p0, LW6/e$c;->b:Landroid/view/View;

    invoke-virtual {p1, p0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .registers 2

    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .registers 5

    iget-object p1, p0, LW6/e$c;->a:LW6/e;

    invoke-static {p1}, LW6/e;->g(LW6/e;)Ljava/util/HashMap;

    move-result-object p1

    iget-object v0, p0, LW6/e$c;->b:Landroid/view/View;

    new-instance v1, LW6/e$b;

    const/4 v2, 0x0

    iget-object p0, p0, LW6/e$c;->c:Landroid/view/animation/AlphaAnimation;

    invoke-direct {v1, v2, p0}, LW6/e$b;-><init>(ZLandroid/view/animation/Animation;)V

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
