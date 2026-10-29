.class public final LF7/q;
.super Landroidx/recyclerview/widget/DiffUtil$ItemCallback;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Landroidx/recyclerview/widget/DiffUtil$ItemCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/nothing/launcher/card/j;Lcom/nothing/launcher/card/j;)Z
    .registers 4

    const-string p0, "oldItem"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "newItem"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LF5/m;->q()I

    move-result p0

    invoke-virtual {p2}, LF5/m;->q()I

    move-result v0

    if-ne p0, v0, :cond_46

    invoke-virtual {p1}, LF5/m;->J()I

    move-result p0

    invoke-virtual {p2}, LF5/m;->J()I

    move-result v0

    if-ne p0, v0, :cond_46

    invoke-virtual {p1}, Lcom/nothing/launcher/card/j;->w0()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2}, Lcom/nothing/launcher/card/j;->w0()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_46

    invoke-virtual {p1}, LF5/m;->A()I

    move-result p0

    invoke-virtual {p2}, LF5/m;->A()I

    move-result v0

    if-ne p0, v0, :cond_46

    invoke-virtual {p1}, LF5/m;->p()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2}, LF5/m;->p()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_46

    const/4 p0, 0x1

    return p0

    :cond_46
    const/4 p0, 0x0

    return p0
.end method

.method public bridge synthetic areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z
    .registers 3

    check-cast p1, Lcom/nothing/launcher/card/j;

    check-cast p2, Lcom/nothing/launcher/card/j;

    invoke-virtual {p0, p1, p2}, LF7/q;->a(Lcom/nothing/launcher/card/j;Lcom/nothing/launcher/card/j;)Z

    move-result p0

    return p0
.end method

.method public bridge synthetic areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z
    .registers 3

    check-cast p1, Lcom/nothing/launcher/card/j;

    check-cast p2, Lcom/nothing/launcher/card/j;

    invoke-virtual {p0, p1, p2}, LF7/q;->b(Lcom/nothing/launcher/card/j;Lcom/nothing/launcher/card/j;)Z

    move-result p0

    return p0
.end method

.method public b(Lcom/nothing/launcher/card/j;Lcom/nothing/launcher/card/j;)Z
    .registers 4

    const-string p0, "oldItem"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "newItem"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LF5/m;->e()I

    move-result p0

    invoke-virtual {p2}, LF5/m;->e()I

    move-result v0

    if-ne p0, v0, :cond_2a

    invoke-virtual {p1}, Lcom/nothing/launcher/card/j;->B0()I

    move-result p0

    invoke-virtual {p2}, Lcom/nothing/launcher/card/j;->B0()I

    move-result v0

    if-ne p0, v0, :cond_2a

    invoke-virtual {p1}, Lcom/nothing/launcher/card/j;->C0()I

    move-result p0

    invoke-virtual {p2}, Lcom/nothing/launcher/card/j;->C0()I

    move-result p1

    if-ne p0, p1, :cond_2a

    const/4 p0, 0x1

    return p0

    :cond_2a
    const/4 p0, 0x0

    return p0
.end method
