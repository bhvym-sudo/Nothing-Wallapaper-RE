.class public abstract Lj6/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(IIII)I
    .registers 6

    div-int/lit8 p1, p1, 0x2

    div-int/lit8 p0, p0, 0x2

    const/4 v0, 0x0

    :goto_5
    shr-int v1, p1, v0

    if-lt v1, p3, :cond_10

    shr-int v1, p0, v0

    if-lt v1, p2, :cond_10

    add-int/lit8 v0, v0, 0x1

    goto :goto_5

    :cond_10
    const/4 p0, 0x1

    shl-int/2addr p0, v0

    return p0
.end method
