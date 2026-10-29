.class final LM7/c$a$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM7/c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field private synthetic r:Ljava/lang/Object;

.field final synthetic s:LI8/f;

.field final synthetic t:Landroid/widget/LinearLayout;

.field final synthetic u:Landroid/content/Context;

.field final synthetic v:Lw7/a;


# direct methods
.method constructor <init>(LI8/f;Landroid/widget/LinearLayout;Landroid/content/Context;Lw7/a;Lm8/e;)V
    .registers 6

    iput-object p1, p0, LM7/c$a$a;->s:LI8/f;

    iput-object p2, p0, LM7/c$a$a;->t:Landroid/widget/LinearLayout;

    iput-object p3, p0, LM7/c$a$a;->u:Landroid/content/Context;

    iput-object p4, p0, LM7/c$a$a;->v:Lw7/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 9

    new-instance v0, LM7/c$a$a;

    iget-object v1, p0, LM7/c$a$a;->s:LI8/f;

    iget-object v2, p0, LM7/c$a$a;->t:Landroid/widget/LinearLayout;

    iget-object v3, p0, LM7/c$a$a;->u:Landroid/content/Context;

    iget-object v4, p0, LM7/c$a$a;->v:Lw7/a;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, LM7/c$a$a;-><init>(LI8/f;Landroid/widget/LinearLayout;Landroid/content/Context;Lw7/a;Lm8/e;)V

    iput-object p1, v0, LM7/c$a$a;->r:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, LM7/c$a$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LM7/c$a$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LM7/c$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LM7/c$a$a;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 9

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    iget v0, p0, LM7/c$a$a;->q:I

    if-nez v0, :cond_28

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LM7/c$a$a;->r:Ljava/lang/Object;

    move-object v0, p1

    check-cast v0, LF8/L;

    new-instance v1, LM7/c$a$a$a;

    iget-object v2, p0, LM7/c$a$a;->s:LI8/f;

    iget-object v3, p0, LM7/c$a$a;->t:Landroid/widget/LinearLayout;

    iget-object v4, p0, LM7/c$a$a;->u:Landroid/content/Context;

    iget-object v5, p0, LM7/c$a$a;->v:Lw7/a;

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v6}, LM7/c$a$a$a;-><init>(LI8/f;Landroid/widget/LinearLayout;Landroid/content/Context;Lw7/a;Lm8/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    move-object v3, v1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_28
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
