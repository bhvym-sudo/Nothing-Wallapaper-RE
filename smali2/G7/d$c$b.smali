.class final LG7/d$c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG7/d$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic q:LJ7/i;

.field final synthetic r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;

.field final synthetic s:LS1/a;


# direct methods
.method constructor <init>(LJ7/i;Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;LS1/a;)V
    .registers 4

    iput-object p1, p0, LG7/d$c$b;->q:LJ7/i;

    iput-object p2, p0, LG7/d$c$b;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;

    iput-object p3, p0, LG7/d$c$b;->s:LS1/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lh8/o;Lm8/e;)Ljava/lang/Object;
    .registers 16

    instance-of v2, p2, LG7/d$c$b$a;

    if-eqz v2, :cond_13

    move-object v2, p2

    check-cast v2, LG7/d$c$b$a;

    iget v3, v2, LG7/d$c$b$a;->v:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_13

    sub-int/2addr v3, v4

    iput v3, v2, LG7/d$c$b$a;->v:I

    goto :goto_18

    :cond_13
    new-instance v2, LG7/d$c$b$a;

    invoke-direct {v2, p0, p2}, LG7/d$c$b$a;-><init>(LG7/d$c$b;Lm8/e;)V

    :goto_18
    iget-object v1, v2, LG7/d$c$b$a;->t:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v3

    iget v4, v2, LG7/d$c$b$a;->v:I

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v4, :cond_54

    if-eq v4, v6, :cond_45

    if-ne v4, v5, :cond_3d

    iget-object v0, v2, LG7/d$c$b$a;->s:Ljava/lang/Object;

    check-cast v0, LN1/a;

    iget-object v3, v2, LG7/d$c$b$a;->r:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v2, v2, LG7/d$c$b$a;->q:Ljava/lang/Object;

    check-cast v2, LG7/d$c$b;

    invoke-static {v1}, Lh8/r;->b(Ljava/lang/Object;)V

    move-object v12, v3

    move-object v3, v0

    move-object v0, v2

    move-object v2, v12

    goto/16 :goto_ca

    :cond_3d
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_45
    iget-object v0, v2, LG7/d$c$b$a;->r:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v4, v2, LG7/d$c$b$a;->q:Ljava/lang/Object;

    check-cast v4, LG7/d$c$b;

    invoke-static {v1}, Lh8/r;->b(Ljava/lang/Object;)V

    move-object v12, v4

    move-object v4, v0

    move-object v0, v12

    goto :goto_b0

    :cond_54
    invoke-static {v1}, Lh8/r;->b(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lh8/o;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-virtual {p1}, Lh8/o;->b()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LT1/a;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "onClock Changed: "

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v7, "ClockHostViewBinder"

    invoke-static {v7, v4}, Lcom/nothing/wallpaper/common/log/c;->k(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v4, LA7/e;->a:LA7/e;

    invoke-virtual {v4}, LA7/e;->a()Ljava/util/Map;

    move-result-object v4

    invoke-virtual {v1}, LT1/a;->a()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v4, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LO1/b;

    if-nez v4, :cond_dc

    invoke-virtual {v1}, LT1/a;->a()Ljava/lang/String;

    move-result-object v1

    iget-object v4, p0, LG7/d$c$b;->q:LJ7/i;

    invoke-virtual {v4}, LJ7/i;->V()LI8/f;

    move-result-object v4

    iput-object p0, v2, LG7/d$c$b$a;->q:Ljava/lang/Object;

    iput-object v1, v2, LG7/d$c$b$a;->r:Ljava/lang/Object;

    iput v6, v2, LG7/d$c$b$a;->v:I

    invoke-static {v4, v2}, LI8/h;->x(LI8/f;Lm8/e;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_ac

    goto :goto_c6

    :cond_ac
    move-object v0, v4

    move-object v4, v1

    move-object v1, v0

    move-object v0, p0

    :goto_b0
    check-cast v1, LN1/a;

    iget-object v6, v0, LG7/d$c$b;->q:LJ7/i;

    invoke-virtual {v6}, LJ7/i;->T()LI8/f;

    move-result-object v6

    iput-object v0, v2, LG7/d$c$b$a;->q:Ljava/lang/Object;

    iput-object v4, v2, LG7/d$c$b$a;->r:Ljava/lang/Object;

    iput-object v1, v2, LG7/d$c$b$a;->s:Ljava/lang/Object;

    iput v5, v2, LG7/d$c$b$a;->v:I

    invoke-static {v6, v2}, LI8/h;->x(LI8/f;Lm8/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_c7

    :goto_c6
    return-object v3

    :cond_c7
    move-object v3, v1

    move-object v1, v2

    move-object v2, v4

    :goto_ca
    move-object v8, v1

    check-cast v8, LA7/a;

    new-instance v1, LO1/b;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/16 v10, 0xbc

    const/4 v11, 0x0

    invoke-direct/range {v1 .. v11}, LO1/b;-><init>(Ljava/lang/String;LN1/a;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;LO2/f;LA7/a;LA7/g;ILkotlin/jvm/internal/h;)V

    move-object v6, v1

    goto :goto_de

    :cond_dc
    move-object v0, p0

    move-object v6, v4

    :goto_de
    sget-object v1, LG7/d;->a:LG7/d;

    iget-object v2, v0, LG7/d$c$b;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;

    iget-object v3, v0, LG7/d$c$b;->q:LJ7/i;

    iget-object v4, v0, LG7/d$c$b;->s:LS1/a;

    invoke-virtual {v3}, LJ7/i;->p0()Z

    move-result v5

    invoke-static/range {v1 .. v6}, LG7/d;->d(LG7/d;Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;LJ7/i;LS1/a;ZLO1/b;)V

    sget-object v0, Lh8/A;->a:Lh8/A;

    return-object v0
.end method

.method public bridge synthetic b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Lh8/o;

    invoke-virtual {p0, p1, p2}, LG7/d$c$b;->a(Lh8/o;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
