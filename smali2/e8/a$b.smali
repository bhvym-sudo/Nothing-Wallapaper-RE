.class Le8/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le8/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field a:I

.field final synthetic b:Le8/a;


# direct methods
.method private constructor <init>(Le8/a;)V
    .registers 2

    .line 1
    iput-object p1, p0, Le8/a$b;->b:Le8/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput p1, p0, Le8/a$b;->a:I

    return-void
.end method

.method synthetic constructor <init>(Le8/a;Le8/a$c;)V
    .registers 3

    .line 2
    invoke-direct {p0, p1}, Le8/a$b;-><init>(Le8/a;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)Z
    .registers 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "Customizable-Player"

    const/4 v3, 0x0

    :try_start_7
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "msg what:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v5, v1, Landroid/os/Message;->what:I

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, ", arg:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v5, v1, Landroid/os/Message;->arg1:I

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, ",mStatus:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v5}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v5

    invoke-virtual {v5}, Le8/d;->e()I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Ld8/d$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget v4, v1, Landroid/os/Message;->what:I
    :try_end_3b
    .catchall {:try_start_7 .. :try_end_3b} :catchall_82

    const/16 v5, 0x3fc

    const/4 v6, 0x6

    const/4 v7, 0x1

    if-eq v4, v5, :cond_53c

    const/16 v5, 0x44b

    if-eq v4, v5, :cond_50e

    const/4 v8, 0x2

    const/16 v9, 0x3ef

    const-string v10, ""

    const/16 v11, 0x3e9

    packed-switch v4, :pswitch_data_58c

    packed-switch v4, :pswitch_data_596

    goto/16 :goto_58a

    :pswitch_54
    :try_start_54
    iget-object v4, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v4}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v4

    iget v1, v1, Landroid/os/Message;->arg1:I

    iput v1, v4, Le8/d;->h:I

    iput v3, v0, Le8/a$b;->a:I

    iget-object v1, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v1}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v1

    invoke-virtual {v1}, Le8/d;->e()I

    move-result v1

    if-ne v6, v1, :cond_85

    iget-object v1, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v1}, Le8/a;->i(Le8/a;)Le8/a$d;

    move-result-object v1

    iget-object v4, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v4}, Le8/a;->i(Le8/a;)Le8/a$d;

    move-result-object v4

    const/16 v5, 0x3ed

    invoke-virtual {v4, v5}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v4

    invoke-virtual {v1, v4, v3, v7}, Le8/a$d;->b(Landroid/os/Message;IZ)Z

    goto :goto_a3

    :catchall_82
    move-exception v0

    goto/16 :goto_582

    :cond_85
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "MSG_SEEK status:"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v4}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v4

    invoke-virtual {v4}, Le8/d;->e()I

    move-result v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Ld8/d$a;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_a3
    iget-object v0, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v0}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v0

    :goto_a9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto/16 :goto_58a

    :pswitch_ae
    iget-object v1, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v1}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v1

    iput v3, v1, Le8/d;->h:I

    iget-object v1, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v1}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v1

    iput v3, v1, Le8/d;->m:I

    iget-object v1, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v1}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v1

    iput v3, v1, Le8/d;->q:I

    iput v3, v0, Le8/a$b;->a:I

    iget-object v1, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v1}, Le8/a;->i(Le8/a;)Le8/a$d;

    move-result-object v1

    iget-object v4, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v4}, Le8/a;->i(Le8/a;)Le8/a$d;

    move-result-object v4

    invoke-virtual {v4, v11}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v4

    iget-object v0, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v0}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v0

    iget v0, v0, Le8/d;->f:I

    goto/16 :goto_358

    :pswitch_e2
    iget-object v1, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v1}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    iget-object v1, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v1}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v1

    iget-wide v6, v1, Le8/d;->b:J

    sub-long/2addr v4, v6

    const-wide/16 v6, 0x0

    cmp-long v1, v4, v6

    if-gez v1, :cond_116

    const-string v1, "pause delta < 0"

    invoke-static {v2, v1}, Ld8/d$a;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v1}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v1

    iput v3, v1, Le8/d;->h:I

    iget-object v0, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v0}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v0

    invoke-virtual {v0, v8, v3}, Le8/d;->b(II)V

    goto/16 :goto_58a

    :cond_116
    iget-object v1, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v1}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v1

    iget v6, v1, Le8/d;->h:I

    int-to-long v6, v6

    add-long/2addr v6, v4

    long-to-int v4, v6

    iput v4, v1, Le8/d;->h:I

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "MSG_PAUSE mStartPosition:"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v4}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v4

    iget v4, v4, Le8/d;->h:I

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Ld8/d$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v0}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v0

    const/4 v1, 0x7

    invoke-virtual {v0, v1, v3}, Le8/d;->b(II)V

    goto/16 :goto_58a

    :pswitch_14b
    iput v3, v0, Le8/a$b;->a:I

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "MSG_START mStartPosition:"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v4}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v4

    iget v4, v4, Le8/d;->h:I

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ", lastMediaPosition:"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, v0, Le8/a$b;->a:I

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Ld8/d$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v1}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v1

    iget v1, v1, Le8/d;->h:I

    if-ltz v1, :cond_20a

    iget-object v1, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v1}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v1

    iget v1, v1, Le8/d;->h:I

    iget-object v4, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v4}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v4

    iget-object v4, v4, Le8/d;->g:Lc8/a;

    invoke-virtual {v4}, Lc8/a;->c()I

    move-result v4

    if-gt v1, v4, :cond_20a

    const-string v1, "MSG_START will generate remainder and partial pattern!"

    invoke-static {v2, v1}, Ld8/d$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v1}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v1

    iget-object v4, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v4}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v4

    iget-object v4, v4, Le8/d;->a:Ljava/lang/String;

    iget-object v8, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v8}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v8

    iget v8, v8, Le8/d;->h:I

    invoke-static {v4, v8}, Ld8/b;->n(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v1, Le8/d;->r:Ljava/lang/String;

    iget-object v1, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v1}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v1

    iget-object v1, v1, Le8/d;->r:Ljava/lang/String;

    if-nez v1, :cond_20a

    const-string v1, "null == mCurrentPlayingInfo.mRemainderHEString"

    invoke-static {v2, v1}, Ld8/d$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v1}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v1

    iget v4, v1, Le8/d;->p:I

    add-int/2addr v4, v7

    iput v4, v1, Le8/d;->p:I

    iget-object v1, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v1}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v1

    iget v1, v1, Le8/d;->c:I

    if-lt v4, v1, :cond_1ef

    const-string v1, "last loop finished!"

    invoke-static {v2, v1}, Ld8/d$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v1}, Le8/a;->i(Le8/a;)Le8/a$d;

    move-result-object v1

    iget-object v0, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v0}, Le8/a;->i(Le8/a;)Le8/a$d;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    goto/16 :goto_44a

    :cond_1ef
    iget-object v1, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v1}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v1

    invoke-virtual {v1, v6, v3}, Le8/d;->b(II)V

    iget-object v1, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v1}, Le8/a;->i(Le8/a;)Le8/a$d;

    move-result-object v1

    iget-object v0, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v0}, Le8/a;->i(Le8/a;)Le8/a$d;

    move-result-object v0

    invoke-virtual {v0, v9}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    goto/16 :goto_44a

    :cond_20a
    iget-object v1, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v1}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v1

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    iput-wide v4, v1, Le8/d;->b:J

    iget-object v1, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v1}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v1

    invoke-virtual {v1, v6, v3}, Le8/d;->b(II)V

    iget-object v1, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v1}, Le8/a;->i(Le8/a;)Le8/a$d;

    move-result-object v1

    iget-object v0, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v0}, Le8/a;->i(Le8/a;)Le8/a$d;

    move-result-object v0

    :goto_22b
    invoke-virtual {v0, v11}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    goto/16 :goto_44a

    :pswitch_231
    iget-object v0, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v0}, Le8/a;->g(Le8/a;)Le8/b;

    move-result-object v0

    invoke-interface {v0}, Le8/b;->stop()V

    goto/16 :goto_58a

    :pswitch_23c
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "MSG_PLAY_PATTERN mFreq"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v4}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v4

    iget v4, v4, Le8/d;->e:I

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ",mAmplitude:"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v4}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v4

    iget v4, v4, Le8/d;->d:I

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, "mCurrentPlayingInfo.mCurrentPatternIndex:"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v4}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v4

    iget v4, v4, Le8/d;->m:I

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Ld8/d$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v1}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v1

    invoke-virtual {v1}, Le8/d;->e()I

    move-result v1

    if-eq v6, v1, :cond_2a1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "ignore MSG_PLAY_PATTERN as status:"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v0}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v0

    invoke-virtual {v0}, Le8/d;->e()I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :goto_29b
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_561

    :cond_2a1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v4}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v4

    iget-object v4, v4, Le8/d;->o:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    iget-object v1, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v1}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v1

    iget v15, v1, Le8/d;->d:I

    iget-object v1, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v1}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v1

    iget v1, v1, Le8/d;->e:I

    iget-object v4, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v4}, Le8/a;->g(Le8/a;)Le8/b;

    move-result-object v4

    invoke-interface {v4}, Le8/b;->d()I

    move-result v17

    iget-object v4, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v4}, Le8/a;->j(Le8/a;)Ljava/util/concurrent/ExecutorService;

    move-result-object v4

    new-instance v12, Le8/a$a;

    iget-object v13, v0, Le8/a$b;->b:Le8/a;

    move/from16 v16, v1

    invoke-direct/range {v12 .. v17}, Le8/a$a;-><init>(Le8/a;Ljava/lang/String;III)V

    invoke-interface {v4, v12}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    iget-object v1, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v1}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v1

    iget v1, v1, Le8/d;->m:I

    add-int/2addr v1, v7

    iget-object v4, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v4}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v4

    invoke-virtual {v4}, Le8/d;->a()I

    move-result v4

    sub-int/2addr v4, v7

    if-gt v1, v4, :cond_313

    iget-object v1, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v1}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v1

    iget v4, v1, Le8/d;->m:I

    add-int/2addr v4, v7

    iput v4, v1, Le8/d;->m:I

    iget-object v1, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v1}, Le8/a;->i(Le8/a;)Le8/a$d;

    move-result-object v1

    iget-object v0, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v0}, Le8/a;->i(Le8/a;)Le8/a$d;

    move-result-object v0

    goto/16 :goto_22b

    :cond_313
    iget-object v1, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v1}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v1

    iget v4, v1, Le8/d;->p:I

    add-int/2addr v4, v7

    iput v4, v1, Le8/d;->p:I

    iget-object v1, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v1}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v1

    iget v1, v1, Le8/d;->c:I

    if-lt v4, v1, :cond_341

    iget-object v1, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v1}, Le8/a;->i(Le8/a;)Le8/a$d;

    move-result-object v1

    iget-object v4, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v4}, Le8/a;->i(Le8/a;)Le8/a$d;

    move-result-object v4

    invoke-virtual {v4, v5}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v4

    iget-object v0, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v0}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v0

    :goto_33e
    iget v0, v0, Le8/d;->n:I

    goto :goto_358

    :cond_341
    iget-object v1, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v1}, Le8/a;->i(Le8/a;)Le8/a$d;

    move-result-object v1

    iget-object v4, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v4}, Le8/a;->i(Le8/a;)Le8/a$d;

    move-result-object v4

    invoke-virtual {v4, v9}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v4

    iget-object v0, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v0}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v0

    goto :goto_33e

    :goto_358
    invoke-virtual {v1, v4, v0, v7}, Le8/a$d;->b(Landroid/os/Message;IZ)Z

    goto/16 :goto_58a

    :pswitch_35d
    iget-object v1, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v1}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v1

    iget v1, v1, Le8/d;->m:I

    if-nez v1, :cond_373

    iget-object v1, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v1}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v1

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    iput-wide v4, v1, Le8/d;->b:J

    :cond_373
    iget-object v1, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v1}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v1

    iget-object v1, v1, Le8/d;->r:Ljava/lang/String;

    const/16 v4, 0x3ea

    if-eqz v1, :cond_44f

    iget-object v1, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v1}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v1

    iget-object v1, v1, Le8/d;->r:Ljava/lang/String;

    invoke-virtual {v10, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_44f

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "mRemainderHEString:"

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v5}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v5

    iget-object v5, v5, Le8/d;->r:Ljava/lang/String;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Ld8/d$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v1}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v1

    iget-object v5, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v5}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v5

    iget v5, v5, Le8/d;->h:I

    iput v5, v1, Le8/d;->q:I

    iget-object v1, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v1}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v1

    iget-object v5, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v5}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v5

    iget-object v5, v5, Le8/d;->g:Lc8/a;

    iget-object v6, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v6}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v6

    iget v6, v6, Le8/d;->h:I

    invoke-virtual {v5, v6}, Lc8/a;->d(I)I

    move-result v5

    iput v5, v1, Le8/d;->m:I

    iget-object v1, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v1}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v1

    iget-object v5, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v5}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v5

    iget-object v5, v5, Le8/d;->a:Ljava/lang/String;

    iget-object v6, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v6}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v6

    iget v6, v6, Le8/d;->h:I

    invoke-static {v5, v6}, Ld8/b;->t(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v5

    iput-object v5, v1, Le8/d;->o:Ljava/lang/String;

    iget-object v1, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v1}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v1

    iget-object v5, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v5}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v5

    iget-object v5, v5, Le8/d;->o:Ljava/lang/String;

    invoke-static {v5, v8}, Ld8/b;->o(Ljava/lang/String;I)I

    move-result v5

    iput v5, v1, Le8/d;->n:I

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "MSG_CHECK_NEXT_PATTERN resume paused pattern,  mCurrentPatternIndex:"

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v5}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v5

    iget v5, v5, Le8/d;->m:I

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, ",mCurrentPatternString:"

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v5}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v5

    iget-object v5, v5, Le8/d;->o:Ljava/lang/String;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Ld8/d$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v1}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v1

    const/4 v5, 0x0

    iput-object v5, v1, Le8/d;->r:Ljava/lang/String;

    iget-object v1, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v1}, Le8/a;->i(Le8/a;)Le8/a$d;

    move-result-object v1

    iget-object v0, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v0}, Le8/a;->i(Le8/a;)Le8/a$d;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    :goto_44a
    invoke-virtual {v1, v0, v3, v7}, Le8/a$d;->b(Landroid/os/Message;IZ)Z

    goto/16 :goto_58a

    :cond_44f
    iget-object v1, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v1}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v1

    iget-object v1, v1, Le8/d;->g:Lc8/a;

    iget-object v1, v1, Lc8/a;->b:Ljava/util/ArrayList;

    iget-object v5, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v5}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v5

    iget v5, v5, Le8/d;->m:I

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc8/c;

    iget v1, v1, Lc8/c;->a:I

    iget-object v5, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v5}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v5

    iget v5, v5, Le8/d;->q:I

    sub-int/2addr v1, v5

    iget-object v5, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v5}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v5

    iget-object v6, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v6}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v6

    iget-object v6, v6, Le8/d;->g:Lc8/a;

    iget-object v6, v6, Lc8/a;->b:Ljava/util/ArrayList;

    iget-object v8, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v8}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v8

    iget v8, v8, Le8/d;->m:I

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lc8/c;

    iget v6, v6, Lc8/c;->a:I

    iput v6, v5, Le8/d;->q:I

    iget-object v5, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v5}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v5

    iget-object v6, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v6}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v6

    iget-object v6, v6, Le8/d;->g:Lc8/a;

    iget-object v6, v6, Lc8/a;->b:Ljava/util/ArrayList;

    iget-object v8, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v8}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v8

    iget v8, v8, Le8/d;->m:I

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lc8/c;

    invoke-virtual {v6}, Lc8/c;->a()I

    move-result v6

    iput v6, v5, Le8/d;->n:I

    iget-object v5, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v5}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v5

    iget-object v6, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v6}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v6

    iget-object v6, v6, Le8/d;->g:Lc8/a;

    iget-object v6, v6, Lc8/a;->b:Ljava/util/ArrayList;

    iget-object v8, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v8}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v8

    iget v8, v8, Le8/d;->m:I

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lc8/c;

    invoke-static {v6, v7}, Ld8/b;->d(Lc8/c;Z)Ljava/lang/String;

    move-result-object v6

    iput-object v6, v5, Le8/d;->o:Ljava/lang/String;

    iget-object v5, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v5}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "will play pattern after waitTime :"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5}, Ld8/d$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v5, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v5}, Le8/a;->i(Le8/a;)Le8/a$d;

    move-result-object v5

    iget-object v0, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v0}, Le8/a;->i(Le8/a;)Le8/a$d;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v5, v0, v1, v7}, Le8/a$d;->b(Landroid/os/Message;IZ)Z

    goto/16 :goto_58a

    :cond_50e
    iget-object v1, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v1}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v1

    iput v3, v1, Le8/d;->h:I

    iget-object v1, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v1}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v1

    iput v3, v1, Le8/d;->m:I

    iget-object v1, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v1}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v1

    iput v3, v1, Le8/d;->p:I

    iget-object v1, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v1}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v1

    iput v3, v1, Le8/d;->q:I

    iput v3, v0, Le8/a$b;->a:I

    iget-object v0, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v0}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v0

    const/16 v1, 0x9

    invoke-virtual {v0, v1, v3}, Le8/d;->b(II)V

    goto :goto_58a

    :cond_53c
    iget-object v1, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v1}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v1

    invoke-virtual {v1}, Le8/d;->e()I

    move-result v1

    if-eq v6, v1, :cond_565

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "ignore MSG_SYNC_WITH_MEDIA as status:"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v0}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v0

    invoke-virtual {v0}, Le8/d;->e()I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    goto/16 :goto_29b

    :goto_561
    invoke-static {v2, v0}, Ld8/d$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_58a

    :cond_565
    iget-object v1, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v1}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v1

    iget v1, v1, Le8/d;->m:I

    iget-object v4, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v4}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v4

    invoke-virtual {v4}, Le8/d;->a()I

    move-result v4

    sub-int/2addr v4, v7

    if-gt v1, v4, :cond_58a

    iget-object v0, v0, Le8/a$b;->b:Le8/a;

    invoke-static {v0}, Le8/a;->h(Le8/a;)Le8/d;

    move-result-object v0
    :try_end_580
    .catchall {:try_start_54 .. :try_end_580} :catchall_82

    goto/16 :goto_a9

    :goto_582
    const-string v1, "checking it\uff01\uff01\uff01"

    invoke-static {v2, v1}, Ld8/d$a;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_58a
    :goto_58a
    return v3

    nop

    :pswitch_data_58c
    .packed-switch 0x3e9
        :pswitch_35d
        :pswitch_23c
        :pswitch_231
    .end packed-switch

    :pswitch_data_596
    .packed-switch 0x3ed
        :pswitch_14b
        :pswitch_e2
        :pswitch_ae
        :pswitch_54
    .end packed-switch
.end method
