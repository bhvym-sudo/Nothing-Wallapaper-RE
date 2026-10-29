.class Lcom/nothing/wallpaper/db/WallpaperDatabase_Impl$a;
.super Lg1/s$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nothing/wallpaper/db/WallpaperDatabase_Impl;->h(Lg1/f;)Lo1/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/nothing/wallpaper/db/WallpaperDatabase_Impl;


# direct methods
.method constructor <init>(Lcom/nothing/wallpaper/db/WallpaperDatabase_Impl;I)V
    .registers 3

    iput-object p1, p0, Lcom/nothing/wallpaper/db/WallpaperDatabase_Impl$a;->b:Lcom/nothing/wallpaper/db/WallpaperDatabase_Impl;

    invoke-direct {p0, p2}, Lg1/s$b;-><init>(I)V

    return-void
.end method


# virtual methods
.method public a(Lo1/g;)V
    .registers 2

    const-string p0, "CREATE TABLE IF NOT EXISTS `wallpaper_studio_history` (`imageId` INTEGER NOT NULL, `imageUrl` TEXT NOT NULL, `filePath` TEXT NOT NULL, `subjectEn` TEXT NOT NULL, `subjectLoc` TEXT, `styleEn` TEXT NOT NULL, `styleLoc` TEXT, `createTime` INTEGER NOT NULL, PRIMARY KEY(`imageId`))"

    invoke-interface {p1, p0}, Lo1/g;->q(Ljava/lang/String;)V

    const-string p0, "CREATE TABLE IF NOT EXISTS `wallpaper_request_index` (`_Id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `subjectPromptId` INTEGER NOT NULL, `stylePromptId` INTEGER NOT NULL, `indexArray` TEXT NOT NULL, `totalCount` INTEGER NOT NULL, `requestIndex` INTEGER NOT NULL, `version` INTEGER NOT NULL)"

    invoke-interface {p1, p0}, Lo1/g;->q(Ljava/lang/String;)V

    const-string p0, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"

    invoke-interface {p1, p0}, Lo1/g;->q(Ljava/lang/String;)V

    const-string p0, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \'b3d321ba58c586feff189d308a1141be\')"

    invoke-interface {p1, p0}, Lo1/g;->q(Ljava/lang/String;)V

    return-void
.end method

.method public b(Lo1/g;)V
    .registers 3

    const-string v0, "DROP TABLE IF EXISTS `wallpaper_studio_history`"

    invoke-interface {p1, v0}, Lo1/g;->q(Ljava/lang/String;)V

    const-string v0, "DROP TABLE IF EXISTS `wallpaper_request_index`"

    invoke-interface {p1, v0}, Lo1/g;->q(Ljava/lang/String;)V

    iget-object p0, p0, Lcom/nothing/wallpaper/db/WallpaperDatabase_Impl$a;->b:Lcom/nothing/wallpaper/db/WallpaperDatabase_Impl;

    invoke-static {p0}, Lcom/nothing/wallpaper/db/WallpaperDatabase_Impl;->F(Lcom/nothing/wallpaper/db/WallpaperDatabase_Impl;)Ljava/util/List;

    move-result-object p0

    if-eqz p0, :cond_26

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_16
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_26

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg1/q$b;

    invoke-virtual {v0, p1}, Lg1/q$b;->b(Lo1/g;)V

    goto :goto_16

    :cond_26
    return-void
.end method

.method public c(Lo1/g;)V
    .registers 3

    iget-object p0, p0, Lcom/nothing/wallpaper/db/WallpaperDatabase_Impl$a;->b:Lcom/nothing/wallpaper/db/WallpaperDatabase_Impl;

    invoke-static {p0}, Lcom/nothing/wallpaper/db/WallpaperDatabase_Impl;->G(Lcom/nothing/wallpaper/db/WallpaperDatabase_Impl;)Ljava/util/List;

    move-result-object p0

    if-eqz p0, :cond_1c

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_c
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1c

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg1/q$b;

    invoke-virtual {v0, p1}, Lg1/q$b;->a(Lo1/g;)V

    goto :goto_c

    :cond_1c
    return-void
.end method

.method public d(Lo1/g;)V
    .registers 3

    iget-object v0, p0, Lcom/nothing/wallpaper/db/WallpaperDatabase_Impl$a;->b:Lcom/nothing/wallpaper/db/WallpaperDatabase_Impl;

    invoke-static {v0, p1}, Lcom/nothing/wallpaper/db/WallpaperDatabase_Impl;->H(Lcom/nothing/wallpaper/db/WallpaperDatabase_Impl;Lo1/g;)Lo1/g;

    iget-object v0, p0, Lcom/nothing/wallpaper/db/WallpaperDatabase_Impl$a;->b:Lcom/nothing/wallpaper/db/WallpaperDatabase_Impl;

    invoke-static {v0, p1}, Lcom/nothing/wallpaper/db/WallpaperDatabase_Impl;->I(Lcom/nothing/wallpaper/db/WallpaperDatabase_Impl;Lo1/g;)V

    iget-object p0, p0, Lcom/nothing/wallpaper/db/WallpaperDatabase_Impl$a;->b:Lcom/nothing/wallpaper/db/WallpaperDatabase_Impl;

    invoke-static {p0}, Lcom/nothing/wallpaper/db/WallpaperDatabase_Impl;->J(Lcom/nothing/wallpaper/db/WallpaperDatabase_Impl;)Ljava/util/List;

    move-result-object p0

    if-eqz p0, :cond_26

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_16
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_26

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg1/q$b;

    invoke-virtual {v0, p1}, Lg1/q$b;->c(Lo1/g;)V

    goto :goto_16

    :cond_26
    return-void
.end method

.method public e(Lo1/g;)V
    .registers 2

    return-void
.end method

.method public f(Lo1/g;)V
    .registers 2

    invoke-static {p1}, Lh1/b;->a(Lo1/g;)V

    return-void
.end method

.method public g(Lo1/g;)Lg1/s$c;
    .registers 20

    move-object/from16 v0, p1

    new-instance v1, Ljava/util/HashMap;

    const/16 v2, 0x8

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    new-instance v3, Lh1/d$a;

    const/4 v8, 0x0

    const/4 v9, 0x1

    const-string v4, "imageId"

    const-string v5, "INTEGER"

    const/4 v6, 0x1

    const/4 v7, 0x1

    invoke-direct/range {v3 .. v9}, Lh1/d$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v2, "imageId"

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lh1/d$a;

    const/4 v9, 0x0

    const/4 v10, 0x1

    const-string v5, "imageUrl"

    const-string v6, "TEXT"

    const/4 v8, 0x0

    invoke-direct/range {v4 .. v10}, Lh1/d$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v2, "imageUrl"

    invoke-virtual {v1, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v5, Lh1/d$a;

    const/4 v10, 0x0

    const/4 v11, 0x1

    const-string v6, "filePath"

    const-string v7, "TEXT"

    const/4 v8, 0x1

    const/4 v9, 0x0

    invoke-direct/range {v5 .. v11}, Lh1/d$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v2, "filePath"

    invoke-virtual {v1, v2, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v6, Lh1/d$a;

    const/4 v11, 0x0

    const/4 v12, 0x1

    const-string v7, "subjectEn"

    const-string v8, "TEXT"

    const/4 v9, 0x1

    const/4 v10, 0x0

    invoke-direct/range {v6 .. v12}, Lh1/d$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v2, "subjectEn"

    invoke-virtual {v1, v2, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v7, Lh1/d$a;

    const/4 v12, 0x0

    const/4 v13, 0x1

    const-string v8, "subjectLoc"

    const-string v9, "TEXT"

    const/4 v11, 0x0

    invoke-direct/range {v7 .. v13}, Lh1/d$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v2, "subjectLoc"

    invoke-virtual {v1, v2, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v8, Lh1/d$a;

    const/4 v13, 0x0

    const/4 v14, 0x1

    const-string v9, "styleEn"

    const-string v10, "TEXT"

    const/4 v11, 0x1

    const/4 v12, 0x0

    invoke-direct/range {v8 .. v14}, Lh1/d$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v2, "styleEn"

    invoke-virtual {v1, v2, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v9, Lh1/d$a;

    const/4 v14, 0x0

    const/4 v15, 0x1

    const-string v10, "styleLoc"

    const-string v11, "TEXT"

    const/4 v13, 0x0

    invoke-direct/range {v9 .. v15}, Lh1/d$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v2, "styleLoc"

    invoke-virtual {v1, v2, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v10, Lh1/d$a;

    const/4 v15, 0x0

    const/16 v16, 0x1

    const-string v11, "createTime"

    const-string v12, "INTEGER"

    const/4 v13, 0x1

    const/4 v14, 0x0

    invoke-direct/range {v10 .. v16}, Lh1/d$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v2, "createTime"

    invoke-virtual {v1, v2, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Ljava/util/HashSet;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Ljava/util/HashSet;-><init>(I)V

    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4, v3}, Ljava/util/HashSet;-><init>(I)V

    new-instance v5, Lh1/d;

    const-string v6, "wallpaper_studio_history"

    invoke-direct {v5, v6, v1, v2, v4}, Lh1/d;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    invoke-static {v0, v6}, Lh1/d;->a(Lo1/g;Ljava/lang/String;)Lh1/d;

    move-result-object v1

    invoke-virtual {v5, v1}, Lh1/d;->equals(Ljava/lang/Object;)Z

    move-result v2

    const-string v4, "\n Found:\n"

    if-nez v2, :cond_d2

    new-instance v0, Lg1/s$c;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "wallpaper_studio_history(com.nothing.wallpaper.db.CreativeWallpaper).\n Expected:\n"

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v3, v1}, Lg1/s$c;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_d2
    new-instance v1, Ljava/util/HashMap;

    const/4 v2, 0x7

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    new-instance v5, Lh1/d$a;

    const/4 v10, 0x0

    const/4 v11, 0x1

    const-string v6, "_Id"

    const-string v7, "INTEGER"

    const/4 v8, 0x1

    const/4 v9, 0x1

    invoke-direct/range {v5 .. v11}, Lh1/d$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v2, "_Id"

    invoke-virtual {v1, v2, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v6, Lh1/d$a;

    const/4 v11, 0x0

    const/4 v12, 0x1

    const-string v7, "subjectPromptId"

    const-string v8, "INTEGER"

    const/4 v10, 0x0

    invoke-direct/range {v6 .. v12}, Lh1/d$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v2, "subjectPromptId"

    invoke-virtual {v1, v2, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v7, Lh1/d$a;

    const/4 v12, 0x0

    const/4 v13, 0x1

    const-string v8, "stylePromptId"

    const-string v9, "INTEGER"

    const/4 v10, 0x1

    const/4 v11, 0x0

    invoke-direct/range {v7 .. v13}, Lh1/d$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v2, "stylePromptId"

    invoke-virtual {v1, v2, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v8, Lh1/d$a;

    const/4 v13, 0x0

    const/4 v14, 0x1

    const-string v9, "indexArray"

    const-string v10, "TEXT"

    const/4 v11, 0x1

    const/4 v12, 0x0

    invoke-direct/range {v8 .. v14}, Lh1/d$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v2, "indexArray"

    invoke-virtual {v1, v2, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v9, Lh1/d$a;

    const/4 v14, 0x0

    const/4 v15, 0x1

    const-string v10, "totalCount"

    const-string v11, "INTEGER"

    const/4 v12, 0x1

    const/4 v13, 0x0

    invoke-direct/range {v9 .. v15}, Lh1/d$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v2, "totalCount"

    invoke-virtual {v1, v2, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v10, Lh1/d$a;

    const/4 v15, 0x0

    const/16 v16, 0x1

    const-string v11, "requestIndex"

    const-string v12, "INTEGER"

    const/4 v13, 0x1

    const/4 v14, 0x0

    invoke-direct/range {v10 .. v16}, Lh1/d$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v2, "requestIndex"

    invoke-virtual {v1, v2, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v11, Lh1/d$a;

    const/16 v16, 0x0

    const/16 v17, 0x1

    const-string v12, "version"

    const-string v13, "INTEGER"

    const/4 v14, 0x1

    const/4 v15, 0x0

    invoke-direct/range {v11 .. v17}, Lh1/d$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v2, "version"

    invoke-virtual {v1, v2, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2, v3}, Ljava/util/HashSet;-><init>(I)V

    new-instance v5, Ljava/util/HashSet;

    invoke-direct {v5, v3}, Ljava/util/HashSet;-><init>(I)V

    new-instance v6, Lh1/d;

    const-string v7, "wallpaper_request_index"

    invoke-direct {v6, v7, v1, v2, v5}, Lh1/d;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    invoke-static {v0, v7}, Lh1/d;->a(Lo1/g;Ljava/lang/String;)Lh1/d;

    move-result-object v0

    invoke-virtual {v6, v0}, Lh1/d;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_190

    new-instance v1, Lg1/s$c;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "wallpaper_request_index(com.nothing.wallpaper.db.WallpaperRequestIndex).\n Expected:\n"

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v3, v0}, Lg1/s$c;-><init>(ZLjava/lang/String;)V

    return-object v1

    :cond_190
    new-instance v0, Lg1/s$c;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lg1/s$c;-><init>(ZLjava/lang/String;)V

    return-object v0
.end method
