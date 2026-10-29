.class final Ld7/l$a$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld7/l$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field private synthetic r:Ljava/lang/Object;

.field final synthetic s:Lx3/b;

.field final synthetic t:Li7/d;

.field final synthetic u:Landroid/view/MenuItem;


# direct methods
.method constructor <init>(Lx3/b;Li7/d;Landroid/view/MenuItem;Lm8/e;)V
    .registers 5

    iput-object p1, p0, Ld7/l$a$a;->s:Lx3/b;

    iput-object p2, p0, Ld7/l$a$a;->t:Li7/d;

    iput-object p3, p0, Ld7/l$a$a;->u:Landroid/view/MenuItem;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 6

    new-instance v0, Ld7/l$a$a;

    iget-object v1, p0, Ld7/l$a$a;->s:Lx3/b;

    iget-object v2, p0, Ld7/l$a$a;->t:Li7/d;

    iget-object p0, p0, Ld7/l$a$a;->u:Landroid/view/MenuItem;

    invoke-direct {v0, v1, v2, p0, p2}, Ld7/l$a$a;-><init>(Lx3/b;Li7/d;Landroid/view/MenuItem;Lm8/e;)V

    iput-object p1, v0, Ld7/l$a$a;->r:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, Ld7/l$a$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Ld7/l$a$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Ld7/l$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Ld7/l$a$a;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 8

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    iget v0, p0, Ld7/l$a$a;->q:I

    if-nez v0, :cond_24

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Ld7/l$a$a;->r:Ljava/lang/Object;

    move-object v0, p1

    check-cast v0, LF8/L;

    new-instance v3, Ld7/l$a$a$a;

    iget-object p1, p0, Ld7/l$a$a;->s:Lx3/b;

    iget-object v1, p0, Ld7/l$a$a;->t:Li7/d;

    iget-object p0, p0, Ld7/l$a$a;->u:Landroid/view/MenuItem;

    const/4 v2, 0x0

    invoke-direct {v3, p1, v1, p0, v2}, Ld7/l$a$a$a;-><init>(Lx3/b;Li7/d;Landroid/view/MenuItem;Lm8/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    invoke-static/range {v0 .. v5}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_24
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
