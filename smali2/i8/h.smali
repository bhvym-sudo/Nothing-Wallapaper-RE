.class public abstract Li8/h;
.super Ljava/util/AbstractMap;
.source "SourceFile"

# interfaces
.implements Ljava/util/Map;
.implements Lw8/d;


# direct methods
.method protected constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/util/AbstractMap;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()Ljava/util/Set;
.end method

.method public bridge abstract b()Ljava/util/Set;
.end method

.method public bridge abstract c()I
.end method

.method public bridge abstract d()Ljava/util/Collection;
.end method

.method public final bridge entrySet()Ljava/util/Set;
    .registers 1

    invoke-virtual {p0}, Li8/h;->a()Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method public final bridge keySet()Ljava/util/Set;
    .registers 1

    invoke-virtual {p0}, Li8/h;->b()Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method public final bridge size()I
    .registers 1

    invoke-virtual {p0}, Li8/h;->c()I

    move-result p0

    return p0
.end method

.method public final bridge values()Ljava/util/Collection;
    .registers 1

    invoke-virtual {p0}, Li8/h;->d()Ljava/util/Collection;

    move-result-object p0

    return-object p0
.end method
