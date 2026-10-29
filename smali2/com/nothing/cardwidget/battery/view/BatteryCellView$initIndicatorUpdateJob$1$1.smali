.class final Lcom/nothing/cardwidget/battery/view/BatteryCellView$initIndicatorUpdateJob$1$1;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nothing/cardwidget/battery/view/BatteryCellView$initIndicatorUpdateJob$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.nothing.cardwidget.battery.view.BatteryCellView$initIndicatorUpdateJob$1$1"
    f = "BatteryCellView.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/nothing/cardwidget/battery/view/BatteryCellView;


# direct methods
.method constructor <init>(Lcom/nothing/cardwidget/battery/view/BatteryCellView;Lm8/e;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nothing/cardwidget/battery/view/BatteryCellView;",
            "Lm8/e<",
            "-",
            "Lcom/nothing/cardwidget/battery/view/BatteryCellView$initIndicatorUpdateJob$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView$initIndicatorUpdateJob$1$1;->this$0:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

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

    new-instance v0, Lcom/nothing/cardwidget/battery/view/BatteryCellView$initIndicatorUpdateJob$1$1;

    iget-object p0, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView$initIndicatorUpdateJob$1$1;->this$0:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    invoke-direct {v0, p0, p2}, Lcom/nothing/cardwidget/battery/view/BatteryCellView$initIndicatorUpdateJob$1$1;-><init>(Lcom/nothing/cardwidget/battery/view/BatteryCellView;Lm8/e;)V

    iput-object p1, v0, Lcom/nothing/cardwidget/battery/view/BatteryCellView$initIndicatorUpdateJob$1$1;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(LM5/a;Lm8/e;)Ljava/lang/Object;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LM5/a;",
            "Lm8/e<",
            "-",
            "Lh8/A;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/nothing/cardwidget/battery/view/BatteryCellView$initIndicatorUpdateJob$1$1;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView$initIndicatorUpdateJob$1$1;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Lcom/nothing/cardwidget/battery/view/BatteryCellView$initIndicatorUpdateJob$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LM5/a;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Lcom/nothing/cardwidget/battery/view/BatteryCellView$initIndicatorUpdateJob$1$1;->invoke(LM5/a;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    iget v0, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView$initIndicatorUpdateJob$1$1;->label:I

    if-nez v0, :cond_1e

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView$initIndicatorUpdateJob$1$1;->L$0:Ljava/lang/Object;

    check-cast p1, LM5/a;

    iget-object v0, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView$initIndicatorUpdateJob$1$1;->this$0:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    # getter for: Lcom/nothing/cardwidget/battery/view/BatteryCellView;->batteryIndicatorIv:Landroid/widget/ImageView;
    invoke-static {v0}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->access$getBatteryIndicatorIv$p(Lcom/nothing/cardwidget/battery/view/BatteryCellView;)Landroid/widget/ImageView;

    move-result-object v0

    if-eqz v0, :cond_1b

    iget-object p0, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView$initIndicatorUpdateJob$1$1;->this$0:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    # invokes: Lcom/nothing/cardwidget/battery/view/BatteryCellView;->setBatteryIndicator(Landroid/widget/ImageView;LM5/a;)V
    invoke-static {p0, v0, p1}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->access$setBatteryIndicator(Lcom/nothing/cardwidget/battery/view/BatteryCellView;Landroid/widget/ImageView;LM5/a;)V

    :cond_1b
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_1e
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
