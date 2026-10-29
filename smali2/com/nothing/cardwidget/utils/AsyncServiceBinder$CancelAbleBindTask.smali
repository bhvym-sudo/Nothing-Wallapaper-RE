.class final Lcom/nothing/cardwidget/utils/AsyncServiceBinder$CancelAbleBindTask;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nothing/cardwidget/utils/AsyncServiceBinder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "CancelAbleBindTask"
.end annotation


# instance fields
.field private final markTime:J

.field private taskJob:LF8/x0;

.field final synthetic this$0:Lcom/nothing/cardwidget/utils/AsyncServiceBinder;


# direct methods
.method public constructor <init>(Lcom/nothing/cardwidget/utils/AsyncServiceBinder;J)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$CancelAbleBindTask;->this$0:Lcom/nothing/cardwidget/utils/AsyncServiceBinder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p2, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$CancelAbleBindTask;->markTime:J

    return-void
.end method


# virtual methods
.method public final begin(Ljava/util/function/Supplier;)V
    .registers 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/function/Supplier<",
            "Lh8/A;",
            ">;)V"
        }
    .end annotation

    const-string v0, "task"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LO5/g;->j()LF8/L;

    move-result-object v1

    new-instance v4, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$CancelAbleBindTask$begin$1;

    iget-object v0, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$CancelAbleBindTask;->this$0:Lcom/nothing/cardwidget/utils/AsyncServiceBinder;

    const/4 v2, 0x0

    invoke-direct {v4, p0, v0, p1, v2}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$CancelAbleBindTask$begin$1;-><init>(Lcom/nothing/cardwidget/utils/AsyncServiceBinder$CancelAbleBindTask;Lcom/nothing/cardwidget/utils/AsyncServiceBinder;Ljava/util/function/Supplier;Lm8/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    move-result-object p1

    iput-object p1, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$CancelAbleBindTask;->taskJob:LF8/x0;

    return-void
.end method

.method public final cancel()V
    .registers 3

    iget-object p0, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$CancelAbleBindTask;->taskJob:LF8/x0;

    if-eqz p0, :cond_9

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p0, v1, v0, v1}, LF8/x0$a;->a(LF8/x0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_9
    return-void
.end method

.method public final getMarkTime()J
    .registers 3

    iget-wide v0, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$CancelAbleBindTask;->markTime:J

    return-wide v0
.end method
