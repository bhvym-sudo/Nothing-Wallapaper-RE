.class public final LB8/f;
.super Li8/L;
.source "SourceFile"


# instance fields
.field private final q:I

.field private final r:I

.field private s:Z

.field private t:I


# direct methods
.method public constructor <init>(III)V
    .registers 6

    invoke-direct {p0}, Li8/L;-><init>()V

    iput p3, p0, LB8/f;->q:I

    iput p2, p0, LB8/f;->r:I

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-lez p3, :cond_f

    if-gt p1, p2, :cond_12

    :goto_d
    move v0, v1

    goto :goto_12

    :cond_f
    if-lt p1, p2, :cond_12

    goto :goto_d

    :cond_12
    :goto_12
    iput-boolean v0, p0, LB8/f;->s:Z

    if-eqz v0, :cond_17

    goto :goto_18

    :cond_17
    move p1, p2

    :goto_18
    iput p1, p0, LB8/f;->t:I

    return-void
.end method


# virtual methods
.method public a()I
    .registers 3

    iget v0, p0, LB8/f;->t:I

    iget v1, p0, LB8/f;->r:I

    if-ne v0, v1, :cond_14

    iget-boolean v1, p0, LB8/f;->s:Z

    if-eqz v1, :cond_e

    const/4 v1, 0x0

    iput-boolean v1, p0, LB8/f;->s:Z

    return v0

    :cond_e
    new-instance p0, Ljava/util/NoSuchElementException;

    invoke-direct {p0}, Ljava/util/NoSuchElementException;-><init>()V

    throw p0

    :cond_14
    iget v1, p0, LB8/f;->q:I

    add-int/2addr v1, v0

    iput v1, p0, LB8/f;->t:I

    return v0
.end method

.method public hasNext()Z
    .registers 1

    iget-boolean p0, p0, LB8/f;->s:Z

    return p0
.end method
