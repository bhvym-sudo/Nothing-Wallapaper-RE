.class final Lo7/g$a$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo7/g$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:Lo7/g;


# direct methods
.method constructor <init>(Lo7/g;Lm8/e;)V
    .registers 3

    iput-object p1, p0, Lo7/g$a$b;->r:Lo7/g;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 3

    new-instance p1, Lo7/g$a$b;

    iget-object p0, p0, Lo7/g$a$b;->r:Lo7/g;

    invoke-direct {p1, p0, p2}, Lo7/g$a$b;-><init>(Lo7/g;Lm8/e;)V

    return-object p1
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, Lo7/g$a$b;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Lo7/g$a$b;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Lo7/g$a$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Lo7/g$a$b;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    iget v0, p0, Lo7/g$a$b;->q:I

    if-nez v0, :cond_20

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p0, p0, Lo7/g$a$b;->r:Lo7/g;

    invoke-static {p0}, Lo7/g;->D(Lo7/g;)Lx6/k;

    move-result-object p0

    invoke-virtual {p0}, Lx6/k;->q()Lw6/d;

    move-result-object p0

    invoke-virtual {p0}, Lw6/d;->c()Lw6/b;

    move-result-object p0

    const/4 p1, 0x2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v1, v1, p1, v0}, LG6/a;->c(Lw6/b;ZZILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0

    :cond_20
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
