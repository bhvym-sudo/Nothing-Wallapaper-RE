.class public final LF7/p;
.super Landroidx/recyclerview/widget/ListAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF7/p$a;
    }
.end annotation


# instance fields
.field private final q:Lcom/android/launcher3/f;

.field private final r:LE7/S;


# direct methods
.method public constructor <init>(Lcom/android/launcher3/f;LE7/S;)V
    .registers 4

    const-string v0, "deviceProfile"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LF7/q;

    invoke-direct {v0}, LF7/q;-><init>()V

    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/ListAdapter;-><init>(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)V

    iput-object p1, p0, LF7/p;->q:Lcom/android/launcher3/f;

    iput-object p2, p0, LF7/p;->r:LE7/S;

    return-void
.end method


# virtual methods
.method public onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .registers 4

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/ListAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/nothing/launcher/card/j;

    instance-of p2, p1, LF7/p$a;

    if-eqz p2, :cond_17

    check-cast p1, LF7/p$a;

    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {p1, p0}, LF7/p$a;->f(Lcom/nothing/launcher/card/j;)V

    :cond_17
    return-void
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .registers 5

    const-string p2, "parent"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, LF7/p$a;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Le3/H0;->C(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Le3/H0;

    move-result-object p1

    const-string v0, "inflate(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LF7/p;->q:Lcom/android/launcher3/f;

    iget-object p0, p0, LF7/p;->r:LE7/S;

    invoke-direct {p2, p1, v0, p0}, LF7/p$a;-><init>(Le3/H0;Lcom/android/launcher3/f;LE7/S;)V

    return-object p2
.end method
