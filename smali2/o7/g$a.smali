.class final Lo7/g$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo7/g;-><init>(Landroid/content/Context;Lg3/x;Lp7/a;Lx6/k;LD6/e;Landroidx/lifecycle/Q;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:Ljava/lang/Object;

.field r:I

.field private synthetic s:Ljava/lang/Object;

.field final synthetic t:Lo7/g;

.field final synthetic u:Lg3/x;


# direct methods
.method constructor <init>(Lo7/g;Lg3/x;Lm8/e;)V
    .registers 4

    iput-object p1, p0, Lo7/g$a;->t:Lo7/g;

    iput-object p2, p0, Lo7/g$a;->u:Lg3/x;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 5

    new-instance v0, Lo7/g$a;

    iget-object v1, p0, Lo7/g$a;->t:Lo7/g;

    iget-object p0, p0, Lo7/g$a;->u:Lg3/x;

    invoke-direct {v0, v1, p0, p2}, Lo7/g$a;-><init>(Lo7/g;Lg3/x;Lm8/e;)V

    iput-object p1, v0, Lo7/g$a;->s:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, Lo7/g$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Lo7/g$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Lo7/g$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Lo7/g$a;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 15

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lo7/g$a;->r:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v1, :cond_3b

    if-eq v1, v4, :cond_2f

    if-eq v1, v3, :cond_23

    if-ne v1, v2, :cond_1b

    iget-object p0, p0, Lo7/g$a;->s:Ljava/lang/Object;

    check-cast p0, Lo7/g;

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto/16 :goto_f7

    :cond_1b
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_23
    iget-object v1, p0, Lo7/g$a;->q:Ljava/lang/Object;

    check-cast v1, Landroid/graphics/Bitmap;

    iget-object v3, p0, Lo7/g$a;->s:Ljava/lang/Object;

    check-cast v3, LF8/L;

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_86

    :cond_2f
    iget-object v1, p0, Lo7/g$a;->q:Ljava/lang/Object;

    check-cast v1, LF8/T;

    iget-object v4, p0, Lo7/g$a;->s:Ljava/lang/Object;

    check-cast v4, LF8/L;

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_73

    :cond_3b
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lo7/g$a;->s:Ljava/lang/Object;

    move-object v6, p1

    check-cast v6, LF8/L;

    invoke-static {}, LF8/b0;->b()LF8/I;

    move-result-object v7

    new-instance v9, Lo7/g$a$b;

    iget-object p1, p0, Lo7/g$a;->t:Lo7/g;

    invoke-direct {v9, p1, v5}, Lo7/g$a$b;-><init>(Lo7/g;Lm8/e;)V

    const/4 v10, 0x2

    const/4 v11, 0x0

    const/4 v8, 0x0

    invoke-static/range {v6 .. v11}, LF8/g;->b(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/T;

    move-result-object p1

    invoke-static {}, LF8/b0;->b()LF8/I;

    move-result-object v7

    new-instance v9, Lo7/g$a$a;

    iget-object v1, p0, Lo7/g$a;->t:Lo7/g;

    invoke-direct {v9, v1, v5}, Lo7/g$a$a;-><init>(Lo7/g;Lm8/e;)V

    invoke-static/range {v6 .. v11}, LF8/g;->b(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/T;

    move-result-object v1

    iput-object v6, p0, Lo7/g$a;->s:Ljava/lang/Object;

    iput-object v1, p0, Lo7/g$a;->q:Ljava/lang/Object;

    iput v4, p0, Lo7/g$a;->r:I

    invoke-interface {p1, p0}, LF8/T;->P0(Lm8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_72

    goto/16 :goto_f5

    :cond_72
    move-object v4, v6

    :goto_73
    check-cast p1, Landroid/graphics/Bitmap;

    iput-object v4, p0, Lo7/g$a;->s:Ljava/lang/Object;

    iput-object p1, p0, Lo7/g$a;->q:Ljava/lang/Object;

    iput v3, p0, Lo7/g$a;->r:I

    invoke-interface {v1, p0}, LF8/T;->P0(Lm8/e;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_83

    goto/16 :goto_f5

    :cond_83
    move-object v12, v1

    move-object v1, p1

    move-object p1, v12

    :goto_86
    check-cast p1, Landroid/graphics/Bitmap;

    if-eqz v1, :cond_8f

    invoke-static {v1}, Lj6/b;->a(Landroid/graphics/Bitmap;)Landroid/graphics/Point;

    move-result-object v3

    goto :goto_90

    :cond_8f
    move-object v3, v5

    :goto_90
    if-eqz p1, :cond_97

    invoke-static {p1}, Lj6/b;->a(Landroid/graphics/Bitmap;)Landroid/graphics/Point;

    move-result-object v4

    goto :goto_98

    :cond_97
    move-object v4, v5

    :goto_98
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "load wallpaper complete rawSize:"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " depth:"

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "ImageCropViewModel"

    invoke-static {v4, v3}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v1, :cond_108

    iget-object v3, p0, Lo7/g$a;->t:Lo7/g;

    invoke-static {v3}, Lo7/g;->E(Lo7/g;)LD6/e;

    move-result-object v4

    invoke-interface {v4, v1}, LD6/e;->N0(Landroid/graphics/Bitmap;)V

    invoke-static {v3}, Lo7/g;->G(Lo7/g;)Z

    move-result v4

    if-eqz v4, :cond_104

    invoke-static {v3}, Lo7/g;->H(Lo7/g;)Lp7/a;

    move-result-object v4

    sget-object v6, Lp7/a$b;->b:Lp7/a$b;

    invoke-static {v4, v6}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_104

    if-eqz p1, :cond_dd

    invoke-static {v3}, Lo7/g;->E(Lo7/g;)LD6/e;

    move-result-object p0

    invoke-interface {p0, p1}, LD6/e;->o(Landroid/graphics/Bitmap;)V

    goto :goto_104

    :cond_dd
    invoke-static {v3}, Lo7/g;->K(Lo7/g;)Lcom/nothing/wallpaper/segmenter/Segmenter;

    move-result-object p1

    invoke-interface {p1}, Lcom/nothing/wallpaper/segmenter/Segmenter;->c()Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState;

    move-result-object p1

    instance-of p1, p1, Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState$Available;

    if-eqz p1, :cond_f9

    iput-object v3, p0, Lo7/g$a;->s:Ljava/lang/Object;

    iput-object v5, p0, Lo7/g$a;->q:Ljava/lang/Object;

    iput v2, p0, Lo7/g$a;->r:I

    invoke-static {v3, v1, p0}, Lo7/g;->S(Lo7/g;Landroid/graphics/Bitmap;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_f6

    :goto_f5
    return-object v0

    :cond_f6
    move-object p0, v3

    :goto_f7
    move-object v3, p0

    goto :goto_104

    :cond_f9
    invoke-static {v3}, Lo7/g;->K(Lo7/g;)Lcom/nothing/wallpaper/segmenter/Segmenter;

    move-result-object p0

    invoke-static {v3}, Lo7/g;->L(Lo7/g;)Lo7/g$k;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/nothing/wallpaper/segmenter/Segmenter;->b(Lcom/nothing/wallpaper/segmenter/Segmenter$b;)V

    :cond_104
    :goto_104
    invoke-static {v3}, Lo7/g;->R(Lo7/g;)V

    goto :goto_132

    :cond_108
    iget-object p1, p0, Lo7/g$a;->t:Lo7/g;

    iget-object p0, p0, Lo7/g$a;->u:Lg3/x;

    invoke-static {p1}, Lo7/g;->I(Lo7/g;)Lq6/b;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "original Bitmap load failed "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, "."

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lq6/b;->e(Ljava/lang/String;)V

    invoke-virtual {p1}, Lo7/b;->i()Landroidx/lifecycle/H;

    move-result-object p0

    sget-object p1, Lm7/a$a;->a:Lm7/a$a;

    invoke-virtual {p0, p1}, Landroidx/lifecycle/H;->l(Ljava/lang/Object;)V

    :goto_132
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
