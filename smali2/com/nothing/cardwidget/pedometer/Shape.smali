.class public Lcom/nothing/cardwidget/pedometer/Shape;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final color:I

.field private final pivotX:F

.field private final pivotY:F


# direct methods
.method public constructor <init>(FFI)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/nothing/cardwidget/pedometer/Shape;->pivotX:F

    iput p2, p0, Lcom/nothing/cardwidget/pedometer/Shape;->pivotY:F

    iput p3, p0, Lcom/nothing/cardwidget/pedometer/Shape;->color:I

    return-void
.end method


# virtual methods
.method public final getColor()I
    .registers 1

    iget p0, p0, Lcom/nothing/cardwidget/pedometer/Shape;->color:I

    return p0
.end method

.method public final getPivotX()F
    .registers 1

    iget p0, p0, Lcom/nothing/cardwidget/pedometer/Shape;->pivotX:F

    return p0
.end method

.method public final getPivotY()F
    .registers 1

    iget p0, p0, Lcom/nothing/cardwidget/pedometer/Shape;->pivotY:F

    return p0
.end method
