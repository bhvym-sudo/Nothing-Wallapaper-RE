.class public final LJ6/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJ6/e$a;
    }
.end annotation


# instance fields
.field private final a:LF8/L;

.field private final b:Ljava/lang/String;

.field private final c:Lq6/b;

.field private d:Ljava/lang/Integer;

.field private volatile e:LF8/v;

.field private volatile f:LF8/x0;


# direct methods
.method public constructor <init>(LF8/L;)V
    .registers 3

    const-string v0, "vmScope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJ6/e;->a:LF8/L;

    const-string p1, "EditedStaticWallpaperCache"

    iput-object p1, p0, LJ6/e;->b:Ljava/lang/String;

    new-instance v0, Lq6/b;

    invoke-direct {v0, p1}, Lq6/b;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, LJ6/e;->c:Lq6/b;

    return-void
.end method

.method public static final synthetic a(LJ6/e;)Lq6/b;
    .registers 1

    iget-object p0, p0, LJ6/e;->c:Lq6/b;

    return-object p0
.end method

.method public static final synthetic b(LJ6/e;Ljava/lang/Integer;Lm8/e;)Ljava/lang/Object;
    .registers 3

    invoke-direct {p0, p1, p2}, LJ6/e;->h(Ljava/lang/Integer;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(LJ6/e;Ljava/lang/Integer;)V
    .registers 2

    iput-object p1, p0, LJ6/e;->d:Ljava/lang/Integer;

    return-void
.end method

.method private final d(LC6/i;)V
    .registers 10

    invoke-virtual {p1}, LC6/i;->hashCode()I

    move-result v0

    iget-object v1, p0, LJ6/e;->d:Ljava/lang/Integer;

    if-nez v1, :cond_9

    goto :goto_2f

    :cond_9
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, v0, :cond_2f

    iget-object v1, p0, LJ6/e;->e:LF8/v;

    if-eqz v1, :cond_2f

    iget-object p0, p0, LJ6/e;->c:Lq6/b;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "assignCroppedBitmap: hit cache "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", please reuse later"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lq6/b;->f(Ljava/lang/String;)V

    return-void

    :cond_2f
    :goto_2f
    invoke-virtual {p0}, LJ6/e;->e()V

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, LJ6/e;->d:Ljava/lang/Integer;

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {v1, v0, v1}, LF8/x;->b(LF8/x0;ILjava/lang/Object;)LF8/v;

    move-result-object v0

    iput-object v0, p0, LJ6/e;->e:LF8/v;

    iget-object v2, p0, LJ6/e;->a:LF8/L;

    invoke-static {}, LF8/b0;->b()LF8/I;

    move-result-object v3

    new-instance v5, LJ6/e$b;

    invoke-direct {v5, p0, p1, v0, v1}, LJ6/e$b;-><init>(LJ6/e;LC6/i;LF8/v;Lm8/e;)V

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    move-result-object p1

    iput-object p1, p0, LJ6/e;->f:LF8/x0;

    return-void
.end method

.method private final h(Ljava/lang/Integer;Lm8/e;)Ljava/lang/Object;
    .registers 6

    invoke-static {}, LF8/b0;->c()LF8/H0;

    move-result-object v0

    new-instance v1, LJ6/e$d;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, LJ6/e$d;-><init>(LJ6/e;Ljava/lang/Integer;Lm8/e;)V

    invoke-static {v0, v1, p2}, LF8/g;->g(Lm8/i;Lv8/p;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_15

    return-object p0

    :cond_15
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method


# virtual methods
.method public final e()V
    .registers 4

    iget-object v0, p0, LJ6/e;->f:LF8/x0;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_9

    invoke-static {v0, v2, v1, v2}, LF8/x0$a;->a(LF8/x0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_9
    iput-object v2, p0, LJ6/e;->f:LF8/x0;

    iget-object v0, p0, LJ6/e;->e:LF8/v;

    if-eqz v0, :cond_12

    invoke-static {v0, v2, v1, v2}, LF8/x0$a;->a(LF8/x0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_12
    iput-object v2, p0, LJ6/e;->e:LF8/v;

    iput-object v2, p0, LJ6/e;->d:Ljava/lang/Integer;

    return-void
.end method

.method public final f()LJ6/e$a;
    .registers 5

    iget-object v0, p0, LJ6/e;->e:LF8/v;

    if-nez v0, :cond_7

    sget-object p0, LJ6/e$a$c;->a:LJ6/e$a$c;

    return-object p0

    :cond_7
    :try_start_7
    new-instance v1, LJ6/e$c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v0, v2}, LJ6/e$c;-><init>(LJ6/e;LF8/v;Lm8/e;)V

    const/4 v0, 0x1

    invoke-static {v2, v1, v0, v2}, LF8/g;->f(Lm8/i;Lv8/p;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LJ6/e$a;
    :try_end_14
    .catchall {:try_start_7 .. :try_end_14} :catchall_15

    return-object v0

    :catchall_15
    move-exception v0

    iget-object p0, p0, LJ6/e;->c:Lq6/b;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getOutputBlocking: stopped, error is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lq6/b;->e(Ljava/lang/String;)V

    new-instance p0, LJ6/e$a$b;

    invoke-direct {p0, v0}, LJ6/e$a$b;-><init>(Ljava/lang/Throwable;)V

    return-object p0
.end method

.method public final g()Z
    .registers 2

    iget-object v0, p0, LJ6/e;->d:Ljava/lang/Integer;

    if-eqz v0, :cond_a

    iget-object p0, p0, LJ6/e;->e:LF8/v;

    if-eqz p0, :cond_a

    const/4 p0, 0x1

    return p0

    :cond_a
    const/4 p0, 0x0

    return p0
.end method

.method public final i(ZZLg3/x;LD6/f;Lv8/p;Lm8/e;)Ljava/lang/Object;
    .registers 12

    instance-of v0, p6, LJ6/e$e;

    if-eqz v0, :cond_13

    move-object v0, p6

    check-cast v0, LJ6/e$e;

    iget v1, v0, LJ6/e$e;->t:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_13

    sub-int/2addr v1, v2

    iput v1, v0, LJ6/e$e;->t:I

    goto :goto_18

    :cond_13
    new-instance v0, LJ6/e$e;

    invoke-direct {v0, p0, p6}, LJ6/e$e;-><init>(LJ6/e;Lm8/e;)V

    :goto_18
    iget-object p6, v0, LJ6/e$e;->r:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LJ6/e$e;->t:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_36

    if-ne v2, v4, :cond_2e

    iget-object p0, v0, LJ6/e$e;->q:Ljava/lang/Object;

    check-cast p0, LJ6/e;

    invoke-static {p6}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_5b

    :cond_2e
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_36
    invoke-static {p6}, Lh8/r;->b(Ljava/lang/Object;)V

    if-eqz p2, :cond_40

    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0

    :cond_40
    invoke-static {p3}, LG6/e;->s(Lg3/x;)Z

    move-result p2

    if-eqz p2, :cond_7d

    instance-of p2, p4, LD6/e;

    if-eqz p2, :cond_7d

    if-eqz p1, :cond_4f

    sget-object p1, LC6/e$b;->c:LC6/e$b;

    goto :goto_50

    :cond_4f
    const/4 p1, 0x0

    :goto_50
    iput-object p0, v0, LJ6/e$e;->q:Ljava/lang/Object;

    iput v4, v0, LJ6/e$e;->t:I

    invoke-interface {p5, p1, v0}, Lv8/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p6

    if-ne p6, v1, :cond_5b

    return-object v1

    :cond_5b
    :goto_5b
    check-cast p6, Lh8/u;

    if-nez p6, :cond_67

    iget-object p0, p0, LJ6/e;->c:Lq6/b;

    const-string p1, "start cache but buildEffectInfo return null."

    invoke-virtual {p0, p1}, Lq6/b;->e(Ljava/lang/String;)V

    goto :goto_7d

    :cond_67
    invoke-virtual {p6}, Lh8/u;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LC6/g;

    invoke-virtual {p6}, Lh8/u;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LC6/i;

    invoke-virtual {p6}, Lh8/u;->c()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/app/WallpaperColors;

    invoke-direct {p0, p1}, LJ6/e;->d(LC6/i;)V

    move v3, v4

    :cond_7d
    :goto_7d
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method
