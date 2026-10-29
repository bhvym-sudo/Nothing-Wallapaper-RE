.class public final LD8/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Lw8/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD8/f;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final q:Ljava/util/Iterator;

.field private r:Ljava/util/Iterator;

.field private s:I

.field final synthetic t:LD8/f;


# direct methods
.method constructor <init>(LD8/f;)V
    .registers 2

    iput-object p1, p0, LD8/f$a;->t:LD8/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LD8/f;->d(LD8/f;)LD8/h;

    move-result-object p1

    invoke-interface {p1}, LD8/h;->iterator()Ljava/util/Iterator;

    move-result-object p1

    iput-object p1, p0, LD8/f$a;->q:Ljava/util/Iterator;

    return-void
.end method

.method private final a()Z
    .registers 5

    iget-object v0, p0, LD8/f$a;->r:Ljava/util/Iterator;

    const/4 v1, 0x1

    if-eqz v0, :cond_e

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_e

    iput v1, p0, LD8/f$a;->s:I

    return v1

    :cond_e
    iget-object v0, p0, LD8/f$a;->q:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3d

    iget-object v0, p0, LD8/f$a;->q:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    iget-object v2, p0, LD8/f$a;->t:LD8/f;

    invoke-static {v2}, LD8/f;->c(LD8/f;)Lv8/l;

    move-result-object v2

    iget-object v3, p0, LD8/f$a;->t:LD8/f;

    invoke-static {v3}, LD8/f;->e(LD8/f;)Lv8/l;

    move-result-object v3

    invoke-interface {v3, v0}, Lv8/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v2, v0}, Lv8/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_e

    iput-object v0, p0, LD8/f$a;->r:Ljava/util/Iterator;

    iput v1, p0, LD8/f$a;->s:I

    return v1

    :cond_3d
    const/4 v0, 0x2

    iput v0, p0, LD8/f$a;->s:I

    const/4 v0, 0x0

    iput-object v0, p0, LD8/f$a;->r:Ljava/util/Iterator;

    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public hasNext()Z
    .registers 3

    iget v0, p0, LD8/f$a;->s:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_6

    return v1

    :cond_6
    const/4 v1, 0x2

    if-ne v0, v1, :cond_b

    const/4 p0, 0x0

    return p0

    :cond_b
    invoke-direct {p0}, LD8/f$a;->a()Z

    move-result p0

    return p0
.end method

.method public next()Ljava/lang/Object;
    .registers 3

    iget v0, p0, LD8/f$a;->s:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_21

    if-nez v0, :cond_14

    invoke-direct {p0}, LD8/f$a;->a()Z

    move-result v0

    if-eqz v0, :cond_e

    goto :goto_14

    :cond_e
    new-instance p0, Ljava/util/NoSuchElementException;

    invoke-direct {p0}, Ljava/util/NoSuchElementException;-><init>()V

    throw p0

    :cond_14
    :goto_14
    const/4 v0, 0x0

    iput v0, p0, LD8/f$a;->s:I

    iget-object p0, p0, LD8/f$a;->r:Ljava/util/Iterator;

    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_21
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
