.class final Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$d;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->i(LN1/a;LA7/a;Lv8/l;Lv8/a;Lv8/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;

.field final synthetic s:Lv8/a;


# direct methods
.method constructor <init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;Lv8/a;Lm8/e;)V
    .registers 4

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$d;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;

    iput-object p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$d;->s:Lv8/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 4

    new-instance p1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$d;

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$d;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$d;->s:Lv8/a;

    invoke-direct {p1, v0, p0, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$d;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;Lv8/a;Lm8/e;)V

    return-object p1
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$d;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$d;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$d;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 9

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$d;->q:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_1e

    if-eq v1, v3, :cond_1a

    if-ne v1, v2, :cond_12

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_4e

    :cond_12
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1a
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_32

    :cond_1e
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$d;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;

    invoke-static {p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->A(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;)LF8/T;

    move-result-object p1

    if-eqz p1, :cond_51

    iput v3, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$d;->q:I

    invoke-interface {p1, p0}, LF8/T;->P0(Lm8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_32

    goto :goto_4d

    :cond_32
    :goto_32
    check-cast p1, Landroid/view/View;

    if-nez p1, :cond_37

    goto :goto_51

    :cond_37
    invoke-static {}, LF8/b0;->c()LF8/H0;

    move-result-object v1

    new-instance v3, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$d$a;

    iget-object v4, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$d;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;

    iget-object v5, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$d;->s:Lv8/a;

    const/4 v6, 0x0

    invoke-direct {v3, v4, p1, v5, v6}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$d$a;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;Landroid/view/View;Lv8/a;Lm8/e;)V

    iput v2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$d;->q:I

    invoke-static {v1, v3, p0}, LF8/g;->g(Lm8/i;Lv8/p;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_4e

    :goto_4d
    return-object v0

    :cond_4e
    :goto_4e
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_51
    :goto_51
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
