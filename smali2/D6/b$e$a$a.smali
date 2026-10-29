.class final LD6/b$e$a$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD6/b$e$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:LD6/b;

.field final synthetic s:LD6/h$c;


# direct methods
.method constructor <init>(LD6/b;LD6/h$c;Lm8/e;)V
    .registers 4

    iput-object p1, p0, LD6/b$e$a$a;->r:LD6/b;

    iput-object p2, p0, LD6/b$e$a$a;->s:LD6/h$c;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 4

    new-instance p1, LD6/b$e$a$a;

    iget-object v0, p0, LD6/b$e$a$a;->r:LD6/b;

    iget-object p0, p0, LD6/b$e$a$a;->s:LD6/h$c;

    invoke-direct {p1, v0, p0, p2}, LD6/b$e$a$a;-><init>(LD6/b;LD6/h$c;Lm8/e;)V

    return-object p1
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, LD6/b$e$a$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LD6/b$e$a$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LD6/b$e$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LD6/b$e$a$a;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 7

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LD6/b$e$a$a;->q:I

    const/4 v2, 0x1

    if-eqz v1, :cond_17

    if-ne v1, v2, :cond_f

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_67

    :cond_f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_17
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LD6/b$e$a$a;->r:LD6/b;

    invoke-static {p1}, LD6/b;->u(LD6/b;)Lq6/b;

    move-result-object p1

    iget-object v1, p0, LD6/b$e$a$a;->s:LD6/h$c;

    invoke-virtual {v1}, LD6/h$c;->a()Ljava/lang/Object;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "emit color event for "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lq6/b;->a(Ljava/lang/String;)V

    iget-object p1, p0, LD6/b$e$a$a;->r:LD6/b;

    invoke-static {p1}, LD6/b;->g(LD6/b;)LD6/h;

    move-result-object p1

    if-nez p1, :cond_4d

    const-string p1, "colorStream"

    invoke-static {p1}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_4d
    new-instance v1, LD6/h$c;

    iget-object v3, p0, LD6/b$e$a$a;->s:LD6/h$c;

    invoke-virtual {v3}, LD6/h$c;->a()Ljava/lang/Object;

    move-result-object v3

    iget-object v4, p0, LD6/b$e$a$a;->s:LD6/h$c;

    invoke-virtual {v4}, LD6/h$c;->b()Ljava/lang/Object;

    move-result-object v4

    invoke-direct {v1, v3, v4}, LD6/h$c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iput v2, p0, LD6/b$e$a$a;->q:I

    invoke-virtual {p1, v1, p0}, LD6/h;->e(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_67

    return-object v0

    :cond_67
    :goto_67
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
