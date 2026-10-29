.class final LP6/a$c$a$a$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP6/a$c$a$a;->a(Lg3/x;Lg3/x;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:Lg3/v;

.field final synthetic s:LP6/a;

.field final synthetic t:Landroid/app/WallpaperManager;


# direct methods
.method constructor <init>(Lg3/v;LP6/a;Landroid/app/WallpaperManager;Lm8/e;)V
    .registers 5

    iput-object p1, p0, LP6/a$c$a$a$a;->r:Lg3/v;

    iput-object p2, p0, LP6/a$c$a$a$a;->s:LP6/a;

    iput-object p3, p0, LP6/a$c$a$a$a;->t:Landroid/app/WallpaperManager;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 5

    new-instance p1, LP6/a$c$a$a$a;

    iget-object v0, p0, LP6/a$c$a$a$a;->r:Lg3/v;

    iget-object v1, p0, LP6/a$c$a$a$a;->s:LP6/a;

    iget-object p0, p0, LP6/a$c$a$a$a;->t:Landroid/app/WallpaperManager;

    invoke-direct {p1, v0, v1, p0, p2}, LP6/a$c$a$a$a;-><init>(Lg3/v;LP6/a;Landroid/app/WallpaperManager;Lm8/e;)V

    return-object p1
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, LP6/a$c$a$a$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LP6/a$c$a$a$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LP6/a$c$a$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LP6/a$c$a$a$a;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 8

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LP6/a$c$a$a$a;->q:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_1e

    if-eq v1, v3, :cond_1a

    if-ne v1, v2, :cond_12

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_65

    :cond_12
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1a
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_43

    :cond_1e
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LP6/a$c$a$a$a;->r:Lg3/v;

    invoke-virtual {p1}, Lg3/v;->e()LI8/O;

    move-result-object p1

    invoke-interface {p1}, LI8/O;->getValue()Ljava/lang/Object;

    move-result-object p1

    instance-of p1, p1, Lg3/s$b;

    if-eqz p1, :cond_43

    iget-object p1, p0, LP6/a$c$a$a$a;->s:LP6/a;

    iget-object v1, p0, LP6/a$c$a$a$a;->t:Landroid/app/WallpaperManager;

    invoke-static {v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget-object v4, p0, LP6/a$c$a$a$a;->r:Lg3/v;

    sget-object v5, Lh3/d$a;->r:Lh3/d$a;

    iput v3, p0, LP6/a$c$a$a$a;->q:I

    invoke-virtual {p1, v1, v4, v5, p0}, LP6/a;->f(Landroid/app/WallpaperManager;Lg3/v;Lh3/d$a;Lm8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_43

    goto :goto_64

    :cond_43
    :goto_43
    iget-object p1, p0, LP6/a$c$a$a$a;->r:Lg3/v;

    invoke-virtual {p1}, Lg3/v;->f()LI8/O;

    move-result-object p1

    invoke-interface {p1}, LI8/O;->getValue()Ljava/lang/Object;

    move-result-object p1

    instance-of p1, p1, Lg3/s$b;

    if-eqz p1, :cond_65

    iget-object p1, p0, LP6/a$c$a$a$a;->s:LP6/a;

    iget-object v1, p0, LP6/a$c$a$a$a;->t:Landroid/app/WallpaperManager;

    invoke-static {v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget-object v3, p0, LP6/a$c$a$a$a;->r:Lg3/v;

    sget-object v4, Lh3/d$a;->q:Lh3/d$a;

    iput v2, p0, LP6/a$c$a$a$a;->q:I

    invoke-virtual {p1, v1, v3, v4, p0}, LP6/a;->f(Landroid/app/WallpaperManager;Lg3/v;Lh3/d$a;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_65

    :goto_64
    return-object v0

    :cond_65
    :goto_65
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
