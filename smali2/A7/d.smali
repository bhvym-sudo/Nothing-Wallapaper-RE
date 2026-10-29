.class public final LA7/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LA7/d;

.field private static final b:Ljava/util/LinkedList;

.field private static final c:Lh8/h;

.field private static final d:Lh8/h;

.field private static final e:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LA7/d;

    invoke-direct {v0}, LA7/d;-><init>()V

    sput-object v0, LA7/d;->a:LA7/d;

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    sput-object v0, LA7/d;->b:Ljava/util/LinkedList;

    new-instance v0, LA7/b;

    invoke-direct {v0}, LA7/b;-><init>()V

    invoke-static {v0}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object v0

    sput-object v0, LA7/d;->c:Lh8/h;

    new-instance v0, LA7/c;

    invoke-direct {v0}, LA7/c;-><init>()V

    invoke-static {v0}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object v0

    sput-object v0, LA7/d;->d:Lh8/h;

    const-string v0, "GENERAL"

    const-string v1, "OLD_QUICKLOOK"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Li8/s;->p([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, LA7/d;->e:Ljava/util/List;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()I
    .registers 1

    invoke-static {}, LA7/d;->c()I

    move-result v0

    return v0
.end method

.method public static synthetic b()I
    .registers 1

    invoke-static {}, LA7/d;->d()I

    move-result v0

    return v0
.end method

.method private static final c()I
    .registers 4

    sget-object v0, LA7/d;->b:Ljava/util/LinkedList;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_23

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LO1/a;

    const-string v3, "OLD_QUICKLOOK"

    invoke-virtual {v2}, LO1/a;->b()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_20

    return v1

    :cond_20
    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    :cond_23
    const/4 v0, -0x1

    return v0
.end method

.method private static final d()I
    .registers 4

    sget-object v0, LA7/d;->b:Ljava/util/LinkedList;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_23

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LO1/a;

    const-string v3, "GENERAL"

    invoke-virtual {v2}, LO1/a;->b()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_20

    return v1

    :cond_20
    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    :cond_23
    const/4 v0, -0x1

    return v0
.end method

.method private final f()I
    .registers 1

    sget-object p0, LA7/d;->d:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method

.method private final g()I
    .registers 1

    sget-object p0, LA7/d;->c:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method


# virtual methods
.method public final e(Ljava/lang/String;)I
    .registers 4

    const-string p0, "clockId"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, LA7/d;->b:Ljava/util/LinkedList;

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    :goto_c
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_26

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LO1/a;

    invoke-virtual {v1}, LO1/a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_23

    return v0

    :cond_23
    add-int/lit8 v0, v0, 0x1

    goto :goto_c

    :cond_26
    const/4 p0, -0x1

    return p0
.end method

.method public final h(Ljava/lang/String;)Z
    .registers 2

    const-string p0, "clockId"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, LA7/d;->e:Ljava/util/List;

    invoke-interface {p0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public final i(Ljava/util/List;)V
    .registers 2

    const-string p0, "clocks"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, LA7/d;->b:Ljava/util/LinkedList;

    invoke-virtual {p0}, Ljava/util/LinkedList;->clear()V

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {p0, p1}, Ljava/util/LinkedList;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public final j(I)Z
    .registers 2

    invoke-direct {p0}, LA7/d;->f()I

    move-result p0

    if-ne p1, p0, :cond_8

    const/4 p0, 0x1

    return p0

    :cond_8
    const/4 p0, 0x0

    return p0
.end method

.method public final k(I)Z
    .registers 2

    invoke-direct {p0}, LA7/d;->g()I

    move-result p0

    if-ne p1, p0, :cond_8

    const/4 p0, 0x1

    return p0

    :cond_8
    const/4 p0, 0x0

    return p0
.end method
