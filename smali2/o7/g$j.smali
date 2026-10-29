.class final Lo7/g$j;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo7/g;->r0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:Lo7/g;

.field final synthetic s:Landroid/graphics/Point;


# direct methods
.method constructor <init>(Lo7/g;Landroid/graphics/Point;Lm8/e;)V
    .registers 4

    iput-object p1, p0, Lo7/g$j;->r:Lo7/g;

    iput-object p2, p0, Lo7/g$j;->s:Landroid/graphics/Point;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 4

    new-instance p1, Lo7/g$j;

    iget-object v0, p0, Lo7/g$j;->r:Lo7/g;

    iget-object p0, p0, Lo7/g$j;->s:Landroid/graphics/Point;

    invoke-direct {p1, v0, p0, p2}, Lo7/g$j;-><init>(Lo7/g;Landroid/graphics/Point;Lm8/e;)V

    return-object p1
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, Lo7/g$j;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Lo7/g$j;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Lo7/g$j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Lo7/g$j;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 5

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lo7/g$j;->q:I

    const/4 v2, 0x1

    if-eqz v1, :cond_17

    if-ne v1, v2, :cond_f

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_2d

    :cond_f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_17
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lo7/g$j;->r:Lo7/g;

    invoke-static {p1}, Lo7/g;->E(Lo7/g;)LD6/e;

    move-result-object p1

    invoke-interface {p1}, LD6/e;->F0()LI8/f;

    move-result-object p1

    iput v2, p0, Lo7/g$j;->q:I

    invoke-static {p1, p0}, LI8/h;->z(LI8/f;Lm8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2d

    return-object v0

    :cond_2d
    :goto_2d
    check-cast p1, Landroid/graphics/Bitmap;

    if-eqz p1, :cond_46

    invoke-static {p1}, Lj6/b;->a(Landroid/graphics/Bitmap;)Landroid/graphics/Point;

    move-result-object p1

    if-nez p1, :cond_38

    goto :goto_46

    :cond_38
    iget-object v0, p0, Lo7/g$j;->r:Lo7/g;

    invoke-static {v0}, Lo7/g;->M(Lo7/g;)Lo7/i;

    move-result-object v0

    iget-object p0, p0, Lo7/g$j;->s:Landroid/graphics/Point;

    invoke-virtual {v0, p0, p1}, Lo7/i;->p(Landroid/graphics/Point;Landroid/graphics/Point;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_46
    :goto_46
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
