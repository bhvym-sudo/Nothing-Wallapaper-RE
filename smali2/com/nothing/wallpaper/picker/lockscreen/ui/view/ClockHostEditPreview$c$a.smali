.class final Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;

.field final synthetic s:F

.field final synthetic t:F

.field final synthetic u:Landroid/view/View;

.field final synthetic v:LA7/a;

.field final synthetic w:Landroid/view/View;

.field final synthetic x:Lv8/a;


# direct methods
.method constructor <init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;FFLandroid/view/View;LA7/a;Landroid/view/View;Lv8/a;Lm8/e;)V
    .registers 9

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c$a;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;

    iput p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c$a;->s:F

    iput p3, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c$a;->t:F

    iput-object p4, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c$a;->u:Landroid/view/View;

    iput-object p5, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c$a;->v:LA7/a;

    iput-object p6, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c$a;->w:Landroid/view/View;

    iput-object p7, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c$a;->x:Lv8/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p8}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 12

    new-instance v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c$a;

    iget-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c$a;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;

    iget v2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c$a;->s:F

    iget v3, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c$a;->t:F

    iget-object v4, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c$a;->u:Landroid/view/View;

    iget-object v5, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c$a;->v:LA7/a;

    iget-object v6, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c$a;->w:Landroid/view/View;

    iget-object v7, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c$a;->x:Lv8/a;

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c$a;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;FFLandroid/view/View;LA7/a;Landroid/view/View;Lv8/a;Lm8/e;)V

    return-object v0
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c$a;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 11

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    iget v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c$a;->q:I

    if-nez v0, :cond_4a

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c$a;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;

    invoke-static {p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->y(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;)Ly7/e;

    move-result-object v0

    invoke-virtual {v0}, Ly7/e;->k()Landroid/animation/AnimatorSet;

    move-result-object v0

    iget v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c$a;->s:F

    iget v2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c$a;->t:F

    iget-object v3, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c$a;->u:Landroid/view/View;

    iget-object v4, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c$a;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;

    iget-object v5, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c$a;->v:LA7/a;

    iget-object v6, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c$a;->w:Landroid/view/View;

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c$a;->x:Lv8/a;

    sub-float/2addr v1, v2

    sget-object v2, Landroid/widget/FrameLayout;->TRANSLATION_X:Landroid/util/Property;

    const/4 v7, 0x1

    new-array v7, v7, [F

    const/4 v8, 0x0

    aput v1, v7, v8

    invoke-static {v3, v2, v7}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    invoke-static {v4, v5}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->G(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;LA7/a;)Landroid/animation/Animator;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    new-instance v1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c$a$a;

    invoke-direct {v1, v4, v6, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c$a$a;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;Landroid/view/View;Lv8/a;)V

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    invoke-static {p1, v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->E(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;Landroid/animation/AnimatorSet;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_4a
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
