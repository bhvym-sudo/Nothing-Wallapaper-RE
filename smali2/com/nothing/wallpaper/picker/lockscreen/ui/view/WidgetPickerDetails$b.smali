.class public final Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails$b;
.super Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;


# direct methods
.method constructor <init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails$b;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;

    invoke-direct {p0}, Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageScrolled(IFI)V
    .registers 8

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails$b;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;

    invoke-static {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;->e(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;)Le3/D0;

    move-result-object v0

    iget-object v0, v0, Le3/D0;->B:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v0}, Landroidx/viewpager2/widget/ViewPager2;->getScrollState()I

    move-result v0

    if-eqz v0, :cond_3a

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails$b;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;

    invoke-static {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;->e(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;)Le3/D0;

    move-result-object v0

    iget-object v0, v0, Le3/D0;->x:Lcom/android/launcher3/pageindicators/PageIndicatorDots;

    iget-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails$b;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;

    invoke-static {v1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;->f(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;)I

    move-result v1

    mul-int/2addr v1, p1

    add-int/2addr p3, v1

    iget-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails$b;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;

    invoke-static {v1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;->f(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;)I

    move-result v1

    iget-object v2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails$b;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;

    invoke-static {v2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;->h(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;)LF7/p;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/recyclerview/widget/ListAdapter;->getItemCount()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    const/4 v3, 0x0

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    mul-int/2addr v1, v2

    invoke-virtual {v0, p3, v1}, Lcom/android/launcher3/pageindicators/PageIndicatorDots;->r(II)V

    goto :goto_45

    :cond_3a
    iget-object p3, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails$b;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;

    invoke-static {p3}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;->e(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;)Le3/D0;

    move-result-object p3

    iget-object p3, p3, Le3/D0;->x:Lcom/android/launcher3/pageindicators/PageIndicatorDots;

    invoke-virtual {p3, p1}, Lcom/android/launcher3/pageindicators/PageIndicatorDots;->setCurrentPosition(I)V

    :goto_45
    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails$b;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;->e(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;)Le3/D0;

    move-result-object p0

    iget-object p0, p0, Le3/D0;->A:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/NTPageView;

    invoke-virtual {p0, p1, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/NTPageView;->a(IF)V

    return-void
.end method

.method public onPageSelected(I)V
    .registers 2

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails$b;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;->e(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;)Le3/D0;

    move-result-object p0

    iget-object p0, p0, Le3/D0;->x:Lcom/android/launcher3/pageindicators/PageIndicatorDots;

    invoke-virtual {p0, p1}, Lcom/android/launcher3/pageindicators/PageIndicatorDots;->setActiveMarker(I)V

    return-void
.end method
