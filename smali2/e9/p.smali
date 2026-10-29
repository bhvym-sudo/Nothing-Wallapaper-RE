.class abstract synthetic Le9/p;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/util/logging/Logger;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    const-string v0, "okio.Okio"

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Le9/p;->a:Ljava/util/logging/Logger;

    return-void
.end method

.method public static final synthetic a()Ljava/util/logging/Logger;
    .registers 1

    sget-object v0, Le9/p;->a:Ljava/util/logging/Logger;

    return-object v0
.end method

.method public static final b(Ljava/io/File;)Le9/z;
    .registers 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/io/FileOutputStream;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V

    invoke-static {v0}, Le9/o;->g(Ljava/io/OutputStream;)Le9/z;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Ljava/lang/AssertionError;)Z
    .registers 5

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_20

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_1b

    const/4 v0, 0x2

    const/4 v2, 0x0

    const-string v3, "getsockname failed"

    invoke-static {p0, v3, v1, v0, v2}, LE8/i;->S(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result p0

    goto :goto_1c

    :cond_1b
    move p0, v1

    :goto_1c
    if-eqz p0, :cond_20

    const/4 p0, 0x1

    return p0

    :cond_20
    return v1
.end method

.method public static final d(Ljava/io/File;Z)Le9/z;
    .registers 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, p0, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V

    invoke-static {v0}, Le9/o;->g(Ljava/io/OutputStream;)Le9/z;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Ljava/io/OutputStream;)Le9/z;
    .registers 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Le9/s;

    new-instance v1, Le9/C;

    invoke-direct {v1}, Le9/C;-><init>()V

    invoke-direct {v0, p0, v1}, Le9/s;-><init>(Ljava/io/OutputStream;Le9/C;)V

    return-object v0
.end method

.method public static final f(Ljava/net/Socket;)Le9/z;
    .registers 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Le9/A;

    invoke-direct {v0, p0}, Le9/A;-><init>(Ljava/net/Socket;)V

    new-instance v1, Le9/s;

    invoke-virtual {p0}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object p0

    const-string v2, "getOutputStream(...)"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, p0, v0}, Le9/s;-><init>(Ljava/io/OutputStream;Le9/C;)V

    invoke-virtual {v0, v1}, Le9/c;->z(Le9/z;)Le9/z;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Ljava/io/File;ZILjava/lang/Object;)Le9/z;
    .registers 4

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_5

    const/4 p1, 0x0

    :cond_5
    invoke-static {p0, p1}, Le9/o;->f(Ljava/io/File;Z)Le9/z;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Ljava/io/File;)Le9/B;
    .registers 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Le9/n;

    new-instance v1, Ljava/io/FileInputStream;

    invoke-direct {v1, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    sget-object p0, Le9/C;->e:Le9/C;

    invoke-direct {v0, v1, p0}, Le9/n;-><init>(Ljava/io/InputStream;Le9/C;)V

    return-object v0
.end method

.method public static final i(Ljava/io/InputStream;)Le9/B;
    .registers 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Le9/n;

    new-instance v1, Le9/C;

    invoke-direct {v1}, Le9/C;-><init>()V

    invoke-direct {v0, p0, v1}, Le9/n;-><init>(Ljava/io/InputStream;Le9/C;)V

    return-object v0
.end method

.method public static final j(Ljava/net/Socket;)Le9/B;
    .registers 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Le9/A;

    invoke-direct {v0, p0}, Le9/A;-><init>(Ljava/net/Socket;)V

    new-instance v1, Le9/n;

    invoke-virtual {p0}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    move-result-object p0

    const-string v2, "getInputStream(...)"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, p0, v0}, Le9/n;-><init>(Ljava/io/InputStream;Le9/C;)V

    invoke-virtual {v0, v1}, Le9/c;->A(Le9/B;)Le9/B;

    move-result-object p0

    return-object p0
.end method
