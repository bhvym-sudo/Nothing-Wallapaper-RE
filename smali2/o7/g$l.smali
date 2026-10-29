.class final Lo7/g$l;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo7/g;->t0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:Lo7/g;


# direct methods
.method constructor <init>(Lo7/g;Lm8/e;)V
    .registers 3

    iput-object p1, p0, Lo7/g$l;->r:Lo7/g;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 3

    new-instance p1, Lo7/g$l;

    iget-object p0, p0, Lo7/g$l;->r:Lo7/g;

    invoke-direct {p1, p0, p2}, Lo7/g$l;-><init>(Lo7/g;Lm8/e;)V

    return-object p1
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, Lo7/g$l;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Lo7/g$l;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Lo7/g$l;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Lo7/g$l;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 5

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lo7/g$l;->q:I

    const/4 v2, 0x1

    if-eqz v1, :cond_17

    if-ne v1, v2, :cond_f

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_29

    :cond_f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_17
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lo7/g$l;->r:Lo7/g;

    invoke-virtual {p1}, Lo7/g;->a0()LI8/f;

    move-result-object p1

    iput v2, p0, Lo7/g$l;->q:I

    invoke-static {p1, p0}, LI8/h;->x(LI8/f;Lm8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_29

    return-object v0

    :cond_29
    :goto_29
    iget-object p1, p0, Lo7/g$l;->r:Lo7/g;

    invoke-static {p1}, Lo7/g;->I(Lo7/g;)Lq6/b;

    move-result-object p1

    const-string v0, "previewEnable now."

    invoke-virtual {p1, v0}, Lq6/b;->a(Ljava/lang/String;)V

    iget-object p1, p0, Lo7/g$l;->r:Lo7/g;

    invoke-virtual {p1}, Lo7/b;->i()Landroidx/lifecycle/H;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/lifecycle/C;->e()Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lm7/a$a;->a:Lm7/a$a;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_49

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_49
    iget-object p0, p0, Lo7/g$l;->r:Lo7/g;

    invoke-virtual {p0}, Lo7/b;->i()Landroidx/lifecycle/H;

    move-result-object p0

    sget-object p1, Lm7/a$c;->a:Lm7/a$c;

    invoke-virtual {p0, p1}, Landroidx/lifecycle/H;->l(Ljava/lang/Object;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
