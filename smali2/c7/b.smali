.class public final Lc7/b;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc7/b$a;,
        Lc7/b$b;
    }
.end annotation


# static fields
.field public static final s:Lc7/b$a;


# instance fields
.field private final q:Ljava/util/List;

.field private final r:Lv8/l;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lc7/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lc7/b$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lc7/b;->s:Lc7/b$a;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Lv8/l;)V
    .registers 4

    const-string v0, "wallpaperList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    iput-object p1, p0, Lc7/b;->q:Ljava/util/List;

    iput-object p2, p0, Lc7/b;->r:Lv8/l;

    return-void
.end method

.method public static final synthetic d(Lc7/b;)Lv8/l;
    .registers 1

    iget-object p0, p0, Lc7/b;->r:Lv8/l;

    return-object p0
.end method

.method public static final synthetic e(Lc7/b;)Ljava/util/List;
    .registers 1

    iget-object p0, p0, Lc7/b;->q:Ljava/util/List;

    return-object p0
.end method


# virtual methods
.method public getItemCount()I
    .registers 1

    iget-object p0, p0, Lc7/b;->q:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    return p0
.end method

.method public onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .registers 4

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lc7/b$b;

    iget-object p0, p0, Lc7/b;->q:Ljava/util/List;

    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lg3/x;

    invoke-virtual {p1, p0, p2}, Lc7/b$b;->e(Lg3/x;I)V

    return-void
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .registers 5

    const-string p2, "parent"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0d0137

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    new-instance p2, Lc7/b$b;

    invoke-static {p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    const v0, 0x7f0a00ea

    invoke-virtual {p1, v0}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object v0

    const-string v1, "requireViewById(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/ImageView;

    invoke-direct {p2, p0, p1, v0}, Lc7/b$b;-><init>(Lc7/b;Landroid/view/View;Landroid/widget/ImageView;)V

    return-object p2
.end method
