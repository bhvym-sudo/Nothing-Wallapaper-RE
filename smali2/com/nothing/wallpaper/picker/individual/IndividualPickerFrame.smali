.class public final Lcom/nothing/wallpaper/picker/individual/IndividualPickerFrame;
.super Landroidx/recyclerview/widget/RecyclerView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nothing/wallpaper/picker/individual/IndividualPickerFrame$a;
    }
.end annotation


# static fields
.field public static final t:Lcom/nothing/wallpaper/picker/individual/IndividualPickerFrame$a;


# instance fields
.field private q:Lg3/r;

.field private r:Landroidx/recyclerview/widget/GridLayoutManager;

.field private s:LM6/k;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lcom/nothing/wallpaper/picker/individual/IndividualPickerFrame$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/nothing/wallpaper/picker/individual/IndividualPickerFrame$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lcom/nothing/wallpaper/picker/individual/IndividualPickerFrame;->t:Lcom/nothing/wallpaper/picker/individual/IndividualPickerFrame$a;

    return-void
.end method

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

    invoke-direct/range {v1 .. v6}, Lcom/nothing/wallpaper/picker/individual/IndividualPickerFrame;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/h;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 5

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    new-instance p2, Landroidx/recyclerview/widget/GridLayoutManager;

    const/4 p3, 0x3

    invoke-direct {p2, p1, p3}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    iput-object p2, p0, Lcom/nothing/wallpaper/picker/individual/IndividualPickerFrame;->r:Landroidx/recyclerview/widget/GridLayoutManager;

    .line 5
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 6
    new-instance p1, LI3/p;

    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const p3, 0x7f07016b

    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p2

    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    const v0, 0x7f070460

    invoke-virtual {p3, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p3

    .line 9
    invoke-direct {p1, p2, p3}, LI3/p;-><init>(II)V

    .line 10
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

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
    invoke-direct {p0, p1, p2, p3}, Lcom/nothing/wallpaper/picker/individual/IndividualPickerFrame;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static synthetic a(Lcom/nothing/wallpaper/picker/individual/IndividualPickerFrame;Ljava/util/List;)V
    .registers 2

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/picker/individual/IndividualPickerFrame;->j(Lcom/nothing/wallpaper/picker/individual/IndividualPickerFrame;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic c(Ljava/util/List;Lcom/nothing/wallpaper/picker/individual/IndividualPickerFrame;Ljava/util/List;)V
    .registers 3

    invoke-static {p0, p1, p2}, Lcom/nothing/wallpaper/picker/individual/IndividualPickerFrame;->i(Ljava/util/List;Lcom/nothing/wallpaper/picker/individual/IndividualPickerFrame;Ljava/util/List;)V

    return-void
.end method

.method private final d()LJ6/i;
    .registers 8

    new-instance v0, LJ6/i;

    sget-object v1, LJ6/i;->F:LJ6/i$a;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {v1, p0}, LJ6/i$a;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    const-string v5, ""

    const-string v6, ""

    const-string v1, "CREATIVE_FOOT_WALLPAPER_ID"

    const-string v3, ""

    const-string v4, ""

    invoke-direct/range {v0 .. v6}, LJ6/i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method private final e()V
    .registers 2

    new-instance v0, Lcom/nothing/wallpaper/picker/individual/IndividualPickerFrame$b;

    invoke-direct {v0, p0}, Lcom/nothing/wallpaper/picker/individual/IndividualPickerFrame$b;-><init>(Lcom/nothing/wallpaper/picker/individual/IndividualPickerFrame;)V

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/individual/IndividualPickerFrame;->r:Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/GridLayoutManager;->setSpanSizeLookup(Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;)V

    return-void
.end method

.method private final g(ZLjava/util/List;)V
    .registers 6

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/individual/IndividualPickerFrame;->q:Lg3/r;

    instance-of v1, v0, LJ6/h;

    if-eqz v1, :cond_15

    if-eqz v0, :cond_23

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    new-instance v2, Lx7/a;

    invoke-direct {v2, p2, p0}, Lx7/a;-><init>(Ljava/util/List;Lcom/nothing/wallpaper/picker/individual/IndividualPickerFrame;)V

    invoke-virtual {v0, v1, v2, p1}, Lg3/r;->o(Landroid/content/Context;Lg3/A;Z)V

    return-void

    :cond_15
    if-eqz v0, :cond_23

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    new-instance v1, Lx7/b;

    invoke-direct {v1, p0}, Lx7/b;-><init>(Lcom/nothing/wallpaper/picker/individual/IndividualPickerFrame;)V

    invoke-virtual {v0, p2, v1, p1}, Lg3/r;->o(Landroid/content/Context;Lg3/A;Z)V

    :cond_23
    return-void
.end method

.method static synthetic h(Lcom/nothing/wallpaper/picker/individual/IndividualPickerFrame;ZLjava/util/List;ILjava/lang/Object;)V
    .registers 5

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_5

    const/4 p2, 0x0

    :cond_5
    invoke-direct {p0, p1, p2}, Lcom/nothing/wallpaper/picker/individual/IndividualPickerFrame;->g(ZLjava/util/List;)V

    return-void
.end method

.method private static final i(Ljava/util/List;Lcom/nothing/wallpaper/picker/individual/IndividualPickerFrame;Ljava/util/List;)V
    .registers 7

    if-eqz p0, :cond_44

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_8
    :goto_8
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_44

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {p2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    move-object v1, p2

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_36

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lg3/x;

    invoke-virtual {v3}, Lg3/x;->r()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1e

    goto :goto_37

    :cond_36
    const/4 v2, 0x0

    :goto_37
    check-cast v2, Lg3/x;

    instance-of v0, v2, LJ6/i;

    if-eqz v0, :cond_8

    check-cast v2, LJ6/i;

    const/4 v0, 0x1

    invoke-virtual {v2, v0}, LJ6/i;->A(Z)V

    goto :goto_8

    :cond_44
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p0

    if-lez p0, :cond_51

    invoke-direct {p1}, Lcom/nothing/wallpaper/picker/individual/IndividualPickerFrame;->d()LJ6/i;

    move-result-object p0

    invoke-interface {p2, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_51
    iget-object p0, p1, Lcom/nothing/wallpaper/picker/individual/IndividualPickerFrame;->s:LM6/k;

    if-eqz p0, :cond_58

    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/ListAdapter;->submitList(Ljava/util/List;)V

    :cond_58
    return-void
.end method

.method private static final j(Lcom/nothing/wallpaper/picker/individual/IndividualPickerFrame;Ljava/util/List;)V
    .registers 2

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/individual/IndividualPickerFrame;->s:LM6/k;

    if-eqz p0, :cond_7

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/ListAdapter;->submitList(Ljava/util/List;)V

    :cond_7
    return-void
.end method


# virtual methods
.method public final f()V
    .registers 2

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->scrollToPosition(I)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/individual/IndividualPickerFrame;->s:LM6/k;

    return-void
.end method

.method public final getCategory()Lg3/a;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/individual/IndividualPickerFrame;->q:Lg3/r;

    return-object p0
.end method

.method public final getWallpaperList()Ljava/util/List;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lg3/x;",
            ">;"
        }
    .end annotation

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/individual/IndividualPickerFrame;->s:LM6/k;

    if-eqz p0, :cond_c

    invoke-virtual {p0}, Landroidx/recyclerview/widget/ListAdapter;->getCurrentList()Ljava/util/List;

    move-result-object p0

    if-nez p0, :cond_b

    goto :goto_c

    :cond_b
    return-object p0

    :cond_c
    :goto_c
    invoke-static {}, Li8/s;->l()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public final k(Lg3/r;Ljava/util/Set;Ljava/util/List;Lv8/q;)V
    .registers 8

    const-string v0, "category"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appliedIds"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/individual/IndividualPickerFrame;->q:Lg3/r;

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/individual/IndividualPickerFrame;->s:LM6/k;

    if-nez v0, :cond_28

    new-instance v0, LM6/k;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "getContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1, p2, p4}, LM6/k;-><init>(Landroid/content/Context;Ljava/util/Set;Lv8/q;)V

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/individual/IndividualPickerFrame;->s:LM6/k;

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    :cond_28
    instance-of p1, p1, LJ6/h;

    if-eqz p1, :cond_30

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/individual/IndividualPickerFrame;->e()V

    goto :goto_3a

    :cond_30
    iget-object p1, p0, Lcom/nothing/wallpaper/picker/individual/IndividualPickerFrame;->r:Landroidx/recyclerview/widget/GridLayoutManager;

    new-instance p2, Landroidx/recyclerview/widget/GridLayoutManager$DefaultSpanSizeLookup;

    invoke-direct {p2}, Landroidx/recyclerview/widget/GridLayoutManager$DefaultSpanSizeLookup;-><init>()V

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/GridLayoutManager;->setSpanSizeLookup(Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;)V

    :goto_3a
    const/4 p1, 0x0

    invoke-direct {p0, p1, p3}, Lcom/nothing/wallpaper/picker/individual/IndividualPickerFrame;->g(ZLjava/util/List;)V

    return-void
.end method

.method public final l()V
    .registers 4

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v1, v0}, Lcom/nothing/wallpaper/picker/individual/IndividualPickerFrame;->h(Lcom/nothing/wallpaper/picker/individual/IndividualPickerFrame;ZLjava/util/List;ILjava/lang/Object;)V

    return-void
.end method

.method public final m()V
    .registers 3

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/individual/IndividualPickerFrame;->getWallpaperList()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_a
    :goto_a
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_21

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg3/x;

    instance-of v1, v0, LJ6/i;

    if-eqz v1, :cond_a

    check-cast v0, LJ6/i;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LJ6/i;->A(Z)V

    goto :goto_a

    :cond_21
    return-void
.end method

.method public onApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .registers 6

    const-string v0, "insets"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Landroid/view/WindowInsets$Type;->navigationBars()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/WindowInsets;->getInsets(I)Landroid/graphics/Insets;

    move-result-object v0

    const-string v1, "getInsets(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, v0, Landroid/graphics/Insets;->bottom:I

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v3

    invoke-virtual {p0, v1, v2, v3, v0}, Landroid/view/View;->setPadding(IIII)V

    invoke-super {p0, p1}, Landroid/view/View;->onApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object p0

    const-string p1, "onApplyWindowInsets(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
