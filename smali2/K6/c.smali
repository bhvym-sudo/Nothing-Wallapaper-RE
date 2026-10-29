.class public final LK6/c;
.super LK1/p;
.source "SourceFile"


# instance fields
.field private p0:Lg3/b;

.field private q0:Lt6/c;

.field private r0:Lq6/f;

.field private s0:Lcom/android/launcher3/f;

.field private t0:LU5/a;

.field private u0:LB7/a;

.field private v0:Ly7/g;

.field private w0:LS1/a;

.field private x0:LJ7/i$c;


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, LK1/p;-><init>()V

    return-void
.end method

.method public static final synthetic G0(LK6/c;)LS1/a;
    .registers 1

    iget-object p0, p0, LK6/c;->w0:LS1/a;

    return-object p0
.end method

.method private final H0(Landroid/content/Context;)Ly7/g;
    .registers 5

    iget-object v0, p0, LK6/c;->v0:Ly7/g;

    if-nez v0, :cond_1c

    new-instance v0, Ly7/g;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v1, "getApplicationContext(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lh3/V;->G()LF8/L;

    move-result-object v1

    invoke-static {}, LF8/b0;->b()LF8/I;

    move-result-object v2

    invoke-direct {v0, p1, v1, v2}, Ly7/g;-><init>(Landroid/content/Context;LF8/L;LF8/I;)V

    iput-object v0, p0, LK6/c;->v0:Ly7/g;

    :cond_1c
    return-object v0
.end method


# virtual methods
.method public C()Ld3/a;
    .registers 2

    iget-object v0, p0, LK6/c;->q0:Lt6/c;

    if-eqz v0, :cond_5

    return-object v0

    :cond_5
    new-instance v0, Lt6/c;

    invoke-direct {v0}, Lt6/c;-><init>()V

    iput-object v0, p0, LK6/c;->q0:Lt6/c;

    return-object v0
.end method

.method public E()Lcom/android/wallpaper/picker/f$a;
    .registers 1

    new-instance p0, LK6/c$b;

    invoke-direct {p0}, LK6/c$b;-><init>()V

    return-object p0
.end method

.method public final I0(Lb/j;)LT1/b$b;
    .registers 4

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0, p1}, LK6/c;->d0(Lb/j;)LS1/a;

    move-result-object v1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, LK1/p;->W(Landroid/content/Context;)LM1/b;

    move-result-object v0

    invoke-static {p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {p0, v0, v1, p1}, LK1/p;->V(LM1/b;LS1/a;Landroid/content/res/Resources;)LT1/b$b;

    move-result-object p0

    return-object p0
.end method

.method public final J0(Landroid/content/Context;)Lcom/android/launcher3/f;
    .registers 6

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LK6/c;->s0:Lcom/android/launcher3/f;

    if-nez v0, :cond_2e

    new-instance v0, Lcom/android/launcher3/f;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "getApplicationContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, LS1/c;->i:LS1/c$a;

    invoke-virtual {v3, p1}, LS1/c$a;->b(Landroid/content/Context;)I

    move-result v3

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LK6/c;->N0(Landroid/content/Context;)LU5/a;

    move-result-object p1

    invoke-virtual {p0}, Lh3/V;->G()LF8/L;

    move-result-object v2

    invoke-direct {v0, v1, v3, p1, v2}, Lcom/android/launcher3/f;-><init>(Landroid/content/Context;ILU5/a;LF8/L;)V

    iput-object v0, p0, LK6/c;->s0:Lcom/android/launcher3/f;

    :cond_2e
    return-object v0
.end method

.method public final K0(Lb/j;)LJ7/i$c;
    .registers 11

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LK6/c;->x0:LJ7/i$c;

    if-eqz v0, :cond_d

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    return-object v0

    :cond_d
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0, p1}, LK6/c;->d0(Lb/j;)LS1/a;

    move-result-object v7

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    iget-object p1, p0, LK6/c;->x0:LJ7/i$c;

    if-nez p1, :cond_3f

    new-instance v1, LJ7/i$c;

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, LK6/c;->N0(Landroid/content/Context;)LU5/a;

    move-result-object v2

    invoke-virtual {p0, v0}, LK6/c;->L0(Landroid/content/Context;)LB7/a;

    move-result-object v3

    invoke-virtual {p0, v0}, Lh3/V;->k(Landroid/content/Context;)Lh3/c;

    move-result-object v4

    invoke-virtual {p0, v0}, LK1/p;->W(Landroid/content/Context;)LM1/b;

    move-result-object v5

    invoke-virtual {p0}, LK1/p;->U()LF8/I;

    move-result-object v6

    invoke-static {v8}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-direct/range {v1 .. v8}, LJ7/i$c;-><init>(LU5/a;LB7/a;Lh3/c;LM1/b;LF8/I;LS1/a;Landroid/content/res/Resources;)V

    iput-object v1, p0, LK6/c;->x0:LJ7/i$c;

    return-object v1

    :cond_3f
    return-object p1
.end method

.method public final L0(Landroid/content/Context;)LB7/a;
    .registers 5

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LK6/c;->u0:LB7/a;

    if-nez v0, :cond_1d

    new-instance v0, LB7/b;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "getApplicationContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LK1/p;->t0(Landroid/content/Context;)LR2/a;

    move-result-object p1

    invoke-direct {v0, v1, p1}, LB7/b;-><init>(Landroid/content/Context;LR2/a;)V

    iput-object v0, p0, LK6/c;->u0:LB7/a;

    :cond_1d
    return-object v0
.end method

.method public final M0(Landroid/content/Context;)Lq6/f;
    .registers 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LK6/c;->r0:Lq6/f;

    if-nez v0, :cond_10

    new-instance v0, Lq6/f;

    invoke-direct {v0, p1}, Lq6/f;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, LK6/c;->r0:Lq6/f;

    :cond_10
    return-object v0
.end method

.method public final N0(Landroid/content/Context;)LU5/a;
    .registers 5

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LK6/c;->t0:LU5/a;

    if-nez v0, :cond_21

    new-instance v0, LU5/e;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v1, "getApplicationContext(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lh3/V;->G()LF8/L;

    move-result-object v1

    invoke-static {}, LF8/b0;->b()LF8/I;

    move-result-object v2

    invoke-direct {v0, p1, v1, v2}, LU5/e;-><init>(Landroid/content/Context;LF8/L;LF8/I;)V

    iput-object v0, p0, LK6/c;->t0:LU5/a;

    :cond_21
    return-object v0
.end method

.method public a(Landroid/content/Context;)Lg3/b;
    .registers 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LK6/c;->p0:Lg3/b;

    if-nez v0, :cond_19

    new-instance v0, LK6/a;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v1, "getApplicationContext(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p1}, LK6/a;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, LK6/c;->p0:Lg3/b;

    :cond_19
    return-object v0
.end method

.method public b(Landroid/content/Context;Lg3/x;IZZZZ)Landroidx/fragment/app/q;
    .registers 8

    const-string p0, "context"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "wallpaperInfo"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Landroid/os/Bundle;

    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    const-string p1, "wallpaper"

    invoke-virtual {p0, p1, p2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string p1, "preview_mode"

    invoke-virtual {p0, p1, p3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string p1, "view_as_home"

    invoke-virtual {p0, p1, p4}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string p1, "view_full_screen"

    invoke-virtual {p0, p1, p6}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string p1, "testing_mode_enabled"

    invoke-virtual {p0, p1, p7}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    instance-of p1, p2, Lg3/k;

    if-eqz p1, :cond_32

    new-instance p1, Li3/J;

    invoke-direct {p1}, Li3/J;-><init>()V

    goto :goto_37

    :cond_32
    new-instance p1, Li3/v;

    invoke-direct {p1}, Li3/v;-><init>()V

    :goto_37
    invoke-virtual {p1, p0}, Landroidx/fragment/app/q;->setArguments(Landroid/os/Bundle;)V

    return-object p1
.end method

.method public d0(Lb/j;)LS1/a;
    .registers 9

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LK6/c;->w0:LS1/a;

    if-nez v0, :cond_5e

    new-instance v1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    const-string v0, "getApplicationContext(...)"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LH3/s;->a()LH3/s;

    move-result-object v3

    invoke-virtual {p1}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v4

    invoke-interface {v4}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v4

    invoke-virtual {v3, v4}, LH3/s;->e(Landroid/view/Display;)Landroid/graphics/Point;

    move-result-object v3

    const-string v4, "getScreenSize(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4}, Landroid/app/WallpaperManager;->getInstance(Landroid/content/Context;)Landroid/app/WallpaperManager;

    move-result-object v4

    const-string v5, "getInstance(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v5}, LK1/p;->a0(Landroid/content/Context;)LQ2/k;

    move-result-object v5

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v6

    invoke-static {v6, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v6}, LK6/c;->H0(Landroid/content/Context;)Ly7/g;

    move-result-object v6

    invoke-direct/range {v1 .. v6}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;-><init>(Landroid/content/Context;Landroid/graphics/Point;Landroid/app/WallpaperManager;LQ2/k;Ly7/g;)V

    iput-object v1, p0, LK6/c;->w0:LS1/a;

    invoke-virtual {p1}, Lb/j;->getLifecycle()Landroidx/lifecycle/q;

    move-result-object p1

    new-instance v0, LK6/c$a;

    invoke-direct {v0, p0}, LK6/c$a;-><init>(LK6/c;)V

    invoke-virtual {p1, v0}, Landroidx/lifecycle/q;->a(Landroidx/lifecycle/w;)V

    return-object v1

    :cond_5e
    return-object v0
.end method
