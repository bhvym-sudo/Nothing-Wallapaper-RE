.class Li8/c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Lw8/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li8/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field private q:I

.field final synthetic r:Li8/c;


# direct methods
.method public constructor <init>(Li8/c;)V
    .registers 2

    iput-object p1, p0, Li8/c$b;->r:Li8/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method protected final a()I
    .registers 1

    iget p0, p0, Li8/c$b;->q:I

    return p0
.end method

.method protected final c(I)V
    .registers 2

    iput p1, p0, Li8/c$b;->q:I

    return-void
.end method

.method public hasNext()Z
    .registers 2

    iget v0, p0, Li8/c$b;->q:I

    iget-object p0, p0, Li8/c$b;->r:Li8/c;

    invoke-virtual {p0}, Li8/b;->size()I

    move-result p0

    if-ge v0, p0, :cond_c

    const/4 p0, 0x1

    return p0

    :cond_c
    const/4 p0, 0x0

    return p0
.end method

.method public next()Ljava/lang/Object;
    .registers 4

    invoke-virtual {p0}, Li8/c$b;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_13

    iget-object v0, p0, Li8/c$b;->r:Li8/c;

    iget v1, p0, Li8/c$b;->q:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Li8/c$b;->q:I

    invoke-virtual {v0, v1}, Li8/c;->get(I)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_13
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
