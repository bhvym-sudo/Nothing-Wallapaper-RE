.class public final La7/d$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La7/d;
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
    invoke-direct {p0}, La7/d$b;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Z
    .registers 4

    const-string v0, "list"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p0}, La7/d$b;->b()I

    move-result p0

    const/4 v1, 0x0

    if-le v0, p0, :cond_1f

    const-string p0, "NtCreativeViewModel"

    const-string v0, "checkMaxCountLimit removed last"

    invoke-static {p0, v0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p1}, Li8/s;->G(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_1f

    const/4 p0, 0x1

    return p0

    :cond_1f
    return v1
.end method

.method public final b()I
    .registers 1

    invoke-static {}, La7/d;->w()I

    move-result p0

    return p0
.end method

.method public final c(Ljava/lang/Exception;)Z
    .registers 4

    const/4 p0, 0x0

    if-eqz p1, :cond_13

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_13

    const-string v0, "SocketTimeoutException"

    const/4 v1, 0x1

    invoke-static {p1, v0, v1}, LE8/i;->Q(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result p1

    if-ne p1, v1, :cond_13

    return v1

    :cond_13
    return p0
.end method

.method public final d(Ljava/lang/Exception;)Z
    .registers 3

    instance-of p0, p1, Ljava/io/EOFException;

    if-eqz p0, :cond_16

    check-cast p1, Ljava/io/EOFException;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_16

    const-string p1, "End of input at line 1 column 1 path"

    const/4 v0, 0x1

    invoke-static {p0, p1, v0}, LE8/i;->K(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p0

    if-ne p0, v0, :cond_16

    return v0

    :cond_16
    const/4 p0, 0x0

    return p0
.end method

.method public final e(LX6/b;)V
    .registers 4

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LX6/b$b;

    if-eqz v0, :cond_1d

    check-cast p1, LX6/b$b;

    invoke-virtual {p1}, LX6/b$b;->a()Ljava/util/List;

    move-result-object p0

    if-eqz p0, :cond_1b

    check-cast p0, Ljava/util/Collection;

    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result p0

    const/4 p1, 0x1

    if-ne p0, p1, :cond_1b

    goto :goto_3e

    :cond_1b
    const/4 p1, 0x0

    goto :goto_3e

    :cond_1d
    instance-of v0, p1, LX6/b$a;

    const/4 v1, 0x4

    if-eqz v0, :cond_3d

    check-cast p1, LX6/b$a;

    invoke-virtual {p1}, LX6/b$a;->a()Ljava/lang/Exception;

    move-result-object v0

    invoke-virtual {p0, v0}, La7/d$b;->c(Ljava/lang/Exception;)Z

    move-result v0

    if-eqz v0, :cond_31

    const/4 p0, 0x2

    :goto_2f
    move p1, p0

    goto :goto_3e

    :cond_31
    invoke-virtual {p1}, LX6/b$a;->a()Ljava/lang/Exception;

    move-result-object p1

    invoke-virtual {p0, p1}, La7/d$b;->d(Ljava/lang/Exception;)Z

    move-result p0

    if-eqz p0, :cond_3d

    const/4 p0, 0x3

    goto :goto_2f

    :cond_3d
    move p1, v1

    :goto_3e
    sget-object p0, LR7/d;->r:LR7/d;

    invoke-virtual {p0, p1}, LR7/d;->c(I)V

    return-void
.end method
