.class public final LI8/r$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI8/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI8/r;->d(LI8/f;Lv8/q;)LI8/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic q:LI8/f;

.field final synthetic r:Lv8/q;


# direct methods
.method public constructor <init>(LI8/f;Lv8/q;)V
    .registers 3

    iput-object p1, p0, LI8/r$b;->q:LI8/f;

    iput-object p2, p0, LI8/r$b;->r:Lv8/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LI8/g;Lm8/e;)Ljava/lang/Object;
    .registers 11

    instance-of v0, p2, LI8/r$b$a;

    if-eqz v0, :cond_13

    move-object v0, p2

    check-cast v0, LI8/r$b$a;

    iget v1, v0, LI8/r$b$a;->r:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_13

    sub-int/2addr v1, v2

    iput v1, v0, LI8/r$b$a;->r:I

    goto :goto_18

    :cond_13
    new-instance v0, LI8/r$b$a;

    invoke-direct {v0, p0, p2}, LI8/r$b$a;-><init>(LI8/r$b;Lm8/e;)V

    :goto_18
    iget-object p2, v0, LI8/r$b$a;->q:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LI8/r$b$a;->r:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_58

    if-eq v2, v5, :cond_46

    if-eq v2, v4, :cond_3e

    if-ne v2, v3, :cond_36

    iget-object p0, v0, LI8/r$b$a;->t:Ljava/lang/Object;

    check-cast p0, LJ8/v;

    :try_start_30
    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V
    :try_end_33
    .catchall {:try_start_30 .. :try_end_33} :catchall_34

    goto :goto_8b

    :catchall_34
    move-exception p1

    goto :goto_93

    :cond_36
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3e
    iget-object p0, v0, LI8/r$b$a;->t:Ljava/lang/Object;

    check-cast p0, Ljava/lang/Throwable;

    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_ab

    :cond_46
    iget-object p0, v0, LI8/r$b$a;->u:Ljava/lang/Object;

    move-object p1, p0

    check-cast p1, LI8/g;

    iget-object p0, v0, LI8/r$b$a;->t:Ljava/lang/Object;

    check-cast p0, LI8/r$b;

    :try_start_4f
    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V
    :try_end_52
    .catchall {:try_start_4f .. :try_end_52} :catchall_53

    goto :goto_6a

    :catchall_53
    move-exception p1

    move-object v7, p1

    move-object p1, p0

    move-object p0, v7

    goto :goto_97

    :cond_58
    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    :try_start_5b
    iget-object p2, p0, LI8/r$b;->q:LI8/f;

    iput-object p0, v0, LI8/r$b$a;->t:Ljava/lang/Object;

    iput-object p1, v0, LI8/r$b$a;->u:Ljava/lang/Object;

    iput v5, v0, LI8/r$b$a;->r:I

    invoke-interface {p2, p1, v0}, LI8/f;->a(LI8/g;Lm8/e;)Ljava/lang/Object;

    move-result-object p2
    :try_end_67
    .catchall {:try_start_5b .. :try_end_67} :catchall_53

    if-ne p2, v1, :cond_6a

    goto :goto_aa

    :cond_6a
    :goto_6a
    new-instance p2, LJ8/v;

    invoke-interface {v0}, Lm8/e;->getContext()Lm8/i;

    move-result-object v2

    invoke-direct {p2, p1, v2}, LJ8/v;-><init>(LI8/g;Lm8/i;)V

    :try_start_73
    iget-object p0, p0, LI8/r$b;->r:Lv8/q;

    iput-object p2, v0, LI8/r$b$a;->t:Ljava/lang/Object;

    iput-object v6, v0, LI8/r$b$a;->u:Ljava/lang/Object;

    iput v3, v0, LI8/r$b$a;->r:I

    const/4 p1, 0x6

    invoke-static {p1}, Lkotlin/jvm/internal/m;->a(I)V

    invoke-interface {p0, p2, v6, v0}, Lv8/q;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    const/4 p1, 0x7

    invoke-static {p1}, Lkotlin/jvm/internal/m;->a(I)V
    :try_end_87
    .catchall {:try_start_73 .. :try_end_87} :catchall_91

    if-ne p0, v1, :cond_8a

    goto :goto_aa

    :cond_8a
    move-object p0, p2

    :goto_8b
    invoke-virtual {p0}, LJ8/v;->releaseIntercepted()V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :catchall_91
    move-exception p1

    move-object p0, p2

    :goto_93
    invoke-virtual {p0}, LJ8/v;->releaseIntercepted()V

    throw p1

    :goto_97
    new-instance p2, LI8/T;

    invoke-direct {p2, p0}, LI8/T;-><init>(Ljava/lang/Throwable;)V

    iget-object p1, p1, LI8/r$b;->r:Lv8/q;

    iput-object p0, v0, LI8/r$b$a;->t:Ljava/lang/Object;

    iput-object v6, v0, LI8/r$b$a;->u:Ljava/lang/Object;

    iput v4, v0, LI8/r$b$a;->r:I

    invoke-static {p2, p1, p0, v0}, LI8/r;->a(LI8/g;Lv8/q;Ljava/lang/Throwable;Lm8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_ab

    :goto_aa
    return-object v1

    :cond_ab
    :goto_ab
    throw p0
.end method
