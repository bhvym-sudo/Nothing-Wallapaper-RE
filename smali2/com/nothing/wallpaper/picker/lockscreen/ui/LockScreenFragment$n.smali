.class final Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$n;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->b(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;


# direct methods
.method constructor <init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Lm8/e;)V
    .registers 3

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$n;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 3

    new-instance p1, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$n;

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$n;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-direct {p1, p0, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$n;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Lm8/e;)V

    return-object p1
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$n;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$n;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$n;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$n;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 5

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$n;->q:I

    const/4 v2, 0x1

    if-eqz v1, :cond_17

    if-ne v1, v2, :cond_f

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_2d

    :cond_f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_17
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$n;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-virtual {p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->getLockScreenViewModel()LJ7/i;

    move-result-object p1

    invoke-virtual {p1}, LJ7/i;->V()LI8/f;

    move-result-object p1

    iput v2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$n;->q:I

    invoke-static {p1, p0}, LI8/h;->x(LI8/f;Lm8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2d

    return-object v0

    :cond_2d
    :goto_2d
    check-cast p1, LN1/a;

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$n;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->Y1(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)Le3/u;

    move-result-object p0

    if-nez p0, :cond_3d

    const-string p0, "binding"

    invoke-static {p0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 p0, 0x0

    :cond_3d
    iget-object p0, p0, Le3/u;->v:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/AccessibilityCellLayout;

    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/AccessibilityCellLayout;->d(LN1/a;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
