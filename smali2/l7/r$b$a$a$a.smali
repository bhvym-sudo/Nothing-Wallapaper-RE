.class final Ll7/r$b$a$a$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ll7/r$b$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field synthetic r:Ljava/lang/Object;

.field final synthetic s:Ll7/r;


# direct methods
.method constructor <init>(Ll7/r;Lm8/e;)V
    .registers 3

    iput-object p1, p0, Ll7/r$b$a$a$a;->s:Ll7/r;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 4

    new-instance v0, Ll7/r$b$a$a$a;

    iget-object p0, p0, Ll7/r$b$a$a$a;->s:Ll7/r;

    invoke-direct {v0, p0, p2}, Ll7/r$b$a$a$a;-><init>(Ll7/r;Lm8/e;)V

    iput-object p1, v0, Ll7/r$b$a$a$a;->r:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Lh8/u;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Ll7/r$b$a$a$a;->s(Lh8/u;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    iget v0, p0, Ll7/r$b$a$a$a;->q:I

    if-nez v0, :cond_22

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Ll7/r$b$a$a$a;->r:Ljava/lang/Object;

    check-cast p1, Lh8/u;

    iget-object p0, p0, Ll7/r$b$a$a$a;->s:Ll7/r;

    invoke-virtual {p1}, Lh8/u;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/davemorrissey/labs/subscaleview/ImageSource;

    invoke-virtual {p1}, Lh8/u;->f()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Point;

    invoke-static {p0, v0, p1}, Ll7/r;->s1(Ll7/r;Lcom/davemorrissey/labs/subscaleview/ImageSource;Landroid/graphics/Point;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_22
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final s(Lh8/u;Lm8/e;)Ljava/lang/Object;
    .registers 3

    invoke-virtual {p0, p1, p2}, Ll7/r$b$a$a$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Ll7/r$b$a$a$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Ll7/r$b$a$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
