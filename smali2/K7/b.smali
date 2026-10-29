.class public final LK7/b;
.super Lz3/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LK7/b$a;
    }
.end annotation


# instance fields
.field private final A:I

.field private final x:Landroidx/lifecycle/x;

.field private final y:Lv8/p;

.field private final z:I


# direct methods
.method public constructor <init>(ILandroidx/lifecycle/x;Lv8/p;)V
    .registers 13

    const-string v0, "lifecycleOwner"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bindIcon"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v7, 0xc

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move-object v6, p3

    invoke-direct/range {v1 .. v8}, Lz3/a;-><init>(ILandroidx/lifecycle/x;LF8/I;LA3/f$b;Lv8/p;ILkotlin/jvm/internal/h;)V

    iput-object v3, v1, LK7/b;->x:Landroidx/lifecycle/x;

    iput-object v6, v1, LK7/b;->y:Lv8/p;

    const/4 p0, 0x1

    iput p0, v1, LK7/b;->A:I

    return-void
.end method

.method public static synthetic i(Landroid/view/View;Landroid/view/View;ZLA3/f$a;Z)Lh8/A;
    .registers 5

    invoke-static {p0, p1, p2, p3, p4}, LK7/b;->j(Landroid/view/View;Landroid/view/View;ZLA3/f$a;Z)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method private static final j(Landroid/view/View;Landroid/view/View;ZLA3/f$a;Z)Lh8/A;
    .registers 5

    const-string p4, "borderView"

    invoke-static {p0, p4}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "contentView"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "animationSpec"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1, p2}, Lq6/a;->d(Landroid/view/View;Landroid/view/View;Z)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method


# virtual methods
.method public f(Lz3/a$a;I)V
    .registers 12

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lz3/a$a;->d()LF8/d0;

    move-result-object v0

    if-eqz v0, :cond_e

    invoke-interface {v0}, LF8/d0;->dispose()V

    :cond_e
    invoke-virtual {p0}, Lz3/a;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    move-object v2, p2

    check-cast v2, LB3/a;

    invoke-virtual {v2}, LB3/a;->d()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lb2/a;

    if-eqz p2, :cond_38

    iget-object p2, p0, LK7/b;->y:Lv8/p;

    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    const v1, 0x7f0a01f1

    invoke-virtual {v0, v1}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object v0

    const-string v1, "requireViewById(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, LB3/a;->d()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lv8/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_38
    sget-object v0, LA3/f;->a:LA3/f;

    iget-object v1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    const-string p2, "itemView"

    invoke-static {v1, p2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p0, LK7/b;->x:Landroidx/lifecycle/x;

    new-instance v6, LK7/a;

    invoke-direct {v6}, LK7/a;-><init>()V

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v8}, LA3/f;->l(LA3/f;Landroid/view/View;LB3/a;Landroidx/lifecycle/x;LA3/f$a;LA3/f$b;Lv8/s;ILjava/lang/Object;)LF8/d0;

    move-result-object p0

    invoke-virtual {p1, p0}, Lz3/a$a;->e(LF8/d0;)V

    return-void
.end method

.method public g(Landroid/view/ViewGroup;I)Lz3/a$a;
    .registers 5

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, LK7/b;->z:I

    if-ne p2, v0, :cond_e

    invoke-super {p0, p1, p2}, Lz3/a;->g(Landroid/view/ViewGroup;I)Lz3/a$a;

    move-result-object p0

    return-object p0

    :cond_e
    new-instance p0, LK7/b$a;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0d011c

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const-string p2, "inflate(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LK7/b$a;-><init>(Landroid/view/View;)V

    return-object p0
.end method

.method public getItemViewType(I)I
    .registers 3

    invoke-virtual {p0}, Lz3/a;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LB3/a;

    invoke-virtual {p1}, LB3/a;->e()Lq3/a;

    move-result-object p1

    sget-object v0, Lcom/nothing/wallpaper/NTPickerApplication;->q:Lcom/nothing/wallpaper/NTPickerApplication$a;

    invoke-virtual {v0}, Lcom/nothing/wallpaper/NTPickerApplication$a;->a()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {p1, v0}, Lq3/a;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "Bauhaus"

    invoke-static {v0, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_23

    iget p0, p0, LK7/b;->A:I

    return p0

    :cond_23
    iget p0, p0, LK7/b;->z:I

    return p0
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .registers 3

    check-cast p1, Lz3/a$a;

    invoke-virtual {p0, p1, p2}, LK7/b;->f(Lz3/a$a;I)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .registers 3

    invoke-virtual {p0, p1, p2}, LK7/b;->g(Landroid/view/ViewGroup;I)Lz3/a$a;

    move-result-object p0

    return-object p0
.end method
