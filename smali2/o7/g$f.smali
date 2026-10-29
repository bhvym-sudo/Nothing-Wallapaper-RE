.class final Lo7/g$f;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo7/g;->j0(Landroid/graphics/PointF;Ljava/lang/Float;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:Lo7/g;

.field final synthetic s:Landroid/graphics/PointF;

.field final synthetic t:Ljava/lang/Float;

.field final synthetic u:Ljava/lang/String;


# direct methods
.method constructor <init>(Lo7/g;Landroid/graphics/PointF;Ljava/lang/Float;Ljava/lang/String;Lm8/e;)V
    .registers 6

    iput-object p1, p0, Lo7/g$f;->r:Lo7/g;

    iput-object p2, p0, Lo7/g$f;->s:Landroid/graphics/PointF;

    iput-object p3, p0, Lo7/g$f;->t:Ljava/lang/Float;

    iput-object p4, p0, Lo7/g$f;->u:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 9

    new-instance v0, Lo7/g$f;

    iget-object v1, p0, Lo7/g$f;->r:Lo7/g;

    iget-object v2, p0, Lo7/g$f;->s:Landroid/graphics/PointF;

    iget-object v3, p0, Lo7/g$f;->t:Ljava/lang/Float;

    iget-object v4, p0, Lo7/g$f;->u:Ljava/lang/String;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lo7/g$f;-><init>(Lo7/g;Landroid/graphics/PointF;Ljava/lang/Float;Ljava/lang/String;Lm8/e;)V

    return-object v0
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, Lo7/g$f;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Lo7/g$f;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Lo7/g$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Lo7/g$f;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    iget v0, p0, Lo7/g$f;->q:I

    if-nez v0, :cond_1c

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lo7/g$f;->r:Lo7/g;

    invoke-static {p1}, Lo7/g;->M(Lo7/g;)Lo7/i;

    move-result-object p1

    iget-object v0, p0, Lo7/g$f;->s:Landroid/graphics/PointF;

    iget-object v1, p0, Lo7/g$f;->t:Ljava/lang/Float;

    iget-object p0, p0, Lo7/g$f;->u:Ljava/lang/String;

    invoke-virtual {p1, v0, v1, p0}, Lo7/i;->j(Landroid/graphics/PointF;Ljava/lang/Float;Ljava/lang/String;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_1c
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
