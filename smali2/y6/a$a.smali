.class final Ly6/a$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly6/a;->b(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field private synthetic r:Ljava/lang/Object;

.field final synthetic s:Lh3/W;

.field final synthetic t:LK1/a;

.field final synthetic u:Landroid/content/Context;

.field final synthetic v:J


# direct methods
.method constructor <init>(Lh3/W;LK1/a;Landroid/content/Context;JLm8/e;)V
    .registers 7

    iput-object p1, p0, Ly6/a$a;->s:Lh3/W;

    iput-object p2, p0, Ly6/a$a;->t:LK1/a;

    iput-object p3, p0, Ly6/a$a;->u:Landroid/content/Context;

    iput-wide p4, p0, Ly6/a$a;->v:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 10

    new-instance v0, Ly6/a$a;

    iget-object v1, p0, Ly6/a$a;->s:Lh3/W;

    iget-object v2, p0, Ly6/a$a;->t:LK1/a;

    iget-object v3, p0, Ly6/a$a;->u:Landroid/content/Context;

    iget-wide v4, p0, Ly6/a$a;->v:J

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Ly6/a$a;-><init>(Lh3/W;LK1/a;Landroid/content/Context;JLm8/e;)V

    iput-object p1, v0, Ly6/a$a;->r:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, Ly6/a$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Ly6/a$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Ly6/a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Ly6/a$a;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 9

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    iget v0, p0, Ly6/a$a;->q:I

    if-nez v0, :cond_39

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Ly6/a$a;->r:Ljava/lang/Object;

    move-object v0, p1

    check-cast v0, LF8/L;

    new-instance v3, Ly6/a$a$a;

    iget-object p1, p0, Ly6/a$a;->s:Lh3/W;

    iget-object v1, p0, Ly6/a$a;->t:LK1/a;

    iget-object v2, p0, Ly6/a$a;->u:Landroid/content/Context;

    const/4 v4, 0x0

    invoke-direct {v3, p1, v1, v2, v4}, Ly6/a$a$a;-><init>(Lh3/W;LK1/a;Landroid/content/Context;Lm8/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    new-instance v1, Ly6/a$a$b;

    iget-object v2, p0, Ly6/a$a;->u:Landroid/content/Context;

    iget-object v3, p0, Ly6/a$a;->s:Lh3/W;

    iget-wide v4, p0, Ly6/a$a;->v:J

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v6}, Ly6/a$a$b;-><init>(Landroid/content/Context;Lh3/W;JLm8/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    move-object v3, v1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_39
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
