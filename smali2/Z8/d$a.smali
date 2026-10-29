.class public final LZ8/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LZ8/d;
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
    invoke-direct {p0}, LZ8/d$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(III)Z
    .registers 7

    invoke-static {}, Lorg/conscrypt/Conscrypt;->version()Lorg/conscrypt/Conscrypt$Version;

    move-result-object p0

    invoke-virtual {p0}, Lorg/conscrypt/Conscrypt$Version;->major()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq v0, p1, :cond_14

    invoke-virtual {p0}, Lorg/conscrypt/Conscrypt$Version;->major()I

    move-result p0

    if-le p0, p1, :cond_13

    return v2

    :cond_13
    return v1

    :cond_14
    invoke-virtual {p0}, Lorg/conscrypt/Conscrypt$Version;->minor()I

    move-result p1

    if-eq p1, p2, :cond_22

    invoke-virtual {p0}, Lorg/conscrypt/Conscrypt$Version;->minor()I

    move-result p0

    if-le p0, p2, :cond_21

    return v2

    :cond_21
    return v1

    :cond_22
    invoke-virtual {p0}, Lorg/conscrypt/Conscrypt$Version;->patch()I

    move-result p0

    if-lt p0, p3, :cond_29

    return v2

    :cond_29
    return v1
.end method

.method public final b()LZ8/d;
    .registers 2

    invoke-virtual {p0}, LZ8/d$a;->c()Z

    move-result p0

    const/4 v0, 0x0

    if-eqz p0, :cond_d

    new-instance p0, LZ8/d;

    invoke-direct {p0, v0}, LZ8/d;-><init>(Lkotlin/jvm/internal/h;)V

    return-object p0

    :cond_d
    return-object v0
.end method

.method public final c()Z
    .registers 1

    invoke-static {}, LZ8/d;->p()Z

    move-result p0

    return p0
.end method
