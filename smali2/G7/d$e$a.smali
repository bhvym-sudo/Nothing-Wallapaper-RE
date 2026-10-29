.class final LG7/d$e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG7/d$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic q:LJ7/i;

.field final synthetic r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;


# direct methods
.method constructor <init>(LJ7/i;Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;)V
    .registers 3

    iput-object p1, p0, LG7/d$e$a;->q:LJ7/i;

    iput-object p2, p0, LG7/d$e$a;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LJ7/i;)Lh8/A;
    .registers 1

    invoke-static {p0}, LG7/d$e$a;->j(LJ7/i;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(LJ7/i;LN1/a;LO1/b;)Lh8/A;
    .registers 3

    invoke-static {p0, p1, p2}, LG7/d$e$a;->i(LJ7/i;LN1/a;LO1/b;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(LJ7/i;)Lh8/A;
    .registers 1

    invoke-static {p0}, LG7/d$e$a;->k(LJ7/i;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method private static final i(LJ7/i;LN1/a;LO1/b;)Lh8/A;
    .registers 4

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, LA7/f;->r:LA7/f;

    invoke-virtual {p0, p1, p2}, LJ7/i;->s0(LN1/a;LA7/f;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private static final j(LJ7/i;)Lh8/A;
    .registers 1

    invoke-virtual {p0}, LJ7/i;->v0()V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private static final k(LJ7/i;)Lh8/A;
    .registers 2

    sget-object v0, LA7/f;->r:LA7/f;

    invoke-virtual {p0, v0}, LJ7/i;->u0(LA7/f;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
    .registers 3

    check-cast p1, LN1/a;

    invoke-virtual {p0, p1, p2}, LG7/d$e$a;->f(LN1/a;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final f(LN1/a;Lm8/e;)Ljava/lang/Object;
    .registers 9

    instance-of v0, p2, LG7/d$e$a$a;

    if-eqz v0, :cond_13

    move-object v0, p2

    check-cast v0, LG7/d$e$a$a;

    iget v1, v0, LG7/d$e$a$a;->u:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_13

    sub-int/2addr v1, v2

    iput v1, v0, LG7/d$e$a$a;->u:I

    goto :goto_18

    :cond_13
    new-instance v0, LG7/d$e$a$a;

    invoke-direct {v0, p0, p2}, LG7/d$e$a$a;-><init>(LG7/d$e$a;Lm8/e;)V

    :goto_18
    iget-object p2, v0, LG7/d$e$a$a;->s:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LG7/d$e$a$a;->u:I

    const/4 v3, 0x1

    if-eqz v2, :cond_3b

    if-ne v2, v3, :cond_33

    iget-object p0, v0, LG7/d$e$a$a;->r:Ljava/lang/Object;

    move-object p1, p0

    check-cast p1, LN1/a;

    iget-object p0, v0, LG7/d$e$a$a;->q:Ljava/lang/Object;

    check-cast p0, LG7/d$e$a;

    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    :cond_31
    move-object v1, p1

    goto :goto_5c

    :cond_33
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3b
    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p2, p0, LG7/d$e$a;->q:LJ7/i;

    invoke-virtual {p2}, LJ7/i;->p0()Z

    move-result p2

    if-eqz p2, :cond_49

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_49
    iget-object p2, p0, LG7/d$e$a;->q:LJ7/i;

    invoke-virtual {p2}, LJ7/i;->T()LI8/f;

    move-result-object p2

    iput-object p0, v0, LG7/d$e$a$a;->q:Ljava/lang/Object;

    iput-object p1, v0, LG7/d$e$a$a;->r:Ljava/lang/Object;

    iput v3, v0, LG7/d$e$a$a;->u:I

    invoke-static {p2, v0}, LI8/h;->x(LI8/f;Lm8/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_31

    return-object v1

    :goto_5c
    move-object v2, p2

    check-cast v2, LA7/a;

    iget-object v0, p0, LG7/d$e$a;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;

    iget-object p1, p0, LG7/d$e$a;->q:LJ7/i;

    new-instance v3, LG7/e;

    invoke-direct {v3, p1, v1}, LG7/e;-><init>(LJ7/i;LN1/a;)V

    iget-object p1, p0, LG7/d$e$a;->q:LJ7/i;

    new-instance v4, LG7/f;

    invoke-direct {v4, p1}, LG7/f;-><init>(LJ7/i;)V

    iget-object p0, p0, LG7/d$e$a;->q:LJ7/i;

    new-instance v5, LG7/g;

    invoke-direct {v5, p0}, LG7/g;-><init>(LJ7/i;)V

    invoke-interface/range {v0 .. v5}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;->i(LN1/a;LA7/a;Lv8/l;Lv8/a;Lv8/a;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
