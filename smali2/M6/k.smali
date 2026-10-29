.class public final LM6/k;
.super Landroidx/recyclerview/widget/ListAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LM6/k$a;,
        LM6/k$b;,
        LM6/k$c;,
        LM6/k$d;
    }
.end annotation


# static fields
.field public static final w:LM6/k$a;


# instance fields
.field private final q:Ljava/util/Set;

.field private final r:Lv8/q;

.field private final s:I

.field private final t:I

.field private final u:I

.field private v:F


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LM6/k$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LM6/k$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LM6/k;->w:LM6/k$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/Set;Lv8/q;)V
    .registers 6

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appliedIds"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LM6/w;

    invoke-direct {v0, p1}, LM6/w;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/ListAdapter;-><init>(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)V

    iput-object p2, p0, LM6/k;->q:Ljava/util/Set;

    iput-object p3, p0, LM6/k;->r:Lv8/q;

    const/4 p2, 0x1

    iput p2, p0, LM6/k;->t:I

    const/4 p2, 0x2

    iput p2, p0, LM6/k;->u:I

    invoke-static {p1}, Li6/q;->d(Landroid/content/Context;)Landroid/graphics/Point;

    move-result-object p3

    iget p3, p3, Landroid/graphics/Point;->x:I

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0704d8

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v1, 0x7f07016b

    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    mul-int/2addr v0, p2

    sub-int p2, p3, v0

    mul-int/lit8 p1, p1, 0x6

    sub-int/2addr p2, p1

    int-to-float p1, p2

    const/4 p2, 0x3

    int-to-float p2, p2

    div-float/2addr p1, p2

    int-to-float p2, p3

    div-float/2addr p1, p2

    iput p1, p0, LM6/k;->v:F

    return-void
.end method

.method public static synthetic d(LM6/k;Lg3/x;Z)Lh8/A;
    .registers 3

    invoke-static {p0, p1, p2}, LM6/k;->h(LM6/k;Lg3/x;Z)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(LM6/k;)Z
    .registers 1

    invoke-static {p0}, LM6/k;->g(LM6/k;)Z

    move-result p0

    return p0
.end method

.method private final f()Z
    .registers 5

    invoke-virtual {p0}, Landroidx/recyclerview/widget/ListAdapter;->getCurrentList()Ljava/util/List;

    move-result-object p0

    const-string v0, "getCurrentList(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_f
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2c

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lg3/x;

    instance-of v3, v2, LJ6/i;

    if-eqz v3, :cond_28

    check-cast v2, LJ6/i;

    invoke-virtual {v2}, LJ6/i;->z()Z

    move-result v2

    goto :goto_29

    :cond_28
    move v2, v1

    :goto_29
    if-eqz v2, :cond_f

    goto :goto_2d

    :cond_2c
    const/4 v0, 0x0

    :goto_2d
    check-cast v0, Lg3/x;

    if-eqz v0, :cond_33

    const/4 p0, 0x1

    return p0

    :cond_33
    return v1
.end method

.method private static final g(LM6/k;)Z
    .registers 1

    invoke-direct {p0}, LM6/k;->f()Z

    move-result p0

    return p0
.end method

.method private static final h(LM6/k;Lg3/x;Z)Lh8/A;
    .registers 6

    const-string v0, "wallpaper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/ListAdapter;->getCurrentList()Ljava/util/List;

    move-result-object p0

    const-string v0, "getCurrentList(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_14
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_30

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lg3/x;

    invoke-virtual {v1}, Lg3/x;->r()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lg3/x;->r()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_14

    goto :goto_31

    :cond_30
    const/4 v0, 0x0

    :goto_31
    check-cast v0, Lg3/x;

    instance-of p0, v0, LJ6/i;

    if-eqz p0, :cond_3c

    check-cast v0, LJ6/i;

    invoke-virtual {v0, p2}, LJ6/i;->A(Z)V

    :cond_3c
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method


# virtual methods
.method public getItemCount()I
    .registers 2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/ListAdapter;->getCurrentList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_c

    const/4 p0, 0x1

    return p0

    :cond_c
    invoke-virtual {p0}, Landroidx/recyclerview/widget/ListAdapter;->getCurrentList()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    return p0
.end method

.method public getItemViewType(I)I
    .registers 4

    invoke-virtual {p0}, Landroidx/recyclerview/widget/ListAdapter;->getCurrentList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_d

    iget p0, p0, LM6/k;->u:I

    return p0

    :cond_d
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/ListAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg3/x;

    instance-of v0, p1, LJ6/i;

    invoke-virtual {p1}, Lg3/x;->r()Ljava/lang/String;

    move-result-object p1

    const-string v1, "CREATIVE_FOOT_WALLPAPER_ID"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    and-int/2addr p1, v0

    if-eqz p1, :cond_25

    iget p0, p0, LM6/k;->t:I

    return p0

    :cond_25
    iget p0, p0, LM6/k;->s:I

    return p0
.end method

.method public onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .registers 4

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/ListAdapter;->getCurrentList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_10

    goto :goto_2e

    :cond_10
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/ListAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lg3/x;

    instance-of v0, p1, LM6/k$d;

    if-eqz v0, :cond_25

    check-cast p1, LM6/k$d;

    invoke-static {p2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget-object p0, p0, LM6/k;->q:Ljava/util/Set;

    invoke-virtual {p1, p2, p0}, LM6/k$d;->h(Lg3/x;Ljava/util/Set;)V

    return-void

    :cond_25
    instance-of p0, p1, LM6/k$c;

    if-eqz p0, :cond_2e

    check-cast p1, LM6/k$c;

    invoke-virtual {p1}, LM6/k$c;->d()V

    :cond_2e
    :goto_2e
    return-void
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .registers 12

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iget v1, p0, LM6/k;->t:I

    const-string v2, "inflate(...)"

    const/4 v3, 0x0

    if-ne p2, v1, :cond_21

    new-instance p0, LM6/k$c;

    invoke-static {v0, p1, v3}, Le3/Q;->C(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Le3/Q;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LM6/k$c;-><init>(Le3/Q;)V

    return-object p0

    :cond_21
    iget v1, p0, LM6/k;->u:I

    if-ne p2, v1, :cond_32

    new-instance p0, LM6/k$b;

    invoke-static {v0, p1, v3}, Le3/O;->C(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Le3/O;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LM6/k$b;-><init>(Le3/O;)V

    return-object p0

    :cond_32
    move p2, v3

    new-instance v3, LM6/k$d;

    invoke-static {v0, p1, p2}, Le3/M;->C(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Le3/M;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, LM6/i;

    invoke-direct {v5, p0}, LM6/i;-><init>(LM6/k;)V

    iget v6, p0, LM6/k;->v:F

    iget-object v7, p0, LM6/k;->r:Lv8/q;

    new-instance v8, LM6/j;

    invoke-direct {v8, p0}, LM6/j;-><init>(LM6/k;)V

    invoke-direct/range {v3 .. v8}, LM6/k$d;-><init>(Le3/M;Lv8/a;FLv8/q;Lv8/p;)V

    return-object v3
.end method
