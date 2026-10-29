.class public final LM6/c;
.super Landroidx/recyclerview/widget/ListAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LM6/c$a;,
        LM6/c$b;,
        LM6/c$c;
    }
.end annotation


# static fields
.field public static final s:LM6/c$b;


# instance fields
.field private final q:Ljava/util/Set;

.field private final r:Lv8/p;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LM6/c$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LM6/c$b;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LM6/c;->s:LM6/c$b;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/Set;Lv8/p;)V
    .registers 5

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appliedIds"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LM6/w;

    invoke-direct {v0, p1}, LM6/w;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/ListAdapter;-><init>(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)V

    iput-object p2, p0, LM6/c;->q:Ljava/util/Set;

    iput-object p3, p0, LM6/c;->r:Lv8/p;

    return-void
.end method


# virtual methods
.method public getItemViewType(I)I
    .registers 2

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/ListAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lg3/x;

    instance-of p0, p0, LJ6/m;

    return p0
.end method

.method public onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .registers 4

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/ListAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lg3/x;

    instance-of v0, p1, LM6/c$a;

    if-eqz v0, :cond_1a

    check-cast p1, LM6/c$a;

    invoke-static {p2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget-object p0, p0, LM6/c;->q:Ljava/util/Set;

    invoke-virtual {p1, p2, p0}, LM6/c$a;->f(Lg3/x;Ljava/util/Set;)V

    return-void

    :cond_1a
    instance-of p0, p1, LM6/c$c;

    if-eqz p0, :cond_26

    check-cast p1, LM6/c$c;

    invoke-static {p2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {p1, p2}, LM6/c$c;->f(Lg3/x;)V

    :cond_26
    return-void
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .registers 7

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const/4 v1, 0x1

    const-string v2, "inflate(...)"

    const/4 v3, 0x0

    if-ne p2, v1, :cond_22

    new-instance p2, LM6/c$c;

    invoke-static {v0, p1, v3}, Le3/T;->C(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Le3/T;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, LM6/c;->r:Lv8/p;

    invoke-direct {p2, p1, p0}, LM6/c$c;-><init>(Le3/T;Lv8/p;)V

    return-object p2

    :cond_22
    new-instance p2, LM6/c$a;

    invoke-static {v0, p1, v3}, Le3/M;->C(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Le3/M;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, LM6/c;->r:Lv8/p;

    invoke-direct {p2, p1, p0}, LM6/c$a;-><init>(Le3/M;Lv8/p;)V

    return-object p2
.end method
