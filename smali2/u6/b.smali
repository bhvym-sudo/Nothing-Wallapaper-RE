.class public final Lu6/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu6/a;


# instance fields
.field private final a:Lg1/q;

.field private final b:Lg1/i;

.field private final c:Lg1/h;

.field private final d:Lg1/w;

.field private final e:Lg1/w;

.field private final f:Lg1/w;


# direct methods
.method public constructor <init>(Lg1/q;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu6/b;->a:Lg1/q;

    new-instance v0, Lu6/b$a;

    invoke-direct {v0, p0, p1}, Lu6/b$a;-><init>(Lu6/b;Lg1/q;)V

    iput-object v0, p0, Lu6/b;->b:Lg1/i;

    new-instance v0, Lu6/b$b;

    invoke-direct {v0, p0, p1}, Lu6/b$b;-><init>(Lu6/b;Lg1/q;)V

    iput-object v0, p0, Lu6/b;->c:Lg1/h;

    new-instance v0, Lu6/b$c;

    invoke-direct {v0, p0, p1}, Lu6/b$c;-><init>(Lu6/b;Lg1/q;)V

    iput-object v0, p0, Lu6/b;->d:Lg1/w;

    new-instance v0, Lu6/b$d;

    invoke-direct {v0, p0, p1}, Lu6/b$d;-><init>(Lu6/b;Lg1/q;)V

    iput-object v0, p0, Lu6/b;->e:Lg1/w;

    new-instance v0, Lu6/b$e;

    invoke-direct {v0, p0, p1}, Lu6/b$e;-><init>(Lu6/b;Lg1/q;)V

    iput-object v0, p0, Lu6/b;->f:Lg1/w;

    return-void
.end method

.method public static g()Ljava/util/List;
    .registers 1

    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public a(I)V
    .registers 6

    iget-object v0, p0, Lu6/b;->a:Lg1/q;

    invoke-virtual {v0}, Lg1/q;->d()V

    iget-object v0, p0, Lu6/b;->d:Lg1/w;

    invoke-virtual {v0}, Lg1/w;->b()Lo1/k;

    move-result-object v0

    const/4 v1, 0x1

    int-to-long v2, p1

    invoke-interface {v0, v1, v2, v3}, Lo1/i;->P(IJ)V

    :try_start_10
    iget-object p1, p0, Lu6/b;->a:Lg1/q;

    invoke-virtual {p1}, Lg1/q;->e()V
    :try_end_15
    .catchall {:try_start_10 .. :try_end_15} :catchall_28

    :try_start_15
    invoke-interface {v0}, Lo1/k;->v()I

    iget-object p1, p0, Lu6/b;->a:Lg1/q;

    invoke-virtual {p1}, Lg1/q;->z()V
    :try_end_1d
    .catchall {:try_start_15 .. :try_end_1d} :catchall_2a

    :try_start_1d
    iget-object p1, p0, Lu6/b;->a:Lg1/q;

    invoke-virtual {p1}, Lg1/q;->i()V
    :try_end_22
    .catchall {:try_start_1d .. :try_end_22} :catchall_28

    iget-object p0, p0, Lu6/b;->d:Lg1/w;

    invoke-virtual {p0, v0}, Lg1/w;->h(Lo1/k;)V

    return-void

    :catchall_28
    move-exception p1

    goto :goto_31

    :catchall_2a
    move-exception p1

    :try_start_2b
    iget-object v1, p0, Lu6/b;->a:Lg1/q;

    invoke-virtual {v1}, Lg1/q;->i()V

    throw p1
    :try_end_31
    .catchall {:try_start_2b .. :try_end_31} :catchall_28

    :goto_31
    iget-object p0, p0, Lu6/b;->d:Lg1/w;

    invoke-virtual {p0, v0}, Lg1/w;->h(Lo1/k;)V

    throw p1
.end method

.method public b(Lcom/nothing/wallpaper/db/CreativeWallpaper;)V
    .registers 3

    iget-object v0, p0, Lu6/b;->a:Lg1/q;

    invoke-virtual {v0}, Lg1/q;->d()V

    iget-object v0, p0, Lu6/b;->a:Lg1/q;

    invoke-virtual {v0}, Lg1/q;->e()V

    :try_start_a
    iget-object v0, p0, Lu6/b;->b:Lg1/i;

    invoke-virtual {v0, p1}, Lg1/i;->j(Ljava/lang/Object;)V

    iget-object p1, p0, Lu6/b;->a:Lg1/q;

    invoke-virtual {p1}, Lg1/q;->z()V
    :try_end_14
    .catchall {:try_start_a .. :try_end_14} :catchall_1a

    iget-object p0, p0, Lu6/b;->a:Lg1/q;

    invoke-virtual {p0}, Lg1/q;->i()V

    return-void

    :catchall_1a
    move-exception p1

    iget-object p0, p0, Lu6/b;->a:Lg1/q;

    invoke-virtual {p0}, Lg1/q;->i()V

    throw p1
.end method

.method public c(JLjava/lang/String;)I
    .registers 6

    iget-object v0, p0, Lu6/b;->a:Lg1/q;

    invoke-virtual {v0}, Lg1/q;->d()V

    iget-object v0, p0, Lu6/b;->f:Lg1/w;

    invoke-virtual {v0}, Lg1/w;->b()Lo1/k;

    move-result-object v0

    const/4 v1, 0x1

    if-nez p3, :cond_12

    invoke-interface {v0, v1}, Lo1/i;->x0(I)V

    goto :goto_15

    :cond_12
    invoke-interface {v0, v1, p3}, Lo1/i;->r(ILjava/lang/String;)V

    :goto_15
    const/4 p3, 0x2

    invoke-interface {v0, p3, p1, p2}, Lo1/i;->P(IJ)V

    :try_start_19
    iget-object p1, p0, Lu6/b;->a:Lg1/q;

    invoke-virtual {p1}, Lg1/q;->e()V
    :try_end_1e
    .catchall {:try_start_19 .. :try_end_1e} :catchall_32

    :try_start_1e
    invoke-interface {v0}, Lo1/k;->v()I

    move-result p1

    iget-object p2, p0, Lu6/b;->a:Lg1/q;

    invoke-virtual {p2}, Lg1/q;->z()V
    :try_end_27
    .catchall {:try_start_1e .. :try_end_27} :catchall_34

    :try_start_27
    iget-object p2, p0, Lu6/b;->a:Lg1/q;

    invoke-virtual {p2}, Lg1/q;->i()V
    :try_end_2c
    .catchall {:try_start_27 .. :try_end_2c} :catchall_32

    iget-object p0, p0, Lu6/b;->f:Lg1/w;

    invoke-virtual {p0, v0}, Lg1/w;->h(Lo1/k;)V

    return p1

    :catchall_32
    move-exception p1

    goto :goto_3b

    :catchall_34
    move-exception p1

    :try_start_35
    iget-object p2, p0, Lu6/b;->a:Lg1/q;

    invoke-virtual {p2}, Lg1/q;->i()V

    throw p1
    :try_end_3b
    .catchall {:try_start_35 .. :try_end_3b} :catchall_32

    :goto_3b
    iget-object p0, p0, Lu6/b;->f:Lg1/w;

    invoke-virtual {p0, v0}, Lg1/w;->h(Lo1/k;)V

    throw p1
.end method

.method public d(I)Ljava/util/List;
    .registers 26

    move-object/from16 v0, p0

    const-string v1, "SELECT * FROM wallpaper_studio_history WHERE filePath IS NOT NULL AND filePath!=\'\' ORDER BY createTime DESC LIMIT ?"

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lg1/t;->f(Ljava/lang/String;I)Lg1/t;

    move-result-object v1

    move/from16 v3, p1

    int-to-long v3, v3

    invoke-virtual {v1, v2, v3, v4}, Lg1/t;->P(IJ)V

    iget-object v2, v0, Lu6/b;->a:Lg1/q;

    invoke-virtual {v2}, Lg1/q;->d()V

    iget-object v0, v0, Lu6/b;->a:Lg1/q;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lh1/b;->b(Lg1/q;Lo1/j;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object v2

    :try_start_1c
    const-string v0, "imageId"

    invoke-static {v2, v0}, Lh1/a;->d(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v0

    const-string v4, "imageUrl"

    invoke-static {v2, v4}, Lh1/a;->d(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v4

    const-string v5, "filePath"

    invoke-static {v2, v5}, Lh1/a;->d(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v5

    const-string v6, "subjectEn"

    invoke-static {v2, v6}, Lh1/a;->d(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v6

    const-string v7, "subjectLoc"

    invoke-static {v2, v7}, Lh1/a;->d(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v7

    const-string v8, "styleEn"

    invoke-static {v2, v8}, Lh1/a;->d(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v8

    const-string v9, "styleLoc"

    invoke-static {v2, v9}, Lh1/a;->d(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v9

    const-string v10, "createTime"

    invoke-static {v2, v10}, Lh1/a;->d(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v10

    new-instance v11, Ljava/util/ArrayList;

    invoke-interface {v2}, Landroid/database/Cursor;->getCount()I

    move-result v12

    invoke-direct {v11, v12}, Ljava/util/ArrayList;-><init>(I)V

    :goto_55
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v12

    if-eqz v12, :cond_c8

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v14

    invoke-interface {v2, v4}, Landroid/database/Cursor;->isNull(I)Z

    move-result v12

    if-eqz v12, :cond_68

    move-object/from16 v16, v3

    goto :goto_6e

    :cond_68
    invoke-interface {v2, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v12

    move-object/from16 v16, v12

    :goto_6e
    invoke-interface {v2, v5}, Landroid/database/Cursor;->isNull(I)Z

    move-result v12

    if-eqz v12, :cond_77

    move-object/from16 v17, v3

    goto :goto_7d

    :cond_77
    invoke-interface {v2, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v12

    move-object/from16 v17, v12

    :goto_7d
    invoke-interface {v2, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v12

    if-eqz v12, :cond_86

    move-object/from16 v18, v3

    goto :goto_8c

    :cond_86
    invoke-interface {v2, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v12

    move-object/from16 v18, v12

    :goto_8c
    invoke-interface {v2, v7}, Landroid/database/Cursor;->isNull(I)Z

    move-result v12

    if-eqz v12, :cond_95

    move-object/from16 v19, v3

    goto :goto_9b

    :cond_95
    invoke-interface {v2, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v12

    move-object/from16 v19, v12

    :goto_9b
    invoke-interface {v2, v8}, Landroid/database/Cursor;->isNull(I)Z

    move-result v12

    if-eqz v12, :cond_a4

    move-object/from16 v20, v3

    goto :goto_aa

    :cond_a4
    invoke-interface {v2, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v12

    move-object/from16 v20, v12

    :goto_aa
    invoke-interface {v2, v9}, Landroid/database/Cursor;->isNull(I)Z

    move-result v12

    if-eqz v12, :cond_b3

    move-object/from16 v21, v3

    goto :goto_b9

    :cond_b3
    invoke-interface {v2, v9}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v12

    move-object/from16 v21, v12

    :goto_b9
    invoke-interface {v2, v10}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v22

    new-instance v13, Lcom/nothing/wallpaper/db/CreativeWallpaper;

    invoke-direct/range {v13 .. v23}, Lcom/nothing/wallpaper/db/CreativeWallpaper;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    invoke-interface {v11, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_c5
    .catchall {:try_start_1c .. :try_end_c5} :catchall_c6

    goto :goto_55

    :catchall_c6
    move-exception v0

    goto :goto_cf

    :cond_c8
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    invoke-virtual {v1}, Lg1/t;->u()V

    return-object v11

    :goto_cf
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    invoke-virtual {v1}, Lg1/t;->u()V

    throw v0
.end method

.method public e(J)Lcom/nothing/wallpaper/db/CreativeWallpaper;
    .registers 26

    move-object/from16 v0, p0

    const-string v1, "SELECT * FROM wallpaper_studio_history WHERE imageId=?"

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lg1/t;->f(Ljava/lang/String;I)Lg1/t;

    move-result-object v1

    move-wide/from16 v3, p1

    invoke-virtual {v1, v2, v3, v4}, Lg1/t;->P(IJ)V

    iget-object v2, v0, Lu6/b;->a:Lg1/q;

    invoke-virtual {v2}, Lg1/q;->d()V

    iget-object v0, v0, Lu6/b;->a:Lg1/q;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lh1/b;->b(Lg1/q;Lo1/j;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object v2

    :try_start_1b
    const-string v0, "imageId"

    invoke-static {v2, v0}, Lh1/a;->d(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v0

    const-string v4, "imageUrl"

    invoke-static {v2, v4}, Lh1/a;->d(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v4

    const-string v5, "filePath"

    invoke-static {v2, v5}, Lh1/a;->d(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v5

    const-string v6, "subjectEn"

    invoke-static {v2, v6}, Lh1/a;->d(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v6

    const-string v7, "subjectLoc"

    invoke-static {v2, v7}, Lh1/a;->d(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v7

    const-string v8, "styleEn"

    invoke-static {v2, v8}, Lh1/a;->d(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v8

    const-string v9, "styleLoc"

    invoke-static {v2, v9}, Lh1/a;->d(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v9

    const-string v10, "createTime"

    invoke-static {v2, v10}, Lh1/a;->d(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v10

    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v11

    if-eqz v11, :cond_b9

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v13

    invoke-interface {v2, v4}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_5d

    move-object v15, v3

    goto :goto_62

    :cond_5d
    invoke-interface {v2, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object v15, v0

    :goto_62
    invoke-interface {v2, v5}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_6b

    move-object/from16 v16, v3

    goto :goto_71

    :cond_6b
    invoke-interface {v2, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v16, v0

    :goto_71
    invoke-interface {v2, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_7a

    move-object/from16 v17, v3

    goto :goto_80

    :cond_7a
    invoke-interface {v2, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v17, v0

    :goto_80
    invoke-interface {v2, v7}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_89

    move-object/from16 v18, v3

    goto :goto_8f

    :cond_89
    invoke-interface {v2, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v18, v0

    :goto_8f
    invoke-interface {v2, v8}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_98

    move-object/from16 v19, v3

    goto :goto_9e

    :cond_98
    invoke-interface {v2, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v19, v0

    :goto_9e
    invoke-interface {v2, v9}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_a7

    :goto_a4
    move-object/from16 v20, v3

    goto :goto_ac

    :cond_a7
    invoke-interface {v2, v9}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_a4

    :goto_ac
    invoke-interface {v2, v10}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v21

    new-instance v12, Lcom/nothing/wallpaper/db/CreativeWallpaper;

    invoke-direct/range {v12 .. v22}, Lcom/nothing/wallpaper/db/CreativeWallpaper;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    :try_end_b5
    .catchall {:try_start_1b .. :try_end_b5} :catchall_b7

    move-object v3, v12

    goto :goto_b9

    :catchall_b7
    move-exception v0

    goto :goto_c0

    :cond_b9
    :goto_b9
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    invoke-virtual {v1}, Lg1/t;->u()V

    return-object v3

    :goto_c0
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    invoke-virtual {v1}, Lg1/t;->u()V

    throw v0
.end method

.method public f(Ljava/lang/String;)Lcom/nothing/wallpaper/db/CreativeWallpaper;
    .registers 25

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "SELECT * FROM wallpaper_studio_history WHERE imageUrl=?"

    const/4 v3, 0x1

    invoke-static {v2, v3}, Lg1/t;->f(Ljava/lang/String;I)Lg1/t;

    move-result-object v2

    if-nez v1, :cond_11

    invoke-virtual {v2, v3}, Lg1/t;->x0(I)V

    goto :goto_14

    :cond_11
    invoke-virtual {v2, v3, v1}, Lg1/t;->r(ILjava/lang/String;)V

    :goto_14
    iget-object v1, v0, Lu6/b;->a:Lg1/q;

    invoke-virtual {v1}, Lg1/q;->d()V

    iget-object v0, v0, Lu6/b;->a:Lg1/q;

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v2, v1, v3}, Lh1/b;->b(Lg1/q;Lo1/j;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object v1

    :try_start_21
    const-string v0, "imageId"

    invoke-static {v1, v0}, Lh1/a;->d(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v0

    const-string v4, "imageUrl"

    invoke-static {v1, v4}, Lh1/a;->d(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v4

    const-string v5, "filePath"

    invoke-static {v1, v5}, Lh1/a;->d(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v5

    const-string v6, "subjectEn"

    invoke-static {v1, v6}, Lh1/a;->d(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v6

    const-string v7, "subjectLoc"

    invoke-static {v1, v7}, Lh1/a;->d(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v7

    const-string v8, "styleEn"

    invoke-static {v1, v8}, Lh1/a;->d(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v8

    const-string v9, "styleLoc"

    invoke-static {v1, v9}, Lh1/a;->d(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v9

    const-string v10, "createTime"

    invoke-static {v1, v10}, Lh1/a;->d(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v10

    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v11

    if-eqz v11, :cond_bf

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v13

    invoke-interface {v1, v4}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_63

    move-object v15, v3

    goto :goto_68

    :cond_63
    invoke-interface {v1, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object v15, v0

    :goto_68
    invoke-interface {v1, v5}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_71

    move-object/from16 v16, v3

    goto :goto_77

    :cond_71
    invoke-interface {v1, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v16, v0

    :goto_77
    invoke-interface {v1, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_80

    move-object/from16 v17, v3

    goto :goto_86

    :cond_80
    invoke-interface {v1, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v17, v0

    :goto_86
    invoke-interface {v1, v7}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_8f

    move-object/from16 v18, v3

    goto :goto_95

    :cond_8f
    invoke-interface {v1, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v18, v0

    :goto_95
    invoke-interface {v1, v8}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_9e

    move-object/from16 v19, v3

    goto :goto_a4

    :cond_9e
    invoke-interface {v1, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v19, v0

    :goto_a4
    invoke-interface {v1, v9}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_ad

    :goto_aa
    move-object/from16 v20, v3

    goto :goto_b2

    :cond_ad
    invoke-interface {v1, v9}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_aa

    :goto_b2
    invoke-interface {v1, v10}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v21

    new-instance v12, Lcom/nothing/wallpaper/db/CreativeWallpaper;

    invoke-direct/range {v12 .. v22}, Lcom/nothing/wallpaper/db/CreativeWallpaper;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    :try_end_bb
    .catchall {:try_start_21 .. :try_end_bb} :catchall_bd

    move-object v3, v12

    goto :goto_bf

    :catchall_bd
    move-exception v0

    goto :goto_c6

    :cond_bf
    :goto_bf
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    invoke-virtual {v2}, Lg1/t;->u()V

    return-object v3

    :goto_c6
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    invoke-virtual {v2}, Lg1/t;->u()V

    throw v0
.end method

.method public getCount()I
    .registers 4

    const-string v0, "SELECT COUNT(*) FROM wallpaper_studio_history"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lg1/t;->f(Ljava/lang/String;I)Lg1/t;

    move-result-object v0

    iget-object v2, p0, Lu6/b;->a:Lg1/q;

    invoke-virtual {v2}, Lg1/q;->d()V

    iget-object p0, p0, Lu6/b;->a:Lg1/q;

    const/4 v2, 0x0

    invoke-static {p0, v0, v1, v2}, Lh1/b;->b(Lg1/q;Lo1/j;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object p0

    :try_start_13
    invoke-interface {p0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v2

    if-eqz v2, :cond_20

    invoke-interface {p0, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1
    :try_end_1d
    .catchall {:try_start_13 .. :try_end_1d} :catchall_1e

    goto :goto_20

    :catchall_1e
    move-exception v1

    goto :goto_27

    :cond_20
    :goto_20
    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0}, Lg1/t;->u()V

    return v1

    :goto_27
    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0}, Lg1/t;->u()V

    throw v1
.end method
