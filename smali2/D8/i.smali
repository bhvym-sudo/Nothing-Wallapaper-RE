.class final LD8/i;
.super LD8/j;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Lm8/e;
.implements Lw8/a;


# instance fields
.field private q:I

.field private r:Ljava/lang/Object;

.field private s:Ljava/util/Iterator;

.field private t:Lm8/e;


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, LD8/j;-><init>()V

    return-void
.end method

.method private final g()Ljava/lang/Throwable;
    .registers 4

    iget v0, p0, LD8/i;->q:I

    const/4 v1, 0x4

    if-eq v0, v1, :cond_29

    const/4 v1, 0x5

    if-eq v0, v1, :cond_21

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected state of the iterator: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p0, p0, LD8/i;->q:I

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_21
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Iterator has failed."

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    return-object p0

    :cond_29
    new-instance p0, Ljava/util/NoSuchElementException;

    invoke-direct {p0}, Ljava/util/NoSuchElementException;-><init>()V

    return-object p0
.end method

.method private final h()Ljava/lang/Object;
    .registers 2

    invoke-virtual {p0}, LD8/i;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-virtual {p0}, LD8/i;->next()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_b
    new-instance p0, Ljava/util/NoSuchElementException;

    invoke-direct {p0}, Ljava/util/NoSuchElementException;-><init>()V

    throw p0
.end method


# virtual methods
.method public c(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
    .registers 3

    iput-object p1, p0, LD8/i;->r:Ljava/lang/Object;

    const/4 p1, 0x3

    iput p1, p0, LD8/i;->q:I

    iput-object p2, p0, LD8/i;->t:Lm8/e;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_14

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/h;->c(Lm8/e;)V

    :cond_14
    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_1b

    return-object p0

    :cond_1b
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public f(Ljava/util/Iterator;Lm8/e;)Ljava/lang/Object;
    .registers 4

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_9

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_9
    iput-object p1, p0, LD8/i;->s:Ljava/util/Iterator;

    const/4 p1, 0x2

    iput p1, p0, LD8/i;->q:I

    iput-object p2, p0, LD8/i;->t:Lm8/e;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_1d

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/h;->c(Lm8/e;)V

    :cond_1d
    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_24

    return-object p0

    :cond_24
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public getContext()Lm8/i;
    .registers 1

    sget-object p0, Lm8/j;->q:Lm8/j;

    return-object p0
.end method

.method public hasNext()Z
    .registers 5

    :goto_0
    iget v0, p0, LD8/i;->q:I

    const/4 v1, 0x0

    if-eqz v0, :cond_29

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eq v0, v3, :cond_19

    if-eq v0, v2, :cond_18

    const/4 v1, 0x3

    if-eq v0, v1, :cond_18

    const/4 v1, 0x4

    if-ne v0, v1, :cond_13

    const/4 p0, 0x0

    return p0

    :cond_13
    invoke-direct {p0}, LD8/i;->g()Ljava/lang/Throwable;

    move-result-object p0

    throw p0

    :cond_18
    return v3

    :cond_19
    iget-object v0, p0, LD8/i;->s:Ljava/util/Iterator;

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_27

    iput v2, p0, LD8/i;->q:I

    return v3

    :cond_27
    iput-object v1, p0, LD8/i;->s:Ljava/util/Iterator;

    :cond_29
    const/4 v0, 0x5

    iput v0, p0, LD8/i;->q:I

    iget-object v0, p0, LD8/i;->t:Lm8/e;

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iput-object v1, p0, LD8/i;->t:Lm8/e;

    sget-object v1, Lh8/q;->r:Lh8/q$a;

    sget-object v1, Lh8/A;->a:Lh8/A;

    invoke-static {v1}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Lm8/e;->resumeWith(Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public final l(Lm8/e;)V
    .registers 2

    iput-object p1, p0, LD8/i;->t:Lm8/e;

    return-void
.end method

.method public next()Ljava/lang/Object;
    .registers 4

    iget v0, p0, LD8/i;->q:I

    if-eqz v0, :cond_27

    const/4 v1, 0x1

    if-eq v0, v1, :cond_27

    const/4 v2, 0x2

    if-eq v0, v2, :cond_1b

    const/4 v1, 0x3

    if-ne v0, v1, :cond_16

    const/4 v0, 0x0

    iput v0, p0, LD8/i;->q:I

    iget-object v0, p0, LD8/i;->r:Ljava/lang/Object;

    const/4 v1, 0x0

    iput-object v1, p0, LD8/i;->r:Ljava/lang/Object;

    return-object v0

    :cond_16
    invoke-direct {p0}, LD8/i;->g()Ljava/lang/Throwable;

    move-result-object p0

    throw p0

    :cond_1b
    iput v1, p0, LD8/i;->q:I

    iget-object p0, p0, LD8/i;->s:Ljava/util/Iterator;

    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_27
    invoke-direct {p0}, LD8/i;->h()Ljava/lang/Object;

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

.method public resumeWith(Ljava/lang/Object;)V
    .registers 2

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    const/4 p1, 0x4

    iput p1, p0, LD8/i;->q:I

    return-void
.end method
