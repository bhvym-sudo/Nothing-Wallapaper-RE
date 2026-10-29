.class public final LB7/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB7/a;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:LR2/a;

.field private final c:LI8/f;

.field private final d:LI8/f;

.field private final e:LI8/f;


# direct methods
.method public constructor <init>(Landroid/content/Context;LR2/a;)V
    .registers 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "client"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB7/b;->a:Landroid/content/Context;

    iput-object p2, p0, LB7/b;->b:LR2/a;

    invoke-interface {p2}, LR2/a;->d()LI8/f;

    move-result-object p1

    new-instance v0, LB7/b$a;

    invoke-direct {v0, p1, p0}, LB7/b$a;-><init>(LI8/f;LB7/b;)V

    iput-object v0, p0, LB7/b;->c:LI8/f;

    invoke-interface {p2}, LR2/a;->b()LI8/f;

    move-result-object p1

    new-instance v0, LB7/b$b;

    invoke-direct {v0, p1, p0}, LB7/b$b;-><init>(LI8/f;LB7/b;)V

    iput-object v0, p0, LB7/b;->d:LI8/f;

    invoke-interface {p2}, LR2/a;->h()LI8/f;

    move-result-object p1

    new-instance p2, LB7/b$c;

    invoke-direct {p2, p1, p0}, LB7/b$c;-><init>(LI8/f;LB7/b;)V

    iput-object p2, p0, LB7/b;->e:LI8/f;

    return-void
.end method

.method public static final synthetic e(LB7/b;)LR2/a;
    .registers 1

    iget-object p0, p0, LB7/b;->b:LR2/a;

    return-object p0
.end method

.method public static final synthetic f(LB7/b;LR2/a$c;)LC7/b;
    .registers 2

    invoke-direct {p0, p1}, LB7/b;->i(LR2/a$c;)LC7/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g(LB7/b;LR2/a$d;)LC7/c;
    .registers 2

    invoke-direct {p0, p1}, LB7/b;->j(LR2/a$d;)LC7/c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic h(LB7/b;LR2/a$a;LR2/a;Lm8/e;)Ljava/lang/Object;
    .registers 4

    invoke-direct {p0, p1, p2, p3}, LB7/b;->k(LR2/a$a;LR2/a;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final i(LR2/a$c;)LC7/b;
    .registers 3

    new-instance p0, LC7/b;

    invoke-virtual {p1}, LR2/a$c;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, LR2/a$c;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, v0, p1}, LC7/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method private final j(LR2/a$d;)LC7/c;
    .registers 3

    new-instance p0, LC7/c;

    invoke-virtual {p1}, LR2/a$d;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, LR2/a$d;->a()I

    move-result p1

    invoke-direct {p0, v0, p1}, LC7/c;-><init>(Ljava/lang/String;I)V

    return-object p0
.end method

.method private final k(LR2/a$a;LR2/a;Lm8/e;)Ljava/lang/Object;
    .registers 24

    move-object/from16 v0, p3

    instance-of v1, v0, LB7/b$d;

    if-eqz v1, :cond_16

    move-object v1, v0

    check-cast v1, LB7/b$d;

    iget v2, v1, LB7/b$d;->w:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_16

    sub-int/2addr v2, v3

    iput v2, v1, LB7/b$d;->w:I

    :goto_14
    move-object v5, v1

    goto :goto_1e

    :cond_16
    new-instance v1, LB7/b$d;

    move-object/from16 v2, p0

    invoke-direct {v1, v2, v0}, LB7/b$d;-><init>(LB7/b;Lm8/e;)V

    goto :goto_14

    :goto_1e
    iget-object v0, v5, LB7/b$d;->u:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v5, LB7/b$d;->w:I

    const-string v8, ""

    const/4 v3, 0x1

    if-eqz v2, :cond_4c

    if-ne v2, v3, :cond_44

    iget-object v1, v5, LB7/b$d;->t:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v2, v5, LB7/b$d;->s:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v3, v5, LB7/b$d;->r:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v4, v5, LB7/b$d;->q:Ljava/lang/Object;

    check-cast v4, LR2/a$a;

    invoke-static {v0}, Lh8/r;->b(Ljava/lang/Object;)V

    move-object v12, v1

    move-object v11, v2

    move-object v10, v3

    goto :goto_79

    :cond_44
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4c
    invoke-static {v0}, Lh8/r;->b(Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, LR2/a$a;->f()Ljava/lang/String;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, LR2/a$a;->g()Ljava/lang/String;

    move-result-object v9

    invoke-virtual/range {p1 .. p1}, LR2/a$a;->e()I

    move-result v2

    move-object/from16 v10, p1

    iput-object v10, v5, LB7/b$d;->q:Ljava/lang/Object;

    iput-object v0, v5, LB7/b$d;->r:Ljava/lang/Object;

    iput-object v9, v5, LB7/b$d;->s:Ljava/lang/Object;

    iput-object v8, v5, LB7/b$d;->t:Ljava/lang/Object;

    iput v3, v5, LB7/b$d;->w:I

    const/4 v4, 0x0

    const/4 v6, 0x2

    const/4 v7, 0x0

    move v3, v2

    move-object/from16 v2, p2

    invoke-static/range {v2 .. v7}, LR2/a;->g(LR2/a;IILm8/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_74

    return-object v1

    :cond_74
    move-object v12, v8

    move-object v11, v9

    move-object v4, v10

    move-object v10, v0

    move-object v0, v2

    :goto_79
    move-object v13, v0

    check-cast v13, Landroid/graphics/drawable/Drawable;

    invoke-virtual {v4}, LR2/a$a;->h()Z

    move-result v15

    invoke-virtual {v4}, LR2/a$a;->d()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_89

    move-object/from16 v16, v8

    goto :goto_8b

    :cond_89
    move-object/from16 v16, v0

    :goto_8b
    invoke-virtual {v4}, LR2/a$a;->c()Ljava/lang/String;

    move-result-object v17

    invoke-virtual {v4}, LR2/a$a;->b()Landroid/content/Intent;

    move-result-object v18

    invoke-virtual {v4}, LR2/a$a;->a()Landroid/content/Intent;

    move-result-object v19

    new-instance v9, LC7/a;

    const/4 v14, 0x0

    invoke-direct/range {v9 .. v19}, LC7/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/drawable/Drawable;ZZLjava/lang/String;Ljava/lang/String;Landroid/content/Intent;Landroid/content/Intent;)V

    return-object v9
.end method


# virtual methods
.method public a()LI8/f;
    .registers 1

    iget-object p0, p0, LB7/b;->c:LI8/f;

    return-object p0
.end method

.method public b()LI8/f;
    .registers 1

    iget-object p0, p0, LB7/b;->d:LI8/f;

    return-object p0
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;Lm8/e;)Ljava/lang/Object;
    .registers 4

    iget-object p0, p0, LB7/b;->b:LR2/a;

    invoke-interface {p0, p1, p2, p3}, LR2/a;->e(Ljava/lang/String;Ljava/lang/String;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_d

    return-object p0

    :cond_d
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public d()LI8/f;
    .registers 1

    iget-object p0, p0, LB7/b;->e:LI8/f;

    return-object p0
.end method
