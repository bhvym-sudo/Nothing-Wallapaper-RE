.class final LD6/b$c$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD6/b$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field synthetic r:Ljava/lang/Object;

.field final synthetic s:LD6/b;


# direct methods
.method constructor <init>(LD6/b;Lm8/e;)V
    .registers 3

    iput-object p1, p0, LD6/b$c$a;->s:LD6/b;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 4

    new-instance v0, LD6/b$c$a;

    iget-object p0, p0, LD6/b$c$a;->s:LD6/b;

    invoke-direct {v0, p0, p2}, LD6/b$c$a;-><init>(LD6/b;Lm8/e;)V

    iput-object p1, v0, LD6/b$c$a;->r:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, LD6/h$c;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LD6/b$c$a;->s(LD6/h$c;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 7

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LD6/b$c$a;->q:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_22

    if-eq v1, v3, :cond_1a

    if-ne v1, v2, :cond_12

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_73

    :cond_12
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1a
    iget-object v1, p0, LD6/b$c$a;->r:Ljava/lang/Object;

    check-cast v1, LD6/h$c;

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_4e

    :cond_22
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LD6/b$c$a;->r:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, LD6/h$c;

    iget-object p1, p0, LD6/b$c$a;->s:LD6/b;

    invoke-virtual {v1}, LD6/h$c;->b()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/app/WallpaperColors;

    invoke-static {v4}, LG6/h;->b(Landroid/app/WallpaperColors;)I

    move-result v4

    invoke-static {p1, v4}, LD6/b;->U(LD6/b;I)V

    iget-object p1, p0, LD6/b$c$a;->s:LD6/b;

    invoke-static {p1}, LD6/b;->B(LD6/b;)LI8/z;

    move-result-object p1

    invoke-virtual {v1}, LD6/h$c;->b()Ljava/lang/Object;

    move-result-object v4

    iput-object v1, p0, LD6/b$c$a;->r:Ljava/lang/Object;

    iput v3, p0, LD6/b$c$a;->q:I

    invoke-interface {p1, v4, p0}, LI8/z;->b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4e

    goto :goto_72

    :cond_4e
    :goto_4e
    iget-object p1, p0, LD6/b$c$a;->s:LD6/b;

    invoke-static {p1}, LD6/b;->K(LD6/b;)LI8/z;

    move-result-object p1

    new-instance v3, Lh8/o;

    invoke-virtual {v1}, LD6/h$c;->a()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LD6/h$c;

    invoke-virtual {v4}, LD6/h$c;->a()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v1}, LD6/h$c;->b()Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v3, v4, v1}, Lh8/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v1, 0x0

    iput-object v1, p0, LD6/b$c$a;->r:Ljava/lang/Object;

    iput v2, p0, LD6/b$c$a;->q:I

    invoke-interface {p1, v3, p0}, LI8/z;->b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_73

    :goto_72
    return-object v0

    :cond_73
    :goto_73
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public final s(LD6/h$c;Lm8/e;)Ljava/lang/Object;
    .registers 3

    invoke-virtual {p0, p1, p2}, LD6/b$c$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LD6/b$c$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LD6/b$c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
