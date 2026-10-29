.class final Lg6/c$c;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg6/c;->i(Lm8/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:Lg6/c;


# direct methods
.method constructor <init>(Lg6/c;Lm8/e;)V
    .registers 3

    iput-object p1, p0, Lg6/c$c;->r:Lg6/c;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 3

    new-instance p1, Lg6/c$c;

    iget-object p0, p0, Lg6/c$c;->r:Lg6/c;

    invoke-direct {p1, p0, p2}, Lg6/c$c;-><init>(Lg6/c;Lm8/e;)V

    return-object p1
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, Lg6/c$c;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Lg6/c$c;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Lg6/c$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Lg6/c$c;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    iget v0, p0, Lg6/c$c;->q:I

    if-nez v0, :cond_39

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    invoke-static {}, Lg6/a;->a()Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_21

    iget-object p0, p0, Lg6/c$c;->r:Lg6/c;

    invoke-virtual {p0}, Lg6/c;->f()Landroid/os/Vibrator;

    move-result-object p0

    invoke-static {v0}, Landroid/os/VibrationEffect;->createPredefined(I)Landroid/os/VibrationEffect;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/os/Vibrator;->vibrate(Landroid/os/VibrationEffect;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_21
    iget-object p1, p0, Lg6/c$c;->r:Lg6/c;

    invoke-virtual {p1}, Lg6/c;->h()Z

    move-result p1

    if-nez p1, :cond_36

    iget-object p0, p0, Lg6/c$c;->r:Lg6/c;

    invoke-virtual {p0}, Lg6/c;->f()Landroid/os/Vibrator;

    move-result-object p0

    invoke-static {v0}, Landroid/os/VibrationEffect;->createPredefined(I)Landroid/os/VibrationEffect;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/os/Vibrator;->vibrate(Landroid/os/VibrationEffect;)V

    :cond_36
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_39
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
