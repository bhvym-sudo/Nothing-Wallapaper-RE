.class final synthetic LH8/e$c;
.super Lkotlin/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH8/e;->N(Lv8/l;)LC8/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Object;)V
    .registers 9

    const-string v5, "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V"

    const/4 v6, 0x0

    const/4 v1, 0x3

    const-class v3, LH8/e;

    const-string v4, "onCancellationChannelResultImplDoNotCall"

    move-object v0, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/l;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    check-cast p1, Ljava/lang/Throwable;

    check-cast p2, LH8/k;

    invoke-virtual {p2}, LH8/k;->k()Ljava/lang/Object;

    move-result-object p2

    check-cast p3, Lm8/i;

    invoke-virtual {p0, p1, p2, p3}, LH8/e$c;->g(Ljava/lang/Throwable;Ljava/lang/Object;Lm8/i;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public final g(Ljava/lang/Throwable;Ljava/lang/Object;Lm8/i;)V
    .registers 4

    iget-object p0, p0, Lkotlin/jvm/internal/d;->receiver:Ljava/lang/Object;

    check-cast p0, LH8/e;

    invoke-static {p0, p1, p2, p3}, LH8/e;->y(LH8/e;Ljava/lang/Throwable;Ljava/lang/Object;Lm8/i;)V

    return-void
.end method
