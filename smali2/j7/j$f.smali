.class final Lj7/j$f;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj7/j;->z0(LC6/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field private synthetic r:Ljava/lang/Object;

.field final synthetic s:Lj7/j;

.field final synthetic t:LC6/b;


# direct methods
.method constructor <init>(Lj7/j;LC6/b;Lm8/e;)V
    .registers 4

    iput-object p1, p0, Lj7/j$f;->s:Lj7/j;

    iput-object p2, p0, Lj7/j$f;->t:LC6/b;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 5

    new-instance v0, Lj7/j$f;

    iget-object v1, p0, Lj7/j$f;->s:Lj7/j;

    iget-object p0, p0, Lj7/j$f;->t:LC6/b;

    invoke-direct {v0, v1, p0, p2}, Lj7/j$f;-><init>(Lj7/j;LC6/b;Lm8/e;)V

    iput-object p1, v0, Lj7/j$f;->r:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, Lj7/j$f;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Lj7/j$f;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Lj7/j$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Lj7/j$f;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    iget v0, p0, Lj7/j$f;->q:I

    if-nez v0, :cond_49

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lj7/j$f;->r:Ljava/lang/Object;

    check-cast p1, LF8/L;

    iget-object v0, p0, Lj7/j$f;->s:Lj7/j;

    iget-object v1, p0, Lj7/j$f;->t:LC6/b;

    invoke-virtual {v1}, LC6/b;->a()LC6/i;

    move-result-object v1

    invoke-virtual {v1}, LC6/i;->a()Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-static {v0, v1}, Lj7/j;->Q(Lj7/j;Landroid/graphics/Bitmap;)V

    invoke-static {p1}, LF8/M;->g(LF8/L;)Z

    move-result p1

    if-eqz p1, :cond_46

    iget-object p1, p0, Lj7/j$f;->s:Lj7/j;

    invoke-static {p1}, Lj7/j;->t(Lj7/j;)Landroid/graphics/Bitmap;

    move-result-object p1

    if-eqz p1, :cond_46

    iget-object p1, p0, Lj7/j$f;->s:Lj7/j;

    invoke-static {p1}, Lj7/j;->t(Lj7/j;)Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result p1

    if-nez p1, :cond_46

    iget-object p0, p0, Lj7/j$f;->s:Lj7/j;

    invoke-static {p0}, Lj7/j;->t(Lj7/j;)Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-static {p0, p1}, Lj7/j;->q(Lj7/j;Landroid/graphics/Bitmap;)Z

    :cond_46
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_49
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
