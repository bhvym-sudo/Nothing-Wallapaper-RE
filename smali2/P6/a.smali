.class public final LP6/a;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LP6/a$a;,
        LP6/a$b;,
        LP6/a$c;,
        LP6/a$d;
    }
.end annotation


# static fields
.field public static final t:LP6/a$b;

.field private static final u:Ljava/util/ArrayList;


# instance fields
.field private final q:Landroid/app/Activity;

.field private final r:Landroidx/lifecycle/x;

.field private final s:[Ljava/lang/Integer;


# direct methods
.method static constructor <clinit>()V
    .registers 3

    new-instance v0, LP6/a$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LP6/a$b;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LP6/a;->t:LP6/a$b;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v0, v1, v2}, [Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Li8/s;->h([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v0

    sput-object v0, LP6/a;->u:Ljava/util/ArrayList;

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Landroidx/lifecycle/x;[Ljava/lang/Integer;)V
    .registers 5

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lifecycleOwner"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "diagramResourceList"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    iput-object p1, p0, LP6/a;->q:Landroid/app/Activity;

    iput-object p2, p0, LP6/a;->r:Landroidx/lifecycle/x;

    iput-object p3, p0, LP6/a;->s:[Ljava/lang/Integer;

    return-void
.end method

.method public static final synthetic d(LP6/a;)Landroid/app/Activity;
    .registers 1

    iget-object p0, p0, LP6/a;->q:Landroid/app/Activity;

    return-object p0
.end method

.method public static final synthetic e(LP6/a;)Landroidx/lifecycle/x;
    .registers 1

    iget-object p0, p0, LP6/a;->r:Landroidx/lifecycle/x;

    return-object p0
.end method


# virtual methods
.method public final f(Landroid/app/WallpaperManager;Lg3/v;Lh3/d$a;Lm8/e;)Ljava/lang/Object;
    .registers 7

    invoke-static {}, LF8/b0;->b()LF8/I;

    move-result-object p0

    new-instance v0, LP6/a$e;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p3, p2, v1}, LP6/a$e;-><init>(Landroid/app/WallpaperManager;Lh3/d$a;Lg3/v;Lm8/e;)V

    invoke-static {p0, v0, p4}, LF8/g;->g(Lm8/i;Lv8/p;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_15

    return-object p0

    :cond_15
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public g(LP6/a$a;I)V
    .registers 4

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, LP6/a;->s:[Ljava/lang/Integer;

    aget-object p0, p0, p2

    invoke-virtual {p1, p0, p2}, LP6/a$a;->d(Ljava/lang/Integer;I)V

    return-void
.end method

.method public getItemCount()I
    .registers 1

    iget-object p0, p0, LP6/a;->s:[Ljava/lang/Integer;

    array-length p0, p0

    return p0
.end method

.method public getItemViewType(I)I
    .registers 2

    sget-object p0, LP6/a;->u:Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    const-string p1, "get(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method

.method public h(Landroid/view/ViewGroup;I)LP6/a$a;
    .registers 6

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const-string v1, "inflate(...)"

    const/4 v2, 0x0

    if-nez p2, :cond_1f

    new-instance p2, LP6/a$c;

    invoke-static {v0, p1, v2}, Le3/l0;->C(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Le3/l0;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p2, p0, p1}, LP6/a$c;-><init>(LP6/a;Le3/l0;)V

    return-object p2

    :cond_1f
    new-instance p2, LP6/a$d;

    invoke-static {v0, p1, v2}, Le3/n0;->C(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Le3/n0;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p2, p0, p1}, LP6/a$d;-><init>(LP6/a;Le3/n0;)V

    return-object p2
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .registers 3

    check-cast p1, LP6/a$a;

    invoke-virtual {p0, p1, p2}, LP6/a;->g(LP6/a$a;I)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .registers 3

    invoke-virtual {p0, p1, p2}, LP6/a;->h(Landroid/view/ViewGroup;I)LP6/a$a;

    move-result-object p0

    return-object p0
.end method
