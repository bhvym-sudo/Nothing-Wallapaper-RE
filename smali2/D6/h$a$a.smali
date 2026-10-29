.class final LD6/h$a$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD6/h$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:Ljava/lang/Object;

.field r:I

.field synthetic s:Ljava/lang/Object;

.field final synthetic t:J

.field final synthetic u:LD6/h;


# direct methods
.method constructor <init>(JLD6/h;Lm8/e;)V
    .registers 5

    iput-wide p1, p0, LD6/h$a$a;->t:J

    iput-object p3, p0, LD6/h$a$a;->u:LD6/h;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 6

    new-instance v0, LD6/h$a$a;

    iget-wide v1, p0, LD6/h$a$a;->t:J

    iget-object p0, p0, LD6/h$a$a;->u:LD6/h;

    invoke-direct {v0, v1, v2, p0, p2}, LD6/h$a$a;-><init>(JLD6/h;Lm8/e;)V

    iput-object p1, v0, LD6/h$a$a;->s:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LD6/h$a$a;->s(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 11

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LD6/h$a$a;->r:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_2e

    if-eq v1, v4, :cond_28

    if-eq v1, v3, :cond_1e

    if-ne v1, v2, :cond_16

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto/16 :goto_a6

    :cond_16
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1e
    iget-object v1, p0, LD6/h$a$a;->q:Ljava/lang/Object;

    iget-object v3, p0, LD6/h$a$a;->s:Ljava/lang/Object;

    check-cast v3, LI8/z;

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_93

    :cond_28
    iget-object v1, p0, LD6/h$a$a;->s:Ljava/lang/Object;

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_41

    :cond_2e
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LD6/h$a$a;->s:Ljava/lang/Object;

    iget-wide v5, p0, LD6/h$a$a;->t:J

    iput-object p1, p0, LD6/h$a$a;->s:Ljava/lang/Object;

    iput v4, p0, LD6/h$a$a;->r:I

    invoke-static {v5, v6, p0}, LF8/W;->b(JLm8/e;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_40

    goto :goto_a5

    :cond_40
    move-object v1, p1

    :goto_41
    iget-object p1, p0, LD6/h$a$a;->u:LD6/h;

    invoke-static {p1}, LD6/h;->c(LD6/h;)Lq6/b;

    move-result-object p1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iget-object v6, p0, LD6/h$a$a;->u:LD6/h;

    invoke-static {v6}, LD6/h;->b(LD6/h;)J

    move-result-wide v6

    sub-long/2addr v4, v6

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "start do action "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v7, ", last RunTime gap "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v4}, Lq6/b;->a(Ljava/lang/String;)V

    iget-object p1, p0, LD6/h$a$a;->u:LD6/h;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-static {p1, v4, v5}, LD6/h;->d(LD6/h;J)V

    iget-object p1, p0, LD6/h$a$a;->u:LD6/h;

    invoke-virtual {p1}, LD6/h;->g()LI8/z;

    move-result-object p1

    iget-object v4, p0, LD6/h$a$a;->u:LD6/h;

    invoke-virtual {v4}, LD6/h;->f()Lv8/p;

    move-result-object v4

    iput-object p1, p0, LD6/h$a$a;->s:Ljava/lang/Object;

    iput-object v1, p0, LD6/h$a$a;->q:Ljava/lang/Object;

    iput v3, p0, LD6/h$a$a;->r:I

    invoke-interface {v4, v1, p0}, Lv8/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_90

    goto :goto_a5

    :cond_90
    move-object v8, v3

    move-object v3, p1

    move-object p1, v8

    :goto_93
    new-instance v4, LD6/h$c;

    invoke-direct {v4, v1, p1}, LD6/h$c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x0

    iput-object p1, p0, LD6/h$a$a;->s:Ljava/lang/Object;

    iput-object p1, p0, LD6/h$a$a;->q:Ljava/lang/Object;

    iput v2, p0, LD6/h$a$a;->r:I

    invoke-interface {v3, v4, p0}, LI8/z;->b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_a6

    :goto_a5
    return-object v0

    :cond_a6
    :goto_a6
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public final s(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
    .registers 3

    invoke-virtual {p0, p1, p2}, LD6/h$a$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LD6/h$a$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LD6/h$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
