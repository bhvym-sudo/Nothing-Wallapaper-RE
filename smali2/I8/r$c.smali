.class public final LI8/r$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI8/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI8/r;->e(LI8/f;Lv8/p;)LI8/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic q:Lv8/p;

.field final synthetic r:LI8/f;


# direct methods
.method public constructor <init>(Lv8/p;LI8/f;)V
    .registers 3

    iput-object p1, p0, LI8/r$c;->q:Lv8/p;

    iput-object p2, p0, LI8/r$c;->r:LI8/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LI8/g;Lm8/e;)Ljava/lang/Object;
    .registers 8

    instance-of v0, p2, LI8/r$c$a;

    if-eqz v0, :cond_13

    move-object v0, p2

    check-cast v0, LI8/r$c$a;

    iget v1, v0, LI8/r$c$a;->r:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_13

    sub-int/2addr v1, v2

    iput v1, v0, LI8/r$c$a;->r:I

    goto :goto_18

    :cond_13
    new-instance v0, LI8/r$c$a;

    invoke-direct {v0, p0, p2}, LI8/r$c$a;-><init>(LI8/r$c;Lm8/e;)V

    :goto_18
    iget-object p2, v0, LI8/r$c$a;->q:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LI8/r$c$a;->r:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_46

    if-eq v2, v4, :cond_34

    if-ne v2, v3, :cond_2c

    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_82

    :cond_2c
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_34
    iget-object p0, v0, LI8/r$c$a;->v:Ljava/lang/Object;

    check-cast p0, LJ8/v;

    iget-object p1, v0, LI8/r$c$a;->u:Ljava/lang/Object;

    check-cast p1, LI8/g;

    iget-object v2, v0, LI8/r$c$a;->t:Ljava/lang/Object;

    check-cast v2, LI8/r$c;

    :try_start_40
    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V
    :try_end_43
    .catchall {:try_start_40 .. :try_end_43} :catchall_44

    goto :goto_6d

    :catchall_44
    move-exception p1

    goto :goto_87

    :cond_46
    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    new-instance p2, LJ8/v;

    invoke-interface {v0}, Lm8/e;->getContext()Lm8/i;

    move-result-object v2

    invoke-direct {p2, p1, v2}, LJ8/v;-><init>(LI8/g;Lm8/i;)V

    :try_start_52
    iget-object v2, p0, LI8/r$c;->q:Lv8/p;

    iput-object p0, v0, LI8/r$c$a;->t:Ljava/lang/Object;

    iput-object p1, v0, LI8/r$c$a;->u:Ljava/lang/Object;

    iput-object p2, v0, LI8/r$c$a;->v:Ljava/lang/Object;

    iput v4, v0, LI8/r$c$a;->r:I

    const/4 v4, 0x6

    invoke-static {v4}, Lkotlin/jvm/internal/m;->a(I)V

    invoke-interface {v2, p2, v0}, Lv8/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/4 v4, 0x7

    invoke-static {v4}, Lkotlin/jvm/internal/m;->a(I)V
    :try_end_68
    .catchall {:try_start_52 .. :try_end_68} :catchall_85

    if-ne v2, v1, :cond_6b

    goto :goto_81

    :cond_6b
    move-object v2, p0

    move-object p0, p2

    :goto_6d
    invoke-virtual {p0}, LJ8/v;->releaseIntercepted()V

    iget-object p0, v2, LI8/r$c;->r:LI8/f;

    const/4 p2, 0x0

    iput-object p2, v0, LI8/r$c$a;->t:Ljava/lang/Object;

    iput-object p2, v0, LI8/r$c$a;->u:Ljava/lang/Object;

    iput-object p2, v0, LI8/r$c$a;->v:Ljava/lang/Object;

    iput v3, v0, LI8/r$c$a;->r:I

    invoke-interface {p0, p1, v0}, LI8/f;->a(LI8/g;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_82

    :goto_81
    return-object v1

    :cond_82
    :goto_82
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :catchall_85
    move-exception p1

    move-object p0, p2

    :goto_87
    invoke-virtual {p0}, LJ8/v;->releaseIntercepted()V

    throw p1
.end method
