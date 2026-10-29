.class final LK8/k$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LK8/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field private q:Ljava/lang/Runnable;

.field final synthetic r:LK8/k;


# direct methods
.method public constructor <init>(LK8/k;Ljava/lang/Runnable;)V
    .registers 3

    iput-object p1, p0, LK8/k$a;->r:LK8/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LK8/k$a;->q:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public run()V
    .registers 4

    const/4 v0, 0x0

    :cond_1
    :try_start_1
    iget-object v1, p0, LK8/k$a;->q:Ljava/lang/Runnable;

    invoke-interface {v1}, Ljava/lang/Runnable;->run()V
    :try_end_6
    .catchall {:try_start_1 .. :try_end_6} :catchall_7

    goto :goto_d

    :catchall_7
    move-exception v1

    sget-object v2, Lm8/j;->q:Lm8/j;

    invoke-static {v2, v1}, LF8/K;->a(Lm8/i;Ljava/lang/Throwable;)V

    :goto_d
    iget-object v1, p0, LK8/k$a;->r:LK8/k;

    invoke-static {v1}, LK8/k;->m1(LK8/k;)Ljava/lang/Runnable;

    move-result-object v1

    if-nez v1, :cond_16

    return-void

    :cond_16
    iput-object v1, p0, LK8/k$a;->q:Ljava/lang/Runnable;

    add-int/lit8 v0, v0, 0x1

    const/16 v1, 0x10

    if-lt v0, v1, :cond_1

    iget-object v1, p0, LK8/k$a;->r:LK8/k;

    invoke-static {v1}, LK8/k;->l1(LK8/k;)LF8/I;

    move-result-object v1

    iget-object v2, p0, LK8/k$a;->r:LK8/k;

    invoke-static {v1, v2}, LK8/i;->d(LF8/I;Lm8/i;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v0, p0, LK8/k$a;->r:LK8/k;

    invoke-static {v0}, LK8/k;->l1(LK8/k;)LF8/I;

    move-result-object v0

    iget-object v1, p0, LK8/k$a;->r:LK8/k;

    invoke-static {v0, v1, p0}, LK8/i;->c(LF8/I;Lm8/i;Ljava/lang/Runnable;)V

    return-void
.end method
