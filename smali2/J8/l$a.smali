.class final LJ8/l$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ8/l;->a(LI8/g;[LI8/f;Lv8/a;Lv8/q;Lm8/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:Ljava/lang/Object;

.field r:Ljava/lang/Object;

.field s:I

.field t:I

.field u:I

.field private synthetic v:Ljava/lang/Object;

.field final synthetic w:[LI8/f;

.field final synthetic x:Lv8/a;

.field final synthetic y:Lv8/q;

.field final synthetic z:LI8/g;


# direct methods
.method constructor <init>([LI8/f;Lv8/a;Lv8/q;LI8/g;Lm8/e;)V
    .registers 6

    iput-object p1, p0, LJ8/l$a;->w:[LI8/f;

    iput-object p2, p0, LJ8/l$a;->x:Lv8/a;

    iput-object p3, p0, LJ8/l$a;->y:Lv8/q;

    iput-object p4, p0, LJ8/l$a;->z:LI8/g;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 9

    new-instance v0, LJ8/l$a;

    iget-object v1, p0, LJ8/l$a;->w:[LI8/f;

    iget-object v2, p0, LJ8/l$a;->x:Lv8/a;

    iget-object v3, p0, LJ8/l$a;->y:Lv8/q;

    iget-object v4, p0, LJ8/l$a;->z:LI8/g;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, LJ8/l$a;-><init>([LI8/f;Lv8/a;Lv8/q;LI8/g;Lm8/e;)V

    iput-object p1, v0, LJ8/l$a;->v:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, LJ8/l$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LJ8/l$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LJ8/l$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LJ8/l$a;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 23

    move-object/from16 v0, p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LJ8/l$a;->u:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_4e

    if-eq v2, v5, :cond_31

    if-eq v2, v4, :cond_1c

    if-ne v2, v3, :cond_14

    goto :goto_1c

    :cond_14
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1c
    :goto_1c
    iget v2, v0, LJ8/l$a;->t:I

    iget v6, v0, LJ8/l$a;->s:I

    iget-object v7, v0, LJ8/l$a;->r:Ljava/lang/Object;

    check-cast v7, [B

    iget-object v8, v0, LJ8/l$a;->q:Ljava/lang/Object;

    check-cast v8, LH8/g;

    iget-object v9, v0, LJ8/l$a;->v:Ljava/lang/Object;

    check-cast v9, [Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto/16 :goto_129

    :cond_31
    iget v2, v0, LJ8/l$a;->t:I

    iget v6, v0, LJ8/l$a;->s:I

    iget-object v7, v0, LJ8/l$a;->r:Ljava/lang/Object;

    check-cast v7, [B

    iget-object v8, v0, LJ8/l$a;->q:Ljava/lang/Object;

    check-cast v8, LH8/g;

    iget-object v9, v0, LJ8/l$a;->v:Ljava/lang/Object;

    check-cast v9, [Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lh8/r;->b(Ljava/lang/Object;)V

    move-object/from16 v10, p1

    check-cast v10, LH8/k;

    invoke-virtual {v10}, LH8/k;->k()Ljava/lang/Object;

    move-result-object v10

    goto/16 :goto_b6

    :cond_4e
    invoke-static/range {p1 .. p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object v2, v0, LJ8/l$a;->v:Ljava/lang/Object;

    move-object v6, v2

    check-cast v6, LF8/L;

    iget-object v2, v0, LJ8/l$a;->w:[LI8/f;

    array-length v2, v2

    if-nez v2, :cond_5e

    sget-object v0, Lh8/A;->a:Lh8/A;

    return-object v0

    :cond_5e
    new-array v7, v2, [Ljava/lang/Object;

    sget-object v8, LJ8/t;->b:LK8/D;

    const/4 v11, 0x6

    const/4 v12, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Li8/m;->t([Ljava/lang/Object;Ljava/lang/Object;IIILjava/lang/Object;)V

    move-object v12, v7

    const/4 v7, 0x6

    const/4 v8, 0x0

    invoke-static {v2, v8, v8, v7, v8}, LH8/j;->b(ILH8/a;Lv8/l;ILjava/lang/Object;)LH8/g;

    move-result-object v17

    new-instance v7, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v7, v2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    const/16 v19, 0x0

    move/from16 v15, v19

    :goto_79
    if-ge v15, v2, :cond_93

    new-instance v9, LJ8/l$a$a;

    iget-object v14, v0, LJ8/l$a;->w:[LI8/f;

    const/16 v18, 0x0

    move-object/from16 v16, v7

    move-object v13, v9

    invoke-direct/range {v13 .. v18}, LJ8/l$a$a;-><init>([LI8/f;ILjava/util/concurrent/atomic/AtomicInteger;LH8/g;Lm8/e;)V

    const/4 v10, 0x3

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v6 .. v11}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    add-int/lit8 v15, v15, 0x1

    move-object/from16 v7, v16

    goto :goto_79

    :cond_93
    new-array v6, v2, [B

    move-object v7, v12

    move-object/from16 v8, v17

    :goto_98
    add-int/lit8 v9, v19, 0x1

    int-to-byte v9, v9

    iput-object v7, v0, LJ8/l$a;->v:Ljava/lang/Object;

    iput-object v8, v0, LJ8/l$a;->q:Ljava/lang/Object;

    iput-object v6, v0, LJ8/l$a;->r:Ljava/lang/Object;

    iput v2, v0, LJ8/l$a;->s:I

    iput v9, v0, LJ8/l$a;->t:I

    iput v5, v0, LJ8/l$a;->u:I

    invoke-interface {v8, v0}, LH8/v;->c(Lm8/e;)Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v1, :cond_af

    goto/16 :goto_128

    :cond_af
    move-object/from16 v20, v6

    move v6, v2

    move v2, v9

    move-object v9, v7

    move-object/from16 v7, v20

    :goto_b6
    invoke-static {v10}, LH8/k;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Li8/I;

    if-nez v10, :cond_c1

    sget-object v0, Lh8/A;->a:Lh8/A;

    return-object v0

    :cond_c1
    invoke-virtual {v10}, Li8/I;->c()I

    move-result v11

    aget-object v12, v9, v11

    invoke-virtual {v10}, Li8/I;->d()Ljava/lang/Object;

    move-result-object v10

    aput-object v10, v9, v11

    sget-object v10, LJ8/t;->b:LK8/D;

    if-ne v12, v10, :cond_d3

    add-int/lit8 v6, v6, -0x1

    :cond_d3
    aget-byte v10, v7, v11

    if-eq v10, v2, :cond_e6

    int-to-byte v10, v2

    aput-byte v10, v7, v11

    invoke-interface {v8}, LH8/v;->g()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v10}, LH8/k;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Li8/I;

    if-nez v10, :cond_c1

    :cond_e6
    if-nez v6, :cond_129

    iget-object v10, v0, LJ8/l$a;->x:Lv8/a;

    invoke-interface {v10}, Lv8/a;->invoke()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, [Ljava/lang/Object;

    if-nez v10, :cond_109

    iget-object v10, v0, LJ8/l$a;->y:Lv8/q;

    iget-object v11, v0, LJ8/l$a;->z:LI8/g;

    iput-object v9, v0, LJ8/l$a;->v:Ljava/lang/Object;

    iput-object v8, v0, LJ8/l$a;->q:Ljava/lang/Object;

    iput-object v7, v0, LJ8/l$a;->r:Ljava/lang/Object;

    iput v6, v0, LJ8/l$a;->s:I

    iput v2, v0, LJ8/l$a;->t:I

    iput v4, v0, LJ8/l$a;->u:I

    invoke-interface {v10, v11, v9, v0}, Lv8/q;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v1, :cond_129

    goto :goto_128

    :cond_109
    const/16 v14, 0xe

    const/4 v15, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v9 .. v15}, Li8/m;->l([Ljava/lang/Object;[Ljava/lang/Object;IIIILjava/lang/Object;)[Ljava/lang/Object;

    iget-object v11, v0, LJ8/l$a;->y:Lv8/q;

    iget-object v12, v0, LJ8/l$a;->z:LI8/g;

    iput-object v9, v0, LJ8/l$a;->v:Ljava/lang/Object;

    iput-object v8, v0, LJ8/l$a;->q:Ljava/lang/Object;

    iput-object v7, v0, LJ8/l$a;->r:Ljava/lang/Object;

    iput v6, v0, LJ8/l$a;->s:I

    iput v2, v0, LJ8/l$a;->t:I

    iput v3, v0, LJ8/l$a;->u:I

    invoke-interface {v11, v12, v10, v0}, Lv8/q;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v1, :cond_129

    :goto_128
    return-object v1

    :cond_129
    :goto_129
    move/from16 v19, v2

    move v2, v6

    move-object v6, v7

    move-object v7, v9

    goto/16 :goto_98
.end method
