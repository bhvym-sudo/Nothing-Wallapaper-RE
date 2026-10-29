.class public final LI8/s$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI8/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI8/s;->a(LI8/f;Lv8/q;)LI8/f;
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

    iput-object p1, p0, LI8/s$a;->q:LI8/f;

    iput-object p2, p0, LI8/s$a;->r:Lv8/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LI8/g;Lm8/e;)Ljava/lang/Object;
    .registers 8

    instance-of v0, p2, LI8/s$a$a;

    if-eqz v0, :cond_13

    move-object v0, p2

    check-cast v0, LI8/s$a$a;

    iget v1, v0, LI8/s$a$a;->r:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_13

    sub-int/2addr v1, v2

    iput v1, v0, LI8/s$a$a;->r:I

    goto :goto_18

    :cond_13
    new-instance v0, LI8/s$a$a;

    invoke-direct {v0, p0, p2}, LI8/s$a$a;-><init>(LI8/s$a;Lm8/e;)V

    :goto_18
    iget-object p2, v0, LI8/s$a$a;->q:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LI8/s$a$a;->r:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_41

    if-eq v2, v4, :cond_34

    if-ne v2, v3, :cond_2c

    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_6f

    :cond_2c
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_34
    iget-object p0, v0, LI8/s$a$a;->u:Ljava/lang/Object;

    move-object p1, p0

    check-cast p1, LI8/g;

    iget-object p0, v0, LI8/s$a$a;->t:Ljava/lang/Object;

    check-cast p0, LI8/s$a;

    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_53

    :cond_41
    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p2, p0, LI8/s$a;->q:LI8/f;

    iput-object p0, v0, LI8/s$a$a;->t:Ljava/lang/Object;

    iput-object p1, v0, LI8/s$a$a;->u:Ljava/lang/Object;

    iput v4, v0, LI8/s$a$a;->r:I

    invoke-static {p2, p1, v0}, LI8/h;->g(LI8/f;LI8/g;Lm8/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_53

    goto :goto_6e

    :cond_53
    :goto_53
    check-cast p2, Ljava/lang/Throwable;

    if-eqz p2, :cond_6f

    iget-object p0, p0, LI8/s$a;->r:Lv8/q;

    const/4 v2, 0x0

    iput-object v2, v0, LI8/s$a$a;->t:Ljava/lang/Object;

    iput-object v2, v0, LI8/s$a$a;->u:Ljava/lang/Object;

    iput v3, v0, LI8/s$a$a;->r:I

    const/4 v2, 0x6

    invoke-static {v2}, Lkotlin/jvm/internal/m;->a(I)V

    invoke-interface {p0, p1, p2, v0}, Lv8/q;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    const/4 p1, 0x7

    invoke-static {p1}, Lkotlin/jvm/internal/m;->a(I)V

    if-ne p0, v1, :cond_6f

    :goto_6e
    return-object v1

    :cond_6f
    :goto_6f
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
