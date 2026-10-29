.class public final Lu7/a$e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu7/a$e;->a(LI8/g;Lm8/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic q:LI8/g;

.field final synthetic r:Lu7/a;


# direct methods
.method public constructor <init>(LI8/g;Lu7/a;)V
    .registers 3

    iput-object p1, p0, Lu7/a$e$a;->q:LI8/g;

    iput-object p2, p0, Lu7/a$e$a;->r:Lu7/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
    .registers 9

    instance-of v0, p2, Lu7/a$e$a$a;

    if-eqz v0, :cond_13

    move-object v0, p2

    check-cast v0, Lu7/a$e$a$a;

    iget v1, v0, Lu7/a$e$a$a;->r:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_13

    sub-int/2addr v1, v2

    iput v1, v0, Lu7/a$e$a$a;->r:I

    goto :goto_18

    :cond_13
    new-instance v0, Lu7/a$e$a$a;

    invoke-direct {v0, p0, p2}, Lu7/a$e$a$a;-><init>(Lu7/a$e$a;Lm8/e;)V

    :goto_18
    iget-object p2, v0, Lu7/a$e$a$a;->q:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lu7/a$e$a$a;->r:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3c

    if-eq v2, v4, :cond_34

    if-ne v2, v3, :cond_2c

    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_5f

    :cond_2c
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_34
    iget-object p0, v0, Lu7/a$e$a$a;->s:Ljava/lang/Object;

    check-cast p0, LI8/g;

    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_53

    :cond_3c
    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p2, p0, Lu7/a$e$a;->q:LI8/g;

    check-cast p1, Lh8/A;

    iget-object p0, p0, Lu7/a$e$a;->r:Lu7/a;

    iput-object p2, v0, Lu7/a$e$a$a;->s:Ljava/lang/Object;

    iput v4, v0, Lu7/a$e$a$a;->r:I

    invoke-static {p0, v0}, Lu7/a;->d(Lu7/a;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_50

    goto :goto_5e

    :cond_50
    move-object v5, p2

    move-object p2, p0

    move-object p0, v5

    :goto_53
    const/4 p1, 0x0

    iput-object p1, v0, Lu7/a$e$a$a;->s:Ljava/lang/Object;

    iput v3, v0, Lu7/a$e$a$a;->r:I

    invoke-interface {p0, p2, v0}, LI8/g;->b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_5f

    :goto_5e
    return-object v1

    :cond_5f
    :goto_5f
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
