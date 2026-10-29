.class public final LV6/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LV6/a$a;
    }
.end annotation


# static fields
.field public static final e:LV6/a$a;

.field private static volatile f:LV6/a;


# instance fields
.field private final a:Lu6/a;

.field private final b:Lu6/c;

.field private final c:Lcom/nothing/wallpaper/picker/creative/network/a;

.field private d:J


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LV6/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LV6/a$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LV6/a;->e:LV6/a$a;

    return-void
.end method

.method private constructor <init>(Lu6/a;Lu6/c;Lcom/nothing/wallpaper/picker/creative/network/a;)V
    .registers 4

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LV6/a;->a:Lu6/a;

    .line 4
    iput-object p2, p0, LV6/a;->b:Lu6/c;

    .line 5
    iput-object p3, p0, LV6/a;->c:Lcom/nothing/wallpaper/picker/creative/network/a;

    return-void
.end method

.method public synthetic constructor <init>(Lu6/a;Lu6/c;Lcom/nothing/wallpaper/picker/creative/network/a;Lkotlin/jvm/internal/h;)V
    .registers 5

    .line 1
    invoke-direct {p0, p1, p2, p3}, LV6/a;-><init>(Lu6/a;Lu6/c;Lcom/nothing/wallpaper/picker/creative/network/a;)V

    return-void
.end method

.method public static final synthetic a()LV6/a;
    .registers 1

    sget-object v0, LV6/a;->f:LV6/a;

    return-object v0
.end method

.method public static final synthetic b(LV6/a;)V
    .registers 1

    sput-object p0, LV6/a;->f:LV6/a;

    return-void
.end method

.method private final d(Ljava/util/List;ILjava/util/List;)Ljava/util/List;
    .registers 5

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p0

    add-int/lit8 p2, p2, 0x1

    if-le p0, p2, :cond_2c

    const/4 p0, 0x0

    invoke-interface {p1, p0, p2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p1, p2, v0}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    check-cast p3, Ljava/lang/Iterable;

    invoke-static {p1, p3}, Li8/s;->g0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Li8/s;->f(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    check-cast p0, Ljava/util/Collection;

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p0, p1}, Li8/s;->g0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_2c
    check-cast p1, Ljava/util/Collection;

    check-cast p3, Ljava/lang/Iterable;

    invoke-static {p1, p3}, Li8/s;->g0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private final e(IIZ)Ljava/util/List;
    .registers 6

    if-le p1, p2, :cond_8

    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    return-object p0

    :cond_8
    sub-int/2addr p2, p1

    add-int/lit8 p2, p2, 0x1

    new-array p0, p2, [Ljava/lang/Integer;

    const/4 v0, 0x0

    :goto_e
    if-ge v0, p2, :cond_1b

    add-int v1, v0, p1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, p0, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_e

    :cond_1b
    if-eqz p3, :cond_20

    invoke-static {p0}, Li8/m;->S([Ljava/lang/Object;)V

    :cond_20
    invoke-static {p0}, Li8/m;->Y([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method static synthetic f(LV6/a;IIZILjava/lang/Object;)Ljava/util/List;
    .registers 6

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_5

    const/4 p3, 0x1

    :cond_5
    invoke-direct {p0, p1, p2, p3}, LV6/a;->e(IIZ)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private final i(Landroid/content/Context;)Lcom/nothing/wallpaper/picker/creative/network/entity/PromptResponse;
    .registers 8

    const-string p0, "prompts.json"

    const-string v0, "getPromptsFromLocal close exception:"

    const-string v1, "getPromptsFromLocal"

    const-string v2, "WallpaperRepository"

    invoke-static {v2, v1}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v1, 0x0

    :try_start_c
    new-instance v3, Ljava/io/File;

    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v4

    invoke-direct {v3, v4, p0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v4

    if-nez v4, :cond_25

    invoke-virtual {v3}, Ljava/io/File;->createNewFile()Z

    goto :goto_25

    :catchall_1f
    move-exception p0

    goto/16 :goto_93

    :catch_22
    move-exception p0

    move-object p1, v1

    goto :goto_5b

    :cond_25
    :goto_25
    invoke-virtual {p1, p0}, Landroid/content/Context;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;

    move-result-object p0
    :try_end_29
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_29} :catch_22
    .catchall {:try_start_c .. :try_end_29} :catchall_1f

    :try_start_29
    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    const-class p1, Lcom/nothing/wallpaper/picker/creative/network/entity/PromptResponse;

    invoke-static {p0, p1}, Li6/h;->b(Ljava/io/InputStream;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/nothing/wallpaper/picker/creative/network/entity/PromptResponse;
    :try_end_34
    .catch Ljava/lang/Exception; {:try_start_29 .. :try_end_34} :catch_57
    .catchall {:try_start_29 .. :try_end_34} :catchall_53

    if-eqz p0, :cond_51

    :try_start_36
    invoke-virtual {p0}, Ljava/io/FileInputStream;->close()V
    :try_end_39
    .catch Ljava/lang/Exception; {:try_start_36 .. :try_end_39} :catch_3a

    goto :goto_51

    :catch_3a
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v2, p0}, Lcom/nothing/wallpaper/common/log/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    :cond_51
    :goto_51
    move-object v1, p1

    goto :goto_90

    :catchall_53
    move-exception p1

    move-object v1, p0

    move-object p0, p1

    goto :goto_93

    :catch_57
    move-exception p1

    move-object v5, p1

    move-object p1, p0

    move-object p0, v5

    :goto_5b
    :try_start_5b
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "getPromptsFromLocal exception:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v2, p0}, Lcom/nothing/wallpaper/common/log/c;->f(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_73
    .catchall {:try_start_5b .. :try_end_73} :catchall_91

    if-eqz p1, :cond_90

    :try_start_75
    invoke-virtual {p1}, Ljava/io/FileInputStream;->close()V
    :try_end_78
    .catch Ljava/lang/Exception; {:try_start_75 .. :try_end_78} :catch_79

    goto :goto_90

    :catch_79
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v2, p0}, Lcom/nothing/wallpaper/common/log/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    :cond_90
    :goto_90
    return-object v1

    :catchall_91
    move-exception p0

    move-object v1, p1

    :goto_93
    if-eqz v1, :cond_b0

    :try_start_95
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
    :try_end_98
    .catch Ljava/lang/Exception; {:try_start_95 .. :try_end_98} :catch_99

    goto :goto_b0

    :catch_99
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Lcom/nothing/wallpaper/common/log/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    :cond_b0
    :goto_b0
    throw p0
.end method

.method private final j(Landroid/content/Context;)LX6/b;
    .registers 4

    const-string v0, "WallpaperRepository"

    const-string v1, "getPromptsResultFromLocal"

    invoke-static {v0, v1}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LV6/a;->i(Landroid/content/Context;)Lcom/nothing/wallpaper/picker/creative/network/entity/PromptResponse;

    move-result-object p0

    if-eqz p0, :cond_12

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/creative/network/entity/PromptResponse;->getPromptSets()Ljava/util/List;

    move-result-object p0

    goto :goto_13

    :cond_12
    const/4 p0, 0x0

    :goto_13
    move-object p1, p0

    check-cast p1, Ljava/util/Collection;

    if-eqz p1, :cond_25

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1f

    goto :goto_25

    :cond_1f
    new-instance p1, LX6/b$b;

    invoke-direct {p1, p0}, LX6/b$b;-><init>(Ljava/util/List;)V

    return-object p1

    :cond_25
    :goto_25
    new-instance p0, LX6/b$a;

    new-instance p1, Ljava/lang/Exception;

    invoke-direct {p1}, Ljava/lang/Exception;-><init>()V

    invoke-direct {p0, p1}, LX6/b$a;-><init>(Ljava/lang/Exception;)V

    return-object p0
.end method

.method private final o(LX6/b;)Z
    .registers 2

    instance-of p0, p1, LX6/b$b;

    if-eqz p0, :cond_17

    check-cast p1, LX6/b$b;

    invoke-virtual {p1}, LX6/b$b;->a()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/Collection;

    if-eqz p0, :cond_17

    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_15

    goto :goto_17

    :cond_15
    const/4 p0, 0x1

    return p0

    :cond_17
    :goto_17
    const/4 p0, 0x0

    return p0
.end method

.method private final p(Landroid/content/Context;Ljava/lang/String;Lm8/e;)Ljava/lang/Object;
    .registers 7

    const-string p3, "requestPrompts"

    const-string v0, "WallpaperRepository"

    invoke-static {v0, p3}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_7
    iget-object p3, p0, LV6/a;->c:Lcom/nothing/wallpaper/picker/creative/network/a;

    invoke-virtual {p3, p1, p2}, Lcom/nothing/wallpaper/picker/creative/network/a;->b(Landroid/content/Context;Ljava/lang/String;)Lcom/nothing/wallpaper/picker/creative/network/entity/PromptResponse;

    move-result-object p2

    if-eqz p2, :cond_18

    invoke-virtual {p2}, Lcom/nothing/wallpaper/picker/creative/network/entity/PromptResponse;->getPromptSets()Ljava/util/List;

    move-result-object p3

    if-nez p3, :cond_1c

    goto :goto_18

    :catch_16
    move-exception p0

    goto :goto_42

    :cond_18
    :goto_18
    invoke-static {}, Li8/s;->l()Ljava/util/List;

    move-result-object p3

    :cond_1c
    if-eqz p2, :cond_31

    invoke-virtual {p2}, Lcom/nothing/wallpaper/picker/creative/network/entity/PromptResponse;->getPromptSets()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_31

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    const/4 v2, 0x1

    xor-int/2addr v1, v2

    if-ne v1, v2, :cond_31

    invoke-direct {p0, p1, p2}, LV6/a;->s(Landroid/content/Context;Lcom/nothing/wallpaper/picker/creative/network/entity/PromptResponse;)V

    :cond_31
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iput-wide v1, p0, LV6/a;->d:J

    const-string p0, "last_request_prompt_time"

    invoke-static {p1, p0, v1, v2}, Li6/n;->h(Landroid/content/Context;Ljava/lang/String;J)V

    new-instance p0, LX6/b$b;

    invoke-direct {p0, p3}, LX6/b$b;-><init>(Ljava/util/List;)V
    :try_end_41
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_41} :catch_16

    goto :goto_60

    :goto_42
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "requestPrompts exception:"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/nothing/wallpaper/common/log/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, LX6/b$a;

    invoke-direct {p1, p0}, LX6/b$a;-><init>(Ljava/lang/Exception;)V

    move-object p0, p1

    :goto_60
    sget-object p1, La7/d;->v:La7/d$b;

    invoke-virtual {p1, p0}, La7/d$b;->e(LX6/b;)V

    return-object p0
.end method

.method private final s(Landroid/content/Context;Lcom/nothing/wallpaper/picker/creative/network/entity/PromptResponse;)V
    .registers 7

    const-string p0, "savePromptsToLocal close exception:"

    invoke-virtual {p2}, Lcom/nothing/wallpaper/picker/creative/network/entity/PromptResponse;->getPromptSets()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    const-string v1, "WallpaperRepository"

    if-eqz v0, :cond_9a

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_14

    goto/16 :goto_9a

    :cond_14
    const/4 v0, 0x0

    :try_start_15
    const-string v2, "prompts.json"

    const/4 v3, 0x0

    invoke-virtual {p1, v2, v3}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;

    move-result-object p1

    new-instance v2, Ljava/io/BufferedWriter;

    new-instance v3, Ljava/io/OutputStreamWriter;

    invoke-direct {v3, p1}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;)V

    invoke-direct {v2, v3}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V
    :try_end_26
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_26} :catch_51
    .catchall {:try_start_15 .. :try_end_26} :catchall_4f

    :try_start_26
    invoke-static {p2}, Li6/h;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V
    :try_end_2d
    .catch Ljava/lang/Exception; {:try_start_26 .. :try_end_2d} :catch_4c
    .catchall {:try_start_26 .. :try_end_2d} :catchall_49

    :try_start_2d
    invoke-virtual {v2}, Ljava/io/BufferedWriter;->close()V
    :try_end_30
    .catch Ljava/lang/Exception; {:try_start_2d .. :try_end_30} :catch_31

    goto :goto_7b

    :catch_31
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    :goto_3b
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Lcom/nothing/wallpaper/common/log/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_7b

    :catchall_49
    move-exception p1

    move-object v0, v2

    goto :goto_7c

    :catch_4c
    move-exception p1

    move-object v0, v2

    goto :goto_52

    :catchall_4f
    move-exception p1

    goto :goto_7c

    :catch_51
    move-exception p1

    :goto_52
    :try_start_52
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "savePromptsToLocal exception:"

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/nothing/wallpaper/common/log/c;->f(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_6a
    .catchall {:try_start_52 .. :try_end_6a} :catchall_4f

    if-eqz v0, :cond_7b

    :try_start_6c
    invoke-virtual {v0}, Ljava/io/BufferedWriter;->close()V
    :try_end_6f
    .catch Ljava/lang/Exception; {:try_start_6c .. :try_end_6f} :catch_70

    goto :goto_7b

    :catch_70
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    goto :goto_3b

    :cond_7b
    :goto_7b
    return-void

    :goto_7c
    if-eqz v0, :cond_99

    :try_start_7e
    invoke-virtual {v0}, Ljava/io/BufferedWriter;->close()V
    :try_end_81
    .catch Ljava/lang/Exception; {:try_start_7e .. :try_end_81} :catch_82

    goto :goto_99

    :catch_82
    move-exception p2

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Lcom/nothing/wallpaper/common/log/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    :cond_99
    :goto_99
    throw p1

    :cond_9a
    :goto_9a
    const-string p0, "savePromptsToLocal prompts is empty, return!"

    invoke-static {v1, p0}, Lcom/nothing/wallpaper/common/log/c;->o(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final c()V
    .registers 3

    iget-object v0, p0, LV6/a;->a:Lu6/a;

    invoke-interface {v0}, Lu6/a;->getCount()I

    move-result v0

    const/16 v1, 0x2710

    if-le v0, v1, :cond_16

    iget-object p0, p0, LV6/a;->a:Lu6/a;

    invoke-interface {p0, v1}, Lu6/a;->a(I)V

    const-string p0, "WallpaperRepository"

    const-string v0, "checkHistoryCount deleteBeyond"

    invoke-static {p0, v0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_16
    return-void
.end method

.method public final g(Ljava/lang/String;Lcom/nothing/wallpaper/picker/creative/model/Prompt;Lcom/nothing/wallpaper/picker/creative/model/Prompt;ILm8/e;)Ljava/lang/Object;
    .registers 7

    const-string p5, "generateWallpaper"

    const-string v0, "WallpaperRepository"

    invoke-static {v0, p5}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_7
    iget-object p0, p0, LV6/a;->c:Lcom/nothing/wallpaper/picker/creative/network/a;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/nothing/wallpaper/picker/creative/network/a;->c(Ljava/lang/String;Lcom/nothing/wallpaper/picker/creative/model/Prompt;Lcom/nothing/wallpaper/picker/creative/model/Prompt;I)Lcom/nothing/wallpaper/picker/creative/network/entity/WallpaperResponse;

    move-result-object p0

    if-eqz p0, :cond_18

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/creative/network/entity/WallpaperResponse;->getWallpapers()Ljava/util/List;

    move-result-object p0

    if-nez p0, :cond_1c

    goto :goto_18

    :catch_16
    move-exception p0

    goto :goto_22

    :cond_18
    :goto_18
    invoke-static {}, Li8/s;->l()Ljava/util/List;

    move-result-object p0

    :cond_1c
    new-instance p1, LX6/d$b;

    invoke-direct {p1, p0}, LX6/d$b;-><init>(Ljava/util/List;)V
    :try_end_21
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_21} :catch_16

    return-object p1

    :goto_22
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "generateWallpaper exception:"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/nothing/wallpaper/common/log/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, LX6/d$a;

    invoke-direct {p1, p0}, LX6/d$a;-><init>(Ljava/lang/Exception;)V

    return-object p1
.end method

.method public final h(Landroid/content/Context;ZLjava/lang/String;Lm8/e;)Ljava/lang/Object;
    .registers 14

    instance-of v0, p4, LV6/a$b;

    if-eqz v0, :cond_13

    move-object v0, p4

    check-cast v0, LV6/a$b;

    iget v1, v0, LV6/a$b;->u:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_13

    sub-int/2addr v1, v2

    iput v1, v0, LV6/a$b;->u:I

    goto :goto_18

    :cond_13
    new-instance v0, LV6/a$b;

    invoke-direct {v0, p0, p4}, LV6/a$b;-><init>(LV6/a;Lm8/e;)V

    :goto_18
    iget-object p4, v0, LV6/a$b;->s:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LV6/a$b;->u:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_42

    if-eq v2, v4, :cond_35

    if-ne v2, v3, :cond_2d

    invoke-static {p4}, Lh8/r;->b(Ljava/lang/Object;)V

    goto/16 :goto_a9

    :cond_2d
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_35
    iget-object p0, v0, LV6/a$b;->r:Ljava/lang/Object;

    move-object p1, p0

    check-cast p1, Landroid/content/Context;

    iget-object p0, v0, LV6/a$b;->q:Ljava/lang/Object;

    check-cast p0, LV6/a;

    invoke-static {p4}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_84

    :cond_42
    invoke-static {p4}, Lh8/r;->b(Ljava/lang/Object;)V

    const-string p4, "prompts_language"

    const-string v2, ""

    invoke-static {p1, p4, v2}, Li6/n;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    invoke-static {p3, p4}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p4

    xor-int/2addr p4, v4

    iget-wide v5, p0, LV6/a;->d:J

    const-wide/16 v7, 0x0

    cmp-long v2, v5, v7

    if-nez v2, :cond_62

    const-string v2, "last_request_prompt_time"

    invoke-static {p1, v2, v7, v8}, Li6/n;->c(Landroid/content/Context;Ljava/lang/String;J)J

    move-result-wide v5

    iput-wide v5, p0, LV6/a;->d:J

    :cond_62
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    iget-wide v7, p0, LV6/a;->d:J

    sub-long/2addr v5, v7

    const-wide/32 v7, 0x493e0

    cmp-long v2, v5, v7

    if-lez v2, :cond_72

    move v2, v4

    goto :goto_73

    :cond_72
    const/4 v2, 0x0

    :goto_73
    or-int/2addr p4, v2

    or-int/2addr p2, p4

    if-eqz p2, :cond_98

    iput-object p0, v0, LV6/a$b;->q:Ljava/lang/Object;

    iput-object p1, v0, LV6/a$b;->r:Ljava/lang/Object;

    iput v4, v0, LV6/a$b;->u:I

    invoke-direct {p0, p1, p3, v0}, LV6/a;->p(Landroid/content/Context;Ljava/lang/String;Lm8/e;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_84

    goto :goto_a8

    :cond_84
    :goto_84
    check-cast p4, LX6/b;

    invoke-direct {p0, p4}, LV6/a;->o(LX6/b;)Z

    move-result p2

    if-nez p2, :cond_97

    invoke-direct {p0, p1}, LV6/a;->j(Landroid/content/Context;)LX6/b;

    move-result-object p1

    invoke-direct {p0, p1}, LV6/a;->o(LX6/b;)Z

    move-result p0

    if-eqz p0, :cond_97

    return-object p1

    :cond_97
    return-object p4

    :cond_98
    invoke-direct {p0, p1}, LV6/a;->j(Landroid/content/Context;)LX6/b;

    move-result-object p2

    instance-of p4, p2, LX6/b$a;

    if-eqz p4, :cond_ac

    iput v3, v0, LV6/a$b;->u:I

    invoke-direct {p0, p1, p3, v0}, LV6/a;->p(Landroid/content/Context;Ljava/lang/String;Lm8/e;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_a9

    :goto_a8
    return-object v1

    :cond_a9
    :goto_a9
    check-cast p4, LX6/b;

    return-object p4

    :cond_ac
    return-object p2
.end method

.method public final k(J)Lcom/nothing/wallpaper/db/CreativeWallpaper;
    .registers 3

    iget-object p0, p0, LV6/a;->a:Lu6/a;

    invoke-interface {p0, p1, p2}, Lu6/a;->e(J)Lcom/nothing/wallpaper/db/CreativeWallpaper;

    move-result-object p0

    return-object p0
.end method

.method public final l(Ljava/lang/String;)Lcom/nothing/wallpaper/db/CreativeWallpaper;
    .registers 3

    const-string v0, "imageUrl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, LV6/a;->a:Lu6/a;

    invoke-interface {p0, p1}, Lu6/a;->f(Ljava/lang/String;)Lcom/nothing/wallpaper/db/CreativeWallpaper;

    move-result-object p0

    return-object p0
.end method

.method public final m(Lcom/nothing/wallpaper/picker/creative/model/Prompt;Lcom/nothing/wallpaper/picker/creative/model/Prompt;)Lcom/nothing/wallpaper/db/WallpaperRequestIndex;
    .registers 5

    const-string v0, "subjectPrompt"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stylePrompt"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, LV6/a;->b:Lu6/c;

    invoke-virtual {p1}, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->getPromptWordId()J

    move-result-wide v0

    invoke-virtual {p2}, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->getPromptWordId()J

    move-result-wide p1

    invoke-interface {p0, v0, v1, p1, p2}, Lu6/c;->a(JJ)Lcom/nothing/wallpaper/db/WallpaperRequestIndex;

    move-result-object p0

    return-object p0
.end method

.method public final n(Lcom/nothing/wallpaper/picker/creative/model/Prompt;Lcom/nothing/wallpaper/picker/creative/model/Prompt;)Landroid/graphics/Point;
    .registers 5

    const-string v0, "subjectPrompt"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stylePrompt"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, LV6/a;->m(Lcom/nothing/wallpaper/picker/creative/model/Prompt;Lcom/nothing/wallpaper/picker/creative/model/Prompt;)Lcom/nothing/wallpaper/db/WallpaperRequestIndex;

    move-result-object p0

    const/4 p1, 0x0

    if-eqz p0, :cond_16

    invoke-virtual {p0}, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->getRequestIndex()I

    move-result p2

    goto :goto_17

    :cond_16
    move p2, p1

    :goto_17
    const/4 v0, 0x0

    if-eqz p0, :cond_1f

    invoke-virtual {p0}, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->getIndexArray()Ljava/lang/String;

    move-result-object p0

    goto :goto_20

    :cond_1f
    move-object p0, v0

    :goto_20
    if-eqz p0, :cond_26

    invoke-static {p0}, Li6/h;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    :cond_26
    new-instance p0, Landroid/graphics/Point;

    invoke-direct {p0, p1, p1}, Landroid/graphics/Point;-><init>(II)V

    if-eqz v0, :cond_32

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    goto :goto_33

    :cond_32
    move v1, p1

    :goto_33
    if-le v1, p2, :cond_45

    iput p2, p0, Landroid/graphics/Point;->x:I

    if-eqz v0, :cond_43

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    :cond_43
    iput p1, p0, Landroid/graphics/Point;->y:I

    :cond_45
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getWallpaperRequestIndex array:"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " index:"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "WallpaperRepository"

    invoke-static {p2, p1}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public final q(Lcom/nothing/wallpaper/picker/creative/model/Prompt;Lcom/nothing/wallpaper/picker/creative/model/Prompt;)I
    .registers 19

    move-object/from16 v1, p0

    move-object/from16 v7, p1

    move-object/from16 v8, p2

    const-string v2, "WallpaperRepository"

    const-string v0, "subjectPrompt"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stylePrompt"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p2}, LV6/a;->m(Lcom/nothing/wallpaper/picker/creative/model/Prompt;Lcom/nothing/wallpaper/picker/creative/model/Prompt;)Lcom/nothing/wallpaper/db/WallpaperRequestIndex;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_1f

    invoke-virtual {v3}, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->getTotalCount()I

    move-result v0

    move v5, v0

    goto :goto_20

    :cond_1f
    move v5, v4

    :goto_20
    :try_start_20
    iget-object v0, v1, LV6/a;->c:Lcom/nothing/wallpaper/picker/creative/network/a;

    invoke-virtual {v0, v7, v8}, Lcom/nothing/wallpaper/picker/creative/network/a;->d(Lcom/nothing/wallpaper/picker/creative/model/Prompt;Lcom/nothing/wallpaper/picker/creative/model/Prompt;)I

    move-result v0
    :try_end_26
    .catch Ljava/lang/Exception; {:try_start_20 .. :try_end_26} :catch_28

    move v12, v0

    goto :goto_42

    :catch_28
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "requestWallpaperTotalCount occur error, msg:"

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/nothing/wallpaper/common/log/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    move v12, v4

    :goto_42
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "requestWallpaperTotalCount lastCount:"

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, " newCount:"

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-eqz v3, :cond_66

    invoke-virtual {v3}, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->getIndexArray()Ljava/lang/String;

    move-result-object v2

    goto :goto_67

    :cond_66
    move-object v2, v0

    :goto_67
    if-eqz v2, :cond_6d

    invoke-static {v2}, Li6/h;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    :cond_6d
    if-ne v5, v12, :cond_7a

    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    if-eqz v2, :cond_7a

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_124

    :cond_7a
    if-nez v3, :cond_a4

    add-int/lit8 v3, v12, -0x1

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, LV6/a;->f(LV6/a;IIZILjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    new-instance v6, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;

    invoke-virtual {v7}, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->getPromptWordId()J

    move-result-wide v8

    invoke-virtual/range {p2 .. p2}, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->getPromptWordId()J

    move-result-wide v10

    invoke-static {v0}, Li6/h;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/4 v7, 0x0

    move v13, v12

    move-object v12, v0

    invoke-direct/range {v6 .. v15}, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;-><init>(IJJLjava/lang/String;III)V

    move v12, v13

    iget-object v0, v1, LV6/a;->b:Lu6/c;

    invoke-interface {v0, v6}, Lu6/c;->d(Lcom/nothing/wallpaper/db/WallpaperRequestIndex;)V

    goto/16 :goto_124

    :cond_a4
    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    if-eqz v2, :cond_108

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_b0

    goto :goto_108

    :cond_b0
    if-ge v5, v12, :cond_d3

    add-int/lit8 v2, v12, -0x1

    invoke-direct {v1, v5, v2, v4}, LV6/a;->e(IIZ)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v3}, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->getRequestIndex()I

    move-result v3

    invoke-direct {v1, v0, v3, v2}, LV6/a;->d(Ljava/util/List;ILjava/util/List;)Ljava/util/List;

    move-result-object v0

    iget-object v6, v1, LV6/a;->b:Lu6/c;

    invoke-virtual {v7}, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->getPromptWordId()J

    move-result-wide v7

    invoke-virtual/range {p2 .. p2}, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->getPromptWordId()J

    move-result-wide v9

    invoke-static {v0}, Li6/h;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    const/4 v13, 0x0

    invoke-interface/range {v6 .. v13}, Lu6/c;->b(JJLjava/lang/String;II)I

    goto :goto_124

    :cond_d3
    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_de
    :goto_de
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_f5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    if-ge v4, v12, :cond_de

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_de

    :cond_f5
    iget-object v6, v1, LV6/a;->b:Lu6/c;

    invoke-virtual {v7}, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->getPromptWordId()J

    move-result-wide v7

    invoke-virtual/range {p2 .. p2}, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->getPromptWordId()J

    move-result-wide v9

    invoke-static {v2}, Li6/h;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    const/4 v13, 0x0

    invoke-interface/range {v6 .. v13}, Lu6/c;->b(JJLjava/lang/String;II)I

    goto :goto_124

    :cond_108
    :goto_108
    add-int/lit8 v3, v12, -0x1

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, LV6/a;->f(LV6/a;IIZILjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iget-object v6, v1, LV6/a;->b:Lu6/c;

    invoke-virtual {v7}, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->getPromptWordId()J

    move-result-wide v7

    invoke-virtual/range {p2 .. p2}, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->getPromptWordId()J

    move-result-wide v9

    invoke-static {v0}, Li6/h;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    const/4 v13, 0x0

    invoke-interface/range {v6 .. v13}, Lu6/c;->b(JJLjava/lang/String;II)I

    :cond_124
    :goto_124
    return v12
.end method

.method public final r(Lcom/nothing/wallpaper/db/CreativeWallpaper;)Z
    .registers 3

    const-string v0, "wallpaper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_5
    iget-object p0, p0, LV6/a;->a:Lu6/a;

    invoke-interface {p0, p1}, Lu6/a;->b(Lcom/nothing/wallpaper/db/CreativeWallpaper;)V
    :try_end_a
    .catch Landroid/database/sqlite/SQLiteConstraintException; {:try_start_5 .. :try_end_a} :catch_c

    const/4 p0, 0x1

    return p0

    :catch_c
    const-string p0, "WallpaperRepository"

    const-string p1, "saveGeneratedHistory already saved!"

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/common/log/c;->o(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p0, 0x0

    return p0
.end method

.method public final t(Lcom/nothing/wallpaper/picker/creative/model/Prompt;Lcom/nothing/wallpaper/picker/creative/model/Prompt;I)I
    .registers 12

    const-string v0, "subjectPrompt"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stylePrompt"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LV6/a;->b:Lu6/c;

    invoke-virtual {p1}, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->getPromptWordId()J

    move-result-wide v1

    invoke-virtual {p2}, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->getPromptWordId()J

    move-result-wide v3

    invoke-interface {v0, v1, v2, v3, v4}, Lu6/c;->a(JJ)Lcom/nothing/wallpaper/db/WallpaperRequestIndex;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_20

    invoke-virtual {v0}, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->getTotalCount()I

    move-result v0

    goto :goto_21

    :cond_20
    move v0, v1

    :goto_21
    add-int/lit8 p3, p3, 0x1

    if-le v0, p3, :cond_27

    move v7, p3

    goto :goto_28

    :cond_27
    move v7, v1

    :goto_28
    iget-object v2, p0, LV6/a;->b:Lu6/c;

    invoke-virtual {p1}, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->getPromptWordId()J

    move-result-wide v3

    invoke-virtual {p2}, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->getPromptWordId()J

    move-result-wide v5

    invoke-interface/range {v2 .. v7}, Lu6/c;->c(JJI)I

    move-result p0

    return p0
.end method
