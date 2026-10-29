.class public final Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic q:Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;


# direct methods
.method constructor <init>(Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView$b;->q:Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 6

    iget-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView$b;->q:Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;

    invoke-static {v0}, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->O(Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;)Z

    move-result v0

    if-eqz v0, :cond_4c

    iget-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView$b;->q:Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;

    invoke-static {v0}, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->L(Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;)Z

    move-result v0

    if-nez v0, :cond_4c

    iget-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView$b;->q:Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;

    invoke-static {v0}, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->K(Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;)[Landroid/graphics/Rect;

    move-result-object v0

    array-length v0, v0

    const/4 v1, 0x0

    move v2, v1

    :goto_19
    if-ge v1, v0, :cond_45

    iget-object v3, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView$b;->q:Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;

    invoke-static {v3}, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->N(Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;)I

    move-result v3

    iget-object v4, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView$b;->q:Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;

    invoke-static {v4}, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->M(Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;)[Ljava/lang/Integer;

    move-result-object v4

    aget-object v4, v4, v1

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-eq v3, v4, :cond_42

    iget-object v2, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView$b;->q:Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;

    invoke-static {v2}, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->M(Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;)[Ljava/lang/Integer;

    move-result-object v2

    iget-object v3, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView$b;->q:Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;

    invoke-static {v3}, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->N(Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v1

    const/4 v2, 0x1

    :cond_42
    add-int/lit8 v1, v1, 0x1

    goto :goto_19

    :cond_45
    if-eqz v2, :cond_4c

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView$b;->q:Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->invalidate()V

    :cond_4c
    return-void
.end method
