.class public final LS8/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LS8/a;
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
    invoke-direct {p0}, LS8/a$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(LS8/a$a;LP8/u;LP8/u;)LP8/u;
    .registers 3

    invoke-direct {p0, p1, p2}, LS8/a$a;->c(LP8/u;LP8/u;)LP8/u;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(LS8/a$a;LP8/D;)LP8/D;
    .registers 2

    invoke-direct {p0, p1}, LS8/a$a;->f(LP8/D;)LP8/D;

    move-result-object p0

    return-object p0
.end method

.method private final c(LP8/u;LP8/u;)LP8/u;
    .registers 12

    new-instance v0, LP8/u$a;

    invoke-direct {v0}, LP8/u$a;-><init>()V

    invoke-virtual {p1}, LP8/u;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_b
    if-ge v3, v1, :cond_41

    invoke-virtual {p1, v3}, LP8/u;->b(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v3}, LP8/u;->m(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, "Warning"

    const/4 v7, 0x1

    invoke-static {v6, v4, v7}, LE8/i;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v6

    if-eqz v6, :cond_29

    const/4 v6, 0x2

    const/4 v7, 0x0

    const-string v8, "1"

    invoke-static {v5, v8, v2, v6, v7}, LE8/i;->M(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_29

    goto :goto_3e

    :cond_29
    invoke-direct {p0, v4}, LS8/a$a;->d(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_3b

    invoke-direct {p0, v4}, LS8/a$a;->e(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_3b

    invoke-virtual {p2, v4}, LP8/u;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_3e

    :cond_3b
    invoke-virtual {v0, v4, v5}, LP8/u$a;->d(Ljava/lang/String;Ljava/lang/String;)LP8/u$a;

    :cond_3e
    :goto_3e
    add-int/lit8 v3, v3, 0x1

    goto :goto_b

    :cond_41
    invoke-virtual {p2}, LP8/u;->size()I

    move-result p1

    :goto_45
    if-ge v2, p1, :cond_61

    invoke-virtual {p2, v2}, LP8/u;->b(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, LS8/a$a;->d(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_5e

    invoke-direct {p0, v1}, LS8/a$a;->e(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_5e

    invoke-virtual {p2, v2}, LP8/u;->m(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, LP8/u$a;->d(Ljava/lang/String;Ljava/lang/String;)LP8/u$a;

    :cond_5e
    add-int/lit8 v2, v2, 0x1

    goto :goto_45

    :cond_61
    invoke-virtual {v0}, LP8/u$a;->f()LP8/u;

    move-result-object p0

    return-object p0
.end method

.method private final d(Ljava/lang/String;)Z
    .registers 3

    const-string p0, "Content-Length"

    const/4 v0, 0x1

    invoke-static {p0, p1, v0}, LE8/i;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p0

    if-nez p0, :cond_1c

    const-string p0, "Content-Encoding"

    invoke-static {p0, p1, v0}, LE8/i;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p0

    if-nez p0, :cond_1c

    const-string p0, "Content-Type"

    invoke-static {p0, p1, v0}, LE8/i;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p0

    if-eqz p0, :cond_1a

    goto :goto_1c

    :cond_1a
    const/4 p0, 0x0

    return p0

    :cond_1c
    :goto_1c
    return v0
.end method

.method private final e(Ljava/lang/String;)Z
    .registers 3

    const-string p0, "Connection"

    const/4 v0, 0x1

    invoke-static {p0, p1, v0}, LE8/i;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p0

    if-nez p0, :cond_42

    const-string p0, "Keep-Alive"

    invoke-static {p0, p1, v0}, LE8/i;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p0

    if-nez p0, :cond_42

    const-string p0, "Proxy-Authenticate"

    invoke-static {p0, p1, v0}, LE8/i;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p0

    if-nez p0, :cond_42

    const-string p0, "Proxy-Authorization"

    invoke-static {p0, p1, v0}, LE8/i;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p0

    if-nez p0, :cond_42

    const-string p0, "TE"

    invoke-static {p0, p1, v0}, LE8/i;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p0

    if-nez p0, :cond_42

    const-string p0, "Trailers"

    invoke-static {p0, p1, v0}, LE8/i;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p0

    if-nez p0, :cond_42

    const-string p0, "Transfer-Encoding"

    invoke-static {p0, p1, v0}, LE8/i;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p0

    if-nez p0, :cond_42

    const-string p0, "Upgrade"

    invoke-static {p0, p1, v0}, LE8/i;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p0

    if-nez p0, :cond_42

    return v0

    :cond_42
    const/4 p0, 0x0

    return p0
.end method

.method private final f(LP8/D;)LP8/D;
    .registers 3

    const/4 p0, 0x0

    if-eqz p1, :cond_8

    invoke-virtual {p1}, LP8/D;->a()LP8/E;

    move-result-object v0

    goto :goto_9

    :cond_8
    move-object v0, p0

    :goto_9
    if-eqz v0, :cond_18

    invoke-virtual {p1}, LP8/D;->U()LP8/D$a;

    move-result-object p1

    invoke-virtual {p1, p0}, LP8/D$a;->b(LP8/E;)LP8/D$a;

    move-result-object p0

    invoke-virtual {p0}, LP8/D$a;->c()LP8/D;

    move-result-object p0

    return-object p0

    :cond_18
    return-object p1
.end method
