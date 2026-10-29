.class final LA6/c$e;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LA6/c;->I0(Ljava/util/Map;Z)Ljava/util/Map;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:LA6/c;

.field final synthetic s:Ljava/lang/String;

.field final synthetic t:Lh8/u;

.field final synthetic u:J


# direct methods
.method constructor <init>(LA6/c;Ljava/lang/String;Lh8/u;JLm8/e;)V
    .registers 7

    iput-object p1, p0, LA6/c$e;->r:LA6/c;

    iput-object p2, p0, LA6/c$e;->s:Ljava/lang/String;

    iput-object p3, p0, LA6/c$e;->t:Lh8/u;

    iput-wide p4, p0, LA6/c$e;->u:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 10

    new-instance v0, LA6/c$e;

    iget-object v1, p0, LA6/c$e;->r:LA6/c;

    iget-object v2, p0, LA6/c$e;->s:Ljava/lang/String;

    iget-object v3, p0, LA6/c$e;->t:Lh8/u;

    iget-wide v4, p0, LA6/c$e;->u:J

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, LA6/c$e;-><init>(LA6/c;Ljava/lang/String;Lh8/u;JLm8/e;)V

    return-object v0
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, LA6/c$e;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LA6/c$e;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LA6/c$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LA6/c$e;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 7

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    iget v0, p0, LA6/c$e;->q:I

    if-nez v0, :cond_a3

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LA6/c$e;->r:LA6/c;

    invoke-static {p1}, LA6/c;->g(LA6/c;)Lq6/b;

    move-result-object p1

    iget-object v0, p0, LA6/c$e;->s:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "start save bitmap "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "."

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lq6/b;->a(Ljava/lang/String;)V

    iget-object p1, p0, LA6/c$e;->r:LA6/c;

    iget-object v0, p0, LA6/c$e;->t:Lh8/u;

    invoke-virtual {v0}, Lh8/u;->f()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LC6/i;

    iget-object v1, p0, LA6/c$e;->t:Lh8/u;

    invoke-virtual {v1}, Lh8/u;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/io/File;

    invoke-static {p1, v0, v1}, LA6/c;->u(LA6/c;LC6/i;Ljava/io/File;)V

    iget-object p1, p0, LA6/c$e;->r:LA6/c;

    invoke-static {p1}, LA6/c;->g(LA6/c;)Lq6/b;

    move-result-object p1

    iget-object v0, p0, LA6/c$e;->s:Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iget-wide v3, p0, LA6/c$e;->u:J

    sub-long/2addr v1, v3

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "end save bitmap "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", consume "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, "."

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lq6/b;->a(Ljava/lang/String;)V

    iget-object p1, p0, LA6/c$e;->r:LA6/c;

    iget-object p0, p0, LA6/c$e;->s:Ljava/lang/String;

    monitor-enter p1

    :try_start_75
    invoke-static {p1}, LA6/c;->j(LA6/c;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, LA6/c;->g(LA6/c;)Lq6/b;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "save bitmap "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " job finished, notifyAll."

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lq6/b;->a(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V
    :try_end_9c
    .catchall {:try_start_75 .. :try_end_9c} :catchall_a0

    monitor-exit p1

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :catchall_a0
    move-exception p0

    monitor-exit p1

    throw p0

    :cond_a3
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
