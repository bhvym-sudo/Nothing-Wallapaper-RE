.class final LU5/e$a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU5/e$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic q:LU5/e;


# direct methods
.method constructor <init>(LU5/e;)V
    .registers 2

    iput-object p1, p0, LU5/e$a$b;->q:LU5/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;Lm8/e;)Ljava/lang/Object;
    .registers 7

    instance-of v0, p2, LU5/e$a$b$a;

    if-eqz v0, :cond_13

    move-object v0, p2

    check-cast v0, LU5/e$a$b$a;

    iget v1, v0, LU5/e$a$b$a;->t:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_13

    sub-int/2addr v1, v2

    iput v1, v0, LU5/e$a$b$a;->t:I

    goto :goto_18

    :cond_13
    new-instance v0, LU5/e$a$b$a;

    invoke-direct {v0, p0, p2}, LU5/e$a$b$a;-><init>(LU5/e$a$b;Lm8/e;)V

    :goto_18
    iget-object p2, v0, LU5/e$a$b$a;->r:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LU5/e$a$b$a;->t:I

    const/4 v3, 0x1

    if-eqz v2, :cond_35

    if-ne v2, v3, :cond_2d

    iget-object p0, v0, LU5/e$a$b$a;->q:Ljava/lang/Object;

    check-cast p0, LU5/e$a$b;

    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_49

    :cond_2d
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_35
    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p2, p0, LU5/e$a$b;->q:LU5/e;

    invoke-static {p2}, LU5/e;->M(LU5/e;)LI8/z;

    move-result-object p2

    iput-object p0, v0, LU5/e$a$b$a;->q:Ljava/lang/Object;

    iput v3, v0, LU5/e$a$b$a;->t:I

    invoke-interface {p2, p1, v0}, LI8/z;->b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_49

    return-object v1

    :cond_49
    :goto_49
    iget-object p1, p0, LU5/e$a$b;->q:LU5/e;

    invoke-static {p1}, LU5/e;->G(LU5/e;)LF8/v;

    move-result-object p1

    invoke-interface {p1}, LF8/x0;->O0()Z

    move-result p1

    if-nez p1, :cond_60

    iget-object p0, p0, LU5/e$a$b;->q:LU5/e;

    invoke-static {p0}, LU5/e;->G(LU5/e;)LF8/v;

    move-result-object p0

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-interface {p0, p1}, LF8/v;->B0(Ljava/lang/Object;)Z

    :cond_60
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public bridge synthetic b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1, p2}, LU5/e$a$b;->a(Ljava/util/List;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
