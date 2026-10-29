.class public final synthetic Lcom/nothing/systemui/shared/clocks/view/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;I)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/nothing/systemui/shared/clocks/view/v;->a:Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;

    iput p2, p0, Lcom/nothing/systemui/shared/clocks/view/v;->b:I

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .registers 3

    iget-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/v;->a:Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;

    iget p0, p0, Lcom/nothing/systemui/shared/clocks/view/v;->b:I

    invoke-static {v0, p0, p1}, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->J(Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;ILandroid/animation/ValueAnimator;)V

    return-void
.end method
