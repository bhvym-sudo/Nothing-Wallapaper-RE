.class public final LP8/C$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP8/C;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .registers 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/h;)V
    .registers 2

    .line 1
    invoke-direct {p0}, LP8/C$a;-><init>()V

    return-void
.end method

.method public static synthetic f(LP8/C$a;LP8/x;[BIIILjava/lang/Object;)LP8/C;
    .registers 7

    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_5

    const/4 p3, 0x0

    :cond_5
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_a

    array-length p4, p2

    :cond_a
    invoke-virtual {p0, p1, p2, p3, p4}, LP8/C$a;->c(LP8/x;[BII)LP8/C;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(LP8/C$a;[BLP8/x;IIILjava/lang/Object;)LP8/C;
    .registers 7

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_5

    const/4 p2, 0x0

    :cond_5
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_a

    const/4 p3, 0x0

    :cond_a
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_f

    array-length p4, p1

    :cond_f
    invoke-virtual {p0, p1, p2, p3, p4}, LP8/C$a;->e([BLP8/x;II)LP8/C;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(LP8/x;Le9/h;)LP8/C;
    .registers 4

    const-string v0, "content"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p2, p1}, LP8/C$a;->d(Le9/h;LP8/x;)LP8/C;

    move-result-object p0

    return-object p0
.end method

.method public final b(LP8/x;[B)LP8/C;
    .registers 11

    const-string v0, "content"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v7}, LP8/C$a;->f(LP8/C$a;LP8/x;[BIIILjava/lang/Object;)LP8/C;

    move-result-object p0

    return-object p0
.end method

.method public final c(LP8/x;[BII)LP8/C;
    .registers 6

    const-string v0, "content"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p2, p1, p3, p4}, LP8/C$a;->e([BLP8/x;II)LP8/C;

    move-result-object p0

    return-object p0
.end method

.method public final d(Le9/h;LP8/x;)LP8/C;
    .registers 3

    const-string p0, "<this>"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, LP8/C$a$a;

    invoke-direct {p0, p2, p1}, LP8/C$a$a;-><init>(LP8/x;Le9/h;)V

    return-object p0
.end method

.method public final e([BLP8/x;II)LP8/C;
    .registers 11

    const-string p0, "<this>"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    array-length p0, p1

    int-to-long v0, p0

    int-to-long v2, p3

    int-to-long v4, p4

    invoke-static/range {v0 .. v5}, LQ8/d;->l(JJJ)V

    new-instance p0, LP8/C$a$b;

    invoke-direct {p0, p2, p4, p1, p3}, LP8/C$a$b;-><init>(LP8/x;I[BI)V

    return-object p0
.end method
