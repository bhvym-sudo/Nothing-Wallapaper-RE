.class public final LF7/k;
.super Landroidx/recyclerview/widget/ListAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF7/k$a;,
        LF7/k$b;,
        LF7/k$c;
    }
.end annotation


# static fields
.field public static final s:LF7/k$a;


# instance fields
.field private final q:Lcom/android/launcher3/f;

.field private final r:LE7/S;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LF7/k$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LF7/k$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LF7/k;->s:LF7/k$a;

    return-void
.end method

.method public constructor <init>(Lcom/android/launcher3/f;LE7/S;)V
    .registers 4

    const-string v0, "deviceProfile"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LF7/a;

    invoke-direct {v0}, LF7/a;-><init>()V

    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/ListAdapter;-><init>(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)V

    iput-object p1, p0, LF7/k;->q:Lcom/android/launcher3/f;

    iput-object p2, p0, LF7/k;->r:LE7/S;

    return-void
.end method


# virtual methods
.method public final d(I)Z
    .registers 2

    invoke-virtual {p0, p1}, LF7/k;->getItemViewType(I)I

    move-result p0

    if-nez p0, :cond_8

    const/4 p0, 0x1

    return p0

    :cond_8
    const/4 p0, 0x0

    return p0
.end method

.method public getItemViewType(I)I
    .registers 2

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/ListAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LS5/d;

    instance-of p0, p0, LS5/c;

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .registers 4

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LF7/k$c;

    if-eqz v0, :cond_1a

    check-cast p1, LF7/k$c;

    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/ListAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object p0

    const-string p2, "null cannot be cast to non-null type com.nothing.launcher.card.data.CardGroupMetaInfo"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, LS5/a;

    invoke-virtual {p1, p0}, LF7/k$c;->e(LS5/a;)V

    return-void

    :cond_1a
    instance-of v0, p1, LF7/k$b;

    if-eqz v0, :cond_2e

    check-cast p1, LF7/k$b;

    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/ListAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object p0

    const-string p2, "null cannot be cast to non-null type com.nothing.launcher.card.data.HeadGroupMetaInfo"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, LS5/c;

    invoke-virtual {p1, p0}, LF7/k$b;->f(LS5/c;)V

    :cond_2e
    return-void
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .registers 6

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const-string v1, "inflate(...)"

    const/4 v2, 0x0

    if-nez p2, :cond_23

    new-instance p2, LF7/k$b;

    invoke-static {v0, p1, v2}, Le3/z0;->C(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Le3/z0;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LF7/k;->q:Lcom/android/launcher3/f;

    iget-object p0, p0, LF7/k;->r:LE7/S;

    invoke-direct {p2, p1, v0, p0}, LF7/k$b;-><init>(Le3/z0;Lcom/android/launcher3/f;LE7/S;)V

    return-object p2

    :cond_23
    new-instance p2, LF7/k$c;

    invoke-static {v0, p1, v2}, Le3/B0;->C(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Le3/B0;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LF7/k;->q:Lcom/android/launcher3/f;

    iget-object p0, p0, LF7/k;->r:LE7/S;

    invoke-direct {p2, p1, v0, p0}, LF7/k$c;-><init>(Le3/B0;Lcom/android/launcher3/f;LE7/S;)V

    return-object p2
.end method
