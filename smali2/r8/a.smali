.class public Lr8/a;
.super Lq8/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr8/a$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Lq8/a;-><init>()V

    return-void
.end method

.method private final c(I)Z
    .registers 2

    sget-object p0, Lr8/a$a;->b:Ljava/lang/Integer;

    if-eqz p0, :cond_d

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    if-lt p0, p1, :cond_b

    goto :goto_d

    :cond_b
    const/4 p0, 0x0

    return p0

    :cond_d
    :goto_d
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public b()Lz8/c;
    .registers 2

    const/16 v0, 0x22

    invoke-direct {p0, v0}, Lr8/a;->c(I)Z

    move-result v0

    if-eqz v0, :cond_e

    new-instance p0, LA8/a;

    invoke-direct {p0}, LA8/a;-><init>()V

    return-object p0

    :cond_e
    invoke-super {p0}, Lp8/a;->b()Lz8/c;

    move-result-object p0

    return-object p0
.end method
