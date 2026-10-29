.class final Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$b$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;

.field final synthetic s:LH3/q;

.field final synthetic t:Landroid/view/SurfaceView;


# direct methods
.method constructor <init>(Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;LH3/q;Landroid/view/SurfaceView;Lm8/e;)V
    .registers 5

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$b$a;->r:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;

    iput-object p2, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$b$a;->s:LH3/q;

    iput-object p3, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$b$a;->t:Landroid/view/SurfaceView;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 5

    new-instance p1, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$b$a;

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$b$a;->r:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;

    iget-object v1, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$b$a;->s:LH3/q;

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$b$a;->t:Landroid/view/SurfaceView;

    invoke-direct {p1, v0, v1, p0, p2}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$b$a;-><init>(Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;LH3/q;Landroid/view/SurfaceView;Lm8/e;)V

    return-object p1
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$b$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$b$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$b$a;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 6

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    iget v0, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$b$a;->q:I

    if-nez v0, :cond_55

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$b$a;->r:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;

    new-instance v0, Li3/M0;

    invoke-static {p1}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->n(Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;)Landroid/view/SurfaceView;

    move-result-object v1

    iget-object v2, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$b$a;->s:LH3/q;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Li3/M0;-><init>(Landroid/view/SurfaceView;LH3/q;Z)V

    invoke-static {p1, v0}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->q(Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;Li3/M0;)V

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$b$a;->r:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;

    invoke-static {p1}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->j(Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;)Li3/M0;

    move-result-object p1

    if-eqz p1, :cond_27

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Li3/M0;->i(Landroid/app/WallpaperColors;)V

    :cond_27
    iget-object p1, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$b$a;->t:Landroid/view/SurfaceView;

    invoke-virtual {p1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object p1

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$b$a;->r:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;

    invoke-static {v0}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->j(Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;)Li3/M0;

    move-result-object v0

    invoke-interface {p1, v0}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$b$a;->t:Landroid/view/SurfaceView;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/view/SurfaceView;->setZOrderMediaOverlay(Z)V

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$b$a;->r:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;

    invoke-static {p1}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->m(Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;)Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;

    move-result-object p1

    if-eqz p1, :cond_47

    invoke-virtual {p1}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;->c()V

    :cond_47
    iget-object p0, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$b$a;->r:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->l(Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;)Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;

    move-result-object p0

    if-eqz p0, :cond_52

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;->c()V

    :cond_52
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_55
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
