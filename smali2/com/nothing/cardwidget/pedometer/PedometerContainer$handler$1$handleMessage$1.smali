.class final Lcom/nothing/cardwidget/pedometer/PedometerContainer$handler$1$handleMessage$1;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nothing/cardwidget/pedometer/PedometerContainer$handler$1;->handleMessage(Landroid/os/Message;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/l;",
        "Lv8/p;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "com.nothing.cardwidget.pedometer.PedometerContainer$handler$1$handleMessage$1"
    f = "PedometerContainer.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $animationType:I

.field label:I

.field final synthetic this$0:Lcom/nothing/cardwidget/pedometer/PedometerContainer;


# direct methods
.method constructor <init>(Lcom/nothing/cardwidget/pedometer/PedometerContainer;ILm8/e;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nothing/cardwidget/pedometer/PedometerContainer;",
            "I",
            "Lm8/e<",
            "-",
            "Lcom/nothing/cardwidget/pedometer/PedometerContainer$handler$1$handleMessage$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer$handler$1$handleMessage$1;->this$0:Lcom/nothing/cardwidget/pedometer/PedometerContainer;

    iput p2, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer$handler$1$handleMessage$1;->$animationType:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lm8/e<",
            "*>;)",
            "Lm8/e<",
            "Lh8/A;",
            ">;"
        }
    .end annotation

    new-instance p1, Lcom/nothing/cardwidget/pedometer/PedometerContainer$handler$1$handleMessage$1;

    iget-object v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer$handler$1$handleMessage$1;->this$0:Lcom/nothing/cardwidget/pedometer/PedometerContainer;

    iget p0, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer$handler$1$handleMessage$1;->$animationType:I

    invoke-direct {p1, v0, p0, p2}, Lcom/nothing/cardwidget/pedometer/PedometerContainer$handler$1$handleMessage$1;-><init>(Lcom/nothing/cardwidget/pedometer/PedometerContainer;ILm8/e;)V

    return-object p1
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LF8/L;",
            "Lm8/e<",
            "-",
            "Lh8/A;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/nothing/cardwidget/pedometer/PedometerContainer$handler$1$handleMessage$1;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer$handler$1$handleMessage$1;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Lcom/nothing/cardwidget/pedometer/PedometerContainer$handler$1$handleMessage$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Lcom/nothing/cardwidget/pedometer/PedometerContainer$handler$1$handleMessage$1;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 5

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    iget v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer$handler$1$handleMessage$1;->label:I

    if-nez v0, :cond_25

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer$handler$1$handleMessage$1;->this$0:Lcom/nothing/cardwidget/pedometer/PedometerContainer;

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget p0, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer$handler$1$handleMessage$1;->$animationType:I

    const-string v1, "method_page_changed"

    const-string v2, "method_animation_end"

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "key_animation_flag"

    invoke-virtual {v0, v1, p0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    invoke-virtual {p1, v0}, Lcom/nothing/cardwidget/RemoteServiceView;->callRemoteService(Landroid/os/Bundle;)Landroid/os/Bundle;

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_25
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
