.class final Lx6/d$c;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx6/d;->j(Lx6/d$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:Lx6/d;

.field final synthetic s:Ljava/lang/String;

.field final synthetic t:Lw6/d;

.field final synthetic u:Lx6/d$b;

.field final synthetic v:I

.field final synthetic w:J


# direct methods
.method constructor <init>(Lx6/d;Ljava/lang/String;Lw6/d;Lx6/d$b;IJLm8/e;)V
    .registers 9

    iput-object p1, p0, Lx6/d$c;->r:Lx6/d;

    iput-object p2, p0, Lx6/d$c;->s:Ljava/lang/String;

    iput-object p3, p0, Lx6/d$c;->t:Lw6/d;

    iput-object p4, p0, Lx6/d$c;->u:Lx6/d$b;

    iput p5, p0, Lx6/d$c;->v:I

    iput-wide p6, p0, Lx6/d$c;->w:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p8}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 12

    new-instance v0, Lx6/d$c;

    iget-object v1, p0, Lx6/d$c;->r:Lx6/d;

    iget-object v2, p0, Lx6/d$c;->s:Ljava/lang/String;

    iget-object v3, p0, Lx6/d$c;->t:Lw6/d;

    iget-object v4, p0, Lx6/d$c;->u:Lx6/d$b;

    iget v5, p0, Lx6/d$c;->v:I

    iget-wide v6, p0, Lx6/d$c;->w:J

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, Lx6/d$c;-><init>(Lx6/d;Ljava/lang/String;Lw6/d;Lx6/d$b;IJLm8/e;)V

    return-object v0
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, Lx6/d$c;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Lx6/d$c;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Lx6/d$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Lx6/d$c;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 11

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lx6/d$c;->q:I

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

    iget-object p1, p0, Lx6/d$c;->r:Lx6/d;

    iget-object v1, p0, Lx6/d$c;->s:Ljava/lang/String;

    iget-object v3, p0, Lx6/d$c;->t:Lw6/d;

    iput v2, p0, Lx6/d$c;->q:I

    invoke-virtual {p1, v1, v3, p0}, Lx6/d;->j0(Ljava/lang/String;Lw6/d;Lm8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_29

    return-object v0

    :cond_29
    :goto_29
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lx6/d$c;->r:Lx6/d;

    iget-object v1, p0, Lx6/d$c;->s:Ljava/lang/String;

    iget-object v2, p0, Lx6/d$c;->u:Lx6/d$b;

    iget v3, p0, Lx6/d$c;->v:I

    iget-object v4, p0, Lx6/d$c;->t:Lw6/d;

    iget-wide v5, p0, Lx6/d$c;->w:J

    monitor-enter v0

    :try_start_3c
    invoke-static {v0}, Lx6/d;->f(Lx6/d;)Ljava/util/Map;

    move-result-object p0

    invoke-interface {p0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2}, Lx6/d$b;->a()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_4d
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_64

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lv8/l;

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-interface {v2, v7}, Lv8/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4d

    :catchall_61
    move-exception p0

    goto/16 :goto_f9

    :cond_64
    if-nez p1, :cond_a0

    invoke-static {v0}, Lx6/d;->a(Lx6/d;)Lq6/b;

    move-result-object p0

    invoke-virtual {v4}, Lw6/d;->d()Lw6/c;

    move-result-object p1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    sub-long/2addr v7, v5

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "putAsync failed , currId = "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ", key"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", req"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", consume "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lq6/b;->e(Ljava/lang/String;)V

    goto :goto_dd

    :cond_a0
    invoke-static {v0}, Lx6/d;->a(Lx6/d;)Lq6/b;

    move-result-object p0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    sub-long/2addr v7, v5

    invoke-virtual {v4}, Lw6/d;->d()Lw6/c;

    move-result-object p1

    invoke-virtual {p1}, Lw6/c;->a()Ljava/lang/String;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "putAsync result is true, currId = "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ", consume "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v3, ", "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ":"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lq6/b;->a(Ljava/lang/String;)V

    :goto_dd
    invoke-static {v0}, Lx6/d;->b(Lx6/d;)Ljava/util/Map;

    move-result-object p0

    invoke-interface {p0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lx6/d$b;

    if-eqz p0, :cond_f5

    invoke-static {v0}, Lx6/d;->a(Lx6/d;)Lq6/b;

    move-result-object p1

    const-string v1, "continue putAsync for pending job."

    invoke-virtual {p1, v1}, Lq6/b;->a(Ljava/lang/String;)V

    invoke-static {v0, p0}, Lx6/d;->g(Lx6/d;Lx6/d$b;)V
    :try_end_f5
    .catchall {:try_start_3c .. :try_end_f5} :catchall_61

    :cond_f5
    monitor-exit v0

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :goto_f9
    monitor-exit v0

    throw p0
.end method
