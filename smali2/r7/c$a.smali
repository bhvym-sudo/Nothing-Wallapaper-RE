.class final Lr7/c$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr7/c;->L(Landroid/view/View;Lv8/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:Lr7/c;


# direct methods
.method constructor <init>(Lr7/c;Lm8/e;)V
    .registers 3

    iput-object p1, p0, Lr7/c$a;->r:Lr7/c;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 3

    new-instance p1, Lr7/c$a;

    iget-object p0, p0, Lr7/c$a;->r:Lr7/c;

    invoke-direct {p1, p0, p2}, Lr7/c$a;-><init>(Lr7/c;Lm8/e;)V

    return-object p1
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, Lr7/c$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Lr7/c$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Lr7/c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Lr7/c$a;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 5

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lr7/c$a;->q:I

    const/4 v2, 0x1

    if-eqz v1, :cond_17

    if-ne v1, v2, :cond_f

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_25

    :cond_f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_17
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lr7/c$a;->r:Lr7/c;

    iput v2, p0, Lr7/c$a;->q:I

    invoke-static {p1, p0}, Lr7/c;->H(Lr7/c;Lm8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_25

    return-object v0

    :cond_25
    :goto_25
    check-cast p1, Lg3/x;

    if-eqz p1, :cond_37

    iget-object p0, p0, Lr7/c$a;->r:Lr7/c;

    invoke-static {p0}, Lr7/c;->I(Lr7/c;)Lg3/z;

    move-result-object v0

    invoke-static {p0}, Lr7/c;->J(Lr7/c;)Z

    move-result p0

    xor-int/2addr p0, v2

    invoke-interface {v0, p1, p0}, Lg3/z;->H(Lg3/x;Z)V

    :cond_37
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
