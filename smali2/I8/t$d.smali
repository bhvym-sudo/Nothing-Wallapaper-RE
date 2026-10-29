.class final LI8/t$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI8/t;->b(LI8/f;Lv8/p;)LI8/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic q:Lkotlin/jvm/internal/A;

.field final synthetic r:LI8/g;

.field final synthetic s:Lv8/p;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/A;LI8/g;Lv8/p;)V
    .registers 4

    iput-object p1, p0, LI8/t$d;->q:Lkotlin/jvm/internal/A;

    iput-object p2, p0, LI8/t$d;->r:LI8/g;

    iput-object p3, p0, LI8/t$d;->s:Lv8/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
    .registers 9

    instance-of v0, p2, LI8/t$d$a;

    if-eqz v0, :cond_13

    move-object v0, p2

    check-cast v0, LI8/t$d$a;

    iget v1, v0, LI8/t$d$a;->u:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_13

    sub-int/2addr v1, v2

    iput v1, v0, LI8/t$d$a;->u:I

    goto :goto_18

    :cond_13
    new-instance v0, LI8/t$d$a;

    invoke-direct {v0, p0, p2}, LI8/t$d$a;-><init>(LI8/t$d;Lm8/e;)V

    :goto_18
    iget-object p2, v0, LI8/t$d$a;->s:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LI8/t$d$a;->u:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_45

    if-eq v2, v5, :cond_41

    if-eq v2, v4, :cond_37

    if-ne v2, v3, :cond_2f

    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_87

    :cond_2f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_37
    iget-object p1, v0, LI8/t$d$a;->r:Ljava/lang/Object;

    iget-object p0, v0, LI8/t$d$a;->q:Ljava/lang/Object;

    check-cast p0, LI8/t$d;

    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_6b

    :cond_41
    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_59

    :cond_45
    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p2, p0, LI8/t$d;->q:Lkotlin/jvm/internal/A;

    iget-boolean p2, p2, Lkotlin/jvm/internal/A;->q:Z

    if-eqz p2, :cond_5c

    iget-object p0, p0, LI8/t$d;->r:LI8/g;

    iput v5, v0, LI8/t$d$a;->u:I

    invoke-interface {p0, p1, v0}, LI8/g;->b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_59

    goto :goto_86

    :cond_59
    :goto_59
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_5c
    iget-object p2, p0, LI8/t$d;->s:Lv8/p;

    iput-object p0, v0, LI8/t$d$a;->q:Ljava/lang/Object;

    iput-object p1, v0, LI8/t$d$a;->r:Ljava/lang/Object;

    iput v4, v0, LI8/t$d$a;->u:I

    invoke-interface {p2, p1, v0}, Lv8/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_6b

    goto :goto_86

    :cond_6b
    :goto_6b
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-nez p2, :cond_8a

    iget-object p2, p0, LI8/t$d;->q:Lkotlin/jvm/internal/A;

    iput-boolean v5, p2, Lkotlin/jvm/internal/A;->q:Z

    iget-object p0, p0, LI8/t$d;->r:LI8/g;

    const/4 p2, 0x0

    iput-object p2, v0, LI8/t$d$a;->q:Ljava/lang/Object;

    iput-object p2, v0, LI8/t$d$a;->r:Ljava/lang/Object;

    iput v3, v0, LI8/t$d$a;->u:I

    invoke-interface {p0, p1, v0}, LI8/g;->b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_87

    :goto_86
    return-object v1

    :cond_87
    :goto_87
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_8a
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
