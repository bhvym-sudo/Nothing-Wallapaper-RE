.class final Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$m;
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

.field final synthetic s:Z


# direct methods
.method constructor <init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;ZLm8/e;)V
    .registers 4

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$m;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    iput-boolean p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$m;->s:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method

.method public static synthetic s(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V
    .registers 1

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$m;->w(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V

    return-void
.end method

.method public static synthetic u(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Z)Lh8/A;
    .registers 2

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$m;->v(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Z)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method private static final v(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Z)Lh8/A;
    .registers 5

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->S2()Ljava/lang/Runnable;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_9
    if-eqz p1, :cond_13

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->getLockScreenViewModel()LJ7/i;

    move-result-object p0

    invoke-virtual {p0}, LJ7/i;->c1()V

    goto :goto_2c

    :cond_13
    const-string p1, "LockScreenFragment"

    const-string v0, "widgetExpand anim end"

    invoke-static {p1, v0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->l()Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;

    move-result-object p1

    invoke-interface {p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;->getView()Landroid/view/View;

    move-result-object p1

    new-instance v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/c;

    invoke-direct {v0, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/c;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V

    const-wide/16 v1, 0x64

    invoke-virtual {p1, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    :goto_2c
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private static final w(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V
    .registers 4

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->N2()LE7/Z;

    move-result-object p0

    if-eqz p0, :cond_c

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v1}, LE7/Z;->u(LE7/Z;ZILjava/lang/Object;)V

    :cond_c
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 4

    new-instance p1, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$m;

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$m;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    iget-boolean p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$m;->s:Z

    invoke-direct {p1, v0, p0, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$m;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;ZLm8/e;)V

    return-object p1
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$m;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$m;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$m;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$m;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 5

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$m;->q:I

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

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$m;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-virtual {p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->getLockScreenViewModel()LJ7/i;

    move-result-object p1

    invoke-virtual {p1}, LJ7/i;->V()LI8/f;

    move-result-object p1

    iput v2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$m;->q:I

    invoke-static {p1, p0}, LI8/h;->x(LI8/f;Lm8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2d

    return-object v0

    :cond_2d
    :goto_2d
    check-cast p1, LN1/a;

    sget-object v0, LN1/a;->r:LN1/a;

    if-ne p1, v0, :cond_34

    goto :goto_35

    :cond_34
    const/4 v2, 0x0

    :goto_35
    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$m;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-static {p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->d2(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)Ly7/C;

    move-result-object p1

    if-nez p1, :cond_43

    const-string p1, "widgetExpandAnimation"

    invoke-static {p1}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_43
    iget-boolean v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$m;->s:Z

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$m;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    new-instance v1, Lcom/nothing/wallpaper/picker/lockscreen/ui/b;

    invoke-direct {v1, p0, v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/b;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Z)V

    invoke-virtual {p1, v0, v2, v1}, Ly7/C;->u(ZZLv8/a;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
