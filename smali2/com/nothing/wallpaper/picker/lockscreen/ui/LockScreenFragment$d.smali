.class final Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$d;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->J2(ZJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

.field final synthetic s:Z

.field final synthetic t:J


# direct methods
.method constructor <init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;ZJLm8/e;)V
    .registers 6

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$d;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    iput-boolean p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$d;->s:Z

    iput-wide p3, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$d;->t:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 9

    new-instance v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$d;

    iget-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$d;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    iget-boolean v2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$d;->s:Z

    iget-wide v3, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$d;->t:J

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$d;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;ZJLm8/e;)V

    return-object v0
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$d;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$d;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$d;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 5

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    iget v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$d;->q:I

    if-nez v0, :cond_2a

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$d;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-virtual {p1}, Landroidx/fragment/app/q;->getParentFragment()Landroidx/fragment/app/q;

    move-result-object p1

    instance-of p1, p1, Lg7/k;

    if-eqz p1, :cond_1e

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$d;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    iget-boolean v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$d;->s:Z

    iget-wide v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$d;->t:J

    invoke-virtual {p1, v0, v1, v2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->G3(ZJ)V

    goto :goto_27

    :cond_1e
    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$d;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireActivity()Landroidx/fragment/app/v;

    move-result-object p0

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :goto_27
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_2a
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
