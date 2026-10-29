.class final LJ8/l$a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ8/l$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic q:LH8/g;

.field final synthetic r:I


# direct methods
.method constructor <init>(LH8/g;I)V
    .registers 3

    iput-object p1, p0, LJ8/l$a$a$a;->q:LH8/g;

    iput p2, p0, LJ8/l$a$a$a;->r:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
    .registers 8

    instance-of v0, p2, LJ8/l$a$a$a$a;

    if-eqz v0, :cond_13

    move-object v0, p2

    check-cast v0, LJ8/l$a$a$a$a;

    iget v1, v0, LJ8/l$a$a$a$a;->s:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_13

    sub-int/2addr v1, v2

    iput v1, v0, LJ8/l$a$a$a$a;->s:I

    goto :goto_18

    :cond_13
    new-instance v0, LJ8/l$a$a$a$a;

    invoke-direct {v0, p0, p2}, LJ8/l$a$a$a$a;-><init>(LJ8/l$a$a$a;Lm8/e;)V

    :goto_18
    iget-object p2, v0, LJ8/l$a$a$a$a;->q:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LJ8/l$a$a$a$a;->s:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_38

    if-eq v2, v4, :cond_34

    if-ne v2, v3, :cond_2c

    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_56

    :cond_2c
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_34
    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_4d

    :cond_38
    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p2, p0, LJ8/l$a$a$a;->q:LH8/g;

    new-instance v2, Li8/I;

    iget p0, p0, LJ8/l$a$a$a;->r:I

    invoke-direct {v2, p0, p1}, Li8/I;-><init>(ILjava/lang/Object;)V

    iput v4, v0, LJ8/l$a$a$a$a;->s:I

    invoke-interface {p2, v2, v0}, LH8/w;->n(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_4d

    goto :goto_55

    :cond_4d
    :goto_4d
    iput v3, v0, LJ8/l$a$a$a$a;->s:I

    invoke-static {v0}, LF8/e1;->a(Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_56

    :goto_55
    return-object v1

    :cond_56
    :goto_56
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
