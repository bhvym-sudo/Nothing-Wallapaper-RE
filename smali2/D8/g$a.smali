.class public final LD8/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Lw8/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD8/g;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private q:Ljava/lang/Object;

.field private r:I

.field final synthetic s:LD8/g;


# direct methods
.method constructor <init>(LD8/g;)V
    .registers 2

    iput-object p1, p0, LD8/g$a;->s:LD8/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, -0x2

    iput p1, p0, LD8/g$a;->r:I

    return-void
.end method

.method private final a()V
    .registers 3

    iget v0, p0, LD8/g$a;->r:I

    const/4 v1, -0x2

    if-ne v0, v1, :cond_10

    iget-object v0, p0, LD8/g$a;->s:LD8/g;

    invoke-static {v0}, LD8/g;->c(LD8/g;)Lv8/a;

    move-result-object v0

    invoke-interface {v0}, Lv8/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    goto :goto_1f

    :cond_10
    iget-object v0, p0, LD8/g$a;->s:LD8/g;

    invoke-static {v0}, LD8/g;->d(LD8/g;)Lv8/l;

    move-result-object v0

    iget-object v1, p0, LD8/g$a;->q:Ljava/lang/Object;

    invoke-static {v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Lv8/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_1f
    iput-object v0, p0, LD8/g$a;->q:Ljava/lang/Object;

    if-nez v0, :cond_25

    const/4 v0, 0x0

    goto :goto_26

    :cond_25
    const/4 v0, 0x1

    :goto_26
    iput v0, p0, LD8/g$a;->r:I

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .registers 2

    iget v0, p0, LD8/g$a;->r:I

    if-gez v0, :cond_7

    invoke-direct {p0}, LD8/g$a;->a()V

    :cond_7
    iget p0, p0, LD8/g$a;->r:I

    const/4 v0, 0x1

    if-ne p0, v0, :cond_d

    return v0

    :cond_d
    const/4 p0, 0x0

    return p0
.end method

.method public next()Ljava/lang/Object;
    .registers 3

    iget v0, p0, LD8/g$a;->r:I

    if-gez v0, :cond_7

    invoke-direct {p0}, LD8/g$a;->a()V

    :cond_7
    iget v0, p0, LD8/g$a;->r:I

    if-eqz v0, :cond_16

    iget-object v0, p0, LD8/g$a;->q:Ljava/lang/Object;

    const-string v1, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, -0x1

    iput v1, p0, LD8/g$a;->r:I

    return-object v0

    :cond_16
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
