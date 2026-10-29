.class public abstract Ly7/S;
.super Landroidx/fragment/app/q;
.source "SourceFile"

# interfaces
.implements Lcom/android/launcher3/views/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly7/S$a;
    }
.end annotation


# static fields
.field public static final B:Ly7/S$a;


# instance fields
.field private final A:Ld/c;

.field private final q:LK6/c;

.field private final r:Lh8/h;

.field private final s:Lh8/h;

.field private final t:Lh8/h;

.field private final u:Lh8/h;

.field private final v:Lh8/h;

.field private final w:Lh8/h;

.field private x:LF2/t;

.field private y:Ljava/util/Map;

.field private final z:Ld/c;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Ly7/S$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ly7/S$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Ly7/S;->B:Ly7/S$a;

    return-void
.end method

.method public constructor <init>()V
    .registers 4

    invoke-direct {p0}, Landroidx/fragment/app/q;-><init>()V

    invoke-static {}, Lh3/I;->a()Lh3/H;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.nothing.wallpaper.module.NTPickerInjector"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LK6/c;

    iput-object v0, p0, Ly7/S;->q:LK6/c;

    new-instance v0, Ly7/D;

    invoke-direct {v0, p0}, Ly7/D;-><init>(Ly7/S;)V

    invoke-static {v0}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object v0

    iput-object v0, p0, Ly7/S;->r:Lh8/h;

    new-instance v0, Ly7/I;

    invoke-direct {v0, p0}, Ly7/I;-><init>(Ly7/S;)V

    invoke-static {v0}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object v0

    iput-object v0, p0, Ly7/S;->s:Lh8/h;

    new-instance v0, Ly7/J;

    invoke-direct {v0, p0}, Ly7/J;-><init>(Ly7/S;)V

    invoke-static {v0}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object v0

    iput-object v0, p0, Ly7/S;->t:Lh8/h;

    new-instance v0, Ly7/K;

    invoke-direct {v0, p0}, Ly7/K;-><init>(Ly7/S;)V

    invoke-static {v0}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object v0

    iput-object v0, p0, Ly7/S;->u:Lh8/h;

    new-instance v0, Ly7/L;

    invoke-direct {v0, p0}, Ly7/L;-><init>(Ly7/S;)V

    invoke-static {v0}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object v0

    iput-object v0, p0, Ly7/S;->v:Lh8/h;

    new-instance v0, Ly7/M;

    invoke-direct {v0}, Ly7/M;-><init>()V

    invoke-static {v0}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object v0

    iput-object v0, p0, Ly7/S;->w:Lh8/h;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Ly7/S;->y:Ljava/util/Map;

    new-instance v0, Le/c;

    invoke-direct {v0}, Le/c;-><init>()V

    new-instance v1, Ly7/N;

    invoke-direct {v1}, Ly7/N;-><init>()V

    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/q;->registerForActivityResult(Le/a;Ld/b;)Ld/c;

    move-result-object v0

    const-string v1, "registerForActivityResult(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Ly7/S;->z:Ld/c;

    new-instance v0, Le/c;

    invoke-direct {v0}, Le/c;-><init>()V

    new-instance v2, Ly7/O;

    invoke-direct {v2, p0}, Ly7/O;-><init>(Ly7/S;)V

    invoke-virtual {p0, v0, v2}, Landroidx/fragment/app/q;->registerForActivityResult(Le/a;Ld/b;)Ld/c;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Ly7/S;->A:Ld/c;

    return-void
.end method

.method private final B0(IILF2/t;)V
    .registers 14

    invoke-interface {p0}, Lcom/android/launcher3/views/f;->M()Lcom/android/launcher3/Workspace;

    move-result-object v2

    iget v4, p3, LC2/b;->r:I

    invoke-virtual {v2, v4}, Lcom/android/launcher3/Workspace;->f(I)Lcom/android/launcher3/CellLayout;

    move-result-object v9

    const/4 v2, -0x1

    if-eq p1, v2, :cond_22

    const/4 v2, 0x0

    if-eqz p1, :cond_15

    const/4 v1, 0x0

    move v5, v1

    move-object v4, v2

    move-object v6, v4

    goto :goto_47

    :cond_15
    invoke-virtual {p0, p2}, Ly7/S;->F0(I)V

    new-instance v1, Ly7/F;

    invoke-direct {v1, p0}, Ly7/F;-><init>(Ly7/S;)V

    const/4 v3, 0x4

    :goto_1e
    move-object v4, v1

    move-object v6, v2

    move v5, v3

    goto :goto_47

    :cond_22
    invoke-direct {p0}, Ly7/S;->L0()Lcom/nothing/launcher/card/p;

    move-result-object v1

    invoke-virtual {p0}, Ly7/S;->O0()Ly7/u;

    move-result-object v2

    invoke-virtual {p3}, LF2/t;->l()Lcom/nothing/launcher/card/a;

    move-result-object v4

    invoke-virtual {p0}, Ly7/S;->O0()Ly7/u;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/nothing/launcher/card/a;->a(Landroid/content/Context;)Lcom/nothing/launcher/card/j;

    move-result-object v4

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move v3, p2

    invoke-static/range {v1 .. v8}, Lcom/nothing/cardhost/f;->C(Lcom/nothing/cardhost/f;Landroid/content/Context;ILF5/m;ZLjava/lang/Boolean;ILjava/lang/Object;)Lcom/nothing/cardhost/g;

    move-result-object v2

    new-instance v1, Ly7/G;

    invoke-direct {v1, p0, p2, p3, v2}, Ly7/G;-><init>(Ly7/S;ILF2/t;Lcom/nothing/cardhost/g;)V

    const/4 v3, 0x3

    goto :goto_1e

    :goto_47
    invoke-interface {p0}, Lcom/android/launcher3/views/f;->J()Lcom/android/launcher3/dragndrop/DragLayer;

    move-result-object v1

    invoke-virtual {v1}, Lcom/android/launcher3/dragndrop/DragLayer;->getAnimatedView()Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_6c

    invoke-interface {p0}, Lcom/android/launcher3/views/f;->M()Lcom/android/launcher3/Workspace;

    move-result-object v0

    invoke-interface {p0}, Lcom/android/launcher3/views/f;->J()Lcom/android/launcher3/dragndrop/DragLayer;

    move-result-object v1

    invoke-virtual {v1}, Lcom/android/launcher3/dragndrop/DragLayer;->getAnimatedView()Landroid/view/View;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type com.android.launcher3.dragndrop.DragView<*>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, v1

    check-cast v3, Lz2/h;

    const/4 v7, 0x1

    move-object v1, p3

    move-object v2, v9

    invoke-virtual/range {v0 .. v7}, Lcom/android/launcher3/Workspace;->v(LC2/b;Lcom/android/launcher3/CellLayout;Lz2/h;Ljava/lang/Runnable;ILandroid/view/View;Z)V

    return-void

    :cond_6c
    if-eqz v4, :cond_71

    invoke-interface {v4}, Ljava/lang/Runnable;->run()V

    :cond_71
    return-void
.end method

.method private static final C0(Ly7/S;)V
    .registers 2

    invoke-interface {p0}, Lcom/android/launcher3/views/f;->M()Lcom/android/launcher3/Workspace;

    move-result-object p0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/android/launcher3/Workspace;->f(I)Lcom/android/launcher3/CellLayout;

    move-result-object p0

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method private static final D0(Ly7/S;ILF2/t;Lcom/nothing/cardhost/g;)V
    .registers 5

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Ly7/S;->A0(ILC2/b;Lcom/nothing/cardhost/g;Lcom/nothing/launcher/card/j;)V

    return-void
.end method

.method private final H0(Lcom/nothing/launcher/card/t;)V
    .registers 6

    invoke-virtual {p1}, Lcom/nothing/launcher/card/t;->m()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "deleteWidgetItem itemInfo:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "WidgetPickerFragment"

    invoke-static {v1, v0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/nothing/launcher/card/t;->p()Z

    move-result v0

    if-eqz v0, :cond_57

    invoke-direct {p0}, Ly7/S;->P0()Z

    move-result v0

    if-eqz v0, :cond_50

    invoke-virtual {p1}, Lcom/nothing/launcher/card/t;->m()I

    move-result v0

    invoke-virtual {p0, v0}, Ly7/S;->y0(I)Z

    move-result v0

    if-eqz v0, :cond_57

    invoke-virtual {p1}, Lcom/nothing/launcher/card/t;->m()I

    move-result v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "deleteWidgetItem deleteWidget: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/nothing/launcher/card/t;->m()I

    move-result v0

    invoke-virtual {p0, v0}, Ly7/S;->F0(I)V

    goto :goto_57

    :cond_50
    invoke-virtual {p1}, Lcom/nothing/launcher/card/t;->m()I

    move-result v0

    invoke-virtual {p0, v0}, Ly7/S;->F0(I)V

    :cond_57
    :goto_57
    invoke-virtual {p1}, Lcom/nothing/launcher/card/t;->m()I

    move-result p1

    invoke-virtual {p0, p1}, Ly7/S;->G0(I)V

    return-void
.end method

.method private final J0()LF5/l;
    .registers 1

    iget-object p0, p0, Ly7/S;->v:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LF5/l;

    return-object p0
.end method

.method private final L0()Lcom/nothing/launcher/card/p;
    .registers 1

    iget-object p0, p0, Ly7/S;->u:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/nothing/launcher/card/p;

    return-object p0
.end method

.method private final M0()LD7/c;
    .registers 1

    iget-object p0, p0, Ly7/S;->s:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LD7/c;

    return-object p0
.end method

.method private final P0()Z
    .registers 1

    iget-object p0, p0, Ly7/S;->w:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private final Q0()Lcom/nothing/launcher/card/u;
    .registers 1

    iget-object p0, p0, Ly7/S;->t:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/nothing/launcher/card/u;

    return-object p0
.end method

.method private final R0(Lcom/nothing/launcher/card/j;Lcom/nothing/launcher/card/t;)Landroid/view/View;
    .registers 11

    invoke-direct {p0}, Ly7/S;->L0()Lcom/nothing/launcher/card/p;

    move-result-object v0

    invoke-virtual {p0}, Ly7/S;->O0()Ly7/u;

    move-result-object v1

    invoke-virtual {p2}, Lcom/nothing/launcher/card/t;->m()I

    move-result v2

    const/16 v6, 0x18

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v3, p1

    invoke-static/range {v0 .. v7}, Lcom/nothing/cardhost/f;->C(Lcom/nothing/cardhost/f;Landroid/content/Context;ILF5/m;ZLjava/lang/Boolean;ILjava/lang/Object;)Lcom/nothing/cardhost/g;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Ly7/S;->V0(Lcom/nothing/cardhost/g;Lcom/nothing/launcher/card/t;)V

    return-object p1
.end method

.method private static final S0(Ly7/S;)Lcom/nothing/launcher/card/p;
    .registers 5

    new-instance v0, Lcom/nothing/launcher/card/p;

    invoke-direct {p0}, Ly7/S;->Q0()Lcom/nothing/launcher/card/u;

    move-result-object v1

    new-instance v2, Ly7/S$b;

    invoke-direct {v2, p0}, Ly7/S$b;-><init>(Ljava/lang/Object;)V

    new-instance v3, Ly7/P;

    invoke-direct {v3, p0}, Ly7/P;-><init>(Ly7/S;)V

    invoke-direct {v0, v1, v2, v3}, Lcom/nothing/launcher/card/p;-><init>(Landroid/content/Context;Lv8/p;Lv8/l;)V

    return-object v0
.end method

.method private static final T0(Ly7/S;I)Lh8/A;
    .registers 2

    invoke-direct {p0, p1}, Ly7/S;->a1(I)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private static final U0(Ly7/S;)LD7/c;
    .registers 2

    new-instance v0, LD7/c;

    invoke-virtual {p0}, Ly7/S;->O0()Ly7/u;

    move-result-object p0

    invoke-direct {v0, p0}, LD7/c;-><init>(Ly7/u;)V

    return-object v0
.end method

.method private final V0(Lcom/nothing/cardhost/g;Lcom/nothing/launcher/card/t;)V
    .registers 3

    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    invoke-virtual {p0}, Ly7/S;->O0()Ly7/u;

    move-result-object p0

    invoke-virtual {p2, p0, p1}, Lcom/nothing/launcher/card/t;->q(Landroid/content/Context;Lcom/nothing/cardhost/g;)V

    return-void
.end method

.method private static final W0(Ly7/S;)Ly7/u;
    .registers 4

    new-instance v0, Ly7/u;

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "requireContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1, p0}, Ly7/u;-><init>(Landroid/content/Context;Lcom/android/launcher3/views/f;)V

    return-object v0
.end method

.method private final X0(ILF5/m;)V
    .registers 4

    invoke-direct {p0}, Ly7/S;->L0()Lcom/nothing/launcher/card/p;

    move-result-object v0

    iget-object p0, p0, Ly7/S;->z:Ld/c;

    invoke-virtual {v0, p0, p1, p2}, Lcom/nothing/launcher/card/p;->z0(Ld/c;ILF5/m;)V

    return-void
.end method

.method private static final Y0(Ld/a;)V
    .registers 2

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method private final Z0()V
    .registers 2

    invoke-interface {p0}, Lcom/android/launcher3/views/f;->M()Lcom/android/launcher3/Workspace;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/launcher3/Workspace;->B()V

    invoke-direct {p0}, Ly7/S;->L0()Lcom/nothing/launcher/card/p;

    move-result-object p0

    invoke-virtual {p0}, Lcom/nothing/launcher/card/p;->A()V

    return-void
.end method

.method private final a1(I)V
    .registers 4

    invoke-interface {p0}, Lcom/android/launcher3/views/f;->M()Lcom/android/launcher3/Workspace;

    move-result-object v0

    new-instance v1, Ly7/H;

    invoke-direct {v1, p1, p0}, Ly7/H;-><init>(ILy7/S;)V

    invoke-virtual {v0, v1}, Lcom/android/launcher3/Workspace;->R(LF2/f;)V

    return-void
.end method

.method private static final b1(ILy7/S;LC2/b;Landroid/view/View;)Z
    .registers 5

    instance-of v0, p2, Lcom/nothing/launcher/card/t;

    if-eqz v0, :cond_14

    check-cast p2, Lcom/nothing/launcher/card/t;

    invoke-virtual {p2}, Lcom/nothing/launcher/card/t;->m()I

    move-result v0

    if-ne v0, p0, :cond_14

    invoke-static {p3}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    const/4 p0, 0x1

    invoke-virtual {p1, p3, p2, p0}, Ly7/S;->c1(Landroid/view/View;Lcom/nothing/launcher/card/t;Z)V

    return p0

    :cond_14
    const/4 p0, 0x0

    return p0
.end method

.method public static synthetic d0(Ly7/S;Ld/a;)V
    .registers 2

    invoke-static {p0, p1}, Ly7/S;->g1(Ly7/S;Ld/a;)V

    return-void
.end method

.method public static synthetic d1(Ly7/S;Landroid/view/View;Lcom/nothing/launcher/card/t;ZILjava/lang/Object;)V
    .registers 6

    if-nez p5, :cond_b

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_7

    const/4 p3, 0x0

    :cond_7
    invoke-virtual {p0, p1, p2, p3}, Ly7/S;->c1(Landroid/view/View;Lcom/nothing/launcher/card/t;Z)V

    return-void

    :cond_b
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: removeItem"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic e0(Ld/a;)V
    .registers 1

    invoke-static {p0}, Ly7/S;->Y0(Ld/a;)V

    return-void
.end method

.method private final e1(Landroid/os/Bundle;)V
    .registers 4

    if-nez p1, :cond_3

    return-void

    :cond_3
    const-string v0, "widget.request_args"

    const-class v1, LF2/t;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LF2/t;

    iput-object p1, p0, Ly7/S;->x:LF2/t;

    return-void
.end method

.method public static synthetic f0()Z
    .registers 1

    invoke-static {}, Ly7/S;->h1()Z

    move-result v0

    return v0
.end method

.method public static synthetic g0(Ly7/S;)LF5/l;
    .registers 1

    invoke-static {p0}, Ly7/S;->z0(Ly7/S;)LF5/l;

    move-result-object p0

    return-object p0
.end method

.method private static final g1(Ly7/S;Ld/a;)V
    .registers 4

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ly7/S;->x:LF2/t;

    if-nez v0, :cond_a

    return-void

    :cond_a
    const/4 v1, 0x0

    iput-object v1, p0, Ly7/S;->x:LF2/t;

    invoke-virtual {p1}, Ld/a;->b()I

    move-result p1

    invoke-virtual {v0}, LF2/t;->m()I

    move-result v1

    invoke-direct {p0, p1, v1, v0}, Ly7/S;->B0(IILF2/t;)V

    return-void
.end method

.method public static synthetic h0(Ly7/S;)Lcom/nothing/launcher/card/u;
    .registers 1

    invoke-static {p0}, Ly7/S;->i1(Ly7/S;)Lcom/nothing/launcher/card/u;

    move-result-object p0

    return-object p0
.end method

.method private static final h1()Z
    .registers 1

    invoke-static {}, Lh3/I;->a()Lh3/H;

    move-result-object v0

    invoke-interface {v0}, Lh3/H;->C()Ld3/a;

    move-result-object v0

    invoke-virtual {v0}, Ld3/a;->p()Z

    move-result v0

    return v0
.end method

.method public static synthetic i0(Ly7/S;)V
    .registers 1

    invoke-static {p0}, Ly7/S;->C0(Ly7/S;)V

    return-void
.end method

.method private static final i1(Ly7/S;)Lcom/nothing/launcher/card/u;
    .registers 3

    new-instance v0, Lcom/nothing/launcher/card/u;

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object p0

    const-string v1, "requireContext(...)"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p0}, Lcom/nothing/launcher/card/u;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static synthetic j0(Ly7/S;)LD7/c;
    .registers 1

    invoke-static {p0}, Ly7/S;->U0(Ly7/S;)LD7/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k0(Ly7/S;ILF2/t;Lcom/nothing/cardhost/g;)V
    .registers 4

    invoke-static {p0, p1, p2, p3}, Ly7/S;->D0(Ly7/S;ILF2/t;Lcom/nothing/cardhost/g;)V

    return-void
.end method

.method public static synthetic l0(Ly7/S;)Lcom/nothing/launcher/card/p;
    .registers 1

    invoke-static {p0}, Ly7/S;->S0(Ly7/S;)Lcom/nothing/launcher/card/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m0(Ly7/S;)Ly7/u;
    .registers 1

    invoke-static {p0}, Ly7/S;->W0(Ly7/S;)Ly7/u;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n0(Ly7/S;I)Lh8/A;
    .registers 2

    invoke-static {p0, p1}, Ly7/S;->T0(Ly7/S;I)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o0(Landroid/view/View;)Lh8/o;
    .registers 1

    invoke-static {p0}, Ly7/S;->w0(Landroid/view/View;)Lh8/o;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p0(Ljava/util/List;Lh8/o;)Z
    .registers 2

    invoke-static {p0, p1}, Ly7/S;->x0(Ljava/util/List;Lh8/o;)Z

    move-result p0

    return p0
.end method

.method public static synthetic q0(ILy7/S;LC2/b;Landroid/view/View;)Z
    .registers 4

    invoke-static {p0, p1, p2, p3}, Ly7/S;->b1(ILy7/S;LC2/b;Landroid/view/View;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic r0(Ly7/S;ILF5/m;)V
    .registers 3

    invoke-direct {p0, p1, p2}, Ly7/S;->X0(ILF5/m;)V

    return-void
.end method

.method private final s0(Lcom/nothing/launcher/card/m;)V
    .registers 8

    invoke-direct {p0}, Ly7/S;->L0()Lcom/nothing/launcher/card/p;

    move-result-object v0

    invoke-virtual {p1}, Lcom/nothing/launcher/card/m;->p()Lcom/nothing/launcher/card/a;

    move-result-object v1

    iget-object v2, p1, Lcom/nothing/launcher/card/m;->I:Lcom/nothing/cardhost/g;

    const/4 v3, 0x0

    if-eqz v2, :cond_1e

    invoke-interface {p0}, Lcom/android/launcher3/views/f;->J()Lcom/android/launcher3/dragndrop/DragLayer;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    invoke-virtual {v2}, Lcom/nothing/cardhost/g;->getAppWidgetId()I

    move-result v0

    invoke-direct {p0, v0, p1, v2, v1}, Ly7/S;->t0(ILC2/b;Lcom/nothing/cardhost/g;Lcom/nothing/launcher/card/a;)V

    iput-object v3, p1, Lcom/nothing/launcher/card/m;->I:Lcom/nothing/cardhost/g;

    return-void

    :cond_1e
    invoke-virtual {v0}, Lcom/nothing/cardhost/f;->w()I

    move-result v2

    invoke-virtual {p1}, Lcom/nothing/launcher/card/m;->n()Lcom/nothing/launcher/card/j;

    move-result-object v4

    invoke-virtual {p1}, Lcom/nothing/launcher/card/m;->m()Landroid/os/Bundle;

    move-result-object v5

    invoke-virtual {v0, v2, v4, v5}, Lcom/nothing/cardhost/f;->y(ILF5/m;Landroid/os/Bundle;)Z

    move-result v4

    if-eqz v4, :cond_34

    invoke-direct {p0, v2, p1, v3, v1}, Ly7/S;->t0(ILC2/b;Lcom/nothing/cardhost/g;Lcom/nothing/launcher/card/a;)V

    return-void

    :cond_34
    const-string p0, "WidgetPickerFragment"

    const-string p1, "bindAppWidgetId error"

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/common/log/c;->o(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Lcom/nothing/launcher/card/p;->D(I)V

    return-void
.end method

.method private final t0(ILC2/b;Lcom/nothing/cardhost/g;Lcom/nothing/launcher/card/a;)V
    .registers 7

    invoke-virtual {p4}, Lcom/nothing/launcher/card/a;->b()Z

    move-result v0

    const-string v1, "requireContext(...)"

    if-eqz v0, :cond_23

    invoke-static {p1, p4, p2}, LF2/t;->k(ILcom/nothing/launcher/card/a;LC2/b;)LF2/t;

    move-result-object p2

    iput-object p2, p0, Ly7/S;->x:LF2/t;

    invoke-direct {p0}, Ly7/S;->L0()Lcom/nothing/launcher/card/p;

    move-result-object p2

    iget-object p3, p0, Ly7/S;->A:Ld/c;

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p4, p0}, Lcom/nothing/launcher/card/a;->a(Landroid/content/Context;)Lcom/nothing/launcher/card/j;

    move-result-object p0

    invoke-virtual {p2, p3, p1, p0}, Lcom/nothing/launcher/card/p;->z0(Ld/c;ILF5/m;)V

    return-void

    :cond_23
    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p4, v0}, Lcom/nothing/launcher/card/a;->a(Landroid/content/Context;)Lcom/nothing/launcher/card/j;

    move-result-object p4

    invoke-virtual {p0, p1, p2, p3, p4}, Ly7/S;->A0(ILC2/b;Lcom/nothing/cardhost/g;Lcom/nothing/launcher/card/j;)V

    return-void
.end method

.method private static final w0(Landroid/view/View;)Lh8/o;
    .registers 3

    invoke-virtual {p0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.nothing.launcher.card.PickCardWidgetInfo"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/nothing/launcher/card/t;

    invoke-static {p0, v0}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object p0

    return-object p0
.end method

.method private static final x0(Ljava/util/List;Lh8/o;)Z
    .registers 5

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lh8/o;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/nothing/launcher/card/t;

    check-cast p0, Ljava/lang/Iterable;

    instance-of v0, p0, Ljava/util/Collection;

    const/4 v1, 0x0

    if-eqz v0, :cond_1c

    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1c

    return v1

    :cond_1c
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_20
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3e

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh8/o;

    invoke-virtual {v0}, Lh8/o;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/nothing/launcher/card/t;

    invoke-virtual {v0}, Lcom/nothing/launcher/card/t;->m()I

    move-result v0

    invoke-virtual {p1}, Lcom/nothing/launcher/card/t;->m()I

    move-result v2

    if-ne v0, v2, :cond_20

    const/4 p0, 0x1

    return p0

    :cond_3e
    return v1
.end method

.method private static final z0(Ly7/S;)LF5/l;
    .registers 3

    sget-object v0, LF5/l;->g:LF5/l$a;

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object p0

    const-string v1, "requireContext(...)"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p0}, LF5/l$a;->a(Landroid/content/Context;)LF5/l;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method protected A0(ILC2/b;Lcom/nothing/cardhost/g;Lcom/nothing/launcher/card/j;)V
    .registers 13

    const-string v0, "itemInfo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p4, :cond_1b

    invoke-direct {p0}, Ly7/S;->J0()LF5/l;

    move-result-object p4

    invoke-virtual {p4, p1}, LF5/l;->l(I)LF5/m;

    move-result-object p4

    if-eqz p4, :cond_1d

    sget-object v0, Lcom/nothing/launcher/card/j;->Z:Lcom/nothing/launcher/card/j$a;

    invoke-virtual {p0}, Ly7/S;->O0()Ly7/u;

    move-result-object v1

    invoke-virtual {v0, v1, p4}, Lcom/nothing/launcher/card/j$a;->a(Landroid/content/Context;LF5/m;)Lcom/nothing/launcher/card/j;

    move-result-object p4

    :cond_1b
    :goto_1b
    move-object v3, p4

    goto :goto_1f

    :cond_1d
    const/4 p4, 0x0

    goto :goto_1b

    :goto_1f
    if-eqz v3, :cond_75

    if-nez p3, :cond_36

    invoke-direct {p0}, Ly7/S;->L0()Lcom/nothing/launcher/card/p;

    move-result-object v0

    invoke-virtual {p0}, Ly7/S;->O0()Ly7/u;

    move-result-object v1

    const/16 v6, 0x18

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move v2, p1

    invoke-static/range {v0 .. v7}, Lcom/nothing/cardhost/f;->C(Lcom/nothing/cardhost/f;Landroid/content/Context;ILF5/m;ZLjava/lang/Boolean;ILjava/lang/Object;)Lcom/nothing/cardhost/g;

    move-result-object p3

    goto :goto_37

    :cond_36
    move v2, p1

    :goto_37
    new-instance p1, Lcom/nothing/launcher/card/t;

    invoke-virtual {v3}, Lcom/nothing/launcher/card/j;->v0()Landroid/content/ComponentName;

    move-result-object p4

    invoke-direct {p1, v2, p4}, Lcom/nothing/launcher/card/t;-><init>(ILandroid/content/ComponentName;)V

    iput v2, p2, LC2/b;->q:I

    invoke-virtual {p1, p2}, LC2/b;->a(LC2/b;)V

    const/4 p2, 0x0

    invoke-virtual {p3, p2}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0, p3, p1}, Ly7/S;->V0(Lcom/nothing/cardhost/g;Lcom/nothing/launcher/card/t;)V

    invoke-interface {p0}, Lcom/android/launcher3/views/f;->M()Lcom/android/launcher3/Workspace;

    move-result-object p2

    invoke-interface {p2, p3, p1}, Lcom/android/launcher3/E;->h(Landroid/view/View;LC2/b;)V

    invoke-interface {p0}, Lcom/android/launcher3/views/f;->J()Lcom/android/launcher3/dragndrop/DragLayer;

    move-result-object p2

    const p4, 0x7f130119

    invoke-virtual {p0, p4}, Landroidx/fragment/app/q;->getString(I)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p2, p4}, Landroid/view/View;->announceForAccessibility(Ljava/lang/CharSequence;)V

    invoke-virtual {p3}, Landroid/view/View;->requestLayout()V

    invoke-static {v3, p1}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object p2

    invoke-virtual {p0, p2}, Ly7/S;->u0(Lh8/o;)V

    sget-object p0, LR7/d;->r:LR7/d;

    const-string p2, "widget_add"

    iget p3, p1, LC2/b;->D:I

    invoke-virtual {p0, p2, p1, p3}, LR7/d;->l(Ljava/lang/String;Lcom/nothing/launcher/card/t;I)V

    return-void

    :cond_75
    const-string p0, "WidgetPickerFragment"

    const-string p1, "completeAddCardWidget cardWidgetInfo is null"

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/common/log/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public E0()[Lcom/android/launcher3/dragndrop/a;
    .registers 1

    invoke-virtual {p0}, Ly7/S;->p()Lcom/android/launcher3/dragndrop/a;

    move-result-object p0

    filled-new-array {p0}, [Lcom/android/launcher3/dragndrop/a;

    move-result-object p0

    return-object p0
.end method

.method public final F0(I)V
    .registers 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "deleteAppWidgetId widgetId:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "WidgetPickerFragment"

    invoke-static {v1, v0}, Lcom/nothing/wallpaper/common/log/c;->k(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Ly7/S;->L0()Lcom/nothing/launcher/card/p;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/nothing/launcher/card/p;->D(I)V

    return-void
.end method

.method public abstract G0(I)V
.end method

.method public final I0()Ljava/util/List;
    .registers 4

    invoke-interface {p0}, Lcom/android/launcher3/views/f;->M()Lcom/android/launcher3/Workspace;

    move-result-object p0

    invoke-virtual {p0}, Lcom/android/launcher3/Workspace;->getAllChildren()Ljava/util/List;

    move-result-object p0

    const-string v0, "getAllChildren(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Li8/s;->u(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1e
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_39

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type com.nothing.launcher.card.PickCardWidgetInfo"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lcom/nothing/launcher/card/t;

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1e

    :cond_39
    return-object v0
.end method

.method public K()Lcom/android/launcher3/f;
    .registers 3

    iget-object v0, p0, Ly7/S;->q:LK6/c;

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object p0

    const-string v1, "requireContext(...)"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p0}, LK6/c;->J0(Landroid/content/Context;)Lcom/android/launcher3/f;

    move-result-object p0

    return-object p0
.end method

.method public final K0()Ljava/util/Map;
    .registers 1

    iget-object p0, p0, Ly7/S;->y:Ljava/util/Map;

    return-object p0
.end method

.method protected final N0()LK6/c;
    .registers 1

    iget-object p0, p0, Ly7/S;->q:LK6/c;

    return-object p0
.end method

.method protected final O0()Ly7/u;
    .registers 1

    iget-object p0, p0, Ly7/S;->r:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ly7/u;

    return-object p0
.end method

.method public R()Lcom/nothing/launcher/card/p;
    .registers 1

    invoke-direct {p0}, Ly7/S;->L0()Lcom/nothing/launcher/card/p;

    move-result-object p0

    return-object p0
.end method

.method public U(Lcom/android/launcher3/m;[III)V
    .registers 6

    const-string v0, "info"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cell"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/nothing/launcher/card/m;

    if-eqz v0, :cond_23

    const/4 v0, 0x0

    iput v0, p1, LC2/b;->r:I

    aget v0, p2, v0

    iput v0, p1, LC2/b;->s:I

    const/4 v0, 0x1

    aget p2, p2, v0

    iput p2, p1, LC2/b;->t:I

    iput p3, p1, LC2/b;->u:I

    iput p4, p1, LC2/b;->v:I

    check-cast p1, Lcom/nothing/launcher/card/m;

    invoke-direct {p0, p1}, Ly7/S;->s0(Lcom/nothing/launcher/card/m;)V

    :cond_23
    return-void
.end method

.method protected final c1(Landroid/view/View;Lcom/nothing/launcher/card/t;Z)V
    .registers 5

    const-string v0, "v"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "info"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lcom/android/launcher3/views/f;->M()Lcom/android/launcher3/Workspace;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/android/launcher3/Workspace;->Y(Landroid/view/View;)V

    if-eqz p3, :cond_36

    invoke-direct {p0, p2}, Ly7/S;->H0(Lcom/nothing/launcher/card/t;)V

    invoke-direct {p0}, Ly7/S;->P0()Z

    move-result p1

    const/4 p3, 0x2

    if-eqz p1, :cond_2f

    iget-object p0, p0, Ly7/S;->y:Ljava/util/Map;

    invoke-virtual {p2}, Lcom/nothing/launcher/card/t;->m()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {p0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_2f
    sget-object p0, LR7/d;->r:LR7/d;

    const-string p1, "widget_remove"

    invoke-virtual {p0, p1, p2, p3}, LR7/d;->l(Ljava/lang/String;Lcom/nothing/launcher/card/t;I)V

    :cond_36
    return-void
.end method

.method protected final f1(LF2/t;)V
    .registers 2

    iput-object p1, p0, Ly7/S;->x:LF2/t;

    return-void
.end method

.method public o(LC2/b;)V
    .registers 4

    const-string v0, "itemInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/nothing/launcher/card/t;

    if-eqz v0, :cond_2e

    check-cast p1, Lcom/nothing/launcher/card/t;

    invoke-direct {p0, p1}, Ly7/S;->H0(Lcom/nothing/launcher/card/t;)V

    invoke-direct {p0}, Ly7/S;->P0()Z

    move-result v0

    const/4 v1, 0x3

    if-eqz v0, :cond_27

    iget-object p0, p0, Ly7/S;->y:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/nothing/launcher/card/t;->m()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p0, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_27
    sget-object p0, LR7/d;->r:LR7/d;

    const-string v0, "widget_remove"

    invoke-virtual {p0, v0, p1, v1}, LR7/d;->l(Ljava/lang/String;Lcom/nothing/launcher/card/t;I)V

    :cond_2e
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .registers 5

    invoke-super {p0, p1}, Landroidx/fragment/app/q;->onCreate(Landroid/os/Bundle;)V

    invoke-direct {p0}, Ly7/S;->L0()Lcom/nothing/launcher/card/p;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "requireContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/nothing/cardhost/f;->z(Landroid/content/Context;)V

    invoke-direct {p0, p1}, Ly7/S;->e1(Landroid/os/Bundle;)V

    return-void
.end method

.method public onDestroy()V
    .registers 1

    invoke-super {p0}, Landroidx/fragment/app/q;->onDestroy()V

    invoke-direct {p0}, Ly7/S;->L0()Lcom/nothing/launcher/card/p;

    move-result-object p0

    invoke-virtual {p0}, Lcom/nothing/launcher/card/p;->r0()V

    return-void
.end method

.method public onDestroyView()V
    .registers 3

    invoke-virtual {p0}, Ly7/S;->p()Lcom/android/launcher3/dragndrop/a;

    move-result-object v0

    invoke-interface {p0}, Lcom/android/launcher3/views/f;->M()Lcom/android/launcher3/Workspace;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/launcher3/dragndrop/a;->A(Lcom/android/launcher3/dragndrop/a$b;)V

    invoke-super {p0}, Landroidx/fragment/app/q;->onDestroyView()V

    return-void
.end method

.method public onGetLayoutInflater(Landroid/os/Bundle;)Landroid/view/LayoutInflater;
    .registers 3

    invoke-super {p0, p1}, Landroidx/fragment/app/q;->onGetLayoutInflater(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    move-result-object p1

    const-string v0, "onGetLayoutInflater(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ly7/S;->O0()Ly7/u;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p0

    const-string p1, "cloneInContext(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public onPause()V
    .registers 1

    invoke-super {p0}, Landroidx/fragment/app/q;->onPause()V

    invoke-virtual {p0}, Ly7/S;->p()Lcom/android/launcher3/dragndrop/a;

    move-result-object p0

    invoke-virtual {p0}, Lcom/android/launcher3/dragndrop/a;->j()V

    return-void
.end method

.method public onResume()V
    .registers 8

    invoke-super {p0}, Landroidx/fragment/app/q;->onResume()V

    invoke-direct {p0}, Ly7/S;->L0()Lcom/nothing/launcher/card/p;

    move-result-object v0

    const/4 v5, 0x7

    const/4 v6, 0x0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lcom/nothing/cardhost/f;->X(Lcom/nothing/cardhost/f;ZJIILjava/lang/Object;)V

    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .registers 4

    const-string v0, "outState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ly7/S;->x:LF2/t;

    if-eqz v0, :cond_e

    const-string v1, "widget.request_args"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    :cond_e
    invoke-super {p0, p1}, Landroidx/fragment/app/q;->onSaveInstanceState(Landroid/os/Bundle;)V

    return-void
.end method

.method public onStop()V
    .registers 1

    invoke-super {p0}, Landroidx/fragment/app/q;->onStop()V

    invoke-direct {p0}, Ly7/S;->L0()Lcom/nothing/launcher/card/p;

    move-result-object p0

    invoke-virtual {p0}, Lcom/nothing/cardhost/f;->Y()V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .registers 4

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Landroidx/fragment/app/q;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    invoke-interface {p0}, Lcom/android/launcher3/views/f;->J()Lcom/android/launcher3/dragndrop/DragLayer;

    move-result-object p1

    invoke-virtual {p0}, Ly7/S;->p()Lcom/android/launcher3/dragndrop/a;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/android/launcher3/dragndrop/DragLayer;->setup(Lcom/android/launcher3/dragndrop/a;)V

    invoke-interface {p0}, Lcom/android/launcher3/views/f;->M()Lcom/android/launcher3/Workspace;

    move-result-object p1

    invoke-virtual {p0}, Ly7/S;->p()Lcom/android/launcher3/dragndrop/a;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/android/launcher3/Workspace;->setup(Lcom/android/launcher3/dragndrop/a;)V

    invoke-virtual {p0}, Ly7/S;->p()Lcom/android/launcher3/dragndrop/a;

    move-result-object p1

    invoke-interface {p0}, Lcom/android/launcher3/views/f;->M()Lcom/android/launcher3/Workspace;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/android/launcher3/dragndrop/a;->d(Lcom/android/launcher3/dragndrop/a$b;)V

    return-void
.end method

.method public p()Lcom/android/launcher3/dragndrop/a;
    .registers 1

    invoke-direct {p0}, Ly7/S;->M0()LD7/c;

    move-result-object p0

    return-object p0
.end method

.method public abstract u0(Lh8/o;)V
.end method

.method protected final v0(Ljava/util/List;)V
    .registers 14

    const-string v1, "infoList"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_10

    invoke-direct {p0}, Ly7/S;->Z0()V

    goto/16 :goto_191

    :cond_10
    invoke-interface {p0}, Lcom/android/launcher3/views/f;->M()Lcom/android/launcher3/Workspace;

    move-result-object v1

    invoke-virtual {v1}, Lcom/android/launcher3/Workspace;->getAllChildren()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_56

    move-object v1, p1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_25
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_191

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lh8/o;

    invoke-virtual {v2}, Lh8/o;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/nothing/launcher/card/j;

    invoke-virtual {v2}, Lh8/o;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/nothing/launcher/card/t;

    invoke-direct {p0, v3, v2}, Ly7/S;->R0(Lcom/nothing/launcher/card/j;Lcom/nothing/launcher/card/t;)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v2}, Lcom/nothing/launcher/card/t;->n()Z

    move-result v4

    if-eqz v4, :cond_4a

    const/16 v4, 0x8

    goto :goto_4b

    :cond_4a
    const/4 v4, 0x0

    :goto_4b
    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    invoke-interface {p0}, Lcom/android/launcher3/views/f;->M()Lcom/android/launcher3/Workspace;

    move-result-object v4

    invoke-interface {v4, v3, v2}, Lcom/android/launcher3/E;->e(Landroid/view/View;LC2/b;)V

    goto :goto_25

    :cond_56
    invoke-static {v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    move-object v7, v1

    check-cast v7, Ljava/lang/Iterable;

    invoke-static {v7}, Li8/s;->K(Ljava/lang/Iterable;)LD8/h;

    move-result-object v1

    new-instance v2, Ly7/Q;

    invoke-direct {v2}, Ly7/Q;-><init>()V

    invoke-static {v1, v2}, LD8/k;->x(LD8/h;Lv8/l;)LD8/h;

    move-result-object v1

    new-instance v2, Ly7/E;

    invoke-direct {v2, p1}, Ly7/E;-><init>(Ljava/util/List;)V

    invoke-static {v1, v2}, LD8/k;->p(LD8/h;Lv8/l;)LD8/h;

    move-result-object v1

    invoke-interface {v1}, LD8/h;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_76
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_9c

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh8/o;

    invoke-virtual {v1}, Lh8/o;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    invoke-virtual {v1}, Lh8/o;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/nothing/launcher/card/t;

    invoke-static {v2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, v2

    move-object v2, v1

    move-object v1, v0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Ly7/S;->d1(Ly7/S;Landroid/view/View;Lcom/nothing/launcher/card/t;ZILjava/lang/Object;)V

    goto :goto_76

    :cond_9c
    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_a8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const-string v6, "null cannot be cast to non-null type com.nothing.launcher.card.PickCardWidgetInfo"

    if-eqz v2, :cond_f4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lh8/o;

    invoke-virtual {v3}, Lh8/o;->b()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/nothing/launcher/card/t;

    instance-of v4, v7, Ljava/util/Collection;

    if-eqz v4, :cond_cb

    move-object v4, v7

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_cb

    goto :goto_f0

    :cond_cb
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_cf
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_f0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/view/View;

    invoke-virtual {v5}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v8, v6}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v8, Lcom/nothing/launcher/card/t;

    invoke-virtual {v8, v3}, Lcom/nothing/launcher/card/t;->o(Lcom/nothing/launcher/card/t;)Z

    move-result v8

    if-eqz v8, :cond_ed

    invoke-virtual {v5, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    :cond_ed
    if-eqz v8, :cond_cf

    goto :goto_a8

    :cond_f0
    :goto_f0
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_a8

    :cond_f4
    new-instance v8, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-static {v1, v0}, Li8/s;->u(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {v8, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_103
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_16d

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh8/o;

    invoke-virtual {v0}, Lh8/o;->a()Ljava/lang/Object;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Lcom/nothing/launcher/card/j;

    invoke-virtual {v0}, Lh8/o;->b()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/nothing/launcher/card/t;

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_121
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_142

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2, v6}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lcom/nothing/launcher/card/t;

    invoke-virtual {v2}, Lcom/nothing/launcher/card/t;->m()I

    move-result v2

    invoke-virtual {v11}, Lcom/nothing/launcher/card/t;->m()I

    move-result v3

    if-ne v2, v3, :cond_121

    goto :goto_143

    :cond_142
    const/4 v1, 0x0

    :goto_143
    check-cast v1, Landroid/view/View;

    if-eqz v1, :cond_161

    invoke-virtual {v1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v6}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, v0

    check-cast v2, Lcom/nothing/launcher/card/t;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Ly7/S;->d1(Ly7/S;Landroid/view/View;Lcom/nothing/launcher/card/t;ZILjava/lang/Object;)V

    invoke-virtual {v1, v11}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    invoke-static {v1, v11}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object v1

    if-nez v1, :cond_169

    :cond_161
    invoke-direct {p0, v10, v11}, Ly7/S;->R0(Lcom/nothing/launcher/card/j;Lcom/nothing/launcher/card/t;)Landroid/view/View;

    move-result-object v1

    invoke-static {v1, v11}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object v1

    :cond_169
    invoke-interface {v8, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_103

    :cond_16d
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_171
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_191

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lh8/o;

    invoke-virtual {v2}, Lh8/o;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    invoke-virtual {v2}, Lh8/o;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/nothing/launcher/card/t;

    invoke-interface {p0}, Lcom/android/launcher3/views/f;->M()Lcom/android/launcher3/Workspace;

    move-result-object v4

    invoke-interface {v4, v3, v2}, Lcom/android/launcher3/E;->e(Landroid/view/View;LC2/b;)V

    goto :goto_171

    :cond_191
    :goto_191
    invoke-interface {p0}, Lcom/android/launcher3/views/f;->M()Lcom/android/launcher3/Workspace;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/launcher3/Workspace;->k0()V

    return-void
.end method

.method public bridge synthetic x()[LF2/w;
    .registers 1

    invoke-virtual {p0}, Ly7/S;->E0()[Lcom/android/launcher3/dragndrop/a;

    move-result-object p0

    check-cast p0, [LF2/w;

    return-object p0
.end method

.method public abstract y0(I)Z
.end method
