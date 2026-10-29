.class public final Lcom/nothing/wallpaper/widget/RoundFWDRFrameLayout;
.super Lcom/android/wallpaper/picker/FixedWidthDisplayRatioFrameLayout;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 5

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lcom/android/wallpaper/picker/FixedWidthDisplayRatioFrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    sget-object v0, La3/a;->j2:[I

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, v1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    const/4 v0, 0x0

    invoke-virtual {p2, v1, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v0

    invoke-static {p1, v0}, Li6/q;->a(Landroid/content/Context;F)I

    move-result p1

    int-to-float p1, p1

    new-instance v0, Lcom/nothing/wallpaper/widget/RoundFWDRFrameLayout$a;

    invoke-direct {v0, p1}, Lcom/nothing/wallpaper/widget/RoundFWDRFrameLayout$a;-><init>(F)V

    invoke-virtual {p0, v0}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Landroid/view/View;->setClipToOutline(Z)V

    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method
