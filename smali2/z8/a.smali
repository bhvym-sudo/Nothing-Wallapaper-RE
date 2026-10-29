.class public abstract Lz8/a;
.super Lz8/c;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Lz8/c;-><init>()V

    return-void
.end method


# virtual methods
.method public b()I
    .registers 1

    invoke-virtual {p0}, Lz8/a;->d()Ljava/util/Random;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/Random;->nextInt()I

    move-result p0

    return p0
.end method

.method public c(I)I
    .registers 2

    invoke-virtual {p0}, Lz8/a;->d()Ljava/util/Random;

    move-result-object p0

    invoke-virtual {p0, p1}, Ljava/util/Random;->nextInt(I)I

    move-result p0

    return p0
.end method

.method public abstract d()Ljava/util/Random;
.end method
