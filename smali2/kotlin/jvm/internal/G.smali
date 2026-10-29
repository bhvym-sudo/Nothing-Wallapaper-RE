.class public Lkotlin/jvm/internal/G;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lkotlin/jvm/internal/k;)LC8/e;
    .registers 2

    return-object p1
.end method

.method public b(Ljava/lang/Class;)LC8/c;
    .registers 2

    new-instance p0, Lkotlin/jvm/internal/f;

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/f;-><init>(Ljava/lang/Class;)V

    return-object p0
.end method

.method public c(Ljava/lang/Class;Ljava/lang/String;)LC8/d;
    .registers 3

    new-instance p0, Lkotlin/jvm/internal/u;

    invoke-direct {p0, p1, p2}, Lkotlin/jvm/internal/u;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    return-object p0
.end method

.method public d(Lkotlin/jvm/internal/p;)LC8/f;
    .registers 2

    return-object p1
.end method

.method public e(Lkotlin/jvm/internal/r;)LC8/g;
    .registers 2

    return-object p1
.end method

.method public f(Lkotlin/jvm/internal/v;)LC8/h;
    .registers 2

    return-object p1
.end method

.method public g(Lkotlin/jvm/internal/x;)LC8/j;
    .registers 2

    return-object p1
.end method

.method public h(Lkotlin/jvm/internal/j;)Ljava/lang/String;
    .registers 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getGenericInterfaces()[Ljava/lang/reflect/Type;

    move-result-object p0

    const/4 p1, 0x0

    aget-object p0, p0, p1

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "kotlin.jvm.functions."

    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1d

    const/16 p1, 0x15

    invoke-virtual {p0, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    :cond_1d
    return-object p0
.end method

.method public i(Lkotlin/jvm/internal/o;)Ljava/lang/String;
    .registers 2

    invoke-virtual {p0, p1}, Lkotlin/jvm/internal/G;->h(Lkotlin/jvm/internal/j;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
