.class final LO5/i$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LO5/i;->c(Landroid/content/Context;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic A:Ljava/lang/String;

.field final synthetic B:Ljava/lang/String;

.field final synthetic C:Ljava/lang/String;

.field final synthetic D:Ljava/lang/String;

.field final synthetic E:Ljava/lang/String;

.field final synthetic F:Ljava/lang/String;

.field q:I

.field final synthetic r:Landroid/content/Context;

.field final synthetic s:Ljava/lang/String;

.field final synthetic t:Ljava/lang/String;

.field final synthetic u:I

.field final synthetic v:Ljava/lang/String;

.field final synthetic w:I

.field final synthetic x:Ljava/lang/String;

.field final synthetic y:Ljava/lang/String;

.field final synthetic z:Ljava/lang/String;


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm8/e;)V
    .registers 17

    iput-object p1, p0, LO5/i$a;->r:Landroid/content/Context;

    iput-object p2, p0, LO5/i$a;->s:Ljava/lang/String;

    iput-object p3, p0, LO5/i$a;->t:Ljava/lang/String;

    iput p4, p0, LO5/i$a;->u:I

    iput-object p5, p0, LO5/i$a;->v:Ljava/lang/String;

    iput p6, p0, LO5/i$a;->w:I

    iput-object p7, p0, LO5/i$a;->x:Ljava/lang/String;

    iput-object p8, p0, LO5/i$a;->y:Ljava/lang/String;

    iput-object p9, p0, LO5/i$a;->z:Ljava/lang/String;

    iput-object p10, p0, LO5/i$a;->A:Ljava/lang/String;

    iput-object p11, p0, LO5/i$a;->B:Ljava/lang/String;

    iput-object p12, p0, LO5/i$a;->C:Ljava/lang/String;

    iput-object p13, p0, LO5/i$a;->D:Ljava/lang/String;

    iput-object p14, p0, LO5/i$a;->E:Ljava/lang/String;

    iput-object p15, p0, LO5/i$a;->F:Ljava/lang/String;

    const/4 p1, 0x2

    move-object/from16 p2, p16

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 20

    move-object/from16 v0, p0

    new-instance v1, LO5/i$a;

    move-object v2, v1

    iget-object v1, v0, LO5/i$a;->r:Landroid/content/Context;

    move-object v3, v2

    iget-object v2, v0, LO5/i$a;->s:Ljava/lang/String;

    move-object v4, v3

    iget-object v3, v0, LO5/i$a;->t:Ljava/lang/String;

    move-object v5, v4

    iget v4, v0, LO5/i$a;->u:I

    move-object v6, v5

    iget-object v5, v0, LO5/i$a;->v:Ljava/lang/String;

    move-object v7, v6

    iget v6, v0, LO5/i$a;->w:I

    move-object v8, v7

    iget-object v7, v0, LO5/i$a;->x:Ljava/lang/String;

    move-object v9, v8

    iget-object v8, v0, LO5/i$a;->y:Ljava/lang/String;

    move-object v10, v9

    iget-object v9, v0, LO5/i$a;->z:Ljava/lang/String;

    move-object v11, v10

    iget-object v10, v0, LO5/i$a;->A:Ljava/lang/String;

    move-object v12, v11

    iget-object v11, v0, LO5/i$a;->B:Ljava/lang/String;

    move-object v13, v12

    iget-object v12, v0, LO5/i$a;->C:Ljava/lang/String;

    move-object v14, v13

    iget-object v13, v0, LO5/i$a;->D:Ljava/lang/String;

    move-object v15, v14

    iget-object v14, v0, LO5/i$a;->E:Ljava/lang/String;

    iget-object v0, v0, LO5/i$a;->F:Ljava/lang/String;

    move-object/from16 v16, v15

    move-object v15, v0

    move-object/from16 v0, v16

    move-object/from16 v16, p2

    invoke-direct/range {v0 .. v16}, LO5/i$a;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm8/e;)V

    return-object v0
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, LO5/i$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LO5/i$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LO5/i$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LO5/i$a;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 15

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    iget v0, p0, LO5/i$a;->q:I

    if-nez v0, :cond_58

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    iget-object v0, p0, LO5/i$a;->t:Ljava/lang/String;

    iget v1, p0, LO5/i$a;->u:I

    iget-object v2, p0, LO5/i$a;->v:Ljava/lang/String;

    iget v3, p0, LO5/i$a;->w:I

    iget-object v4, p0, LO5/i$a;->x:Ljava/lang/String;

    iget-object v5, p0, LO5/i$a;->y:Ljava/lang/String;

    iget-object v6, p0, LO5/i$a;->z:Ljava/lang/String;

    iget-object v7, p0, LO5/i$a;->A:Ljava/lang/String;

    iget-object v8, p0, LO5/i$a;->B:Ljava/lang/String;

    iget-object v9, p0, LO5/i$a;->C:Ljava/lang/String;

    iget-object v10, p0, LO5/i$a;->D:Ljava/lang/String;

    iget-object v11, p0, LO5/i$a;->E:Ljava/lang/String;

    iget-object v12, p0, LO5/i$a;->F:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    invoke-virtual {p1, v2, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const/4 v0, 0x1

    invoke-virtual {p1, v4, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    invoke-virtual {p1, v5, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1, v7, v8}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1, v9, v10}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1, v11, v12}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, LO5/i;->a:LO5/i;

    invoke-static {v0, p1}, LO5/i;->a(LO5/i;Landroid/os/Bundle;)V

    iget-object v0, p0, LO5/i$a;->r:Landroid/content/Context;

    invoke-static {v0}, Lcom/nothing/experience/AppTracking;->getInstance(Landroid/content/Context;)Lcom/nothing/experience/AppTracking;

    move-result-object v0

    if-eqz v0, :cond_55

    iget-object p0, p0, LO5/i$a;->s:Ljava/lang/String;

    invoke-virtual {v0, p0, p1}, Lcom/nothing/experience/AppTracking;->logProductEvent(Ljava/lang/String;Landroid/os/Bundle;)Z

    move-result p0

    invoke-static {p0}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    :cond_55
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_58
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
