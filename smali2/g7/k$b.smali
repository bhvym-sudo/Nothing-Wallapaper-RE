.class final Lg7/k$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg7/k;->n1(Lm8/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:Ljava/lang/Object;

.field r:I

.field private synthetic s:Ljava/lang/Object;

.field final synthetic t:Lg7/k;


# direct methods
.method constructor <init>(Lg7/k;Lm8/e;)V
    .registers 3

    iput-object p1, p0, Lg7/k$b;->t:Lg7/k;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 4

    new-instance v0, Lg7/k$b;

    iget-object p0, p0, Lg7/k$b;->t:Lg7/k;

    invoke-direct {v0, p0, p2}, Lg7/k$b;-><init>(Lg7/k;Lm8/e;)V

    iput-object p1, v0, Lg7/k$b;->s:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, Lg7/k$b;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Lg7/k$b;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Lg7/k$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Lg7/k$b;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 11

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lg7/k$b;->r:I

    const/4 v2, 0x1

    if-eqz v1, :cond_20

    if-ne v1, v2, :cond_18

    iget-object v0, p0, Lg7/k$b;->q:Ljava/lang/Object;

    check-cast v0, Li7/a;

    iget-object v1, p0, Lg7/k$b;->s:Ljava/lang/Object;

    check-cast v1, LF8/L;

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    :goto_16
    move-object v3, v1

    goto :goto_47

    :cond_18
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_20
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lg7/k$b;->s:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, LF8/L;

    iget-object p1, p0, Lg7/k$b;->t:Lg7/k;

    invoke-static {p1}, Lg7/k;->c1(Lg7/k;)Li7/a;

    move-result-object p1

    if-nez p1, :cond_33

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_33
    invoke-virtual {p1}, Lx3/b;->k()LI8/O;

    move-result-object v3

    iput-object v1, p0, Lg7/k$b;->s:Ljava/lang/Object;

    iput-object p1, p0, Lg7/k$b;->q:Ljava/lang/Object;

    iput v2, p0, Lg7/k$b;->r:I

    invoke-static {v3, p0}, LI8/h;->z(LI8/f;Lm8/e;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_44

    return-object v0

    :cond_44
    move-object v0, p1

    move-object p1, v3

    goto :goto_16

    :goto_47
    check-cast p1, Ljava/lang/Boolean;

    const/4 v1, 0x0

    if-eqz p1, :cond_51

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    goto :goto_52

    :cond_51
    move p1, v1

    :goto_52
    iget-object v4, p0, Lg7/k$b;->t:Lg7/k;

    invoke-static {v4}, Lg7/k;->f1(Lg7/k;)Landroidx/viewpager2/widget/ViewPager2;

    move-result-object v4

    if-eqz v4, :cond_5e

    xor-int/2addr p1, v2

    invoke-virtual {v4, p1, v1}, Landroidx/viewpager2/widget/ViewPager2;->setCurrentItem(IZ)V

    :cond_5e
    new-instance v6, Lg7/k$b$a;

    iget-object p0, p0, Lg7/k$b;->t:Lg7/k;

    const/4 p1, 0x0

    invoke-direct {v6, v0, p0, p1}, Lg7/k$b$a;-><init>(Li7/a;Lg7/k;Lm8/e;)V

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
