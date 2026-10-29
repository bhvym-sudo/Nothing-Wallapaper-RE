.class public abstract LG8/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LG8/g;

.field private static volatile choreographer:Landroid/view/Choreographer;


# direct methods
.method static constructor <clinit>()V
    .registers 4

    const/4 v0, 0x0

    :try_start_1
    sget-object v1, Lh8/q;->r:Lh8/q$a;

    new-instance v1, LG8/f;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v2, v3}, LG8/h;->a(Landroid/os/Looper;Z)Landroid/os/Handler;

    move-result-object v2

    const/4 v3, 0x2

    invoke-direct {v1, v2, v0, v3, v0}, LG8/f;-><init>(Landroid/os/Handler;Ljava/lang/String;ILkotlin/jvm/internal/h;)V

    invoke-static {v1}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_16
    .catchall {:try_start_1 .. :try_end_16} :catchall_17

    goto :goto_22

    :catchall_17
    move-exception v1

    sget-object v2, Lh8/q;->r:Lh8/q$a;

    invoke-static {v1}, Lh8/r;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    :goto_22
    invoke-static {v1}, Lh8/q;->f(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_29

    goto :goto_2a

    :cond_29
    move-object v0, v1

    :goto_2a
    check-cast v0, LG8/g;

    sput-object v0, LG8/h;->a:LG8/g;

    return-void
.end method

.method public static final a(Landroid/os/Looper;Z)Landroid/os/Handler;
    .registers 4

    if-eqz p1, :cond_21

    const-class p1, Landroid/os/Looper;

    filled-new-array {p1}, [Ljava/lang/Class;

    move-result-object p1

    const-class v0, Landroid/os/Handler;

    const-string v1, "createAsync"

    invoke-virtual {v0, v1, p1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    const/4 v0, 0x0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {p1, v0, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    const-string p1, "null cannot be cast to non-null type android.os.Handler"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Landroid/os/Handler;

    return-object p0

    :cond_21
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-object p1
.end method

.method public static final b(Landroid/os/Handler;Ljava/lang/String;)LG8/g;
    .registers 3

    new-instance v0, LG8/f;

    invoke-direct {v0, p0, p1}, LG8/f;-><init>(Landroid/os/Handler;Ljava/lang/String;)V

    return-object v0
.end method
