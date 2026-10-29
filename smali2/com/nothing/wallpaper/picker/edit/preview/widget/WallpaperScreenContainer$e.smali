.class final Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$e;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->A(Lg3/x;Lm8/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;

.field final synthetic s:Ljava/util/concurrent/Future;


# direct methods
.method constructor <init>(Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;Ljava/util/concurrent/Future;Lm8/e;)V
    .registers 4

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$e;->r:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;

    iput-object p2, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$e;->s:Ljava/util/concurrent/Future;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 4

    new-instance p1, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$e;

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$e;->r:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$e;->s:Ljava/util/concurrent/Future;

    invoke-direct {p1, v0, p0, p2}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$e;-><init>(Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;Ljava/util/concurrent/Future;Lm8/e;)V

    return-object p1
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$e;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$e;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$e;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    iget v0, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$e;->q:I

    if-nez v0, :cond_35

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$e;->r:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$e;->s:Ljava/util/concurrent/Future;

    if-eqz v0, :cond_1d

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg3/x$a;

    if-eqz v0, :cond_1d

    invoke-virtual {v0}, Lg3/x$a;->b()Landroid/app/WallpaperColors;

    move-result-object v0

    goto :goto_1e

    :cond_1d
    const/4 v0, 0x0

    :goto_1e
    invoke-static {p1, v0}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->p(Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;Landroid/app/WallpaperColors;)V

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$e;->r:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;

    invoke-static {p1}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->j(Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;)Li3/M0;

    move-result-object p1

    if-eqz p1, :cond_32

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$e;->r:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->h(Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;)Landroid/app/WallpaperColors;

    move-result-object p0

    invoke-virtual {p1, p0}, Li3/M0;->i(Landroid/app/WallpaperColors;)V

    :cond_32
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_35
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
