.class public final Li8/K;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Lw8/a;


# instance fields
.field private final q:Ljava/util/Iterator;

.field private r:I


# direct methods
.method public constructor <init>(Ljava/util/Iterator;)V
    .registers 3

    const-string v0, "iterator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li8/K;->q:Ljava/util/Iterator;

    return-void
.end method


# virtual methods
.method public final a()Li8/I;
    .registers 4

    new-instance v0, Li8/I;

    iget v1, p0, Li8/K;->r:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Li8/K;->r:I

    if-gez v1, :cond_d

    invoke-static {}, Li8/u;->t()V

    :cond_d
    iget-object p0, p0, Li8/K;->q:Ljava/util/Iterator;

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Li8/I;-><init>(ILjava/lang/Object;)V

    return-object v0
.end method

.method public final hasNext()Z
    .registers 1

    iget-object p0, p0, Li8/K;->q:Ljava/util/Iterator;

    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p0

    return p0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .registers 1

    invoke-virtual {p0}, Li8/K;->a()Li8/I;

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
