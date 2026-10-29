.class public final Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"


# instance fields
.field private final q:Le3/D0;

.field private final r:Lcom/android/launcher3/views/f;

.field private final s:Lcom/android/launcher3/f;

.field private final t:F

.field private u:LE7/S;

.field private final v:Lh8/h;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 10

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/h;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 9

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const/4 p3, 0x1

    invoke-static {p2, p0, p3}, Le3/D0;->C(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Le3/D0;

    move-result-object p2

    const-string v0, "inflate(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;->q:Le3/D0;

    .line 5
    invoke-static {p1}, Lcom/android/launcher3/views/f;->y(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v0

    check-cast v0, Lcom/android/launcher3/views/f;

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;->r:Lcom/android/launcher3/views/f;

    .line 6
    invoke-interface {v0}, Lcom/android/launcher3/views/f;->K()Lcom/android/launcher3/f;

    move-result-object v0

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;->s:Lcom/android/launcher3/f;

    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f07008c

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    iput v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;->t:F

    .line 8
    new-instance v1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/f0;

    invoke-direct {v1, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/f0;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;)V

    invoke-static {v1}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object v1

    iput-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;->v:Lh8/h;

    .line 9
    new-instance v1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails$a;

    invoke-direct {v1, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails$a;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;)V

    invoke-virtual {p0, v1}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    .line 10
    invoke-virtual {p0, p3}, Landroid/view/View;->setClipToOutline(Z)V

    const p3, 0x7f06029d

    .line 11
    invoke-static {p1, p3}, Lr0/a;->b(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {p0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 12
    iget-object p1, p2, Le3/D0;->B:Landroidx/viewpager2/widget/ViewPager2;

    const/4 p3, 0x0

    .line 13
    invoke-virtual {p1, p3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    instance-of v2, v1, Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v2, :cond_61

    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    goto :goto_62

    :cond_61
    const/4 v1, 0x0

    :goto_62
    if-eqz v1, :cond_78

    .line 14
    iget-object v0, v0, Lcom/android/launcher3/f;->c0:Landroid/graphics/Rect;

    iget v2, v0, Landroid/graphics/Rect;->left:I

    .line 15
    iget v0, v0, Landroid/graphics/Rect;->right:I

    .line 16
    invoke-virtual {v1}, Landroid/view/View;->getPaddingTop()I

    move-result v3

    .line 17
    invoke-virtual {v1}, Landroid/view/View;->getPaddingBottom()I

    move-result v4

    .line 18
    invoke-virtual {v1, v2, v3, v0, v4}, Landroid/view/View;->setPaddingRelative(IIII)V

    .line 19
    invoke-virtual {v1, p3}, Landroidx/recyclerview/widget/RecyclerView;->setClipToPadding(Z)V

    .line 20
    :cond_78
    new-instance p3, Landroidx/viewpager2/widget/MarginPageTransformer;

    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f070633

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    invoke-direct {p3, v0}, Landroidx/viewpager2/widget/MarginPageTransformer;-><init>(I)V

    invoke-virtual {p1, p3}, Landroidx/viewpager2/widget/ViewPager2;->setPageTransformer(Landroidx/viewpager2/widget/ViewPager2$PageTransformer;)V

    .line 21
    new-instance p3, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails$b;

    invoke-direct {p3, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails$b;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;)V

    invoke-virtual {p1, p3}, Landroidx/viewpager2/widget/ViewPager2;->registerOnPageChangeCallback(Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;)V

    .line 22
    iget-object p1, p2, Le3/D0;->w:Landroid/widget/ImageView;

    new-instance p2, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/g0;

    invoke-direct {p2, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/g0;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/h;)V
    .registers 6

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_5

    const/4 p2, 0x0

    :cond_5
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_a

    const/4 p3, 0x0

    .line 2
    :cond_a
    invoke-direct {p0, p1, p2, p3}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static synthetic b(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;Landroid/view/View;)V
    .registers 2

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;->d(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic c(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;)LF7/p;
    .registers 1

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;->j(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;)LF7/p;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;Landroid/view/View;)V
    .registers 2

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;->u:LE7/S;

    if-eqz p0, :cond_7

    invoke-interface {p0}, LE7/S;->p()V

    :cond_7
    return-void
.end method

.method public static final synthetic e(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;)Le3/D0;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;->q:Le3/D0;

    return-object p0
.end method

.method public static final synthetic f(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;)I
    .registers 1

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;->getPageSize()I

    move-result p0

    return p0
.end method

.method public static final synthetic g(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;)F
    .registers 1

    iget p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;->t:F

    return p0
.end method

.method private final getPageSize()I
    .registers 3

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;->q:Le3/D0;

    iget-object v0, v0, Le3/D0;->B:Landroidx/viewpager2/widget/ViewPager2;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    instance-of v1, v0, Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v1, :cond_10

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    goto :goto_11

    :cond_10
    const/4 v0, 0x0

    :goto_11
    if-eqz v0, :cond_22

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result p0

    invoke-virtual {v0}, Landroid/view/View;->getPaddingStart()I

    move-result v1

    sub-int/2addr p0, v1

    invoke-virtual {v0}, Landroid/view/View;->getPaddingEnd()I

    move-result v0

    sub-int/2addr p0, v0

    return p0

    :cond_22
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p0

    return p0
.end method

.method private final getWidgetPreviewAdapter()LF7/p;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;->v:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LF7/p;

    return-object p0
.end method

.method public static final synthetic h(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;)LF7/p;
    .registers 1

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;->getWidgetPreviewAdapter()LF7/p;

    move-result-object p0

    return-object p0
.end method

.method private static final j(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;)LF7/p;
    .registers 4

    sget-object v0, LE7/S;->c:LE7/S$a;

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    invoke-virtual {v0, v1}, LE7/S$a;->a(Landroid/view/ViewParent;)LE7/S;

    move-result-object v0

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;->u:LE7/S;

    new-instance v0, LF7/p;

    iget-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;->s:Lcom/android/launcher3/f;

    const-string v2, "deviceProfile"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;->u:LE7/S;

    invoke-direct {v0, v1, p0}, LF7/p;-><init>(Lcom/android/launcher3/f;LE7/S;)V

    return-object v0
.end method


# virtual methods
.method public final i(Lz7/d;)V
    .registers 6

    const-string v0, "info"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;->q:Le3/D0;

    iget-object v0, v0, Le3/D0;->C:Landroid/widget/TextView;

    invoke-virtual {p1}, Lz7/d;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;->q:Le3/D0;

    iget-object v0, v0, Le3/D0;->A:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/NTPageView;

    invoke-virtual {p1}, Lz7/d;->a()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/NTPageView;->b(Ljava/util/List;)V

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;->getWidgetPreviewAdapter()LF7/p;

    move-result-object v0

    invoke-virtual {p1}, Lz7/d;->a()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/ListAdapter;->submitList(Ljava/util/List;)V

    invoke-virtual {p0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lz7/c;

    const/4 v2, 0x0

    if-eqz v1, :cond_32

    check-cast v0, Lz7/c;

    goto :goto_33

    :cond_32
    move-object v0, v2

    :goto_33
    if-eqz v0, :cond_67

    invoke-virtual {p1}, Lz7/d;->b()Lz7/c;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_40

    move-object v2, v0

    :cond_40
    if-eqz v2, :cond_67

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;->q:Le3/D0;

    iget-object v0, v0, Le3/D0;->B:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {p1}, Lz7/d;->a()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    if-le v1, v2, :cond_54

    move v1, v3

    goto :goto_55

    :cond_54
    const/4 v1, 0x1

    :goto_55
    invoke-virtual {v0, v3, v1}, Landroidx/viewpager2/widget/ViewPager2;->setCurrentItem(IZ)V

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;->q:Le3/D0;

    iget-object v0, v0, Le3/D0;->x:Lcom/android/launcher3/pageindicators/PageIndicatorDots;

    invoke-virtual {v0, v3}, Lcom/android/launcher3/pageindicators/PageIndicatorDots;->setCurrentPosition(I)V

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;->q:Le3/D0;

    iget-object v0, v0, Le3/D0;->A:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/NTPageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v3, v1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/NTPageView;->a(IF)V

    :cond_67
    invoke-virtual {p1}, Lz7/d;->b()Lz7/c;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;->q:Le3/D0;

    iget-object p0, p0, Le3/D0;->x:Lcom/android/launcher3/pageindicators/PageIndicatorDots;

    invoke-virtual {p1}, Lz7/d;->a()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/android/launcher3/pageindicators/PageIndicatorDots;->setMarkersCount(I)V

    return-void
.end method

.method protected onAttachedToWindow()V
    .registers 2

    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;->q:Le3/D0;

    iget-object v0, v0, Le3/D0;->B:Landroidx/viewpager2/widget/ViewPager2;

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;->getWidgetPreviewAdapter()LF7/p;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    return-void
.end method

.method protected onDetachedFromWindow()V
    .registers 2

    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;->u:LE7/S;

    return-void
.end method
