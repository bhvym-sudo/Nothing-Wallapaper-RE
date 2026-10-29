.class final Ly7/g$f;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly7/g;-><init>(Landroid/content/Context;LF8/L;LF8/I;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:Ly7/g;


# direct methods
.method constructor <init>(Ly7/g;Lm8/e;)V
    .registers 3

    iput-object p1, p0, Ly7/g$f;->r:Ly7/g;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    check-cast p3, Lm8/e;

    invoke-virtual {p0, p1, p2, p3}, Ly7/g$f;->s(Ljava/lang/Object;Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    iget v0, p0, Ly7/g$f;->q:I

    if-nez v0, :cond_21

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Ly7/g$f;->r:Ly7/g;

    const-string v0, "calendar"

    invoke-static {p1, v0}, Ly7/g;->m(Ly7/g;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1b

    iget-object p0, p0, Ly7/g$f;->r:Ly7/g;

    invoke-static {p0}, Ly7/g;->l(Ly7/g;)LX5/a;

    move-result-object p0

    return-object p0

    :cond_1b
    new-instance p0, LX5/a;

    invoke-direct {p0}, LX5/a;-><init>()V

    return-object p0

    :cond_21
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final s(Ljava/lang/Object;Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
    .registers 4

    new-instance p1, Ly7/g$f;

    iget-object p0, p0, Ly7/g$f;->r:Ly7/g;

    invoke-direct {p1, p0, p3}, Ly7/g$f;-><init>(Ly7/g;Lm8/e;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    invoke-virtual {p1, p0}, Ly7/g$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
