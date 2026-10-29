.class final LJ6/e$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ6/e;->d(LC6/i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field private synthetic r:Ljava/lang/Object;

.field final synthetic s:LJ6/e;

.field final synthetic t:LC6/i;

.field final synthetic u:LF8/v;


# direct methods
.method constructor <init>(LJ6/e;LC6/i;LF8/v;Lm8/e;)V
    .registers 5

    iput-object p1, p0, LJ6/e$b;->s:LJ6/e;

    iput-object p2, p0, LJ6/e$b;->t:LC6/i;

    iput-object p3, p0, LJ6/e$b;->u:LF8/v;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 6

    new-instance v0, LJ6/e$b;

    iget-object v1, p0, LJ6/e$b;->s:LJ6/e;

    iget-object v2, p0, LJ6/e$b;->t:LC6/i;

    iget-object p0, p0, LJ6/e$b;->u:LF8/v;

    invoke-direct {v0, v1, v2, p0, p2}, LJ6/e$b;-><init>(LJ6/e;LC6/i;LF8/v;Lm8/e;)V

    iput-object p1, v0, LJ6/e$b;->r:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, LJ6/e$b;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LJ6/e$b;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LJ6/e$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LJ6/e$b;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 7

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LJ6/e$b;->q:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1b

    if-ne v1, v2, :cond_13

    iget-object v0, p0, LJ6/e$b;->r:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Exception;

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_77

    :cond_13
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1b
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LJ6/e$b;->r:Ljava/lang/Object;

    check-cast p1, LF8/L;

    invoke-static {p1}, LF8/M;->g(LF8/L;)Z

    move-result p1

    if-eqz p1, :cond_a5

    iget-object p1, p0, LJ6/e$b;->s:LJ6/e;

    invoke-static {p1}, LJ6/e;->a(LJ6/e;)Lq6/b;

    move-result-object p1

    const-string v1, "assignCroppedBitmap: compression start"

    invoke-virtual {p1, v1}, Lq6/b;->f(Ljava/lang/String;)V

    const/4 p1, 0x0

    :try_start_34
    iget-object v1, p0, LJ6/e$b;->t:LC6/i;

    invoke-virtual {v1}, LC6/i;->a()Landroid/graphics/Bitmap;

    move-result-object v1

    new-instance v3, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V

    invoke-static {v1, v3}, Lh3/x;->m(Landroid/graphics/Bitmap;Ljava/io/ByteArrayOutputStream;)Z

    move-result v1

    if-eqz v1, :cond_58

    iget-object v1, p0, LJ6/e$b;->s:LJ6/e;

    invoke-static {v1}, LJ6/e;->a(LJ6/e;)Lq6/b;

    move-result-object v1

    const-string v4, "assignCroppedBitmap: compression done successfully"

    invoke-virtual {v1, v4}, Lq6/b;->f(Ljava/lang/String;)V

    iget-object v1, p0, LJ6/e$b;->u:LF8/v;

    invoke-interface {v1, v3}, LF8/v;->B0(Ljava/lang/Object;)Z

    goto :goto_9a

    :catch_56
    move-exception v1

    goto :goto_69

    :cond_58
    iget-object v1, p0, LJ6/e$b;->s:LJ6/e;

    invoke-static {v1}, LJ6/e;->a(LJ6/e;)Lq6/b;

    move-result-object v1

    const-string v3, "assignCroppedBitmap: compression done with no output"

    invoke-virtual {v1, v3}, Lq6/b;->f(Ljava/lang/String;)V

    iget-object v1, p0, LJ6/e$b;->u:LF8/v;

    invoke-interface {v1, p1}, LF8/v;->B0(Ljava/lang/Object;)Z
    :try_end_68
    .catch Ljava/lang/Exception; {:try_start_34 .. :try_end_68} :catch_56

    goto :goto_9a

    :goto_69
    iget-object v3, p0, LJ6/e$b;->s:LJ6/e;

    iput-object v1, p0, LJ6/e$b;->r:Ljava/lang/Object;

    iput v2, p0, LJ6/e$b;->q:I

    invoke-static {v3, p1, p0}, LJ6/e;->b(LJ6/e;Ljava/lang/Integer;Lm8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_76

    return-object v0

    :cond_76
    move-object v0, v1

    :goto_77
    iget-object p1, p0, LJ6/e$b;->u:LF8/v;

    invoke-interface {p1, v0}, LF8/v;->A0(Ljava/lang/Throwable;)Z

    iget-object p1, p0, LJ6/e$b;->s:LJ6/e;

    invoke-static {p1}, LJ6/e;->a(LJ6/e;)Lq6/b;

    move-result-object p1

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "assignCroppedBitmap: compression was interrupted, error is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lq6/b;->e(Ljava/lang/String;)V

    :goto_9a
    iget-object p0, p0, LJ6/e$b;->s:LJ6/e;

    invoke-static {p0}, LJ6/e;->a(LJ6/e;)Lq6/b;

    move-result-object p0

    const-string p1, "assignCroppedBitmap: compression end"

    invoke-virtual {p0, p1}, Lq6/b;->f(Ljava/lang/String;)V

    :cond_a5
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
