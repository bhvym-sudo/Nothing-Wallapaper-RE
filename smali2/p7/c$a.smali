.class public final Lp7/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp7/c;
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
    invoke-direct {p0}, Lp7/c$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(ZZZZ)Lp7/c;
    .registers 14

    if-eqz p1, :cond_11

    if-eqz p2, :cond_11

    new-instance v0, Lp7/c$b;

    const/16 v5, 0xd

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x5

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Lp7/c$b;-><init>(ZIZZILkotlin/jvm/internal/h;)V

    return-object v0

    :cond_11
    if-eqz p1, :cond_20

    new-instance v1, Lp7/c$b;

    const/16 v6, 0xd

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lp7/c$b;-><init>(ZIZZILkotlin/jvm/internal/h;)V

    return-object v1

    :cond_20
    if-eqz p2, :cond_2e

    new-instance v2, Lp7/c$b;

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x4

    move v5, p3

    move v6, p4

    invoke-direct/range {v2 .. v8}, Lp7/c$b;-><init>(ZIZZILkotlin/jvm/internal/h;)V

    return-object v2

    :cond_2e
    move v5, p3

    move v6, p4

    new-instance p0, Lp7/c$d;

    invoke-direct {p0, v5, v6}, Lp7/c$d;-><init>(ZZ)V

    return-object p0
.end method
