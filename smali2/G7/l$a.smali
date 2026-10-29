.class final LG7/l$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG7/l;->h(LF8/L;LJ7/i;LI8/f;LI8/f;[Ljava/lang/Object;[Lh8/o;Lv8/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:LI8/f;

.field final synthetic s:LI8/f;

.field final synthetic t:[Lh8/o;

.field final synthetic u:[Ljava/lang/Object;

.field final synthetic v:LJ7/i;

.field final synthetic w:Lv8/l;


# direct methods
.method constructor <init>(LI8/f;LI8/f;[Lh8/o;[Ljava/lang/Object;LJ7/i;Lv8/l;Lm8/e;)V
    .registers 8

    iput-object p1, p0, LG7/l$a;->r:LI8/f;

    iput-object p2, p0, LG7/l$a;->s:LI8/f;

    iput-object p3, p0, LG7/l$a;->t:[Lh8/o;

    iput-object p4, p0, LG7/l$a;->u:[Ljava/lang/Object;

    iput-object p5, p0, LG7/l$a;->v:LJ7/i;

    iput-object p6, p0, LG7/l$a;->w:Lv8/l;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method

.method public static final synthetic s(Ljava/lang/Object;Ljava/lang/String;Lm8/e;)Ljava/lang/Object;
    .registers 3

    invoke-static {p0, p1, p2}, LG7/l$a;->u(Ljava/lang/Object;Ljava/lang/String;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final synthetic u(Ljava/lang/Object;Ljava/lang/String;Lm8/e;)Ljava/lang/Object;
    .registers 3

    new-instance p2, Lh8/o;

    invoke-direct {p2, p0, p1}, Lh8/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p2
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 11

    new-instance v0, LG7/l$a;

    iget-object v1, p0, LG7/l$a;->r:LI8/f;

    iget-object v2, p0, LG7/l$a;->s:LI8/f;

    iget-object v3, p0, LG7/l$a;->t:[Lh8/o;

    iget-object v4, p0, LG7/l$a;->u:[Ljava/lang/Object;

    iget-object v5, p0, LG7/l$a;->v:LJ7/i;

    iget-object v6, p0, LG7/l$a;->w:Lv8/l;

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, LG7/l$a;-><init>(LI8/f;LI8/f;[Lh8/o;[Ljava/lang/Object;LJ7/i;Lv8/l;Lm8/e;)V

    return-object v0
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, LG7/l$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LG7/l$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LG7/l$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LG7/l$a;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 9

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LG7/l$a;->q:I

    const/4 v2, 0x1

    if-eqz v1, :cond_17

    if-ne v1, v2, :cond_f

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_3a

    :cond_f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_17
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LG7/l$a;->r:LI8/f;

    iget-object v1, p0, LG7/l$a;->s:LI8/f;

    sget-object v3, LG7/l$a$a;->x:LG7/l$a$a;

    invoke-static {p1, v1, v3}, LI8/h;->l(LI8/f;LI8/f;Lv8/q;)LI8/f;

    move-result-object p1

    new-instance v1, LG7/l$a$b;

    iget-object v3, p0, LG7/l$a;->t:[Lh8/o;

    iget-object v4, p0, LG7/l$a;->u:[Ljava/lang/Object;

    iget-object v5, p0, LG7/l$a;->v:LJ7/i;

    iget-object v6, p0, LG7/l$a;->w:Lv8/l;

    invoke-direct {v1, v3, v4, v5, v6}, LG7/l$a$b;-><init>([Lh8/o;[Ljava/lang/Object;LJ7/i;Lv8/l;)V

    iput v2, p0, LG7/l$a;->q:I

    invoke-interface {p1, v1, p0}, LI8/f;->a(LI8/g;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_3a

    return-object v0

    :cond_3a
    :goto_3a
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
