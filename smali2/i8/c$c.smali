.class Li8/c$c;
.super Li8/c$b;
.source "SourceFile"

# interfaces
.implements Ljava/util/ListIterator;
.implements Lw8/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li8/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation


# instance fields
.field final synthetic s:Li8/c;


# direct methods
.method public constructor <init>(Li8/c;I)V
    .registers 4

    iput-object p1, p0, Li8/c$c;->s:Li8/c;

    invoke-direct {p0, p1}, Li8/c$b;-><init>(Li8/c;)V

    sget-object v0, Li8/c;->q:Li8/c$a;

    invoke-virtual {p1}, Li8/b;->size()I

    move-result p1

    invoke-virtual {v0, p2, p1}, Li8/c$a;->c(II)V

    invoke-virtual {p0, p2}, Li8/c$b;->c(I)V

    return-void
.end method


# virtual methods
.method public add(Ljava/lang/Object;)V
    .registers 2

    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Operation is not supported for read-only collection"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public hasPrevious()Z
    .registers 1

    invoke-virtual {p0}, Li8/c$b;->a()I

    move-result p0

    if-lez p0, :cond_8

    const/4 p0, 0x1

    return p0

    :cond_8
    const/4 p0, 0x0

    return p0
.end method

.method public nextIndex()I
    .registers 1

    invoke-virtual {p0}, Li8/c$b;->a()I

    move-result p0

    return p0
.end method

.method public previous()Ljava/lang/Object;
    .registers 3

    invoke-virtual {p0}, Li8/c$c;->hasPrevious()Z

    move-result v0

    if-eqz v0, :cond_1a

    iget-object v0, p0, Li8/c$c;->s:Li8/c;

    invoke-virtual {p0}, Li8/c$b;->a()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {p0, v1}, Li8/c$b;->c(I)V

    invoke-virtual {p0}, Li8/c$b;->a()I

    move-result p0

    invoke-virtual {v0, p0}, Li8/c;->get(I)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1a
    new-instance p0, Ljava/util/NoSuchElementException;

    invoke-direct {p0}, Ljava/util/NoSuchElementException;-><init>()V

    throw p0
.end method

.method public previousIndex()I
    .registers 1

    invoke-virtual {p0}, Li8/c$b;->a()I

    move-result p0

    add-int/lit8 p0, p0, -0x1

    return p0
.end method

.method public set(Ljava/lang/Object;)V
    .registers 2

    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Operation is not supported for read-only collection"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
