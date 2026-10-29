.class final LI8/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI8/d;->a(LI8/g;Lm8/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic q:LI8/d;

.field final synthetic r:Lkotlin/jvm/internal/E;

.field final synthetic s:LI8/g;


# direct methods
.method constructor <init>(LI8/d;Lkotlin/jvm/internal/E;LI8/g;)V
    .registers 4

    iput-object p1, p0, LI8/d$a;->q:LI8/d;

    iput-object p2, p0, LI8/d$a;->r:Lkotlin/jvm/internal/E;

    iput-object p3, p0, LI8/d$a;->s:LI8/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
    .registers 8

    instance-of v0, p2, LI8/d$a$a;

    if-eqz v0, :cond_13

    move-object v0, p2

    check-cast v0, LI8/d$a$a;

    iget v1, v0, LI8/d$a$a;->s:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_13

    sub-int/2addr v1, v2

    iput v1, v0, LI8/d$a$a;->s:I

    goto :goto_18

    :cond_13
    new-instance v0, LI8/d$a$a;

    invoke-direct {v0, p0, p2}, LI8/d$a$a;-><init>(LI8/d$a;Lm8/e;)V

    :goto_18
    iget-object p2, v0, LI8/d$a$a;->q:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LI8/d$a$a;->s:I

    const/4 v3, 0x1

    if-eqz v2, :cond_31

    if-ne v2, v3, :cond_29

    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_67

    :cond_29
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_31
    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p2, p0, LI8/d$a;->q:LI8/d;

    iget-object p2, p2, LI8/d;->r:Lv8/l;

    invoke-interface {p2, p1}, Lv8/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    iget-object v2, p0, LI8/d$a;->r:Lkotlin/jvm/internal/E;

    iget-object v2, v2, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    sget-object v4, LJ8/t;->a:LK8/D;

    if-eq v2, v4, :cond_58

    iget-object v4, p0, LI8/d$a;->q:LI8/d;

    iget-object v4, v4, LI8/d;->s:Lv8/p;

    invoke-interface {v4, v2, p2}, Lv8/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_55

    goto :goto_58

    :cond_55
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_58
    :goto_58
    iget-object v2, p0, LI8/d$a;->r:Lkotlin/jvm/internal/E;

    iput-object p2, v2, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    iget-object p0, p0, LI8/d$a;->s:LI8/g;

    iput v3, v0, LI8/d$a$a;->s:I

    invoke-interface {p0, p1, v0}, LI8/g;->b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_67

    return-object v1

    :cond_67
    :goto_67
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
