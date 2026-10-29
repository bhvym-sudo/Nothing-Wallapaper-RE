.class final LI8/b;
.super LI8/c;
.source "SourceFile"


# instance fields
.field private final u:Lv8/p;


# direct methods
.method public constructor <init>(Lv8/p;Lm8/i;ILH8/a;)V
    .registers 5

    .line 4
    invoke-direct {p0, p1, p2, p3, p4}, LI8/c;-><init>(Lv8/p;Lm8/i;ILH8/a;)V

    .line 5
    iput-object p1, p0, LI8/b;->u:Lv8/p;

    return-void
.end method

.method public synthetic constructor <init>(Lv8/p;Lm8/i;ILH8/a;ILkotlin/jvm/internal/h;)V
    .registers 7

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_6

    .line 1
    sget-object p2, Lm8/j;->q:Lm8/j;

    :cond_6
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_b

    const/4 p3, -0x2

    :cond_b
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_11

    .line 2
    sget-object p4, LH8/a;->q:LH8/a;

    .line 3
    :cond_11
    invoke-direct {p0, p1, p2, p3, p4}, LI8/b;-><init>(Lv8/p;Lm8/i;ILH8/a;)V

    return-void
.end method


# virtual methods
.method protected j(LH8/t;Lm8/e;)Ljava/lang/Object;
    .registers 7

    instance-of v0, p2, LI8/b$a;

    if-eqz v0, :cond_13

    move-object v0, p2

    check-cast v0, LI8/b$a;

    iget v1, v0, LI8/b$a;->t:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_13

    sub-int/2addr v1, v2

    iput v1, v0, LI8/b$a;->t:I

    goto :goto_18

    :cond_13
    new-instance v0, LI8/b$a;

    invoke-direct {v0, p0, p2}, LI8/b$a;-><init>(LI8/b;Lm8/e;)V

    :goto_18
    iget-object p2, v0, LI8/b$a;->r:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LI8/b$a;->t:I

    const/4 v3, 0x1

    if-eqz v2, :cond_36

    if-ne v2, v3, :cond_2e

    iget-object p0, v0, LI8/b$a;->q:Ljava/lang/Object;

    move-object p1, p0

    check-cast p1, LH8/t;

    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_44

    :cond_2e
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_36
    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    iput-object p1, v0, LI8/b$a;->q:Ljava/lang/Object;

    iput v3, v0, LI8/b$a;->t:I

    invoke-super {p0, p1, v0}, LI8/c;->j(LH8/t;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_44

    return-object v1

    :cond_44
    :goto_44
    invoke-interface {p1}, LH8/w;->s()Z

    move-result p0

    if-eqz p0, :cond_4d

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_4d
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "\'awaitClose { yourCallbackOrListener.cancel() }\' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method protected k(Lm8/i;ILH8/a;)LJ8/e;
    .registers 5

    new-instance v0, LI8/b;

    iget-object p0, p0, LI8/b;->u:Lv8/p;

    invoke-direct {v0, p0, p1, p2, p3}, LI8/b;-><init>(Lv8/p;Lm8/i;ILH8/a;)V

    return-object v0
.end method
