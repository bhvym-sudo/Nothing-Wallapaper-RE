.class public final Lcom/nothing/wallpaper/widget/NTMaskableFrameLayout;
.super Lcom/google/android/material/carousel/i;
.source "SourceFile"


# instance fields
.field private v:I

.field private w:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 6

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lcom/google/android/material/carousel/i;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, -0x1

    iput v0, p0, Lcom/nothing/wallpaper/widget/NTMaskableFrameLayout;->w:I

    if-eqz p2, :cond_37

    const v1, 0x10100f4

    const v2, 0x10100f5

    filled-new-array {v1, v2}, [I

    move-result-object v1

    invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p2

    const-string v1, "obtainStyledAttributes(...)"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-virtual {p2, v1, v0}, Landroid/content/res/TypedArray;->getLayoutDimension(II)I

    move-result v0

    iput v0, p0, Lcom/nothing/wallpaper/widget/NTMaskableFrameLayout;->w:I

    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    iget p2, p0, Lcom/nothing/wallpaper/widget/NTMaskableFrameLayout;->w:I

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    int-to-float p2, p2

    invoke-static {p1, p2}, Li6/q;->a(Landroid/content/Context;F)I

    move-result p1

    iput p1, p0, Lcom/nothing/wallpaper/widget/NTMaskableFrameLayout;->v:I

    :cond_37
    return-void
.end method


# virtual methods
.method protected onMeasure(II)V
    .registers 4

    iget p1, p0, Lcom/nothing/wallpaper/widget/NTMaskableFrameLayout;->v:I

    const/high16 v0, 0x40000000    # 2.0f

    invoke-static {p1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    return-void
.end method
