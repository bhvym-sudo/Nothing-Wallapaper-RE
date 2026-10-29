.class final LD6/c$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD6/c;-><init>(Landroid/content/Context;Lg3/x;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:LD6/c;


# direct methods
.method constructor <init>(LD6/c;Lm8/e;)V
    .registers 3

    iput-object p1, p0, LD6/c$a;->r:LD6/c;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 3

    new-instance p1, LD6/c$a;

    iget-object p0, p0, LD6/c$a;->r:LD6/c;

    invoke-direct {p1, p0, p2}, LD6/c$a;-><init>(LD6/c;Lm8/e;)V

    return-object p1
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, LD6/c$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LD6/c$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LD6/c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LD6/c$a;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 7

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    iget v0, p0, LD6/c$a;->q:I

    if-nez v0, :cond_81

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    const-wide/16 v0, 0xa

    :try_start_c
    iget-object p1, p0, LD6/c$a;->r:LD6/c;

    invoke-static {p1}, LD6/c;->a(LD6/c;)Ljava/util/concurrent/Future;

    move-result-object p1

    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {p1, v0, v1, v2}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg3/x$a;

    invoke-virtual {p1}, Lg3/x$a;->b()Landroid/app/WallpaperColors;

    move-result-object p1

    iget-object v2, p0, LD6/c$a;->r:LD6/c;

    invoke-static {v2}, LD6/c;->f(LD6/c;)LI8/A;

    move-result-object v3

    invoke-interface {v3, p1}, LI8/A;->setValue(Ljava/lang/Object;)V

    invoke-static {v2}, LD6/c;->b(LD6/c;)Lq6/b;

    move-result-object v2

    invoke-static {p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-static {p1}, LG6/h;->d(Landroid/app/WallpaperColors;)Z

    move-result p1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Get init colors after future done. isEmpty="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Lq6/b;->a(Ljava/lang/String;)V
    :try_end_46
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_c .. :try_end_46} :catch_5f
    .catch Ljava/lang/InterruptedException; {:try_start_c .. :try_end_46} :catch_53
    .catch Ljava/util/concurrent/CancellationException; {:try_start_c .. :try_end_46} :catch_47

    goto :goto_7e

    :catch_47
    iget-object p0, p0, LD6/c$a;->r:LD6/c;

    invoke-static {p0}, LD6/c;->b(LD6/c;)Lq6/b;

    move-result-object p0

    const-string p1, "Get init colors failure cause future was cancellation."

    invoke-virtual {p0, p1}, Lq6/b;->e(Ljava/lang/String;)V

    goto :goto_7e

    :catch_53
    iget-object p0, p0, LD6/c$a;->r:LD6/c;

    invoke-static {p0}, LD6/c;->b(LD6/c;)Lq6/b;

    move-result-object p0

    const-string p1, "Get init colors failure cause future was interrupted."

    invoke-virtual {p0, p1}, Lq6/b;->e(Ljava/lang/String;)V

    goto :goto_7e

    :catch_5f
    iget-object p0, p0, LD6/c$a;->r:LD6/c;

    invoke-static {p0}, LD6/c;->b(LD6/c;)Lq6/b;

    move-result-object p0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Get init colors failure cause timeout after "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, " s."

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lq6/b;->e(Ljava/lang/String;)V

    :goto_7e
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_81
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
