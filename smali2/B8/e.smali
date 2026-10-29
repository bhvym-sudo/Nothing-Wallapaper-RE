.class public LB8/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;
.implements Lw8/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LB8/e$a;
    }
.end annotation


# static fields
.field public static final t:LB8/e$a;


# instance fields
.field private final q:I

.field private final r:I

.field private final s:I


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LB8/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LB8/e$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LB8/e;->t:LB8/e$a;

    return-void
.end method

.method public constructor <init>(III)V
    .registers 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p3, :cond_1c

    const/high16 v0, -0x80000000

    if-eq p3, v0, :cond_14

    iput p1, p0, LB8/e;->q:I

    invoke-static {p1, p2, p3}, Lp8/c;->b(III)I

    move-result p1

    iput p1, p0, LB8/e;->r:I

    iput p3, p0, LB8/e;->s:I

    return-void

    :cond_14
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Step must be greater than Int.MIN_VALUE to avoid overflow on negation."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1c
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Step must be non-zero."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .registers 4

    instance-of v0, p1, LB8/e;

    if-eqz v0, :cond_29

    invoke-virtual {p0}, LB8/e;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_13

    move-object v0, p1

    check-cast v0, LB8/e;

    invoke-virtual {v0}, LB8/e;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_27

    :cond_13
    iget v0, p0, LB8/e;->q:I

    check-cast p1, LB8/e;

    iget v1, p1, LB8/e;->q:I

    if-ne v0, v1, :cond_29

    iget v0, p0, LB8/e;->r:I

    iget v1, p1, LB8/e;->r:I

    if-ne v0, v1, :cond_29

    iget p0, p0, LB8/e;->s:I

    iget p1, p1, LB8/e;->s:I

    if-ne p0, p1, :cond_29

    :cond_27
    const/4 p0, 0x1

    return p0

    :cond_29
    const/4 p0, 0x0

    return p0
.end method

.method public final g()I
    .registers 1

    iget p0, p0, LB8/e;->q:I

    return p0
.end method

.method public hashCode()I
    .registers 3

    invoke-virtual {p0}, LB8/e;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_8

    const/4 p0, -0x1

    return p0

    :cond_8
    iget v0, p0, LB8/e;->q:I

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LB8/e;->r:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget p0, p0, LB8/e;->s:I

    add-int/2addr v0, p0

    return v0
.end method

.method public isEmpty()Z
    .registers 4

    iget v0, p0, LB8/e;->s:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-lez v0, :cond_e

    iget v0, p0, LB8/e;->q:I

    iget p0, p0, LB8/e;->r:I

    if-le v0, p0, :cond_d

    return v2

    :cond_d
    return v1

    :cond_e
    iget v0, p0, LB8/e;->q:I

    iget p0, p0, LB8/e;->r:I

    if-ge v0, p0, :cond_15

    return v2

    :cond_15
    return v1
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .registers 1

    invoke-virtual {p0}, LB8/e;->o()Li8/L;

    move-result-object p0

    return-object p0
.end method

.method public final m()I
    .registers 1

    iget p0, p0, LB8/e;->r:I

    return p0
.end method

.method public final n()I
    .registers 1

    iget p0, p0, LB8/e;->s:I

    return p0
.end method

.method public o()Li8/L;
    .registers 4

    new-instance v0, LB8/f;

    iget v1, p0, LB8/e;->q:I

    iget v2, p0, LB8/e;->r:I

    iget p0, p0, LB8/e;->s:I

    invoke-direct {v0, v1, v2, p0}, LB8/f;-><init>(III)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .registers 4

    iget v0, p0, LB8/e;->s:I

    const-string v1, " step "

    if-lez v0, :cond_27

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v2, p0, LB8/e;->q:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ".."

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, LB8/e;->r:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p0, p0, LB8/e;->s:I

    :goto_1f
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_27
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v2, p0, LB8/e;->q:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " downTo "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, LB8/e;->r:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p0, p0, LB8/e;->s:I

    neg-int p0, p0

    goto :goto_1f
.end method
