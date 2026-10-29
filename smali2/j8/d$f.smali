.class public final Lj8/d$f;
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
    name = "f"
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
.method public next()Ljava/lang/Object;
    .registers 3

    invoke-virtual {p0}, Lj8/d$d;->a()V

    invoke-virtual {p0}, Lj8/d$d;->c()I

    move-result v0

    invoke-virtual {p0}, Lj8/d$d;->f()Lj8/d;

    move-result-object v1

    invoke-static {v1}, Lj8/d;->d(Lj8/d;)I

    move-result v1

    if-ge v0, v1, :cond_32

    invoke-virtual {p0}, Lj8/d$d;->c()I

    move-result v0

    add-int/lit8 v1, v0, 0x1

    invoke-virtual {p0, v1}, Lj8/d$d;->h(I)V

    invoke-virtual {p0, v0}, Lj8/d$d;->i(I)V

    invoke-virtual {p0}, Lj8/d$d;->f()Lj8/d;

    move-result-object v0

    invoke-static {v0}, Lj8/d;->h(Lj8/d;)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lj8/d$d;->d()I

    move-result v1

    aget-object v0, v0, v1

    invoke-virtual {p0}, Lj8/d$d;->g()V

    return-object v0

    :cond_32
    new-instance p0, Ljava/util/NoSuchElementException;

    invoke-direct {p0}, Ljava/util/NoSuchElementException;-><init>()V

    throw p0
.end method
