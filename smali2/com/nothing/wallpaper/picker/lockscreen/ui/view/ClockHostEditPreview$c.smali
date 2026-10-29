.class final Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->e(LA7/a;LN1/a;Lv8/l;Lv8/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;

.field final synthetic s:LN1/a;

.field final synthetic t:LA7/a;

.field final synthetic u:Landroid/view/View;

.field final synthetic v:Lv8/a;


# direct methods
.method constructor <init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;LN1/a;LA7/a;Landroid/view/View;Lv8/a;Lm8/e;)V
    .registers 7

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;

    iput-object p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c;->s:LN1/a;

    iput-object p3, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c;->t:LA7/a;

    iput-object p4, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c;->u:Landroid/view/View;

    iput-object p5, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c;->v:Lv8/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 10

    new-instance v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c;

    iget-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;

    iget-object v2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c;->s:LN1/a;

    iget-object v3, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c;->t:LA7/a;

    iget-object v4, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c;->u:Landroid/view/View;

    iget-object v5, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c;->v:Lv8/a;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;LN1/a;LA7/a;Landroid/view/View;Lv8/a;Lm8/e;)V

    return-object v0
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 16

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c;->q:I

    const/4 v2, 0x1

    if-eqz v1, :cond_17

    if-ne v1, v2, :cond_f

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_71

    :cond_f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_17
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;

    invoke-static {p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->D(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;)LO1/b;

    move-result-object p1

    if-eqz p1, :cond_74

    invoke-virtual {p1}, LO1/b;->e()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_29

    goto :goto_74

    :cond_29
    iget-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;

    iget-object v3, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c;->s:LN1/a;

    iget-object v4, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c;->t:LA7/a;

    invoke-static {v1, p1, v3, v4}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->x(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;Ljava/lang/String;LN1/a;LA7/a;)Landroid/view/View;

    move-result-object v11

    if-nez v11, :cond_38

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_38
    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c;->u:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p1

    iget-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c;->u:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    const/4 v3, 0x0

    invoke-virtual {v11, v3, v3, p1, v1}, Landroid/view/View;->layout(IIII)V

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;

    iget-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c;->u:Landroid/view/View;

    invoke-static {p1, v1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->C(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;Landroid/view/View;)F

    move-result v8

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;

    invoke-static {p1, v11}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->C(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;Landroid/view/View;)F

    move-result v7

    invoke-static {}, LF8/b0;->c()LF8/H0;

    move-result-object p1

    new-instance v5, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c$a;

    iget-object v6, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;

    iget-object v9, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c;->u:Landroid/view/View;

    iget-object v10, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c;->t:LA7/a;

    iget-object v12, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c;->v:Lv8/a;

    const/4 v13, 0x0

    invoke-direct/range {v5 .. v13}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c$a;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;FFLandroid/view/View;LA7/a;Landroid/view/View;Lv8/a;Lm8/e;)V

    iput v2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c;->q:I

    invoke-static {p1, v5, p0}, LF8/g;->g(Lm8/i;Lv8/p;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_71

    return-object v0

    :cond_71
    :goto_71
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_74
    :goto_74
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
