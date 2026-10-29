.class abstract LD8/p;
.super LD8/m;
.source "SourceFile"


# direct methods
.method public static synthetic c(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 1

    invoke-static {p0}, LD8/p;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lv8/a;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    invoke-static {p0, p1}, LD8/p;->j(Lv8/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static e(Ljava/util/Iterator;)LD8/h;
    .registers 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LD8/p$a;

    invoke-direct {v0, p0}, LD8/p$a;-><init>(Ljava/util/Iterator;)V

    invoke-static {v0}, LD8/p;->f(LD8/h;)LD8/h;

    move-result-object p0

    return-object p0
.end method

.method public static final f(LD8/h;)LD8/h;
    .registers 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, LD8/a;

    if-eqz v0, :cond_a

    return-object p0

    :cond_a
    new-instance v0, LD8/a;

    invoke-direct {v0, p0}, LD8/a;-><init>(LD8/h;)V

    return-object v0
.end method

.method public static final g()LD8/h;
    .registers 1

    sget-object v0, LD8/d;->a:LD8/d;

    return-object v0
.end method

.method public static h(Ljava/lang/Object;Lv8/l;)LD8/h;
    .registers 4

    const-string v0, "nextFunction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p0, :cond_a

    sget-object p0, LD8/d;->a:LD8/d;

    return-object p0

    :cond_a
    new-instance v0, LD8/g;

    new-instance v1, LD8/n;

    invoke-direct {v1, p0}, LD8/n;-><init>(Ljava/lang/Object;)V

    invoke-direct {v0, v1, p1}, LD8/g;-><init>(Lv8/a;Lv8/l;)V

    return-object v0
.end method

.method public static i(Lv8/a;)LD8/h;
    .registers 3

    const-string v0, "nextFunction"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LD8/g;

    new-instance v1, LD8/o;

    invoke-direct {v1, p0}, LD8/o;-><init>(Lv8/a;)V

    invoke-direct {v0, p0, v1}, LD8/g;-><init>(Lv8/a;Lv8/l;)V

    invoke-static {v0}, LD8/p;->f(LD8/h;)LD8/h;

    move-result-object p0

    return-object p0
.end method

.method private static final j(Lv8/a;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lv8/a;->invoke()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final k(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 1

    return-object p0
.end method
