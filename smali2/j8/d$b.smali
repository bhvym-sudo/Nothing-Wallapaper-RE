.class public final Lj8/d$b;
.super Lj8/d$d;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Lw8/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj8/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method public constructor <init>(Lj8/d;)V
    .registers 3

    const-string v0, "map"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lj8/d$d;-><init>(Lj8/d;)V

    return-void
.end method


# virtual methods
.method public k()Lj8/d$c;
    .registers 4

    invoke-virtual {p0}, Lj8/d$d;->a()V

    invoke-virtual {p0}, Lj8/d$d;->c()I

    move-result v0

    invoke-virtual {p0}, Lj8/d$d;->f()Lj8/d;

    move-result-object v1

    invoke-static {v1}, Lj8/d;->d(Lj8/d;)I

    move-result v1

    if-ge v0, v1, :cond_2e

    invoke-virtual {p0}, Lj8/d$d;->c()I

    move-result v0

    add-int/lit8 v1, v0, 0x1

    invoke-virtual {p0, v1}, Lj8/d$d;->h(I)V

    invoke-virtual {p0, v0}, Lj8/d$d;->i(I)V

    new-instance v0, Lj8/d$c;

    invoke-virtual {p0}, Lj8/d$d;->f()Lj8/d;

    move-result-object v1

    invoke-virtual {p0}, Lj8/d$d;->d()I

    move-result v2

    invoke-direct {v0, v1, v2}, Lj8/d$c;-><init>(Lj8/d;I)V

    invoke-virtual {p0}, Lj8/d$d;->g()V

    return-object v0

    :cond_2e
    new-instance p0, Ljava/util/NoSuchElementException;

    invoke-direct {p0}, Ljava/util/NoSuchElementException;-><init>()V

    throw p0
.end method

.method public final l(Ljava/lang/StringBuilder;)V
    .registers 5

    const-string v0, "sb"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lj8/d$d;->c()I

    move-result v0

    invoke-virtual {p0}, Lj8/d$d;->f()Lj8/d;

    move-result-object v1

    invoke-static {v1}, Lj8/d;->d(Lj8/d;)I

    move-result v1

    if-ge v0, v1, :cond_63

    invoke-virtual {p0}, Lj8/d$d;->c()I

    move-result v0

    add-int/lit8 v1, v0, 0x1

    invoke-virtual {p0, v1}, Lj8/d$d;->h(I)V

    invoke-virtual {p0, v0}, Lj8/d$d;->i(I)V

    invoke-virtual {p0}, Lj8/d$d;->f()Lj8/d;

    move-result-object v0

    invoke-static {v0}, Lj8/d;->c(Lj8/d;)[Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0}, Lj8/d$d;->d()I

    move-result v1

    aget-object v0, v0, v1

    invoke-virtual {p0}, Lj8/d$d;->f()Lj8/d;

    move-result-object v1

    const-string v2, "(this Map)"

    if-ne v0, v1, :cond_39

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3c

    :cond_39
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :goto_3c
    const/16 v0, 0x3d

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lj8/d$d;->f()Lj8/d;

    move-result-object v0

    invoke-static {v0}, Lj8/d;->h(Lj8/d;)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lj8/d$d;->d()I

    move-result v1

    aget-object v0, v0, v1

    invoke-virtual {p0}, Lj8/d$d;->f()Lj8/d;

    move-result-object v1

    if-ne v0, v1, :cond_5c

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_5f

    :cond_5c
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :goto_5f
    invoke-virtual {p0}, Lj8/d$d;->g()V

    return-void

    :cond_63
    new-instance p0, Ljava/util/NoSuchElementException;

    invoke-direct {p0}, Ljava/util/NoSuchElementException;-><init>()V

    throw p0
.end method

.method public final m()I
    .registers 5

    invoke-virtual {p0}, Lj8/d$d;->c()I

    move-result v0

    invoke-virtual {p0}, Lj8/d$d;->f()Lj8/d;

    move-result-object v1

    invoke-static {v1}, Lj8/d;->d(Lj8/d;)I

    move-result v1

    if-ge v0, v1, :cond_4d

    invoke-virtual {p0}, Lj8/d$d;->c()I

    move-result v0

    add-int/lit8 v1, v0, 0x1

    invoke-virtual {p0, v1}, Lj8/d$d;->h(I)V

    invoke-virtual {p0, v0}, Lj8/d$d;->i(I)V

    invoke-virtual {p0}, Lj8/d$d;->f()Lj8/d;

    move-result-object v0

    invoke-static {v0}, Lj8/d;->c(Lj8/d;)[Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0}, Lj8/d$d;->d()I

    move-result v1

    aget-object v0, v0, v1

    const/4 v1, 0x0

    if-eqz v0, :cond_30

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_31

    :cond_30
    move v0, v1

    :goto_31
    invoke-virtual {p0}, Lj8/d$d;->f()Lj8/d;

    move-result-object v2

    invoke-static {v2}, Lj8/d;->h(Lj8/d;)[Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lj8/d$d;->d()I

    move-result v3

    aget-object v2, v2, v3

    if-eqz v2, :cond_48

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :cond_48
    xor-int/2addr v0, v1

    invoke-virtual {p0}, Lj8/d$d;->g()V

    return v0

    :cond_4d
    new-instance p0, Ljava/util/NoSuchElementException;

    invoke-direct {p0}, Ljava/util/NoSuchElementException;-><init>()V

    throw p0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .registers 1

    invoke-virtual {p0}, Lj8/d$b;->k()Lj8/d$c;

    move-result-object p0

    return-object p0
.end method
