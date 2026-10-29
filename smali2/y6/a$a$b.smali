.class final Ly6/a$a$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly6/a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:Landroid/content/Context;

.field final synthetic s:Lh3/W;

.field final synthetic t:J


# direct methods
.method constructor <init>(Landroid/content/Context;Lh3/W;JLm8/e;)V
    .registers 6

    iput-object p1, p0, Ly6/a$a$b;->r:Landroid/content/Context;

    iput-object p2, p0, Ly6/a$a$b;->s:Lh3/W;

    iput-wide p3, p0, Ly6/a$a$b;->t:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 9

    new-instance v0, Ly6/a$a$b;

    iget-object v1, p0, Ly6/a$a$b;->r:Landroid/content/Context;

    iget-object v2, p0, Ly6/a$a$b;->s:Lh3/W;

    iget-wide v3, p0, Ly6/a$a$b;->t:J

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Ly6/a$a$b;-><init>(Landroid/content/Context;Lh3/W;JLm8/e;)V

    return-object v0
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, Ly6/a$a$b;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Ly6/a$a$b;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Ly6/a$a$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Ly6/a$a$b;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 12

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    iget v0, p0, Ly6/a$a$b;->q:I

    if-nez v0, :cond_a1

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    invoke-static {}, Ly6/a;->a()Lq6/b;

    move-result-object p1

    const-string v0, "runCleanTask start clean blur dirty files"

    invoke-virtual {p1, v0}, Lq6/b;->a(Ljava/lang/String;)V

    new-instance p1, LA6/c;

    iget-object v0, p0, Ly6/a$a$b;->r:Landroid/content/Context;

    invoke-direct {p1, v0}, LA6/c;-><init>(Landroid/content/Context;)V

    iget-object v0, p0, Ly6/a$a$b;->s:Lh3/W;

    iget-object v1, p0, Ly6/a$a$b;->r:Landroid/content/Context;

    iget-wide v2, p0, Ly6/a$a$b;->t:J

    :try_start_20
    invoke-interface {v0}, Lh3/W;->R()Ljava/lang/String;

    move-result-object p0

    sget-object v0, LC6/g;->e:LC6/g$a;

    invoke-virtual {v0, p0}, LC6/g$a;->a(Ljava/lang/String;)LC6/g;

    move-result-object v0

    sget-object v4, Lq5/v;->a:Lq5/v;

    invoke-virtual {v4, v1}, Lq5/v;->d(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v5

    const-string v6, "final_image_path"

    const/4 v7, 0x0

    invoke-interface {v5, v6, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Ly6/a;->a()Lq6/b;

    move-result-object v6

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "runCleanTask blurInfo: homeLiveEffectInfo = "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " \nblurSp imagePath = "

    invoke-virtual {v8, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v6, p0}, Lq6/b;->d(Ljava/lang/String;)V

    const/4 p0, 0x0

    if-eqz v5, :cond_90

    invoke-virtual {p1, v5}, LA6/c;->P0(Ljava/lang/String;)V

    if-eqz v0, :cond_6e

    invoke-virtual {p1}, LA6/c;->b0()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0}, LC6/g;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    goto :goto_6e

    :catchall_6c
    move-exception p0

    goto :goto_9b

    :cond_6e
    :goto_6e
    if-nez p0, :cond_90

    invoke-static {}, Ly6/a;->a()Lq6/b;

    move-result-object v0

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "clear blur final info for "

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "."

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Lq6/b;->d(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Lq5/v;->a(Landroid/content/Context;)V

    :cond_90
    invoke-virtual {p1, p0, v2, v3}, LA6/c;->G(ZJ)V

    sget-object p0, Lh8/A;->a:Lh8/A;
    :try_end_95
    .catchall {:try_start_20 .. :try_end_95} :catchall_6c

    invoke-static {p1, v7}, Lt8/a;->a(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :goto_9b
    :try_start_9b
    throw p0
    :try_end_9c
    .catchall {:try_start_9b .. :try_end_9c} :catchall_9c

    :catchall_9c
    move-exception v0

    invoke-static {p1, p0}, Lt8/a;->a(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw v0

    :cond_a1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
