.class public final Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;
.super Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;
.source "SourceFile"


# instance fields
.field private final q:Lq6/b;

.field private r:Lv8/a;

.field private s:Lv8/a;

.field private t:Lv8/p;

.field private u:Z

.field private v:Landroid/graphics/Insets;

.field private final w:Lh8/h;

.field private x:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance p1, Lq6/b;

    invoke-direct {p1, p0}, Lq6/b;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;->q:Lq6/b;

    new-instance p1, Ln7/a;

    invoke-direct {p1, p0}, Ln7/a;-><init>(Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;)V

    invoke-static {p1}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p1

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;->w:Lh8/h;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;->x:Z

    return-void
.end method

.method public static synthetic a(Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;)Landroid/graphics/Point;
    .registers 1

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;->d(Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;)Landroid/graphics/Point;

    move-result-object p0

    return-object p0
.end method

.method private final c(Ljava/lang/Float;Landroid/graphics/PointF;)V
    .registers 6

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    goto :goto_b

    :cond_7
    invoke-virtual {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->getScale()F

    move-result p1

    :goto_b
    new-instance v0, Landroid/graphics/Point;

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    invoke-direct {v0, v1, v2}, Landroid/graphics/Point;-><init>(II)V

    new-instance v1, Landroid/graphics/Point;

    invoke-virtual {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->getSWidth()I

    move-result v2

    invoke-virtual {p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->getSHeight()I

    move-result p0

    invoke-direct {v1, v2, p0}, Landroid/graphics/Point;-><init>(II)V

    invoke-static {p1, v0, v1, p2}, LG6/b;->j(FLandroid/graphics/Point;Landroid/graphics/Point;Landroid/graphics/PointF;)Z

    return-void
.end method

.method private static final d(Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;)Landroid/graphics/Point;
    .registers 2

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    const-string v0, "getContext(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Li6/q;->d(Landroid/content/Context;)Landroid/graphics/Point;

    move-result-object p0

    return-object p0
.end method

.method private final getScreenSize()Landroid/graphics/Point;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;->w:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/graphics/Point;

    return-object p0
.end method


# virtual methods
.method public final b(Landroid/view/MotionEvent;)Z
    .registers 7

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;->v:Landroid/graphics/Insets;

    const/4 v1, 0x0

    if-eqz v0, :cond_43

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v3

    float-to-int v3, v3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result p1

    float-to-int p1, p1

    if-eqz v2, :cond_21

    const/4 v4, 0x5

    if-eq v2, v4, :cond_21

    const/16 v4, 0x105

    if-ne v2, v4, :cond_40

    :cond_21
    iget v2, v0, Landroid/graphics/Insets;->left:I

    if-le v3, v2, :cond_41

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;->getScreenSize()Landroid/graphics/Point;

    move-result-object v2

    iget v2, v2, Landroid/graphics/Point;->x:I

    iget v4, v0, Landroid/graphics/Insets;->right:I

    sub-int/2addr v2, v4

    if-ge v3, v2, :cond_41

    iget v2, v0, Landroid/graphics/Insets;->top:I

    if-le p1, v2, :cond_41

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;->getScreenSize()Landroid/graphics/Point;

    move-result-object p0

    iget p0, p0, Landroid/graphics/Point;->y:I

    iget v0, v0, Landroid/graphics/Insets;->bottom:I

    sub-int/2addr p0, v0

    if-lt p1, p0, :cond_40

    goto :goto_41

    :cond_40
    return v1

    :cond_41
    :goto_41
    const/4 p0, 0x1

    return p0

    :cond_43
    return v1
.end method

.method public final getCanHandleTouchEvent()Z
    .registers 1

    iget-boolean p0, p0, Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;->x:Z

    return p0
.end method

.method public final getOnStartTouchListener()Lv8/a;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lv8/a;"
        }
    .end annotation

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;->r:Lv8/a;

    return-object p0
.end method

.method public final getOnStateEndListener()Lv8/a;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lv8/a;"
        }
    .end annotation

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;->s:Lv8/a;

    return-object p0
.end method

.method public final getOnStatePreEndListener()Lv8/p;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lv8/p;"
        }
    .end annotation

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;->t:Lv8/p;

    return-object p0
.end method

.method public onApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .registers 3

    const-string v0, "insets"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Landroid/view/WindowInsets$Type;->systemGestures()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/WindowInsets;->getInsets(I)Landroid/graphics/Insets;

    move-result-object v0

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;->v:Landroid/graphics/Insets;

    invoke-super {p0, p1}, Landroid/view/View;->onApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object p0

    return-object p0
.end method

.method protected onFlingEnd(I)V
    .registers 5

    invoke-super {p0, p1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->onFlingEnd(I)V

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;->q:Lq6/b;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onFlingEnd: endType "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lq6/b;->a(Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;->u:Z

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2d

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;->q:Lq6/b;

    const-string v0, "notify onStateEnd."

    invoke-virtual {p1, v0}, Lq6/b;->a(Ljava/lang/String;)V

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;->s:Lv8/a;

    if-eqz p0, :cond_2d

    invoke-interface {p0}, Lv8/a;->invoke()Ljava/lang/Object;

    :cond_2d
    return-void
.end method

.method protected onFlingStart(Landroid/graphics/PointF;)V
    .registers 5

    const-string v0, "endCenter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->onFlingStart(Landroid/graphics/PointF;)V

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;->q:Lq6/b;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onFlingStart, and notify onStatePreEndListener: scale=null,center="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lq6/b;->a(Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;->u:Z

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1}, Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;->c(Ljava/lang/Float;Landroid/graphics/PointF;)V

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;->t:Lv8/p;

    if-eqz p0, :cond_2c

    invoke-interface {p0, v0, p1}, Lv8/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2c
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .registers 4

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;->x:Z

    const/4 v1, 0x0

    if-nez v0, :cond_b

    return v1

    :cond_b
    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;->b(Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_17

    const-string p0, "onTouchEvent is navigation area, ignored"

    invoke-static {p0}, Lcom/nothing/wallpaper/common/log/c;->c(Ljava/lang/String;)V

    return v1

    :cond_17
    iget-object v0, p0, Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;->r:Lv8/a;

    if-eqz v0, :cond_1e

    invoke-interface {v0}, Lv8/a;->invoke()Ljava/lang/Object;

    :cond_1e
    invoke-super {p0, p1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_48

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    const/4 v1, 0x1

    if-eq p1, v1, :cond_2f

    const/4 v1, 0x3

    if-eq p1, v1, :cond_2f

    goto :goto_48

    :cond_2f
    iget-object p1, p0, Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;->q:Lq6/b;

    const-string v1, "motion end and notify onTouchEnd."

    invoke-virtual {p1, v1}, Lq6/b;->a(Ljava/lang/String;)V

    iget-boolean p1, p0, Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;->u:Z

    if-nez p1, :cond_48

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;->q:Lq6/b;

    const-string v1, "notify onStateEnd."

    invoke-virtual {p1, v1}, Lq6/b;->a(Ljava/lang/String;)V

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;->s:Lv8/a;

    if-eqz p0, :cond_48

    invoke-interface {p0}, Lv8/a;->invoke()Ljava/lang/Object;

    :cond_48
    :goto_48
    return v0
.end method

.method protected onZoomEnd(I)V
    .registers 5

    invoke-super {p0, p1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->onZoomEnd(I)V

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;->q:Lq6/b;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onZoomEnd type "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lq6/b;->a(Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;->u:Z

    const/4 v0, 0x2

    if-eq p1, v0, :cond_32

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;->q:Lq6/b;

    const-string v0, "notify onStateEnd."

    invoke-virtual {p1, v0}, Lq6/b;->a(Ljava/lang/String;)V

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;->s:Lv8/a;

    if-eqz p0, :cond_32

    invoke-interface {p0}, Lv8/a;->invoke()Ljava/lang/Object;

    :cond_32
    return-void
.end method

.method protected onZoomStart(FLandroid/graphics/PointF;)V
    .registers 6

    const-string v0, "sCenter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->onZoomStart(FLandroid/graphics/PointF;)V

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;->q:Lq6/b;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onZoomStart, and notify onStatePreEndListener: scale="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v2, ",center="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lq6/b;->a(Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;->u:Z

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;->c(Ljava/lang/Float;Landroid/graphics/PointF;)V

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;->t:Lv8/p;

    if-eqz p0, :cond_3b

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {p0, p1, p2}, Lv8/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3b
    return-void
.end method

.method public final setCanHandleTouchEvent(Z)V
    .registers 2

    iput-boolean p1, p0, Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;->x:Z

    return-void
.end method

.method public final setOnStartTouchListener(Lv8/a;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv8/a;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;->r:Lv8/a;

    return-void
.end method

.method public final setOnStateEndListener(Lv8/a;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv8/a;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;->s:Lv8/a;

    return-void
.end method

.method public final setOnStatePreEndListener(Lv8/p;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv8/p;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;->t:Lv8/p;

    return-void
.end method
