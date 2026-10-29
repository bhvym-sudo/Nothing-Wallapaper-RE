.class final LE8/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Lw8/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LE8/f$a;
    }
.end annotation


# static fields
.field private static final v:LE8/f$a;


# instance fields
.field private final q:Ljava/lang/CharSequence;

.field private r:I

.field private s:I

.field private t:I

.field private u:I


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LE8/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LE8/f$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LE8/f;->v:LE8/f$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/CharSequence;)V
    .registers 3

    const-string v0, "string"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LE8/f;->q:Ljava/lang/CharSequence;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .registers 4

    invoke-virtual {p0}, LE8/f;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1d

    const/4 v0, 0x0

    iput v0, p0, LE8/f;->r:I

    iget v0, p0, LE8/f;->t:I

    iget v1, p0, LE8/f;->s:I

    iget v2, p0, LE8/f;->u:I

    add-int/2addr v2, v0

    iput v2, p0, LE8/f;->s:I

    iget-object p0, p0, LE8/f;->q:Ljava/lang/CharSequence;

    invoke-interface {p0, v1, v0}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1d
    new-instance p0, Ljava/util/NoSuchElementException;

    invoke-direct {p0}, Ljava/util/NoSuchElementException;-><init>()V

    throw p0
.end method

.method public hasNext()Z
    .registers 9

    iget v0, p0, LE8/f;->r:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_a

    if-ne v0, v2, :cond_9

    return v2

    :cond_9
    return v1

    :cond_a
    iget v0, p0, LE8/f;->u:I

    const/4 v3, 0x2

    if-gez v0, :cond_12

    iput v3, p0, LE8/f;->r:I

    return v1

    :cond_12
    iget-object v0, p0, LE8/f;->q:Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    iget v1, p0, LE8/f;->s:I

    iget-object v4, p0, LE8/f;->q:Ljava/lang/CharSequence;

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v4

    :goto_20
    if-ge v1, v4, :cond_4b

    iget-object v5, p0, LE8/f;->q:Ljava/lang/CharSequence;

    invoke-interface {v5, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    const/16 v6, 0xd

    const/16 v7, 0xa

    if-eq v5, v7, :cond_33

    if-eq v5, v6, :cond_33

    add-int/lit8 v1, v1, 0x1

    goto :goto_20

    :cond_33
    if-ne v5, v6, :cond_48

    add-int/lit8 v0, v1, 0x1

    iget-object v4, p0, LE8/f;->q:Ljava/lang/CharSequence;

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-ge v0, v4, :cond_48

    iget-object v4, p0, LE8/f;->q:Ljava/lang/CharSequence;

    invoke-interface {v4, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    if-ne v0, v7, :cond_48

    goto :goto_49

    :cond_48
    move v3, v2

    :goto_49
    move v0, v1

    goto :goto_4c

    :cond_4b
    const/4 v3, -0x1

    :goto_4c
    iput v2, p0, LE8/f;->r:I

    iput v3, p0, LE8/f;->u:I

    iput v0, p0, LE8/f;->t:I

    return v2
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .registers 1

    invoke-virtual {p0}, LE8/f;->a()Ljava/lang/String;

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
