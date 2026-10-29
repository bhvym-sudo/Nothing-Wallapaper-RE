.class final LA6/c$d;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LA6/c;->A0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:LA6/c;


# direct methods
.method constructor <init>(LA6/c;Lm8/e;)V
    .registers 3

    iput-object p1, p0, LA6/c$d;->r:LA6/c;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 3

    new-instance p1, LA6/c$d;

    iget-object p0, p0, LA6/c$d;->r:LA6/c;

    invoke-direct {p1, p0, p2}, LA6/c$d;-><init>(LA6/c;Lm8/e;)V

    return-object p1
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, LA6/c$d;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LA6/c$d;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LA6/c$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LA6/c$d;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 7

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    iget v0, p0, LA6/c$d;->q:I

    if-nez v0, :cond_5b

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    :try_start_a
    iget-object p1, p0, LA6/c$d;->r:LA6/c;

    invoke-static {p1}, LA6/c;->b(LA6/c;)Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p1

    invoke-static {}, LA6/c;->a()Landroid/net/Uri;

    move-result-object v0

    new-instance v1, Landroid/content/ContentValues;

    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    iget-object v2, p0, LA6/c$d;->r:LA6/c;

    const-string v3, "clean_preview"

    invoke-static {v2}, LA6/c;->f(LA6/c;)Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    if-nez v2, :cond_31

    const-string v2, "groupField"

    invoke-static {v2}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v2, v4

    goto :goto_31

    :catch_2f
    move-exception p1

    goto :goto_3a

    :cond_31
    :goto_31
    invoke-virtual {v1, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v2, Lh8/A;->a:Lh8/A;

    invoke-virtual {p1, v0, v1, v4}, Landroid/content/ContentResolver;->update(Landroid/net/Uri;Landroid/content/ContentValues;Landroid/os/Bundle;)I
    :try_end_39
    .catch Ljava/lang/IllegalArgumentException; {:try_start_a .. :try_end_39} :catch_2f

    goto :goto_58

    :goto_3a
    iget-object p0, p0, LA6/c$d;->r:LA6/c;

    invoke-static {p0}, LA6/c;->g(LA6/c;)Lq6/b;

    move-result-object p0

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "update exception:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lq6/b;->e(Ljava/lang/String;)V

    :goto_58
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_5b
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
