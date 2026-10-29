.class final LG7/d$f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG7/d$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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

    iput-object p1, p0, LG7/d$f$a;->q:LJ7/i;

    iput-object p2, p0, LG7/d$f$a;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LJ7/i;LO1/b;)Lh8/A;
    .registers 2

    invoke-static {p0, p1}, LG7/d$f$a;->f(LJ7/i;LO1/b;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(LJ7/i;)Lh8/A;
    .registers 1

    invoke-static {p0}, LG7/d$f$a;->i(LJ7/i;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method private static final f(LJ7/i;LO1/b;)Lh8/A;
    .registers 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LJ7/i;->v0()V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private static final i(LJ7/i;)Lh8/A;
    .registers 2

    sget-object v0, LA7/f;->s:LA7/f;

    invoke-virtual {p0, v0}, LJ7/i;->u0(LA7/f;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
    .registers 3

    check-cast p1, LA7/a;

    invoke-virtual {p0, p1, p2}, LG7/d$f$a;->e(LA7/a;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final e(LA7/a;Lm8/e;)Ljava/lang/Object;
    .registers 7

    instance-of v0, p2, LG7/d$f$a$a;

    if-eqz v0, :cond_13

    move-object v0, p2

    check-cast v0, LG7/d$f$a$a;

    iget v1, v0, LG7/d$f$a$a;->u:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_13

    sub-int/2addr v1, v2

    iput v1, v0, LG7/d$f$a$a;->u:I

    goto :goto_18

    :cond_13
    new-instance v0, LG7/d$f$a$a;

    invoke-direct {v0, p0, p2}, LG7/d$f$a$a;-><init>(LG7/d$f$a;Lm8/e;)V

    :goto_18
    iget-object p2, v0, LG7/d$f$a$a;->s:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LG7/d$f$a$a;->u:I

    const/4 v3, 0x1

    if-eqz v2, :cond_3a

    if-ne v2, v3, :cond_32

    iget-object p0, v0, LG7/d$f$a$a;->r:Ljava/lang/Object;

    move-object p1, p0

    check-cast p1, LA7/a;

    iget-object p0, v0, LG7/d$f$a$a;->q:Ljava/lang/Object;

    check-cast p0, LG7/d$f$a;

    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_5b

    :cond_32
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3a
    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p2, p0, LG7/d$f$a;->q:LJ7/i;

    invoke-virtual {p2}, LJ7/i;->p0()Z

    move-result p2

    if-eqz p2, :cond_48

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_48
    iget-object p2, p0, LG7/d$f$a;->q:LJ7/i;

    invoke-virtual {p2}, LJ7/i;->V()LI8/f;

    move-result-object p2

    iput-object p0, v0, LG7/d$f$a$a;->q:Ljava/lang/Object;

    iput-object p1, v0, LG7/d$f$a$a;->r:Ljava/lang/Object;

    iput v3, v0, LG7/d$f$a$a;->u:I

    invoke-static {p2, v0}, LI8/h;->x(LI8/f;Lm8/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5b

    return-object v1

    :cond_5b
    :goto_5b
    check-cast p2, LN1/a;

    iget-object v0, p0, LG7/d$f$a;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;

    iget-object v1, p0, LG7/d$f$a;->q:LJ7/i;

    new-instance v2, LG7/h;

    invoke-direct {v2, v1}, LG7/h;-><init>(LJ7/i;)V

    iget-object p0, p0, LG7/d$f$a;->q:LJ7/i;

    new-instance v1, LG7/i;

    invoke-direct {v1, p0}, LG7/i;-><init>(LJ7/i;)V

    invoke-interface {v0, p1, p2, v2, v1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;->e(LA7/a;LN1/a;Lv8/l;Lv8/a;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
