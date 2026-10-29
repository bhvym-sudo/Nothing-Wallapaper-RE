.class public abstract Lcom/nothing/launcher/card/l;
.super Lcom/nothing/cardhost/g;
.source "SourceFile"

# interfaces
.implements Lz2/j;
.implements Lcom/android/launcher3/u;


# instance fields
.field private i0:F

.field private j0:F

.field private final k0:Lh8/h;

.field private final l0:Lcom/android/launcher3/views/f;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 9

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/nothing/cardhost/g;-><init>(Landroid/content/Context;Lv5/a;ZILkotlin/jvm/internal/h;)V

    const/high16 p0, 0x3f800000    # 1.0f

    iput p0, v1, Lcom/nothing/launcher/card/l;->i0:F

    iput p0, v1, Lcom/nothing/launcher/card/l;->j0:F

    new-instance p0, Lcom/nothing/launcher/card/k;

    invoke-direct {p0, v1}, Lcom/nothing/launcher/card/k;-><init>(Lcom/nothing/launcher/card/l;)V

    invoke-static {p0}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p0

    iput-object p0, v1, Lcom/nothing/launcher/card/l;->k0:Lh8/h;

    invoke-static {v2}, Lcom/android/launcher3/views/f;->y(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p0

    check-cast p0, Lcom/android/launcher3/views/f;

    iput-object p0, v1, Lcom/nothing/launcher/card/l;->l0:Lcom/android/launcher3/views/f;

    return-void
.end method

.method private final getMultiTranslateDelegate()LF2/o;
    .registers 1

    iget-object p0, p0, Lcom/nothing/launcher/card/l;->k0:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LF2/o;

    return-object p0
.end method

.method public static synthetic q0(Lcom/nothing/launcher/card/l;)LF2/o;
    .registers 1

    invoke-static {p0}, Lcom/nothing/launcher/card/l;->r0(Lcom/nothing/launcher/card/l;)LF2/o;

    move-result-object p0

    return-object p0
.end method

.method private static final r0(Lcom/nothing/launcher/card/l;)LF2/o;
    .registers 2

    new-instance v0, LF2/o;

    invoke-direct {v0, p0}, LF2/o;-><init>(Landroid/view/View;)V

    return-object v0
.end method

.method private final s0()V
    .registers 3

    iget v0, p0, Lcom/nothing/launcher/card/l;->i0:F

    iget v1, p0, Lcom/nothing/launcher/card/l;->j0:F

    mul-float/2addr v0, v1

    invoke-super {p0, v0}, Landroid/view/View;->setScaleX(F)V

    iget v0, p0, Lcom/nothing/launcher/card/l;->i0:F

    iget v1, p0, Lcom/nothing/launcher/card/l;->j0:F

    mul-float/2addr v0, v1

    invoke-super {p0, v0}, Landroid/view/View;->setScaleY(F)V

    return-void
.end method


# virtual methods
.method public d(Landroid/graphics/Rect;)V
    .registers 4

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, Lcom/nothing/launcher/card/l;->i0:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    int-to-float v1, v1

    iget p0, p0, Lcom/nothing/launcher/card/l;->i0:F

    mul-float/2addr v1, p0

    float-to-int p0, v1

    if-eqz p1, :cond_18

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v1, v0, p0}, Landroid/graphics/Rect;->set(IIII)V

    :cond_18
    return-void
.end method

.method protected final getActivityContext()Lcom/android/launcher3/views/f;
    .registers 1

    iget-object p0, p0, Lcom/nothing/launcher/card/l;->l0:Lcom/android/launcher3/views/f;

    return-object p0
.end method

.method public getReorderBounceScale()F
    .registers 1

    iget p0, p0, Lcom/nothing/launcher/card/l;->j0:F

    return p0
.end method

.method public final getScaleToFit()F
    .registers 1

    iget p0, p0, Lcom/nothing/launcher/card/l;->i0:F

    return p0
.end method

.method public getTranslateDelegate()LF2/o;
    .registers 1

    invoke-direct {p0}, Lcom/nothing/launcher/card/l;->getMultiTranslateDelegate()LF2/o;

    move-result-object p0

    return-object p0
.end method

.method public getViewType()I
    .registers 1

    const/4 p0, 0x1

    return p0
.end method

.method public setPadding(IIII)V
    .registers 5

    iget-object p1, p0, Lcom/nothing/launcher/card/l;->l0:Lcom/android/launcher3/views/f;

    invoke-interface {p1}, Lcom/android/launcher3/views/f;->K()Lcom/android/launcher3/f;

    move-result-object p1

    iget-object p1, p1, Lcom/android/launcher3/f;->G:Landroid/graphics/Rect;

    iget p2, p1, Landroid/graphics/Rect;->left:I

    iget p3, p1, Landroid/graphics/Rect;->top:I

    iget p4, p1, Landroid/graphics/Rect;->right:I

    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    invoke-super {p0, p2, p3, p4, p1}, Landroid/view/View;->setPadding(IIII)V

    return-void
.end method

.method public setReorderBounceScale(F)V
    .registers 2

    iput p1, p0, Lcom/nothing/launcher/card/l;->j0:F

    invoke-direct {p0}, Lcom/nothing/launcher/card/l;->s0()V

    return-void
.end method

.method public final setScaleToFit(F)V
    .registers 2

    iput p1, p0, Lcom/nothing/launcher/card/l;->i0:F

    invoke-direct {p0}, Lcom/nothing/launcher/card/l;->s0()V

    return-void
.end method
