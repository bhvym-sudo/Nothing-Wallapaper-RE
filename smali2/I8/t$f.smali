.class public final LI8/t$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI8/t;->c(LI8/f;Lv8/p;)LI8/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic q:Lv8/p;

.field final synthetic r:LI8/g;


# direct methods
.method public constructor <init>(Lv8/p;LI8/g;)V
    .registers 3

    iput-object p1, p0, LI8/t$f;->q:Lv8/p;

    iput-object p2, p0, LI8/t$f;->r:LI8/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
    .registers 8

    instance-of v0, p2, LI8/t$f$a;

    if-eqz v0, :cond_13

    move-object v0, p2

    check-cast v0, LI8/t$f$a;

    iget v1, v0, LI8/t$f$a;->s:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_13

    sub-int/2addr v1, v2

    iput v1, v0, LI8/t$f$a;->s:I

    goto :goto_18

    :cond_13
    new-instance v0, LI8/t$f$a;

    invoke-direct {v0, p0, p2}, LI8/t$f$a;-><init>(LI8/t$f;Lm8/e;)V

    :goto_18
    iget-object p2, v0, LI8/t$f$a;->r:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LI8/t$f$a;->s:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_42

    if-eq v2, v4, :cond_38

    if-ne v2, v3, :cond_30

    iget-object p0, v0, LI8/t$f$a;->q:Ljava/lang/Object;

    check-cast p0, LI8/t$f;

    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_75

    :cond_30
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_38
    iget-object p1, v0, LI8/t$f$a;->u:Ljava/lang/Object;

    iget-object p0, v0, LI8/t$f$a;->q:Ljava/lang/Object;

    check-cast p0, LI8/t$f;

    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_5c

    :cond_42
    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p2, p0, LI8/t$f;->q:Lv8/p;

    iput-object p0, v0, LI8/t$f$a;->q:Ljava/lang/Object;

    iput-object p1, v0, LI8/t$f$a;->u:Ljava/lang/Object;

    iput v4, v0, LI8/t$f$a;->s:I

    const/4 v2, 0x6

    invoke-static {v2}, Lkotlin/jvm/internal/m;->a(I)V

    invoke-interface {p2, p1, v0}, Lv8/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    const/4 v2, 0x7

    invoke-static {v2}, Lkotlin/jvm/internal/m;->a(I)V

    if-ne p2, v1, :cond_5c

    goto :goto_73

    :cond_5c
    :goto_5c
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_74

    iget-object p2, p0, LI8/t$f;->r:LI8/g;

    iput-object p0, v0, LI8/t$f$a;->q:Ljava/lang/Object;

    const/4 v2, 0x0

    iput-object v2, v0, LI8/t$f$a;->u:Ljava/lang/Object;

    iput v3, v0, LI8/t$f$a;->s:I

    invoke-interface {p2, p1, v0}, LI8/g;->b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_75

    :goto_73
    return-object v1

    :cond_74
    const/4 v4, 0x0

    :cond_75
    :goto_75
    if-eqz v4, :cond_7a

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_7a
    new-instance p1, LJ8/a;

    invoke-direct {p1, p0}, LJ8/a;-><init>(Ljava/lang/Object;)V

    throw p1
.end method
