.class final Lcom/nothing/cardwidget/utils/AsyncServiceBinder$CancelAbleBindTask$begin$1;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nothing/cardwidget/utils/AsyncServiceBinder$CancelAbleBindTask;->begin(Ljava/util/function/Supplier;)V
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
    c = "com.nothing.cardwidget.utils.AsyncServiceBinder$CancelAbleBindTask$begin$1"
    f = "AsyncServiceBinder.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $task:Ljava/util/function/Supplier;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/function/Supplier<",
            "Lh8/A;",
            ">;"
        }
    .end annotation
.end field

.field private synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/nothing/cardwidget/utils/AsyncServiceBinder$CancelAbleBindTask;

.field final synthetic this$1:Lcom/nothing/cardwidget/utils/AsyncServiceBinder;


# direct methods
.method constructor <init>(Lcom/nothing/cardwidget/utils/AsyncServiceBinder$CancelAbleBindTask;Lcom/nothing/cardwidget/utils/AsyncServiceBinder;Ljava/util/function/Supplier;Lm8/e;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nothing/cardwidget/utils/AsyncServiceBinder$CancelAbleBindTask;",
            "Lcom/nothing/cardwidget/utils/AsyncServiceBinder;",
            "Ljava/util/function/Supplier<",
            "Lh8/A;",
            ">;",
            "Lm8/e<",
            "-",
            "Lcom/nothing/cardwidget/utils/AsyncServiceBinder$CancelAbleBindTask$begin$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$CancelAbleBindTask$begin$1;->this$0:Lcom/nothing/cardwidget/utils/AsyncServiceBinder$CancelAbleBindTask;

    iput-object p2, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$CancelAbleBindTask$begin$1;->this$1:Lcom/nothing/cardwidget/utils/AsyncServiceBinder;

    iput-object p3, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$CancelAbleBindTask$begin$1;->$task:Ljava/util/function/Supplier;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 6
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

    new-instance v0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$CancelAbleBindTask$begin$1;

    iget-object v1, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$CancelAbleBindTask$begin$1;->this$0:Lcom/nothing/cardwidget/utils/AsyncServiceBinder$CancelAbleBindTask;

    iget-object v2, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$CancelAbleBindTask$begin$1;->this$1:Lcom/nothing/cardwidget/utils/AsyncServiceBinder;

    iget-object p0, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$CancelAbleBindTask$begin$1;->$task:Ljava/util/function/Supplier;

    invoke-direct {v0, v1, v2, p0, p2}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$CancelAbleBindTask$begin$1;-><init>(Lcom/nothing/cardwidget/utils/AsyncServiceBinder$CancelAbleBindTask;Lcom/nothing/cardwidget/utils/AsyncServiceBinder;Ljava/util/function/Supplier;Lm8/e;)V

    iput-object p1, v0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$CancelAbleBindTask$begin$1;->L$0:Ljava/lang/Object;

    return-object v0
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
    invoke-virtual {p0, p1, p2}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$CancelAbleBindTask$begin$1;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$CancelAbleBindTask$begin$1;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$CancelAbleBindTask$begin$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$CancelAbleBindTask$begin$1;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 7

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    iget v0, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$CancelAbleBindTask$begin$1;->label:I

    if-nez v0, :cond_4e

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$CancelAbleBindTask$begin$1;->L$0:Ljava/lang/Object;

    check-cast p1, LF8/L;

    # getter for: Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->TASK_LOCK:Ljava/lang/Object;
    invoke-static {}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->access$getTASK_LOCK$cp()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$CancelAbleBindTask$begin$1;->this$0:Lcom/nothing/cardwidget/utils/AsyncServiceBinder$CancelAbleBindTask;

    iget-object v2, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$CancelAbleBindTask$begin$1;->this$1:Lcom/nothing/cardwidget/utils/AsyncServiceBinder;

    iget-object p0, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$CancelAbleBindTask$begin$1;->$task:Ljava/util/function/Supplier;

    monitor-enter v0

    :try_start_19
    invoke-virtual {v1}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$CancelAbleBindTask;->getMarkTime()J

    move-result-wide v3

    # getter for: Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->taskTimeMark:Ljava/util/concurrent/atomic/AtomicLong;
    invoke-static {v2}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->access$getTaskTimeMark$p(Lcom/nothing/cardwidget/utils/AsyncServiceBinder;)Ljava/util/concurrent/atomic/AtomicLong;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v1

    cmp-long v1, v3, v1

    if-ltz v1, :cond_48

    invoke-static {p1}, LF8/M;->f(LF8/L;)V

    invoke-interface {p0}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    const-string p1, "AsyncServiceBinder"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Bind task run over, task = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_45
    .catchall {:try_start_19 .. :try_end_45} :catchall_46

    goto :goto_48

    :catchall_46
    move-exception p0

    goto :goto_4c

    :cond_48
    :goto_48
    monitor-exit v0

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :goto_4c
    monitor-exit v0

    throw p0

    :cond_4e
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
