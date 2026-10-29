.class final LE7/Z$e$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE7/Z$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:LE7/Z;


# direct methods
.method constructor <init>(LE7/Z;Lm8/e;)V
    .registers 3

    iput-object p1, p0, LE7/Z$e$a;->r:LE7/Z;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 3

    new-instance p1, LE7/Z$e$a;

    iget-object p0, p0, LE7/Z$e$a;->r:LE7/Z;

    invoke-direct {p1, p0, p2}, LE7/Z$e$a;-><init>(LE7/Z;Lm8/e;)V

    return-object p1
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, LE7/Z$e$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LE7/Z$e$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LE7/Z$e$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LE7/Z$e$a;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 7

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LE7/Z$e$a;->q:I

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

    iget-object p1, p0, LE7/Z$e$a;->r:LE7/Z;

    invoke-virtual {p1}, LE7/Z;->y()Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    move-result-object p1

    invoke-virtual {p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->getLockScreenViewModel()LJ7/i;

    move-result-object p1

    iput v2, p0, LE7/Z$e$a;->q:I

    invoke-virtual {p1, v2, p0}, LJ7/i;->k0(ZLm8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2d

    return-object v0

    :cond_2d
    :goto_2d
    check-cast p1, Lg3/x;

    if-eqz p1, :cond_9a

    iget-object p0, p0, LE7/Z$e$a;->r:LE7/Z;

    invoke-virtual {p0}, LE7/Z;->F()Lg3/x;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_66

    invoke-virtual {p0}, LE7/Z;->F()Lg3/x;

    move-result-object v0

    if-eqz v0, :cond_45

    invoke-virtual {v0}, Lg3/x;->k()LC6/g;

    move-result-object v0

    goto :goto_46

    :cond_45
    move-object v0, v1

    :goto_46
    if-eqz v0, :cond_66

    invoke-virtual {p0}, LE7/Z;->F()Lg3/x;

    move-result-object v0

    if-eqz v0, :cond_53

    invoke-virtual {v0}, Lg3/x;->k()LC6/g;

    move-result-object v0

    goto :goto_54

    :cond_53
    move-object v0, v1

    :goto_54
    invoke-virtual {p1}, Lg3/x;->k()LC6/g;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_66

    const-string p0, "WallpaperUIHelper"

    const-string p1, "getWallpaperInfo is same wallpaper, return"

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_9a

    :cond_66
    invoke-virtual {p0, p1}, LE7/Z;->Q(Lg3/x;)V

    invoke-static {p1}, LG6/e;->m(Lg3/x;)Z

    move-result v0

    const/4 v3, 0x0

    if-eqz v0, :cond_7f

    invoke-static {p0}, LE7/Z;->o(LE7/Z;)V

    invoke-virtual {p0}, LE7/Z;->y()Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    move-result-object p0

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->getLockScreenViewModel()LJ7/i;

    move-result-object p0

    invoke-virtual {p0, v3, v3}, LJ7/i;->R0(ZZ)V

    goto :goto_9a

    :cond_7f
    invoke-virtual {p1}, Lg3/x;->s()Z

    move-result v0

    if-eqz v0, :cond_88

    invoke-virtual {p1, v1}, Lg3/x;->v(LC6/g;)V

    :cond_88
    invoke-virtual {p0}, LE7/Z;->y()Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    move-result-object v0

    sget-object v4, Lp7/a$b;->b:Lp7/a$b;

    invoke-virtual {v0, p1, v4}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->Q3(Lg3/x;Lp7/a;)V

    invoke-static {p0}, LE7/Z;->q(LE7/Z;)V

    invoke-static {p0}, LE7/Z;->j(LE7/Z;)V

    invoke-static {p0, v3, v2, v1}, LE7/Z;->u(LE7/Z;ZILjava/lang/Object;)V

    :cond_9a
    :goto_9a
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
