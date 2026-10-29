.class final Lj7/j$o$c;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj7/j$o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:Lj7/j;

.field final synthetic s:Lkotlin/jvm/internal/C;


# direct methods
.method constructor <init>(Lj7/j;Lkotlin/jvm/internal/C;Lm8/e;)V
    .registers 4

    iput-object p1, p0, Lj7/j$o$c;->r:Lj7/j;

    iput-object p2, p0, Lj7/j$o$c;->s:Lkotlin/jvm/internal/C;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 4

    new-instance p1, Lj7/j$o$c;

    iget-object v0, p0, Lj7/j$o$c;->r:Lj7/j;

    iget-object p0, p0, Lj7/j$o$c;->s:Lkotlin/jvm/internal/C;

    invoke-direct {p1, v0, p0, p2}, Lj7/j$o$c;-><init>(Lj7/j;Lkotlin/jvm/internal/C;Lm8/e;)V

    return-object p1
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, Lj7/j$o$c;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Lj7/j$o$c;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Lj7/j$o$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Lj7/j$o$c;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 5

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lj7/j$o$c;->q:I

    const/4 v2, 0x1

    if-eqz v1, :cond_17

    if-ne v1, v2, :cond_f

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_29

    :cond_f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_17
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lj7/j$o$c;->r:Lj7/j;

    iget-object v1, p0, Lj7/j$o$c;->s:Lkotlin/jvm/internal/C;

    iget v1, v1, Lkotlin/jvm/internal/C;->q:I

    iput v2, p0, Lj7/j$o$c;->q:I

    invoke-static {p1, v1, p0}, Lj7/j;->u(Lj7/j;ILm8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_29

    return-object v0

    :cond_29
    :goto_29
    check-cast p1, Landroid/graphics/Bitmap;

    sget-object v0, Lcom/nothing/wallpaper/common/log/c;->a:Lcom/nothing/wallpaper/common/log/c;

    invoke-virtual {v0}, Lcom/nothing/wallpaper/common/log/c;->m()Z

    move-result v0

    if-eqz v0, :cond_3a

    if-eqz p1, :cond_3a

    iget-object p0, p0, Lj7/j$o$c;->r:Lj7/j;

    invoke-static {p0, p1}, Lj7/j;->N(Lj7/j;Landroid/graphics/Bitmap;)V

    :cond_3a
    return-object p1
.end method
