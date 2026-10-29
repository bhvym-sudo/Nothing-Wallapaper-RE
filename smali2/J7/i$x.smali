.class final LJ7/i$x;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/s;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ7/i;-><init>(LU5/a;LB7/a;Lh3/c;Landroidx/lifecycle/Q;Landroid/content/Context;LM1/b;LF8/I;LS1/a;Landroid/content/res/Resources;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field synthetic r:Ljava/lang/Object;

.field synthetic s:Ljava/lang/Object;

.field synthetic t:Ljava/lang/Object;

.field synthetic u:Ljava/lang/Object;

.field final synthetic v:LJ7/i;


# direct methods
.method constructor <init>(LJ7/i;Lm8/e;)V
    .registers 3

    iput-object p1, p0, LJ7/i$x;->v:LJ7/i;

    const/4 p1, 0x5

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 5

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    iget v0, p0, LJ7/i$x;->q:I

    if-nez v0, :cond_28

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LJ7/i$x;->r:Ljava/lang/Object;

    check-cast p1, LA7/g;

    iget-object v0, p0, LJ7/i$x;->s:Ljava/lang/Object;

    check-cast v0, LA7/g;

    iget-object v1, p0, LJ7/i$x;->t:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, LJ7/i$x;->u:Ljava/lang/Object;

    check-cast v2, Ljava/util/Set;

    iget-object p0, p0, LJ7/i$x;->v:LJ7/i;

    invoke-static {p0, v1, v2}, LJ7/i;->z(LJ7/i;Ljava/lang/String;Ljava/util/Set;)Z

    move-result p0

    if-eqz p0, :cond_26

    if-nez v0, :cond_25

    return-object p1

    :cond_25
    return-object v0

    :cond_26
    const/4 p0, 0x0

    return-object p0

    :cond_28
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public bridge synthetic n(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 6

    check-cast p1, LA7/g;

    check-cast p2, LA7/g;

    check-cast p3, Ljava/lang/String;

    check-cast p4, Ljava/util/Set;

    check-cast p5, Lm8/e;

    invoke-virtual/range {p0 .. p5}, LJ7/i$x;->s(LA7/g;LA7/g;Ljava/lang/String;Ljava/util/Set;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final s(LA7/g;LA7/g;Ljava/lang/String;Ljava/util/Set;Lm8/e;)Ljava/lang/Object;
    .registers 7

    new-instance v0, LJ7/i$x;

    iget-object p0, p0, LJ7/i$x;->v:LJ7/i;

    invoke-direct {v0, p0, p5}, LJ7/i$x;-><init>(LJ7/i;Lm8/e;)V

    iput-object p1, v0, LJ7/i$x;->r:Ljava/lang/Object;

    iput-object p2, v0, LJ7/i$x;->s:Ljava/lang/Object;

    iput-object p3, v0, LJ7/i$x;->t:Ljava/lang/Object;

    iput-object p4, v0, LJ7/i$x;->u:Ljava/lang/Object;

    sget-object p0, Lh8/A;->a:Lh8/A;

    invoke-virtual {v0, p0}, LJ7/i$x;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
