.class public final LP8/y$c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP8/y$c;
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
    invoke-direct {p0}, LP8/y$c$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LP8/u;LP8/C;)LP8/y$c;
    .registers 4

    const-string p0, "body"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x0

    if-eqz p1, :cond_f

    const-string v0, "Content-Type"

    invoke-virtual {p1, v0}, LP8/u;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_10

    :cond_f
    move-object v0, p0

    :goto_10
    if-nez v0, :cond_2c

    if-eqz p1, :cond_1b

    const-string v0, "Content-Length"

    invoke-virtual {p1, v0}, LP8/u;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1c

    :cond_1b
    move-object v0, p0

    :goto_1c
    if-nez v0, :cond_24

    new-instance v0, LP8/y$c;

    invoke-direct {v0, p1, p2, p0}, LP8/y$c;-><init>(LP8/u;LP8/C;Lkotlin/jvm/internal/h;)V

    return-object v0

    :cond_24
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Unexpected header: Content-Length"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2c
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Unexpected header: Content-Type"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
