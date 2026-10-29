.class public final LE8/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Lw8/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE8/e;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private q:I

.field private r:I

.field private s:I

.field private t:LB8/g;

.field private u:I

.field final synthetic v:LE8/e;


# direct methods
.method constructor <init>(LE8/e;)V
    .registers 4

    iput-object p1, p0, LE8/e$a;->v:LE8/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, LE8/e$a;->q:I

    invoke-static {p1}, LE8/e;->f(LE8/e;)I

    move-result v0

    invoke-static {p1}, LE8/e;->d(LE8/e;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    const/4 v1, 0x0

    invoke-static {v0, v1, p1}, LB8/h;->m(III)I

    move-result p1

    iput p1, p0, LE8/e$a;->r:I

    iput p1, p0, LE8/e$a;->s:I

    return-void
.end method

.method private final a()V
    .registers 7

    iget v0, p0, LE8/e$a;->s:I

    const/4 v1, 0x0

    if-gez v0, :cond_b

    iput v1, p0, LE8/e$a;->q:I

    const/4 v0, 0x0

    iput-object v0, p0, LE8/e$a;->t:LB8/g;

    return-void

    :cond_b
    iget-object v0, p0, LE8/e$a;->v:LE8/e;

    invoke-static {v0}, LE8/e;->e(LE8/e;)I

    move-result v0

    const/4 v2, -0x1

    const/4 v3, 0x1

    if-lez v0, :cond_22

    iget v0, p0, LE8/e$a;->u:I

    add-int/2addr v0, v3

    iput v0, p0, LE8/e$a;->u:I

    iget-object v4, p0, LE8/e$a;->v:LE8/e;

    invoke-static {v4}, LE8/e;->e(LE8/e;)I

    move-result v4

    if-ge v0, v4, :cond_30

    :cond_22
    iget v0, p0, LE8/e$a;->s:I

    iget-object v4, p0, LE8/e$a;->v:LE8/e;

    invoke-static {v4}, LE8/e;->d(LE8/e;)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-le v0, v4, :cond_46

    :cond_30
    new-instance v0, LB8/g;

    iget v1, p0, LE8/e$a;->r:I

    iget-object v4, p0, LE8/e$a;->v:LE8/e;

    invoke-static {v4}, LE8/e;->d(LE8/e;)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-static {v4}, LE8/w;->X(Ljava/lang/CharSequence;)I

    move-result v4

    invoke-direct {v0, v1, v4}, LB8/g;-><init>(II)V

    iput-object v0, p0, LE8/e$a;->t:LB8/g;

    iput v2, p0, LE8/e$a;->s:I

    goto :goto_9b

    :cond_46
    iget-object v0, p0, LE8/e$a;->v:LE8/e;

    invoke-static {v0}, LE8/e;->c(LE8/e;)Lv8/p;

    move-result-object v0

    iget-object v4, p0, LE8/e$a;->v:LE8/e;

    invoke-static {v4}, LE8/e;->d(LE8/e;)Ljava/lang/CharSequence;

    move-result-object v4

    iget v5, p0, LE8/e$a;->s:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v0, v4, v5}, Lv8/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh8/o;

    if-nez v0, :cond_76

    new-instance v0, LB8/g;

    iget v1, p0, LE8/e$a;->r:I

    iget-object v4, p0, LE8/e$a;->v:LE8/e;

    invoke-static {v4}, LE8/e;->d(LE8/e;)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-static {v4}, LE8/w;->X(Ljava/lang/CharSequence;)I

    move-result v4

    invoke-direct {v0, v1, v4}, LB8/g;-><init>(II)V

    iput-object v0, p0, LE8/e$a;->t:LB8/g;

    iput v2, p0, LE8/e$a;->s:I

    goto :goto_9b

    :cond_76
    invoke-virtual {v0}, Lh8/o;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {v0}, Lh8/o;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    iget v4, p0, LE8/e$a;->r:I

    invoke-static {v4, v2}, LB8/h;->q(II)LB8/g;

    move-result-object v4

    iput-object v4, p0, LE8/e$a;->t:LB8/g;

    add-int/2addr v2, v0

    iput v2, p0, LE8/e$a;->r:I

    if-nez v0, :cond_98

    move v1, v3

    :cond_98
    add-int/2addr v2, v1

    iput v2, p0, LE8/e$a;->s:I

    :goto_9b
    iput v3, p0, LE8/e$a;->q:I

    return-void
.end method


# virtual methods
.method public c()LB8/g;
    .registers 4

    iget v0, p0, LE8/e$a;->q:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_8

    invoke-direct {p0}, LE8/e$a;->a()V

    :cond_8
    iget v0, p0, LE8/e$a;->q:I

    if-eqz v0, :cond_19

    iget-object v0, p0, LE8/e$a;->t:LB8/g;

    const-string v2, "null cannot be cast to non-null type kotlin.ranges.IntRange"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    iput-object v2, p0, LE8/e$a;->t:LB8/g;

    iput v1, p0, LE8/e$a;->q:I

    return-object v0

    :cond_19
    new-instance p0, Ljava/util/NoSuchElementException;

    invoke-direct {p0}, Ljava/util/NoSuchElementException;-><init>()V

    throw p0
.end method

.method public hasNext()Z
    .registers 3

    iget v0, p0, LE8/e$a;->q:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_8

    invoke-direct {p0}, LE8/e$a;->a()V

    :cond_8
    iget p0, p0, LE8/e$a;->q:I

    const/4 v0, 0x1

    if-ne p0, v0, :cond_e

    return v0

    :cond_e
    const/4 p0, 0x0

    return p0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .registers 1

    invoke-virtual {p0}, LE8/e$a;->c()LB8/g;

    move-result-object p0

    return-object p0
.end method

.method public remove()V
    .registers 2

    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Operation is not supported for read-only collection"

    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
