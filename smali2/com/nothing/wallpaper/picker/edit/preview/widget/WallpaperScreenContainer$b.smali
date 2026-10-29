.class final Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->r(Landroidx/lifecycle/x;LH3/q;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:Ljava/lang/Object;

.field r:Ljava/lang/Object;

.field s:I

.field final synthetic t:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;

.field final synthetic u:Landroidx/lifecycle/x;

.field final synthetic v:LH3/q;


# direct methods
.method constructor <init>(Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;Landroidx/lifecycle/x;LH3/q;Lm8/e;)V
    .registers 5

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$b;->t:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;

    iput-object p2, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$b;->u:Landroidx/lifecycle/x;

    iput-object p3, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$b;->v:LH3/q;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 5

    new-instance p1, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$b;

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$b;->t:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;

    iget-object v1, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$b;->u:Landroidx/lifecycle/x;

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$b;->v:LH3/q;

    invoke-direct {p1, v0, v1, p0, p2}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$b;-><init>(Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;Landroidx/lifecycle/x;LH3/q;Lm8/e;)V

    return-object p1
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$b;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$b;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$b;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 10

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$b;->s:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1f

    if-ne v1, v2, :cond_17

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$b;->r:Ljava/lang/Object;

    check-cast v0, Landroid/view/SurfaceView;

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$b;->q:Ljava/lang/Object;

    check-cast p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_47

    :cond_17
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1f
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$b;->t:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;

    invoke-static {p1}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->n(Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;)Landroid/view/SurfaceView;

    move-result-object p1

    if-eqz p1, :cond_6d

    iget-object v1, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$b;->u:Landroidx/lifecycle/x;

    iget-object v3, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$b;->t:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;

    iget-object v4, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$b;->v:LH3/q;

    sget-object v5, Landroidx/lifecycle/q$b;->s:Landroidx/lifecycle/q$b;

    new-instance v6, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$b$a;

    const/4 v7, 0x0

    invoke-direct {v6, v3, v4, p1, v7}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$b$a;-><init>(Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;LH3/q;Landroid/view/SurfaceView;Lm8/e;)V

    iput-object v3, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$b;->q:Ljava/lang/Object;

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$b;->r:Ljava/lang/Object;

    iput v2, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$b;->s:I

    invoke-static {v1, v5, v6, p0}, Landroidx/lifecycle/N;->b(Landroidx/lifecycle/x;Landroidx/lifecycle/q$b;Lv8/p;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_45

    return-object v0

    :cond_45
    move-object v0, p1

    move-object p0, v3

    :goto_47
    invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object p1

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->j(Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;)Li3/M0;

    move-result-object v0

    invoke-interface {p1, v0}, Landroid/view/SurfaceHolder;->removeCallback(Landroid/view/SurfaceHolder$Callback;)V

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->j(Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;)Li3/M0;

    move-result-object p1

    if-eqz p1, :cond_5b

    invoke-virtual {p1}, Li3/M0;->b()V

    :cond_5b
    invoke-static {p0}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->m(Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;)Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;

    move-result-object p1

    if-eqz p1, :cond_64

    invoke-virtual {p1}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;->e()V

    :cond_64
    invoke-static {p0}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->l(Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;)Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;

    move-result-object p0

    if-eqz p0, :cond_6d

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;->e()V

    :cond_6d
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
