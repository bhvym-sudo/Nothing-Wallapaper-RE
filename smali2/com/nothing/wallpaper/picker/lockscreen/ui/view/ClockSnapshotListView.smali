.class public final Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a;
    }
.end annotation


# instance fields
.field private final q:Le3/k;

.field private r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a;

.field private final s:Lcom/android/launcher3/views/f;

.field private final t:Lcom/android/launcher3/f;

.field private u:Landroid/view/View$OnClickListener;

.field private final v:Ljava/util/WeakHashMap;

.field private final w:LF8/L;

.field private x:Ljava/lang/Boolean;


# direct methods
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

    invoke-direct/range {v1 .. v7}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/h;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .registers 6

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 4
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const/4 p3, 0x1

    invoke-static {p2, p0, p3}, Le3/k;->C(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Le3/k;

    move-result-object p2

    const-string p4, "inflate(...)"

    invoke-static {p2, p4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;->q:Le3/k;

    .line 5
    invoke-static {p1}, Lcom/android/launcher3/views/f;->y(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    check-cast p1, Lcom/android/launcher3/views/f;

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;->s:Lcom/android/launcher3/views/f;

    .line 6
    invoke-interface {p1}, Lcom/android/launcher3/views/f;->K()Lcom/android/launcher3/f;

    move-result-object p1

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;->t:Lcom/android/launcher3/f;

    .line 7
    new-instance p1, Ljava/util/WeakHashMap;

    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;->v:Ljava/util/WeakHashMap;

    const/4 p1, 0x0

    .line 8
    invoke-static {p1, p3, p1}, LF8/T0;->b(LF8/x0;ILjava/lang/Object;)LF8/y;

    move-result-object p1

    invoke-static {}, LF8/b0;->c()LF8/H0;

    move-result-object p2

    invoke-interface {p1, p2}, Lm8/i;->z(Lm8/i;)Lm8/i;

    move-result-object p1

    invoke-static {p1}, LF8/M;->a(Lm8/i;)LF8/L;

    move-result-object p1

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;->w:LF8/L;

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
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public static synthetic a(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;Ljava/util/List;Landroidx/recyclerview/widget/LinearLayoutManager;)V
    .registers 3

    invoke-static {p0, p1, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;->j(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;Ljava/util/List;Landroidx/recyclerview/widget/LinearLayoutManager;)V

    return-void
.end method

.method public static final synthetic b(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;Ljava/lang/String;)Landroid/view/View;
    .registers 2

    invoke-direct {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;->f(Ljava/lang/String;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;Ljava/lang/String;Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;Lv8/l;)V
    .registers 4

    invoke-direct {p0, p1, p2, p3}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;->g(Ljava/lang/String;Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;Lv8/l;)V

    return-void
.end method

.method public static final synthetic d(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;Ljava/lang/String;Landroid/view/View;)V
    .registers 3

    invoke-direct {p0, p1, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;->h(Ljava/lang/String;Landroid/view/View;)V

    return-void
.end method

.method private final f(Ljava/lang/String;)Landroid/view/View;
    .registers 4

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;->v:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-eqz v0, :cond_11

    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v1

    if-nez v1, :cond_11

    goto :goto_13

    :cond_11
    if-nez v0, :cond_1a

    :goto_13
    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;->v:Ljava/util/WeakHashMap;

    invoke-virtual {p0, p1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p0, 0x0

    return-object p0

    :cond_1a
    return-object v0
.end method

.method private final g(Ljava/lang/String;Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;Lv8/l;)V
    .registers 12

    invoke-direct {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;->f(Ljava/lang/String;)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_a

    invoke-interface {p3, v0}, Lv8/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_a
    iget-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;->w:LF8/L;

    new-instance v2, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$b;

    const/4 v7, 0x0

    move-object v3, p0

    move-object v4, p1

    move-object v6, p2

    move-object v5, p3

    invoke-direct/range {v2 .. v7}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$b;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;Ljava/lang/String;Lv8/l;Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;Lm8/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    move-object v4, v2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method

.method private final h(Ljava/lang/String;Landroid/view/View;)V
    .registers 3

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;->v:Ljava/util/WeakHashMap;

    invoke-interface {p0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final j(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;Ljava/util/List;Landroidx/recyclerview/widget/LinearLayoutManager;)V
    .registers 5

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    const v0, 0x7f070464

    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p0

    float-to-int p0, p0

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    :goto_11
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_27

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LT1/a;

    invoke-virtual {v1}, LT1/a;->c()Z

    move-result v1

    if-eqz v1, :cond_24

    goto :goto_28

    :cond_24
    add-int/lit8 v0, v0, 0x1

    goto :goto_11

    :cond_27
    const/4 v0, -0x1

    :goto_28
    invoke-virtual {p2, v0, p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->scrollToPositionWithOffset(II)V

    return-void
.end method

.method private final k()V
    .registers 3

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/text/format/DateFormat;->is24HourFormat(Landroid/content/Context;)Z

    move-result v0

    iget-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;->x:Ljava/lang/Boolean;

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_15

    goto :goto_2a

    :cond_15
    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;->v:Ljava/util/WeakHashMap;

    invoke-virtual {v0}, Ljava/util/WeakHashMap;->clear()V

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a;

    if-eqz p0, :cond_2a

    const/4 v0, 0x0

    if-eqz p0, :cond_26

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a;->getItemCount()I

    move-result v1

    goto :goto_27

    :cond_26
    move v1, v0

    :goto_27
    invoke-virtual {p0, v0, v1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemRangeChanged(II)V

    :cond_2a
    :goto_2a
    return-void
.end method


# virtual methods
.method public final e()V
    .registers 3

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;->q:Le3/k;

    iget-object v0, v0, Le3/k;->v:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    iput-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a;

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;->v:Ljava/util/WeakHashMap;

    invoke-virtual {v0}, Ljava/util/WeakHashMap;->clear()V

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;->w:LF8/L;

    const/4 v0, 0x1

    invoke-static {p0, v1, v0, v1}, LF8/M;->d(LF8/L;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    return-void
.end method

.method public final getOnClockItemClickListener()Landroid/view/View$OnClickListener;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;->u:Landroid/view/View$OnClickListener;

    return-object p0
.end method

.method public final i(Ljava/util/List;LS1/a;)V
    .registers 8

    const-string v0, "clocks"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clockViewFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;->q:Le3/k;

    iget-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a;

    if-eqz v1, :cond_1b

    invoke-virtual {v1, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a;->d(Ljava/util/List;)Z

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1b

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;->k()V

    return-void

    :cond_1b
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    iget-object v2, v0, Le3/k;->v:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    iget-object v2, v0, Le3/k;->v:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getItemDecorationCount()I

    move-result v2

    if-lez v2, :cond_37

    iget-object v2, v0, Le3/k;->v:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView;->removeItemDecorationAt(I)V

    :cond_37
    iget-object v2, v0, Le3/k;->v:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v4, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/u;

    invoke-direct {v4}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/u;-><init>()V

    invoke-virtual {v2, v4, v3}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;I)V

    new-instance v2, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a;

    iget-object v3, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;->t:Lcom/android/launcher3/f;

    const-string v4, "deviceProfile"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v4, p1

    check-cast v4, Ljava/util/Collection;

    invoke-static {v4}, Li8/s;->u0(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v4

    invoke-direct {v2, p0, p2, v3, v4}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;LS1/a;Lcom/android/launcher3/f;Ljava/util/List;)V

    iput-object v2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a;

    iget-object p2, v0, Le3/k;->v:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p2, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    iget-object p2, v0, Le3/k;->v:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/z;

    invoke-direct {v0, p0, p1, v1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/z;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;Ljava/util/List;Landroidx/recyclerview/widget/LinearLayoutManager;)V

    invoke-virtual {p2, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final l(IZ)V
    .registers 4

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a;

    if-eqz v0, :cond_7

    invoke-virtual {v0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a;->i(I)Z

    :cond_7
    if-eqz p2, :cond_10

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;->q:Le3/k;

    iget-object p0, p0, Le3/k;->v:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->smoothScrollToPosition(I)V

    :cond_10
    return-void
.end method

.method public final setOnClockItemClickListener(Landroid/view/View$OnClickListener;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;->u:Landroid/view/View$OnClickListener;

    return-void
.end method
