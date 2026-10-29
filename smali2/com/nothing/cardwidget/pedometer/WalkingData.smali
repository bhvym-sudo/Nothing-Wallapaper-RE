.class public final Lcom/nothing/cardwidget/pedometer/WalkingData;
.super Lcom/nothing/cardwidget/pedometer/PedometerData;
.source "SourceFile"


# instance fields
.field private currentProgress:I

.field private isAnimateValid:Z

.field private isJustWalking:Z

.field private refreshProgress:Z

.field private walkingPercent:I


# direct methods
.method public constructor <init>(IZZIZ)V
    .registers 6

    .line 2
    invoke-direct {p0}, Lcom/nothing/cardwidget/pedometer/PedometerData;-><init>()V

    .line 3
    iput p1, p0, Lcom/nothing/cardwidget/pedometer/WalkingData;->walkingPercent:I

    .line 4
    iput-boolean p2, p0, Lcom/nothing/cardwidget/pedometer/WalkingData;->refreshProgress:Z

    .line 5
    iput-boolean p3, p0, Lcom/nothing/cardwidget/pedometer/WalkingData;->isJustWalking:Z

    .line 6
    iput p4, p0, Lcom/nothing/cardwidget/pedometer/WalkingData;->currentProgress:I

    .line 7
    iput-boolean p5, p0, Lcom/nothing/cardwidget/pedometer/WalkingData;->isAnimateValid:Z

    return-void
.end method

.method public synthetic constructor <init>(IZZIZILkotlin/jvm/internal/h;)V
    .registers 9

    and-int/lit8 p7, p6, 0x2

    const/4 v0, 0x0

    if-eqz p7, :cond_6

    move p2, v0

    :cond_6
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_b

    move p3, v0

    :cond_b
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_10

    move p4, v0

    :cond_10
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_15

    const/4 p5, 0x1

    .line 1
    :cond_15
    invoke-direct/range {p0 .. p5}, Lcom/nothing/cardwidget/pedometer/WalkingData;-><init>(IZZIZ)V

    return-void
.end method


# virtual methods
.method public final getCurrentProgress()I
    .registers 1

    iget p0, p0, Lcom/nothing/cardwidget/pedometer/WalkingData;->currentProgress:I

    return p0
.end method

.method public final getRefreshProgress()Z
    .registers 1

    iget-boolean p0, p0, Lcom/nothing/cardwidget/pedometer/WalkingData;->refreshProgress:Z

    return p0
.end method

.method public final getWalkingPercent()I
    .registers 1

    iget p0, p0, Lcom/nothing/cardwidget/pedometer/WalkingData;->walkingPercent:I

    return p0
.end method

.method public final isAnimateValid()Z
    .registers 1

    iget-boolean p0, p0, Lcom/nothing/cardwidget/pedometer/WalkingData;->isAnimateValid:Z

    return p0
.end method

.method public final isJustWalking()Z
    .registers 1

    iget-boolean p0, p0, Lcom/nothing/cardwidget/pedometer/WalkingData;->isJustWalking:Z

    return p0
.end method

.method public final setAnimateValid(Z)V
    .registers 2

    iput-boolean p1, p0, Lcom/nothing/cardwidget/pedometer/WalkingData;->isAnimateValid:Z

    return-void
.end method

.method public final setCurrentProgress(I)V
    .registers 2

    iput p1, p0, Lcom/nothing/cardwidget/pedometer/WalkingData;->currentProgress:I

    return-void
.end method

.method public final setJustWalking(Z)V
    .registers 2

    iput-boolean p1, p0, Lcom/nothing/cardwidget/pedometer/WalkingData;->isJustWalking:Z

    return-void
.end method

.method public final setRefreshProgress(Z)V
    .registers 2

    iput-boolean p1, p0, Lcom/nothing/cardwidget/pedometer/WalkingData;->refreshProgress:Z

    return-void
.end method

.method public final setWalkingPercent(I)V
    .registers 2

    iput p1, p0, Lcom/nothing/cardwidget/pedometer/WalkingData;->walkingPercent:I

    return-void
.end method
