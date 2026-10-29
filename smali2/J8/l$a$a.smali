.class final LJ8/l$a$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ8/l$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:[LI8/f;

.field final synthetic s:I

.field final synthetic t:Ljava/util/concurrent/atomic/AtomicInteger;

.field final synthetic u:LH8/g;


# direct methods
.method constructor <init>([LI8/f;ILjava/util/concurrent/atomic/AtomicInteger;LH8/g;Lm8/e;)V
    .registers 6

    iput-object p1, p0, LJ8/l$a$a;->r:[LI8/f;

    iput p2, p0, LJ8/l$a$a;->s:I

    iput-object p3, p0, LJ8/l$a$a;->t:Ljava/util/concurrent/atomic/AtomicInteger;

    iput-object p4, p0, LJ8/l$a$a;->u:LH8/g;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 9

    new-instance v0, LJ8/l$a$a;

    iget-object v1, p0, LJ8/l$a$a;->r:[LI8/f;

    iget v2, p0, LJ8/l$a$a;->s:I

    iget-object v3, p0, LJ8/l$a$a;->t:Ljava/util/concurrent/atomic/AtomicInteger;

    iget-object v4, p0, LJ8/l$a$a;->u:LH8/g;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, LJ8/l$a$a;-><init>([LI8/f;ILjava/util/concurrent/atomic/AtomicInteger;LH8/g;Lm8/e;)V

    return-object v0
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, LJ8/l$a$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LJ8/l$a$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LJ8/l$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LJ8/l$a$a;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 8

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LJ8/l$a$a;->q:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1a

    if-ne v1, v3, :cond_12

    :try_start_c
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V
    :try_end_f
    .catchall {:try_start_c .. :try_end_f} :catchall_10

    goto :goto_33

    :catchall_10
    move-exception p1

    goto :goto_43

    :cond_12
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1a
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    :try_start_1d
    iget-object p1, p0, LJ8/l$a$a;->r:[LI8/f;

    iget v1, p0, LJ8/l$a$a;->s:I

    aget-object p1, p1, v1

    new-instance v4, LJ8/l$a$a$a;

    iget-object v5, p0, LJ8/l$a$a;->u:LH8/g;

    invoke-direct {v4, v5, v1}, LJ8/l$a$a$a;-><init>(LH8/g;I)V

    iput v3, p0, LJ8/l$a$a;->q:I

    invoke-interface {p1, v4, p0}, LI8/f;->a(LI8/g;Lm8/e;)Ljava/lang/Object;

    move-result-object p1
    :try_end_30
    .catchall {:try_start_1d .. :try_end_30} :catchall_10

    if-ne p1, v0, :cond_33

    return-object v0

    :cond_33
    :goto_33
    iget-object p1, p0, LJ8/l$a$a;->t:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result p1

    if-nez p1, :cond_40

    iget-object p0, p0, LJ8/l$a$a;->u:LH8/g;

    invoke-static {p0, v2, v3, v2}, LH8/w$a;->a(LH8/w;Ljava/lang/Throwable;ILjava/lang/Object;)Z

    :cond_40
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :goto_43
    iget-object v0, p0, LJ8/l$a$a;->t:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v0

    if-nez v0, :cond_50

    iget-object p0, p0, LJ8/l$a$a;->u:LH8/g;

    invoke-static {p0, v2, v3, v2}, LH8/w$a;->a(LH8/w;Ljava/lang/Throwable;ILjava/lang/Object;)Z

    :cond_50
    throw p1
.end method
