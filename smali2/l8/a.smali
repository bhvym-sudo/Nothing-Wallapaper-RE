.class public abstract Ll8/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(ZZLjava/lang/ClassLoader;Ljava/lang/String;ILv8/a;)Ljava/lang/Thread;
    .registers 7

    const-string v0, "block"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ll8/a$a;

    invoke-direct {v0, p5}, Ll8/a$a;-><init>(Lv8/a;)V

    if-eqz p1, :cond_10

    const/4 p1, 0x1

    invoke-virtual {v0, p1}, Ljava/lang/Thread;->setDaemon(Z)V

    :cond_10
    if-lez p4, :cond_15

    invoke-virtual {v0, p4}, Ljava/lang/Thread;->setPriority(I)V

    :cond_15
    if-eqz p3, :cond_1a

    invoke-virtual {v0, p3}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    :cond_1a
    if-eqz p2, :cond_1f

    invoke-virtual {v0, p2}, Ljava/lang/Thread;->setContextClassLoader(Ljava/lang/ClassLoader;)V

    :cond_1f
    if-eqz p0, :cond_24

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    :cond_24
    return-object v0
.end method

.method public static synthetic b(ZZLjava/lang/ClassLoader;Ljava/lang/String;ILv8/a;ILjava/lang/Object;)Ljava/lang/Thread;
    .registers 9

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_5

    const/4 p0, 0x1

    :cond_5
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_a

    const/4 p1, 0x0

    :cond_a
    and-int/lit8 p7, p6, 0x4

    const/4 v0, 0x0

    if-eqz p7, :cond_10

    move-object p2, v0

    :cond_10
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_15

    move-object p3, v0

    :cond_15
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_1a

    const/4 p4, -0x1

    :cond_1a
    move-object p6, p5

    move p5, p4

    move-object p4, p3

    move-object p3, p2

    move p2, p1

    move p1, p0

    invoke-static/range {p1 .. p6}, Ll8/a;->a(ZZLjava/lang/ClassLoader;Ljava/lang/String;ILv8/a;)Ljava/lang/Thread;

    move-result-object p0

    return-object p0
.end method
