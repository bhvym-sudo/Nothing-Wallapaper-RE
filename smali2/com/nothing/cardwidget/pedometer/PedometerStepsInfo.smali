.class public final Lcom/nothing/cardwidget/pedometer/PedometerStepsInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final date:J
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "date"
    .end annotation
.end field

.field private final steps:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "steps"
    .end annotation
.end field

.field private final target:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "target"
    .end annotation
.end field


# direct methods
.method public constructor <init>(JII)V
    .registers 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/nothing/cardwidget/pedometer/PedometerStepsInfo;->date:J

    iput p3, p0, Lcom/nothing/cardwidget/pedometer/PedometerStepsInfo;->steps:I

    iput p4, p0, Lcom/nothing/cardwidget/pedometer/PedometerStepsInfo;->target:I

    return-void
.end method

.method public static synthetic copy$default(Lcom/nothing/cardwidget/pedometer/PedometerStepsInfo;JIIILjava/lang/Object;)Lcom/nothing/cardwidget/pedometer/PedometerStepsInfo;
    .registers 7

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_6

    iget-wide p1, p0, Lcom/nothing/cardwidget/pedometer/PedometerStepsInfo;->date:J

    :cond_6
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_c

    iget p3, p0, Lcom/nothing/cardwidget/pedometer/PedometerStepsInfo;->steps:I

    :cond_c
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_12

    iget p4, p0, Lcom/nothing/cardwidget/pedometer/PedometerStepsInfo;->target:I

    :cond_12
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/nothing/cardwidget/pedometer/PedometerStepsInfo;->copy(JII)Lcom/nothing/cardwidget/pedometer/PedometerStepsInfo;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .registers 3

    iget-wide v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerStepsInfo;->date:J

    return-wide v0
.end method

.method public final component2()I
    .registers 1

    iget p0, p0, Lcom/nothing/cardwidget/pedometer/PedometerStepsInfo;->steps:I

    return p0
.end method

.method public final component3()I
    .registers 1

    iget p0, p0, Lcom/nothing/cardwidget/pedometer/PedometerStepsInfo;->target:I

    return p0
.end method

.method public final copy(JII)Lcom/nothing/cardwidget/pedometer/PedometerStepsInfo;
    .registers 5

    new-instance p0, Lcom/nothing/cardwidget/pedometer/PedometerStepsInfo;

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/nothing/cardwidget/pedometer/PedometerStepsInfo;-><init>(JII)V

    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 9

    const/4 v0, 0x1

    if-ne p0, p1, :cond_4

    return v0

    :cond_4
    instance-of v1, p1, Lcom/nothing/cardwidget/pedometer/PedometerStepsInfo;

    const/4 v2, 0x0

    if-nez v1, :cond_a

    return v2

    :cond_a
    check-cast p1, Lcom/nothing/cardwidget/pedometer/PedometerStepsInfo;

    iget-wide v3, p0, Lcom/nothing/cardwidget/pedometer/PedometerStepsInfo;->date:J

    iget-wide v5, p1, Lcom/nothing/cardwidget/pedometer/PedometerStepsInfo;->date:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_15

    return v2

    :cond_15
    iget v1, p0, Lcom/nothing/cardwidget/pedometer/PedometerStepsInfo;->steps:I

    iget v3, p1, Lcom/nothing/cardwidget/pedometer/PedometerStepsInfo;->steps:I

    if-eq v1, v3, :cond_1c

    return v2

    :cond_1c
    iget p0, p0, Lcom/nothing/cardwidget/pedometer/PedometerStepsInfo;->target:I

    iget p1, p1, Lcom/nothing/cardwidget/pedometer/PedometerStepsInfo;->target:I

    if-eq p0, p1, :cond_23

    return v2

    :cond_23
    return v0
.end method

.method public final getDate()J
    .registers 3

    iget-wide v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerStepsInfo;->date:J

    return-wide v0
.end method

.method public final getSteps()I
    .registers 1

    iget p0, p0, Lcom/nothing/cardwidget/pedometer/PedometerStepsInfo;->steps:I

    return p0
.end method

.method public final getTarget()I
    .registers 1

    iget p0, p0, Lcom/nothing/cardwidget/pedometer/PedometerStepsInfo;->target:I

    return p0
.end method

.method public hashCode()I
    .registers 3

    iget-wide v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerStepsInfo;->date:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/nothing/cardwidget/pedometer/PedometerStepsInfo;->steps:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget p0, p0, Lcom/nothing/cardwidget/pedometer/PedometerStepsInfo;->target:I

    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .registers 6

    iget-wide v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerStepsInfo;->date:J

    iget v2, p0, Lcom/nothing/cardwidget/pedometer/PedometerStepsInfo;->steps:I

    iget p0, p0, Lcom/nothing/cardwidget/pedometer/PedometerStepsInfo;->target:I

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "PedometerStepsInfo(date="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", steps="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", target="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
