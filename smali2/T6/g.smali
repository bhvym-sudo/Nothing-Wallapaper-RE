.class public final LT6/g;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "SourceFile"


# instance fields
.field private final q:Ljava/util/List;

.field private r:Lv8/l;

.field private s:Landroid/graphics/Point;


# direct methods
.method public constructor <init>(Ljava/util/List;Lv8/l;)V
    .registers 4

    const-string v0, "wallpapers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    iput-object p1, p0, LT6/g;->q:Ljava/util/List;

    iput-object p2, p0, LT6/g;->r:Lv8/l;

    new-instance p1, Landroid/graphics/Point;

    const/4 p2, 0x0

    invoke-direct {p1, p2, p2}, Landroid/graphics/Point;-><init>(II)V

    iput-object p1, p0, LT6/g;->s:Landroid/graphics/Point;

    return-void
.end method


# virtual methods
.method public final d()Landroid/graphics/Point;
    .registers 1

    iget-object p0, p0, LT6/g;->s:Landroid/graphics/Point;

    return-object p0
.end method

.method public e(LT6/i;I)V
    .registers 5

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LT6/g;->q:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;

    if-eqz v0, :cond_18

    iget-object p0, p0, LT6/g;->s:Landroid/graphics/Point;

    iget v1, p0, Landroid/graphics/Point;->x:I

    iget p0, p0, Landroid/graphics/Point;->y:I

    invoke-virtual {p1, v0, p2, v1, p0}, LT6/i;->e(Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;III)V

    :cond_18
    return-void
.end method

.method public f(Landroid/view/ViewGroup;I)LT6/i;
    .registers 5

    const-string p2, "parent"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, LT6/i;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Le3/C;->C(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Le3/C;

    move-result-object p1

    const-string v0, "inflate(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, LT6/g;->r:Lv8/l;

    invoke-direct {p2, p1, p0}, LT6/i;-><init>(Le3/C;Lv8/l;)V

    return-object p2
.end method

.method public final g(Landroid/graphics/Point;)V
    .registers 3

    const-string v0, "point"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LT6/g;->s:Landroid/graphics/Point;

    return-void
.end method

.method public getItemCount()I
    .registers 1

    iget-object p0, p0, LT6/g;->q:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    return p0
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .registers 3

    check-cast p1, LT6/i;

    invoke-virtual {p0, p1, p2}, LT6/g;->e(LT6/i;I)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .registers 3

    invoke-virtual {p0, p1, p2}, LT6/g;->f(Landroid/view/ViewGroup;I)LT6/i;

    move-result-object p0

    return-object p0
.end method
