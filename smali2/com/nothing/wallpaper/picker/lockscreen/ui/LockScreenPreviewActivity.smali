.class public final Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenPreviewActivity;
.super LN6/b;
.source "SourceFile"

# interfaces
.implements Li3/K0;
.implements Lcom/android/wallpaper/picker/b$d;
.implements Lg3/z;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenPreviewActivity$a;
    }
.end annotation


# static fields
.field public static final X:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenPreviewActivity$a;

.field private static final Y:Ljava/lang/String;


# instance fields
.field private T:Lcom/android/wallpaper/picker/i;

.field private final U:Landroid/os/Handler;

.field private final V:Lh8/h;

.field private final W:Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenPreviewActivity$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenPreviewActivity$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenPreviewActivity;->X:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenPreviewActivity$a;

    const-string v0, "LockScreenPreviewActivity"

    sput-object v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenPreviewActivity;->Y:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .registers 3

    invoke-direct {p0}, LN6/b;-><init>()V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenPreviewActivity;->U:Landroid/os/Handler;

    new-instance v0, LE7/P;

    invoke-direct {v0, p0}, LE7/P;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenPreviewActivity;)V

    invoke-static {v0}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object v0

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenPreviewActivity;->V:Lh8/h;

    new-instance v0, LE7/Q;

    invoke-direct {v0, p0}, LE7/Q;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenPreviewActivity;)V

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenPreviewActivity;->W:Ljava/lang/Runnable;

    return-void
.end method

.method public static synthetic A0(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenPreviewActivity;)V
    .registers 1

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenPreviewActivity;->D0(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenPreviewActivity;)V

    return-void
.end method

.method private final B0()LJ7/b;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenPreviewActivity;->V:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LJ7/b;

    return-object p0
.end method

.method private final C0(Landroid/content/Intent;)V
    .registers 5

    const-string v0, "com.nothing.userguide.extra.KEY_FROM_TIPS"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    sget-object v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenPreviewActivity;->Y:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "handleIntent extraParam:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "lock_screen_widget"

    invoke-static {v0, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2e

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenPreviewActivity;->B0()LJ7/b;

    move-result-object p0

    const-string p1, "custom_widget"

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, LJ7/b;->n(Ljava/lang/String;Z)V

    :cond_2e
    return-void
.end method

.method private static final D0(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenPreviewActivity;)V
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenPreviewActivity;->T:Lcom/android/wallpaper/picker/i;

    if-eqz p0, :cond_7

    invoke-virtual {p0}, Lcom/android/wallpaper/picker/i;->w()V

    :cond_7
    return-void
.end method

.method private static final E0(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenPreviewActivity;)LJ7/b;
    .registers 3

    new-instance v0, Landroidx/lifecycle/d0;

    invoke-virtual {p0}, Lb/j;->getDefaultViewModelProviderFactory()Landroidx/lifecycle/d0$c;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Landroidx/lifecycle/d0;-><init>(Landroidx/lifecycle/f0;Landroidx/lifecycle/d0$c;)V

    const-class p0, LJ7/b;

    invoke-virtual {v0, p0}, Landroidx/lifecycle/d0;->b(Ljava/lang/Class;)Landroidx/lifecycle/a0;

    move-result-object p0

    check-cast p0, LJ7/b;

    return-object p0
.end method

.method public static synthetic z0(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenPreviewActivity;)LJ7/b;
    .registers 1

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenPreviewActivity;->E0(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenPreviewActivity;)LJ7/b;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public H(Lg3/x;Z)V
    .registers 3

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenPreviewActivity;->T:Lcom/android/wallpaper/picker/i;

    if-eqz p0, :cond_7

    invoke-virtual {p0, p1, p2}, Lcom/android/wallpaper/picker/i;->B(Lg3/x;Z)V

    :cond_7
    return-void
.end method

.method public a(Lcom/android/wallpaper/picker/f$b;)V
    .registers 2

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenPreviewActivity;->T:Lcom/android/wallpaper/picker/i;

    if-eqz p0, :cond_7

    invoke-virtual {p0, p1}, Lcom/android/wallpaper/picker/i;->a(Lcom/android/wallpaper/picker/f$b;)V

    :cond_7
    return-void
.end method

.method public b(Ljava/lang/CharSequence;)V
    .registers 2

    return-void
.end method

.method public c()V
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenPreviewActivity;->T:Lcom/android/wallpaper/picker/i;

    if-eqz p0, :cond_7

    invoke-virtual {p0}, Lcom/android/wallpaper/picker/i;->i()V

    :cond_7
    return-void
.end method

.method public d()Z
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .registers 5

    invoke-static {}, Lh3/I;->a()Lh3/H;

    move-result-object v0

    if-nez v0, :cond_14

    sget-object v0, Lcom/nothing/wallpaper/NTPickerApplication;->q:Lcom/nothing/wallpaper/NTPickerApplication$a;

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v1

    const-string v2, "getApplication(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/nothing/wallpaper/NTPickerApplication$a;->b(Landroid/app/Application;)V

    :cond_14
    invoke-static {}, Lh3/I;->a()Lh3/H;

    move-result-object v0

    new-instance v1, Lcom/android/wallpaper/picker/i;

    invoke-direct {v1, p0, p0, v0}, Lcom/android/wallpaper/picker/i;-><init>(Li3/K0;Landroidx/fragment/app/v;Lh3/H;)V

    iput-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenPreviewActivity;->T:Lcom/android/wallpaper/picker/i;

    invoke-super {p0, p1}, LN6/b;->onCreate(Landroid/os/Bundle;)V

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenPreviewActivity;->B0()LJ7/b;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, LJ7/b;->w(Z)V

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenPreviewActivity;->B0()LJ7/b;

    move-result-object p1

    invoke-virtual {p1, v0}, LJ7/b;->y(Z)V

    const p1, 0x7f0d0033

    invoke-virtual {p0, p1}, Lb/j;->setContentView(I)V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "getIntent(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenPreviewActivity;->C0(Landroid/content/Intent;)V

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenPreviewActivity;->U:Landroid/os/Handler;

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenPreviewActivity;->W:Ljava/lang/Runnable;

    const-wide/16 v1, 0x9c4

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    const-string p1, "getApplicationContext(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LU7/b;->h(Landroid/content/Context;)V

    return-void
.end method

.method protected onDestroy()V
    .registers 2

    invoke-super {p0}, LN6/b;->onDestroy()V

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenPreviewActivity;->U:Landroid/os/Handler;

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenPreviewActivity;->W:Ljava/lang/Runnable;

    invoke-virtual {v0, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .registers 3

    const-string v0, "intent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lb/j;->onNewIntent(Landroid/content/Intent;)V

    invoke-direct {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenPreviewActivity;->C0(Landroid/content/Intent;)V

    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .registers 5

    const-string v0, "permissions"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "grantResults"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/v;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenPreviewActivity;->T:Lcom/android/wallpaper/picker/i;

    if-eqz p0, :cond_14

    invoke-virtual {p0, p1, p2, p3}, Lcom/android/wallpaper/picker/i;->u(I[Ljava/lang/String;[I)V

    :cond_14
    return-void
.end method

.method public u()V
    .registers 3

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenPreviewActivity;->T:Lcom/android/wallpaper/picker/i;

    if-eqz v0, :cond_f

    invoke-virtual {v0}, Lcom/android/wallpaper/picker/i;->l()Lg3/b;

    move-result-object v1

    invoke-interface {v1, p0}, Lg3/b;->a(Landroid/content/Context;)Z

    move-result p0

    invoke-virtual {v0, p0}, Lcom/android/wallpaper/picker/i;->q(Z)V

    :cond_f
    return-void
.end method

.method public x()Lcom/android/wallpaper/picker/b;
    .registers 2

    invoke-virtual {p0}, Landroidx/fragment/app/v;->o0()Landroidx/fragment/app/J;

    move-result-object p0

    const-string v0, "getSupportFragmentManager(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0a01f5

    invoke-virtual {p0, v0}, Landroidx/fragment/app/J;->j0(I)Landroidx/fragment/app/q;

    move-result-object p0

    instance-of v0, p0, Lcom/android/wallpaper/picker/b;

    if-eqz v0, :cond_17

    check-cast p0, Lcom/android/wallpaper/picker/b;

    return-object p0

    :cond_17
    const/4 p0, 0x0

    return-object p0
.end method

.method public x0()Landroidx/fragment/app/q;
    .registers 2

    invoke-virtual {p0}, Landroidx/fragment/app/v;->o0()Landroidx/fragment/app/J;

    move-result-object p0

    const v0, 0x7f0a01f5

    invoke-virtual {p0, v0}, Landroidx/fragment/app/J;->j0(I)Landroidx/fragment/app/q;

    move-result-object p0

    if-eqz p0, :cond_12

    instance-of v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    if-eqz v0, :cond_12

    return-object p0

    :cond_12
    const/4 p0, 0x0

    return-object p0
.end method

.method public y(Lg3/a;)V
    .registers 4

    if-nez p1, :cond_3

    goto :goto_12

    :cond_3
    instance-of v0, p1, Lg3/r;

    if-nez v0, :cond_13

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenPreviewActivity;->T:Lcom/android/wallpaper/picker/i;

    if-eqz p0, :cond_12

    invoke-virtual {p1}, Lg3/a;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/android/wallpaper/picker/i;->z(Ljava/lang/String;)V

    :cond_12
    :goto_12
    return-void

    :cond_13
    invoke-static {}, Lh3/I;->a()Lh3/H;

    move-result-object v0

    check-cast p1, Lg3/r;

    invoke-virtual {p1}, Lg3/a;->b()Ljava/lang/String;

    move-result-object p1

    const-string v1, "getCollectionId(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, p0, p1}, Lh3/H;->m(Landroid/content/Context;Ljava/lang/String;)Landroidx/fragment/app/q;

    move-result-object p1

    invoke-virtual {p0, p1}, LN6/a;->v0(Landroidx/fragment/app/q;)V

    return-void
.end method

.method protected y0(IILandroid/content/Intent;)Z
    .registers 5

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenPreviewActivity;->T:Lcom/android/wallpaper/picker/i;

    const/4 v0, 0x0

    if-eqz p0, :cond_d

    invoke-virtual {p0, p1, p2, p3}, Lcom/android/wallpaper/picker/i;->p(IILandroid/content/Intent;)Z

    move-result p0

    const/4 p1, 0x1

    if-ne p0, p1, :cond_d

    return p1

    :cond_d
    return v0
.end method
