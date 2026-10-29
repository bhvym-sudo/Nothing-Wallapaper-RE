.class public final Lcom/nothing/wallpaper/widget/CategoryItemView;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nothing/wallpaper/widget/CategoryItemView$a;
    }
.end annotation


# static fields
.field public static final v:Lcom/nothing/wallpaper/widget/CategoryItemView$a;


# instance fields
.field private q:LM6/c;

.field private r:Lg3/a;

.field private s:Z

.field private t:Landroid/widget/TextView;

.field private u:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lcom/nothing/wallpaper/widget/CategoryItemView$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/nothing/wallpaper/widget/CategoryItemView$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lcom/nothing/wallpaper/widget/CategoryItemView;->v:Lcom/nothing/wallpaper/widget/CategoryItemView$a;

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

    invoke-direct/range {v1 .. v7}, Lcom/nothing/wallpaper/widget/CategoryItemView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/h;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .registers 6

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

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
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/nothing/wallpaper/widget/CategoryItemView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public static synthetic a(Lcom/nothing/wallpaper/widget/CategoryItemView;Ljava/util/List;)V
    .registers 2

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/widget/CategoryItemView;->d(Lcom/nothing/wallpaper/widget/CategoryItemView;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic b(Lcom/nothing/wallpaper/widget/CategoryItemView;Lv8/p;Lg3/x;Landroid/view/View;)Lh8/A;
    .registers 4

    invoke-static {p0, p1, p2, p3}, Lcom/nothing/wallpaper/widget/CategoryItemView;->g(Lcom/nothing/wallpaper/widget/CategoryItemView;Lv8/p;Lg3/x;Landroid/view/View;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Lcom/nothing/wallpaper/widget/CategoryItemView;Ljava/util/List;)V
    .registers 3

    iget-boolean v0, p0, Lcom/nothing/wallpaper/widget/CategoryItemView;->s:Z

    if-eqz v0, :cond_c

    iget-object p0, p0, Lcom/nothing/wallpaper/widget/CategoryItemView;->q:LM6/c;

    if-eqz p0, :cond_b

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/ListAdapter;->submitList(Ljava/util/List;)V

    :cond_b
    return-void

    :cond_c
    invoke-static {p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-direct {p0, p1}, Lcom/nothing/wallpaper/widget/CategoryItemView;->e(Ljava/util/List;)V

    return-void
.end method

.method private final e(Ljava/util/List;)V
    .registers 8

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x6

    if-le v0, v1, :cond_27

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1, v1}, Li8/s;->o0(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    new-instance v0, LJ6/m;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const v1, 0x7f130234

    const v2, 0x7f08027e

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, LJ6/m;-><init>(IIIILkotlin/jvm/internal/h;)V

    invoke-static {v0}, Li8/s;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {p1, v0}, Li8/s;->g0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    :cond_27
    iget-object v0, p0, Lcom/nothing/wallpaper/widget/CategoryItemView;->r:Lg3/a;

    instance-of v0, v0, LJ6/h;

    if-eqz v0, :cond_45

    new-instance v0, LJ6/m;

    const v1, 0x7f080276

    const/4 v2, 0x0

    const v3, 0x7f130207

    invoke-direct {v0, v3, v1, v2}, LJ6/m;-><init>(III)V

    invoke-static {v0}, Li8/s;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {v0, p1}, Li8/s;->g0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    :cond_45
    iget-object p0, p0, Lcom/nothing/wallpaper/widget/CategoryItemView;->q:LM6/c;

    if-eqz p0, :cond_4c

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/ListAdapter;->submitList(Ljava/util/List;)V

    :cond_4c
    return-void
.end method

.method private static final g(Lcom/nothing/wallpaper/widget/CategoryItemView;Lv8/p;Lg3/x;Landroid/view/View;)Lh8/A;
    .registers 5

    const-string v0, "view"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, LJ6/m;

    if-eqz v0, :cond_14

    iget-object p0, p0, Lcom/nothing/wallpaper/widget/CategoryItemView;->r:Lg3/a;

    invoke-virtual {p3, p0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    sget-object p0, LR7/d;->r:LR7/d;

    invoke-virtual {p0}, LR7/d;->j()V

    goto :goto_25

    :cond_14
    instance-of p0, p2, LJ6/c;

    if-nez p0, :cond_25

    if-eqz p2, :cond_25

    invoke-virtual {p2}, Lg3/x;->r()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_25

    sget-object v0, LR7/d;->r:LR7/d;

    invoke-virtual {v0, p0}, LR7/d;->k(Ljava/lang/String;)V

    :cond_25
    :goto_25
    invoke-interface {p1, p2, p3}, Lv8/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method


# virtual methods
.method public final c(Lg3/a;)V
    .registers 4

    const-string v0, "category"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/nothing/wallpaper/widget/CategoryItemView;->r:Lg3/a;

    iget-object v0, p0, Lcom/nothing/wallpaper/widget/CategoryItemView;->t:Landroid/widget/TextView;

    if-eqz v0, :cond_12

    invoke-virtual {p1}, Lg3/a;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_12
    instance-of v0, p1, Lg3/r;

    if-eqz v0, :cond_25

    check-cast p1, Lg3/r;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, LT7/a;

    invoke-direct {v1, p0}, LT7/a;-><init>(Lcom/nothing/wallpaper/widget/CategoryItemView;)V

    const/4 p0, 0x0

    invoke-virtual {p1, v0, v1, p0}, Lg3/r;->o(Landroid/content/Context;Lg3/A;Z)V

    :cond_25
    return-void
.end method

.method public final f(Ljava/util/Set;ZLv8/p;)V
    .registers 7

    const-string v0, "appliedIds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-boolean p2, p0, Lcom/nothing/wallpaper/widget/CategoryItemView;->s:Z

    iget-object v0, p0, Lcom/nothing/wallpaper/widget/CategoryItemView;->u:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_29

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-eqz v0, :cond_29

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    if-eqz p2, :cond_20

    const v2, 0x7f0704d5

    goto :goto_23

    :cond_20
    const v2, 0x7f0704d4

    :goto_23
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v1

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    :cond_29
    new-instance v0, LM6/c;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "getContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, LT7/b;

    invoke-direct {v2, p0, p3}, LT7/b;-><init>(Lcom/nothing/wallpaper/widget/CategoryItemView;Lv8/p;)V

    invoke-direct {v0, v1, p1, v2}, LM6/c;-><init>(Landroid/content/Context;Ljava/util/Set;Lv8/p;)V

    iput-object v0, p0, Lcom/nothing/wallpaper/widget/CategoryItemView;->q:LM6/c;

    iget-object p1, p0, Lcom/nothing/wallpaper/widget/CategoryItemView;->u:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz p1, :cond_79

    const/4 p3, 0x2

    const/4 v0, 0x0

    if-eqz p2, :cond_50

    new-instance p2, Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {p2, v1, p3, v0, v0}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;IIZ)V

    goto :goto_59

    :cond_50
    new-instance p2, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {p2, v1, v0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    :goto_59
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    new-instance p2, LM6/v;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f070460

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v1

    div-int/2addr v1, p3

    invoke-direct {p2, v1, v0}, LM6/v;-><init>(II)V

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    iget-object p0, p0, Lcom/nothing/wallpaper/widget/CategoryItemView;->q:LM6/c;

    invoke-virtual {p1, p0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    :cond_79
    return-void
.end method

.method protected onFinishInflate()V
    .registers 2

    invoke-super {p0}, Landroid/view/View;->onFinishInflate()V

    const v0, 0x7f0a00f3

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/nothing/wallpaper/widget/CategoryItemView;->t:Landroid/widget/TextView;

    const v0, 0x7f0a00f0

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    iput-object v0, p0, Lcom/nothing/wallpaper/widget/CategoryItemView;->u:Landroidx/recyclerview/widget/RecyclerView;

    return-void
.end method
