.class public final synthetic Lcom/nothing/systemui/shared/clocks/view/P;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Lcom/nothing/systemui/shared/clocks/view/SpaceAgeClockView;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Lcom/nothing/systemui/shared/clocks/view/SpaceAgeClockView;I)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/nothing/systemui/shared/clocks/view/P;->a:Lcom/nothing/systemui/shared/clocks/view/SpaceAgeClockView;

    iput p2, p0, Lcom/nothing/systemui/shared/clocks/view/P;->b:I

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .registers 3

    iget-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/P;->a:Lcom/nothing/systemui/shared/clocks/view/SpaceAgeClockView;

    iget p0, p0, Lcom/nothing/systemui/shared/clocks/view/P;->b:I

    invoke-static {v0, p0, p1}, Lcom/nothing/systemui/shared/clocks/view/SpaceAgeClockView;->J(Lcom/nothing/systemui/shared/clocks/view/SpaceAgeClockView;ILandroid/animation/ValueAnimator;)V

    return-void
.end method
