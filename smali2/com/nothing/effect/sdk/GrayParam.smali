.class public final Lcom/nothing/effect/sdk/GrayParam;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nothing/effect/sdk/GrayParam$a;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/nothing/effect/sdk/GrayParam$a;

.field public static final MAX_SIZE:F = 100.0f

.field public static final MAX_X_FACTOR:F = 1.0f

.field public static final MIN_SIZE:F

.field public static final MIN_X_FACTOR:F


# instance fields
.field private final brightness:F

.field private final factory:F


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lcom/nothing/effect/sdk/GrayParam$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/nothing/effect/sdk/GrayParam$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lcom/nothing/effect/sdk/GrayParam;->Companion:Lcom/nothing/effect/sdk/GrayParam$a;

    return-void
.end method

.method public constructor <init>()V
    .registers 4

    .line 1
    const/4 v0, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v2, v2, v0, v1}, Lcom/nothing/effect/sdk/GrayParam;-><init>(FFILkotlin/jvm/internal/h;)V

    return-void
.end method

.method public constructor <init>(FF)V
    .registers 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/nothing/effect/sdk/GrayParam;->factory:F

    .line 4
    iput p2, p0, Lcom/nothing/effect/sdk/GrayParam;->brightness:F

    return-void
.end method

.method public synthetic constructor <init>(FFILkotlin/jvm/internal/h;)V
    .registers 5

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_6

    const/high16 p1, 0x3f800000    # 1.0f

    :cond_6
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_c

    const/high16 p2, 0x3f000000    # 0.5f

    .line 5
    :cond_c
    invoke-direct {p0, p1, p2}, Lcom/nothing/effect/sdk/GrayParam;-><init>(FF)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/nothing/effect/sdk/GrayParam;FFILjava/lang/Object;)Lcom/nothing/effect/sdk/GrayParam;
    .registers 5

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_6

    iget p1, p0, Lcom/nothing/effect/sdk/GrayParam;->factory:F

    :cond_6
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_c

    iget p2, p0, Lcom/nothing/effect/sdk/GrayParam;->brightness:F

    :cond_c
    invoke-virtual {p0, p1, p2}, Lcom/nothing/effect/sdk/GrayParam;->copy(FF)Lcom/nothing/effect/sdk/GrayParam;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()F
    .registers 1

    iget p0, p0, Lcom/nothing/effect/sdk/GrayParam;->factory:F

    return p0
.end method

.method public final component2()F
    .registers 1

    iget p0, p0, Lcom/nothing/effect/sdk/GrayParam;->brightness:F

    return p0
.end method

.method public final copy(FF)Lcom/nothing/effect/sdk/GrayParam;
    .registers 3

    new-instance p0, Lcom/nothing/effect/sdk/GrayParam;

    invoke-direct {p0, p1, p2}, Lcom/nothing/effect/sdk/GrayParam;-><init>(FF)V

    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_4

    return v0

    :cond_4
    instance-of v1, p1, Lcom/nothing/effect/sdk/GrayParam;

    const/4 v2, 0x0

    if-nez v1, :cond_a

    return v2

    :cond_a
    check-cast p1, Lcom/nothing/effect/sdk/GrayParam;

    iget v1, p0, Lcom/nothing/effect/sdk/GrayParam;->factory:F

    iget v3, p1, Lcom/nothing/effect/sdk/GrayParam;->factory:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_17

    return v2

    :cond_17
    iget p0, p0, Lcom/nothing/effect/sdk/GrayParam;->brightness:F

    iget p1, p1, Lcom/nothing/effect/sdk/GrayParam;->brightness:F

    invoke-static {p0, p1}, Ljava/lang/Float;->compare(FF)I

    move-result p0

    if-eqz p0, :cond_22

    return v2

    :cond_22
    return v0
.end method

.method public final getBrightness()F
    .registers 1

    iget p0, p0, Lcom/nothing/effect/sdk/GrayParam;->brightness:F

    return p0
.end method

.method public final getFactory()F
    .registers 1

    iget p0, p0, Lcom/nothing/effect/sdk/GrayParam;->factory:F

    return p0
.end method

.method public hashCode()I
    .registers 2

    iget v0, p0, Lcom/nothing/effect/sdk/GrayParam;->factory:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget p0, p0, Lcom/nothing/effect/sdk/GrayParam;->brightness:F

    invoke-static {p0}, Ljava/lang/Float;->hashCode(F)I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .registers 4

    iget v0, p0, Lcom/nothing/effect/sdk/GrayParam;->factory:F

    iget p0, p0, Lcom/nothing/effect/sdk/GrayParam;->brightness:F

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "GrayParam(factory="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", brightness="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
