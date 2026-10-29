.class public final LF7/j;
.super Landroidx/recyclerview/widget/ListAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF7/j$a;
    }
.end annotation


# instance fields
.field private final q:Ly7/t;

.field private r:LC7/a;


# direct methods
.method public constructor <init>(Ly7/t;)V
    .registers 3

    new-instance v0, LF7/g;

    invoke-direct {v0}, LF7/g;-><init>()V

    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/ListAdapter;-><init>(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)V

    iput-object p1, p0, LF7/j;->q:Ly7/t;

    return-void
.end method


# virtual methods
.method public final d()LC7/a;
    .registers 1

    iget-object p0, p0, LF7/j;->r:LC7/a;

    return-object p0
.end method

.method public final e(LC7/a;)V
    .registers 2

    iput-object p1, p0, LF7/j;->r:LC7/a;

    return-void
.end method

.method public onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .registers 4

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/ListAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LC7/a;

    instance-of p2, p1, LF7/j$a;

    if-eqz p2, :cond_17

    check-cast p1, LF7/j$a;

    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {p1, p0}, LF7/j$a;->f(LC7/a;)V

    :cond_17
    return-void
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .registers 5

    const-string p2, "parent"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, LF7/j$a;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Le3/p0;->C(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Le3/p0;

    move-result-object p1

    const-string v0, "inflate(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LF7/j;->q:Ly7/t;

    invoke-direct {p2, p0, p1, v0}, LF7/j$a;-><init>(LF7/j;Le3/p0;Ly7/t;)V

    return-object p2
.end method
