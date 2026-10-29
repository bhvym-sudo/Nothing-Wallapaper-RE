.class final Lo7/g$k$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo7/g$k;->a(Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState;

.field final synthetic s:Lo7/g;


# direct methods
.method constructor <init>(Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState;Lo7/g;Lm8/e;)V
    .registers 4

    iput-object p1, p0, Lo7/g$k$a;->r:Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState;

    iput-object p2, p0, Lo7/g$k$a;->s:Lo7/g;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 4

    new-instance p1, Lo7/g$k$a;

    iget-object v0, p0, Lo7/g$k$a;->r:Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState;

    iget-object p0, p0, Lo7/g$k$a;->s:Lo7/g;

    invoke-direct {p1, v0, p0, p2}, Lo7/g$k$a;-><init>(Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState;Lo7/g;Lm8/e;)V

    return-object p1
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, Lo7/g$k$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Lo7/g$k$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Lo7/g$k$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Lo7/g$k$a;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 7

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lo7/g$k$a;->q:I

    const/4 v2, 0x1

    if-eqz v1, :cond_17

    if-ne v1, v2, :cond_f

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_46

    :cond_f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_17
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lo7/g$k$a;->r:Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState;

    sget-object v1, Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState$Available;->INSTANCE:Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState$Available;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_46

    iget-object p1, p0, Lo7/g$k$a;->s:Lo7/g;

    invoke-static {p1}, Lo7/g;->D(Lo7/g;)Lx6/k;

    move-result-object p1

    invoke-virtual {p1}, Lx6/k;->q()Lw6/d;

    move-result-object p1

    invoke-virtual {p1}, Lw6/d;->c()Lw6/b;

    move-result-object p1

    const/4 v1, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {p1, v4, v4, v1, v3}, LG6/a;->c(Lw6/b;ZZILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object p1

    if-eqz p1, :cond_46

    iget-object v1, p0, Lo7/g$k$a;->s:Lo7/g;

    iput v2, p0, Lo7/g$k$a;->q:I

    invoke-static {v1, p1, p0}, Lo7/g;->S(Lo7/g;Landroid/graphics/Bitmap;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_46

    return-object v0

    :cond_46
    :goto_46
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
