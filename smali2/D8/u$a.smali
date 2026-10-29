.class public final LD8/u$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Lw8/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD8/u;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private q:I

.field private final r:Ljava/util/Iterator;


# direct methods
.method constructor <init>(LD8/u;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LD8/u;->c(LD8/u;)I

    move-result v0

    iput v0, p0, LD8/u$a;->q:I

    invoke-static {p1}, LD8/u;->d(LD8/u;)LD8/h;

    move-result-object p1

    invoke-interface {p1}, LD8/h;->iterator()Ljava/util/Iterator;

    move-result-object p1

    iput-object p1, p0, LD8/u$a;->r:Ljava/util/Iterator;

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .registers 2

    iget v0, p0, LD8/u$a;->q:I

    if-lez v0, :cond_e

    iget-object p0, p0, LD8/u$a;->r:Ljava/util/Iterator;

    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p0

    if-eqz p0, :cond_e

    const/4 p0, 0x1

    return p0

    :cond_e
    const/4 p0, 0x0

    return p0
.end method

.method public next()Ljava/lang/Object;
    .registers 2

    iget v0, p0, LD8/u$a;->q:I

    if-eqz v0, :cond_f

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, LD8/u$a;->q:I

    iget-object p0, p0, LD8/u$a;->r:Ljava/util/Iterator;

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_f
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
