.class final LA6/c$c;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LA6/c;->t0(Ljava/lang/String;Landroid/app/WallpaperColors;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:Landroid/os/Bundle;

.field final synthetic s:LA6/c;

.field final synthetic t:Ljava/lang/StringBuilder;

.field final synthetic u:J

.field final synthetic v:Ljava/io/File;


# direct methods
.method constructor <init>(Landroid/os/Bundle;LA6/c;Ljava/lang/StringBuilder;JLjava/io/File;Lm8/e;)V
    .registers 8

    iput-object p1, p0, LA6/c$c;->r:Landroid/os/Bundle;

    iput-object p2, p0, LA6/c$c;->s:LA6/c;

    iput-object p3, p0, LA6/c$c;->t:Ljava/lang/StringBuilder;

    iput-wide p4, p0, LA6/c$c;->u:J

    iput-object p6, p0, LA6/c$c;->v:Ljava/io/File;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 11

    new-instance v0, LA6/c$c;

    iget-object v1, p0, LA6/c$c;->r:Landroid/os/Bundle;

    iget-object v2, p0, LA6/c$c;->s:LA6/c;

    iget-object v3, p0, LA6/c$c;->t:Ljava/lang/StringBuilder;

    iget-wide v4, p0, LA6/c$c;->u:J

    iget-object v6, p0, LA6/c$c;->v:Ljava/io/File;

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, LA6/c$c;-><init>(Landroid/os/Bundle;LA6/c;Ljava/lang/StringBuilder;JLjava/io/File;Lm8/e;)V

    return-object v0
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, LA6/c$c;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LA6/c$c;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LA6/c$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LA6/c$c;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 13

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LA6/c$c;->q:I

    const/4 v2, 0x1

    if-eqz v1, :cond_17

    if-ne v1, v2, :cond_f

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_35

    :cond_f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_17
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    new-instance v3, LA6/c$c$a;

    iget-object v4, p0, LA6/c$c;->r:Landroid/os/Bundle;

    iget-object v5, p0, LA6/c$c;->s:LA6/c;

    iget-object v6, p0, LA6/c$c;->t:Ljava/lang/StringBuilder;

    iget-wide v7, p0, LA6/c$c;->u:J

    iget-object v9, p0, LA6/c$c;->v:Ljava/io/File;

    const/4 v10, 0x0

    invoke-direct/range {v3 .. v10}, LA6/c$c$a;-><init>(Landroid/os/Bundle;LA6/c;Ljava/lang/StringBuilder;JLjava/io/File;Lm8/e;)V

    iput v2, p0, LA6/c$c;->q:I

    const-wide/16 v1, 0x1388

    invoke-static {v1, v2, v3, p0}, LF8/Y0;->c(JLv8/p;Lm8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_35

    return-object v0

    :cond_35
    :goto_35
    check-cast p1, Ljava/lang/Boolean;

    if-eqz p1, :cond_3e

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    goto :goto_58

    :cond_3e
    iget-object p1, p0, LA6/c$c;->t:Ljava/lang/StringBuilder;

    iget-object p0, p0, LA6/c$c;->s:LA6/c;

    const-string v0, "timeout from blur done."

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, LA6/c;->g(LA6/c;)Lq6/b;

    move-result-object p0

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "toString(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lq6/b;->e(Ljava/lang/String;)V

    const/4 p0, 0x0

    :goto_58
    invoke-static {p0}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method
