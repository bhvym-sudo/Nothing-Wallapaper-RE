.class final Lo7/g$e;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo7/g;-><init>(Landroid/content/Context;Lg3/x;Lp7/a;Lx6/k;LD6/e;Landroidx/lifecycle/Q;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field synthetic r:Ljava/lang/Object;

.field final synthetic s:Lo7/g;


# direct methods
.method constructor <init>(Lo7/g;Lm8/e;)V
    .registers 3

    iput-object p1, p0, Lo7/g$e;->s:Lo7/g;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    check-cast p1, Landroid/graphics/Bitmap;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    check-cast p3, Lm8/e;

    invoke-virtual {p0, p1, p2, p3}, Lo7/g$e;->s(Landroid/graphics/Bitmap;ZLm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 5

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    iget v0, p0, Lo7/g$e;->q:I

    if-nez v0, :cond_27

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lo7/g$e;->r:Ljava/lang/Object;

    check-cast p1, Landroid/graphics/Bitmap;

    new-instance v0, Landroid/graphics/Point;

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    invoke-direct {v0, v1, v2}, Landroid/graphics/Point;-><init>(II)V

    new-instance v1, Lh8/u;

    iget-object p0, p0, Lo7/g$e;->s:Lo7/g;

    invoke-static {p0, p1}, Lo7/g;->C(Lo7/g;Landroid/graphics/Bitmap;)Lcom/davemorrissey/labs/subscaleview/ImageSource;

    move-result-object p0

    invoke-direct {v1, p0, p1, v0}, Lh8/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1

    :cond_27
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final s(Landroid/graphics/Bitmap;ZLm8/e;)Ljava/lang/Object;
    .registers 4

    new-instance p2, Lo7/g$e;

    iget-object p0, p0, Lo7/g$e;->s:Lo7/g;

    invoke-direct {p2, p0, p3}, Lo7/g$e;-><init>(Lo7/g;Lm8/e;)V

    iput-object p1, p2, Lo7/g$e;->r:Ljava/lang/Object;

    sget-object p0, Lh8/A;->a:Lh8/A;

    invoke-virtual {p2, p0}, Lo7/g$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
