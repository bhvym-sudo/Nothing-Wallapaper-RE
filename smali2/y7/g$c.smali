.class final Ly7/g$c;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly7/g;-><init>(Landroid/content/Context;LF8/L;LF8/I;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field private synthetic r:Ljava/lang/Object;

.field final synthetic s:Ly7/g;


# direct methods
.method constructor <init>(Ly7/g;Lm8/e;)V
    .registers 3

    iput-object p1, p0, Ly7/g$c;->s:Ly7/g;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method

.method public static synthetic s(Ly7/g;Landroid/content/BroadcastReceiver;)Lh8/A;
    .registers 2

    invoke-static {p0, p1}, Ly7/g$c;->w(Ly7/g;Landroid/content/BroadcastReceiver;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic u(LH8/t;)V
    .registers 1

    invoke-static {p0}, Ly7/g$c;->y(LH8/t;)V

    return-void
.end method

.method private static final w(Ly7/g;Landroid/content/BroadcastReceiver;)Lh8/A;
    .registers 2

    invoke-static {p0, p1}, Ly7/g$c;->z(Ly7/g;Landroid/content/BroadcastReceiver;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private static final x(Ly7/g;Landroid/content/BroadcastReceiver;)V
    .registers 4

    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "android.intent.action.TIMEZONE_CHANGED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "android.app.action.NEXT_ALARM_CLOCK_CHANGED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    invoke-static {p0}, Ly7/g;->g(Ly7/g;)Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0, p1, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    return-void
.end method

.method private static final y(LH8/t;)V
    .registers 2

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p0, v0}, LH8/w;->p(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final z(Ly7/g;Landroid/content/BroadcastReceiver;)V
    .registers 2

    invoke-static {p0}, Ly7/g;->g(Ly7/g;)Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 4

    new-instance v0, Ly7/g$c;

    iget-object p0, p0, Ly7/g$c;->s:Ly7/g;

    invoke-direct {v0, p0, p2}, Ly7/g$c;-><init>(Ly7/g;Lm8/e;)V

    iput-object p1, v0, Ly7/g$c;->r:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, LH8/t;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Ly7/g$c;->v(LH8/t;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 7

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Ly7/g$c;->q:I

    const/4 v2, 0x1

    if-eqz v1, :cond_17

    if-ne v1, v2, :cond_f

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_3b

    :cond_f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_17
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Ly7/g$c;->r:Ljava/lang/Object;

    check-cast p1, LH8/t;

    new-instance v1, Ly7/g$c$a;

    invoke-direct {v1, p1}, Ly7/g$c$a;-><init>(LH8/t;)V

    invoke-static {p1}, Ly7/g$c;->y(LH8/t;)V

    iget-object v3, p0, Ly7/g$c;->s:Ly7/g;

    invoke-static {v3, v1}, Ly7/g$c;->x(Ly7/g;Landroid/content/BroadcastReceiver;)V

    iget-object v3, p0, Ly7/g$c;->s:Ly7/g;

    new-instance v4, Ly7/h;

    invoke-direct {v4, v3, v1}, Ly7/h;-><init>(Ly7/g;Landroid/content/BroadcastReceiver;)V

    iput v2, p0, Ly7/g$c;->q:I

    invoke-static {p1, v4, p0}, LH8/r;->a(LH8/t;Lv8/a;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_3b

    return-object v0

    :cond_3b
    :goto_3b
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public final v(LH8/t;Lm8/e;)Ljava/lang/Object;
    .registers 3

    invoke-virtual {p0, p1, p2}, Ly7/g$c;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Ly7/g$c;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Ly7/g$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
