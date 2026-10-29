.class final LG7/v$d;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG7/v;->p(Landroidx/lifecycle/x;Landroid/app/WallpaperManager;Lg3/v;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:Landroid/app/WallpaperManager;

.field final synthetic s:Lg3/v;


# direct methods
.method constructor <init>(Landroid/app/WallpaperManager;Lg3/v;Lm8/e;)V
    .registers 4

    iput-object p1, p0, LG7/v$d;->r:Landroid/app/WallpaperManager;

    iput-object p2, p0, LG7/v$d;->s:Lg3/v;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 4

    new-instance p1, LG7/v$d;

    iget-object v0, p0, LG7/v$d;->r:Landroid/app/WallpaperManager;

    iget-object p0, p0, LG7/v$d;->s:Lg3/v;

    invoke-direct {p1, v0, p0, p2}, LG7/v$d;-><init>(Landroid/app/WallpaperManager;Lg3/v;Lm8/e;)V

    return-object p1
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, LG7/v$d;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LG7/v$d;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LG7/v$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LG7/v$d;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 8

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LG7/v$d;->q:I

    const/4 v2, 0x1

    if-eqz v1, :cond_17

    if-ne v1, v2, :cond_f

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_36

    :cond_f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_17
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LG7/v$d;->r:Landroid/app/WallpaperManager;

    const/4 v1, 0x2

    invoke-virtual {p1, v1}, Landroid/app/WallpaperManager;->getWallpaperColors(I)Landroid/app/WallpaperColors;

    move-result-object p1

    invoke-static {}, LF8/b0;->c()LF8/H0;

    move-result-object v1

    new-instance v3, LG7/v$d$a;

    iget-object v4, p0, LG7/v$d;->s:Lg3/v;

    const/4 v5, 0x0

    invoke-direct {v3, v4, p1, v5}, LG7/v$d$a;-><init>(Lg3/v;Landroid/app/WallpaperColors;Lm8/e;)V

    iput v2, p0, LG7/v$d;->q:I

    invoke-static {v1, v3, p0}, LF8/g;->g(Lm8/i;Lv8/p;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_36

    return-object v0

    :cond_36
    :goto_36
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
