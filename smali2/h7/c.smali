.class public abstract Lh7/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg3/f;


# instance fields
.field private final q:Lg3/f;

.field private final r:Lg3/f;

.field private final s:Lg3/f;


# direct methods
.method public constructor <init>(Lg3/f;Lg3/f;Lg3/f;)V
    .registers 5

    const-string v0, "firstSectionController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "secondSectionController"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "thirdSectionController"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh7/c;->q:Lg3/f;

    iput-object p2, p0, Lh7/c;->r:Lg3/f;

    iput-object p3, p0, Lh7/c;->s:Lg3/f;

    return-void
.end method

.method private final b(Landroid/content/Context;Lcom/android/wallpaper/picker/customization/ui/section/ResponsiveLayoutSectionView;Lg3/f;)V
    .registers 6

    invoke-interface {p3, p1}, Lg3/f;->e(Landroid/content/Context;)Z

    move-result p0

    if-eqz p0, :cond_18

    invoke-interface {p3, p2, p1}, Lg3/f;->c(Landroid/view/View;Landroid/content/Context;)Landroid/view/View;

    move-result-object p0

    if-eqz p0, :cond_18

    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 p3, -0x1

    const/high16 v0, 0x3f800000    # 1.0f

    const/4 v1, 0x0

    invoke-direct {p1, v1, p3, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {p2, p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_18
    return-void
.end method

.method private final i(Landroid/content/Context;Lcom/android/wallpaper/picker/customization/ui/section/ResponsiveLayoutSectionView;)V
    .registers 4

    iget-object v0, p0, Lh7/c;->q:Lg3/f;

    invoke-direct {p0, p1, p2, v0}, Lh7/c;->b(Landroid/content/Context;Lcom/android/wallpaper/picker/customization/ui/section/ResponsiveLayoutSectionView;Lg3/f;)V

    iget-object v0, p0, Lh7/c;->r:Lg3/f;

    invoke-direct {p0, p1, p2, v0}, Lh7/c;->b(Landroid/content/Context;Lcom/android/wallpaper/picker/customization/ui/section/ResponsiveLayoutSectionView;Lg3/f;)V

    iget-object v0, p0, Lh7/c;->s:Lg3/f;

    invoke-direct {p0, p1, p2, v0}, Lh7/c;->b(Landroid/content/Context;Lcom/android/wallpaper/picker/customization/ui/section/ResponsiveLayoutSectionView;Lg3/f;)V

    return-void
.end method

.method private final j(Landroid/content/Context;Lcom/android/wallpaper/picker/customization/ui/section/ResponsiveLayoutSectionView;)V
    .registers 3

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    const-string p2, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LH3/s;->a()LH3/s;

    move-result-object p2

    invoke-virtual {p1}, Landroid/content/Context;->getDisplay()Landroid/view/Display;

    move-result-object p1

    invoke-virtual {p2, p1}, LH3/s;->e(Landroid/view/Display;)Landroid/graphics/Point;

    move-result-object p1

    iget p1, p1, Landroid/graphics/Point;->x:I

    iput p1, p0, Landroid/view/ViewGroup$LayoutParams;->width:I

    return-void
.end method


# virtual methods
.method public bridge synthetic c(Landroid/view/View;Landroid/content/Context;)Landroid/view/View;
    .registers 3

    invoke-virtual {p0, p1, p2}, Lh7/c;->g(Landroid/view/View;Landroid/content/Context;)Lcom/android/wallpaper/picker/customization/ui/section/ResponsiveLayoutSectionView;

    move-result-object p0

    return-object p0
.end method

.method public e(Landroid/content/Context;)Z
    .registers 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lh7/c;->q:Lg3/f;

    invoke-interface {v0, p1}, Lg3/f;->e(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_20

    iget-object v0, p0, Lh7/c;->r:Lg3/f;

    invoke-interface {v0, p1}, Lg3/f;->e(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_20

    iget-object p0, p0, Lh7/c;->s:Lg3/f;

    invoke-interface {p0, p1}, Lg3/f;->e(Landroid/content/Context;)Z

    move-result p0

    if-eqz p0, :cond_1e

    goto :goto_20

    :cond_1e
    const/4 p0, 0x0

    return p0

    :cond_20
    :goto_20
    const/4 p0, 0x1

    return p0
.end method

.method public g(Landroid/view/View;Landroid/content/Context;)Lcom/android/wallpaper/picker/customization/ui/section/ResponsiveLayoutSectionView;
    .registers 7

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/view/ViewGroup;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0d012a

    const/4 v3, 0x1

    invoke-virtual {v1, v2, p1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type com.android.wallpaper.picker.customization.ui.section.ResponsiveLayoutSectionView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/android/wallpaper/picker/customization/ui/section/ResponsiveLayoutSectionView;

    invoke-direct {p0, p2, p1}, Lh7/c;->j(Landroid/content/Context;Lcom/android/wallpaper/picker/customization/ui/section/ResponsiveLayoutSectionView;)V

    invoke-direct {p0, p2, p1}, Lh7/c;->i(Landroid/content/Context;Lcom/android/wallpaper/picker/customization/ui/section/ResponsiveLayoutSectionView;)V

    return-object p1
.end method
