.class final Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil;->d(Landroid/view/View;Lm8/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:Landroid/graphics/Bitmap;

.field final synthetic s:Landroid/view/View;


# direct methods
.method constructor <init>(Landroid/graphics/Bitmap;Landroid/view/View;Lm8/e;)V
    .registers 4

    iput-object p1, p0, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$b;->r:Landroid/graphics/Bitmap;

    iput-object p2, p0, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$b;->s:Landroid/view/View;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 4

    new-instance p1, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$b;

    iget-object v0, p0, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$b;->r:Landroid/graphics/Bitmap;

    iget-object p0, p0, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$b;->s:Landroid/view/View;

    invoke-direct {p1, v0, p0, p2}, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$b;-><init>(Landroid/graphics/Bitmap;Landroid/view/View;Lm8/e;)V

    return-object p1
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$b;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$b;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$b;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    iget v0, p0, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$b;->q:I

    if-nez v0, :cond_19

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    new-instance p1, Landroid/graphics/Canvas;

    iget-object v0, p0, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$b;->r:Landroid/graphics/Bitmap;

    invoke-direct {p1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    iget-object p0, p0, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$b;->s:Landroid/view/View;

    invoke-virtual {p0, p1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_19
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
