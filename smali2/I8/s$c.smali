.class final LI8/s$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI8/s;->b(LI8/f;LI8/g;Lm8/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic q:LI8/g;

.field final synthetic r:Lkotlin/jvm/internal/E;


# direct methods
.method constructor <init>(LI8/g;Lkotlin/jvm/internal/E;)V
    .registers 3

    iput-object p1, p0, LI8/s$c;->q:LI8/g;

    iput-object p2, p0, LI8/s$c;->r:Lkotlin/jvm/internal/E;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
    .registers 7

    instance-of v0, p2, LI8/s$c$a;

    if-eqz v0, :cond_13

    move-object v0, p2

    check-cast v0, LI8/s$c$a;

    iget v1, v0, LI8/s$c$a;->t:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_13

    sub-int/2addr v1, v2

    iput v1, v0, LI8/s$c$a;->t:I

    goto :goto_18

    :cond_13
    new-instance v0, LI8/s$c$a;

    invoke-direct {v0, p0, p2}, LI8/s$c$a;-><init>(LI8/s$c;Lm8/e;)V

    :goto_18
    iget-object p2, v0, LI8/s$c$a;->r:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LI8/s$c$a;->t:I

    const/4 v3, 0x1

    if-eqz v2, :cond_37

    if-ne v2, v3, :cond_2f

    iget-object p0, v0, LI8/s$c$a;->q:Ljava/lang/Object;

    check-cast p0, LI8/s$c;

    :try_start_29
    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V
    :try_end_2c
    .catchall {:try_start_29 .. :try_end_2c} :catchall_2d

    goto :goto_47

    :catchall_2d
    move-exception p1

    goto :goto_4a

    :cond_2f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_37
    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    :try_start_3a
    iget-object p2, p0, LI8/s$c;->q:LI8/g;

    iput-object p0, v0, LI8/s$c$a;->q:Ljava/lang/Object;

    iput v3, v0, LI8/s$c$a;->t:I

    invoke-interface {p2, p1, v0}, LI8/g;->b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p0
    :try_end_44
    .catchall {:try_start_3a .. :try_end_44} :catchall_2d

    if-ne p0, v1, :cond_47

    return-object v1

    :cond_47
    :goto_47
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :goto_4a
    iget-object p0, p0, LI8/s$c;->r:Lkotlin/jvm/internal/E;

    iput-object p1, p0, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    throw p1
.end method
