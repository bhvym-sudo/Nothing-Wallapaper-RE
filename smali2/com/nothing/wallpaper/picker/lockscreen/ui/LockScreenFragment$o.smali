.class final Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$o;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->G3(ZJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:Z

.field final synthetic s:J

.field final synthetic t:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;


# direct methods
.method constructor <init>(ZJLcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Lm8/e;)V
    .registers 6

    iput-boolean p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$o;->r:Z

    iput-wide p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$o;->s:J

    iput-object p4, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$o;->t:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 9

    new-instance v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$o;

    iget-boolean v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$o;->r:Z

    iget-wide v2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$o;->s:J

    iget-object v4, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$o;->t:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$o;-><init>(ZJLcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Lm8/e;)V

    return-object v0
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$o;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$o;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$o;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 7

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$o;->q:I

    const/4 v2, 0x1

    if-eqz v1, :cond_17

    if-ne v1, v2, :cond_f

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_29

    :cond_f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_17
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-boolean p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$o;->r:Z

    if-eqz p1, :cond_29

    iget-wide v3, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$o;->s:J

    iput v2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$o;->q:I

    invoke-static {v3, v4, p0}, LF8/W;->b(JLm8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_29

    return-object v0

    :cond_29
    :goto_29
    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$o;->t:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->W1(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
