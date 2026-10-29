.class final Lq7/l$b$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq7/l$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:Lq7/l;


# direct methods
.method constructor <init>(Lq7/l;Lm8/e;)V
    .registers 3

    iput-object p1, p0, Lq7/l$b$a;->r:Lq7/l;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 3

    new-instance p1, Lq7/l$b$a;

    iget-object p0, p0, Lq7/l$b$a;->r:Lq7/l;

    invoke-direct {p1, p0, p2}, Lq7/l$b$a;-><init>(Lq7/l;Lm8/e;)V

    return-object p1
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, Lq7/l$b$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Lq7/l$b$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Lq7/l$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Lq7/l$b$a;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 6

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lq7/l$b$a;->q:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_1e

    if-eq v1, v3, :cond_1a

    if-ne v1, v2, :cond_12

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_5a

    :cond_12
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1a
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_40

    :cond_1e
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lq7/l$b$a;->r:Lq7/l;

    invoke-static {p1}, Lq7/l;->K0(Lq7/l;)Ls7/a;

    move-result-object p1

    invoke-virtual {p1}, Ls7/a;->t()Z

    move-result p1

    if-eqz p1, :cond_43

    iget-object p1, p0, Lq7/l$b$a;->r:Lq7/l;

    invoke-static {p1}, Lq7/l;->H0(Lq7/l;)Lj7/j;

    move-result-object p1

    invoke-virtual {p1}, Lj7/j;->n0()LI8/f;

    move-result-object p1

    iput v3, p0, Lq7/l$b$a;->q:I

    invoke-static {p1, p0}, LI8/h;->x(LI8/f;Lm8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_40

    goto :goto_59

    :cond_40
    :goto_40
    check-cast p1, Landroid/graphics/Bitmap;

    goto :goto_5c

    :cond_43
    iget-object p1, p0, Lq7/l$b$a;->r:Lq7/l;

    invoke-static {p1}, Lq7/l;->H0(Lq7/l;)Lj7/j;

    move-result-object p1

    invoke-virtual {p1}, Lj7/j;->w0()LI8/f;

    move-result-object p1

    invoke-static {p1}, LI8/h;->w(LI8/f;)LI8/f;

    move-result-object p1

    iput v2, p0, Lq7/l$b$a;->q:I

    invoke-static {p1, p0}, LI8/h;->x(LI8/f;Lm8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5a

    :goto_59
    return-object v0

    :cond_5a
    :goto_5a
    check-cast p1, Landroid/graphics/Bitmap;

    :goto_5c
    iget-object v0, p0, Lq7/l$b$a;->r:Lq7/l;

    invoke-static {v0}, Lq7/l;->J0(Lq7/l;)Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;

    move-result-object v0

    if-eqz v0, :cond_67

    invoke-virtual {v0, p1}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->J(Landroid/graphics/Bitmap;)V

    :cond_67
    iget-object p0, p0, Lq7/l$b$a;->r:Lq7/l;

    invoke-static {p0}, Lq7/l;->I0(Lq7/l;)Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;

    move-result-object p0

    if-eqz p0, :cond_72

    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->J(Landroid/graphics/Bitmap;)V

    :cond_72
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
