.class public final Li7/d;
.super Landroidx/lifecycle/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li7/d$a;
    }
.end annotation


# static fields
.field public static final i:Li7/d$a;


# instance fields
.field private final c:Landroid/app/Application;

.field private final d:Landroidx/lifecycle/Q;

.field private final e:LI8/A;

.field private final f:LI8/f;

.field private final g:Li7/d$d;

.field private volatile h:Z


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Li7/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Li7/d$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Li7/d;->i:Li7/d$a;

    return-void
.end method

.method public constructor <init>(Landroid/app/Application;Landroidx/lifecycle/Q;)V
    .registers 4

    const-string v0, "application"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "savedStateHandle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Landroidx/lifecycle/b;-><init>(Landroid/app/Application;)V

    iput-object p1, p0, Li7/d;->c:Landroid/app/Application;

    iput-object p2, p0, Li7/d;->d:Landroidx/lifecycle/Q;

    invoke-virtual {p0}, Li7/d;->q()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p1}, LI8/Q;->a(Ljava/lang/Object;)LI8/A;

    move-result-object p1

    iput-object p1, p0, Li7/d;->e:LI8/A;

    invoke-static {p1}, LI8/h;->b(LI8/A;)LI8/O;

    move-result-object p1

    iput-object p1, p0, Li7/d;->f:LI8/f;

    new-instance p1, Li7/d$d;

    invoke-direct {p1, p0}, Li7/d$d;-><init>(Li7/d;)V

    iput-object p1, p0, Li7/d;->g:Li7/d$d;

    return-void
.end method

.method public static synthetic f(Li7/d;Landroid/content/Context;)V
    .registers 2

    invoke-static {p0, p1}, Li7/d;->s(Li7/d;Landroid/content/Context;)V

    return-void
.end method

.method public static synthetic g(Li7/d;Landroid/content/Context;)V
    .registers 2

    invoke-static {p0, p1}, Li7/d;->w(Li7/d;Landroid/content/Context;)V

    return-void
.end method

.method public static final synthetic h(Li7/d;)Landroid/app/Application;
    .registers 1

    iget-object p0, p0, Li7/d;->c:Landroid/app/Application;

    return-object p0
.end method

.method public static final synthetic i(Li7/d;)LI8/A;
    .registers 1

    iget-object p0, p0, Li7/d;->e:LI8/A;

    return-object p0
.end method

.method public static final synthetic j(Li7/d;Lx1/g;)Z
    .registers 2

    invoke-direct {p0, p1}, Li7/d;->o(Lx1/g;)Z

    move-result p0

    return p0
.end method

.method private final k()V
    .registers 7

    invoke-static {p0}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v0

    new-instance v3, Li7/d$b;

    const/4 v1, 0x0

    invoke-direct {v3, p0, v1}, Li7/d$b;-><init>(Li7/d;Lm8/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method

.method private final l(Z)V
    .registers 8

    invoke-static {p0}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v0

    invoke-static {}, LF8/b0;->b()LF8/I;

    move-result-object v1

    new-instance v3, Li7/d$c;

    const/4 v2, 0x0

    invoke-direct {v3, p0, p1, v2}, Li7/d$c;-><init>(Li7/d;ZLm8/e;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method

.method private final m()Z
    .registers 4

    invoke-static {}, Lh3/I;->a()Lh3/H;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.android.customization.module.ThemePickerInjector"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LK1/p;

    invoke-virtual {p0}, Landroidx/lifecycle/b;->e()Landroid/app/Application;

    move-result-object v1

    invoke-virtual {v0}, Lh3/V;->i()Lg3/v;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, LK1/p;->f0(Landroid/content/Context;Lg3/v;)LV1/a;

    move-result-object v0

    invoke-virtual {v0}, LV1/a;->c()LW1/a;

    move-result-object v0

    invoke-virtual {v0}, LW1/a;->a()Lx1/g;

    move-result-object v0

    invoke-direct {p0, v0}, Li7/d;->o(Lx1/g;)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method private final o(Lx1/g;)Z
    .registers 3

    invoke-virtual {p1}, Lx1/g;->f()Ljava/lang/Integer;

    move-result-object p0

    if-nez p0, :cond_7

    goto :goto_18

    :cond_7
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    const/4 v0, 0x7

    if-ne p0, v0, :cond_18

    invoke-virtual {p1}, Lx1/g;->b()I

    move-result p0

    const/16 p1, 0x64

    if-eq p0, p1, :cond_18

    const/4 p0, 0x1

    return p0

    :cond_18
    :goto_18
    const/4 p0, 0x0

    return p0
.end method

.method private static final s(Li7/d;Landroid/content/Context;)V
    .registers 5

    iget-boolean v0, p0, Li7/d;->h:Z

    if-eqz v0, :cond_5

    return-void

    :cond_5
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "android.intent.action.PACKAGE_REPLACED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "package"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addDataScheme(Ljava/lang/String;)V

    const-string v1, "com.nothing.launcher"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/IntentFilter;->addDataSchemeSpecificPart(Ljava/lang/String;I)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iget-object v1, p0, Li7/d;->g:Li7/d$d;

    invoke-virtual {p1, v1, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    const/4 p1, 0x1

    iput-boolean p1, p0, Li7/d;->h:Z

    return-void
.end method

.method private static final w(Li7/d;Landroid/content/Context;)V
    .registers 3

    iget-boolean v0, p0, Li7/d;->h:Z

    if-eqz v0, :cond_d

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iget-object v0, p0, Li7/d;->g:Li7/d$d;

    invoke-virtual {p1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    :cond_d
    const/4 p1, 0x0

    iput-boolean p1, p0, Li7/d;->h:Z

    return-void
.end method


# virtual methods
.method public final n()LI8/f;
    .registers 1

    iget-object p0, p0, Li7/d;->f:LI8/f;

    return-object p0
.end method

.method public final p()Ljava/lang/Boolean;
    .registers 2

    iget-object p0, p0, Li7/d;->d:Landroidx/lifecycle/Q;

    const-string v0, "key_show_dialog"

    invoke-virtual {p0, v0}, Landroidx/lifecycle/Q;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    return-object p0
.end method

.method public final q()Z
    .registers 3

    :try_start_0
    sget-object p0, Lcom/nothing/wallpaper/NTPickerApplication;->q:Lcom/nothing/wallpaper/NTPickerApplication$a;

    invoke-virtual {p0}, Lcom/nothing/wallpaper/NTPickerApplication$a;->a()Landroid/app/Application;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    const-string v0, "com.nothing.launcher"

    const/16 v1, 0x80

    invoke-virtual {p0, v0, v1}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object p0

    const-string v0, "getApplicationInfo(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    const-string v0, "com.nothing.launcher.support.reset"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result p0
    :try_end_1f
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_1f} :catch_20

    return p0

    :catch_20
    move-exception p0

    const-string v0, "NTResetToolbarButtonBinder"

    invoke-static {v0, p0}, Lcom/nothing/wallpaper/common/log/c;->h(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p0, 0x0

    return p0
.end method

.method public final r(Landroid/content/Context;)V
    .registers 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LF2/d;->d:LF2/i;

    new-instance v1, Li7/c;

    invoke-direct {v1, p0, p1}, Li7/c;-><init>(Li7/d;Landroid/content/Context;)V

    invoke-virtual {v0, v1}, LF2/i;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final t(Z)V
    .registers 2

    invoke-direct {p0, p1}, Li7/d;->l(Z)V

    invoke-direct {p0}, Li7/d;->m()Z

    move-result p1

    if-eqz p1, :cond_c

    invoke-direct {p0}, Li7/d;->k()V

    :cond_c
    return-void
.end method

.method public final u(Ljava/lang/Boolean;)V
    .registers 3

    iget-object p0, p0, Li7/d;->d:Landroidx/lifecycle/Q;

    const-string v0, "key_show_dialog"

    invoke-virtual {p0, v0, p1}, Landroidx/lifecycle/Q;->i(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final v(Landroid/content/Context;)V
    .registers 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LF2/d;->d:LF2/i;

    new-instance v1, Li7/b;

    invoke-direct {v1, p0, p1}, Li7/b;-><init>(Li7/d;Landroid/content/Context;)V

    invoke-virtual {v0, v1}, LF2/i;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
