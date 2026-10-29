.class public final Lcom/nothing/launcher/card/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/launcher3/dragndrop/a$b;


# instance fields
.field private final q:Lcom/android/launcher3/views/f;

.field private final r:Landroid/view/View;

.field private final s:Lcom/nothing/launcher/card/m;

.field private final t:Landroid/os/Handler;

.field private final u:Lcom/nothing/launcher/card/p;

.field private v:Lv8/a;

.field private w:Lv8/a;

.field private x:I


# direct methods
.method public constructor <init>(Lcom/android/launcher3/views/f;Landroid/view/View;)V
    .registers 4

    const-string v0, "activityContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/nothing/launcher/card/h;->q:Lcom/android/launcher3/views/f;

    iput-object p2, p0, Lcom/nothing/launcher/card/h;->r:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p2

    const-string v0, "null cannot be cast to non-null type com.nothing.launcher.card.PendingAddCardInfo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lcom/nothing/launcher/card/m;

    iput-object p2, p0, Lcom/nothing/launcher/card/h;->s:Lcom/nothing/launcher/card/m;

    new-instance p2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p2, p0, Lcom/nothing/launcher/card/h;->t:Landroid/os/Handler;

    invoke-interface {p1}, Lcom/android/launcher3/views/f;->R()Lcom/nothing/launcher/card/p;

    move-result-object p1

    iput-object p1, p0, Lcom/nothing/launcher/card/h;->u:Lcom/nothing/launcher/card/p;

    const/4 p1, -0x1

    iput p1, p0, Lcom/nothing/launcher/card/h;->x:I

    return-void
.end method

.method public static synthetic a(Lcom/nothing/launcher/card/h;Lcom/nothing/launcher/card/p;)Lh8/A;
    .registers 2

    invoke-static {p0, p1}, Lcom/nothing/launcher/card/h;->j(Lcom/nothing/launcher/card/h;Lcom/nothing/launcher/card/p;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/nothing/launcher/card/h;Lcom/nothing/launcher/card/p;Lcom/nothing/launcher/card/j;Landroid/os/Bundle;)Lh8/A;
    .registers 4

    invoke-static {p0, p1, p2, p3}, Lcom/nothing/launcher/card/h;->l(Lcom/nothing/launcher/card/h;Lcom/nothing/launcher/card/p;Lcom/nothing/launcher/card/j;Landroid/os/Bundle;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lv8/a;)V
    .registers 1

    invoke-static {p0}, Lcom/nothing/launcher/card/h;->k(Lv8/a;)V

    return-void
.end method

.method public static synthetic d(Lv8/a;)V
    .registers 1

    invoke-static {p0}, Lcom/nothing/launcher/card/h;->h(Lv8/a;)V

    return-void
.end method

.method public static synthetic e(Lv8/a;)V
    .registers 1

    invoke-static {p0}, Lcom/nothing/launcher/card/h;->m(Lv8/a;)V

    return-void
.end method

.method public static synthetic f(Lv8/a;)V
    .registers 1

    invoke-static {p0}, Lcom/nothing/launcher/card/h;->g(Lv8/a;)V

    return-void
.end method

.method private static final g(Lv8/a;)V
    .registers 1

    invoke-interface {p0}, Lv8/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method private static final h(Lv8/a;)V
    .registers 1

    invoke-interface {p0}, Lv8/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method private final i()V
    .registers 5

    iget-object v0, p0, Lcom/nothing/launcher/card/h;->u:Lcom/nothing/launcher/card/p;

    if-nez v0, :cond_5

    return-void

    :cond_5
    iget-object v1, p0, Lcom/nothing/launcher/card/h;->s:Lcom/nothing/launcher/card/m;

    iget-object v2, p0, Lcom/nothing/launcher/card/h;->r:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "getContext(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/nothing/launcher/card/m;->o(Landroid/content/Context;)Landroid/os/Bundle;

    move-result-object v1

    iget-object v2, p0, Lcom/nothing/launcher/card/h;->s:Lcom/nothing/launcher/card/m;

    invoke-virtual {v2}, Lcom/nothing/launcher/card/m;->p()Lcom/nothing/launcher/card/a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/nothing/launcher/card/a;->b()Z

    move-result v2

    if-eqz v2, :cond_28

    iget-object p0, p0, Lcom/nothing/launcher/card/h;->s:Lcom/nothing/launcher/card/m;

    invoke-virtual {p0, v1}, Lcom/nothing/launcher/card/m;->q(Landroid/os/Bundle;)V

    return-void

    :cond_28
    iget-object v2, p0, Lcom/nothing/launcher/card/h;->s:Lcom/nothing/launcher/card/m;

    invoke-virtual {v2}, Lcom/nothing/launcher/card/m;->n()Lcom/nothing/launcher/card/j;

    move-result-object v2

    new-instance v3, Lcom/nothing/launcher/card/d;

    invoke-direct {v3, p0, v0, v2, v1}, Lcom/nothing/launcher/card/d;-><init>(Lcom/nothing/launcher/card/h;Lcom/nothing/launcher/card/p;Lcom/nothing/launcher/card/j;Landroid/os/Bundle;)V

    iput-object v3, p0, Lcom/nothing/launcher/card/h;->v:Lv8/a;

    new-instance v1, Lcom/nothing/launcher/card/e;

    invoke-direct {v1, p0, v0}, Lcom/nothing/launcher/card/e;-><init>(Lcom/nothing/launcher/card/h;Lcom/nothing/launcher/card/p;)V

    iput-object v1, p0, Lcom/nothing/launcher/card/h;->w:Lv8/a;

    iget-object v0, p0, Lcom/nothing/launcher/card/h;->t:Landroid/os/Handler;

    iget-object p0, p0, Lcom/nothing/launcher/card/h;->v:Lv8/a;

    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    new-instance v1, Lcom/nothing/launcher/card/f;

    invoke-direct {v1, p0}, Lcom/nothing/launcher/card/f;-><init>(Lv8/a;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private static final j(Lcom/nothing/launcher/card/h;Lcom/nothing/launcher/card/p;)Lh8/A;
    .registers 12

    iget v0, p0, Lcom/nothing/launcher/card/h;->x:I

    const/4 v1, -0x1

    if-le v0, v1, :cond_61

    iget-object v0, p0, Lcom/nothing/launcher/card/h;->r:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    const-string v0, "getContext(...)"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget v4, p0, Lcom/nothing/launcher/card/h;->x:I

    iget-object v0, p0, Lcom/nothing/launcher/card/h;->s:Lcom/nothing/launcher/card/m;

    invoke-virtual {v0}, Lcom/nothing/launcher/card/m;->n()Lcom/nothing/launcher/card/j;

    move-result-object v5

    const/16 v8, 0x18

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v2, p1

    invoke-static/range {v2 .. v9}, Lcom/nothing/cardhost/f;->C(Lcom/nothing/cardhost/f;Landroid/content/Context;ILF5/m;ZLjava/lang/Boolean;ILjava/lang/Object;)Lcom/nothing/cardhost/g;

    move-result-object p1

    iget-object v0, p0, Lcom/nothing/launcher/card/h;->s:Lcom/nothing/launcher/card/m;

    iput-object p1, v0, Lcom/nothing/launcher/card/m;->I:Lcom/nothing/cardhost/g;

    iput v1, p0, Lcom/nothing/launcher/card/h;->x:I

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/nothing/launcher/card/h;->q:Lcom/android/launcher3/views/f;

    invoke-interface {v0}, Lcom/android/launcher3/views/f;->M()Lcom/android/launcher3/Workspace;

    move-result-object v0

    iget-object v1, p0, Lcom/nothing/launcher/card/h;->s:Lcom/nothing/launcher/card/m;

    invoke-virtual {v0, v1}, Lcom/android/launcher3/Workspace;->E(LC2/b;)[I

    move-result-object v0

    const-string v1, "estimateItemSize(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/android/launcher3/views/g$c;

    const/4 v2, 0x0

    aget v3, v0, v2

    const/4 v4, 0x1

    aget v0, v0, v4

    invoke-direct {v1, v3, v0}, Lcom/android/launcher3/views/g$c;-><init>(II)V

    iput v2, v1, Lcom/android/launcher3/views/g$c;->a:I

    iput v2, v1, Lcom/android/launcher3/views/g$c;->b:I

    iput-boolean v4, v1, Lcom/android/launcher3/views/g$c;->c:Z

    invoke-virtual {p1, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lcom/nothing/launcher/card/h;->q:Lcom/android/launcher3/views/f;

    invoke-interface {v0}, Lcom/android/launcher3/views/f;->J()Lcom/android/launcher3/dragndrop/DragLayer;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object p1, p0, Lcom/nothing/launcher/card/h;->r:Landroid/view/View;

    iget-object p0, p0, Lcom/nothing/launcher/card/h;->s:Lcom/nothing/launcher/card/m;

    invoke-virtual {p1, p0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    :cond_61
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private static final k(Lv8/a;)V
    .registers 1

    invoke-interface {p0}, Lv8/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method private static final l(Lcom/nothing/launcher/card/h;Lcom/nothing/launcher/card/p;Lcom/nothing/launcher/card/j;Landroid/os/Bundle;)Lh8/A;
    .registers 5

    invoke-virtual {p1}, Lcom/nothing/cardhost/f;->w()I

    move-result v0

    iput v0, p0, Lcom/nothing/launcher/card/h;->x:I

    invoke-virtual {p1, v0, p2, p3}, Lcom/nothing/cardhost/f;->y(ILF5/m;Landroid/os/Bundle;)Z

    move-result p1

    if-eqz p1, :cond_1a

    iget-object p1, p0, Lcom/nothing/launcher/card/h;->w:Lv8/a;

    if-eqz p1, :cond_1a

    iget-object p0, p0, Lcom/nothing/launcher/card/h;->t:Landroid/os/Handler;

    new-instance p2, Lcom/nothing/launcher/card/g;

    invoke-direct {p2, p1}, Lcom/nothing/launcher/card/g;-><init>(Lv8/a;)V

    invoke-virtual {p0, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_1a
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private static final m(Lv8/a;)V
    .registers 1

    invoke-interface {p0}, Lv8/a;->invoke()Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public n(Lcom/android/launcher3/h$a;Lz2/e;)V
    .registers 3

    invoke-direct {p0}, Lcom/nothing/launcher/card/h;->i()V

    return-void
.end method

.method public t()V
    .registers 4

    iget-object v0, p0, Lcom/nothing/launcher/card/h;->q:Lcom/android/launcher3/views/f;

    invoke-interface {v0}, Lcom/android/launcher3/views/f;->p()Lcom/android/launcher3/dragndrop/a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/android/launcher3/dragndrop/a;->A(Lcom/android/launcher3/dragndrop/a$b;)V

    iget-object v0, p0, Lcom/nothing/launcher/card/h;->v:Lv8/a;

    if-eqz v0, :cond_17

    iget-object v1, p0, Lcom/nothing/launcher/card/h;->t:Landroid/os/Handler;

    new-instance v2, Lcom/nothing/launcher/card/b;

    invoke-direct {v2, v0}, Lcom/nothing/launcher/card/b;-><init>(Lv8/a;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_17
    iget-object v0, p0, Lcom/nothing/launcher/card/h;->w:Lv8/a;

    if-eqz v0, :cond_25

    iget-object v1, p0, Lcom/nothing/launcher/card/h;->t:Landroid/os/Handler;

    new-instance v2, Lcom/nothing/launcher/card/c;

    invoke-direct {v2, v0}, Lcom/nothing/launcher/card/c;-><init>(Lv8/a;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_25
    iget v0, p0, Lcom/nothing/launcher/card/h;->x:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_33

    iget-object v2, p0, Lcom/nothing/launcher/card/h;->u:Lcom/nothing/launcher/card/p;

    if-eqz v2, :cond_31

    invoke-virtual {v2, v0}, Lcom/nothing/launcher/card/p;->D(I)V

    :cond_31
    iput v1, p0, Lcom/nothing/launcher/card/h;->x:I

    :cond_33
    iget-object v0, p0, Lcom/nothing/launcher/card/h;->s:Lcom/nothing/launcher/card/m;

    iget-object v0, v0, Lcom/nothing/launcher/card/m;->I:Lcom/nothing/cardhost/g;

    if-eqz v0, :cond_4d

    iget-object v1, p0, Lcom/nothing/launcher/card/h;->q:Lcom/android/launcher3/views/f;

    invoke-interface {v1}, Lcom/android/launcher3/views/f;->J()Lcom/android/launcher3/dragndrop/DragLayer;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    iget-object v1, p0, Lcom/nothing/launcher/card/h;->u:Lcom/nothing/launcher/card/p;

    if-eqz v1, :cond_4d

    invoke-virtual {v0}, Lcom/nothing/cardhost/g;->getAppWidgetId()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/nothing/launcher/card/p;->D(I)V

    :cond_4d
    iget-object p0, p0, Lcom/nothing/launcher/card/h;->s:Lcom/nothing/launcher/card/m;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/nothing/launcher/card/m;->I:Lcom/nothing/cardhost/g;

    return-void
.end method
