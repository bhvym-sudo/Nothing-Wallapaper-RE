.class public final Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;
.super Landroidx/coordinatorlayout/widget/CoordinatorLayout;
.source "SourceFile"


# instance fields
.field private final P:Le3/F0;

.field private final Q:Lcom/android/launcher3/views/f;

.field private final R:Lcom/android/launcher3/f;

.field private final S:F

.field private T:Z

.field private final U:Lh8/h;

.field private final V:Landroidx/recyclerview/widget/GridLayoutManager;


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

    invoke-direct/range {v1 .. v6}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/h;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 8

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const/4 p3, 0x1

    invoke-static {p2, p0, p3}, Le3/F0;->C(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Le3/F0;

    move-result-object p2

    const-string v0, "inflate(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;->P:Le3/F0;

    .line 5
    invoke-static {p1}, Lcom/android/launcher3/views/f;->y(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v0

    check-cast v0, Lcom/android/launcher3/views/f;

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;->Q:Lcom/android/launcher3/views/f;

    .line 6
    invoke-interface {v0}, Lcom/android/launcher3/views/f;->K()Lcom/android/launcher3/f;

    move-result-object v0

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;->R:Lcom/android/launcher3/f;

    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f07008c

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    iput v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;->S:F

    .line 8
    new-instance v1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/h0;

    invoke-direct {v1, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/h0;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;)V

    invoke-static {v1}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object v1

    iput-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;->U:Lh8/h;

    .line 9
    new-instance v1, Landroidx/recyclerview/widget/GridLayoutManager;

    const/4 v2, 0x2

    invoke-direct {v1, p1, v2}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    .line 10
    new-instance p1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage$c;

    invoke-direct {p1, p0, v1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage$c;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;Landroidx/recyclerview/widget/GridLayoutManager;)V

    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->setSpanSizeLookup(Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;)V

    .line 11
    iput-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;->V:Landroidx/recyclerview/widget/GridLayoutManager;

    const p1, 0x7f080093

    .line 12
    invoke-virtual {p0, p1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 13
    new-instance p1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage$a;

    invoke-direct {p1, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage$a;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;)V

    invoke-virtual {p0, p1}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    .line 14
    invoke-virtual {p0, p3}, Landroid/view/View;->setClipToOutline(Z)V

    .line 15
    iget-object p1, p2, Le3/F0;->z:Landroidx/recyclerview/widget/RecyclerView;

    .line 16
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 17
    new-instance p2, LM6/v;

    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    const v1, 0x7f0705b2

    invoke-virtual {p3, v1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result p3

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-direct {p2, p3, v1, v2, v3}, LM6/v;-><init>(IIILkotlin/jvm/internal/h;)V

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 18
    iget-object p2, v0, Lcom/android/launcher3/f;->d0:Landroid/graphics/Rect;

    .line 19
    invoke-static {p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget p3, p2, Landroid/graphics/Rect;->left:I

    iget v0, p2, Landroid/graphics/Rect;->right:I

    iget p2, p2, Landroid/graphics/Rect;->bottom:I

    .line 20
    invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    .line 21
    invoke-virtual {p1, p3, v1, v0, p2}, Landroid/view/View;->setPadding(IIII)V

    .line 22
    new-instance p2, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage$b;

    invoke-direct {p2, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage$b;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;)V

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->addOnScrollListener(Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;)V

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
    invoke-direct {p0, p1, p2, p3}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static synthetic S(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;)LF7/k;
    .registers 1

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;->b0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;)LF7/k;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic T(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;)Le3/F0;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;->P:Le3/F0;

    return-object p0
.end method

.method public static final synthetic U(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;)F
    .registers 1

    iget p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;->S:F

    return p0
.end method

.method public static final synthetic V(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;)LF7/k;
    .registers 1

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;->getWidgetListAdapter()LF7/k;

    move-result-object p0

    return-object p0
.end method

.method private static final b0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;)LF7/k;
    .registers 4

    new-instance v0, LF7/k;

    iget-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;->R:Lcom/android/launcher3/f;

    const-string v2, "deviceProfile"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, LE7/S;->c:LE7/S$a;

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    invoke-virtual {v2, p0}, LE7/S$a;->a(Landroid/view/ViewParent;)LE7/S;

    move-result-object p0

    invoke-direct {v0, v1, p0}, LF7/k;-><init>(Lcom/android/launcher3/f;LE7/S;)V

    return-object v0
.end method

.method private final getWidgetListAdapter()LF7/k;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;->U:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LF7/k;

    return-object p0
.end method


# virtual methods
.method public final W(Landroid/view/MotionEvent;)Z
    .registers 3

    const-string v0, "ev"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;->P:Le3/F0;

    iget-object v0, v0, Le3/F0;->z:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->computeVerticalScrollOffset()I

    move-result v0

    if-eqz v0, :cond_17

    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_17

    const/4 v0, 0x1

    goto :goto_18

    :cond_17
    const/4 v0, 0x0

    :goto_18
    iput-boolean v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;->T:Z

    if-eqz v0, :cond_23

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;->P:Le3/F0;

    iget-object v0, v0, Le3/F0;->z:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    :cond_23
    iget-boolean p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;->T:Z

    return p0
.end method

.method public final X(Landroid/view/MotionEvent;)Z
    .registers 3

    const-string v0, "ev"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;->T:Z

    if-eqz v0, :cond_10

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;->P:Le3/F0;

    iget-object v0, v0, Le3/F0;->z:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    :cond_10
    iget-boolean p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;->T:Z

    return p0
.end method

.method public final Y(Landroid/view/MotionEvent;)Z
    .registers 4

    const-string v0, "ev"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;->Q:Lcom/android/launcher3/views/f;

    invoke-interface {v0}, Lcom/android/launcher3/views/f;->J()Lcom/android/launcher3/dragndrop/DragLayer;

    move-result-object v0

    iget-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;->P:Le3/F0;

    iget-object v1, v1, Le3/F0;->z:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, v1, p1}, Lcom/android/launcher3/views/g;->n(Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_22

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;->P:Le3/F0;

    iget-object p0, p0, Le3/F0;->z:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->computeVerticalScrollOffset()I

    move-result p0

    if-eqz p0, :cond_22

    const/4 p0, 0x1

    return p0

    :cond_22
    return v0
.end method

.method public final Z()V
    .registers 2

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;->P:Le3/F0;

    iget-object p0, p0, Le3/F0;->z:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->smoothScrollToPosition(I)V

    return-void
.end method

.method public final a0(Ljava/util/List;)V
    .registers 3

    const-string v0, "list"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;->getWidgetListAdapter()LF7/k;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/ListAdapter;->submitList(Ljava/util/List;)V

    return-void
.end method

.method public final getContent()Landroidx/coordinatorlayout/widget/CoordinatorLayout;
    .registers 2

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;->P:Le3/F0;

    iget-object p0, p0, Le3/F0;->x:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    const-string v0, "contentFrame"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public onAttachedToWindow()V
    .registers 2

    invoke-super {p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->onAttachedToWindow()V

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;->P:Le3/F0;

    iget-object v0, v0, Le3/F0;->z:Landroidx/recyclerview/widget/RecyclerView;

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;->getWidgetListAdapter()LF7/k;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    return-void
.end method

.method public onDetachedFromWindow()V
    .registers 2

    invoke-super {p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->onDetachedFromWindow()V

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;->P:Le3/F0;

    iget-object p0, p0, Le3/F0;->z:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    return-void
.end method
