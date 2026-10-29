.class public final Lcom/nothing/wallpaper/common/log/FileLog;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nothing/wallpaper/common/log/FileLog$a;
    }
.end annotation


# static fields
.field private static final DATE_FORMAT:Ljava/text/DateFormat;

.field private static final ENABLED:Z = true

.field private static FILE_NAME_PREFIX:Ljava/lang/String; = "log-"

.field public static final LOG_DAYS:I = 0x4

.field private static final MAX_LOG_FILE_SIZE:J = 0x1000000L

.field private static final MAX_LOG_KEEP_TIME_HOUR:I = 0xa8

.field private static sHandler:Landroid/os/Handler;

.field private static sLogsDirectory:Ljava/io/File;

.field private static sProcess:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    const/4 v0, 0x3

    invoke-static {v0, v0}, Ljava/text/DateFormat;->getDateTimeInstance(II)Ljava/text/DateFormat;

    move-result-object v0

    sput-object v0, Lcom/nothing/wallpaper/common/log/FileLog;->DATE_FORMAT:Ljava/text/DateFormat;

    const/4 v0, 0x0

    sput-object v0, Lcom/nothing/wallpaper/common/log/FileLog;->sHandler:Landroid/os/Handler;

    sput-object v0, Lcom/nothing/wallpaper/common/log/FileLog;->sLogsDirectory:Ljava/io/File;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static bridge synthetic a()Ljava/text/DateFormat;
    .registers 1

    sget-object v0, Lcom/nothing/wallpaper/common/log/FileLog;->DATE_FORMAT:Ljava/text/DateFormat;

    return-object v0
.end method

.method static bridge synthetic b()Ljava/lang/String;
    .registers 1

    sget-object v0, Lcom/nothing/wallpaper/common/log/FileLog;->FILE_NAME_PREFIX:Ljava/lang/String;

    return-object v0
.end method

.method static bridge synthetic c()Landroid/os/Handler;
    .registers 1

    sget-object v0, Lcom/nothing/wallpaper/common/log/FileLog;->sHandler:Landroid/os/Handler;

    return-object v0
.end method

.method static bridge synthetic d()Ljava/io/File;
    .registers 1

    .line 1
    sget-object v0, Lcom/nothing/wallpaper/common/log/FileLog;->sLogsDirectory:Ljava/io/File;

    return-object v0
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;)V
    .registers 2

    .line 4
    invoke-static {p0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 5
    invoke-static {p0, p1}, Lcom/nothing/wallpaper/common/log/FileLog;->print(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V
    .registers 3

    .line 2
    invoke-static {p0, p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 3
    invoke-static {p0, p1, p2}, Lcom/nothing/wallpaper/common/log/FileLog;->print(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    return-void
.end method

.method private static dumpFile(Ljava/io/PrintWriter;Ljava/lang/String;)V
    .registers 6

    new-instance v0, Ljava/io/File;

    sget-object v1, Lcom/nothing/wallpaper/common/log/FileLog;->sLogsDirectory:Ljava/io/File;

    invoke-direct {v0, v1, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_4f

    const/4 v1, 0x0

    :try_start_e
    new-instance v2, Ljava/io/BufferedReader;

    new-instance v3, Ljava/io/FileReader;

    invoke-direct {v3, v0}, Ljava/io/FileReader;-><init>(Ljava/io/File;)V

    invoke-direct {v2, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_18
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_18} :catch_4c
    .catchall {:try_start_e .. :try_end_18} :catchall_47

    :try_start_18
    invoke-virtual {p0}, Ljava/io/PrintWriter;->println()V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "--- logfile: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " ---"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    :goto_34
    invoke-virtual {v2}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_43

    invoke-virtual {p0, p1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
    :try_end_3d
    .catch Ljava/lang/Exception; {:try_start_18 .. :try_end_3d} :catch_41
    .catchall {:try_start_18 .. :try_end_3d} :catchall_3e

    goto :goto_34

    :catchall_3e
    move-exception p0

    move-object v1, v2

    goto :goto_48

    :catch_41
    move-object v1, v2

    goto :goto_4c

    :cond_43
    invoke-static {v2}, Li6/f;->a(Ljava/io/Closeable;)V

    return-void

    :catchall_47
    move-exception p0

    :goto_48
    invoke-static {v1}, Li6/f;->a(Ljava/io/Closeable;)V

    throw p0

    :catch_4c
    :goto_4c
    invoke-static {v1}, Li6/f;->a(Ljava/io/Closeable;)V

    :cond_4f
    return-void
.end method

.method static bridge synthetic e(Ljava/io/PrintWriter;Ljava/lang/String;)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lcom/nothing/wallpaper/common/log/FileLog;->dumpFile(Ljava/io/PrintWriter;Ljava/lang/String;)V

    return-void
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;)V
    .registers 2

    .line 4
    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 5
    invoke-static {p0, p1}, Lcom/nothing/wallpaper/common/log/FileLog;->print(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V
    .registers 3

    .line 2
    invoke-static {p0, p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 3
    invoke-static {p0, p1, p2}, Lcom/nothing/wallpaper/common/log/FileLog;->print(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    return-void
.end method

.method public static flushAll(Ljava/io/PrintWriter;)Z
    .registers 7

    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    invoke-static {}, Lcom/nothing/wallpaper/common/log/FileLog;->getHandler()Landroid/os/Handler;

    move-result-object v2

    const/4 v3, 0x3

    invoke-static {p0, v0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p0

    invoke-static {v2, v3, p0}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p0

    invoke-virtual {p0}, Landroid/os/Message;->sendToTarget()V

    const-wide/16 v2, 0x2

    sget-object p0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v2, v3, p0}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->getCount()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long p0, v2, v4

    if-nez p0, :cond_28

    return v1

    :cond_28
    const/4 p0, 0x0

    return p0
.end method

.method static getHandler()Landroid/os/Handler;
    .registers 5

    sget-object v0, Lcom/nothing/wallpaper/common/log/FileLog;->DATE_FORMAT:Ljava/text/DateFormat;

    monitor-enter v0

    :try_start_3
    sget-object v1, Lcom/nothing/wallpaper/common/log/FileLog;->sHandler:Landroid/os/Handler;

    if-nez v1, :cond_1d

    new-instance v1, Landroid/os/Handler;

    const-string v2, "file-logger"

    invoke-static {v2}, Lcom/nothing/wallpaper/common/log/a;->a(Ljava/lang/String;)Landroid/os/Looper;

    move-result-object v2

    new-instance v3, Lcom/nothing/wallpaper/common/log/FileLog$a;

    const/4 v4, 0x0

    invoke-direct {v3, v4}, Lcom/nothing/wallpaper/common/log/FileLog$a;-><init>(Lcom/nothing/wallpaper/common/log/b;)V

    invoke-direct {v1, v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    sput-object v1, Lcom/nothing/wallpaper/common/log/FileLog;->sHandler:Landroid/os/Handler;

    goto :goto_1d

    :catchall_1b
    move-exception v1

    goto :goto_21

    :cond_1d
    :goto_1d
    monitor-exit v0
    :try_end_1e
    .catchall {:try_start_3 .. :try_end_1e} :catchall_1b

    sget-object v0, Lcom/nothing/wallpaper/common/log/FileLog;->sHandler:Landroid/os/Handler;

    return-object v0

    :goto_21
    :try_start_21
    monitor-exit v0
    :try_end_22
    .catchall {:try_start_21 .. :try_end_22} :catchall_1b

    throw v1
.end method

.method public static getLogFiles()[Ljava/io/File;
    .registers 7

    const/4 v0, 0x0

    :try_start_1
    invoke-static {v0}, Lcom/nothing/wallpaper/common/log/FileLog;->flushAll(Ljava/io/PrintWriter;)Z
    :try_end_4
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_4} :catch_4

    :catch_4
    const/4 v0, 0x4

    new-array v1, v0, [Ljava/io/File;

    const/4 v2, 0x0

    :goto_8
    if-ge v2, v0, :cond_27

    new-instance v3, Ljava/io/File;

    sget-object v4, Lcom/nothing/wallpaper/common/log/FileLog;->sLogsDirectory:Ljava/io/File;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v6, Lcom/nothing/wallpaper/common/log/FileLog;->FILE_NAME_PREFIX:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_8

    :cond_27
    return-object v1
.end method

.method public static i(Ljava/lang/String;Ljava/lang/String;)V
    .registers 2

    .line 3
    invoke-static {p0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    invoke-static {p0, p1}, Lcom/nothing/wallpaper/common/log/FileLog;->print(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V
    .registers 3

    .line 1
    invoke-static {p0, p1, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 2
    invoke-static {p0, p1, p2}, Lcom/nothing/wallpaper/common/log/FileLog;->print(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    return-void
.end method

.method public static print(Ljava/lang/String;Ljava/lang/String;)V
    .registers 3

    const/4 v0, 0x0

    .line 1
    invoke-static {p0, p1, v0}, Lcom/nothing/wallpaper/common/log/FileLog;->print(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    return-void
.end method

.method public static print(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V
    .registers 5

    .line 2
    sget-object v0, Lcom/nothing/wallpaper/common/log/FileLog;->DATE_FORMAT:Ljava/text/DateFormat;

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0, p0, p1}, [Ljava/lang/Object;

    move-result-object p0

    const-string p1, "%s %s %s"

    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    if-eqz p2, :cond_2f

    .line 3
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\n"

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 4
    :cond_2f
    invoke-static {}, Lcom/nothing/wallpaper/common/log/FileLog;->getHandler()Landroid/os/Handler;

    move-result-object p1

    const/4 p2, 0x1

    invoke-static {p1, p2, p0}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p0

    invoke-virtual {p0}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method public static setDir(Ljava/io/File;Ljava/lang/String;)V
    .registers 4

    sget-object v0, Lcom/nothing/wallpaper/common/log/FileLog;->DATE_FORMAT:Ljava/text/DateFormat;

    monitor-enter v0

    :try_start_3
    sget-object v1, Lcom/nothing/wallpaper/common/log/FileLog;->sHandler:Landroid/os/Handler;

    if-eqz v1, :cond_24

    sget-object v1, Lcom/nothing/wallpaper/common/log/FileLog;->sLogsDirectory:Ljava/io/File;

    invoke-virtual {p0, v1}, Ljava/io/File;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_24

    sget-object v1, Lcom/nothing/wallpaper/common/log/FileLog;->sHandler:Landroid/os/Handler;

    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    check-cast v1, Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->quit()Z

    const/4 v1, 0x0

    sput-object v1, Lcom/nothing/wallpaper/common/log/FileLog;->sHandler:Landroid/os/Handler;

    goto :goto_24

    :catchall_22
    move-exception p0

    goto :goto_57

    :cond_24
    :goto_24
    monitor-exit v0
    :try_end_25
    .catchall {:try_start_3 .. :try_end_25} :catchall_22

    sput-object p0, Lcom/nothing/wallpaper/common/log/FileLog;->sLogsDirectory:Ljava/io/File;

    sput-object p1, Lcom/nothing/wallpaper/common/log/FileLog;->sProcess:Ljava/lang/String;

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object p1, Lcom/nothing/wallpaper/common/log/FileLog;->FILE_NAME_PREFIX:Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p1, Lcom/nothing/wallpaper/common/log/FileLog;->sProcess:Ljava/lang/String;

    if-nez p1, :cond_3a

    const-string p1, ""

    goto :goto_4d

    :cond_3a
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v0, Lcom/nothing/wallpaper/common/log/FileLog;->sProcess:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "-"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_4d
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    sput-object p0, Lcom/nothing/wallpaper/common/log/FileLog;->FILE_NAME_PREFIX:Ljava/lang/String;

    return-void

    :goto_57
    :try_start_57
    monitor-exit v0
    :try_end_58
    .catchall {:try_start_57 .. :try_end_58} :catchall_22

    throw p0
.end method

.method public static w(Ljava/lang/String;Ljava/lang/String;)V
    .registers 2

    .line 3
    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    invoke-static {p0, p1}, Lcom/nothing/wallpaper/common/log/FileLog;->print(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V
    .registers 3

    .line 1
    invoke-static {p0, p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 2
    invoke-static {p0, p1, p2}, Lcom/nothing/wallpaper/common/log/FileLog;->print(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    return-void
.end method
