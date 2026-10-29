.class final Lo7/g$i$a$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo7/g$i$a;->a(Lcom/nothing/wallpaper/segmenter/Segmenter$FailReason;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:Lo7/g;

.field final synthetic s:Landroid/graphics/Bitmap;


# direct methods
.method constructor <init>(Lo7/g;Landroid/graphics/Bitmap;Lm8/e;)V
    .registers 4

    iput-object p1, p0, Lo7/g$i$a$a;->r:Lo7/g;

    iput-object p2, p0, Lo7/g$i$a$a;->s:Landroid/graphics/Bitmap;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 4

    new-instance p1, Lo7/g$i$a$a;

    iget-object v0, p0, Lo7/g$i$a$a;->r:Lo7/g;

    iget-object p0, p0, Lo7/g$i$a$a;->s:Landroid/graphics/Bitmap;

    invoke-direct {p1, v0, p0, p2}, Lo7/g$i$a$a;-><init>(Lo7/g;Landroid/graphics/Bitmap;Lm8/e;)V

    return-object p1
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, Lo7/g$i$a$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Lo7/g$i$a$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Lo7/g$i$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Lo7/g$i$a$a;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 5

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lo7/g$i$a$a;->q:I

    const/4 v2, 0x1

    if-eqz v1, :cond_17

    if-ne v1, v2, :cond_f

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_27

    :cond_f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_17
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lo7/g$i$a$a;->r:Lo7/g;

    iget-object v1, p0, Lo7/g$i$a$a;->s:Landroid/graphics/Bitmap;

    iput v2, p0, Lo7/g$i$a$a;->q:I

    invoke-static {p1, v1, p0}, Lo7/g;->S(Lo7/g;Landroid/graphics/Bitmap;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_27

    return-object v0

    :cond_27
    :goto_27
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
