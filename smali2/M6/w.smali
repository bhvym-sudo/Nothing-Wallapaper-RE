.class public final LM6/w;
.super Landroidx/recyclerview/widget/DiffUtil$ItemCallback;
.source "SourceFile"


# instance fields
.field private final a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/recyclerview/widget/DiffUtil$ItemCallback;-><init>()V

    iput-object p1, p0, LM6/w;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public a(Lg3/x;Lg3/x;)Z
    .registers 5

    const-string v0, "oldItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lg3/x;->r()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lg3/x;->r()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2c

    iget-object v0, p0, LM6/w;->a:Landroid/content/Context;

    invoke-virtual {p1, v0}, Lg3/x;->g(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    iget-object p0, p0, LM6/w;->a:Landroid/content/Context;

    invoke-virtual {p2, p0}, Lg3/x;->g(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2c

    const/4 p0, 0x1

    return p0

    :cond_2c
    const/4 p0, 0x0

    return p0
.end method

.method public bridge synthetic areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z
    .registers 3

    check-cast p1, Lg3/x;

    check-cast p2, Lg3/x;

    invoke-virtual {p0, p1, p2}, LM6/w;->a(Lg3/x;Lg3/x;)Z

    move-result p0

    return p0
.end method

.method public bridge synthetic areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z
    .registers 3

    check-cast p1, Lg3/x;

    check-cast p2, Lg3/x;

    invoke-virtual {p0, p1, p2}, LM6/w;->b(Lg3/x;Lg3/x;)Z

    move-result p0

    return p0
.end method

.method public b(Lg3/x;Lg3/x;)Z
    .registers 3

    const-string p0, "oldItem"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "newItem"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lg3/x;->r()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2}, Lg3/x;->r()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method
