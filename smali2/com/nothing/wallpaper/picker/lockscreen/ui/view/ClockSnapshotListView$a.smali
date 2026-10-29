.class final Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a$a;
    }
.end annotation


# instance fields
.field private final q:LS1/a;

.field private final r:Lcom/android/launcher3/f;

.field private final s:Ljava/util/List;

.field final synthetic t:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;


# direct methods
.method public constructor <init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;LS1/a;Lcom/android/launcher3/f;Ljava/util/List;)V
    .registers 6

    const-string v0, "clockViewFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceProfile"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "items"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a;->t:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    iput-object p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a;->q:LS1/a;

    iput-object p3, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a;->r:Lcom/android/launcher3/f;

    iput-object p4, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a;->s:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final d(Ljava/util/List;)Z
    .registers 6

    const-string v0, "clockModels"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a;->s:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_13

    return v2

    :cond_13
    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a;->s:Ljava/util/List;

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, Li8/s;->x0(Ljava/lang/Iterable;)Ljava/lang/Iterable;

    move-result-object p0

    instance-of v0, p0, Ljava/util/Collection;

    const/4 v1, 0x1

    if-eqz v0, :cond_2a

    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2a

    return v1

    :cond_2a
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_2e
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5c

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li8/I;

    invoke-virtual {v0}, Li8/I;->a()I

    move-result v3

    invoke-virtual {v0}, Li8/I;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LT1/a;

    invoke-static {p1, v3}, Li8/s;->V(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LT1/a;

    if-eqz v3, :cond_5b

    invoke-virtual {v0}, LT1/a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3}, LT1/a;->a()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5b

    goto :goto_2e

    :cond_5b
    return v2

    :cond_5c
    return v1
.end method

.method public e(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a$a;I)V
    .registers 4

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a;->s:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LT1/a;

    invoke-virtual {p1, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a$a;->e(LT1/a;)V

    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {v0, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a;->t:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;->getOnClockItemClickListener()Landroid/view/View$OnClickListener;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public f(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a$a;ILjava/util/List;)V
    .registers 5

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "payloads"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result p3

    if-eqz p3, :cond_14

    invoke-virtual {p0, p1, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a;->e(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a$a;I)V

    return-void

    :cond_14
    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a;->s:Ljava/util/List;

    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LT1/a;

    invoke-virtual {p1, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a$a;->h(LT1/a;)V

    return-void
.end method

.method public g(Landroid/view/ViewGroup;I)Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a$a;
    .registers 5

    const-string p2, "parent"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    new-instance v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a$a;

    const/4 v1, 0x0

    invoke-static {p2, p1, v1}, Le3/i;->C(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Le3/i;

    move-result-object p1

    const-string p2, "inflate(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a;->r:Lcom/android/launcher3/f;

    iget-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a;->q:LS1/a;

    invoke-direct {v0, p0, p1, p2, v1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a$a;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a;Le3/i;Lcom/android/launcher3/f;LS1/a;)V

    return-object v0
.end method

.method public getItemCount()I
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a;->s:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    return p0
.end method

.method public h(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a$a;)V
    .registers 3

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->onViewRecycled(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V

    invoke-virtual {p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a$a;->g()V

    return-void
.end method

.method public final i(I)Z
    .registers 10

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a;->s:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    move v2, v1

    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, -0x1

    const/4 v5, 0x1

    if-eqz v3, :cond_20

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LT1/a;

    invoke-virtual {v3}, LT1/a;->c()Z

    move-result v3

    if-ne v3, v5, :cond_1d

    goto :goto_21

    :cond_1d
    add-int/lit8 v2, v2, 0x1

    goto :goto_8

    :cond_20
    move v2, v4

    :goto_21
    if-eq v2, p1, :cond_67

    if-eq v2, v4, :cond_67

    if-ne p1, v4, :cond_28

    goto :goto_67

    :cond_28
    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a;->s:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LT1/a;

    iget-object v3, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a;->s:Ljava/util/List;

    invoke-interface {v3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LT1/a;

    iget-object v4, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a;->s:Ljava/util/List;

    new-instance v6, LT1/a;

    invoke-virtual {v0}, LT1/a;->a()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0}, LT1/a;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v6, v7, v1, v0}, LT1/a;-><init>(Ljava/lang/String;ZLjava/lang/String;)V

    invoke-interface {v4, v2, v6}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a;->s:Ljava/util/List;

    new-instance v1, LT1/a;

    invoke-virtual {v3}, LT1/a;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, LT1/a;->b()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v4, v5, v3}, LT1/a;-><init>(Ljava/lang/String;ZLjava/lang/String;)V

    invoke-interface {v0, p1, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p0, v2, v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(ILjava/lang/Object;)V

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p0, p1, v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(ILjava/lang/Object;)V

    return v5

    :cond_67
    :goto_67
    return v1
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .registers 3

    .line 1
    check-cast p1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a$a;

    invoke-virtual {p0, p1, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a;->e(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a$a;I)V

    return-void
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/util/List;)V
    .registers 4

    .line 2
    check-cast p1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a$a;

    invoke-virtual {p0, p1, p2, p3}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a;->f(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a$a;ILjava/util/List;)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .registers 3

    invoke-virtual {p0, p1, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a;->g(Landroid/view/ViewGroup;I)Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a$a;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic onViewRecycled(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V
    .registers 2

    check-cast p1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a$a;

    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a;->h(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a$a;)V

    return-void
.end method
