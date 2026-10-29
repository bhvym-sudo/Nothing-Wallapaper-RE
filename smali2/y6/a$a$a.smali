.class final Ly6/a$a$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly6/a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:Lh3/W;

.field final synthetic s:LK1/a;

.field final synthetic t:Landroid/content/Context;


# direct methods
.method constructor <init>(Lh3/W;LK1/a;Landroid/content/Context;Lm8/e;)V
    .registers 5

    iput-object p1, p0, Ly6/a$a$a;->r:Lh3/W;

    iput-object p2, p0, Ly6/a$a$a;->s:LK1/a;

    iput-object p3, p0, Ly6/a$a$a;->t:Landroid/content/Context;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 5

    new-instance p1, Ly6/a$a$a;

    iget-object v0, p0, Ly6/a$a$a;->r:Lh3/W;

    iget-object v1, p0, Ly6/a$a$a;->s:LK1/a;

    iget-object p0, p0, Ly6/a$a$a;->t:Landroid/content/Context;

    invoke-direct {p1, v0, v1, p0, p2}, Ly6/a$a$a;-><init>(Lh3/W;LK1/a;Landroid/content/Context;Lm8/e;)V

    return-object p1
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, Ly6/a$a$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Ly6/a$a$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Ly6/a$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Ly6/a$a$a;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 6

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    iget v0, p0, Ly6/a$a$a;->q:I

    if-nez v0, :cond_a7

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    invoke-static {}, Ly6/a;->a()Lq6/b;

    move-result-object p1

    const-string v0, "runCleanTask start clean effect lru dirty files"

    invoke-virtual {p1, v0}, Lq6/b;->a(Ljava/lang/String;)V

    sget-object p1, LC6/g;->e:LC6/g$a;

    iget-object v0, p0, Ly6/a$a$a;->r:Lh3/W;

    invoke-interface {v0}, Lh3/W;->X()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, LC6/g$a;->a(Ljava/lang/String;)LC6/g;

    move-result-object v0

    iget-object v1, p0, Ly6/a$a$a;->r:Lh3/W;

    invoke-interface {v1}, Lh3/W;->R()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, LC6/g$a;->a(Ljava/lang/String;)LC6/g;

    move-result-object v1

    iget-object v2, p0, Ly6/a$a$a;->r:Lh3/W;

    invoke-interface {v2}, Lh3/W;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, LC6/g$a;->a(Ljava/lang/String;)LC6/g;

    move-result-object v2

    iget-object v3, p0, Ly6/a$a$a;->r:Lh3/W;

    invoke-interface {v3}, Lh3/W;->N()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, LC6/g$a;->a(Ljava/lang/String;)LC6/g;

    move-result-object p1

    const/4 v3, 0x0

    if-eqz v0, :cond_45

    invoke-virtual {v0}, LC6/g;->d()Ljava/lang/String;

    move-result-object v0

    goto :goto_46

    :cond_45
    move-object v0, v3

    :goto_46
    if-eqz v1, :cond_4d

    invoke-virtual {v1}, LC6/g;->d()Ljava/lang/String;

    move-result-object v1

    goto :goto_4e

    :cond_4d
    move-object v1, v3

    :goto_4e
    if-eqz v2, :cond_55

    invoke-virtual {v2}, LC6/g;->d()Ljava/lang/String;

    move-result-object v2

    goto :goto_56

    :cond_55
    move-object v2, v3

    :goto_56
    if-eqz p1, :cond_5c

    invoke-virtual {p1}, LC6/g;->d()Ljava/lang/String;

    move-result-object v3

    :cond_5c
    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Li8/s;->n([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Ly6/a$a$a;->s:LK1/a;

    iget-object p0, p0, Ly6/a$a$a;->t:Landroid/content/Context;

    invoke-interface {v0, p0}, LK1/a;->o(Landroid/content/Context;)Lx6/q;

    move-result-object p0

    invoke-interface {p0}, Lx6/r;->getCount()I

    move-result v0

    move-object v1, p1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Li8/s;->P(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    invoke-interface {p0, v1}, Lx6/r;->V(Ljava/util/List;)V

    invoke-static {}, Ly6/a;->a()Lq6/b;

    move-result-object v1

    invoke-interface {p0}, Lx6/r;->getCount()I

    move-result p0

    sub-int/2addr v0, p0

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "runCleanTask clean effect lru exclusion:"

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", clean "

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " files"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Lq6/b;->a(Ljava/lang/String;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_a7
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
