.class final LI8/M$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI8/M$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic q:Lkotlin/jvm/internal/A;

.field final synthetic r:LI8/g;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/A;LI8/g;)V
    .registers 3

    iput-object p1, p0, LI8/M$a$a;->q:Lkotlin/jvm/internal/A;

    iput-object p2, p0, LI8/M$a$a;->r:LI8/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(ILm8/e;)Ljava/lang/Object;
    .registers 7

    instance-of v0, p2, LI8/M$a$a$a;

    if-eqz v0, :cond_13

    move-object v0, p2

    check-cast v0, LI8/M$a$a$a;

    iget v1, v0, LI8/M$a$a$a;->s:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_13

    sub-int/2addr v1, v2

    iput v1, v0, LI8/M$a$a$a;->s:I

    goto :goto_18

    :cond_13
    new-instance v0, LI8/M$a$a$a;

    invoke-direct {v0, p0, p2}, LI8/M$a$a$a;-><init>(LI8/M$a$a;Lm8/e;)V

    :goto_18
    iget-object p2, v0, LI8/M$a$a$a;->q:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LI8/M$a$a$a;->s:I

    const/4 v3, 0x1

    if-eqz v2, :cond_31

    if-ne v2, v3, :cond_29

    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_4b

    :cond_29
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_31
    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    if-lez p1, :cond_4e

    iget-object p1, p0, LI8/M$a$a;->q:Lkotlin/jvm/internal/A;

    iget-boolean p2, p1, Lkotlin/jvm/internal/A;->q:Z

    if-nez p2, :cond_4e

    iput-boolean v3, p1, Lkotlin/jvm/internal/A;->q:Z

    iget-object p0, p0, LI8/M$a$a;->r:LI8/g;

    sget-object p1, LI8/I;->q:LI8/I;

    iput v3, v0, LI8/M$a$a$a;->s:I

    invoke-interface {p0, p1, v0}, LI8/g;->b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_4b

    return-object v1

    :cond_4b
    :goto_4b
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_4e
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public bridge synthetic b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1, p2}, LI8/M$a$a;->a(ILm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
