.class public abstract LK8/K;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LK8/D;

.field private static final b:Lv8/p;

.field private static final c:Lv8/p;

.field private static final d:Lv8/p;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LK8/D;

    const-string v1, "NO_THREAD_ELEMENTS"

    invoke-direct {v0, v1}, LK8/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LK8/K;->a:LK8/D;

    new-instance v0, LK8/H;

    invoke-direct {v0}, LK8/H;-><init>()V

    sput-object v0, LK8/K;->b:Lv8/p;

    new-instance v0, LK8/I;

    invoke-direct {v0}, LK8/I;-><init>()V

    sput-object v0, LK8/K;->c:Lv8/p;

    new-instance v0, LK8/J;

    invoke-direct {v0}, LK8/J;-><init>()V

    sput-object v0, LK8/K;->d:Lv8/p;

    return-void
.end method

.method public static synthetic a(LF8/U0;Lm8/i$b;)LF8/U0;
    .registers 2

    invoke-static {p0, p1}, LK8/K;->e(LF8/U0;Lm8/i$b;)LF8/U0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Object;Lm8/i$b;)Ljava/lang/Object;
    .registers 2

    invoke-static {p0, p1}, LK8/K;->d(Ljava/lang/Object;Lm8/i$b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(LK8/O;Lm8/i$b;)LK8/O;
    .registers 2

    invoke-static {p0, p1}, LK8/K;->h(LK8/O;Lm8/i$b;)LK8/O;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Ljava/lang/Object;Lm8/i$b;)Ljava/lang/Object;
    .registers 3

    instance-of v0, p1, LF8/U0;

    if-eqz v0, :cond_1d

    instance-of v0, p0, Ljava/lang/Integer;

    if-eqz v0, :cond_b

    check-cast p0, Ljava/lang/Integer;

    goto :goto_c

    :cond_b
    const/4 p0, 0x0

    :goto_c
    const/4 v0, 0x1

    if-eqz p0, :cond_14

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    goto :goto_15

    :cond_14
    move p0, v0

    :goto_15
    if-nez p0, :cond_18

    return-object p1

    :cond_18
    add-int/2addr p0, v0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    :cond_1d
    return-object p0
.end method

.method private static final e(LF8/U0;Lm8/i$b;)LF8/U0;
    .registers 2

    if-eqz p0, :cond_3

    return-object p0

    :cond_3
    instance-of p0, p1, LF8/U0;

    if-eqz p0, :cond_a

    check-cast p1, LF8/U0;

    return-object p1

    :cond_a
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final f(Lm8/i;Ljava/lang/Object;)V
    .registers 4

    sget-object v0, LK8/K;->a:LK8/D;

    if-ne p1, v0, :cond_5

    return-void

    :cond_5
    instance-of v0, p1, LK8/O;

    if-eqz v0, :cond_f

    check-cast p1, LK8/O;

    invoke-virtual {p1, p0}, LK8/O;->b(Lm8/i;)V

    return-void

    :cond_f
    const/4 v0, 0x0

    sget-object v1, LK8/K;->c:Lv8/p;

    invoke-interface {p0, v0, v1}, Lm8/i;->U0(Ljava/lang/Object;Lv8/p;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LF8/U0;

    invoke-interface {v0, p0, p1}, LF8/U0;->X0(Lm8/i;Ljava/lang/Object;)V

    return-void
.end method

.method public static final g(Lm8/i;)Ljava/lang/Object;
    .registers 3

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, LK8/K;->b:Lv8/p;

    invoke-interface {p0, v0, v1}, Lm8/i;->U0(Ljava/lang/Object;Lv8/p;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    return-object p0
.end method

.method private static final h(LK8/O;Lm8/i$b;)LK8/O;
    .registers 3

    instance-of v0, p1, LF8/U0;

    if-eqz v0, :cond_f

    check-cast p1, LF8/U0;

    iget-object v0, p0, LK8/O;->a:Lm8/i;

    invoke-interface {p1, v0}, LF8/U0;->j(Lm8/i;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, LK8/O;->a(LF8/U0;Ljava/lang/Object;)V

    :cond_f
    return-object p0
.end method

.method public static final i(Lm8/i;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    if-nez p1, :cond_6

    invoke-static {p0}, LK8/K;->g(Lm8/i;)Ljava/lang/Object;

    move-result-object p1

    :cond_6
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    if-ne p1, v0, :cond_10

    sget-object p0, LK8/K;->a:LK8/D;

    return-object p0

    :cond_10
    instance-of v0, p1, Ljava/lang/Integer;

    if-eqz v0, :cond_26

    new-instance v0, LK8/O;

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-direct {v0, p0, p1}, LK8/O;-><init>(Lm8/i;I)V

    sget-object p1, LK8/K;->d:Lv8/p;

    invoke-interface {p0, v0, p1}, Lm8/i;->U0(Ljava/lang/Object;Lv8/p;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_26
    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LF8/U0;

    invoke-interface {p1, p0}, LF8/U0;->j(Lm8/i;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
