.class public final Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortcutPickerPage;
.super Landroidx/coordinatorlayout/widget/CoordinatorLayout;
.source "SourceFile"


# instance fields
.field private final P:Le3/r0;

.field private final Q:Lcom/android/launcher3/views/f;

.field private final R:F

.field private S:LC7/a;

.field private final T:Landroidx/recyclerview/widget/LinearLayoutManager;

.field private final U:Lh8/h;


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

    invoke-direct/range {v1 .. v6}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortcutPickerPage;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/h;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 6

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const/4 p3, 0x1

    invoke-static {p2, p0, p3}, Le3/r0;->C(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Le3/r0;

    move-result-object p2

    const-string v0, "inflate(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortcutPickerPage;->P:Le3/r0;

    .line 5
    invoke-static {p1}, Lcom/android/launcher3/views/f;->y(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v0

    check-cast v0, Lcom/android/launcher3/views/f;

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortcutPickerPage;->Q:Lcom/android/launcher3/views/f;

    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f07008c

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    iput v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortcutPickerPage;->R:F

    .line 7
    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p3, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortcutPickerPage;->T:Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 8
    new-instance v1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/T;

    invoke-direct {v1, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/T;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortcutPickerPage;)V

    invoke-static {v1}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object v1

    iput-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortcutPickerPage;->U:Lh8/h;

    .line 9
    new-instance v1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortcutPickerPage$a;

    invoke-direct {v1, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortcutPickerPage$a;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortcutPickerPage;)V

    invoke-virtual {p0, v1}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    .line 10
    invoke-virtual {p0, p3}, Landroid/view/View;->setClipToOutline(Z)V

    .line 11
    iget-object p0, p2, Le3/r0;->x:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 12
    invoke-static {p1}, Li6/q;->e(Landroid/content/Context;)Z

    move-result p0

    if-nez p0, :cond_6b

    .line 13
    invoke-static {p1}, Li6/q;->b(Landroid/content/Context;)I

    move-result p0

    .line 14
    iget-object p1, p2, Le3/r0;->x:Landroidx/recyclerview/widget/RecyclerView;

    .line 15
    invoke-virtual {p1}, Landroid/view/View;->getPaddingLeft()I

    move-result p2

    invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I

    move-result p3

    invoke-virtual {p1}, Landroid/view/View;->getPaddingRight()I

    move-result v0

    invoke-virtual {p1, p2, p3, v0, p0}, Landroid/view/View;->setPadding(IIII)V

    :cond_6b
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
    invoke-direct {p0, p1, p2, p3}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortcutPickerPage;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static synthetic S(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortcutPickerPage;)V
    .registers 1

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortcutPickerPage;->Y(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortcutPickerPage;)V

    return-void
.end method

.method public static synthetic T(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortcutPickerPage;I)V
    .registers 2

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortcutPickerPage;->X(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortcutPickerPage;I)V

    return-void
.end method

.method public static synthetic U(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortcutPickerPage;)LF7/j;
    .registers 1

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortcutPickerPage;->Z(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortcutPickerPage;)LF7/j;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic V(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortcutPickerPage;)F
    .registers 1

    iget p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortcutPickerPage;->R:F

    return p0
.end method

.method private final W(Ljava/util/List;)V
    .registers 4

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1b

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LC7/a;

    invoke-virtual {v1}, LC7/a;->f()Z

    move-result v1

    if-eqz v1, :cond_18

    goto :goto_1c

    :cond_18
    add-int/lit8 v0, v0, 0x1

    goto :goto_5

    :cond_1b
    const/4 v0, -0x1

    :goto_1c
    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortcutPickerPage;->P:Le3/r0;

    iget-object p1, p1, Le3/r0;->x:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/S;

    invoke-direct {v1, p0, v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/S;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortcutPickerPage;I)V

    invoke-virtual {p1, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private static final X(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortcutPickerPage;I)V
    .registers 4

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortcutPickerPage;->P:Le3/r0;

    iget-object v1, v0, Le3/r0;->x:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/RecyclerView;->scrollToPosition(I)V

    iget-object p1, v0, Le3/r0;->x:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/U;

    invoke-direct {v0, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/U;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortcutPickerPage;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private static final Y(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortcutPickerPage;)V
    .registers 2

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortcutPickerPage;->T:Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->findFirstCompletelyVisibleItemPosition()I

    move-result v0

    if-lez v0, :cond_11

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortcutPickerPage;->P:Le3/r0;

    iget-object p0, p0, Le3/r0;->v:Lcom/google/android/material/appbar/AppBarLayout;

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/google/android/material/appbar/AppBarLayout;->A(Z)Z

    return-void

    :cond_11
    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortcutPickerPage;->P:Le3/r0;

    iget-object p0, p0, Le3/r0;->v:Lcom/google/android/material/appbar/AppBarLayout;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/android/material/appbar/AppBarLayout;->A(Z)Z

    return-void
.end method

.method private static final Z(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortcutPickerPage;)LF7/j;
    .registers 3

    new-instance v0, LF7/j;

    sget-object v1, Ly7/t;->p:Ly7/t$a;

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    invoke-virtual {v1, p0}, Ly7/t$a;->a(Landroid/view/ViewParent;)Ly7/t;

    move-result-object p0

    invoke-direct {v0, p0}, LF7/j;-><init>(Ly7/t;)V

    return-object v0
.end method

.method private final getShortcutListAdapter()LF7/j;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortcutPickerPage;->U:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LF7/j;

    return-object p0
.end method


# virtual methods
.method public final a0(Landroid/view/MotionEvent;)Z
    .registers 4

    const-string v0, "ev"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortcutPickerPage;->Q:Lcom/android/launcher3/views/f;

    invoke-interface {v0}, Lcom/android/launcher3/views/f;->J()Lcom/android/launcher3/dragndrop/DragLayer;

    move-result-object v0

    iget-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortcutPickerPage;->P:Le3/r0;

    iget-object v1, v1, Le3/r0;->x:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, v1, p1}, Lcom/android/launcher3/views/g;->n(Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_22

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortcutPickerPage;->P:Le3/r0;

    iget-object p0, p0, Le3/r0;->x:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->computeVerticalScrollOffset()I

    move-result p0

    if-eqz p0, :cond_22

    const/4 p0, 0x1

    return p0

    :cond_22
    return v0
.end method

.method public final b0(Ljava/util/List;)V
    .registers 3

    const-string v0, "list"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortcutPickerPage;->getShortcutListAdapter()LF7/j;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/ListAdapter;->submitList(Ljava/util/List;)V

    invoke-direct {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortcutPickerPage;->W(Ljava/util/List;)V

    return-void
.end method

.method public final getAlreadyUsedShortcutInfo()LC7/a;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortcutPickerPage;->S:LC7/a;

    return-object p0
.end method

.method public onAttachedToWindow()V
    .registers 2

    invoke-super {p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->onAttachedToWindow()V

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortcutPickerPage;->P:Le3/r0;

    iget-object v0, v0, Le3/r0;->x:Landroidx/recyclerview/widget/RecyclerView;

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortcutPickerPage;->getShortcutListAdapter()LF7/j;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    return-void
.end method

.method public onDetachedFromWindow()V
    .registers 2

    invoke-super {p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->onDetachedFromWindow()V

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortcutPickerPage;->P:Le3/r0;

    iget-object p0, p0, Le3/r0;->x:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    return-void
.end method

.method public final setAlreadyUsedShortcutInfo(LC7/a;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortcutPickerPage;->S:LC7/a;

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortcutPickerPage;->getShortcutListAdapter()LF7/j;

    move-result-object p1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortcutPickerPage;->S:LC7/a;

    invoke-virtual {p1, p0}, LF7/j;->e(LC7/a;)V

    return-void
.end method
