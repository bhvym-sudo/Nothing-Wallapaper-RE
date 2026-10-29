.class public final LI8/t$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI8/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI8/t;->c(LI8/f;Lv8/p;)LI8/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic q:LI8/f;

.field final synthetic r:Lv8/p;


# direct methods
.method public constructor <init>(LI8/f;Lv8/p;)V
    .registers 3

    iput-object p1, p0, LI8/t$e;->q:LI8/f;

    iput-object p2, p0, LI8/t$e;->r:Lv8/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LI8/g;Lm8/e;)Ljava/lang/Object;
    .registers 7

    instance-of v0, p2, LI8/t$e$a;

    if-eqz v0, :cond_13

    move-object v0, p2

    check-cast v0, LI8/t$e$a;

    iget v1, v0, LI8/t$e$a;->r:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_13

    sub-int/2addr v1, v2

    iput v1, v0, LI8/t$e$a;->r:I

    goto :goto_18

    :cond_13
    new-instance v0, LI8/t$e$a;

    invoke-direct {v0, p0, p2}, LI8/t$e$a;-><init>(LI8/t$e;Lm8/e;)V

    :goto_18
    iget-object p2, v0, LI8/t$e$a;->q:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LI8/t$e$a;->r:I

    const/4 v3, 0x1

    if-eqz v2, :cond_37

    if-ne v2, v3, :cond_2f

    iget-object p0, v0, LI8/t$e$a;->t:Ljava/lang/Object;

    check-cast p0, LI8/t$f;

    :try_start_29
    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V
    :try_end_2c
    .catch LJ8/a; {:try_start_29 .. :try_end_2c} :catch_2d

    goto :goto_5a

    :catch_2d
    move-exception p1

    goto :goto_50

    :cond_2f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_37
    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p2, p0, LI8/t$e;->q:LI8/f;

    new-instance v2, LI8/t$f;

    iget-object p0, p0, LI8/t$e;->r:Lv8/p;

    invoke-direct {v2, p0, p1}, LI8/t$f;-><init>(Lv8/p;LI8/g;)V

    :try_start_43
    iput-object v2, v0, LI8/t$e$a;->t:Ljava/lang/Object;

    iput v3, v0, LI8/t$e$a;->r:I

    invoke-interface {p2, v2, v0}, LI8/f;->a(LI8/g;Lm8/e;)Ljava/lang/Object;

    move-result-object p0
    :try_end_4b
    .catch LJ8/a; {:try_start_43 .. :try_end_4b} :catch_4e

    if-ne p0, v1, :cond_5a

    return-object v1

    :catch_4e
    move-exception p1

    move-object p0, v2

    :goto_50
    invoke-static {p1, p0}, LJ8/p;->a(LJ8/a;Ljava/lang/Object;)V

    invoke-interface {v0}, Lm8/e;->getContext()Lm8/i;

    move-result-object p0

    invoke-static {p0}, LF8/A0;->j(Lm8/i;)V

    :cond_5a
    :goto_5a
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
