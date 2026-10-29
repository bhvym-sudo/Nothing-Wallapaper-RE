.class public final Ly7/u;
.super Landroid/content/ContextWrapper;
.source "SourceFile"

# interfaces
.implements Lcom/android/launcher3/views/f;


# instance fields
.field private final q:Lcom/android/launcher3/views/f;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/android/launcher3/views/f;)V
    .registers 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activityContext"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Landroid/content/ContextWrapper;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Ly7/u;->q:Lcom/android/launcher3/views/f;

    return-void
.end method


# virtual methods
.method public A()Z
    .registers 1

    iget-object p0, p0, Ly7/u;->q:Lcom/android/launcher3/views/f;

    invoke-interface {p0}, Lcom/android/launcher3/views/f;->A()Z

    move-result p0

    return p0
.end method

.method public J()Lcom/android/launcher3/dragndrop/DragLayer;
    .registers 2

    iget-object p0, p0, Ly7/u;->q:Lcom/android/launcher3/views/f;

    invoke-interface {p0}, Lcom/android/launcher3/views/f;->J()Lcom/android/launcher3/dragndrop/DragLayer;

    move-result-object p0

    const-string v0, "getDragLayer(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public K()Lcom/android/launcher3/f;
    .registers 2

    iget-object p0, p0, Ly7/u;->q:Lcom/android/launcher3/views/f;

    invoke-interface {p0}, Lcom/android/launcher3/views/f;->K()Lcom/android/launcher3/f;

    move-result-object p0

    const-string v0, "getDeviceProfile(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public M()Lcom/android/launcher3/Workspace;
    .registers 2

    iget-object p0, p0, Ly7/u;->q:Lcom/android/launcher3/views/f;

    invoke-interface {p0}, Lcom/android/launcher3/views/f;->M()Lcom/android/launcher3/Workspace;

    move-result-object p0

    const-string v0, "getWorkspace(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public O()Z
    .registers 1

    iget-object p0, p0, Ly7/u;->q:Lcom/android/launcher3/views/f;

    invoke-interface {p0}, Lcom/android/launcher3/views/f;->O()Z

    move-result p0

    return p0
.end method

.method public Q()Z
    .registers 1

    iget-object p0, p0, Ly7/u;->q:Lcom/android/launcher3/views/f;

    invoke-interface {p0}, Lcom/android/launcher3/views/f;->Q()Z

    move-result p0

    return p0
.end method

.method public R()Lcom/nothing/launcher/card/p;
    .registers 2

    iget-object p0, p0, Ly7/u;->q:Lcom/android/launcher3/views/f;

    invoke-interface {p0}, Lcom/android/launcher3/views/f;->R()Lcom/nothing/launcher/card/p;

    move-result-object p0

    const-string v0, "getCardWidgetHost(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public U(Lcom/android/launcher3/m;[III)V
    .registers 6

    if-eqz p1, :cond_5

    const/4 v0, 0x4

    iput v0, p1, LC2/b;->D:I

    :cond_5
    iget-object p0, p0, Ly7/u;->q:Lcom/android/launcher3/views/f;

    invoke-interface {p0, p1, p2, p3, p4}, Lcom/android/launcher3/views/f;->U(Lcom/android/launcher3/m;[III)V

    return-void
.end method

.method public getSystemService(Ljava/lang/String;)Ljava/lang/Object;
    .registers 3

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "layout_inflater"

    invoke-static {v0, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1a

    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p0

    return-object p0

    :cond_1a
    invoke-super {p0, p1}, Landroid/content/ContextWrapper;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public h()Z
    .registers 1

    iget-object p0, p0, Ly7/u;->q:Lcom/android/launcher3/views/f;

    invoke-interface {p0}, Lcom/android/launcher3/views/f;->h()Z

    move-result p0

    return p0
.end method

.method public k(LC2/b;)V
    .registers 3

    const-string v0, "info"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Ly7/u;->q:Lcom/android/launcher3/views/f;

    invoke-interface {p0, p1}, Lcom/android/launcher3/views/f;->k(LC2/b;)V

    return-void
.end method

.method public o(LC2/b;)V
    .registers 3

    const-string v0, "itemInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Ly7/u;->q:Lcom/android/launcher3/views/f;

    invoke-interface {p0, p1}, Lcom/android/launcher3/views/f;->o(LC2/b;)V

    return-void
.end method

.method public p()Lcom/android/launcher3/dragndrop/a;
    .registers 2

    iget-object p0, p0, Ly7/u;->q:Lcom/android/launcher3/views/f;

    invoke-interface {p0}, Lcom/android/launcher3/views/f;->p()Lcom/android/launcher3/dragndrop/a;

    move-result-object p0

    const-string v0, "getDragController(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public x()[LF2/w;
    .registers 2

    iget-object p0, p0, Ly7/u;->q:Lcom/android/launcher3/views/f;

    invoke-interface {p0}, Lcom/android/launcher3/views/f;->x()[LF2/w;

    move-result-object p0

    const-string v0, "createTouchControllers(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
