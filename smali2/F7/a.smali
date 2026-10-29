.class public final LF7/a;
.super Landroidx/recyclerview/widget/DiffUtil$ItemCallback;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Landroidx/recyclerview/widget/DiffUtil$ItemCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LS5/d;LS5/d;)Z
    .registers 6

    const-string p0, "oldItem"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "newItem"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p0, p1, LS5/c;

    const/4 v0, 0x1

    if-eqz p0, :cond_14

    instance-of p0, p2, LS5/c;

    if-eqz p0, :cond_14

    return v0

    :cond_14
    instance-of p0, p1, LS5/a;

    const/4 v1, 0x0

    if-eqz p0, :cond_56

    instance-of p0, p2, LS5/a;

    if-eqz p0, :cond_56

    check-cast p1, LS5/a;

    invoke-virtual {p1}, LS5/a;->f()I

    move-result p0

    check-cast p2, LS5/a;

    invoke-virtual {p2}, LS5/a;->f()I

    move-result v2

    if-ne p0, v2, :cond_56

    invoke-virtual {p1}, LS5/a;->g()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    invoke-virtual {p2}, LS5/a;->g()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ne p0, v2, :cond_56

    invoke-virtual {p1}, LS5/a;->c()I

    move-result p0

    invoke-virtual {p2}, LS5/a;->c()I

    move-result v2

    if-ne p0, v2, :cond_56

    invoke-virtual {p1}, LS5/a;->h()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2}, LS5/a;->h()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_56

    return v0

    :cond_56
    return v1
.end method

.method public bridge synthetic areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z
    .registers 3

    check-cast p1, LS5/d;

    check-cast p2, LS5/d;

    invoke-virtual {p0, p1, p2}, LF7/a;->a(LS5/d;LS5/d;)Z

    move-result p0

    return p0
.end method

.method public bridge synthetic areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z
    .registers 3

    check-cast p1, LS5/d;

    check-cast p2, LS5/d;

    invoke-virtual {p0, p1, p2}, LF7/a;->b(LS5/d;LS5/d;)Z

    move-result p0

    return p0
.end method

.method public b(LS5/d;LS5/d;)Z
    .registers 4

    const-string p0, "oldItem"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "newItem"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p0, p1, LS5/c;

    if-eqz p0, :cond_23

    instance-of p0, p2, LS5/c;

    if-eqz p0, :cond_23

    check-cast p1, LS5/c;

    invoke-virtual {p1}, LS5/c;->c()Ljava/lang/String;

    move-result-object p0

    check-cast p2, LS5/c;

    invoke-virtual {p2}, LS5/c;->c()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0

    :cond_23
    instance-of p0, p1, LS5/a;

    const/4 v0, 0x0

    if-eqz p0, :cond_3c

    instance-of p0, p2, LS5/a;

    if-eqz p0, :cond_3c

    check-cast p1, LS5/a;

    invoke-virtual {p1}, LS5/a;->f()I

    move-result p0

    check-cast p2, LS5/a;

    invoke-virtual {p2}, LS5/a;->f()I

    move-result p1

    if-ne p0, p1, :cond_3c

    const/4 p0, 0x1

    return p0

    :cond_3c
    return v0
.end method
