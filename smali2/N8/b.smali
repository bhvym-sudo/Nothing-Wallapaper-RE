.class final LN8/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:J


# direct methods
.method public constructor <init>(J)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, LN8/b;->a:J

    return-void
.end method

.method public static synthetic a(LN8/k;LN8/b;)V
    .registers 2

    invoke-static {p0, p1}, LN8/b;->e(LN8/k;LN8/b;)V

    return-void
.end method

.method public static final synthetic b(LN8/b;LN8/k;Ljava/lang/Object;)V
    .registers 3

    invoke-direct {p0, p1, p2}, LN8/b;->d(LN8/k;Ljava/lang/Object;)V

    return-void
.end method

.method private final d(LN8/k;Ljava/lang/Object;)V
    .registers 7

    iget-wide v0, p0, LN8/b;->a:J

    const-wide/16 v2, 0x0

    cmp-long p2, v0, v2

    if-gtz p2, :cond_e

    sget-object p0, Lh8/A;->a:Lh8/A;

    invoke-interface {p1, p0}, LN8/k;->f(Ljava/lang/Object;)V

    return-void

    :cond_e
    new-instance p2, LN8/a;

    invoke-direct {p2, p1, p0}, LN8/a;-><init>(LN8/k;LN8/b;)V

    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LN8/j;

    invoke-virtual {p1}, LN8/j;->getContext()Lm8/i;

    move-result-object v0

    invoke-static {v0}, LF8/W;->c(Lm8/i;)LF8/V;

    move-result-object v1

    iget-wide v2, p0, LN8/b;->a:J

    invoke-interface {v1, v2, v3, p2, v0}, LF8/V;->W0(JLjava/lang/Runnable;Lm8/i;)LF8/d0;

    move-result-object p0

    invoke-virtual {p1, p0}, LN8/j;->n(LF8/d0;)V

    return-void
.end method

.method private static final e(LN8/k;LN8/b;)V
    .registers 3

    sget-object v0, Lh8/A;->a:Lh8/A;

    invoke-interface {p0, p1, v0}, LN8/k;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public final c()LN8/e;
    .registers 7

    new-instance v0, LN8/f;

    sget-object v1, LN8/b$a;->q:LN8/b$a;

    const-string v2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x3

    invoke-static {v1, v2}, Lkotlin/jvm/internal/I;->d(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lv8/q;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, LN8/f;-><init>(Ljava/lang/Object;Lv8/q;Lv8/q;ILkotlin/jvm/internal/h;)V

    return-object v0
.end method
