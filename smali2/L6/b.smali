.class public final LL6/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LL6/b;

.field private static b:Landroid/content/Context;

.field private static volatile c:Lcom/nothing/wallpaper/onlineconfig/WallpaperOnlineConfig;

.field private static d:Lcom/nothing/onlineconfig/ConfigObserver;

.field private static final e:Lcom/nothing/onlineconfig/ConfigObserver$ConfigUpdater;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, LL6/b;

    invoke-direct {v0}, LL6/b;-><init>()V

    sput-object v0, LL6/b;->a:LL6/b;

    new-instance v0, LL6/a;

    invoke-direct {v0}, LL6/a;-><init>()V

    sput-object v0, LL6/b;->e:Lcom/nothing/onlineconfig/ConfigObserver$ConfigUpdater;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lorg/json/JSONArray;)V
    .registers 1

    invoke-static {p0}, LL6/b;->l(Lorg/json/JSONArray;)V

    return-void
.end method

.method public static final synthetic b(LL6/b;)V
    .registers 1

    invoke-direct {p0}, LL6/b;->f()V

    return-void
.end method

.method public static final synthetic c(LL6/b;Lorg/json/JSONArray;)V
    .registers 2

    invoke-direct {p0, p1}, LL6/b;->k(Lorg/json/JSONArray;)V

    return-void
.end method

.method private final e(Landroid/content/Context;)Lcom/nothing/wallpaper/onlineconfig/WallpaperOnlineConfig;
    .registers 5

    const/4 v0, 0x0

    :try_start_1
    new-instance v1, Ljava/io/InputStreamReader;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v2, 0x7f120007

    invoke-virtual {p1, v2}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {p0, v1}, LL6/b;->j(Ljava/io/Reader;)Lcom/nothing/wallpaper/onlineconfig/WallpaperOnlineConfigBean;

    move-result-object p0

    if-eqz p0, :cond_26

    invoke-virtual {p0}, Lcom/nothing/wallpaper/onlineconfig/WallpaperOnlineConfigBean;->getContent()Ljava/util/List;

    move-result-object p0

    if-eqz p0, :cond_26

    invoke-static {p0}, Li8/s;->U(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/nothing/wallpaper/onlineconfig/WallpaperOnlineConfig;
    :try_end_23
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_1 .. :try_end_23} :catch_24

    return-object p0

    :catch_24
    move-exception p0

    goto :goto_27

    :cond_26
    return-object v0

    :goto_27
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getLocaleConfigs -> NotFoundException -> "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "RemoteConfigController"

    invoke-static {p1, p0}, Lcom/nothing/wallpaper/common/log/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method private final f()V
    .registers 7

    sget-object v0, LL6/b;->b:Landroid/content/Context;

    const-string v1, "appContext"

    const/4 v2, 0x0

    if-nez v0, :cond_b

    invoke-static {v1}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v0, v2

    :cond_b
    invoke-direct {p0, v0}, LL6/b;->e(Landroid/content/Context;)Lcom/nothing/wallpaper/onlineconfig/WallpaperOnlineConfig;

    move-result-object v0

    sput-object v0, LL6/b;->c:Lcom/nothing/wallpaper/onlineconfig/WallpaperOnlineConfig;

    sget-object v0, LL6/b;->c:Lcom/nothing/wallpaper/onlineconfig/WallpaperOnlineConfig;

    if-eqz v0, :cond_1a

    invoke-virtual {v0}, Lcom/nothing/wallpaper/onlineconfig/WallpaperOnlineConfig;->getVersion()Ljava/lang/Integer;

    move-result-object v0

    goto :goto_1b

    :cond_1a
    move-object v0, v2

    :goto_1b
    sget-object v3, LL6/b;->c:Lcom/nothing/wallpaper/onlineconfig/WallpaperOnlineConfig;

    if-eqz v3, :cond_2a

    invoke-virtual {v3}, Lcom/nothing/wallpaper/onlineconfig/WallpaperOnlineConfig;->getDepthConfig()Lcom/nothing/wallpaper/onlineconfig/DepthConfig;

    move-result-object v3

    if-eqz v3, :cond_2a

    invoke-virtual {v3}, Lcom/nothing/wallpaper/onlineconfig/DepthConfig;->getDepthOverlapRate()Ljava/lang/Float;

    move-result-object v3

    goto :goto_2b

    :cond_2a
    move-object v3, v2

    :goto_2b
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "getRemoteConfig local version = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", depthOverlapRate = "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v3, "RemoteConfigController"

    invoke-static {v3, v0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_49
    sget-object v0, Lh8/q;->r:Lh8/q$a;

    new-instance v0, Lcom/nothing/onlineconfig/ConfigGrabber;

    sget-object v4, LL6/b;->b:Landroid/content/Context;

    if-nez v4, :cond_58

    invoke-static {v1}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v4, v2

    goto :goto_58

    :catchall_56
    move-exception p0

    goto :goto_6d

    :cond_58
    :goto_58
    const-string v1, "wallpaper_config"

    invoke-direct {v0, v4, v1}, Lcom/nothing/onlineconfig/ConfigGrabber;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/nothing/onlineconfig/ConfigGrabber;->grabConfig()Lorg/json/JSONArray;

    move-result-object v0

    if-eqz v0, :cond_68

    invoke-direct {p0, v0}, LL6/b;->k(Lorg/json/JSONArray;)V

    sget-object v2, Lh8/A;->a:Lh8/A;

    :cond_68
    invoke-static {v2}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_6c
    .catchall {:try_start_49 .. :try_end_6c} :catchall_56

    goto :goto_77

    :goto_6d
    sget-object v0, Lh8/q;->r:Lh8/q$a;

    invoke-static {p0}, Lh8/r;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    :goto_77
    invoke-static {p0}, Lh8/q;->d(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p0

    if-eqz p0, :cond_91

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getRemoteConfig remote grab fail: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v3, p0}, Lcom/nothing/wallpaper/common/log/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    :cond_91
    return-void
.end method

.method private final g(Lcom/nothing/wallpaper/onlineconfig/WallpaperOnlineConfig;)I
    .registers 2

    if-eqz p1, :cond_d

    invoke-virtual {p1}, Lcom/nothing/wallpaper/onlineconfig/WallpaperOnlineConfig;->getVersion()Ljava/lang/Integer;

    move-result-object p0

    if-eqz p0, :cond_d

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0

    :cond_d
    const/4 p0, -0x1

    return p0
.end method

.method private final i(Lorg/json/JSONArray;)Lcom/nothing/wallpaper/onlineconfig/WallpaperOnlineConfigBean;
    .registers 3

    :try_start_0
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "{\"content\": "

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "}"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Lcom/google/gson/Gson;

    invoke-direct {p1}, Lcom/google/gson/Gson;-><init>()V

    const-class v0, Lcom/nothing/wallpaper/onlineconfig/WallpaperOnlineConfigBean;

    invoke-virtual {p1, p0, v0}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/nothing/wallpaper/onlineconfig/WallpaperOnlineConfigBean;
    :try_end_23
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_23} :catch_24

    return-object p0

    :catch_24
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "parseConfigFromJsonArray -> Exception -> "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "RemoteConfigController"

    invoke-static {p1, p0}, Lcom/nothing/wallpaper/common/log/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method private final j(Ljava/io/Reader;)Lcom/nothing/wallpaper/onlineconfig/WallpaperOnlineConfigBean;
    .registers 6

    const-string p0, "parseConfigFromReader IOException:  "

    const-string v0, "RemoteConfigController"

    :try_start_4
    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    const-class v2, Lcom/nothing/wallpaper/onlineconfig/WallpaperOnlineConfigBean;

    invoke-virtual {v1, p1, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/io/Reader;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/nothing/wallpaper/onlineconfig/WallpaperOnlineConfigBean;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "parseConfigFromReader configs = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_25
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_25} :catch_43
    .catchall {:try_start_4 .. :try_end_25} :catchall_41

    :try_start_25
    invoke-virtual {p1}, Ljava/io/Reader;->close()V
    :try_end_28
    .catch Ljava/io/IOException; {:try_start_25 .. :try_end_28} :catch_29

    return-object v1

    :catch_29
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Lcom/nothing/wallpaper/common/log/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :catchall_41
    move-exception v1

    goto :goto_79

    :catch_43
    move-exception v1

    :try_start_44
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "parseConfigFromReader Exception: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/nothing/wallpaper/common/log/c;->f(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_5c
    .catchall {:try_start_44 .. :try_end_5c} :catchall_41

    :try_start_5c
    invoke-virtual {p1}, Ljava/io/Reader;->close()V
    :try_end_5f
    .catch Ljava/io/IOException; {:try_start_5c .. :try_end_5f} :catch_60

    goto :goto_77

    :catch_60
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Lcom/nothing/wallpaper/common/log/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    :goto_77
    const/4 p0, 0x0

    return-object p0

    :goto_79
    :try_start_79
    invoke-virtual {p1}, Ljava/io/Reader;->close()V
    :try_end_7c
    .catch Ljava/io/IOException; {:try_start_79 .. :try_end_7c} :catch_7d

    goto :goto_94

    :catch_7d
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Lcom/nothing/wallpaper/common/log/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    :goto_94
    throw v1
.end method

.method private final k(Lorg/json/JSONArray;)V
    .registers 7

    const-string v0, "RemoteConfigController"

    if-eqz p1, :cond_6b

    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-gtz v1, :cond_b

    goto :goto_6b

    :cond_b
    invoke-direct {p0, p1}, LL6/b;->i(Lorg/json/JSONArray;)Lcom/nothing/wallpaper/onlineconfig/WallpaperOnlineConfigBean;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1f

    invoke-virtual {v1}, Lcom/nothing/wallpaper/onlineconfig/WallpaperOnlineConfigBean;->getContent()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_1f

    invoke-static {v1}, Li8/s;->U(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/nothing/wallpaper/onlineconfig/WallpaperOnlineConfig;

    goto :goto_20

    :cond_1f
    move-object v1, v2

    :goto_20
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "updateOnlineConfig jsonArray = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " newConfig = "

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0, v1}, LL6/b;->g(Lcom/nothing/wallpaper/onlineconfig/WallpaperOnlineConfig;)I

    move-result p1

    sget-object v3, LL6/b;->c:Lcom/nothing/wallpaper/onlineconfig/WallpaperOnlineConfig;

    invoke-direct {p0, v3}, LL6/b;->g(Lcom/nothing/wallpaper/onlineconfig/WallpaperOnlineConfig;)I

    move-result p0

    if-le p1, p0, :cond_65

    sput-object v1, LL6/b;->c:Lcom/nothing/wallpaper/onlineconfig/WallpaperOnlineConfig;

    if-eqz v1, :cond_50

    invoke-virtual {v1}, Lcom/nothing/wallpaper/onlineconfig/WallpaperOnlineConfig;->getVersion()Ljava/lang/Integer;

    move-result-object v2

    :cond_50
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p1, "updateOnlineConfig: use remote config, version="

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_65
    const-string p0, "updateOnlineConfig: keep current config"

    invoke-static {v0, p0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_6b
    :goto_6b
    const-string p0, "wallpaperUpdater: jsonArray is null or empty."

    invoke-static {v0, p0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private static final l(Lorg/json/JSONArray;)V
    .registers 7

    invoke-static {}, LO5/g;->j()LF8/L;

    move-result-object v0

    new-instance v3, LL6/b$b;

    const/4 v1, 0x0

    invoke-direct {v3, p0, v1}, LL6/b$b;-><init>(Lorg/json/JSONArray;Lm8/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method


# virtual methods
.method public final d()F
    .registers 1

    sget-object p0, LL6/b;->c:Lcom/nothing/wallpaper/onlineconfig/WallpaperOnlineConfig;

    if-eqz p0, :cond_15

    invoke-virtual {p0}, Lcom/nothing/wallpaper/onlineconfig/WallpaperOnlineConfig;->getDepthConfig()Lcom/nothing/wallpaper/onlineconfig/DepthConfig;

    move-result-object p0

    if-eqz p0, :cond_15

    invoke-virtual {p0}, Lcom/nothing/wallpaper/onlineconfig/DepthConfig;->getDepthOverlapRate()Ljava/lang/Float;

    move-result-object p0

    if-eqz p0, :cond_15

    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    move-result p0

    return p0

    :cond_15
    const/high16 p0, 0x3e800000    # 0.25f

    return p0
.end method

.method public final h(Landroid/content/Context;)V
    .registers 9

    const-string p0, "context"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    sput-object p0, LL6/b;->b:Landroid/content/Context;

    const/4 p0, 0x0

    :try_start_c
    sget-object p1, Lh8/q;->r:Lh8/q$a;

    new-instance p1, Lcom/nothing/onlineconfig/ConfigObserver;

    sget-object v0, LL6/b;->b:Landroid/content/Context;
    :try_end_12
    .catchall {:try_start_c .. :try_end_12} :catchall_1b

    const-string v1, "appContext"

    if-nez v0, :cond_1e

    :try_start_16
    invoke-static {v1}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v0, p0

    goto :goto_1e

    :catchall_1b
    move-exception v0

    move-object p1, v0

    goto :goto_42

    :cond_1e
    :goto_1e
    new-instance v2, Landroid/os/Handler;

    sget-object v3, LL6/b;->b:Landroid/content/Context;

    if-nez v3, :cond_28

    invoke-static {v1}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v3, p0

    :cond_28
    invoke-virtual {v3}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v2, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sget-object v1, LL6/b;->e:Lcom/nothing/onlineconfig/ConfigObserver$ConfigUpdater;

    const-string v3, "wallpaper_config"

    invoke-direct {p1, v0, v2, v1, v3}, Lcom/nothing/onlineconfig/ConfigObserver;-><init>(Landroid/content/Context;Landroid/os/Handler;Lcom/nothing/onlineconfig/ConfigObserver$ConfigUpdater;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/nothing/onlineconfig/ConfigObserver;->register()V

    sput-object p1, LL6/b;->d:Lcom/nothing/onlineconfig/ConfigObserver;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-static {p1}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_41
    .catchall {:try_start_16 .. :try_end_41} :catchall_1b

    goto :goto_4c

    :goto_42
    sget-object v0, Lh8/q;->r:Lh8/q$a;

    invoke-static {p1}, Lh8/r;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_4c
    invoke-static {p1}, Lh8/q;->d(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_6c

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "init failed: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "RemoteConfigController"

    invoke-static {v0, p1}, Lcom/nothing/wallpaper/common/log/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    :cond_6c
    invoke-static {}, LO5/g;->j()LF8/L;

    move-result-object v1

    new-instance v4, LL6/b$a;

    invoke-direct {v4, p0}, LL6/b$a;-><init>(Lm8/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method
