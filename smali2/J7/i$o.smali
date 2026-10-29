.class final LJ7/i$o;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ7/i;->C0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:Ljava/lang/Object;

.field r:Ljava/lang/Object;

.field s:Ljava/lang/Object;

.field t:Ljava/lang/Object;

.field u:Ljava/lang/Object;

.field v:I

.field final synthetic w:LJ7/i;


# direct methods
.method constructor <init>(LJ7/i;Lm8/e;)V
    .registers 3

    iput-object p1, p0, LJ7/i$o;->w:LJ7/i;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 3

    new-instance p1, LJ7/i$o;

    iget-object p0, p0, LJ7/i$o;->w:LJ7/i;

    invoke-direct {p1, p0, p2}, LJ7/i$o;-><init>(LJ7/i;Lm8/e;)V

    return-object p1
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, LJ7/i$o;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LJ7/i$o;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LJ7/i$o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LJ7/i$o;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 23

    move-object/from16 v0, p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LJ7/i$o;->v:I

    const/4 v3, 0x2

    const/4 v4, 0x0

    packed-switch v2, :pswitch_data_168

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_15
    invoke-static/range {p1 .. p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto/16 :goto_160

    :pswitch_1a
    iget-object v2, v0, LJ7/i$o;->u:Ljava/lang/Object;

    check-cast v2, LJ7/i;

    iget-object v5, v0, LJ7/i$o;->t:Ljava/lang/Object;

    check-cast v5, LA7/g;

    iget-object v6, v0, LJ7/i$o;->s:Ljava/lang/Object;

    check-cast v6, LA7/a;

    iget-object v7, v0, LJ7/i$o;->r:Ljava/lang/Object;

    check-cast v7, LN1/a;

    iget-object v8, v0, LJ7/i$o;->q:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    invoke-static/range {p1 .. p1}, Lh8/r;->b(Ljava/lang/Object;)V

    move-object/from16 v9, p1

    goto/16 :goto_ec

    :pswitch_35
    iget-object v2, v0, LJ7/i$o;->s:Ljava/lang/Object;

    check-cast v2, LA7/a;

    iget-object v5, v0, LJ7/i$o;->r:Ljava/lang/Object;

    check-cast v5, LN1/a;

    iget-object v6, v0, LJ7/i$o;->q:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    invoke-static/range {p1 .. p1}, Lh8/r;->b(Ljava/lang/Object;)V

    move-object/from16 v7, p1

    move-object v8, v6

    move-object v6, v2

    move-object v2, v5

    goto/16 :goto_c7

    :pswitch_4b
    iget-object v2, v0, LJ7/i$o;->r:Ljava/lang/Object;

    check-cast v2, LN1/a;

    iget-object v5, v0, LJ7/i$o;->q:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    invoke-static/range {p1 .. p1}, Lh8/r;->b(Ljava/lang/Object;)V

    move-object/from16 v6, p1

    goto :goto_ad

    :pswitch_59
    iget-object v2, v0, LJ7/i$o;->q:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static/range {p1 .. p1}, Lh8/r;->b(Ljava/lang/Object;)V

    move-object/from16 v5, p1

    goto :goto_91

    :pswitch_63
    invoke-static/range {p1 .. p1}, Lh8/r;->b(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    goto :goto_7d

    :pswitch_69
    invoke-static/range {p1 .. p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object v2, v0, LJ7/i$o;->w:LJ7/i;

    invoke-virtual {v2}, LJ7/i;->h0()LI8/O;

    move-result-object v2

    const/4 v5, 0x1

    iput v5, v0, LJ7/i$o;->v:I

    invoke-static {v2, v0}, LI8/h;->x(LI8/f;Lm8/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_7d

    goto/16 :goto_15f

    :cond_7d
    :goto_7d
    check-cast v2, Ljava/lang/String;

    iget-object v5, v0, LJ7/i$o;->w:LJ7/i;

    invoke-virtual {v5}, LJ7/i;->i0()LI8/O;

    move-result-object v5

    iput-object v2, v0, LJ7/i$o;->q:Ljava/lang/Object;

    iput v3, v0, LJ7/i$o;->v:I

    invoke-static {v5, v0}, LI8/h;->x(LI8/f;Lm8/e;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v1, :cond_91

    goto/16 :goto_15f

    :cond_91
    :goto_91
    check-cast v5, LN1/a;

    iget-object v6, v0, LJ7/i$o;->w:LJ7/i;

    invoke-virtual {v6}, LJ7/i;->g0()LI8/O;

    move-result-object v6

    iput-object v2, v0, LJ7/i$o;->q:Ljava/lang/Object;

    iput-object v5, v0, LJ7/i$o;->r:Ljava/lang/Object;

    const/4 v7, 0x3

    iput v7, v0, LJ7/i$o;->v:I

    invoke-static {v6, v0}, LI8/h;->x(LI8/f;Lm8/e;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v1, :cond_a8

    goto/16 :goto_15f

    :cond_a8
    move-object/from16 v20, v5

    move-object v5, v2

    move-object/from16 v2, v20

    :goto_ad
    check-cast v6, LA7/a;

    iget-object v7, v0, LJ7/i$o;->w:LJ7/i;

    invoke-virtual {v7}, LJ7/i;->j0()LI8/O;

    move-result-object v7

    iput-object v5, v0, LJ7/i$o;->q:Ljava/lang/Object;

    iput-object v2, v0, LJ7/i$o;->r:Ljava/lang/Object;

    iput-object v6, v0, LJ7/i$o;->s:Ljava/lang/Object;

    const/4 v8, 0x4

    iput v8, v0, LJ7/i$o;->v:I

    invoke-static {v7, v0}, LI8/h;->x(LI8/f;Lm8/e;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v1, :cond_c6

    goto/16 :goto_15f

    :cond_c6
    move-object v8, v5

    :goto_c7
    move-object v5, v7

    check-cast v5, LA7/g;

    if-eqz v5, :cond_f9

    iget-object v7, v0, LJ7/i$o;->w:LJ7/i;

    invoke-virtual {v7}, LJ7/i;->U()LI8/f;

    move-result-object v9

    iput-object v8, v0, LJ7/i$o;->q:Ljava/lang/Object;

    iput-object v2, v0, LJ7/i$o;->r:Ljava/lang/Object;

    iput-object v6, v0, LJ7/i$o;->s:Ljava/lang/Object;

    iput-object v5, v0, LJ7/i$o;->t:Ljava/lang/Object;

    iput-object v7, v0, LJ7/i$o;->u:Ljava/lang/Object;

    const/4 v10, 0x5

    iput v10, v0, LJ7/i$o;->v:I

    invoke-static {v9, v0}, LI8/h;->x(LI8/f;Lm8/e;)Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v1, :cond_e7

    goto/16 :goto_15f

    :cond_e7
    move-object/from16 v20, v7

    move-object v7, v2

    move-object/from16 v2, v20

    :goto_ec
    check-cast v9, Ljava/lang/String;

    invoke-static {v2, v9, v4, v3, v4}, LJ7/i;->a1(LJ7/i;Ljava/lang/String;Ljava/util/Set;ILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_f5

    goto :goto_f6

    :cond_f5
    move-object v5, v4

    :goto_f6
    move-object v11, v7

    :goto_f7
    move-object v10, v8

    goto :goto_fc

    :cond_f9
    move-object v11, v2

    move-object v5, v4

    goto :goto_f7

    :goto_fc
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "saveClock id:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " align:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " size:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " dynamicFont:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "LockScreenViewModel"

    invoke-static {v3, v2}, Lcom/nothing/wallpaper/common/log/c;->k(Ljava/lang/String;Ljava/lang/String;)V

    if-nez v10, :cond_135

    if-nez v11, :cond_135

    if-nez v6, :cond_135

    if-nez v5, :cond_135

    sget-object v0, Lh8/A;->a:Lh8/A;

    return-object v0

    :cond_135
    iget-object v2, v0, LJ7/i$o;->w:LJ7/i;

    invoke-static {v2}, LJ7/i;->n(LJ7/i;)LM1/b;

    move-result-object v2

    new-instance v9, LO1/b;

    const/16 v18, 0x3c

    const/16 v19, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v17, v5

    move-object/from16 v16, v6

    invoke-direct/range {v9 .. v19}, LO1/b;-><init>(Ljava/lang/String;LN1/a;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;LO2/f;LA7/a;LA7/g;ILkotlin/jvm/internal/h;)V

    iput-object v4, v0, LJ7/i$o;->q:Ljava/lang/Object;

    iput-object v4, v0, LJ7/i$o;->r:Ljava/lang/Object;

    iput-object v4, v0, LJ7/i$o;->s:Ljava/lang/Object;

    iput-object v4, v0, LJ7/i$o;->t:Ljava/lang/Object;

    iput-object v4, v0, LJ7/i$o;->u:Ljava/lang/Object;

    const/4 v3, 0x6

    iput v3, v0, LJ7/i$o;->v:I

    invoke-virtual {v2, v9, v0}, LM1/b;->r(LO1/b;Lm8/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_160

    :goto_15f
    return-object v1

    :cond_160
    :goto_160
    iget-object v0, v0, LJ7/i$o;->w:LJ7/i;

    invoke-virtual {v0}, LJ7/i;->b1()V

    sget-object v0, Lh8/A;->a:Lh8/A;

    return-object v0

    :pswitch_data_168
    .packed-switch 0x0
        :pswitch_69
        :pswitch_63
        :pswitch_59
        :pswitch_4b
        :pswitch_35
        :pswitch_1a
        :pswitch_15
    .end packed-switch
.end method
