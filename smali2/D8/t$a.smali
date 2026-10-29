.class public final LD8/t$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Lw8/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD8/t;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final q:Ljava/util/Iterator;

.field private r:I

.field final synthetic s:LD8/t;


# direct methods
.method constructor <init>(LD8/t;)V
    .registers 2

    iput-object p1, p0, LD8/t$a;->s:LD8/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LD8/t;->d(LD8/t;)LD8/h;

    move-result-object p1

    invoke-interface {p1}, LD8/h;->iterator()Ljava/util/Iterator;

    move-result-object p1

    iput-object p1, p0, LD8/t$a;->q:Ljava/util/Iterator;

    return-void
.end method

.method private final a()V
    .registers 3

    :goto_0
    iget v0, p0, LD8/t$a;->r:I

    iget-object v1, p0, LD8/t$a;->s:LD8/t;

    invoke-static {v1}, LD8/t;->e(LD8/t;)I

    move-result v1

    if-ge v0, v1, :cond_1e

    iget-object v0, p0, LD8/t$a;->q:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1e

    iget-object v0, p0, LD8/t$a;->q:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    iget v0, p0, LD8/t$a;->r:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, LD8/t$a;->r:I

    goto :goto_0

    :cond_1e
    return-void
.end method


# virtual methods
.method public hasNext()Z
    .registers 3

    invoke-direct {p0}, LD8/t$a;->a()V

    iget v0, p0, LD8/t$a;->r:I

    iget-object v1, p0, LD8/t$a;->s:LD8/t;

    invoke-static {v1}, LD8/t;->c(LD8/t;)I

    move-result v1

    if-ge v0, v1, :cond_17

    iget-object p0, p0, LD8/t$a;->q:Ljava/util/Iterator;

    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p0

    if-eqz p0, :cond_17

    const/4 p0, 0x1

    return p0

    :cond_17
    const/4 p0, 0x0

    return p0
.end method

.method public next()Ljava/lang/Object;
    .registers 3

    invoke-direct {p0}, LD8/t$a;->a()V

    iget v0, p0, LD8/t$a;->r:I

    iget-object v1, p0, LD8/t$a;->s:LD8/t;

    invoke-static {v1}, LD8/t;->c(LD8/t;)I

    move-result v1

    if-ge v0, v1, :cond_1a

    iget v0, p0, LD8/t$a;->r:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, LD8/t$a;->r:I

    iget-object p0, p0, LD8/t$a;->q:Ljava/util/Iterator;

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1a
    new-instance p0, Ljava/util/NoSuchElementException;

    invoke-direct {p0}, Ljava/util/NoSuchElementException;-><init>()V

    throw p0
.end method

.method public remove()V
    .registers 2

    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Operation is not supported for read-only collection"

    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
