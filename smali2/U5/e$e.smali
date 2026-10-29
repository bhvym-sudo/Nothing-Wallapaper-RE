.class final LU5/e$e;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU5/e;-><init>(Landroid/content/Context;LF8/L;LF8/I;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field private synthetic r:Ljava/lang/Object;

.field final synthetic s:LU5/e;


# direct methods
.method constructor <init>(LU5/e;Lm8/e;)V
    .registers 3

    iput-object p1, p0, LU5/e$e;->s:LU5/e;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method

.method public static synthetic s(Landroid/content/pm/LauncherApps;LU5/e$e$a;)Lh8/A;
    .registers 2

    invoke-static {p0, p1}, LU5/e$e;->w(Landroid/content/pm/LauncherApps;LU5/e$e$a;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic u(LH8/t;LU5/e;)V
    .registers 2

    invoke-static {p0, p1}, LU5/e$e;->x(LH8/t;LU5/e;)V

    return-void
.end method

.method private static final w(Landroid/content/pm/LauncherApps;LU5/e$e$a;)Lh8/A;
    .registers 2

    if-eqz p0, :cond_5

    invoke-virtual {p0, p1}, Landroid/content/pm/LauncherApps;->unregisterCallback(Landroid/content/pm/LauncherApps$Callback;)V

    :cond_5
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private static final x(LH8/t;LU5/e;)V
    .registers 8

    new-instance v3, LU5/e$e$b;

    const/4 v0, 0x0

    invoke-direct {v3, p0, p1, v0}, LU5/e$e$b;-><init>(LH8/t;LU5/e;Lm8/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 4

    new-instance v0, LU5/e$e;

    iget-object p0, p0, LU5/e$e;->s:LU5/e;

    invoke-direct {v0, p0, p2}, LU5/e$e;-><init>(LU5/e;Lm8/e;)V

    iput-object p1, v0, LU5/e$e;->r:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, LH8/t;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LU5/e$e;->v(LH8/t;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 8

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LU5/e$e;->q:I

    const/4 v2, 0x1

    if-eqz v1, :cond_17

    if-ne v1, v2, :cond_f

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_54

    :cond_f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_17
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LU5/e$e;->r:Ljava/lang/Object;

    check-cast p1, LH8/t;

    iget-object v1, p0, LU5/e$e;->s:LU5/e;

    invoke-static {v1}, LU5/e;->F(LU5/e;)Landroid/content/Context;

    move-result-object v1

    const-class v3, Landroid/content/pm/LauncherApps;

    invoke-virtual {v1, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/pm/LauncherApps;

    new-instance v3, LU5/e$e$a;

    iget-object v4, p0, LU5/e$e;->s:LU5/e;

    invoke-direct {v3, p1, v4}, LU5/e$e$a;-><init>(LH8/t;LU5/e;)V

    if-eqz v1, :cond_41

    new-instance v4, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v5

    invoke-direct {v4, v5}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-virtual {v1, v3, v4}, Landroid/content/pm/LauncherApps;->registerCallback(Landroid/content/pm/LauncherApps$Callback;Landroid/os/Handler;)V

    :cond_41
    iget-object v4, p0, LU5/e$e;->s:LU5/e;

    invoke-static {p1, v4}, LU5/e$e;->x(LH8/t;LU5/e;)V

    new-instance v4, LU5/f;

    invoke-direct {v4, v1, v3}, LU5/f;-><init>(Landroid/content/pm/LauncherApps;LU5/e$e$a;)V

    iput v2, p0, LU5/e$e;->q:I

    invoke-static {p1, v4, p0}, LH8/r;->a(LH8/t;Lv8/a;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_54

    return-object v0

    :cond_54
    :goto_54
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public final v(LH8/t;Lm8/e;)Ljava/lang/Object;
    .registers 3

    invoke-virtual {p0, p1, p2}, LU5/e$e;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LU5/e$e;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LU5/e$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
