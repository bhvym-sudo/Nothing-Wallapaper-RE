.class final La7/d$i$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La7/d$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:La7/d;

.field final synthetic s:Lcom/nothing/wallpaper/picker/creative/model/Prompt;

.field final synthetic t:Lcom/nothing/wallpaper/picker/creative/model/Prompt;

.field final synthetic u:Z


# direct methods
.method constructor <init>(La7/d;Lcom/nothing/wallpaper/picker/creative/model/Prompt;Lcom/nothing/wallpaper/picker/creative/model/Prompt;ZLm8/e;)V
    .registers 6

    iput-object p1, p0, La7/d$i$a;->r:La7/d;

    iput-object p2, p0, La7/d$i$a;->s:Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    iput-object p3, p0, La7/d$i$a;->t:Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    iput-boolean p4, p0, La7/d$i$a;->u:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 9

    new-instance v0, La7/d$i$a;

    iget-object v1, p0, La7/d$i$a;->r:La7/d;

    iget-object v2, p0, La7/d$i$a;->s:Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    iget-object v3, p0, La7/d$i$a;->t:Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    iget-boolean v4, p0, La7/d$i$a;->u:Z

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, La7/d$i$a;-><init>(La7/d;Lcom/nothing/wallpaper/picker/creative/model/Prompt;Lcom/nothing/wallpaper/picker/creative/model/Prompt;ZLm8/e;)V

    return-object v0
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, La7/d$i$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, La7/d$i$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, La7/d$i$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, La7/d$i$a;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 7

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, La7/d$i$a;->q:I

    const/4 v2, 0x1

    if-eqz v1, :cond_17

    if-ne v1, v2, :cond_f

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_34

    :cond_f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_17
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, La7/d$i$a;->r:La7/d;

    invoke-static {p1, v2}, La7/d;->A(La7/d;Z)V

    iget-object p1, p0, La7/d$i$a;->r:La7/d;

    iget-object v1, p0, La7/d$i$a;->s:Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    iget-object v3, p0, La7/d$i$a;->t:Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    iget-boolean v4, p0, La7/d$i$a;->u:Z

    invoke-static {p1, v1, v3, v4}, La7/d;->s(La7/d;Lcom/nothing/wallpaper/picker/creative/model/Prompt;Lcom/nothing/wallpaper/picker/creative/model/Prompt;Z)I

    move-result v4

    iput v2, p0, La7/d$i$a;->q:I

    invoke-static {p1, v1, v3, v4, p0}, La7/d;->o(La7/d;Lcom/nothing/wallpaper/picker/creative/model/Prompt;Lcom/nothing/wallpaper/picker/creative/model/Prompt;ILm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_34

    return-object v0

    :cond_34
    :goto_34
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
