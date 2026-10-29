.class public final LT6/b;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "SourceFile"


# instance fields
.field private final q:Ljava/util/List;

.field private final r:Z

.field private final s:Landroid/os/Handler;

.field private t:Lv8/l;

.field private u:Z

.field private v:Landroid/graphics/Point;


# direct methods
.method public constructor <init>(Ljava/util/List;ZLandroid/os/Handler;Lv8/l;)V
    .registers 6

    const-string v0, "prompts"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "handler"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    iput-object p1, p0, LT6/b;->q:Ljava/util/List;

    iput-boolean p2, p0, LT6/b;->r:Z

    iput-object p3, p0, LT6/b;->s:Landroid/os/Handler;

    iput-object p4, p0, LT6/b;->t:Lv8/l;

    const/4 p1, 0x1

    iput-boolean p1, p0, LT6/b;->u:Z

    new-instance p1, Landroid/graphics/Point;

    const/4 p2, 0x0

    invoke-direct {p1, p2, p2}, Landroid/graphics/Point;-><init>(II)V

    iput-object p1, p0, LT6/b;->v:Landroid/graphics/Point;

    return-void
.end method


# virtual methods
.method public final d()Z
    .registers 1

    iget-boolean p0, p0, LT6/b;->u:Z

    return p0
.end method

.method public e(LT6/f;I)V
    .registers 10

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LT6/b;->q:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    if-eqz v2, :cond_1d

    iget-boolean v4, p0, LT6/b;->u:Z

    iget-object p0, p0, LT6/b;->v:Landroid/graphics/Point;

    iget v5, p0, Landroid/graphics/Point;->x:I

    iget v6, p0, Landroid/graphics/Point;->y:I

    move-object v1, p1

    move v3, p2

    invoke-virtual/range {v1 .. v6}, LT6/f;->m(Lcom/nothing/wallpaper/picker/creative/model/Prompt;IZII)V

    :cond_1d
    return-void
.end method

.method public f(Landroid/view/ViewGroup;I)LT6/f;
    .registers 5

    const-string p2, "parent"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, LT6/f;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Le3/A;->C(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Le3/A;

    move-result-object p1

    const-string v0, "inflate(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, LT6/b;->r:Z

    iget-object v1, p0, LT6/b;->s:Landroid/os/Handler;

    iget-object p0, p0, LT6/b;->t:Lv8/l;

    invoke-direct {p2, p1, v0, v1, p0}, LT6/f;-><init>(Le3/A;ZLandroid/os/Handler;Lv8/l;)V

    return-object p2
.end method

.method public final g(Z)V
    .registers 2

    iput-boolean p1, p0, LT6/b;->u:Z

    return-void
.end method

.method public getItemCount()I
    .registers 1

    iget-object p0, p0, LT6/b;->q:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    return p0
.end method

.method public final h(Landroid/graphics/Point;)V
    .registers 3

    const-string v0, "point"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LT6/b;->v:Landroid/graphics/Point;

    return-void
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .registers 3

    check-cast p1, LT6/f;

    invoke-virtual {p0, p1, p2}, LT6/b;->e(LT6/f;I)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .registers 3

    invoke-virtual {p0, p1, p2}, LT6/b;->f(Landroid/view/ViewGroup;I)LT6/f;

    move-result-object p0

    return-object p0
.end method
