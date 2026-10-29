.class public final LJ7/i$y$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ7/i$y;->a(LI8/g;Lm8/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic q:LI8/g;

.field final synthetic r:Ljava/util/List;


# direct methods
.method public constructor <init>(LI8/g;Ljava/util/List;)V
    .registers 3

    iput-object p1, p0, LJ7/i$y$a;->q:LI8/g;

    iput-object p2, p0, LJ7/i$y$a;->r:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
    .registers 8

    instance-of v0, p2, LJ7/i$y$a$a;

    if-eqz v0, :cond_13

    move-object v0, p2

    check-cast v0, LJ7/i$y$a$a;

    iget v1, v0, LJ7/i$y$a$a;->r:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_13

    sub-int/2addr v1, v2

    iput v1, v0, LJ7/i$y$a$a;->r:I

    goto :goto_18

    :cond_13
    new-instance v0, LJ7/i$y$a$a;

    invoke-direct {v0, p0, p2}, LJ7/i$y$a$a;-><init>(LJ7/i$y$a;Lm8/e;)V

    :goto_18
    iget-object p2, v0, LJ7/i$y$a$a;->q:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LJ7/i$y$a$a;->r:I

    const/4 v3, 0x1

    if-eqz v2, :cond_31

    if-ne v2, v3, :cond_29

    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_6b

    :cond_29
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_31
    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p2, p0, LJ7/i$y$a;->q:LI8/g;

    check-cast p1, Ljava/lang/String;

    iget-object p0, p0, LJ7/i$y$a;->r:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v2, 0x0

    :goto_3f
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_59

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LT1/a;

    invoke-virtual {v4}, LT1/a;->a()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_56

    goto :goto_5a

    :cond_56
    add-int/lit8 v2, v2, 0x1

    goto :goto_3f

    :cond_59
    const/4 v2, -0x1

    :goto_5a
    if-ltz v2, :cond_61

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/b;->c(I)Ljava/lang/Integer;

    move-result-object p0

    goto :goto_62

    :cond_61
    const/4 p0, 0x0

    :goto_62
    iput v3, v0, LJ7/i$y$a$a;->r:I

    invoke-interface {p2, p0, v0}, LI8/g;->b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_6b

    return-object v1

    :cond_6b
    :goto_6b
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
