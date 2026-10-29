.class public final LU7/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LU7/b;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, LU7/b;

    invoke-direct {v0}, LU7/b;-><init>()V

    sput-object v0, LU7/b;->a:LU7/b;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Landroid/content/Context;)V
    .registers 1

    invoke-static {p0}, LU7/b;->i(Landroid/content/Context;)V

    return-void
.end method

.method private final b(Landroid/content/res/Resources;Ljava/lang/String;Ljava/util/ArrayList;)Ljava/util/List;
    .registers 26

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    if-nez p3, :cond_e

    :cond_b
    move-object v0, v15

    goto/16 :goto_ef

    :cond_e
    invoke-interface/range {p3 .. p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :goto_12
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;

    sget-object v3, LU7/b;->a:LU7/b;

    invoke-virtual {v1}, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->getThumbRes()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v0, v2, v4}, LU7/b;->c(Landroid/content/res/Resources;Ljava/lang/String;Ljava/lang/String;)I

    move-result v3

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    if-nez v3, :cond_46

    new-instance v4, Lg3/r;

    invoke-virtual {v1}, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->getTitle()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->getCollectionId()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Lcom/android/wallpaper/asset/m;

    invoke-direct {v7, v0, v3}, Lcom/android/wallpaper/asset/m;-><init>(Landroid/content/res/Resources;I)V

    invoke-virtual {v1}, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->getPriority()I

    move-result v9

    invoke-direct/range {v4 .. v9}, Lg3/r;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/android/wallpaper/asset/a;Ljava/util/List;I)V

    goto :goto_5b

    :cond_46
    new-instance v4, Lg3/r;

    invoke-virtual {v1}, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->getTitle()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->getCollectionId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->getFeaturedThumbnailIndex()I

    move-result v7

    invoke-virtual {v1}, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->getPriority()I

    move-result v9

    invoke-direct/range {v4 .. v9}, Lg3/r;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/util/List;I)V

    :goto_5b
    invoke-virtual {v1}, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->getWallpapers()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_e3

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v17

    :goto_67
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_e3

    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;

    invoke-virtual {v1}, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->getExtra()Landroid/os/Bundle;

    move-result-object v3

    if-eqz v3, :cond_81

    const-string v5, "resType"

    invoke-virtual {v3, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_83

    :cond_81
    const-string v3, "drawable"

    :cond_83
    invoke-virtual {v1}, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->getWallpaperId()Ljava/lang/String;

    move-result-object v5

    move-object v6, v4

    invoke-virtual {v1}, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->getCollectionId()Ljava/lang/String;

    move-result-object v4

    sget-object v7, LU7/b;->a:LU7/b;

    invoke-virtual {v1}, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->getDrawableResId()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v7, v0, v2, v3, v9}, LU7/b;->e(Landroid/content/res/Resources;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v9

    invoke-virtual {v1}, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->getTitleResId()Ljava/lang/String;

    move-result-object v10

    invoke-direct {v7, v0, v2, v10}, LU7/b;->f(Landroid/content/res/Resources;Ljava/lang/String;Ljava/lang/String;)I

    move-result v10

    invoke-virtual {v1}, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->getSubtitle1ResId()Ljava/lang/String;

    move-result-object v11

    invoke-direct {v7, v0, v2, v11}, LU7/b;->f(Landroid/content/res/Resources;Ljava/lang/String;Ljava/lang/String;)I

    move-result v7

    invoke-virtual {v1}, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->getCoverPriority()I

    move-result v11

    invoke-virtual {v1}, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->getGridPriority()I

    move-result v12

    invoke-virtual {v1}, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->getSupportDepth()Z

    move-result v14

    new-instance v1, Lg3/p;

    move-object v13, v6

    move v6, v10

    const/4 v10, 0x0

    move-object/from16 v18, v13

    const/4 v13, 0x0

    move-object/from16 v19, v8

    const/4 v8, 0x0

    move-object/from16 v20, v3

    move-object v3, v5

    move v5, v9

    const/4 v9, 0x0

    move-object/from16 p0, v15

    move-object/from16 v21, v18

    move-object/from16 v0, v19

    move-object/from16 v15, v20

    invoke-direct/range {v1 .. v14}, Lg3/p;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIIIILjava/lang/String;Z)V

    const-string v2, "raw"

    invoke-static {v15, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v1, v2}, Lg3/p;->D(Z)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v15, p0

    move-object/from16 v2, p2

    move-object v8, v0

    move-object/from16 v4, v21

    move-object/from16 v0, p1

    goto :goto_67

    :cond_e3
    move-object v13, v4

    move-object v0, v15

    invoke-virtual {v0, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v2, p2

    move-object v15, v0

    move-object/from16 v0, p1

    goto/16 :goto_12

    :goto_ef
    return-object v0
.end method

.method private final c(Landroid/content/res/Resources;Ljava/lang/String;Ljava/lang/String;)I
    .registers 4

    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_8

    const/4 p0, 0x0

    return p0

    :cond_8
    const-string p0, "drawable"

    invoke-virtual {p1, p3, p0, p2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method private final e(Landroid/content/res/Resources;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    .registers 5

    invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_8

    const/4 p0, 0x0

    return p0

    :cond_8
    const-string p0, "raw"

    invoke-static {p3, p0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_15

    invoke-virtual {p1, p4, p0, p2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    return p0

    :cond_15
    const-string p0, "drawable"

    invoke-virtual {p1, p4, p0, p2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method private final f(Landroid/content/res/Resources;Ljava/lang/String;Ljava/lang/String;)I
    .registers 4

    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_8

    const/4 p0, 0x0

    return p0

    :cond_8
    const-string p0, "string"

    invoke-virtual {p1, p3, p0, p2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method public static final h(Landroid/content/Context;)V
    .registers 3

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LF2/d;->f:LF2/i;

    new-instance v1, LU7/a;

    invoke-direct {v1, p0}, LU7/a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, LF2/i;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method private static final i(Landroid/content/Context;)V
    .registers 3

    sget-object v0, LU7/b;->a:LU7/b;

    :try_start_2
    sget-object v1, Lh8/q;->r:Lh8/q$a;

    invoke-virtual {v0, p0}, LU7/b;->d(Landroid/content/Context;)Landroid/content/ContentProviderClient;

    move-result-object p0
    :try_end_8
    .catchall {:try_start_2 .. :try_end_8} :catchall_21

    const/4 v0, 0x0

    if-eqz p0, :cond_1d

    :try_start_b
    const-string v1, "warm"

    invoke-virtual {p0, v1, v0, v0}, Landroid/content/ContentProviderClient;->call(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v1
    :try_end_11
    .catchall {:try_start_b .. :try_end_11} :catchall_16

    :try_start_11
    invoke-static {p0, v0}, Lt8/a;->a(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
    :try_end_14
    .catchall {:try_start_11 .. :try_end_14} :catchall_21

    move-object v0, v1

    goto :goto_1d

    :catchall_16
    move-exception v0

    :try_start_17
    throw v0
    :try_end_18
    .catchall {:try_start_17 .. :try_end_18} :catchall_18

    :catchall_18
    move-exception v1

    :try_start_19
    invoke-static {p0, v0}, Lt8/a;->a(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw v1

    :cond_1d
    :goto_1d
    invoke-static {v0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_20
    .catchall {:try_start_19 .. :try_end_20} :catchall_21

    return-void

    :catchall_21
    move-exception p0

    sget-object v0, Lh8/q;->r:Lh8/q$a;

    invoke-static {p0}, Lh8/r;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final d(Landroid/content/Context;)Landroid/content/ContentProviderClient;
    .registers 2

    const-string p0, "context"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p0

    const-string p1, "content://com.nothing.wallpapersstub.share"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/content/ContentResolver;->acquireContentProviderClient(Landroid/net/Uri;)Landroid/content/ContentProviderClient;

    move-result-object p0

    return-object p0
.end method

.method public final g(Landroid/content/res/Resources;Ljava/lang/String;Landroid/content/ContentProviderClient;)Ljava/util/List;
    .registers 9

    const-class v0, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;

    const-string v1, "resource"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "pkgName"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "provider"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :try_start_16
    sget-object v2, Lh8/q;->r:Lh8/q$a;
    :try_end_18
    .catchall {:try_start_16 .. :try_end_18} :catchall_45

    :try_start_18
    const-string v2, "wallpaper"

    const/4 v3, 0x0

    invoke-virtual {p3, v2, v3, v3}, Landroid/content/ContentProviderClient;->call(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v2

    if-eqz v2, :cond_3c

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    const-string v4, "result"

    invoke-virtual {v2, v4, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;Ljava/lang/Class;)Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_3d

    invoke-direct {p0, p1, p2, v0}, LU7/b;->b(Landroid/content/res/Resources;Ljava/lang/String;Ljava/util/ArrayList;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/Collection;

    invoke-interface {v1, p0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
    :try_end_39
    .catchall {:try_start_18 .. :try_end_39} :catchall_3a

    goto :goto_3d

    :catchall_3a
    move-exception p0

    goto :goto_47

    :cond_3c
    move-object v2, v3

    :cond_3d
    :goto_3d
    :try_start_3d
    invoke-static {p3, v3}, Lt8/a;->a(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    invoke-static {v2}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_44
    .catchall {:try_start_3d .. :try_end_44} :catchall_45

    goto :goto_57

    :catchall_45
    move-exception p0

    goto :goto_4d

    :goto_47
    :try_start_47
    throw p0
    :try_end_48
    .catchall {:try_start_47 .. :try_end_48} :catchall_48

    :catchall_48
    move-exception p1

    :try_start_49
    invoke-static {p3, p0}, Lt8/a;->a(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw p1
    :try_end_4d
    .catchall {:try_start_49 .. :try_end_4d} :catchall_45

    :goto_4d
    sget-object p1, Lh8/q;->r:Lh8/q$a;

    invoke-static {p0}, Lh8/r;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    :goto_57
    invoke-static {p0}, Lh8/q;->d(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p0

    if-eqz p0, :cond_77

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "parse stub wallpapers failure: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "NTWallpaperCategoryParser"

    invoke-static {p1, p0}, Lcom/nothing/wallpaper/common/log/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    :cond_77
    return-object v1
.end method
