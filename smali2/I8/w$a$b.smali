.class final LI8/w$a$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI8/w$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LI8/w$a$b$a;
    }
.end annotation


# instance fields
.field q:I

.field synthetic r:Ljava/lang/Object;

.field final synthetic s:LI8/f;

.field final synthetic t:LI8/z;

.field final synthetic u:Ljava/lang/Object;


# direct methods
.method constructor <init>(LI8/f;LI8/z;Ljava/lang/Object;Lm8/e;)V
    .registers 5

    iput-object p1, p0, LI8/w$a$b;->s:LI8/f;

    iput-object p2, p0, LI8/w$a$b;->t:LI8/z;

    iput-object p3, p0, LI8/w$a$b;->u:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 6

    new-instance v0, LI8/w$a$b;

    iget-object v1, p0, LI8/w$a$b;->s:LI8/f;

    iget-object v2, p0, LI8/w$a$b;->t:LI8/z;

    iget-object p0, p0, LI8/w$a$b;->u:Ljava/lang/Object;

    invoke-direct {v0, v1, v2, p0, p2}, LI8/w$a$b;-><init>(LI8/f;LI8/z;Ljava/lang/Object;Lm8/e;)V

    iput-object p1, v0, LI8/w$a$b;->r:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, LI8/I;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LI8/w$a$b;->s(LI8/I;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 5

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LI8/w$a$b;->q:I

    const/4 v2, 0x1

    if-eqz v1, :cond_17

    if-ne v1, v2, :cond_f

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_57

    :cond_f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_17
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LI8/w$a$b;->r:Ljava/lang/Object;

    check-cast p1, LI8/I;

    sget-object v1, LI8/w$a$b$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v1, p1

    if-eq p1, v2, :cond_4a

    const/4 v0, 0x2

    if-eq p1, v0, :cond_57

    const/4 v0, 0x3

    if-ne p1, v0, :cond_44

    iget-object p1, p0, LI8/w$a$b;->u:Ljava/lang/Object;

    sget-object v0, LI8/G;->a:LK8/D;

    if-ne p1, v0, :cond_3a

    iget-object p0, p0, LI8/w$a$b;->t:LI8/z;

    invoke-interface {p0}, LI8/z;->g()V

    goto :goto_57

    :cond_3a
    iget-object p0, p0, LI8/w$a$b;->t:LI8/z;

    invoke-interface {p0, p1}, LI8/z;->h(Ljava/lang/Object;)Z

    move-result p0

    invoke-static {p0}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    goto :goto_57

    :cond_44
    new-instance p0, Lh8/m;

    invoke-direct {p0}, Lh8/m;-><init>()V

    throw p0

    :cond_4a
    iget-object p1, p0, LI8/w$a$b;->s:LI8/f;

    iget-object v1, p0, LI8/w$a$b;->t:LI8/z;

    iput v2, p0, LI8/w$a$b;->q:I

    invoke-interface {p1, v1, p0}, LI8/f;->a(LI8/g;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_57

    return-object v0

    :cond_57
    :goto_57
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public final s(LI8/I;Lm8/e;)Ljava/lang/Object;
    .registers 3

    invoke-virtual {p0, p1, p2}, LI8/w$a$b;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LI8/w$a$b;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LI8/w$a$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
