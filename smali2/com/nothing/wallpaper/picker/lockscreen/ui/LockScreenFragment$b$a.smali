.class final Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$b$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field private synthetic r:Ljava/lang/Object;

.field final synthetic s:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;


# direct methods
.method constructor <init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Lm8/e;)V
    .registers 3

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$b$a;->s:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 4

    new-instance v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$b$a;

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$b$a;->s:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-direct {v0, p0, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$b$a;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Lm8/e;)V

    iput-object p1, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$b$a;->r:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$b$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$b$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$b$a;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 9

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    iget v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$b$a;->q:I

    if-nez v0, :cond_49

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$b$a;->r:Ljava/lang/Object;

    move-object v0, p1

    check-cast v0, LF8/L;

    new-instance v3, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$b$a$a;

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$b$a;->s:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    const/4 v6, 0x0

    invoke-direct {v3, p1, v6}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$b$a$a;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Lm8/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    new-instance v3, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$b$a$b;

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$b$a;->s:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-direct {v3, p1, v6}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$b$a$b;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Lm8/e;)V

    invoke-static/range {v0 .. v5}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    new-instance v3, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$b$a$c;

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$b$a;->s:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-direct {v3, p1, v6}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$b$a$c;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Lm8/e;)V

    invoke-static/range {v0 .. v5}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    new-instance v3, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$b$a$d;

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$b$a;->s:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-direct {v3, p1, v6}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$b$a$d;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Lm8/e;)V

    invoke-static/range {v0 .. v5}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    new-instance v3, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$b$a$e;

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$b$a;->s:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-direct {v3, p0, v6}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$b$a$e;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Lm8/e;)V

    invoke-static/range {v0 .. v5}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_49
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
