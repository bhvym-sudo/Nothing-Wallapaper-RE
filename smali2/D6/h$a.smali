.class final LD6/h$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD6/h;-><init>(LF8/L;JLv8/p;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:LD6/h;

.field final synthetic s:J


# direct methods
.method constructor <init>(LD6/h;JLm8/e;)V
    .registers 5

    iput-object p1, p0, LD6/h$a;->r:LD6/h;

    iput-wide p2, p0, LD6/h$a;->s:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 6

    new-instance p1, LD6/h$a;

    iget-object v0, p0, LD6/h$a;->r:LD6/h;

    iget-wide v1, p0, LD6/h$a;->s:J

    invoke-direct {p1, v0, v1, v2, p2}, LD6/h$a;-><init>(LD6/h;JLm8/e;)V

    return-object p1
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, LD6/h$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LD6/h$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LD6/h$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LD6/h$a;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 9

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LD6/h$a;->q:I

    const/4 v2, 0x1

    if-eqz v1, :cond_17

    if-ne v1, v2, :cond_f

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_33

    :cond_f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_17
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LD6/h$a;->r:LD6/h;

    invoke-static {p1}, LD6/h;->a(LD6/h;)LI8/z;

    move-result-object p1

    new-instance v1, LD6/h$a$a;

    iget-wide v3, p0, LD6/h$a;->s:J

    iget-object v5, p0, LD6/h$a;->r:LD6/h;

    const/4 v6, 0x0

    invoke-direct {v1, v3, v4, v5, v6}, LD6/h$a$a;-><init>(JLD6/h;Lm8/e;)V

    iput v2, p0, LD6/h$a;->q:I

    invoke-static {p1, v1, p0}, LI8/h;->i(LI8/f;Lv8/p;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_33

    return-object v0

    :cond_33
    :goto_33
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
