.class public final Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView$a;
.super Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private a:I

.field private b:I

.field final synthetic c:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;

.field final synthetic d:Le3/e;


# direct methods
.method constructor <init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;Le3/e;)V
    .registers 3

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView$a;->c:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;

    iput-object p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView$a;->d:Le3/e;

    invoke-direct {p0}, Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageScrollStateChanged(I)V
    .registers 4

    iput p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView$a;->b:I

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView$a;->d:Le3/e;

    iget-object v0, v0, Le3/e;->x:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v0}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    move-result v0

    if-eqz p1, :cond_13

    const/4 v1, 0x1

    if-eq p1, v1, :cond_10

    goto :goto_3b

    :cond_10
    iput v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView$a;->a:I

    return-void

    :cond_13
    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView$a;->d:Le3/e;

    iget-object p1, p1, Le3/e;->y:Lcom/android/launcher3/pageindicators/PageIndicatorDots;

    invoke-virtual {p1, v0}, Lcom/android/launcher3/pageindicators/PageIndicatorDots;->setActiveMarker(I)V

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView$a;->c:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;

    invoke-static {p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;->n(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;)LF7/b;

    move-result-object p1

    if-eqz p1, :cond_3b

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView$a;->c:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;->getOnClockSelectedListener()Lv8/l;

    move-result-object p0

    if-eqz p0, :cond_3b

    invoke-virtual {p1}, Landroidx/recyclerview/widget/ListAdapter;->getCurrentList()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LT1/a;

    invoke-virtual {p1}, LT1/a;->a()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Lv8/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3b
    :goto_3b
    return-void
.end method

.method public onPageScrolled(IFI)V
    .registers 8

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView$a;->c:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;

    invoke-static {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;->n(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;)LF7/b;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_e

    invoke-virtual {v0}, Landroidx/recyclerview/widget/ListAdapter;->getItemCount()I

    move-result v0

    goto :goto_f

    :cond_e
    move v0, v1

    :goto_f
    iget-object v2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView$a;->c:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;

    invoke-static {v2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;->p(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;)I

    move-result v2

    mul-int v3, p1, v2

    add-int/2addr p3, v3

    iget-object v3, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView$a;->d:Le3/e;

    iget-object v3, v3, Le3/e;->y:Lcom/android/launcher3/pageindicators/PageIndicatorDots;

    add-int/lit8 v0, v0, -0x1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    mul-int/2addr v0, v2

    invoke-virtual {v3, p3, v0}, Lcom/android/launcher3/pageindicators/PageIndicatorDots;->r(II)V

    iget v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView$a;->b:I

    if-eqz v0, :cond_3e

    iget v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView$a;->a:I

    mul-int/2addr v2, v0

    if-le p3, v2, :cond_37

    const/4 p3, 0x0

    cmpg-float p3, p2, p3

    if-nez p3, :cond_35

    goto :goto_37

    :cond_35
    add-int/lit8 p1, p1, 0x1

    :cond_37
    :goto_37
    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView$a;->d:Le3/e;

    iget-object p0, p0, Le3/e;->z:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;

    invoke-virtual {p0, v0, p1, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->u(IIF)V

    :cond_3e
    return-void
.end method
