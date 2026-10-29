.class public final LM6/e;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LM6/e$a;
    }
.end annotation


# static fields
.field public static final v:LM6/e$a;


# instance fields
.field private final q:Ljava/util/List;

.field private final r:Ljava/util/Set;

.field private final s:Z

.field private final t:Lv8/p;

.field private u:Landroidx/lifecycle/x;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LM6/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LM6/e$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LM6/e;->v:LM6/e$a;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/util/Set;ZLv8/p;)V
    .registers 6

    const-string v0, "categories"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appliedIds"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    iput-object p1, p0, LM6/e;->q:Ljava/util/List;

    iput-object p2, p0, LM6/e;->r:Ljava/util/Set;

    iput-boolean p3, p0, LM6/e;->s:Z

    iput-object p4, p0, LM6/e;->t:Lv8/p;

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->setHasStableIds(Z)V

    return-void
.end method


# virtual methods
.method public d(LM6/a;I)V
    .registers 4

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LM6/e;->q:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lg3/a;

    instance-of v0, p1, LM6/u;

    if-eqz v0, :cond_19

    check-cast p1, LM6/u;

    iget-object p0, p0, LM6/e;->u:Landroidx/lifecycle/x;

    invoke-virtual {p1, p2, p0}, LM6/u;->m(Lg3/a;Landroidx/lifecycle/x;)V

    return-void

    :cond_19
    invoke-virtual {p1, p2}, LM6/a;->d(Lg3/a;)V

    return-void
.end method

.method public e(Landroid/view/ViewGroup;I)LM6/a;
    .registers 16

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const-string v1, "inflate(...)"

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq p2, v2, :cond_5a

    const/4 v4, 0x2

    const-string v5, "null cannot be cast to non-null type com.nothing.wallpaper.widget.CategoryItemView"

    const v6, 0x7f0d011a

    if-eq p2, v4, :cond_47

    const/4 v2, 0x3

    if-eq p2, v2, :cond_36

    invoke-virtual {v0, v6, p1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, v5}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v7, p1

    check-cast v7, Lcom/nothing/wallpaper/widget/CategoryItemView;

    new-instance v6, LM6/f;

    iget-object v8, p0, LM6/e;->r:Ljava/util/Set;

    iget-object v9, p0, LM6/e;->t:Lv8/p;

    const/16 v11, 0x8

    const/4 v12, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v6 .. v12}, LM6/f;-><init>(Lcom/nothing/wallpaper/widget/CategoryItemView;Ljava/util/Set;Lv8/p;ZILkotlin/jvm/internal/h;)V

    return-object v6

    :cond_36
    new-instance p2, LM6/h;

    invoke-static {v0, p1, v3}, Le3/X;->C(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Le3/X;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LM6/e;->r:Ljava/util/Set;

    iget-object p0, p0, LM6/e;->t:Lv8/p;

    invoke-direct {p2, p1, v0, p0}, LM6/h;-><init>(Le3/X;Ljava/util/Set;Lv8/p;)V

    return-object p2

    :cond_47
    invoke-virtual {v0, v6, p1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, v5}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/nothing/wallpaper/widget/CategoryItemView;

    new-instance p2, LM6/f;

    iget-object v0, p0, LM6/e;->r:Ljava/util/Set;

    iget-object p0, p0, LM6/e;->t:Lv8/p;

    invoke-direct {p2, p1, v0, p0, v2}, LM6/f;-><init>(Lcom/nothing/wallpaper/widget/CategoryItemView;Ljava/util/Set;Lv8/p;Z)V

    return-object p2

    :cond_5a
    new-instance p2, LM6/u;

    invoke-static {v0, p1, v3}, Le3/K;->C(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Le3/K;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, LM6/e;->s:Z

    iget-object p0, p0, LM6/e;->t:Lv8/p;

    invoke-direct {p2, p1, v0, p0}, LM6/u;-><init>(Le3/K;ZLv8/p;)V

    return-object p2
.end method

.method public final f(Landroidx/lifecycle/x;)V
    .registers 2

    iput-object p1, p0, LM6/e;->u:Landroidx/lifecycle/x;

    return-void
.end method

.method public final g(Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;)V
    .registers 3

    const-string p0, "viewPool"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x1

    invoke-virtual {p1, p0, p0}, Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;->setMaxRecycledViews(II)V

    const/4 v0, 0x2

    invoke-virtual {p1, v0, p0}, Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;->setMaxRecycledViews(II)V

    const/4 v0, 0x3

    invoke-virtual {p1, v0, p0}, Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;->setMaxRecycledViews(II)V

    return-void
.end method

.method public getItemCount()I
    .registers 1

    iget-object p0, p0, LM6/e;->q:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    return p0
.end method

.method public getItemId(I)J
    .registers 2

    int-to-long p0, p1

    return-wide p0
.end method

.method public getItemViewType(I)I
    .registers 2

    iget-object p0, p0, LM6/e;->q:Ljava/util/List;

    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lg3/a;

    instance-of p1, p0, LJ6/l;

    if-eqz p1, :cond_e

    const/4 p0, 0x1

    return p0

    :cond_e
    instance-of p1, p0, LJ6/b;

    if-eqz p1, :cond_14

    const/4 p0, 0x2

    return p0

    :cond_14
    instance-of p0, p0, LJ6/h;

    if-eqz p0, :cond_1a

    const/4 p0, 0x3

    return p0

    :cond_1a
    const/4 p0, 0x0

    return p0
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .registers 3

    check-cast p1, LM6/a;

    invoke-virtual {p0, p1, p2}, LM6/e;->d(LM6/a;I)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .registers 3

    invoke-virtual {p0, p1, p2}, LM6/e;->e(Landroid/view/ViewGroup;I)LM6/a;

    move-result-object p0

    return-object p0
.end method
