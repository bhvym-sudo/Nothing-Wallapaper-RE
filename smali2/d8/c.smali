.class public abstract Ld8/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:S

.field private static b:Ljava/util/Hashtable;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    sput-object v0, Ld8/c;->b:Ljava/util/Hashtable;

    return-void
.end method

.method public static declared-synchronized a(Ljava/lang/String;)[I
    .registers 8

    const-class v0, Ld8/c;

    monitor-enter v0

    const/4 v1, 0x0

    if-nez p0, :cond_12

    :try_start_6
    const-string p0, "SenderIdManager"

    const-string v2, "getSenderId, param == null"

    invoke-static {p0, v2}, Ld8/d$a;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_d
    .catchall {:try_start_6 .. :try_end_d} :catchall_f

    monitor-exit v0

    return-object v1

    :catchall_f
    move-exception p0

    goto/16 :goto_8f

    :cond_12
    :try_start_12
    sget-object v2, Ld8/c;->b:Ljava/util/Hashtable;

    invoke-virtual {v2, p0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [I

    if-eqz v2, :cond_72

    array-length v3, v2

    const/4 v4, 0x2

    if-ne v4, v3, :cond_72

    const/4 v1, 0x1

    aget v3, v2, v1

    const v4, 0xffff

    and-int/2addr v3, v4

    int-to-short v3, v3

    add-int/2addr v3, v1

    int-to-short v3, v3

    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    move-result v3

    rem-int/lit16 v3, v3, 0x7fff

    int-to-short v3, v3

    aget v5, v2, v1

    const/high16 v6, -0x10000

    and-int/2addr v5, v6

    or-int/2addr v3, v5

    aput v3, v2, v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "getSenderId, tidAndTime:"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " pid:"

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 p0, 0x0

    aget p0, v2, p0

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ", gid:"

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget p0, v2, v1

    and-int/2addr p0, v6

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ", seq:"

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget p0, v2, v1

    and-int/2addr p0, v4

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v1, "SenderIdManager"

    invoke-static {v1, p0}, Ld8/d$a;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_70
    .catchall {:try_start_12 .. :try_end_70} :catchall_f

    monitor-exit v0

    return-object v2

    :cond_72
    :try_start_72
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getSenderId, param: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " fail!"

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v2, "SenderIdManager"

    invoke-static {v2, p0}, Ld8/d$a;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_8d
    .catchall {:try_start_72 .. :try_end_8d} :catchall_f

    monitor-exit v0

    return-object v1

    :goto_8f
    :try_start_8f
    monitor-exit v0
    :try_end_90
    .catchall {:try_start_8f .. :try_end_90} :catchall_f

    throw p0
.end method

.method public static declared-synchronized b(Ljava/lang/String;)V
    .registers 6

    const-class v0, Ld8/c;

    monitor-enter v0

    if-nez p0, :cond_10

    :try_start_5
    const-string p0, "SenderIdManager"

    const-string v1, "registerSender, param == null"

    invoke-static {p0, v1}, Ld8/d$a;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_c
    .catchall {:try_start_5 .. :try_end_c} :catchall_e

    monitor-exit v0

    return-void

    :catchall_e
    move-exception p0

    goto :goto_74

    :cond_10
    :try_start_10
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "registerSender groupId:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-short v3, Ld8/c;->a:S

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "SenderIdManager"

    invoke-static {v3, v2}, Ld8/d$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    sget-short v2, Ld8/c;->a:S

    const/4 v3, 0x1

    add-int/2addr v2, v3

    int-to-short v2, v2

    sput-short v2, Ld8/c;->a:S

    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    move-result v2

    rem-int/lit16 v2, v2, 0x7fff

    int-to-short v2, v2

    sput-short v2, Ld8/c;->a:S

    shl-int/lit8 v2, v2, 0x10

    filled-new-array {v1, v2}, [I

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "registerSender, tidAndTime:"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " senderId:"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v4, 0x0

    aget v4, v1, v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ","

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget v3, v1, v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "SenderIdManager"

    invoke-static {v3, v2}, Ld8/d$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v2, Ld8/c;->b:Ljava/util/Hashtable;

    invoke-virtual {v2, p0, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_72
    .catchall {:try_start_10 .. :try_end_72} :catchall_e

    monitor-exit v0

    return-void

    :goto_74
    :try_start_74
    monitor-exit v0
    :try_end_75
    .catchall {:try_start_74 .. :try_end_75} :catchall_e

    throw p0
.end method

.method public static declared-synchronized c(Ljava/lang/String;)V
    .registers 3

    const-class v0, Ld8/c;

    monitor-enter v0

    if-nez p0, :cond_10

    :try_start_5
    const-string p0, "SenderIdManager"

    const-string v1, "registerSender, param == null"

    invoke-static {p0, v1}, Ld8/d$a;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_c
    .catchall {:try_start_5 .. :try_end_c} :catchall_e

    monitor-exit v0

    return-void

    :catchall_e
    move-exception p0

    goto :goto_17

    :cond_10
    :try_start_10
    sget-object v1, Ld8/c;->b:Ljava/util/Hashtable;

    invoke-virtual {v1, p0}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_15
    .catchall {:try_start_10 .. :try_end_15} :catchall_e

    monitor-exit v0

    return-void

    :goto_17
    :try_start_17
    monitor-exit v0
    :try_end_18
    .catchall {:try_start_17 .. :try_end_18} :catchall_e

    throw p0
.end method
