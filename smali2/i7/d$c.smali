.class final Li7/d$c;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li7/d;->l(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:Li7/d;

.field final synthetic s:Z


# direct methods
.method constructor <init>(Li7/d;ZLm8/e;)V
    .registers 4

    iput-object p1, p0, Li7/d$c;->r:Li7/d;

    iput-boolean p2, p0, Li7/d$c;->s:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 4

    new-instance p1, Li7/d$c;

    iget-object v0, p0, Li7/d$c;->r:Li7/d;

    iget-boolean p0, p0, Li7/d$c;->s:Z

    invoke-direct {p1, v0, p0, p2}, Li7/d$c;-><init>(Li7/d;ZLm8/e;)V

    return-object p1
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, Li7/d$c;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Li7/d$c;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Li7/d$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Li7/d$c;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    iget v0, p0, Li7/d$c;->q:I

    if-nez v0, :cond_44

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    const-string p1, "content://com.nothing.launcher.share"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    iget-object v0, p0, Li7/d$c;->r:Li7/d;

    invoke-static {v0}, Li7/d;->h(Li7/d;)Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/ContentResolver;->acquireContentProviderClient(Landroid/net/Uri;)Landroid/content/ContentProviderClient;

    move-result-object p1

    if-eqz p1, :cond_41

    iget-boolean p0, p0, Li7/d$c;->s:Z

    :try_start_22
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "reset_workspace_keep"

    invoke-virtual {v0, v1, p0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string p0, "reset_workspace"

    const-string v1, ""

    invoke-virtual {p1, p0, v1, v0}, Landroid/content/ContentProviderClient;->call(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    sget-object p0, Lh8/A;->a:Lh8/A;
    :try_end_35
    .catchall {:try_start_22 .. :try_end_35} :catchall_3a

    const/4 p0, 0x0

    invoke-static {p1, p0}, Lt8/a;->a(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    goto :goto_41

    :catchall_3a
    move-exception p0

    :try_start_3b
    throw p0
    :try_end_3c
    .catchall {:try_start_3b .. :try_end_3c} :catchall_3c

    :catchall_3c
    move-exception v0

    invoke-static {p1, p0}, Lt8/a;->a(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw v0

    :cond_41
    :goto_41
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_44
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
