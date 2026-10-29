.class public final LP8/E$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP8/E;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
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
    invoke-direct {p0}, LP8/E$b;-><init>()V

    return-void
.end method

.method public static synthetic d(LP8/E$b;[BLP8/x;ILjava/lang/Object;)LP8/E;
    .registers 5

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_5

    const/4 p2, 0x0

    :cond_5
    invoke-virtual {p0, p1, p2}, LP8/E$b;->c([BLP8/x;)LP8/E;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(LP8/x;JLe9/g;)LP8/E;
    .registers 6

    const-string v0, "content"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p4, p1, p2, p3}, LP8/E$b;->b(Le9/g;LP8/x;J)LP8/E;

    move-result-object p0

    return-object p0
.end method

.method public final b(Le9/g;LP8/x;J)LP8/E;
    .registers 5

    const-string p0, "<this>"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, LP8/E$b$a;

    invoke-direct {p0, p2, p3, p4, p1}, LP8/E$b$a;-><init>(LP8/x;JLe9/g;)V

    return-object p0
.end method

.method public final c([BLP8/x;)LP8/E;
    .registers 6

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Le9/e;

    invoke-direct {v0}, Le9/e;-><init>()V

    invoke-virtual {v0, p1}, Le9/e;->j1([B)Le9/e;

    move-result-object v0

    array-length p1, p1

    int-to-long v1, p1

    invoke-virtual {p0, v0, p2, v1, v2}, LP8/E$b;->b(Le9/g;LP8/x;J)LP8/E;

    move-result-object p0

    return-object p0
.end method
