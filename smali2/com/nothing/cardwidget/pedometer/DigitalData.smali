.class public final Lcom/nothing/cardwidget/pedometer/DigitalData;
.super Lcom/nothing/cardwidget/pedometer/PedometerData;
.source "SourceFile"


# instance fields
.field private final sevenDayAverage:I

.field private final sevenDayPercent:I

.field private final stepCounter:I

.field private final todayPercent:I


# direct methods
.method public constructor <init>(IIII)V
    .registers 5

    invoke-direct {p0}, Lcom/nothing/cardwidget/pedometer/PedometerData;-><init>()V

    iput p1, p0, Lcom/nothing/cardwidget/pedometer/DigitalData;->stepCounter:I

    iput p2, p0, Lcom/nothing/cardwidget/pedometer/DigitalData;->todayPercent:I

    iput p3, p0, Lcom/nothing/cardwidget/pedometer/DigitalData;->sevenDayAverage:I

    iput p4, p0, Lcom/nothing/cardwidget/pedometer/DigitalData;->sevenDayPercent:I

    return-void
.end method


# virtual methods
.method public final getSevenDayAverage()I
    .registers 1

    iget p0, p0, Lcom/nothing/cardwidget/pedometer/DigitalData;->sevenDayAverage:I

    return p0
.end method

.method public final getSevenDayPercent()I
    .registers 1

    iget p0, p0, Lcom/nothing/cardwidget/pedometer/DigitalData;->sevenDayPercent:I

    return p0
.end method

.method public final getStepCounter()I
    .registers 1

    iget p0, p0, Lcom/nothing/cardwidget/pedometer/DigitalData;->stepCounter:I

    return p0
.end method

.method public final getTodayPercent()I
    .registers 1

    iget p0, p0, Lcom/nothing/cardwidget/pedometer/DigitalData;->todayPercent:I

    return p0
.end method
