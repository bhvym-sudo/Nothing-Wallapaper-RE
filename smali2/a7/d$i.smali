.class final La7/d$i;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La7/d;->V(Lcom/nothing/wallpaper/picker/creative/model/Prompt;Lcom/nothing/wallpaper/picker/creative/model/Prompt;La7/d$c;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:La7/d;

.field final synthetic s:La7/d$c;

.field final synthetic t:Lcom/nothing/wallpaper/picker/creative/model/Prompt;

.field final synthetic u:Lcom/nothing/wallpaper/picker/creative/model/Prompt;

.field final synthetic v:Z


# direct methods
.method constructor <init>(La7/d;La7/d$c;Lcom/nothing/wallpaper/picker/creative/model/Prompt;Lcom/nothing/wallpaper/picker/creative/model/Prompt;ZLm8/e;)V
    .registers 7

    iput-object p1, p0, La7/d$i;->r:La7/d;

    iput-object p2, p0, La7/d$i;->s:La7/d$c;

    iput-object p3, p0, La7/d$i;->t:Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    iput-object p4, p0, La7/d$i;->u:Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    iput-boolean p5, p0, La7/d$i;->v:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 10

    new-instance v0, La7/d$i;

    iget-object v1, p0, La7/d$i;->r:La7/d;

    iget-object v2, p0, La7/d$i;->s:La7/d$c;

    iget-object v3, p0, La7/d$i;->t:Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    iget-object v4, p0, La7/d$i;->u:Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    iget-boolean v5, p0, La7/d$i;->v:Z

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, La7/d$i;-><init>(La7/d;La7/d$c;Lcom/nothing/wallpaper/picker/creative/model/Prompt;Lcom/nothing/wallpaper/picker/creative/model/Prompt;ZLm8/e;)V

    return-object v0
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, La7/d$i;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, La7/d$i;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, La7/d$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, La7/d$i;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 11

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, La7/d$i;->q:I

    const/4 v2, 0x1

    if-eqz v1, :cond_17

    if-ne v1, v2, :cond_f

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_4f

    :cond_f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_17
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, La7/d$i;->r:La7/d;

    invoke-static {p1}, La7/d;->p(La7/d;)Landroid/app/Application;

    move-result-object p1

    invoke-static {p1}, Li6/m;->a(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_48

    iget-object p1, p0, La7/d$i;->r:La7/d;

    iget-object v1, p0, La7/d$i;->s:La7/d$c;

    invoke-static {p1, v1}, La7/d;->m(La7/d;La7/d$c;)V

    invoke-static {}, LF8/b0;->b()LF8/I;

    move-result-object p1

    new-instance v3, La7/d$i$a;

    iget-object v4, p0, La7/d$i;->r:La7/d;

    iget-object v5, p0, La7/d$i;->t:Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    iget-object v6, p0, La7/d$i;->u:Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    iget-boolean v7, p0, La7/d$i;->v:Z

    const/4 v8, 0x0

    invoke-direct/range {v3 .. v8}, La7/d$i$a;-><init>(La7/d;Lcom/nothing/wallpaper/picker/creative/model/Prompt;Lcom/nothing/wallpaper/picker/creative/model/Prompt;ZLm8/e;)V

    iput v2, p0, La7/d$i;->q:I

    invoke-static {p1, v3, p0}, LF8/g;->g(Lm8/i;Lv8/p;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_4f

    return-object v0

    :cond_48
    iget-object p0, p0, La7/d$i;->r:La7/d;

    sget-object p1, La7/d$c$c;->v:La7/d$c$c;

    invoke-static {p0, p1}, La7/d;->m(La7/d;La7/d$c;)V

    :cond_4f
    :goto_4f
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
