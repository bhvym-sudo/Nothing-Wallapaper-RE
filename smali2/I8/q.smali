.class abstract synthetic LI8/q;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lv8/l;

.field private static final b:Lv8/p;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, LI8/o;

    invoke-direct {v0}, LI8/o;-><init>()V

    sput-object v0, LI8/q;->a:Lv8/l;

    new-instance v0, LI8/p;

    invoke-direct {v0}, LI8/p;-><init>()V

    sput-object v0, LI8/q;->b:Lv8/p;

    return-void
.end method

.method public static synthetic a(Ljava/lang/Object;Ljava/lang/Object;)Z
    .registers 2

    invoke-static {p0, p1}, LI8/q;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic b(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 1

    invoke-static {p0}, LI8/q;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Ljava/lang/Object;Ljava/lang/Object;)Z
    .registers 2

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static final d(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 1

    return-object p0
.end method

.method public static final e(LI8/f;)LI8/f;
    .registers 3

    instance-of v0, p0, LI8/O;

    if-eqz v0, :cond_5

    return-object p0

    :cond_5
    sget-object v0, LI8/q;->a:Lv8/l;

    sget-object v1, LI8/q;->b:Lv8/p;

    invoke-static {p0, v0, v1}, LI8/q;->g(LI8/f;Lv8/l;Lv8/p;)LI8/f;

    move-result-object p0

    return-object p0
.end method

.method public static final f(LI8/f;Lv8/l;)LI8/f;
    .registers 3

    sget-object v0, LI8/q;->b:Lv8/p;

    invoke-static {p0, p1, v0}, LI8/q;->g(LI8/f;Lv8/l;Lv8/p;)LI8/f;

    move-result-object p0

    return-object p0
.end method

.method private static final g(LI8/f;Lv8/l;Lv8/p;)LI8/f;
    .registers 5

    instance-of v0, p0, LI8/d;

    if-eqz v0, :cond_10

    move-object v0, p0

    check-cast v0, LI8/d;

    iget-object v1, v0, LI8/d;->r:Lv8/l;

    if-ne v1, p1, :cond_10

    iget-object v0, v0, LI8/d;->s:Lv8/p;

    if-ne v0, p2, :cond_10

    return-object p0

    :cond_10
    new-instance v0, LI8/d;

    invoke-direct {v0, p0, p1, p2}, LI8/d;-><init>(LI8/f;Lv8/l;Lv8/p;)V

    return-object v0
.end method
