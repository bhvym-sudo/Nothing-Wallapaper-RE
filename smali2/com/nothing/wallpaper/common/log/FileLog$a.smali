.class Lcom/nothing/wallpaper/common/log/FileLog$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nothing/wallpaper/common/log/FileLog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/io/PrintWriter;


# direct methods
.method private constructor <init>()V
    .registers 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/nothing/wallpaper/common/log/FileLog$a;->a:Ljava/lang/String;

    .line 4
    iput-object v0, p0, Lcom/nothing/wallpaper/common/log/FileLog$a;->b:Ljava/io/PrintWriter;

    return-void
.end method

.method synthetic constructor <init>(Lcom/nothing/wallpaper/common/log/b;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Lcom/nothing/wallpaper/common/log/FileLog$a;-><init>()V

    return-void
.end method

.method private a()V
    .registers 2

    iget-object v0, p0, Lcom/nothing/wallpaper/common/log/FileLog$a;->b:Ljava/io/PrintWriter;

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Ljava/io/PrintWriter;->close()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/nothing/wallpaper/common/log/FileLog$a;->b:Ljava/io/PrintWriter;

    :cond_a
    return-void
.end method

.method private b(IJ)V
    .registers 5

    invoke-static {}, Lcom/nothing/wallpaper/common/log/FileLog;->a()Ljava/text/DateFormat;

    move-result-object p0

    monitor-enter p0

    :try_start_5
    invoke-static {}, Lcom/nothing/wallpaper/common/log/FileLog;->c()Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_14

    invoke-virtual {v0, p1}, Landroid/os/Handler;->removeMessages(I)V

    invoke-virtual {v0, p1, p2, p3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_14

    :catchall_12
    move-exception p1

    goto :goto_16

    :cond_14
    :goto_14
    monitor-exit p0

    return-void

    :goto_16
    monitor-exit p0
    :try_end_17
    .catchall {:try_start_5 .. :try_end_17} :catchall_12

    throw p1
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)Z
    .registers 12

    invoke-static {}, Lcom/nothing/wallpaper/common/log/FileLog;->d()Ljava/io/File;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_d8

    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v2, 0x4

    const/4 v3, 0x2

    const/4 v4, 0x0

    if-eq v0, v1, :cond_4a

    if-eq v0, v3, :cond_46

    const/4 v3, 0x3

    if-eq v0, v3, :cond_14

    return v1

    :cond_14
    invoke-direct {p0}, Lcom/nothing/wallpaper/common/log/FileLog$a;->a()V

    iget-object p0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p0, Landroid/util/Pair;

    iget-object p1, p0, Landroid/util/Pair;->first:Ljava/lang/Object;

    if-eqz p1, :cond_3e

    :goto_1f
    if-ge v4, v2, :cond_3e

    iget-object p1, p0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast p1, Ljava/io/PrintWriter;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/nothing/wallpaper/common/log/FileLog;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/nothing/wallpaper/common/log/FileLog;->e(Ljava/io/PrintWriter;Ljava/lang/String;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1f

    :cond_3e
    iget-object p0, p0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p0, Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {p0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return v1

    :cond_46
    invoke-direct {p0}, Lcom/nothing/wallpaper/common/log/FileLog$a;->a()V

    return v1

    :cond_4a
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/nothing/wallpaper/common/log/FileLog;->b()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v6, 0x6

    invoke-virtual {v0, v6}, Ljava/util/Calendar;->get(I)I

    move-result v6

    rem-int/2addr v6, v2

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v5, p0, Lcom/nothing/wallpaper/common/log/FileLog$a;->a:Ljava/lang/String;

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_72

    invoke-direct {p0}, Lcom/nothing/wallpaper/common/log/FileLog$a;->a()V

    :cond_72
    :try_start_72
    iget-object v5, p0, Lcom/nothing/wallpaper/common/log/FileLog$a;->b:Ljava/io/PrintWriter;

    if-nez v5, :cond_ba

    iput-object v2, p0, Lcom/nothing/wallpaper/common/log/FileLog$a;->a:Ljava/lang/String;

    new-instance v5, Ljava/io/File;

    invoke-static {}, Lcom/nothing/wallpaper/common/log/FileLog;->d()Ljava/io/File;

    move-result-object v6

    invoke-direct {v5, v6, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_ae

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    invoke-virtual {v5}, Ljava/io/File;->lastModified()J

    move-result-wide v6

    invoke-virtual {v2, v6, v7}, Ljava/util/Calendar;->setTimeInMillis(J)V

    const/16 v6, 0xa

    const/16 v7, 0xa8

    invoke-virtual {v2, v6, v7}, Ljava/util/Calendar;->add(II)V

    invoke-virtual {v0, v2}, Ljava/util/Calendar;->before(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_ae

    invoke-virtual {v5}, Ljava/io/File;->length()J

    move-result-wide v6

    const-wide/32 v8, 0x1000000

    cmp-long v0, v6, v8

    if-gez v0, :cond_ae

    move v4, v1

    goto :goto_ae

    :catch_ac
    move-exception p1

    goto :goto_ce

    :cond_ae
    :goto_ae
    new-instance v0, Ljava/io/PrintWriter;

    new-instance v2, Ljava/io/FileWriter;

    invoke-direct {v2, v5, v4}, Ljava/io/FileWriter;-><init>(Ljava/io/File;Z)V

    invoke-direct {v0, v2}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    iput-object v0, p0, Lcom/nothing/wallpaper/common/log/FileLog$a;->b:Ljava/io/PrintWriter;

    :cond_ba
    iget-object v0, p0, Lcom/nothing/wallpaper/common/log/FileLog$a;->b:Ljava/io/PrintWriter;

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/nothing/wallpaper/common/log/FileLog$a;->b:Ljava/io/PrintWriter;

    invoke-virtual {p1}, Ljava/io/PrintWriter;->flush()V

    const-wide/16 v4, 0x1388

    invoke-direct {p0, v3, v4, v5}, Lcom/nothing/wallpaper/common/log/FileLog$a;->b(IJ)V
    :try_end_cd
    .catch Ljava/lang/Exception; {:try_start_72 .. :try_end_cd} :catch_ac

    goto :goto_d8

    :goto_ce
    const-string v0, "FileLog"

    const-string v2, "Error writing logs to file"

    invoke-static {v0, v2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    invoke-direct {p0}, Lcom/nothing/wallpaper/common/log/FileLog$a;->a()V

    :cond_d8
    :goto_d8
    return v1
.end method
