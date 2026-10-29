.class Lb6/c$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb6/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "h"
.end annotation


# instance fields
.field private q:I

.field private r:I

.field private s:[Lb6/c$j;

.field private t:Lb6/c$j;

.field private u:Lb6/c$g;

.field private v:Lb6/c$g;

.field final synthetic w:Lb6/c;


# direct methods
.method public constructor <init>(Lb6/c;)V
    .registers 2

    iput-object p1, p0, Lb6/c$h;->w:Lb6/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-direct {p0}, Lb6/c$h;->d()V

    return-void
.end method

.method private a()V
    .registers 2

    :goto_0
    iget-object v0, p0, Lb6/c$h;->u:Lb6/c$g;

    if-nez v0, :cond_13

    invoke-direct {p0}, Lb6/c$h;->c()V

    iget-object v0, p0, Lb6/c$h;->t:Lb6/c$j;

    if-nez v0, :cond_c

    goto :goto_13

    :cond_c
    invoke-interface {v0}, Lb6/c$j;->get()Lb6/c$g;

    move-result-object v0

    iput-object v0, p0, Lb6/c$h;->u:Lb6/c$g;

    goto :goto_0

    :cond_13
    :goto_13
    return-void
.end method

.method private c()V
    .registers 4

    iget-object v0, p0, Lb6/c$h;->t:Lb6/c$j;

    if-eqz v0, :cond_a

    invoke-interface {v0}, Lb6/c$j;->e()Lb6/c$j;

    move-result-object v0

    iput-object v0, p0, Lb6/c$h;->t:Lb6/c$j;

    :cond_a
    :goto_a
    iget-object v0, p0, Lb6/c$h;->t:Lb6/c$j;

    if-nez v0, :cond_27

    iget-object v0, p0, Lb6/c$h;->s:[Lb6/c$j;

    if-eqz v0, :cond_27

    iget v1, p0, Lb6/c$h;->r:I

    array-length v2, v0

    if-lt v1, v2, :cond_1e

    invoke-direct {p0}, Lb6/c$h;->d()V

    const/4 v0, 0x0

    iput v0, p0, Lb6/c$h;->r:I

    goto :goto_a

    :cond_1e
    aget-object v0, v0, v1

    iput-object v0, p0, Lb6/c$h;->t:Lb6/c$j;

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lb6/c$h;->r:I

    goto :goto_a

    :cond_27
    return-void
.end method

.method private d()V
    .registers 3

    const/4 v0, 0x0

    iput-object v0, p0, Lb6/c$h;->t:Lb6/c$j;

    iput-object v0, p0, Lb6/c$h;->s:[Lb6/c$j;

    iget v0, p0, Lb6/c$h;->q:I

    iget-object v1, p0, Lb6/c$h;->w:Lb6/c;

    invoke-static {v1}, Lb6/c;->b(Lb6/c;)[Lb6/c$n;

    move-result-object v1

    array-length v1, v1

    if-ge v0, v1, :cond_26

    iget-object v0, p0, Lb6/c$h;->w:Lb6/c;

    invoke-static {v0}, Lb6/c;->b(Lb6/c;)[Lb6/c$n;

    move-result-object v0

    iget v1, p0, Lb6/c$h;->q:I

    aget-object v0, v0, v1

    invoke-static {v0}, Lb6/c$n;->c(Lb6/c$n;)[Lb6/c$j;

    move-result-object v0

    iput-object v0, p0, Lb6/c$h;->s:[Lb6/c$j;

    iget v0, p0, Lb6/c$h;->q:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lb6/c$h;->q:I

    :cond_26
    return-void
.end method


# virtual methods
.method public e()Lb6/c$g;
    .registers 3

    invoke-direct {p0}, Lb6/c$h;->a()V

    iget-object v0, p0, Lb6/c$h;->u:Lb6/c$g;

    if-eqz v0, :cond_d

    iput-object v0, p0, Lb6/c$h;->v:Lb6/c$g;

    const/4 v1, 0x0

    iput-object v1, p0, Lb6/c$h;->u:Lb6/c$g;

    return-object v0

    :cond_d
    new-instance p0, Ljava/util/NoSuchElementException;

    invoke-direct {p0}, Ljava/util/NoSuchElementException;-><init>()V

    throw p0
.end method

.method public hasNext()Z
    .registers 1

    invoke-direct {p0}, Lb6/c$h;->a()V

    iget-object p0, p0, Lb6/c$h;->u:Lb6/c$g;

    if-eqz p0, :cond_9

    const/4 p0, 0x1

    return p0

    :cond_9
    const/4 p0, 0x0

    return p0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .registers 1

    invoke-virtual {p0}, Lb6/c$h;->e()Lb6/c$g;

    move-result-object p0

    return-object p0
.end method

.method public remove()V
    .registers 2

    iget-object v0, p0, Lb6/c$h;->v:Lb6/c$g;

    if-eqz v0, :cond_6

    const/4 v0, 0x1

    goto :goto_7

    :cond_6
    const/4 v0, 0x0

    :goto_7
    invoke-static {v0}, Lb6/a;->c(Z)V

    iget-object v0, p0, Lb6/c$h;->w:Lb6/c;

    iget-object p0, p0, Lb6/c$h;->v:Lb6/c$g;

    invoke-virtual {p0}, Lb6/c$g;->getKey()Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {v0, p0}, Lb6/c;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
