.class public final LD6/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD6/f;


# instance fields
.field private final q:Lq6/b;

.field private final r:LF8/L;

.field private final s:Ljava/util/concurrent/Future;

.field private final t:LI8/A;

.field private final u:LI8/f;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lg3/x;)V
    .registers 11

    const-string v0, "appContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wallpaper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lq6/b;

    invoke-direct {v0, p0}, Lq6/b;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, LD6/c;->q:Lq6/b;

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {v1, v0, v1}, LF8/T0;->b(LF8/x0;ILjava/lang/Object;)LF8/y;

    move-result-object v0

    invoke-static {}, LF8/b0;->b()LF8/I;

    move-result-object v2

    invoke-interface {v0, v2}, Lm8/i;->z(Lm8/i;)Lm8/i;

    move-result-object v0

    invoke-static {v0}, LF8/M;->a(Lm8/i;)LF8/L;

    move-result-object v2

    iput-object v2, p0, LD6/c;->r:LF8/L;

    invoke-virtual {p2, p1}, Lg3/x;->b(Landroid/content/Context;)Ljava/util/concurrent/Future;

    move-result-object p1

    iput-object p1, p0, LD6/c;->s:Ljava/util/concurrent/Future;

    invoke-static {}, LG6/h;->a()Landroid/app/WallpaperColors;

    move-result-object p1

    invoke-static {p1}, LI8/Q;->a(Ljava/lang/Object;)LI8/A;

    move-result-object p1

    iput-object p1, p0, LD6/c;->t:LI8/A;

    iput-object p1, p0, LD6/c;->u:LI8/f;

    new-instance v5, LD6/c$a;

    invoke-direct {v5, p0, v1}, LD6/c$a;-><init>(LD6/c;Lm8/e;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method

.method public static final synthetic a(LD6/c;)Ljava/util/concurrent/Future;
    .registers 1

    iget-object p0, p0, LD6/c;->s:Ljava/util/concurrent/Future;

    return-object p0
.end method

.method public static final synthetic b(LD6/c;)Lq6/b;
    .registers 1

    iget-object p0, p0, LD6/c;->q:Lq6/b;

    return-object p0
.end method

.method public static final synthetic f(LD6/c;)LI8/A;
    .registers 1

    iget-object p0, p0, LD6/c;->t:LI8/A;

    return-object p0
.end method


# virtual methods
.method public S()LI8/f;
    .registers 1

    iget-object p0, p0, LD6/c;->u:LI8/f;

    return-object p0
.end method

.method public close()V
    .registers 4

    iget-object v0, p0, LD6/c;->r:LF8/L;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, LF8/M;->d(LF8/L;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    iget-object p0, p0, LD6/c;->s:Ljava/util/concurrent/Future;

    invoke-interface {p0, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    return-void
.end method
