.class public final LD8/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Lw8/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD8/e;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final q:Ljava/util/Iterator;

.field private r:I

.field private s:Ljava/lang/Object;

.field final synthetic t:LD8/e;


# direct methods
.method constructor <init>(LD8/e;)V
    .registers 2

    iput-object p1, p0, LD8/e$a;->t:LD8/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LD8/e;->e(LD8/e;)LD8/h;

    move-result-object p1

    invoke-interface {p1}, LD8/h;->iterator()Ljava/util/Iterator;

    move-result-object p1

    iput-object p1, p0, LD8/e$a;->q:Ljava/util/Iterator;

    const/4 p1, -0x1

    iput p1, p0, LD8/e$a;->r:I

    return-void
.end method

.method private final a()V
    .registers 4

    :cond_0
    iget-object v0, p0, LD8/e$a;->q:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2c

    iget-object v0, p0, LD8/e$a;->q:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, LD8/e$a;->t:LD8/e;

    invoke-static {v1}, LD8/e;->c(LD8/e;)Lv8/l;

    move-result-object v1

    invoke-interface {v1, v0}, Lv8/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    iget-object v2, p0, LD8/e$a;->t:LD8/e;

    invoke-static {v2}, LD8/e;->d(LD8/e;)Z

    move-result v2

    if-ne v1, v2, :cond_0

    iput-object v0, p0, LD8/e$a;->s:Ljava/lang/Object;

    const/4 v0, 0x1

    iput v0, p0, LD8/e$a;->r:I

    return-void

    :cond_2c
    const/4 v0, 0x0

    iput v0, p0, LD8/e$a;->r:I

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .registers 3

    iget v0, p0, LD8/e$a;->r:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_8

    invoke-direct {p0}, LD8/e$a;->a()V

    :cond_8
    iget p0, p0, LD8/e$a;->r:I

    const/4 v0, 0x1

    if-ne p0, v0, :cond_e

    return v0

    :cond_e
    const/4 p0, 0x0

    return p0
.end method

.method public next()Ljava/lang/Object;
    .registers 4

    iget v0, p0, LD8/e$a;->r:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_8

    invoke-direct {p0}, LD8/e$a;->a()V

    :cond_8
    iget v0, p0, LD8/e$a;->r:I

    if-eqz v0, :cond_14

    iget-object v0, p0, LD8/e$a;->s:Ljava/lang/Object;

    const/4 v2, 0x0

    iput-object v2, p0, LD8/e$a;->s:Ljava/lang/Object;

    iput v1, p0, LD8/e$a;->r:I

    return-object v0

    :cond_14
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
