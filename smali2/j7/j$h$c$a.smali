.class final Lj7/j$h$c$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj7/j$h$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field synthetic r:Ljava/lang/Object;

.field final synthetic s:Lj7/j;

.field final synthetic t:LF8/L;


# direct methods
.method constructor <init>(Lj7/j;LF8/L;Lm8/e;)V
    .registers 4

    iput-object p1, p0, Lj7/j$h$c$a;->s:Lj7/j;

    iput-object p2, p0, Lj7/j$h$c$a;->t:LF8/L;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 5

    new-instance v0, Lj7/j$h$c$a;

    iget-object v1, p0, Lj7/j$h$c$a;->s:Lj7/j;

    iget-object p0, p0, Lj7/j$h$c$a;->t:LF8/L;

    invoke-direct {v0, v1, p0, p2}, Lj7/j$h$c$a;-><init>(Lj7/j;LF8/L;Lm8/e;)V

    iput-object p1, v0, Lj7/j$h$c$a;->r:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Ljava/util/List;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Lj7/j$h$c$a;->s(Ljava/util/List;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 7

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    iget v0, p0, Lj7/j$h$c$a;->q:I

    if-nez v0, :cond_ce

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lj7/j$h$c$a;->r:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    iget-object v0, p0, Lj7/j$h$c$a;->s:Lj7/j;

    invoke-virtual {v0}, Lj7/j;->g0()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_54

    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_34

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, LC6/b;

    invoke-virtual {v3}, LC6/b;->c()LC6/a;

    move-result-object v3

    sget-object v4, LC6/a;->s:LC6/a;

    if-ne v3, v4, :cond_1e

    goto :goto_35

    :cond_34
    move-object v2, v1

    :goto_35
    check-cast v2, LC6/b;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "received Depth cropped bitmap:"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v3, "EditWallpaperViewModel"

    invoke-static {v3, v0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v2, :cond_54

    iget-object v0, p0, Lj7/j$h$c$a;->s:Lj7/j;

    invoke-static {v0, v2}, Lj7/j;->F(Lj7/j;LC6/b;)V

    :cond_54
    iget-object v0, p0, Lj7/j$h$c$a;->s:Lj7/j;

    invoke-static {v0}, Lj7/j;->J(Lj7/j;)Z

    move-result v0

    if-eqz v0, :cond_cb

    iget-object v0, p0, Lj7/j$h$c$a;->s:Lj7/j;

    invoke-static {v0}, Lj7/j;->K(Lj7/j;)Z

    move-result v0

    if-eqz v0, :cond_cb

    iget-object v0, p0, Lj7/j$h$c$a;->s:Lj7/j;

    invoke-static {v0}, Lj7/j;->B(Lj7/j;)LD6/g;

    move-result-object v0

    if-eqz v0, :cond_cb

    iget-object v0, p0, Lj7/j$h$c$a;->s:Lj7/j;

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_74
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, LC6/b;

    invoke-virtual {v3}, LC6/b;->c()LC6/a;

    move-result-object v3

    sget-object v4, LC6/a;->q:LC6/a;

    if-ne v3, v4, :cond_74

    move-object v1, v2

    :cond_8a
    check-cast v1, LC6/b;

    if-nez v1, :cond_9c

    iget-object p0, p0, Lj7/j$h$c$a;->s:Lj7/j;

    invoke-static {p0}, Lj7/j;->x(Lj7/j;)Lq6/b;

    move-result-object p0

    const-string p1, "didn\'t received Setter cropped bitmap"

    invoke-virtual {p0, p1}, Lq6/b;->e(Ljava/lang/String;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_9c
    invoke-static {v0, v1}, Lj7/j;->U(Lj7/j;LC6/b;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, p0, Lj7/j$h$c$a;->s:Lj7/j;

    invoke-virtual {v0}, Lj7/j;->l0()Lp7/a;

    move-result-object v0

    sget-object v1, Lp7/a$b;->b:Lp7/a$b;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b7

    sget-object v0, LC6/e$b;->c:LC6/e$b;

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_b7
    iget-object v0, p0, Lj7/j$h$c$a;->s:Lj7/j;

    invoke-static {v0}, Lj7/j;->B(Lj7/j;)LD6/g;

    move-result-object v0

    if-eqz v0, :cond_cb

    iget-object p0, p0, Lj7/j$h$c$a;->s:Lj7/j;

    invoke-static {p0}, Lj7/j;->y(Lj7/j;)LC6/b;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-interface {v0, p0, p1}, LD6/g;->E(LC6/b;Ljava/util/List;)V

    :cond_cb
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_ce
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final s(Ljava/util/List;Lm8/e;)Ljava/lang/Object;
    .registers 3

    invoke-virtual {p0, p1, p2}, Lj7/j$h$c$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Lj7/j$h$c$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Lj7/j$h$c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
