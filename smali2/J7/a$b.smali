.class final LJ7/a$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ7/a;->g(LF8/L;LU5/a;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:Ljava/lang/Object;

.field r:Ljava/lang/Object;

.field s:Ljava/lang/Object;

.field t:I

.field u:I

.field final synthetic v:LJ7/a;

.field final synthetic w:LU5/a;

.field final synthetic x:I


# direct methods
.method constructor <init>(LJ7/a;LU5/a;ILm8/e;)V
    .registers 5

    iput-object p1, p0, LJ7/a$b;->v:LJ7/a;

    iput-object p2, p0, LJ7/a$b;->w:LU5/a;

    iput p3, p0, LJ7/a$b;->x:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 5

    new-instance p1, LJ7/a$b;

    iget-object v0, p0, LJ7/a$b;->v:LJ7/a;

    iget-object v1, p0, LJ7/a$b;->w:LU5/a;

    iget p0, p0, LJ7/a$b;->x:I

    invoke-direct {p1, v0, v1, p0, p2}, LJ7/a$b;-><init>(LJ7/a;LU5/a;ILm8/e;)V

    return-object p1
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, LJ7/a$b;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LJ7/a$b;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LJ7/a$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LJ7/a$b;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 11

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LJ7/a$b;->u:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v1, :cond_4e

    if-eq v1, v4, :cond_3b

    if-eq v1, v3, :cond_26

    if-ne v1, v2, :cond_1e

    iget-object p0, p0, LJ7/a$b;->q:Ljava/lang/Object;

    check-cast p0, LO8/a;

    :try_start_16
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V
    :try_end_19
    .catchall {:try_start_16 .. :try_end_19} :catchall_1b

    goto/16 :goto_93

    :catchall_1b
    move-exception p1

    goto/16 :goto_9f

    :cond_1e
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_26
    iget-object v1, p0, LJ7/a$b;->s:Ljava/lang/Object;

    check-cast v1, LJ7/a;

    iget-object v3, p0, LJ7/a$b;->r:Ljava/lang/Object;

    check-cast v3, LU5/a;

    iget-object v4, p0, LJ7/a$b;->q:Ljava/lang/Object;

    check-cast v4, LO8/a;

    :try_start_32
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V
    :try_end_35
    .catchall {:try_start_32 .. :try_end_35} :catchall_37

    move-object p1, v4

    goto :goto_83

    :catchall_37
    move-exception p1

    move-object p0, v4

    goto/16 :goto_9f

    :cond_3b
    iget v1, p0, LJ7/a$b;->t:I

    iget-object v4, p0, LJ7/a$b;->s:Ljava/lang/Object;

    check-cast v4, LJ7/a;

    iget-object v6, p0, LJ7/a$b;->r:Ljava/lang/Object;

    check-cast v6, LU5/a;

    iget-object v7, p0, LJ7/a$b;->q:Ljava/lang/Object;

    check-cast v7, LO8/a;

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    move-object p1, v7

    goto :goto_72

    :cond_4e
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LJ7/a$b;->v:LJ7/a;

    invoke-static {p1}, LJ7/a;->h(LJ7/a;)LO8/a;

    move-result-object p1

    iget-object v1, p0, LJ7/a$b;->w:LU5/a;

    iget v6, p0, LJ7/a$b;->x:I

    iget-object v7, p0, LJ7/a$b;->v:LJ7/a;

    iput-object p1, p0, LJ7/a$b;->q:Ljava/lang/Object;

    iput-object v1, p0, LJ7/a$b;->r:Ljava/lang/Object;

    iput-object v7, p0, LJ7/a$b;->s:Ljava/lang/Object;

    iput v6, p0, LJ7/a$b;->t:I

    iput v4, p0, LJ7/a$b;->u:I

    invoke-interface {p1, v5, p0}, LO8/a;->c(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v0, :cond_6e

    goto :goto_91

    :cond_6e
    move v4, v6

    move-object v6, v1

    move v1, v4

    move-object v4, v7

    :goto_72
    :try_start_72
    iput-object p1, p0, LJ7/a$b;->q:Ljava/lang/Object;

    iput-object v6, p0, LJ7/a$b;->r:Ljava/lang/Object;

    iput-object v4, p0, LJ7/a$b;->s:Ljava/lang/Object;

    iput v3, p0, LJ7/a$b;->u:I

    invoke-interface {v6, v1, p0}, LU5/a;->g(ILm8/e;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_81

    goto :goto_91

    :cond_81
    move-object v1, v4

    move-object v3, v6

    :goto_83
    iput-object p1, p0, LJ7/a$b;->q:Ljava/lang/Object;

    iput-object v5, p0, LJ7/a$b;->r:Ljava/lang/Object;

    iput-object v5, p0, LJ7/a$b;->s:Ljava/lang/Object;

    iput v2, p0, LJ7/a$b;->u:I

    invoke-static {v1, v3, p0}, LJ7/a;->l(LJ7/a;LU5/a;Lm8/e;)Ljava/lang/Object;

    move-result-object p0
    :try_end_8f
    .catchall {:try_start_72 .. :try_end_8f} :catchall_9b

    if-ne p0, v0, :cond_92

    :goto_91
    return-object v0

    :cond_92
    move-object p0, p1

    :goto_93
    :try_start_93
    sget-object p1, Lh8/A;->a:Lh8/A;
    :try_end_95
    .catchall {:try_start_93 .. :try_end_95} :catchall_1b

    invoke-interface {p0, v5}, LO8/a;->b(Ljava/lang/Object;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :catchall_9b
    move-exception p0

    move-object v8, p1

    move-object p1, p0

    move-object p0, v8

    :goto_9f
    invoke-interface {p0, v5}, LO8/a;->b(Ljava/lang/Object;)V

    throw p1
.end method
