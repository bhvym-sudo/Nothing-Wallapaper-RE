.class final LA6/c$c$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LA6/c$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic A:Ljava/io/File;

.field q:Ljava/lang/Object;

.field r:Ljava/lang/Object;

.field s:Ljava/lang/Object;

.field t:Ljava/lang/Object;

.field u:J

.field v:I

.field final synthetic w:Landroid/os/Bundle;

.field final synthetic x:LA6/c;

.field final synthetic y:Ljava/lang/StringBuilder;

.field final synthetic z:J


# direct methods
.method constructor <init>(Landroid/os/Bundle;LA6/c;Ljava/lang/StringBuilder;JLjava/io/File;Lm8/e;)V
    .registers 8

    iput-object p1, p0, LA6/c$c$a;->w:Landroid/os/Bundle;

    iput-object p2, p0, LA6/c$c$a;->x:LA6/c;

    iput-object p3, p0, LA6/c$c$a;->y:Ljava/lang/StringBuilder;

    iput-wide p4, p0, LA6/c$c$a;->z:J

    iput-object p6, p0, LA6/c$c$a;->A:Ljava/io/File;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 11

    new-instance v0, LA6/c$c$a;

    iget-object v1, p0, LA6/c$c$a;->w:Landroid/os/Bundle;

    iget-object v2, p0, LA6/c$c$a;->x:LA6/c;

    iget-object v3, p0, LA6/c$c$a;->y:Ljava/lang/StringBuilder;

    iget-wide v4, p0, LA6/c$c$a;->z:J

    iget-object v6, p0, LA6/c$c$a;->A:Ljava/io/File;

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, LA6/c$c$a;-><init>(Landroid/os/Bundle;LA6/c;Ljava/lang/StringBuilder;JLjava/io/File;Lm8/e;)V

    return-object v0
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, LA6/c$c$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LA6/c$c$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LA6/c$c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LA6/c$c$a;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 12

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LA6/c$c$a;->v:I

    const/4 v2, 0x1

    if-eqz v1, :cond_27

    if-ne v1, v2, :cond_1f

    iget-object v0, p0, LA6/c$c$a;->t:Ljava/lang/Object;

    check-cast v0, Ljava/io/File;

    iget-object v0, p0, LA6/c$c$a;->s:Ljava/lang/Object;

    check-cast v0, Ljava/lang/StringBuilder;

    iget-object v0, p0, LA6/c$c$a;->r:Ljava/lang/Object;

    check-cast v0, LA6/c;

    iget-object p0, p0, LA6/c$c$a;->q:Ljava/lang/Object;

    check-cast p0, Landroid/os/Bundle;

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    return-object p1

    :cond_1f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_27
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LA6/c$c$a;->w:Landroid/os/Bundle;

    iget-object v1, p0, LA6/c$c$a;->x:LA6/c;

    iget-object v3, p0, LA6/c$c$a;->y:Ljava/lang/StringBuilder;

    iget-wide v4, p0, LA6/c$c$a;->z:J

    iget-object v6, p0, LA6/c$c$a;->A:Ljava/io/File;

    iput-object p1, p0, LA6/c$c$a;->q:Ljava/lang/Object;

    iput-object v1, p0, LA6/c$c$a;->r:Ljava/lang/Object;

    iput-object v3, p0, LA6/c$c$a;->s:Ljava/lang/Object;

    iput-object v6, p0, LA6/c$c$a;->t:Ljava/lang/Object;

    iput-wide v4, p0, LA6/c$c$a;->u:J

    iput v2, p0, LA6/c$c$a;->v:I

    new-instance v7, LF8/n;

    invoke-static {p0}, Ln8/b;->c(Lm8/e;)Lm8/e;

    move-result-object v8

    invoke-direct {v7, v8, v2}, LF8/n;-><init>(Lm8/e;I)V

    invoke-virtual {v7}, LF8/n;->G()V

    new-instance v2, LA6/c$c$a$a;

    invoke-direct {v2, v1, v6, v7}, LA6/c$c$a$a;-><init>(LA6/c;Ljava/io/File;LF8/l;)V

    const-string v6, "blur_messenger"

    invoke-virtual {p1, v6, v2}, Landroid/os/Bundle;->putBinder(Ljava/lang/String;Landroid/os/IBinder;)V

    :try_start_56
    invoke-static {v1}, LA6/c;->b(LA6/c;)Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    invoke-static {}, LA6/c;->a()Landroid/net/Uri;

    move-result-object v6

    new-instance v8, Landroid/content/ContentValues;

    invoke-direct {v8}, Landroid/content/ContentValues;-><init>()V

    invoke-virtual {v2, v6, v8, p1}, Landroid/content/ContentResolver;->update(Landroid/net/Uri;Landroid/content/ContentValues;Landroid/os/Bundle;)I

    move-result p1

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/b;->c(I)Ljava/lang/Integer;

    move-result-object p1
    :try_end_6f
    .catch Ljava/lang/IllegalArgumentException; {:try_start_56 .. :try_end_6f} :catch_70

    goto :goto_8f

    :catch_70
    move-exception p1

    invoke-static {v1}, LA6/c;->g(LA6/c;)Lq6/b;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "update exception:"

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Lq6/b;->e(Ljava/lang/String;)V

    sget-object p1, Lh8/A;->a:Lh8/A;

    :goto_8f
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    sub-long/2addr v8, v4

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "result "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", consume "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v1}, LA6/c;->g(LA6/c;)Lq6/b;

    move-result-object p1

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "toString(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Lq6/b;->d(Ljava/lang/String;)V

    invoke-virtual {v7}, LF8/n;->A()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    if-ne p1, v1, :cond_cd

    invoke-static {p0}, Lkotlin/coroutines/jvm/internal/h;->c(Lm8/e;)V

    :cond_cd
    if-ne p1, v0, :cond_d0

    return-object v0

    :cond_d0
    return-object p1
.end method
