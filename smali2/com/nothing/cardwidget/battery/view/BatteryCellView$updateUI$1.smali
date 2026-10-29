.class final Lcom/nothing/cardwidget/battery/view/BatteryCellView$updateUI$1;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nothing/cardwidget/battery/view/BatteryCellView;->updateUI(LM5/a;)V
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
    c = "com.nothing.cardwidget.battery.view.BatteryCellView$updateUI$1"
    f = "BatteryCellView.kt"
    l = {
        0x87
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $batteryInfo:LM5/a;

.field label:I

.field final synthetic this$0:Lcom/nothing/cardwidget/battery/view/BatteryCellView;


# direct methods
.method constructor <init>(Lcom/nothing/cardwidget/battery/view/BatteryCellView;LM5/a;Lm8/e;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nothing/cardwidget/battery/view/BatteryCellView;",
            "LM5/a;",
            "Lm8/e<",
            "-",
            "Lcom/nothing/cardwidget/battery/view/BatteryCellView$updateUI$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView$updateUI$1;->this$0:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    iput-object p2, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView$updateUI$1;->$batteryInfo:LM5/a;

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

    new-instance p1, Lcom/nothing/cardwidget/battery/view/BatteryCellView$updateUI$1;

    iget-object v0, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView$updateUI$1;->this$0:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    iget-object p0, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView$updateUI$1;->$batteryInfo:LM5/a;

    invoke-direct {p1, v0, p0, p2}, Lcom/nothing/cardwidget/battery/view/BatteryCellView$updateUI$1;-><init>(Lcom/nothing/cardwidget/battery/view/BatteryCellView;LM5/a;Lm8/e;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/nothing/cardwidget/battery/view/BatteryCellView$updateUI$1;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView$updateUI$1;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Lcom/nothing/cardwidget/battery/view/BatteryCellView$updateUI$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Lcom/nothing/cardwidget/battery/view/BatteryCellView$updateUI$1;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 5

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView$updateUI$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_17

    if-ne v1, v2, :cond_f

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_2b

    :cond_f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_17
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView$updateUI$1;->this$0:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    # getter for: Lcom/nothing/cardwidget/battery/view/BatteryCellView;->indicatorUpdateFilter:LI8/z;
    invoke-static {p1}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->access$getIndicatorUpdateFilter$p(Lcom/nothing/cardwidget/battery/view/BatteryCellView;)LI8/z;

    move-result-object p1

    iget-object v1, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView$updateUI$1;->$batteryInfo:LM5/a;

    iput v2, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView$updateUI$1;->label:I

    invoke-interface {p1, v1, p0}, LI8/z;->b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_2b

    return-object v0

    :cond_2b
    :goto_2b
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
