.class public final Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;
.super Ly7/S;
.source "SourceFile"

# interfaces
.implements LE7/a;
.implements Lcom/android/launcher3/l;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$a;
    }
.end annotation


# static fields
.field public static final p0:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$a;


# instance fields
.field private C:Lj7/j;

.field private D:Lo7/g;

.field private final E:Lh8/h;

.field private final F:Lh8/h;

.field private final G:Lh8/h;

.field private final H:Lh8/h;

.field private final I:Lh8/h;

.field private final J:Lh8/h;

.field private K:Le3/u;

.field private L:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;

.field private M:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;

.field private N:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;

.field private O:Ly7/C;

.field private P:Lg3/x;

.field private Q:Ly7/r;

.field private R:Landroid/animation/ValueAnimator;

.field private S:Landroid/animation/ValueAnimator;

.field private final T:Landroid/os/Handler;

.field private U:Landroid/os/Bundle;

.field private V:F

.field private W:I

.field private final X:Lh8/h;

.field private final Y:Lh8/h;

.field private Z:Ljava/lang/String;

.field private a0:Z

.field private b0:Ljava/util/List;

.field private c0:LN1/a;

.field private d0:LA7/a;

.field private e0:Z

.field private f0:Z

.field private g0:Z

.field private h0:LE7/Z;

.field private final i0:Lh8/h;

.field private j0:Landroid/app/ProgressDialog;

.field private k0:LX7/i;

.field private l0:Ljava/lang/Runnable;

.field private final m0:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$l;

.field private final n0:Ljava/lang/Runnable;

.field private final o0:Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->p0:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$a;

    return-void
.end method

.method public constructor <init>()V
    .registers 5

    invoke-direct {p0}, Ly7/S;-><init>()V

    new-instance v0, LE7/g;

    invoke-direct {v0, p0}, LE7/g;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V

    invoke-static {v0}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object v0

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->E:Lh8/h;

    const-class v0, LJ7/b;

    invoke-static {v0}, Lkotlin/jvm/internal/F;->b(Ljava/lang/Class;)LC8/c;

    move-result-object v0

    new-instance v1, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$t;

    invoke-direct {v1, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$t;-><init>(Landroidx/fragment/app/q;)V

    new-instance v2, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$u;

    const/4 v3, 0x0

    invoke-direct {v2, v3, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$u;-><init>(Lv8/a;Landroidx/fragment/app/q;)V

    new-instance v3, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$v;

    invoke-direct {v3, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$v;-><init>(Landroidx/fragment/app/q;)V

    invoke-static {p0, v0, v1, v2, v3}, Landroidx/fragment/app/X;->b(Landroidx/fragment/app/q;LC8/c;Lv8/a;Lv8/a;Lv8/a;)Lh8/h;

    move-result-object v0

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->F:Lh8/h;

    new-instance v0, LE7/r;

    invoke-direct {v0, p0}, LE7/r;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V

    invoke-static {v0}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object v0

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->G:Lh8/h;

    new-instance v0, LE7/C;

    invoke-direct {v0, p0}, LE7/C;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V

    invoke-static {v0}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object v0

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->H:Lh8/h;

    new-instance v0, LE7/I;

    invoke-direct {v0, p0}, LE7/I;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V

    invoke-static {v0}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object v0

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->I:Lh8/h;

    new-instance v0, LE7/J;

    invoke-direct {v0, p0}, LE7/J;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V

    invoke-static {v0}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object v0

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->J:Lh8/h;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->T:Landroid/os/Handler;

    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->V:F

    const/4 v0, -0x1

    iput v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->W:I

    new-instance v0, LE7/K;

    invoke-direct {v0}, LE7/K;-><init>()V

    invoke-static {v0}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object v0

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->X:Lh8/h;

    new-instance v0, LE7/L;

    invoke-direct {v0, p0}, LE7/L;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V

    invoke-static {v0}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object v0

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->Y:Lh8/h;

    const-string v0, ""

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->Z:Ljava/lang/String;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->b0:Ljava/util/List;

    new-instance v0, LE7/M;

    invoke-direct {v0, p0}, LE7/M;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V

    invoke-static {v0}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object v0

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->i0:Lh8/h;

    new-instance v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$l;

    invoke-direct {v0, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$l;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->m0:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$l;

    new-instance v0, LE7/N;

    invoke-direct {v0, p0}, LE7/N;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->n0:Ljava/lang/Runnable;

    new-instance v0, LE7/O;

    invoke-direct {v0, p0}, LE7/O;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->o0:Ljava/lang/Runnable;

    return-void
.end method

.method public static synthetic A1(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)Z
    .registers 1

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->u3(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)Z

    move-result p0

    return p0
.end method

.method private final A2()V
    .registers 12

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->M()Lcom/android/launcher3/Workspace;

    move-result-object v1

    invoke-virtual {v1}, Lcom/android/launcher3/Workspace;->getAllChildren()Ljava/util/List;

    move-result-object v1

    const-string v2, "getAllChildren(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Li8/s;->u(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_23
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_42

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v4

    const-string v5, "null cannot be cast to non-null type com.nothing.launcher.card.PickCardWidgetInfo"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Lcom/nothing/launcher/card/t;

    invoke-static {v3, v4}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_23

    :cond_42
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_4b
    :goto_4b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lh8/o;

    invoke-virtual {v4}, Lh8/o;->d()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/nothing/launcher/card/t;

    const/4 v6, -0x1

    invoke-virtual {v5, v6}, Lcom/nothing/launcher/card/t;->r(I)V

    invoke-virtual {v4}, Lh8/o;->d()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/nothing/launcher/card/t;

    invoke-virtual {v5, v6}, Lcom/nothing/launcher/card/t;->s(I)V

    invoke-virtual {v4}, Lh8/o;->d()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/nothing/launcher/card/t;

    invoke-virtual {v4}, Lcom/nothing/launcher/card/t;->n()Z

    move-result v4

    if-eqz v4, :cond_4b

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4b

    :cond_7b
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_7f
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_d8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lh8/o;

    invoke-virtual {v2}, Lh8/o;->d()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/nothing/launcher/card/t;

    invoke-virtual {v3}, Lcom/nothing/launcher/card/t;->m()I

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "checkToDelete:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "LockScreenFragment"

    invoke-static {v4, v3}, Lcom/nothing/wallpaper/common/log/c;->k(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2}, Lh8/o;->c()Ljava/lang/Object;

    move-result-object v3

    const-string v4, "<get-first>(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v6, v3

    check-cast v6, Landroid/view/View;

    invoke-virtual {v2}, Lh8/o;->d()Ljava/lang/Object;

    move-result-object v3

    move-object v7, v3

    check-cast v7, Lcom/nothing/launcher/card/t;

    const/4 v9, 0x4

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-object v5, p0

    invoke-static/range {v5 .. v10}, Ly7/S;->d1(Ly7/S;Landroid/view/View;Lcom/nothing/launcher/card/t;ZILjava/lang/Object;)V

    invoke-virtual {v2}, Lh8/o;->d()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/nothing/launcher/card/t;

    invoke-virtual {p0}, Lcom/nothing/launcher/card/t;->m()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object p0, v5

    goto :goto_7f

    :cond_d8
    move-object v5, p0

    invoke-virtual {v5}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->getLockScreenViewModel()LJ7/i;

    move-result-object p0

    invoke-virtual {p0}, LJ7/i;->a0()Z

    move-result p0

    if-nez p0, :cond_ff

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_e7
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_ff

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {v5}, Ly7/S;->R()Lcom/nothing/launcher/card/p;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/nothing/launcher/card/p;->D(I)V

    goto :goto_e7

    :cond_ff
    return-void
.end method

.method private final A3()Z
    .registers 3

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->h0:LE7/Z;

    const/4 v0, 0x0

    if-eqz p0, :cond_d

    invoke-virtual {p0}, LE7/Z;->H()Z

    move-result p0

    const/4 v1, 0x1

    if-ne p0, v1, :cond_d

    return v1

    :cond_d
    return v0
.end method

.method public static synthetic B1(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Landroid/view/View;)V
    .registers 2

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->n3(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Landroid/view/View;)V

    return-void
.end method

.method private final B3()V
    .registers 10

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->h0:LE7/Z;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, LE7/Z;->J()V

    :cond_7
    invoke-virtual {p0}, Landroidx/fragment/app/q;->getViewLifecycleOwner()Landroidx/lifecycle/x;

    move-result-object v0

    const-string v1, "getViewLifecycleOwner(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Landroidx/lifecycle/y;->a(Landroidx/lifecycle/x;)Landroidx/lifecycle/r;

    move-result-object v2

    new-instance v5, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$i;

    const/4 v0, 0x0

    invoke-direct {v5, p0, v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$i;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Lm8/e;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getViewLifecycleOwner()Landroidx/lifecycle/x;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Landroidx/lifecycle/y;->a(Landroidx/lifecycle/x;)Landroidx/lifecycle/r;

    move-result-object v3

    new-instance v6, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$j;

    invoke-direct {v6, p0, v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$j;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Lm8/e;)V

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getViewLifecycleOwner()Landroidx/lifecycle/x;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Landroidx/lifecycle/y;->a(Landroidx/lifecycle/x;)Landroidx/lifecycle/r;

    move-result-object v3

    new-instance v6, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$k;

    invoke-direct {v6, p0, v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$k;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Lm8/e;)V

    invoke-static/range {v3 .. v8}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->getLockScreenViewModel()LJ7/i;

    move-result-object v0

    invoke-virtual {v0}, LJ7/i;->Q()Landroidx/lifecycle/C;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getViewLifecycleOwner()Landroidx/lifecycle/x;

    move-result-object v1

    new-instance v2, LE7/h;

    invoke-direct {v2, p0}, LE7/h;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V

    new-instance p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$p;

    invoke-direct {p0, v2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$p;-><init>(Lv8/l;)V

    invoke-virtual {v0, v1, p0}, Landroidx/lifecycle/C;->h(Landroidx/lifecycle/x;Landroidx/lifecycle/I;)V

    return-void
.end method

.method public static synthetic C1(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)LS1/a;
    .registers 1

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->D2(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)LS1/a;

    move-result-object p0

    return-object p0
.end method

.method private static final C2(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V
    .registers 3

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->K:Le3/u;

    const/4 v0, 0x0

    if-nez p0, :cond_b

    const-string p0, "binding"

    invoke-static {p0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object p0, v0

    :cond_b
    iget-object p0, p0, Le3/u;->N:Landroid/widget/ImageView;

    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    const/16 v1, 0x8

    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    invoke-static {}, Lj7/m;->c()V

    return-void
.end method

.method private static final C3(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingState;)Lh8/A;
    .registers 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "saving state change:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "LockScreenFragment"

    invoke-static {v1, v0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->W2(Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingState;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public static synthetic D1(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Ljava/lang/String;)Lh8/A;
    .registers 2

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->d3(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Ljava/lang/String;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method private static final D2(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)LS1/a;
    .registers 3

    invoke-virtual {p0}, Ly7/S;->N0()LK6/c;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireActivity()Landroidx/fragment/app/v;

    move-result-object p0

    const-string v1, "requireActivity(...)"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p0}, LK6/c;->d0(Lb/j;)LS1/a;

    move-result-object p0

    return-object p0
.end method

.method private final D3(Ljava/lang/String;)V
    .registers 3

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->getLockScreenViewModel()LJ7/i;

    move-result-object v0

    invoke-virtual {v0, p1}, LJ7/i;->X0(Ljava/lang/String;)V

    sget-object v0, LA7/d;->a:LA7/d;

    invoke-virtual {v0, p1}, LA7/d;->h(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_16

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->getLockScreenViewModel()LJ7/i;

    move-result-object p1

    invoke-virtual {p1}, LJ7/i;->t0()V

    :cond_16
    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->h0:LE7/Z;

    if-eqz p0, :cond_1e

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, LE7/Z;->t(Z)V

    :cond_1e
    return-void
.end method

.method public static synthetic E1(Le3/u;Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Landroid/animation/ValueAnimator;)V
    .registers 3

    invoke-static {p0, p1, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->e4(Le3/u;Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method private final E2()Z
    .registers 2

    invoke-virtual {p0}, Ly7/S;->O0()Ly7/u;

    move-result-object p0

    invoke-static {p0}, Lcom/android/launcher3/a;->F(Lcom/android/launcher3/views/f;)Lcom/android/launcher3/a;

    move-result-object p0

    if-eqz p0, :cond_15

    invoke-virtual {p0}, Lcom/android/launcher3/a;->B()Z

    move-result v0

    if-eqz v0, :cond_15

    invoke-virtual {p0}, Lcom/android/launcher3/a;->onBackInvoked()V

    const/4 p0, 0x1

    return p0

    :cond_15
    const/4 p0, 0x0

    return p0
.end method

.method public static synthetic F1(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Landroid/view/View;)V
    .registers 2

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->f3(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Landroid/view/View;)V

    return-void
.end method

.method private final F2()V
    .registers 7

    invoke-static {p0}, Landroidx/lifecycle/y;->a(Landroidx/lifecycle/x;)Landroidx/lifecycle/r;

    move-result-object v0

    new-instance v3, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$b;

    const/4 v1, 0x0

    invoke-direct {v3, p0, v1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$b;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Lm8/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method

.method private final F3()V
    .registers 4

    iget v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->W:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_14

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->l()Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;

    move-result-object v0

    invoke-interface {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;->getView()Landroid/view/View;

    move-result-object v0

    iget v2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->W:I

    invoke-virtual {v0, v2}, Landroid/view/View;->setImportantForAccessibility(I)V

    iput v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->W:I

    :cond_14
    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->M()Lcom/android/launcher3/Workspace;

    move-result-object p0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/android/launcher3/Workspace;->f(I)Lcom/android/launcher3/CellLayout;

    move-result-object p0

    invoke-virtual {p0}, Lcom/android/launcher3/CellLayout;->getEmptyView()Landroid/view/View;

    move-result-object p0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/view/View;->setImportantForAccessibility(I)V

    return-void
.end method

.method public static synthetic G1()Z
    .registers 1

    invoke-static {}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->r3()Z

    move-result v0

    return v0
.end method

.method public static synthetic H1(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingState;)Lh8/A;
    .registers 2

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->C3(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingState;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method private static final H2(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)LI7/b;
    .registers 6

    new-instance v0, LI7/b;

    new-instance v1, LI7/f;

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->getLockScreenViewModel()LJ7/i;

    move-result-object v2

    invoke-direct {v1, v2, p0}, LI7/f;-><init>(LJ7/i;Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V

    new-instance v2, LI7/a;

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->getLockScreenViewModel()LJ7/i;

    move-result-object v3

    invoke-direct {v2, v3}, LI7/a;-><init>(LJ7/i;)V

    new-instance v3, LI7/c;

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->getLockScreenViewModel()LJ7/i;

    move-result-object v4

    invoke-direct {v3, v4}, LI7/c;-><init>(LJ7/i;)V

    new-instance v4, LI7/d;

    invoke-direct {v4, p0}, LI7/d;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V

    invoke-direct {v0, v1, v2, v3, v4}, LI7/b;-><init>(LI7/f;LI7/a;LI7/c;LI7/d;)V

    return-object v0
.end method

.method public static synthetic I1(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V
    .registers 1

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->C2(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V

    return-void
.end method

.method private final I2()V
    .registers 2

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getParentFragment()Landroidx/fragment/app/q;

    move-result-object v0

    instance-of v0, v0, Lg7/k;

    if-eqz v0, :cond_1c

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->h()Z

    move-result v0

    if-nez v0, :cond_1c

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getParentFragment()Landroidx/fragment/app/q;

    move-result-object p0

    const-string v0, "null cannot be cast to non-null type com.nothing.wallpaper.picker.customization.ui.fragment.NTCustomizationPickerFragment"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lg7/k;

    invoke-virtual {p0}, Lg7/k;->o1()V

    :cond_1c
    return-void
.end method

.method public static synthetic J1(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)LJ7/i;
    .registers 1

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->x3(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)LJ7/i;

    move-result-object p0

    return-object p0
.end method

.method private final J2(ZJ)V
    .registers 13

    const-string v0, "LockScreenFragment"

    const-string v1, "exitPage"

    invoke-static {v0, v1}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p0}, Landroidx/lifecycle/y;->a(Landroidx/lifecycle/x;)Landroidx/lifecycle/r;

    move-result-object v2

    new-instance v3, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$d;

    const/4 v8, 0x0

    move-object v4, p0

    move v5, p1

    move-wide v6, p2

    invoke-direct/range {v3 .. v8}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$d;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;ZJLm8/e;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    move-object v5, v3

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method

.method private final J3(Z)V
    .registers 6

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->K:Le3/u;

    if-nez p0, :cond_a

    const-string p0, "binding"

    invoke-static {p0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 p0, 0x0

    :cond_a
    iget-object v0, p0, Le3/u;->x:Landroid/widget/TextView;

    const-string v1, "actionDone"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    const/4 v2, 0x4

    if-nez p1, :cond_17

    move v3, v2

    goto :goto_18

    :cond_17
    move v3, v1

    :goto_18
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object p0, p0, Le3/u;->w:Landroid/widget/TextView;

    const-string v0, "actionCancel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p1, :cond_25

    move v1, v2

    :cond_25
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public static synthetic K1(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Landroid/animation/ValueAnimator;)V
    .registers 2

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->i4(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method static synthetic K2(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;ZJILjava/lang/Object;)V
    .registers 6

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_6

    const-wide/16 p2, 0x64

    :cond_6
    invoke-direct {p0, p1, p2, p3}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->J2(ZJ)V

    return-void
.end method

.method private final K3(Z)V
    .registers 6

    const/high16 v0, 0x3f800000    # 1.0f

    const/4 v1, 0x0

    if-eqz p1, :cond_7

    move v2, v1

    goto :goto_8

    :cond_7
    move v2, v0

    :goto_8
    if-eqz p1, :cond_b

    goto :goto_c

    :cond_b
    move v0, v1

    :goto_c
    const/4 v1, 0x2

    new-array v1, v1, [F

    const/4 v3, 0x0

    aput v2, v1, v3

    const/4 v2, 0x1

    aput v0, v1, v2

    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    const-wide/16 v1, 0x64

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    new-instance v1, LE7/u;

    invoke-direct {v1, p0}, LE7/u;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    new-instance v1, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$q;

    invoke-direct {v1, p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$q;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Z)V

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    return-void
.end method

.method public static synthetic L1(Landroid/view/View;Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)Lh8/A;
    .registers 2

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->m3(Landroid/view/View;Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method private final L2()V
    .registers 4

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->l()Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;

    move-result-object v0

    invoke-interface {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;->getView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getImportantForAccessibility()I

    move-result v0

    iput v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->W:I

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->l()Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;

    move-result-object v0

    invoke-interface {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;->getView()Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setImportantForAccessibility(I)V

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->M()Lcom/android/launcher3/Workspace;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lcom/android/launcher3/Workspace;->f(I)Lcom/android/launcher3/CellLayout;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/launcher3/CellLayout;->getEmptyView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->M()Lcom/android/launcher3/Workspace;

    move-result-object p0

    invoke-virtual {p0, v2}, Lcom/android/launcher3/Workspace;->f(I)Lcom/android/launcher3/CellLayout;

    move-result-object p0

    invoke-virtual {p0}, Lcom/android/launcher3/CellLayout;->getShortcutsAndWidgets()Lcom/android/launcher3/v;

    move-result-object p0

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p0

    if-nez p0, :cond_3a

    goto :goto_3b

    :cond_3a
    const/4 v1, 0x1

    :goto_3b
    invoke-virtual {v0, v1}, Landroid/view/View;->setImportantForAccessibility(I)V

    return-void
.end method

.method private static final L3(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Landroid/animation/ValueAnimator;)V
    .registers 3

    const-string v0, "animation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type kotlin.Float"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->K:Le3/u;

    if-nez p0, :cond_1e

    const-string p0, "binding"

    invoke-static {p0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 p0, 0x0

    :cond_1e
    iget-object v0, p0, Le3/u;->x:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/view/View;->setAlpha(F)V

    iget-object p0, p0, Le3/u;->w:Landroid/widget/TextView;

    invoke-virtual {p0, p1}, Landroid/view/View;->setAlpha(F)V

    return-void
.end method

.method public static synthetic M1(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Landroid/view/View;)V
    .registers 2

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->j3(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Landroid/view/View;)V

    return-void
.end method

.method private final M3()V
    .registers 7

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->K:Le3/u;

    if-nez v0, :cond_a

    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_a
    sget-object v1, LF2/h;->a:LF2/h;

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "requireContext(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, LF2/h;->b(Landroid/content/Context;)Lh8/o;

    move-result-object v2

    iget-object v4, v0, Le3/u;->x:Landroid/widget/TextView;

    invoke-virtual {v2}, Lh8/o;->c()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/content/res/ColorStateList;

    invoke-virtual {v4, v5}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    iget-object v4, v0, Le3/u;->w:Landroid/widget/TextView;

    invoke-virtual {v2}, Lh8/o;->c()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/content/res/ColorStateList;

    invoke-virtual {v4, v5}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    iget-object v4, v0, Le3/u;->x:Landroid/widget/TextView;

    invoke-virtual {v2}, Lh8/o;->d()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v4, v0, Le3/u;->w:Landroid/widget/TextView;

    invoke-virtual {v2}, Lh8/o;->d()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v4, v0, Le3/u;->z:Landroid/widget/ImageButton;

    invoke-virtual {v2}, Lh8/o;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/res/ColorStateList;

    invoke-virtual {v4, v2}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    iget-object v0, v0, Le3/u;->Q:Lcom/nothing/wallpaper/widget/RoundedOverlayImageView;

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0, v3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, p0}, LF2/h;->j(Landroid/content/Context;)I

    move-result p0

    invoke-virtual {v0, p0}, Lcom/nothing/wallpaper/widget/RoundedOverlayImageView;->setOverlayColor(I)V

    return-void
.end method

.method public static synthetic N1(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V
    .registers 1

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->b4(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V

    return-void
.end method

.method public static synthetic O1(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Landroid/animation/ValueAnimator;)V
    .registers 2

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->L3(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method private final O2()LI7/b;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->i0:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LI7/b;

    return-object p0
.end method

.method public static synthetic P1(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)Lh8/A;
    .registers 1

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->g3(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method private final P3()V
    .registers 6

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->K:Le3/u;

    if-nez v0, :cond_a

    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_a
    iget-object v1, v0, Le3/u;->J:Landroid/widget/TextView;

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->A3()Z

    move-result v2

    const/16 v3, 0x8

    const/4 v4, 0x0

    if-eqz v2, :cond_17

    move v2, v4

    goto :goto_18

    :cond_17
    move v2, v3

    :goto_18
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->getLockScreenViewModel()LJ7/i;

    move-result-object v1

    invoke-virtual {v1}, LJ7/i;->a0()Z

    move-result v1

    if-eqz v1, :cond_3b

    iget-object v1, v0, Le3/u;->z:Landroid/widget/ImageButton;

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->z3()Z

    move-result v2

    if-eqz v2, :cond_2e

    move v3, v4

    :cond_2e
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, v0, Le3/u;->Q:Lcom/nothing/wallpaper/widget/RoundedOverlayImageView;

    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    const/4 v1, 0x1

    invoke-direct {p0, v1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->J3(Z)V

    goto :goto_40

    :cond_3b
    iget-object p0, v0, Le3/u;->A:Landroid/widget/Button;

    invoke-virtual {p0, v4}, Landroid/view/View;->setVisibility(I)V

    :goto_40
    iget-object p0, v0, Le3/u;->G:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview;

    invoke-virtual {p0, v4}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public static synthetic Q1(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V
    .registers 1

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->T3(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V

    return-void
.end method

.method public static synthetic R1(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V
    .registers 1

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->X2(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V

    return-void
.end method

.method private final R2()I
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->I:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method

.method private static final R3(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)I
    .registers 2

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    const v0, 0x7f0704ba

    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p0

    return p0
.end method

.method public static final synthetic S1(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Ljava/util/List;)V
    .registers 2

    invoke-virtual {p0, p1}, Ly7/S;->v0(Ljava/util/List;)V

    return-void
.end method

.method private final S3()V
    .registers 5

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->N:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;

    if-eqz v0, :cond_c

    invoke-virtual {v0}, Lcom/android/launcher3/a;->K()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_c

    return-void

    :cond_c
    sget-object v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;->b0:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet$b;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, p0, v3, v1, v2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet$b;->b(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet$b;Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;ZILjava/lang/Object;)Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;

    move-result-object v0

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->N:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->L2()V

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->N:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;

    if-eqz v0, :cond_26

    new-instance v1, LE7/G;

    invoke-direct {v1, p0}, LE7/G;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V

    invoke-virtual {v0, v1}, Lcom/android/launcher3/views/e;->setOnCloseBeginListener(Lcom/android/launcher3/views/e$c;)V

    :cond_26
    return-void
.end method

.method public static final synthetic T1(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V
    .registers 1

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->z2()V

    return-void
.end method

.method private static final T3(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V
    .registers 1

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->F3()V

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->T2()LJ7/b;

    move-result-object p0

    invoke-virtual {p0}, LJ7/b;->f()V

    return-void
.end method

.method public static final synthetic U1(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V
    .registers 1

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->A2()V

    return-void
.end method

.method private final U2()I
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->H:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method

.method private final U3()V
    .registers 11

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->k0:LX7/i;

    const/4 v1, 0x1

    if-eqz v0, :cond_12

    invoke-virtual {v0}, LX7/i;->e()Landroid/app/AlertDialog;

    move-result-object v0

    if-eqz v0, :cond_12

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-ne v0, v1, :cond_12

    return-void

    :cond_12
    new-instance v2, LW7/a;

    const v0, 0x7f1300d6

    invoke-virtual {p0, v0}, Landroidx/fragment/app/q;->getString(I)Ljava/lang/String;

    move-result-object v3

    const-string v0, "getString(...)"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, LE7/v;

    invoke-direct {v4, p0}, LE7/v;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V

    sget-object v5, LW7/b;->r:LW7/b;

    const/16 v7, 0x8

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, LW7/a;-><init>(Ljava/lang/String;Lv8/a;LW7/b;ZILkotlin/jvm/internal/h;)V

    new-instance v3, LW7/a;

    const v4, 0x7f1300d5

    invoke-virtual {p0, v4}, Landroidx/fragment/app/q;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, LE7/w;

    invoke-direct {v5}, LE7/w;-><init>()V

    sget-object v6, LW7/b;->q:LW7/b;

    const/16 v8, 0x8

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v9}, LW7/a;-><init>(Ljava/lang/String;Lv8/a;LW7/b;ZILkotlin/jvm/internal/h;)V

    filled-new-array {v2, v3}, [LW7/a;

    move-result-object v2

    invoke-static {v2}, Li8/s;->n([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    new-instance v3, LX7/i;

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object v4

    const-string v5, "requireContext(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v3, v4, v2, v1}, LX7/i;-><init>(Landroid/content/Context;Ljava/util/List;Z)V

    iput-object v3, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->k0:LX7/i;

    const v2, 0x7f1300d7

    invoke-virtual {p0, v2}, Landroidx/fragment/app/q;->getString(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, p0}, LX7/i;->q(Ljava/lang/String;)V

    const-string p0, ""

    invoke-virtual {v3, p0}, LX7/i;->p(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, LX7/i;->n(Z)V

    invoke-virtual {v3, v1}, LX7/i;->o(Z)V

    invoke-virtual {v3}, LX7/i;->r()V

    return-void
.end method

.method public static final synthetic V1(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)Z
    .registers 1

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->E2()Z

    move-result p0

    return p0
.end method

.method private final V2()Landroidx/core/view/W;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->Y:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/core/view/W;

    return-object p0
.end method

.method private static final V3(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)Lh8/A;
    .registers 7

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->H3()V

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v1, 0x1

    const-wide/16 v2, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->K2(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;ZJILjava/lang/Object;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public static final synthetic W1(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V
    .registers 1

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->I2()V

    return-void
.end method

.method private static final W3()Lh8/A;
    .registers 1

    sget-object v0, Lh8/A;->a:Lh8/A;

    return-object v0
.end method

.method public static final synthetic X1(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V
    .registers 1

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->L2()V

    return-void
.end method

.method private static final X2(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V
    .registers 3

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->K:Le3/u;

    if-nez v0, :cond_a

    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_a
    iget-object v0, v0, Le3/u;->J:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->h0:LE7/Z;

    if-eqz p0, :cond_18

    invoke-virtual {p0}, LE7/Z;->N()V

    :cond_18
    return-void
.end method

.method private final X3()V
    .registers 6

    new-instance v0, LE7/e;

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "requireContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->getLockScreenViewModel()LJ7/i;

    move-result-object v2

    invoke-virtual {v2}, LJ7/i;->M()LI8/O;

    move-result-object v2

    invoke-interface {v2}, LI8/O;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    if-eqz v2, :cond_20

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    goto :goto_21

    :cond_20
    const/4 v2, 0x0

    :goto_21
    iget-object v3, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->h0:LE7/Z;

    const/4 v4, 0x0

    if-eqz v3, :cond_2b

    invoke-virtual {v3}, LE7/Z;->w()Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState;

    move-result-object v3

    goto :goto_2c

    :cond_2b
    move-object v3, v4

    :goto_2c
    invoke-direct {v0, v1, v2, v3}, LE7/e;-><init>(Landroid/content/Context;ZLcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState;)V

    new-instance v1, LE7/H;

    invoke-direct {v1, p0, v0}, LE7/H;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;LE7/e;)V

    invoke-virtual {v0, v1}, LE7/e;->f(Lv8/p;)V

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->K:Le3/u;

    if-nez p0, :cond_41

    const-string p0, "binding"

    invoke-static {p0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    goto :goto_42

    :cond_41
    move-object v4, p0

    :goto_42
    iget-object p0, v4, Le3/u;->z:Landroid/widget/ImageButton;

    const-string v1, "btnEffects"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p0}, LE7/e;->g(Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic Y1(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)Le3/u;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->K:Le3/u;

    return-object p0
.end method

.method private final Y2()V
    .registers 3

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->V2()Landroidx/core/view/W;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroidx/core/view/W;->e(I)V

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->V2()Landroidx/core/view/W;

    move-result-object p0

    invoke-static {}, Landroidx/core/view/V$k;->e()I

    move-result v0

    invoke-virtual {p0, v0}, Landroidx/core/view/W;->a(I)V

    return-void
.end method

.method private static final Y3(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;LE7/e;ZLE7/f;)Lh8/A;
    .registers 6

    const-string v0, "effectType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LE7/f;->q:LE7/f;

    if-eq p3, v0, :cond_d

    sget-object v1, LE7/f;->s:LE7/f;

    if-ne p3, v1, :cond_19

    :cond_d
    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->h0:LE7/Z;

    if-eqz p0, :cond_19

    if-ne p3, v0, :cond_15

    const/4 p3, 0x1

    goto :goto_16

    :cond_15
    const/4 p3, 0x0

    :goto_16
    invoke-virtual {p0, p2, p3}, LE7/Z;->Y(ZZ)V

    :cond_19
    invoke-virtual {p1}, LE7/e;->dismiss()V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public static final synthetic Z1(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)Ljava/lang/Runnable;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->o0:Ljava/lang/Runnable;

    return-object p0
.end method

.method public static final synthetic a2(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$l;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->m0:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$l;

    return-object p0
.end method

.method private final a3()V
    .registers 20

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->K:Le3/u;

    const/4 v2, 0x0

    const-string v3, "binding"

    if-nez v1, :cond_d

    invoke-static {v3}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v1, v2

    :cond_d
    sget-object v4, Lj7/m;->a:Lj7/m;

    invoke-virtual {v4}, Lj7/m;->b()Landroid/graphics/Bitmap;

    move-result-object v4

    if-eqz v4, :cond_32

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v5

    if-eqz v5, :cond_1f

    invoke-static {}, Lj7/m;->c()V

    goto :goto_32

    :cond_1f
    iget-object v5, v1, Le3/u;->N:Landroid/widget/ImageView;

    const-string v6, "wallpaperImagePreload"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v7, 0x0

    invoke-virtual {v5, v7}, Landroid/view/View;->setVisibility(I)V

    iget-object v5, v1, Le3/u;->N:Landroid/widget/ImageView;

    invoke-static {v5, v6}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5, v4}, Lj7/m;->f(Landroid/widget/ImageView;Landroid/graphics/Bitmap;)V

    :cond_32
    :goto_32
    invoke-direct {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->w3()Z

    move-result v4

    if-eqz v4, :cond_43

    iget-object v4, v1, Le3/u;->v:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/AccessibilityCellLayout;

    new-instance v5, LE7/i;

    invoke-direct {v5, v0}, LE7/i;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V

    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_4f

    :cond_43
    iget-object v4, v1, Le3/u;->v:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/AccessibilityCellLayout;

    const-string v5, "accessibilityLayout"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v5, 0x8

    invoke-virtual {v4, v5}, Landroid/view/View;->setVisibility(I)V

    :goto_4f
    invoke-virtual {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->l()Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;

    move-result-object v4

    invoke-interface {v4}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;->getView()Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    const-string v6, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"

    if-eqz v5, :cond_2a4

    check-cast v5, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-virtual {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->l()Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;

    move-result-object v7

    invoke-interface {v7}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;->getView()Landroid/view/View;

    move-result-object v7

    instance-of v7, v7, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;

    if-eqz v7, :cond_7f

    invoke-virtual {v0}, Ly7/S;->K()Lcom/android/launcher3/f;

    move-result-object v7

    invoke-virtual {v7}, Lcom/android/launcher3/f;->j()I

    move-result v7

    invoke-virtual {v0}, Ly7/S;->K()Lcom/android/launcher3/f;

    move-result-object v8

    invoke-virtual {v8}, Lcom/android/launcher3/f;->h()I

    move-result v8

    sub-int/2addr v7, v8

    goto :goto_87

    :cond_7f
    invoke-virtual {v0}, Ly7/S;->K()Lcom/android/launcher3/f;

    move-result-object v7

    invoke-virtual {v7}, Lcom/android/launcher3/f;->j()I

    move-result v7

    :goto_87
    iput v7, v5, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    invoke-virtual {v4, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->l()Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;

    move-result-object v4

    invoke-virtual {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->getLockScreenViewModel()LJ7/i;

    move-result-object v5

    invoke-virtual {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->getClockViewFactory()LS1/a;

    move-result-object v7

    invoke-virtual {v0}, Landroidx/fragment/app/q;->getViewLifecycleOwner()Landroidx/lifecycle/x;

    move-result-object v8

    const-string v9, "getViewLifecycleOwner(...)"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4, v5, v7, v8}, LG7/d;->f(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;LJ7/i;LS1/a;Landroidx/lifecycle/x;)V

    iget-object v4, v1, Le3/u;->C:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;

    new-instance v5, LE7/j;

    invoke-direct {v5, v0}, LE7/j;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V

    invoke-virtual {v4, v5}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;->setOnClockSelectedListener(Lv8/l;)V

    invoke-virtual {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->l()Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;

    move-result-object v4

    new-instance v5, LE7/k;

    invoke-direct {v5, v0}, LE7/k;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V

    invoke-interface {v4, v5}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;->setOnClockChangedListener(Lv8/l;)V

    new-instance v4, Ly7/C;

    invoke-virtual {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->l()Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;

    move-result-object v5

    invoke-direct {v4, v0, v5}, Ly7/C;-><init>(Lcom/android/launcher3/views/f;Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;)V

    iput-object v4, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->O:Ly7/C;

    invoke-virtual {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->l()Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;

    move-result-object v4

    invoke-interface {v4}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;->getView()Landroid/view/View;

    move-result-object v4

    instance-of v4, v4, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;

    if-eqz v4, :cond_e1

    invoke-virtual {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->l()Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;

    move-result-object v4

    invoke-interface {v4}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;->getView()Landroid/view/View;

    move-result-object v4

    new-instance v5, LE7/l;

    invoke-direct {v5, v0}, LE7/l;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V

    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_e1
    new-instance v4, Ly7/C;

    invoke-virtual {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->l()Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;

    move-result-object v5

    invoke-direct {v4, v0, v5}, Ly7/C;-><init>(Lcom/android/launcher3/views/f;Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;)V

    iput-object v4, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->O:Ly7/C;

    iget-object v4, v1, Le3/u;->G:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview;

    new-instance v5, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$g;

    invoke-direct {v5, v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$g;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V

    invoke-virtual {v4, v5}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview;->setOnSlotListener(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview$a;)V

    invoke-virtual {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->getLockScreenViewModel()LJ7/i;

    move-result-object v4

    invoke-virtual {v4}, LJ7/i;->a0()Z

    move-result v4

    if-eqz v4, :cond_17f

    invoke-direct {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->l4()V

    invoke-direct {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->M3()V

    iget-object v4, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->K:Le3/u;

    if-nez v4, :cond_10e

    invoke-static {v3}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v4, v2

    :cond_10e
    iget-object v4, v4, Le3/u;->z:Landroid/widget/ImageButton;

    new-instance v5, LE7/m;

    invoke-direct {v5, v0}, LE7/m;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V

    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v4, v1, Le3/u;->x:Landroid/widget/TextView;

    new-instance v5, LE7/n;

    invoke-direct {v5, v0}, LE7/n;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V

    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v4, v1, Le3/u;->w:Landroid/widget/TextView;

    new-instance v5, LE7/o;

    invoke-direct {v5, v0}, LE7/o;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V

    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v4, v1, Le3/u;->Q:Lcom/nothing/wallpaper/widget/RoundedOverlayImageView;

    new-instance v5, LE7/p;

    invoke-direct {v5, v0}, LE7/p;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V

    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-direct {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->t3()Z

    move-result v4

    if-nez v4, :cond_1c2

    iget-object v4, v1, Le3/u;->Q:Lcom/nothing/wallpaper/widget/RoundedOverlayImageView;

    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    invoke-static {v4, v6}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Landroid/view/ViewGroup$MarginLayoutParams;

    iget-object v5, v1, Le3/u;->z:Landroid/widget/ImageButton;

    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    invoke-static {v5, v6}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-virtual {v0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object v7

    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    const v8, 0x7f07062c

    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v7

    invoke-virtual {v0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    const v10, 0x7f070141

    invoke-virtual {v8, v10}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v8

    invoke-direct {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->R2()I

    move-result v10

    add-int/2addr v10, v7

    iput v10, v4, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    invoke-direct {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->R2()I

    move-result v4

    add-int/2addr v4, v8

    iput v4, v5, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    goto :goto_1c2

    :cond_17f
    iget-object v4, v1, Le3/u;->A:Landroid/widget/Button;

    new-instance v5, LE7/q;

    invoke-direct {v5, v0}, LE7/q;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V

    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    sget-object v4, LF2/h;->a:LF2/h;

    iget-object v5, v1, Le3/u;->A:Landroid/widget/Button;

    const-string v7, "btnWallpaper"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const v7, 0x7f080099

    const v8, 0x7f08009a

    invoke-virtual {v4, v5, v7, v8}, LF2/h;->n(Landroid/widget/Button;II)V

    invoke-direct {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->t3()Z

    move-result v4

    if-nez v4, :cond_1c2

    iget-object v4, v1, Le3/u;->A:Landroid/widget/Button;

    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    invoke-static {v4, v6}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-virtual {v0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v7, 0x7f070604

    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v5

    invoke-direct {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->R2()I

    move-result v7

    add-int/2addr v7, v5

    iput v7, v4, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    :cond_1c2
    :goto_1c2
    invoke-direct {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->t3()Z

    move-result v4

    if-nez v4, :cond_1de

    iget-object v4, v1, Le3/u;->G:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview;

    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    invoke-static {v4, v6}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-direct {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->R2()I

    move-result v5

    invoke-direct {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->U2()I

    move-result v6

    add-int/2addr v5, v6

    iput v5, v4, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    :cond_1de
    iget-object v4, v1, Le3/u;->H:Landroidx/cardview/widget/CardView;

    const-string v5, "translationAll"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4}, Landroid/view/View;->isLaidOut()Z

    move-result v5

    if-eqz v5, :cond_210

    invoke-virtual {v4}, Landroid/view/View;->isLayoutRequested()Z

    move-result v5

    if-nez v5, :cond_210

    new-instance v4, Ly7/r;

    invoke-static {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->Y1(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)Le3/u;

    move-result-object v5

    if-nez v5, :cond_1fd

    invoke-static {v3}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v5, v2

    :cond_1fd
    invoke-virtual {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->l()Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;

    move-result-object v6

    invoke-static {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->b2(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)Ly7/u;

    move-result-object v7

    invoke-virtual {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->T2()LJ7/b;

    move-result-object v8

    invoke-direct {v4, v5, v6, v7, v8}, Ly7/r;-><init>(Le3/u;Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;Lcom/android/launcher3/views/f;LJ7/b;)V

    invoke-static {v0, v4}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->l2(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Ly7/r;)V

    goto :goto_218

    :cond_210
    new-instance v5, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$h;

    invoke-direct {v5, v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$h;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V

    invoke-virtual {v4, v5}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    :goto_218
    sget-object v4, LG7/v;->a:LG7/v;

    invoke-virtual {v0}, Landroidx/fragment/app/q;->requireActivity()Landroidx/fragment/app/v;

    move-result-object v10

    const-string v4, "requireActivity(...)"

    invoke-static {v10, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->K:Le3/u;

    if-nez v5, :cond_22b

    invoke-static {v3}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v5, v2

    :cond_22b
    iget-object v11, v5, Le3/u;->O:Landroidx/cardview/widget/CardView;

    const-string v5, "wallpaperPreview"

    invoke-static {v11, v5}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroidx/fragment/app/q;->getViewLifecycleOwner()Landroidx/lifecycle/x;

    move-result-object v14

    invoke-static {v14, v9}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v13, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$e;

    invoke-virtual {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->getLockScreenViewModel()LJ7/i;

    move-result-object v5

    invoke-direct {v13, v5}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$e;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ly7/S;->N0()LK6/c;

    move-result-object v5

    invoke-virtual {v5}, Lh3/V;->i()Lg3/v;

    move-result-object v12

    invoke-virtual {v0}, Ly7/S;->N0()LK6/c;

    move-result-object v5

    invoke-virtual {v0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object v6

    const-string v7, "requireContext(...)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5, v6}, Lh3/V;->e(Landroid/content/Context;)LH3/k;

    move-result-object v5

    invoke-virtual {v0}, Landroidx/fragment/app/q;->requireActivity()Landroidx/fragment/app/v;

    move-result-object v6

    invoke-static {v6, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5, v6}, LH3/k;->o(Landroid/app/Activity;)Z

    move-result v15

    invoke-direct {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->v3()Z

    move-result v4

    xor-int/lit8 v16, v4, 0x1

    new-instance v4, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$f;

    invoke-direct {v4, v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$f;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V

    new-instance v5, LE7/s;

    invoke-direct {v5, v0}, LE7/s;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V

    move-object/from16 v18, v4

    move-object/from16 v17, v5

    invoke-static/range {v10 .. v18}, LG7/v;->j(Landroid/app/Activity;Landroidx/cardview/widget/CardView;Lg3/v;Lv8/p;Landroidx/lifecycle/x;ZZLv8/a;Lcom/android/wallpaper/asset/a$f;)LG7/v$a;

    iget-object v1, v1, Le3/u;->J:Landroid/widget/TextView;

    invoke-virtual {v0}, Ly7/S;->K()Lcom/android/launcher3/f;

    move-result-object v4

    iget v4, v4, Lcom/android/launcher3/f;->M:I

    int-to-float v4, v4

    invoke-virtual {v1, v4}, Landroid/view/View;->setTranslationY(F)V

    invoke-virtual {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->getLockScreenViewModel()LJ7/i;

    move-result-object v1

    invoke-virtual {v1}, LJ7/i;->a0()Z

    move-result v1

    if-eqz v1, :cond_2a3

    new-instance v1, LE7/Z;

    iget-object v4, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->K:Le3/u;

    if-nez v4, :cond_29d

    invoke-static {v3}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    goto :goto_29e

    :cond_29d
    move-object v2, v4

    :goto_29e
    invoke-direct {v1, v0, v2}, LE7/Z;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Le3/u;)V

    iput-object v1, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->h0:LE7/Z;

    :cond_2a3
    return-void

    :cond_2a4
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v6}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final a4()V
    .registers 5

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->M:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;

    if-eqz v0, :cond_c

    invoke-virtual {v0}, Lcom/android/launcher3/a;->K()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_c

    return-void

    :cond_c
    sget-object v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;->U:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet$a;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, p0, v3, v1, v2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet$a;->b(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet$a;Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;ZILjava/lang/Object;)Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;

    move-result-object v0

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->M:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;

    if-eqz v0, :cond_21

    new-instance v1, LE7/F;

    invoke-direct {v1, p0}, LE7/F;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V

    invoke-virtual {v0, v1}, Lcom/android/launcher3/views/e;->setOnCloseBeginListener(Lcom/android/launcher3/views/e$c;)V

    :cond_21
    return-void
.end method

.method public static final synthetic b2(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)Ly7/u;
    .registers 1

    invoke-virtual {p0}, Ly7/S;->O0()Ly7/u;

    move-result-object p0

    return-object p0
.end method

.method private static final b3(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Landroid/view/View;)V
    .registers 3

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireView()Landroid/view/View;

    move-result-object p1

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/view/View;->performHapticFeedback(I)Z

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->T2()LJ7/b;

    move-result-object p0

    invoke-virtual {p0}, LJ7/b;->t()V

    return-void
.end method

.method private static final b4(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V
    .registers 1

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->T2()LJ7/b;

    move-result-object p0

    invoke-virtual {p0}, LJ7/b;->f()V

    return-void
.end method

.method public static final synthetic c2(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)Landroid/os/Handler;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->T:Landroid/os/Handler;

    return-object p0
.end method

.method private static final c3(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Ljava/lang/String;)Lh8/A;
    .registers 3

    const-string v0, "clockId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->D3(Ljava/lang/String;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private final c4()V
    .registers 2

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->V2()Landroidx/core/view/W;

    move-result-object p0

    invoke-static {}, Landroidx/core/view/V$k;->e()I

    move-result v0

    invoke-virtual {p0, v0}, Landroidx/core/view/W;->f(I)V

    return-void
.end method

.method public static final synthetic d2(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)Ly7/C;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->O:Ly7/C;

    return-object p0
.end method

.method private static final d3(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Ljava/lang/String;)Lh8/A;
    .registers 4

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->getLockScreenViewModel()LJ7/i;

    move-result-object p1

    invoke-virtual {p1}, LJ7/i;->r0()Z

    move-result p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onClockChanged "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "LockScreenFragment"

    invoke-static {v1, v0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->h0:LE7/Z;

    if-eqz p0, :cond_25

    invoke-virtual {p0, p1}, LE7/Z;->t(Z)V

    :cond_25
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public static final synthetic e2(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->L:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;

    return-object p0
.end method

.method private static final e3(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Landroid/view/View;)V
    .registers 3

    invoke-virtual {p0}, Ly7/S;->K()Lcom/android/launcher3/f;

    move-result-object v0

    iget-boolean v0, v0, Lcom/android/launcher3/f;->e0:Z

    if-eqz v0, :cond_9

    goto :goto_42

    :cond_9
    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->T2()LJ7/b;

    move-result-object v0

    invoke-virtual {v0}, LJ7/b;->o()Z

    move-result v0

    if-eqz v0, :cond_43

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_1e

    check-cast p1, Ljava/lang/String;

    goto :goto_1f

    :cond_1e
    const/4 p1, 0x0

    :goto_1f
    if-nez p1, :cond_23

    const-string p1, ""

    :cond_23
    sget-object v0, LA7/d;->a:LA7/d;

    invoke-virtual {v0, p1}, LA7/d;->h(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_42

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->getClockViewFactory()LS1/a;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type com.nothing.wallpaper.picker.lockscreen.ui.view.NTClockViewFactoryImpl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object p0

    const-string v0, "requireContext(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->H(Landroid/content/Context;)V

    :cond_42
    :goto_42
    return-void

    :cond_43
    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->T2()LJ7/b;

    move-result-object p0

    invoke-virtual {p0}, LJ7/b;->r()V

    return-void
.end method

.method private static final e4(Le3/u;Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Landroid/animation/ValueAnimator;)V
    .registers 4

    const-string v0, "animation"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p2

    const-string v0, "null cannot be cast to non-null type kotlin.Float"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    iget-object v0, p0, Le3/u;->G:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview;

    invoke-virtual {v0, p2}, Landroid/view/View;->setAlpha(F)V

    invoke-virtual {p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->getLockScreenViewModel()LJ7/i;

    move-result-object v0

    invoke-virtual {v0}, LJ7/i;->a0()Z

    move-result v0

    if-eqz v0, :cond_33

    iget-object v0, p0, Le3/u;->Q:Lcom/nothing/wallpaper/widget/RoundedOverlayImageView;

    invoke-virtual {v0, p2}, Landroid/view/View;->setAlpha(F)V

    iget-object v0, p0, Le3/u;->x:Landroid/widget/TextView;

    invoke-virtual {v0, p2}, Landroid/view/View;->setAlpha(F)V

    iget-object v0, p0, Le3/u;->w:Landroid/widget/TextView;

    invoke-virtual {v0, p2}, Landroid/view/View;->setAlpha(F)V

    goto :goto_38

    :cond_33
    iget-object v0, p0, Le3/u;->A:Landroid/widget/Button;

    invoke-virtual {v0, p2}, Landroid/view/View;->setAlpha(F)V

    :goto_38
    invoke-direct {p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->z3()Z

    move-result v0

    if-eqz v0, :cond_43

    iget-object v0, p0, Le3/u;->z:Landroid/widget/ImageButton;

    invoke-virtual {v0, p2}, Landroid/view/View;->setAlpha(F)V

    :cond_43
    invoke-direct {p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->A3()Z

    move-result p1

    if-eqz p1, :cond_4e

    iget-object p0, p0, Le3/u;->J:Landroid/widget/TextView;

    invoke-virtual {p0, p2}, Landroid/view/View;->setAlpha(F)V

    :cond_4e
    return-void
.end method

.method public static final synthetic f2(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)Z
    .registers 1

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->q3()Z

    move-result p0

    return p0
.end method

.method private static final f3(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Landroid/view/View;)V
    .registers 2

    new-instance p1, LE7/D;

    invoke-direct {p1, p0}, LE7/D;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V

    invoke-static {p1}, Li6/b;->a(Lv8/a;)V

    return-void
.end method

.method private final f4()V
    .registers 4

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->T:Landroid/os/Handler;

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->n0:Ljava/lang/Runnable;

    const-wide/16 v1, 0x3e8

    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public static final synthetic g2(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)Z
    .registers 1

    iget-boolean p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->g0:Z

    return p0
.end method

.method private static final g3(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)Lh8/A;
    .registers 1

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->X3()V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private final g4()V
    .registers 3

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->l()Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;

    move-result-object v0

    invoke-interface {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;->getView()Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->M()Lcom/android/launcher3/Workspace;

    move-result-object v0

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->w3()Z

    move-result p0

    if-eqz p0, :cond_17

    goto :goto_19

    :cond_17
    const/16 v1, 0x8

    :goto_19
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public static final synthetic h2(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)Z
    .registers 1

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->A3()Z

    move-result p0

    return p0
.end method

.method private static final h3(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Landroid/view/View;)V
    .registers 2

    new-instance p1, LE7/A;

    invoke-direct {p1, p0}, LE7/A;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V

    invoke-static {p1}, Li6/b;->a(Lv8/a;)V

    return-void
.end method

.method private static final h4(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V
    .registers 4

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->M()Lcom/android/launcher3/Workspace;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_b

    return-void

    :cond_b
    const/4 v0, 0x2

    new-array v0, v0, [F

    fill-array-data v0, :array_36

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->S:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_2e

    const-wide/16 v1, 0x12c

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    new-instance v1, LE7/z;

    invoke-direct {v1, p0}, LE7/z;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    new-instance v1, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$s;

    invoke-direct {v1, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$s;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    :cond_2e
    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->S:Landroid/animation/ValueAnimator;

    if-eqz p0, :cond_35

    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->start()V

    :cond_35
    return-void

    :array_36
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public static final synthetic i2(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V
    .registers 1

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->F3()V

    return-void
.end method

.method private static final i3(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)Lh8/A;
    .registers 8

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->E2()Z

    move-result v0

    if-eqz v0, :cond_9

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_9
    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->s3()Z

    move-result v0

    if-eqz v0, :cond_13

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->I3()V

    goto :goto_1c

    :cond_13
    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->K2(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;ZJILjava/lang/Object;)V

    :goto_1c
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private static final i4(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Landroid/animation/ValueAnimator;)V
    .registers 3

    const-string v0, "animation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type kotlin.Float"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->M()Lcom/android/launcher3/Workspace;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/View;->setAlpha(F)V

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->l()Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;

    move-result-object p0

    invoke-interface {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;->getView()Landroid/view/View;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/view/View;->setAlpha(F)V

    return-void
.end method

.method public static synthetic j1(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)Lh8/A;
    .registers 1

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->V3(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic j2(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Z)V
    .registers 2

    invoke-direct {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->J3(Z)V

    return-void
.end method

.method private static final j3(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Landroid/view/View;)V
    .registers 2

    new-instance p1, LE7/y;

    invoke-direct {p1, p0}, LE7/y;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V

    invoke-static {p1}, Li6/b;->a(Lv8/a;)V

    return-void
.end method

.method private final j4()V
    .registers 2

    iget-boolean v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->f0:Z

    if-eqz v0, :cond_15

    iget-boolean v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->e0:Z

    if-eqz v0, :cond_15

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->v3()Z

    move-result v0

    if-eqz v0, :cond_12

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->f4()V

    return-void

    :cond_12
    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->g4()V

    :cond_15
    return-void
.end method

.method public static synthetic k1(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)Lh8/A;
    .registers 1

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->i3(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic k2(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Z)V
    .registers 2

    invoke-direct {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->K3(Z)V

    return-void
.end method

.method private static final k3(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)Lh8/A;
    .registers 7

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->E2()Z

    move-result v0

    if-eqz v0, :cond_9

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_9
    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->s3()Z

    move-result v1

    if-eqz v1, :cond_12

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->H3()V

    :cond_12
    const/4 v4, 0x2

    const/4 v5, 0x0

    const-wide/16 v2, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->K2(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;ZJILjava/lang/Object;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private final k4()V
    .registers 8

    sget-object v0, LR7/d;->r:LR7/d;

    iget-boolean v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->a0:Z

    iget-object v2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->Z:Ljava/lang/String;

    iget-object v3, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->b0:Ljava/util/List;

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->getLockScreenViewModel()LJ7/i;

    move-result-object v4

    invoke-virtual {v4}, LJ7/i;->Y()[Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;

    move-result-object v4

    iget-object v5, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->c0:LN1/a;

    iget-object v6, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->d0:LA7/a;

    invoke-virtual/range {v0 .. v6}, LR7/d;->g(ZLjava/lang/String;Ljava/util/List;[Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;LN1/a;LA7/a;)V

    return-void
.end method

.method public static synthetic l1(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V
    .registers 1

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->h4(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V

    return-void
.end method

.method public static final synthetic l2(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Ly7/r;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->Q:Ly7/r;

    return-void
.end method

.method private static final l3(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Landroid/view/View;)V
    .registers 3

    new-instance v0, LE7/B;

    invoke-direct {v0, p1, p0}, LE7/B;-><init>(Landroid/view/View;Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V

    invoke-static {v0}, Li6/b;->a(Lv8/a;)V

    return-void
.end method

.method private final l4()V
    .registers 7

    invoke-static {}, Li6/e;->m()Z

    move-result v0

    if-eqz v0, :cond_43

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->K:Le3/u;

    if-nez v0, :cond_10

    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_10
    iget-object v1, v0, Le3/u;->x:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    iget-object v0, v0, Le3/u;->w:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    const v2, 0x7f0701b3

    invoke-virtual {p0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p0

    int-to-double v2, p0

    const-wide v4, 0x3fe6666666666666L    # 0.7

    mul-double/2addr v2, v4

    double-to-int p0, v2

    iput p0, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iput p0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    :cond_43
    return-void
.end method

.method public static synthetic m1(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Landroid/view/View;)V
    .registers 2

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->e3(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic m2(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->Z:Ljava/lang/String;

    return-void
.end method

.method private static final m3(Landroid/view/View;Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)Lh8/A;
    .registers 3

    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Landroid/view/View;->performHapticFeedback(I)Z

    invoke-direct {p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->o4()V

    sget-object p0, LR7/d;->r:LR7/d;

    invoke-virtual {p0}, LR7/d;->i()V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public static synthetic n1(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)Lh8/A;
    .registers 1

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->k3(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic n2(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;LA7/a;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->d0:LA7/a;

    return-void
.end method

.method private static final n3(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Landroid/view/View;)V
    .registers 3

    new-instance v0, LE7/E;

    invoke-direct {v0, p1, p0}, LE7/E;-><init>(Landroid/view/View;Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V

    invoke-static {v0}, Li6/b;->a(Lv8/a;)V

    return-void
.end method

.method public static synthetic o1(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;LE7/e;ZLE7/f;)Lh8/A;
    .registers 4

    invoke-static {p0, p1, p2, p3}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->Y3(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;LE7/e;ZLE7/f;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic o2(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;LN1/a;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->c0:LN1/a;

    return-void
.end method

.method private static final o3(Landroid/view/View;Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)Lh8/A;
    .registers 3

    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Landroid/view/View;->performHapticFeedback(I)Z

    invoke-direct {p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->o4()V

    sget-object p0, LR7/d;->r:LR7/d;

    invoke-virtual {p0}, LR7/d;->i()V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private final o4()V
    .registers 6

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireActivity()Landroidx/fragment/app/v;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/fragment/app/v;->o0()Landroidx/fragment/app/J;

    move-result-object p0

    const-string v0, "getSupportFragmentManager(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/android/wallpaper/picker/g;

    invoke-direct {v0}, Lcom/android/wallpaper/picker/g;-><init>()V

    new-instance v1, Lh8/o;

    const/high16 v2, 0x42400000    # 48.0f

    invoke-static {v2}, Lcom/android/launcher3/w;->b(F)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "key_padding_top"

    invoke-direct {v1, v3, v2}, Lh8/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Lh8/o;

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const-string v4, "key_is_lock_screen"

    invoke-direct {v2, v4, v3}, Lh8/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v1, v2}, [Lh8/o;

    move-result-object v1

    invoke-static {v1}, Lx0/d;->a([Lh8/o;)Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/fragment/app/q;->setArguments(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroidx/fragment/app/J;->p()Landroidx/fragment/app/S;

    move-result-object v1

    const v2, 0x7f0a01f5

    invoke-virtual {v1, v2, v0}, Landroidx/fragment/app/S;->b(ILandroidx/fragment/app/q;)Landroidx/fragment/app/S;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/fragment/app/S;->g(Ljava/lang/String;)Landroidx/fragment/app/S;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/S;->i()I

    invoke-virtual {p0}, Landroidx/fragment/app/J;->g0()Z

    return-void
.end method

.method public static synthetic p1(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Landroid/view/View;)V
    .registers 2

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->h3(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic p2(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Ljava/util/List;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->b0:Ljava/util/List;

    return-void
.end method

.method private static final p3(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)Lh8/A;
    .registers 1

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->E3()V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private static final p4(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)Landroidx/core/view/W;
    .registers 2

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireActivity()Landroidx/fragment/app/v;

    move-result-object p0

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p0

    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-static {p0, v0}, Landroidx/core/view/T;->a(Landroid/view/Window;Landroid/view/View;)Landroidx/core/view/W;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q1(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Landroid/view/View;)V
    .registers 2

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->l3(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic q2(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V
    .registers 1

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->P3()V

    return-void
.end method

.method private final q3()Z
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->X:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method public static synthetic r1()Lh8/A;
    .registers 1

    invoke-static {}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->W3()Lh8/A;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic r2(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->L:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;

    return-void
.end method

.method private static final r3()Z
    .registers 1

    invoke-static {}, Li6/e;->j()Z

    move-result v0

    return v0
.end method

.method public static synthetic s1(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)Lh8/A;
    .registers 1

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->p3(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic s2(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Z)V
    .registers 2

    iput-boolean p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->g0:Z

    return-void
.end method

.method private final s3()Z
    .registers 1

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->O2()LI7/b;

    move-result-object p0

    invoke-virtual {p0}, LI7/b;->a()Z

    move-result p0

    return p0
.end method

.method public static synthetic t1(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Landroid/view/View;)V
    .registers 2

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->b3(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic t2(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Z)V
    .registers 2

    iput-boolean p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->f0:Z

    return-void
.end method

.method private final t3()Z
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->J:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method public static synthetic u1(Landroid/view/View;Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)Lh8/A;
    .registers 2

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->o3(Landroid/view/View;Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic u2(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V
    .registers 1

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->S3()V

    return-void
.end method

.method private static final u3(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)Z
    .registers 2

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object p0

    const-string v0, "requireContext(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Li6/q;->e(Landroid/content/Context;)Z

    move-result p0

    return p0
.end method

.method public static synthetic v1(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)I
    .registers 1

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->y3(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)I

    move-result p0

    return p0
.end method

.method public static final synthetic v2(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V
    .registers 1

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->a4()V

    return-void
.end method

.method private final v3()Z
    .registers 2

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->U:Landroid/os/Bundle;

    if-nez v0, :cond_14

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->T2()LJ7/b;

    move-result-object v0

    invoke-virtual {v0}, LJ7/b;->l()Z

    move-result v0

    if-eqz v0, :cond_14

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->R:Landroid/animation/ValueAnimator;

    if-nez p0, :cond_14

    const/4 p0, 0x1

    return p0

    :cond_14
    const/4 p0, 0x0

    return p0
.end method

.method public static synthetic w1(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)LI7/b;
    .registers 1

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->H2(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)LI7/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic w2(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V
    .registers 1

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->c4()V

    return-void
.end method

.method private final w3()Z
    .registers 2

    new-instance p0, Landroid/os/UserHandle;

    invoke-static {}, Landroid/os/UserHandle;->myUserId()I

    move-result v0

    invoke-direct {p0, v0}, Landroid/os/UserHandle;-><init>(I)V

    invoke-virtual {p0}, Landroid/os/UserHandle;->isSystem()Z

    move-result p0

    return p0
.end method

.method public static synthetic x1(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)I
    .registers 1

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->R3(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)I

    move-result p0

    return p0
.end method

.method public static final synthetic x2(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V
    .registers 1

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->j4()V

    return-void
.end method

.method private static final x3(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)LJ7/i;
    .registers 5

    new-instance v0, Landroidx/lifecycle/d0;

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireActivity()Landroidx/fragment/app/v;

    move-result-object v1

    const-string v2, "requireActivity(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ly7/S;->N0()LK6/c;

    move-result-object v3

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireActivity()Landroidx/fragment/app/v;

    move-result-object p0

    invoke-static {p0, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, p0}, LK6/c;->K0(Lb/j;)LJ7/i$c;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Landroidx/lifecycle/d0;-><init>(Landroidx/lifecycle/f0;Landroidx/lifecycle/d0$c;)V

    const-class p0, LJ7/i;

    invoke-virtual {v0, p0}, Landroidx/lifecycle/d0;->b(Ljava/lang/Class;)Landroidx/lifecycle/a0;

    move-result-object p0

    check-cast p0, LJ7/i;

    return-object p0
.end method

.method public static synthetic y1(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Ljava/lang/String;)Lh8/A;
    .registers 2

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->c3(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Ljava/lang/String;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic y2(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V
    .registers 1

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->k4()V

    return-void
.end method

.method private static final y3(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)I
    .registers 2

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object p0

    const-string v0, "requireContext(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Li6/q;->b(Landroid/content/Context;)I

    move-result p0

    return p0
.end method

.method public static synthetic z1(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)Landroidx/core/view/W;
    .registers 1

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->p4(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)Landroidx/core/view/W;

    move-result-object p0

    return-object p0
.end method

.method private final z2()V
    .registers 8

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->s3()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->U3()V

    return-void

    :cond_a
    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->K2(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;ZJILjava/lang/Object;)V

    return-void
.end method

.method private final z3()Z
    .registers 3

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->h0:LE7/Z;

    const/4 v0, 0x0

    if-eqz p0, :cond_d

    invoke-virtual {p0}, LE7/Z;->I()Z

    move-result p0

    const/4 v1, 0x1

    if-ne p0, v1, :cond_d

    return v1

    :cond_d
    return v0
.end method


# virtual methods
.method public final B2()V
    .registers 5

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->T:Landroid/os/Handler;

    new-instance v1, LE7/t;

    invoke-direct {v1, p0}, LE7/t;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V

    const-wide/16 v2, 0x190

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public C(Lcom/nothing/launcher/card/m;)V
    .registers 6

    const-string v0, "info"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    new-array v0, v0, [I

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->M()Lcom/android/launcher3/Workspace;

    move-result-object v1

    iget v2, p1, LC2/b;->r:I

    invoke-virtual {v1, v2}, Lcom/android/launcher3/Workspace;->f(I)Lcom/android/launcher3/CellLayout;

    move-result-object v1

    iget v2, p1, LC2/b;->u:I

    iget v3, p1, LC2/b;->v:I

    invoke-virtual {v1, v0, v2, v3}, Lcom/android/launcher3/CellLayout;->p([III)Z

    move-result v1

    if-eqz v1, :cond_3b

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->M()Lcom/android/launcher3/Workspace;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "getContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Lcom/nothing/launcher/card/m;->o(Landroid/content/Context;)Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/nothing/launcher/card/m;->q(Landroid/os/Bundle;)V

    const/4 v1, 0x5

    iput v1, p1, LC2/b;->D:I

    iget v1, p1, LC2/b;->u:I

    iget v2, p1, LC2/b;->v:I

    invoke-virtual {p0, p1, v0, v1, v2}, Ly7/S;->U(Lcom/android/launcher3/m;[III)V

    return-void

    :cond_3b
    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object p1

    const v0, 0x7f1301e8

    invoke-virtual {p0, v0}, Landroidx/fragment/app/q;->getString(I)Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    invoke-static {p1, p0, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method public final E3()V
    .registers 4

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->e0:Z

    iget v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->V:F

    const/high16 v2, -0x40800000    # -1.0f

    cmpg-float v2, v1, v2

    if-nez v2, :cond_1f

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_22

    const-string v2, "showPreviewDimmingScrim"

    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    if-ne v1, v0, :cond_22

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p0, v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->n4(F)V

    goto :goto_22

    :cond_1f
    invoke-virtual {p0, v1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->n4(F)V

    :cond_22
    :goto_22
    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->d4()V

    return-void
.end method

.method public G(F)V
    .registers 11

    invoke-virtual {p0}, Landroidx/fragment/app/q;->isDetached()Z

    move-result v0

    if-nez v0, :cond_a8

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_e

    goto/16 :goto_a8

    :cond_e
    const/4 v0, 0x1

    int-to-float v1, v0

    sub-float/2addr v1, p1

    neg-float v1, v1

    iget-object v2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->M:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;

    const/4 v3, 0x0

    if-eqz v2, :cond_1c

    invoke-virtual {v2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;->getContentHeight()I

    move-result v2

    goto :goto_1d

    :cond_1c
    move v2, v3

    :goto_1d
    int-to-float v2, v2

    mul-float/2addr v2, v1

    iget-object v4, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->K:Le3/u;

    if-nez v4, :cond_29

    const-string v4, "binding"

    invoke-static {v4}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 v4, 0x0

    :cond_29
    iget-object v5, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->Q:Ly7/r;

    if-eqz v5, :cond_30

    invoke-virtual {v5, p1}, Ly7/r;->j(F)V

    :cond_30
    iget-object v5, v4, Le3/u;->I:Landroid/widget/FrameLayout;

    invoke-virtual {v5, v2}, Landroid/view/View;->setTranslationY(F)V

    invoke-virtual {v5, p1}, Landroid/view/View;->setAlpha(F)V

    invoke-static {v5}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    const/4 v6, 0x0

    cmpl-float v6, p1, v6

    if-lez v6, :cond_42

    move v7, v0

    goto :goto_43

    :cond_42
    move v7, v3

    :goto_43
    const/16 v8, 0x8

    if-eqz v7, :cond_49

    move v7, v3

    goto :goto_4a

    :cond_49
    move v7, v8

    :goto_4a
    invoke-virtual {v5, v7}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->l()Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;

    move-result-object v5

    invoke-interface {v5}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;->getView()Landroid/view/View;

    move-result-object v5

    invoke-virtual {v5, v2}, Landroid/view/View;->setTranslationY(F)V

    invoke-virtual {v5, p1}, Landroid/view/View;->setAlpha(F)V

    if-lez v6, :cond_5e

    goto :goto_5f

    :cond_5e
    move v0, v3

    :goto_5f
    if-eqz v0, :cond_62

    goto :goto_63

    :cond_62
    move v3, v8

    :goto_63
    invoke-virtual {v5, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, v4, Le3/u;->G:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview;

    invoke-virtual {v0, v2}, Landroid/view/View;->setTranslationY(F)V

    invoke-virtual {v0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview;->setAnimAlpha(F)V

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->t3()Z

    move-result v2

    if-nez v2, :cond_90

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->U2()I

    move-result v3

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->R2()I

    move-result v5

    int-to-float v5, v5

    mul-float/2addr p1, v5

    float-to-int p1, p1

    add-int/2addr v3, p1

    iput v3, v2, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    :cond_90
    iget-object p1, v4, Le3/u;->O:Landroidx/cardview/widget/CardView;

    invoke-virtual {p0}, Ly7/S;->K()Lcom/android/launcher3/f;

    move-result-object p0

    iget p0, p0, Lcom/android/launcher3/f;->R:I

    int-to-float p0, p0

    mul-float/2addr v1, p0

    invoke-virtual {p1, v1}, Landroid/view/View;->setTranslationY(F)V

    iget-object p0, v4, Le3/u;->L:Landroidx/cardview/widget/CardView;

    iget-object p1, v4, Le3/u;->O:Landroidx/cardview/widget/CardView;

    invoke-virtual {p1}, Landroid/view/View;->getTranslationY()F

    move-result p1

    invoke-virtual {p0, p1}, Landroid/view/View;->setTranslationY(F)V

    :cond_a8
    :goto_a8
    return-void
.end method

.method public G0(I)V
    .registers 3

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->getLockScreenViewModel()LJ7/i;

    move-result-object v0

    invoke-virtual {v0, p1}, LJ7/i;->C(I)V

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->A2()V

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->M()Lcom/android/launcher3/Workspace;

    move-result-object p0

    invoke-virtual {p0}, Lcom/android/launcher3/Workspace;->k0()V

    return-void
.end method

.method public final G2(Z)Landroid/animation/AnimatorSet;
    .registers 5

    if-eqz p1, :cond_1b

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->Y2()V

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireActivity()Landroidx/fragment/app/v;

    move-result-object v0

    invoke-virtual {v0}, Lb/j;->f()Lb/v;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getViewLifecycleOwner()Landroidx/lifecycle/x;

    move-result-object v1

    const-string v2, "getViewLifecycleOwner(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->m0:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$l;

    invoke-virtual {v0, v1, v2}, Lb/v;->h(Landroidx/lifecycle/x;Lb/u;)V

    :cond_1b
    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->Q:Ly7/r;

    if-eqz v0, :cond_2e

    invoke-virtual {v0, p1}, Ly7/r;->d(Z)Landroid/animation/AnimatorSet;

    move-result-object v0

    if-eqz v0, :cond_2e

    new-instance v1, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$c;

    invoke-direct {v1, p1, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$c;-><init>(ZLcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    return-object v0

    :cond_2e
    const/4 p0, 0x0

    return-object p0
.end method

.method public final G3(ZJ)V
    .registers 12

    const-string v0, "LockScreenFragment"

    const-string v1, "reset and exit"

    invoke-static {v0, v1}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->E2()Z

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->getLockScreenViewModel()LJ7/i;

    move-result-object v0

    invoke-virtual {v0}, LJ7/i;->y0()V

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->C:Lj7/j;

    if-eqz v0, :cond_18

    invoke-virtual {v0}, Lj7/j;->M0()V

    :cond_18
    invoke-static {p0}, Landroidx/lifecycle/y;->a(Landroidx/lifecycle/x;)Landroidx/lifecycle/r;

    move-result-object v1

    new-instance v2, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$o;

    const/4 v7, 0x0

    move-object v6, p0

    move v3, p1

    move-wide v4, p2

    invoke-direct/range {v2 .. v7}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$o;-><init>(ZJLcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Lm8/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    move-object v4, v2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method

.method public final H3()V
    .registers 3

    const-string v0, "LockScreenFragment"

    const-string v1, "restoreChange"

    invoke-static {v0, v1}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->O2()LI7/b;

    move-result-object p0

    invoke-virtual {p0}, LI7/b;->c()V

    return-void
.end method

.method public final I3()V
    .registers 4

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->O2()LI7/b;

    move-result-object v0

    invoke-virtual {v0}, LI7/b;->b()Z

    move-result v0

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->s3()Z

    move-result v1

    if-eqz v1, :cond_12

    if-nez v0, :cond_12

    const/4 v0, 0x1

    goto :goto_13

    :cond_12
    const/4 v0, 0x0

    :goto_13
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "saveChange notify saving:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "LockScreenFragment"

    invoke-static {v2, v1}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v0, :cond_32

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->getLockScreenViewModel()LJ7/i;

    move-result-object v1

    invoke-virtual {v1}, LJ7/i;->x0()V

    :cond_32
    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->O2()LI7/b;

    move-result-object v1

    invoke-virtual {v1}, LI7/b;->d()V

    if-eqz v0, :cond_42

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->getLockScreenViewModel()LJ7/i;

    move-result-object p0

    invoke-virtual {p0}, LJ7/i;->w0()V

    :cond_42
    return-void
.end method

.method public J()Lcom/android/launcher3/dragndrop/DragLayer;
    .registers 2

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->K:Le3/u;

    if-nez p0, :cond_a

    const-string p0, "binding"

    invoke-static {p0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 p0, 0x0

    :cond_a
    iget-object p0, p0, Le3/u;->D:Lcom/android/launcher3/dragndrop/DragLayer;

    const-string v0, "dragLayer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public L(F)V
    .registers 4

    invoke-virtual {p0}, Landroidx/fragment/app/q;->isDetached()Z

    move-result v0

    if-nez v0, :cond_3e

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_3e

    invoke-virtual {p0}, Ly7/S;->p()Lcom/android/launcher3/dragndrop/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/launcher3/dragndrop/a;->y()Z

    move-result v0

    if-eqz v0, :cond_17

    goto :goto_3e

    :cond_17
    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->M()Lcom/android/launcher3/Workspace;

    move-result-object v0

    const/4 v1, 0x1

    int-to-float v1, v1

    sub-float/2addr v1, p1

    invoke-virtual {v0, v1}, Lcom/android/launcher3/Workspace;->i0(F)V

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->M()Lcom/android/launcher3/Workspace;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/android/launcher3/Workspace;->setGridAlpha(F)V

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->K:Le3/u;

    if-nez v0, :cond_32

    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_32
    iget-object v0, v0, Le3/u;->G:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview;

    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->Q:Ly7/r;

    if-eqz p0, :cond_3e

    invoke-virtual {p0, p1}, Ly7/r;->k(F)V

    :cond_3e
    :goto_3e
    return-void
.end method

.method public M()Lcom/android/launcher3/Workspace;
    .registers 2

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->K:Le3/u;

    if-nez p0, :cond_a

    const-string p0, "binding"

    invoke-static {p0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 p0, 0x0

    :cond_a
    iget-object p0, p0, Le3/u;->R:Lcom/android/launcher3/Workspace;

    const-string v0, "workspace"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final M2()Lo7/g;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->D:Lo7/g;

    return-object p0
.end method

.method public N()Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview;
    .registers 2

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->K:Le3/u;

    if-nez p0, :cond_a

    const-string p0, "binding"

    invoke-static {p0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 p0, 0x0

    :cond_a
    iget-object p0, p0, Le3/u;->G:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview;

    const-string v0, "shortcutPreview"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final N2()LE7/Z;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->h0:LE7/Z;

    return-object p0
.end method

.method public final N3(Z)V
    .registers 2

    iput-boolean p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->a0:Z

    return-void
.end method

.method public O()Z
    .registers 1

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->T2()LJ7/b;

    move-result-object p0

    invoke-virtual {p0}, LJ7/b;->i()Z

    move-result p0

    return p0
.end method

.method public final O3(Ljava/lang/Runnable;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->l0:Ljava/lang/Runnable;

    return-void
.end method

.method public final P2()Lj7/j;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->C:Lj7/j;

    return-object p0
.end method

.method public Q()Z
    .registers 3

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->L:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;

    const/4 v0, 0x0

    if-eqz p0, :cond_d

    invoke-virtual {p0}, Lcom/android/launcher3/a;->K()Z

    move-result p0

    const/4 v1, 0x1

    if-ne p0, v1, :cond_d

    return v1

    :cond_d
    return v0
.end method

.method public final Q2()Z
    .registers 1

    iget-boolean p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->a0:Z

    return p0
.end method

.method public final Q3(Lg3/x;Lp7/a;)V
    .registers 10

    const-string v0, "wallpaper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "editFrom"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-static {p1, v2}, LG6/g;->d(Lg3/x;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setupWallpaper "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "LockScreenFragment"

    invoke-static {v1, v0}, Lcom/nothing/wallpaper/common/log/c;->k(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p1}, LG6/e;->s(Lg3/x;)Z

    move-result v0

    if-eqz v0, :cond_47

    new-instance v1, LD6/b;

    invoke-static {p1}, LG6/e;->i(Lg3/x;)Z

    move-result v4

    invoke-virtual {p1}, Lg3/x;->s()Z

    move-result v0

    xor-int/lit8 v5, v0, 0x1

    const/4 v6, 0x1

    move-object v3, p1

    invoke-direct/range {v1 .. v6}, LD6/b;-><init>(Landroid/content/Context;Lg3/x;ZZZ)V

    goto :goto_4d

    :cond_47
    move-object v3, p1

    new-instance v1, LD6/c;

    invoke-direct {v1, v2, v3}, LD6/c;-><init>(Landroid/content/Context;Lg3/x;)V

    :goto_4d
    invoke-static {v3}, LG6/e;->s(Lg3/x;)Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_79

    invoke-virtual {v3}, Lg3/x;->k()LC6/g;

    move-result-object p1

    invoke-static {v3, v2}, LG6/e;->e(Lg3/x;Landroid/content/Context;)Lcom/android/wallpaper/asset/a;

    move-result-object v4

    invoke-static {}, Lh3/I;->a()Lh3/H;

    move-result-object v5

    const-string v6, "null cannot be cast to non-null type com.android.customization.module.CustomizationInjector"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, LK1/a;

    new-instance v6, Lx6/k;

    invoke-interface {v5, v2}, LK1/a;->o(Landroid/content/Context;)Lx6/q;

    move-result-object v5

    if-eqz p1, :cond_74

    invoke-virtual {p1}, LC6/g;->d()Ljava/lang/String;

    move-result-object p1

    goto :goto_75

    :cond_74
    move-object p1, v0

    :goto_75
    invoke-direct {v6, v5, v2, v4, p1}, Lx6/k;-><init>(Lx6/q;Landroid/content/Context;Lcom/android/wallpaper/asset/a;Ljava/lang/String;)V

    goto :goto_7a

    :cond_79
    move-object v6, v0

    :goto_7a
    invoke-static {p2, v3, v6, v1}, Lj7/n;->a(Lp7/a;Lg3/x;Lx6/k;LD6/f;)Landroidx/lifecycle/d0$c;

    move-result-object p1

    new-instance p2, Landroidx/lifecycle/d0;

    invoke-direct {p2, p0, p1}, Landroidx/lifecycle/d0;-><init>(Landroidx/lifecycle/f0;Landroidx/lifecycle/d0$c;)V

    const-class v1, Lj7/j;

    invoke-virtual {p2, v1}, Landroidx/lifecycle/d0;->b(Ljava/lang/Class;)Landroidx/lifecycle/a0;

    move-result-object p2

    check-cast p2, Lj7/j;

    iput-object p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->C:Lj7/j;

    invoke-static {v3}, LG6/e;->s(Lg3/x;)Z

    move-result p2

    if-eqz p2, :cond_a1

    new-instance p2, Landroidx/lifecycle/d0;

    invoke-direct {p2, p0, p1}, Landroidx/lifecycle/d0;-><init>(Landroidx/lifecycle/f0;Landroidx/lifecycle/d0$c;)V

    const-class p1, Lo7/g;

    invoke-virtual {p2, p1}, Landroidx/lifecycle/d0;->b(Ljava/lang/Class;)Landroidx/lifecycle/a0;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Lo7/g;

    :cond_a1
    iput-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->D:Lo7/g;

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->C:Lj7/j;

    if-eqz p1, :cond_ae

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->getLockScreenViewModel()LJ7/i;

    move-result-object p2

    invoke-virtual {p1, p2}, Lj7/j;->W0(LJ7/i;)V

    :cond_ae
    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->C:Lj7/j;

    if-eqz p1, :cond_b7

    iget-object p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->D:Lo7/g;

    invoke-virtual {p1, p2}, Lj7/j;->U0(Lo7/b;)V

    :cond_b7
    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->C:Lj7/j;

    if-eqz p1, :cond_be

    invoke-virtual {p1}, Lj7/j;->L0()V

    :cond_be
    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->T2()LJ7/b;

    move-result-object p1

    invoke-virtual {p1}, LJ7/b;->j()LI8/A;

    move-result-object p1

    invoke-interface {p1}, LI8/A;->getValue()Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_e1

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->A3()Z

    move-result p1

    if-eqz p1, :cond_e1

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->T:Landroid/os/Handler;

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->o0:Ljava/lang/Runnable;

    const-wide/16 v0, 0xbb8

    invoke-virtual {p1, p0, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_e1
    return-void
.end method

.method public final S2()Ljava/lang/Runnable;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->l0:Ljava/lang/Runnable;

    return-object p0
.end method

.method public T()V
    .registers 2

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ly7/S;->f1(LF2/t;)V

    return-void
.end method

.method public final T2()LJ7/b;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->F:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LJ7/b;

    return-object p0
.end method

.method public final W2(Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingState;)V
    .registers 6

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingState$Silence;->INSTANCE:Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingState$Silence;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_2a

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->Z3()V

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->j0:Landroid/app/ProgressDialog;

    if-eqz p0, :cond_6d

    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p0

    if-eqz p0, :cond_6d

    invoke-virtual {p0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object p1

    iput v1, p1, Landroid/view/WindowManager$LayoutParams;->width:I

    iput v1, p1, Landroid/view/WindowManager$LayoutParams;->height:I

    const/4 v0, 0x0

    iput v0, p1, Landroid/view/WindowManager$LayoutParams;->dimAmount:F

    invoke-virtual {p0, p1}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    return-void

    :cond_2a
    sget-object v0, Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingState$Loading;->INSTANCE:Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingState$Loading;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_36

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->Z3()V

    return-void

    :cond_36
    instance-of v0, p1, Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingState$End;

    if-eqz v0, :cond_6d

    :try_start_3a
    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->j0:Landroid/app/ProgressDialog;

    if-eqz v0, :cond_5d

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V
    :try_end_41
    .catch Ljava/lang/Exception; {:try_start_3a .. :try_end_41} :catch_42

    goto :goto_5d

    :catch_42
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "dismiss error:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "LockScreenFragment"

    invoke-static {v2, v0}, Lcom/nothing/wallpaper/common/log/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    :cond_5d
    :goto_5d
    check-cast p1, Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingState$End;

    invoke-virtual {p1}, Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingState$End;->getSuccess()Z

    move-result p1

    if-eqz p1, :cond_6a

    const-wide/16 v2, 0x190

    invoke-direct {p0, v1, v2, v3}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->J2(ZJ)V

    :cond_6a
    const/4 p1, 0x0

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->j0:Landroid/app/ProgressDialog;

    :cond_6d
    return-void
.end method

.method public final Z2()V
    .registers 4

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->Q:Ly7/r;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Ly7/r;->f()V

    :cond_7
    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->Y2()V

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireActivity()Landroidx/fragment/app/v;

    move-result-object v0

    invoke-virtual {v0}, Lb/j;->f()Lb/v;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getViewLifecycleOwner()Landroidx/lifecycle/x;

    move-result-object v1

    const-string v2, "getViewLifecycleOwner(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->m0:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$l;

    invoke-virtual {v0, v1, p0}, Lb/v;->h(Landroidx/lifecycle/x;Lb/u;)V

    return-void
.end method

.method public final Z3()V
    .registers 4

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->j0:Landroid/app/ProgressDialog;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    :cond_7
    new-instance v0, Landroid/app/ProgressDialog;

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getContext()Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f14014c

    invoke-direct {v0, v1, v2}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;I)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setTitle(Ljava/lang/CharSequence;)V

    invoke-virtual {v0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f1300d1

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->setInverseBackgroundForced(Z)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCancelable(Z)V

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->j0:Landroid/app/ProgressDialog;

    return-void
.end method

.method public a(Z)V
    .registers 4

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->M()Lcom/android/launcher3/Workspace;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->getLockScreenViewModel()LJ7/i;

    move-result-object p0

    invoke-virtual {p0, p1}, LJ7/i;->D(Z)V

    return-void
.end method

.method public b(Z)V
    .registers 12

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onIdpChanged "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "LockScreenFragment"

    invoke-static {v1, v0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->M()Lcom/android/launcher3/Workspace;

    move-result-object v0

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->M()Lcom/android/launcher3/Workspace;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/launcher3/Workspace;->V(Ljava/lang/Boolean;)V

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->l()Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;

    move-result-object v0

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->M()Lcom/android/launcher3/Workspace;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {v0, v1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;->b(Z)V

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->K:Le3/u;

    const-string v1, "binding"

    const/4 v3, 0x0

    if-nez v0, :cond_4d

    invoke-static {v1}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v0, v3

    :cond_4d
    iget-object v0, v0, Le3/u;->v:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/AccessibilityCellLayout;

    const/4 v4, 0x1

    invoke-static {v0, v3, v4, v3}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/AccessibilityCellLayout;->e(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/AccessibilityCellLayout;LN1/a;ILjava/lang/Object;)V

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->K:Le3/u;

    if-nez v0, :cond_5b

    invoke-static {v1}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v0, v3

    :cond_5b
    iget-object v0, v0, Le3/u;->J:Landroid/widget/TextView;

    invoke-virtual {p0}, Ly7/S;->K()Lcom/android/launcher3/f;

    move-result-object v1

    iget v1, v1, Lcom/android/launcher3/f;->M:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setTranslationY(F)V

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->M()Lcom/android/launcher3/Workspace;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const-string v1, "getViewLifecycleOwner(...)"

    if-eqz v0, :cond_95

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getViewLifecycleOwner()Landroidx/lifecycle/x;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Landroidx/lifecycle/y;->a(Landroidx/lifecycle/x;)Landroidx/lifecycle/r;

    move-result-object v4

    new-instance v7, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$m;

    invoke-direct {v7, p0, p1, v3}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$m;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;ZLm8/e;)V

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->M()Lcom/android/launcher3/Workspace;

    move-result-object p1

    invoke-virtual {p1, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    :cond_95
    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->q3()Z

    move-result p1

    if-eqz p1, :cond_b2

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getViewLifecycleOwner()Landroidx/lifecycle/x;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Landroidx/lifecycle/y;->a(Landroidx/lifecycle/x;)Landroidx/lifecycle/r;

    move-result-object v4

    new-instance v7, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$n;

    invoke-direct {v7, p0, v3}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$n;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Lm8/e;)V

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    :cond_b2
    return-void
.end method

.method public c(F)V
    .registers 6

    invoke-virtual {p0}, Landroidx/fragment/app/q;->isDetached()Z

    move-result v0

    if-nez v0, :cond_67

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_67

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->O:Ly7/C;

    const/4 v1, 0x0

    if-nez v0, :cond_17

    const-string v0, "widgetExpandAnimation"

    invoke-static {v0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v0, v1

    :cond_17
    invoke-virtual {v0}, Ly7/C;->x()Z

    move-result v0

    if-nez v0, :cond_67

    invoke-virtual {p0}, Ly7/S;->p()Lcom/android/launcher3/dragndrop/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/launcher3/dragndrop/a;->y()Z

    move-result v0

    if-eqz v0, :cond_28

    goto :goto_67

    :cond_28
    invoke-virtual {p0}, Ly7/S;->R()Lcom/nothing/launcher/card/p;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/nothing/launcher/card/p;->y0(F)V

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->q3()Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_40

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->l()Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;

    move-result-object v0

    int-to-float v3, v2

    sub-float/2addr v3, p1

    invoke-interface {v0, v3}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;->h(F)V

    goto :goto_47

    :cond_40
    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->M()Lcom/android/launcher3/Workspace;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/android/launcher3/Workspace;->setGridAlpha(F)V

    :goto_47
    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->K:Le3/u;

    if-nez v0, :cond_51

    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    goto :goto_52

    :cond_51
    move-object v1, v0

    :goto_52
    iget-object v0, v1, Le3/u;->G:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview;

    int-to-float v1, v2

    sub-float/2addr v1, p1

    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->l()Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;

    move-result-object v0

    invoke-interface {v0, v1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;->c(F)V

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->Q:Ly7/r;

    if-eqz p0, :cond_67

    invoke-virtual {p0, p1}, Ly7/r;->k(F)V

    :cond_67
    :goto_67
    return-void
.end method

.method public final d4()V
    .registers 5

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->K:Le3/u;

    if-nez v0, :cond_a

    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_a
    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->v3()Z

    move-result v1

    const/high16 v2, 0x3f800000    # 1.0f

    if-eqz v1, :cond_40

    const/4 v1, 0x2

    new-array v1, v1, [F

    fill-array-data v1, :array_52

    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v1

    iput-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->R:Landroid/animation/ValueAnimator;

    if-eqz v1, :cond_38

    const-wide/16 v2, 0x258

    invoke-virtual {v1, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    invoke-virtual {v1, v2, v3}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    new-instance v2, LE7/x;

    invoke-direct {v2, v0, p0}, LE7/x;-><init>(Le3/u;Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V

    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    new-instance v2, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$r;

    invoke-direct {v2, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$r;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V

    invoke-virtual {v1, v2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    :cond_38
    iget-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->R:Landroid/animation/ValueAnimator;

    if-eqz v1, :cond_48

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->start()V

    goto :goto_48

    :cond_40
    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->P3()V

    iget-object v1, v0, Le3/u;->G:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview;

    invoke-virtual {v1, v2}, Landroid/view/View;->setAlpha(F)V

    :cond_48
    :goto_48
    iget-object v0, v0, Le3/u;->E:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->j4()V

    return-void

    :array_52
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public getClockViewFactory()LS1/a;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->G:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LS1/a;

    return-object p0
.end method

.method public getLockScreenViewModel()LJ7/i;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->E:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LJ7/i;

    return-object p0
.end method

.method public h()Z
    .registers 3

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->Q:Ly7/r;

    const/4 v0, 0x0

    if-eqz p0, :cond_d

    invoke-virtual {p0}, Ly7/r;->i()Z

    move-result p0

    const/4 v1, 0x1

    if-ne p0, v1, :cond_d

    return v1

    :cond_d
    return v0
.end method

.method public k(LC2/b;)V
    .registers 3

    const-string v0, "info"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->getLockScreenViewModel()LJ7/i;

    move-result-object p1

    invoke-virtual {p1}, LJ7/i;->c1()V

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->A2()V

    return-void
.end method

.method public l()Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;
    .registers 4

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->q3()Z

    move-result v0

    const/4 v1, 0x0

    const-string v2, "binding"

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->K:Le3/u;

    if-eqz v0, :cond_1a

    if-nez p0, :cond_11

    invoke-static {v2}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    goto :goto_12

    :cond_11
    move-object v1, p0

    :goto_12
    iget-object p0, v1, Le3/u;->B:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;

    const-string v0, "clockHostEditPreview"

    :goto_16
    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    :cond_1a
    if-nez p0, :cond_20

    invoke-static {v2}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    goto :goto_21

    :cond_20
    move-object v1, p0

    :goto_21
    iget-object p0, v1, Le3/u;->C:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;

    const-string v0, "clockHostView"

    goto :goto_16
.end method

.method public final m4(Z)V
    .registers 3

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->K:Le3/u;

    if-eqz v0, :cond_10

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->M()Lcom/android/launcher3/Workspace;

    move-result-object p0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/android/launcher3/Workspace;->f(I)Lcom/android/launcher3/CellLayout;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/android/launcher3/CellLayout;->o(Z)V

    :cond_10
    return-void
.end method

.method public final n4(F)V
    .registers 5

    iput p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->V:F

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->K:Le3/u;

    if-eqz v0, :cond_23

    const/4 v1, 0x0

    const-string v2, "binding"

    if-nez v0, :cond_f

    invoke-static {v2}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v0, v1

    :cond_f
    iget-object v0, v0, Le3/u;->F:Lcom/nothing/wallpaper/widget/RoundImageView;

    invoke-virtual {v0, p1}, Landroid/view/View;->setAlpha(F)V

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->K:Le3/u;

    if-nez p0, :cond_1c

    invoke-static {v2}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    goto :goto_1d

    :cond_1c
    move-object v1, p0

    :goto_1d
    iget-object p0, v1, Le3/u;->F:Lcom/nothing/wallpaper/widget/RoundImageView;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    :cond_23
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .registers 7

    const-string v0, "inflater"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->g0:Z

    iput-object p3, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->U:Landroid/os/Bundle;

    invoke-static {p1, p2, v0}, Le3/u;->C(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Le3/u;

    move-result-object p1

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->K:Le3/u;

    const/4 p2, 0x0

    const-string p3, "binding"

    if-nez p1, :cond_19

    invoke-static {p3}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object p1, p2

    :cond_19
    invoke-direct {p0, v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->J3(Z)V

    iget-object v0, p1, Le3/u;->A:Landroid/widget/Button;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p1, Le3/u;->Q:Lcom/nothing/wallpaper/widget/RoundedOverlayImageView;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p1, Le3/u;->z:Landroid/widget/ImageButton;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p1, Le3/u;->G:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->l()Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;

    move-result-object v0

    invoke-interface {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;->getView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p1, Le3/u;->R:Lcom/android/launcher3/Workspace;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p1, Le3/u;->R:Lcom/android/launcher3/Workspace;

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->O()Z

    move-result v2

    if-eqz v2, :cond_4c

    const/high16 v2, 0x3f800000    # 1.0f

    goto :goto_4d

    :cond_4c
    const/4 v2, 0x0

    :goto_4d
    invoke-virtual {v0, v2}, Lcom/android/launcher3/Workspace;->setGridAlpha(F)V

    iget-object p1, p1, Le3/u;->E:Landroid/widget/ImageView;

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->K:Le3/u;

    if-nez p0, :cond_5d

    invoke-static {p3}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    goto :goto_5e

    :cond_5d
    move-object p2, p0

    :goto_5e
    invoke-virtual {p2}, Landroidx/databinding/g;->o()Landroid/view/View;

    move-result-object p0

    const-string p1, "getRoot(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public onDestroyView()V
    .registers 4

    invoke-super {p0}, Ly7/S;->onDestroyView()V

    const-string v0, "LockScreenFragment"

    const-string v1, "onDestroyView"

    invoke-static {v0, v1}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->j0:Landroid/app/ProgressDialog;

    if-eqz v0, :cond_11

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    :cond_11
    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->k0:LX7/i;

    if-eqz v0, :cond_1e

    invoke-virtual {v0}, LX7/i;->e()Landroid/app/AlertDialog;

    move-result-object v0

    if-eqz v0, :cond_1e

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    :cond_1e
    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->R:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_25

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_25
    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->S:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_2c

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_2c
    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->T:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->M()Lcom/android/launcher3/Workspace;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->cancel()V

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->l()Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;

    move-result-object v0

    invoke-interface {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;->d()V

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->K:Le3/u;

    const-string v2, "binding"

    if-nez v0, :cond_4e

    invoke-static {v2}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v0, v1

    :cond_4e
    iget-object v0, v0, Le3/u;->M:Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

    invoke-virtual {v0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->recycle()V

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->K:Le3/u;

    if-nez v0, :cond_5b

    invoke-static {v2}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v0, v1

    :cond_5b
    iget-object v0, v0, Le3/u;->K:Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

    invoke-virtual {v0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->recycle()V

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->m0:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$l;

    invoke-virtual {v0}, Lb/u;->h()V

    iput-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->P:Lg3/x;

    iput-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->L:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;

    iput-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->M:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;

    invoke-virtual {p0}, Ly7/S;->K()Lcom/android/launcher3/f;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/android/launcher3/f;->r(Lcom/android/launcher3/l;)V

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getViewModelStore()Landroidx/lifecycle/e0;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/e0;->a()V

    iput-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->C:Lj7/j;

    iput-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->D:Lo7/g;

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->getLockScreenViewModel()LJ7/i;

    move-result-object v0

    invoke-virtual {v0}, LJ7/i;->a0()Z

    move-result v0

    if-nez v0, :cond_91

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->getLockScreenViewModel()LJ7/i;

    move-result-object v0

    invoke-virtual {v0}, LJ7/i;->c1()V

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->A2()V

    :cond_91
    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .registers 3

    const-string v0, "outState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Ly7/S;->onSaveInstanceState(Landroid/os/Bundle;)V

    iget p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->V:F

    const/high16 v0, -0x40800000    # -1.0f

    cmpg-float v0, p0, v0

    if-nez v0, :cond_11

    return-void

    :cond_11
    const-string v0, "previewDimmingScrimAlpha"

    invoke-virtual {p1, v0, p0}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    return-void
.end method

.method public onStop()V
    .registers 3

    invoke-super {p0}, Ly7/S;->onStop()V

    const-string v0, "LockScreenFragment"

    const-string v1, "onStop"

    invoke-static {v0, v1}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->O()Z

    move-result v0

    if-eqz v0, :cond_13

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->k4()V

    :cond_13
    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .registers 4

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Ly7/S;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    const-string p1, "LockScreenFragment"

    const-string v0, "onViewCreated"

    invoke-static {p1, v0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p2, :cond_19

    const-string p1, "previewDimmingScrimAlpha"

    invoke-virtual {p2, p1}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result p1

    iput p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->V:F

    :cond_19
    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->T2()LJ7/b;

    move-result-object p1

    invoke-virtual {p1}, LJ7/b;->i()Z

    move-result p1

    if-eqz p1, :cond_3c

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->Y2()V

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireActivity()Landroidx/fragment/app/v;

    move-result-object p1

    invoke-virtual {p1}, Lb/j;->f()Lb/v;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getViewLifecycleOwner()Landroidx/lifecycle/x;

    move-result-object p2

    const-string v0, "getViewLifecycleOwner(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->m0:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$l;

    invoke-virtual {p1, p2, v0}, Lb/v;->h(Landroidx/lifecycle/x;Lb/u;)V

    :cond_3c
    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->a3()V

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->B3()V

    invoke-virtual {p0}, Ly7/S;->K()Lcom/android/launcher3/f;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/android/launcher3/f;->d(Lcom/android/launcher3/l;)V

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->F2()V

    return-void
.end method

.method public u0(Lh8/o;)V
    .registers 3

    const-string v0, "info"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->getLockScreenViewModel()LJ7/i;

    move-result-object v0

    invoke-virtual {v0, p1}, LJ7/i;->A(Lh8/o;)V

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->A2()V

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->M()Lcom/android/launcher3/Workspace;

    move-result-object p0

    invoke-virtual {p0}, Lcom/android/launcher3/Workspace;->k0()V

    return-void
.end method

.method public y0(I)Z
    .registers 4

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->getLockScreenViewModel()LJ7/i;

    move-result-object p0

    invoke-virtual {p0}, LJ7/i;->I()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_e
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_28

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lh8/o;

    invoke-virtual {v1}, Lh8/o;->d()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/nothing/launcher/card/t;

    invoke-virtual {v1}, Lcom/nothing/launcher/card/t;->m()I

    move-result v1

    if-ne v1, p1, :cond_e

    goto :goto_29

    :cond_28
    const/4 v0, 0x0

    :goto_29
    if-nez v0, :cond_2d

    const/4 p0, 0x1

    return p0

    :cond_2d
    const/4 p0, 0x0

    return p0
.end method
