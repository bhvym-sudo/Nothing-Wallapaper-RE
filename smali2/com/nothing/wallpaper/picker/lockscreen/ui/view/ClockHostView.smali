.class public final Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;
.super Landroid/widget/LinearLayout;
.source "SourceFile"

# interfaces
.implements Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView$c;
    }
.end annotation


# static fields
.field public static final B:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView$c;

.field private static final C:Landroid/util/FloatProperty;


# instance fields
.field private final A:Landroid/view/View;

.field private final q:Lh8/h;

.field private final r:Lh8/h;

.field private final s:Lh8/h;

.field private final t:Le3/e;

.field private final u:Lcom/android/launcher3/views/f;

.field private final v:Lcom/android/launcher3/f;

.field private w:LF7/b;

.field private x:Z

.field private y:Lv8/l;

.field private z:Lv8/l;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView$c;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;->B:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView$c;

    new-instance v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView$b;

    invoke-direct {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView$b;-><init>()V

    sput-object v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;->C:Landroid/util/FloatProperty;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 11

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v7}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/h;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .registers 8

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 4
    new-instance v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/q;

    invoke-direct {v0, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/q;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;)V

    invoke-static {v0}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object v0

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;->q:Lh8/h;

    .line 5
    new-instance v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/r;

    invoke-direct {v0, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/r;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;)V

    invoke-static {v0}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object v0

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;->r:Lh8/h;

    .line 6
    new-instance v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/s;

    invoke-direct {v0, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/s;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;)V

    invoke-static {v0}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object v0

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;->s:Lh8/h;

    .line 7
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, p0, v1}, Le3/e;->C(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Le3/e;

    move-result-object v0

    const-string v2, "inflate(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;->t:Le3/e;

    .line 8
    invoke-static {p1}, Lcom/android/launcher3/views/f;->y(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v2

    check-cast v2, Lcom/android/launcher3/views/f;

    iput-object v2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;->u:Lcom/android/launcher3/views/f;

    .line 9
    invoke-interface {v2}, Lcom/android/launcher3/views/f;->K()Lcom/android/launcher3/f;

    move-result-object v2

    iput-object v2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;->v:Lcom/android/launcher3/f;

    .line 10
    sget-object v2, La3/a;->Q:[I

    invoke-virtual {p1, p2, v2, p3, p4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    const/4 p3, 0x0

    .line 11
    invoke-virtual {p2, p3, p3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p4

    if-ne p4, v1, :cond_56

    move p4, v1

    goto :goto_57

    :cond_56
    move p4, p3

    :goto_57
    iput-boolean p4, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;->x:Z

    .line 12
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 13
    invoke-virtual {p0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 14
    invoke-virtual {p0, p3}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 15
    iget-object p2, v0, Le3/e;->x:Landroidx/viewpager2/widget/ViewPager2;

    new-instance p4, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView$a;

    invoke-direct {p4, p0, v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView$a;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;Le3/e;)V

    invoke-virtual {p2, p4}, Landroidx/viewpager2/widget/ViewPager2;->registerOnPageChangeCallback(Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;)V

    .line 16
    iget-object p2, v0, Le3/e;->y:Lcom/android/launcher3/pageindicators/PageIndicatorDots;

    const p4, 0x1060020

    invoke-static {p1, p4}, Lr0/a;->b(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {p2, p1}, Lcom/android/launcher3/pageindicators/PageIndicatorDots;->setPaintColor(I)V

    .line 17
    invoke-virtual {p0, p3}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;->b(Z)V

    .line 18
    iput-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;->A:Landroid/view/View;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/h;)V
    .registers 8

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_5

    const/4 p2, 0x0

    :cond_5
    and-int/lit8 p6, p5, 0x4

    const/4 v0, 0x0

    if-eqz p6, :cond_b

    move p3, v0

    :cond_b
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_10

    move p4, v0

    .line 2
    :cond_10
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method private final getClockContentHeight()I
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;->q:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method

.method private final getFraction()F
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;->t:Le3/e;

    iget-object p0, p0, Le3/e;->x:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {p0}, Landroid/view/View;->getAlpha()F

    move-result p0

    return p0
.end method

.method private final getIndicatorDistance()I
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;->s:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method

.method private final getIndicatorHeight()I
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;->r:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method

.method private final getPageSize()I
    .registers 3

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;->t:Le3/e;

    iget-object v0, v0, Le3/e;->x:Landroidx/viewpager2/widget/ViewPager2;

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

.method public static synthetic j(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;)I
    .registers 1

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;->r(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;)I

    move-result p0

    return p0
.end method

.method public static synthetic k(ILe3/e;)V
    .registers 2

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;->u(ILe3/e;)V

    return-void
.end method

.method public static synthetic l(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;)I
    .registers 1

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;->s(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;)I

    move-result p0

    return p0
.end method

.method public static synthetic m(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;)I
    .registers 1

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;->t(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;)I

    move-result p0

    return p0
.end method

.method public static final synthetic n(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;)LF7/b;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;->w:LF7/b;

    return-object p0
.end method

.method public static final synthetic o(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;)F
    .registers 1

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;->getFraction()F

    move-result p0

    return p0
.end method

.method public static final synthetic p(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;)I
    .registers 1

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;->getPageSize()I

    move-result p0

    return p0
.end method

.method public static final synthetic q(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;F)V
    .registers 2

    invoke-direct {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;->w(F)V

    return-void
.end method

.method private static final r(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;)I
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;->v:Lcom/android/launcher3/f;

    iget p0, p0, Lcom/android/launcher3/f;->m:I

    return p0
.end method

.method private static final s(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;)I
    .registers 3

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f070467

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;->getIndicatorHeight()I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method

.method private static final t(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;)I
    .registers 2

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    const v0, 0x7f070507

    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p0

    return p0
.end method

.method private static final u(ILe3/e;)V
    .registers 4

    iget-object v0, p1, Le3/e;->x:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v0}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    move-result v0

    if-eq p0, v0, :cond_13

    iget-object v0, p1, Le3/e;->y:Lcom/android/launcher3/pageindicators/PageIndicatorDots;

    invoke-virtual {v0, p0}, Lcom/android/launcher3/pageindicators/PageIndicatorDots;->setCurrentPosition(I)V

    iget-object v0, p1, Le3/e;->x:Landroidx/viewpager2/widget/ViewPager2;

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1}, Landroidx/viewpager2/widget/ViewPager2;->setCurrentItem(IZ)V

    :cond_13
    iget-object p1, p1, Le3/e;->z:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;

    invoke-virtual {p1, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->z(I)V

    return-void
.end method

.method private final w(F)V
    .registers 8

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;->t:Le3/e;

    iget-object v1, v0, Le3/e;->x:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v1, p1}, Landroid/view/View;->setAlpha(F)V

    iget-object v1, v0, Le3/e;->w:Landroid/widget/LinearLayout;

    invoke-virtual {v1, p1}, Landroid/view/View;->setAlpha(F)V

    iget-boolean p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;->x:Z

    const/4 v1, 0x0

    const/16 v2, 0x8

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz p0, :cond_3e

    iget-object p0, v0, Le3/e;->x:Landroidx/viewpager2/widget/ViewPager2;

    const-string v5, "clockFacePage"

    invoke-static {p0, v5}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    cmpl-float v1, p1, v1

    if-lez v1, :cond_22

    move v5, v3

    goto :goto_23

    :cond_22
    move v5, v4

    :goto_23
    if-eqz v5, :cond_27

    move v5, v4

    goto :goto_28

    :cond_27
    move v5, v2

    :goto_28
    invoke-virtual {p0, v5}, Landroid/view/View;->setVisibility(I)V

    iget-object p0, v0, Le3/e;->y:Lcom/android/launcher3/pageindicators/PageIndicatorDots;

    const-string v5, "clockIndicator"

    invoke-static {p0, v5}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    if-lez v1, :cond_36

    move v1, v3

    goto :goto_37

    :cond_36
    move v1, v4

    :goto_37
    if-eqz v1, :cond_3a

    move v2, v4

    :cond_3a
    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_52

    :cond_3e
    iget-object p0, v0, Le3/e;->w:Landroid/widget/LinearLayout;

    const-string v5, "clockFaceCurrent"

    invoke-static {p0, v5}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    cmpl-float v1, p1, v1

    if-lez v1, :cond_4b

    move v1, v3

    goto :goto_4c

    :cond_4b
    move v1, v4

    :goto_4c
    if-eqz v1, :cond_4f

    move v2, v4

    :cond_4f
    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    :goto_52
    iget-object p0, v0, Le3/e;->z:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;

    int-to-float v0, v3

    sub-float/2addr v0, p1

    invoke-virtual {p0, v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->B(F)V

    return-void
.end method


# virtual methods
.method public b(Z)V
    .registers 2

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;->v:Lcom/android/launcher3/f;

    iget-boolean p1, p1, Lcom/android/launcher3/f;->e0:Z

    if-eqz p1, :cond_b

    const/4 p1, 0x0

    goto :goto_d

    :cond_b
    const/high16 p1, 0x3f800000    # 1.0f

    :goto_d
    invoke-direct {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;->w(F)V

    return-void
.end method

.method public d()V
    .registers 3

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;->t:Le3/e;

    iget-object v1, v0, Le3/e;->w:Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->removeAllViews()V

    iget-object v0, v0, Le3/e;->x:Landroidx/viewpager2/widget/ViewPager2;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    iput-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;->w:LF7/b;

    return-void
.end method

.method public f(F)Landroid/animation/ObjectAnimator;
    .registers 5

    sget-object v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;->C:Landroid/util/FloatProperty;

    const/4 v1, 0x1

    new-array v1, v1, [F

    const/4 v2, 0x0

    aput p1, v1, v2

    invoke-static {p0, v0, v1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object p0

    const-string p1, "ofFloat(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public g(Ljava/util/List;ILS1/a;)V
    .registers 8

    const-string v0, "clocks"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clockViewFactory"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_38

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LT1/a;

    invoke-virtual {v1}, LT1/a;->a()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setUpClockView clock:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "ClockHostView"

    invoke-static {v2, v1}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_11

    :cond_38
    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;->t:Le3/e;

    iget-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;->w:LF7/b;

    if-nez v1, :cond_4a

    new-instance v1, LF7/b;

    invoke-direct {v1, p3}, LF7/b;-><init>(LS1/a;)V

    iput-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;->w:LF7/b;

    iget-object p3, v0, Le3/e;->x:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {p3, v1}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    :cond_4a
    iget-object p3, v0, Le3/e;->y:Lcom/android/launcher3/pageindicators/PageIndicatorDots;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {p3, v1}, Lcom/android/launcher3/pageindicators/PageIndicatorDots;->setMarkersCount(I)V

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;->w:LF7/b;

    if-eqz p0, :cond_5f

    new-instance p3, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/t;

    invoke-direct {p3, p2, v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/t;-><init>(ILe3/e;)V

    invoke-virtual {p0, p1, p3}, Landroidx/recyclerview/widget/ListAdapter;->submitList(Ljava/util/List;Ljava/lang/Runnable;)V

    :cond_5f
    return-void
.end method

.method public getClockView()Landroid/view/View;
    .registers 3

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;->t:Le3/e;

    iget-object v0, v0, Le3/e;->x:Landroidx/viewpager2/widget/ViewPager2;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_20

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object v0

    if-eqz v0, :cond_20

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;->t:Le3/e;

    iget-object p0, p0, Le3/e;->x:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    move-result p0

    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->findViewByPosition(I)Landroid/view/View;

    move-result-object p0

    return-object p0

    :cond_20
    const/4 p0, 0x0

    return-object p0
.end method

.method public bridge synthetic getIndicator()Landroid/view/View;
    .registers 1

    .line 1
    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;->getIndicator()Lcom/android/launcher3/pageindicators/PageIndicatorDots;

    move-result-object p0

    return-object p0
.end method

.method public getIndicator()Lcom/android/launcher3/pageindicators/PageIndicatorDots;
    .registers 2

    .line 2
    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;->t:Le3/e;

    iget-object p0, p0, Le3/e;->y:Lcom/android/launcher3/pageindicators/PageIndicatorDots;

    const-string v0, "clockIndicator"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public getOnClockChangedListener()Lv8/l;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lv8/l;"
        }
    .end annotation

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;->z:Lv8/l;

    return-object p0
.end method

.method public getOnClockSelectedListener()Lv8/l;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lv8/l;"
        }
    .end annotation

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;->y:Lv8/l;

    return-object p0
.end method

.method public getView()Landroid/view/View;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;->A:Landroid/view/View;

    return-object p0
.end method

.method protected onMeasure(II)V
    .registers 6

    iget-object p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;->t:Le3/e;

    iget-object v0, p2, Le3/e;->v:Landroid/widget/FrameLayout;

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;->getClockContentHeight()I

    move-result v1

    const/high16 v2, 0x40000000    # 2.0f

    invoke-static {v1, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/ViewGroup;->measureChild(Landroid/view/View;II)V

    iget-object v0, p2, Le3/e;->z:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;

    invoke-virtual {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->getRealHeight()I

    move-result v1

    invoke-static {v1, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/ViewGroup;->measureChild(Landroid/view/View;II)V

    iget-boolean v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;->x:Z

    if-eqz v0, :cond_30

    iget-object v0, p2, Le3/e;->x:Landroidx/viewpager2/widget/ViewPager2;

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;->getClockContentHeight()I

    move-result v1

    invoke-static {v1, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/ViewGroup;->measureChild(Landroid/view/View;II)V

    goto :goto_3d

    :cond_30
    iget-object v0, p2, Le3/e;->w:Landroid/widget/LinearLayout;

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;->getClockContentHeight()I

    move-result v1

    invoke-static {v1, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/ViewGroup;->measureChild(Landroid/view/View;II)V

    :goto_3d
    iget-object p2, p2, Le3/e;->y:Lcom/android/launcher3/pageindicators/PageIndicatorDots;

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;->getIndicatorHeight()I

    move-result v0

    invoke-static {v0, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    invoke-virtual {p0, p2, p1, v0}, Landroid/view/ViewGroup;->measureChild(Landroid/view/View;II)V

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;->getClockContentHeight()I

    move-result p2

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;->getIndicatorDistance()I

    move-result v0

    add-int/2addr p2, v0

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public setOnClockChangedListener(Lv8/l;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv8/l;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;->z:Lv8/l;

    return-void
.end method

.method public setOnClockSelectedListener(Lv8/l;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv8/l;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;->y:Lv8/l;

    return-void
.end method

.method public final v(LS1/a;Ljava/lang/String;)V
    .registers 4

    const-string v0, "clockViewFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clockId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;->t:Le3/e;

    iget-object v0, v0, Le3/e;->z:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;

    invoke-virtual {v0, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->y(Ljava/lang/String;)V

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;->t:Le3/e;

    iget-object p0, p0, Le3/e;->w:Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    check-cast p1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;

    invoke-virtual {p1, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->B(Ljava/lang/String;)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p2

    instance-of v0, p2, Landroid/view/ViewGroup;

    if-eqz v0, :cond_29

    check-cast p2, Landroid/view/ViewGroup;

    goto :goto_2a

    :cond_29
    const/4 p2, 0x0

    :goto_2a
    if-eqz p2, :cond_2f

    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_2f
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method
