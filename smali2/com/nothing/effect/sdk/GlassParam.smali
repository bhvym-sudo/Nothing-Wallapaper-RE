.class public final Lcom/nothing/effect/sdk/GlassParam;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nothing/effect/sdk/GlassParam$a;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/nothing/effect/sdk/GlassParam$a;

.field public static final MAX_SIZE:F = 32.0f

.field public static final MAX_X_FACTOR:F = 1.0f

.field public static final MIN_SIZE:F = 1.0f

.field public static final MIN_X_FACTOR:F


# instance fields
.field private final size:I

.field private final xFactorA:F

.field private final xFactorB:F

.field private final xFactorC:F


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lcom/nothing/effect/sdk/GlassParam$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/nothing/effect/sdk/GlassParam$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lcom/nothing/effect/sdk/GlassParam;->Companion:Lcom/nothing/effect/sdk/GlassParam$a;

    return-void
.end method

.method public constructor <init>()V
    .registers 8

    .line 1
    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/nothing/effect/sdk/GlassParam;-><init>(IFFFILkotlin/jvm/internal/h;)V

    return-void
.end method

.method public constructor <init>(IFFF)V
    .registers 5

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/nothing/effect/sdk/GlassParam;->size:I

    .line 4
    iput p2, p0, Lcom/nothing/effect/sdk/GlassParam;->xFactorA:F

    .line 5
    iput p3, p0, Lcom/nothing/effect/sdk/GlassParam;->xFactorB:F

    .line 6
    iput p4, p0, Lcom/nothing/effect/sdk/GlassParam;->xFactorC:F

    return-void
.end method

.method public synthetic constructor <init>(IFFFILkotlin/jvm/internal/h;)V
    .registers 7

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_6

    const/16 p1, 0x20

    :cond_6
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_d

    const p2, 0x3ea04189    # 0.313f

    :cond_d
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_14

    const p3, 0x3e4ed917    # 0.202f

    :cond_14
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1b

    const p4, 0x3cf5c28f    # 0.03f

    .line 7
    :cond_1b
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/nothing/effect/sdk/GlassParam;-><init>(IFFF)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/nothing/effect/sdk/GlassParam;IFFFILjava/lang/Object;)Lcom/nothing/effect/sdk/GlassParam;
    .registers 7

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_6

    iget p1, p0, Lcom/nothing/effect/sdk/GlassParam;->size:I

    :cond_6
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_c

    iget p2, p0, Lcom/nothing/effect/sdk/GlassParam;->xFactorA:F

    :cond_c
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_12

    iget p3, p0, Lcom/nothing/effect/sdk/GlassParam;->xFactorB:F

    :cond_12
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_18

    iget p4, p0, Lcom/nothing/effect/sdk/GlassParam;->xFactorC:F

    :cond_18
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/nothing/effect/sdk/GlassParam;->copy(IFFF)Lcom/nothing/effect/sdk/GlassParam;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .registers 1

    iget p0, p0, Lcom/nothing/effect/sdk/GlassParam;->size:I

    return p0
.end method

.method public final component2()F
    .registers 1

    iget p0, p0, Lcom/nothing/effect/sdk/GlassParam;->xFactorA:F

    return p0
.end method

.method public final component3()F
    .registers 1

    iget p0, p0, Lcom/nothing/effect/sdk/GlassParam;->xFactorB:F

    return p0
.end method

.method public final component4()F
    .registers 1

    iget p0, p0, Lcom/nothing/effect/sdk/GlassParam;->xFactorC:F

    return p0
.end method

.method public final copy(IFFF)Lcom/nothing/effect/sdk/GlassParam;
    .registers 5

    new-instance p0, Lcom/nothing/effect/sdk/GlassParam;

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/nothing/effect/sdk/GlassParam;-><init>(IFFF)V

    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_4

    return v0

    :cond_4
    instance-of v1, p1, Lcom/nothing/effect/sdk/GlassParam;

    const/4 v2, 0x0

    if-nez v1, :cond_a

    return v2

    :cond_a
    check-cast p1, Lcom/nothing/effect/sdk/GlassParam;

    iget v1, p0, Lcom/nothing/effect/sdk/GlassParam;->size:I

    iget v3, p1, Lcom/nothing/effect/sdk/GlassParam;->size:I

    if-eq v1, v3, :cond_13

    return v2

    :cond_13
    iget v1, p0, Lcom/nothing/effect/sdk/GlassParam;->xFactorA:F

    iget v3, p1, Lcom/nothing/effect/sdk/GlassParam;->xFactorA:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_1e

    return v2

    :cond_1e
    iget v1, p0, Lcom/nothing/effect/sdk/GlassParam;->xFactorB:F

    iget v3, p1, Lcom/nothing/effect/sdk/GlassParam;->xFactorB:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_29

    return v2

    :cond_29
    iget p0, p0, Lcom/nothing/effect/sdk/GlassParam;->xFactorC:F

    iget p1, p1, Lcom/nothing/effect/sdk/GlassParam;->xFactorC:F

    invoke-static {p0, p1}, Ljava/lang/Float;->compare(FF)I

    move-result p0

    if-eqz p0, :cond_34

    return v2

    :cond_34
    return v0
.end method

.method public final getSize()I
    .registers 1

    iget p0, p0, Lcom/nothing/effect/sdk/GlassParam;->size:I

    return p0
.end method

.method public final getXFactorA()F
    .registers 1

    iget p0, p0, Lcom/nothing/effect/sdk/GlassParam;->xFactorA:F

    return p0
.end method

.method public final getXFactorB()F
    .registers 1

    iget p0, p0, Lcom/nothing/effect/sdk/GlassParam;->xFactorB:F

    return p0
.end method

.method public final getXFactorC()F
    .registers 1

    iget p0, p0, Lcom/nothing/effect/sdk/GlassParam;->xFactorC:F

    return p0
.end method

.method public hashCode()I
    .registers 3

    iget v0, p0, Lcom/nothing/effect/sdk/GlassParam;->size:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/nothing/effect/sdk/GlassParam;->xFactorA:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/nothing/effect/sdk/GlassParam;->xFactorB:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget p0, p0, Lcom/nothing/effect/sdk/GlassParam;->xFactorC:F

    invoke-static {p0}, Ljava/lang/Float;->hashCode(F)I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .registers 6

    iget v0, p0, Lcom/nothing/effect/sdk/GlassParam;->size:I

    iget v1, p0, Lcom/nothing/effect/sdk/GlassParam;->xFactorA:F

    iget v2, p0, Lcom/nothing/effect/sdk/GlassParam;->xFactorB:F

    iget p0, p0, Lcom/nothing/effect/sdk/GlassParam;->xFactorC:F

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "GlassParam(size="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", xFactorA="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", xFactorB="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", xFactorC="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
