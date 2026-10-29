.class public abstract LO5/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lh8/h;

.field private static final b:Lh8/h;

.field private static final c:Lh8/h;

.field private static final d:Lh8/h;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, LO5/c;

    invoke-direct {v0}, LO5/c;-><init>()V

    invoke-static {v0}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object v0

    sput-object v0, LO5/g;->a:Lh8/h;

    new-instance v0, LO5/d;

    invoke-direct {v0}, LO5/d;-><init>()V

    invoke-static {v0}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object v0

    sput-object v0, LO5/g;->b:Lh8/h;

    new-instance v0, LO5/e;

    invoke-direct {v0}, LO5/e;-><init>()V

    invoke-static {v0}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object v0

    sput-object v0, LO5/g;->c:Lh8/h;

    new-instance v0, LO5/f;

    invoke-direct {v0}, LO5/f;-><init>()V

    invoke-static {v0}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object v0

    sput-object v0, LO5/g;->d:Lh8/h;

    return-void
.end method

.method public static synthetic a()LF8/L;
    .registers 1

    invoke-static {}, LO5/g;->g()LF8/L;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b()LF8/L;
    .registers 1

    invoke-static {}, LO5/g;->h()LF8/L;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()LF8/L;
    .registers 1

    invoke-static {}, LO5/g;->e()LF8/L;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d()LF8/L;
    .registers 1

    invoke-static {}, LO5/g;->f()LF8/L;

    move-result-object v0

    return-object v0
.end method

.method private static final e()LF8/L;
    .registers 3

    invoke-static {}, LF8/b0;->a()LF8/I;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v1, v2, v1}, LF8/T0;->b(LF8/x0;ILjava/lang/Object;)LF8/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lm8/a;->z(Lm8/i;)Lm8/i;

    move-result-object v0

    invoke-static {v0}, LF8/M;->a(Lm8/i;)LF8/L;

    move-result-object v0

    return-object v0
.end method

.method private static final f()LF8/L;
    .registers 3

    invoke-static {}, LF8/b0;->c()LF8/H0;

    move-result-object v0

    invoke-virtual {v0}, LF8/H0;->l1()LF8/H0;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v1, v2, v1}, LF8/T0;->b(LF8/x0;ILjava/lang/Object;)LF8/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lm8/a;->z(Lm8/i;)Lm8/i;

    move-result-object v0

    invoke-static {v0}, LF8/M;->a(Lm8/i;)LF8/L;

    move-result-object v0

    return-object v0
.end method

.method private static final g()LF8/L;
    .registers 3

    invoke-static {}, LF8/b0;->b()LF8/I;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v1, v2, v1}, LF8/T0;->b(LF8/x0;ILjava/lang/Object;)LF8/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lm8/a;->z(Lm8/i;)Lm8/i;

    move-result-object v0

    invoke-static {v0}, LF8/M;->a(Lm8/i;)LF8/L;

    move-result-object v0

    return-object v0
.end method

.method private static final h()LF8/L;
    .registers 3

    invoke-static {}, LF8/b0;->c()LF8/H0;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v1, v2, v1}, LF8/T0;->b(LF8/x0;ILjava/lang/Object;)LF8/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lm8/a;->z(Lm8/i;)Lm8/i;

    move-result-object v0

    invoke-static {v0}, LF8/M;->a(Lm8/i;)LF8/L;

    move-result-object v0

    return-object v0
.end method

.method public static final i()LF8/L;
    .registers 1

    sget-object v0, LO5/g;->d:Lh8/h;

    invoke-interface {v0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LF8/L;

    return-object v0
.end method

.method public static final j()LF8/L;
    .registers 1

    sget-object v0, LO5/g;->b:Lh8/h;

    invoke-interface {v0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LF8/L;

    return-object v0
.end method

.method public static final k()LF8/L;
    .registers 1

    sget-object v0, LO5/g;->c:Lh8/h;

    invoke-interface {v0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LF8/L;

    return-object v0
.end method
