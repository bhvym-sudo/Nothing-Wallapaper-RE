.class public final Lu6/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu6/c;


# instance fields
.field private final a:Lg1/q;

.field private final b:Lg1/i;

.field private final c:Lg1/h;

.field private final d:Lg1/w;

.field private final e:Lg1/w;


# direct methods
.method public constructor <init>(Lg1/q;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu6/d;->a:Lg1/q;

    new-instance v0, Lu6/d$a;

    invoke-direct {v0, p0, p1}, Lu6/d$a;-><init>(Lu6/d;Lg1/q;)V

    iput-object v0, p0, Lu6/d;->b:Lg1/i;

    new-instance v0, Lu6/d$b;

    invoke-direct {v0, p0, p1}, Lu6/d$b;-><init>(Lu6/d;Lg1/q;)V

    iput-object v0, p0, Lu6/d;->c:Lg1/h;

    new-instance v0, Lu6/d$c;

    invoke-direct {v0, p0, p1}, Lu6/d$c;-><init>(Lu6/d;Lg1/q;)V

    iput-object v0, p0, Lu6/d;->d:Lg1/w;

    new-instance v0, Lu6/d$d;

    invoke-direct {v0, p0, p1}, Lu6/d$d;-><init>(Lu6/d;Lg1/q;)V

    iput-object v0, p0, Lu6/d;->e:Lg1/w;

    return-void
.end method

.method public static e()Ljava/util/List;
    .registers 1

    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public a(JJ)Lcom/nothing/wallpaper/db/WallpaperRequestIndex;
    .registers 26

    move-object/from16 v0, p0

    const-string v1, "SELECT * FROM wallpaper_request_index WHERE subjectPromptId=? and stylePromptId=?"

    const/4 v2, 0x2

    invoke-static {v1, v2}, Lg1/t;->f(Ljava/lang/String;I)Lg1/t;

    move-result-object v1

    const/4 v3, 0x1

    move-wide/from16 v4, p1

    invoke-virtual {v1, v3, v4, v5}, Lg1/t;->P(IJ)V

    move-wide/from16 v3, p3

    invoke-virtual {v1, v2, v3, v4}, Lg1/t;->P(IJ)V

    iget-object v2, v0, Lu6/d;->a:Lg1/q;

    invoke-virtual {v2}, Lg1/q;->d()V

    iget-object v0, v0, Lu6/d;->a:Lg1/q;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lh1/b;->b(Lg1/q;Lo1/j;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object v2

    :try_start_21
    const-string v0, "_Id"

    invoke-static {v2, v0}, Lh1/a;->d(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v0

    const-string v4, "subjectPromptId"

    invoke-static {v2, v4}, Lh1/a;->d(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v4

    const-string v5, "stylePromptId"

    invoke-static {v2, v5}, Lh1/a;->d(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v5

    const-string v6, "indexArray"

    invoke-static {v2, v6}, Lh1/a;->d(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v6

    const-string v7, "totalCount"

    invoke-static {v2, v7}, Lh1/a;->d(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v7

    const-string v8, "requestIndex"

    invoke-static {v2, v8}, Lh1/a;->d(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v8

    const-string v9, "version"

    invoke-static {v2, v9}, Lh1/a;->d(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v9

    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v10

    if-eqz v10, :cond_80

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v12

    invoke-interface {v2, v4}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v13

    invoke-interface {v2, v5}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v15

    invoke-interface {v2, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_66

    :goto_63
    move-object/from16 v17, v3

    goto :goto_6b

    :cond_66
    invoke-interface {v2, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_63

    :goto_6b
    invoke-interface {v2, v7}, Landroid/database/Cursor;->getInt(I)I

    move-result v18

    invoke-interface {v2, v8}, Landroid/database/Cursor;->getInt(I)I

    move-result v19

    invoke-interface {v2, v9}, Landroid/database/Cursor;->getInt(I)I

    move-result v20

    new-instance v11, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;

    invoke-direct/range {v11 .. v20}, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;-><init>(IJJLjava/lang/String;III)V
    :try_end_7c
    .catchall {:try_start_21 .. :try_end_7c} :catchall_7e

    move-object v3, v11

    goto :goto_80

    :catchall_7e
    move-exception v0

    goto :goto_87

    :cond_80
    :goto_80
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    invoke-virtual {v1}, Lg1/t;->u()V

    return-object v3

    :goto_87
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    invoke-virtual {v1}, Lg1/t;->u()V

    throw v0
.end method

.method public b(JJLjava/lang/String;II)I
    .registers 11

    iget-object v0, p0, Lu6/d;->a:Lg1/q;

    invoke-virtual {v0}, Lg1/q;->d()V

    iget-object v0, p0, Lu6/d;->e:Lg1/w;

    invoke-virtual {v0}, Lg1/w;->b()Lo1/k;

    move-result-object v0

    const/4 v1, 0x1

    if-nez p5, :cond_12

    invoke-interface {v0, v1}, Lo1/i;->x0(I)V

    goto :goto_15

    :cond_12
    invoke-interface {v0, v1, p5}, Lo1/i;->r(ILjava/lang/String;)V

    :goto_15
    const/4 p5, 0x2

    int-to-long v1, p6

    invoke-interface {v0, p5, v1, v2}, Lo1/i;->P(IJ)V

    const/4 p5, 0x3

    int-to-long p6, p7

    invoke-interface {v0, p5, p6, p7}, Lo1/i;->P(IJ)V

    const/4 p5, 0x4

    invoke-interface {v0, p5, p1, p2}, Lo1/i;->P(IJ)V

    const/4 p1, 0x5

    invoke-interface {v0, p1, p3, p4}, Lo1/i;->P(IJ)V

    :try_start_27
    iget-object p1, p0, Lu6/d;->a:Lg1/q;

    invoke-virtual {p1}, Lg1/q;->e()V
    :try_end_2c
    .catchall {:try_start_27 .. :try_end_2c} :catchall_40

    :try_start_2c
    invoke-interface {v0}, Lo1/k;->v()I

    move-result p1

    iget-object p2, p0, Lu6/d;->a:Lg1/q;

    invoke-virtual {p2}, Lg1/q;->z()V
    :try_end_35
    .catchall {:try_start_2c .. :try_end_35} :catchall_42

    :try_start_35
    iget-object p2, p0, Lu6/d;->a:Lg1/q;

    invoke-virtual {p2}, Lg1/q;->i()V
    :try_end_3a
    .catchall {:try_start_35 .. :try_end_3a} :catchall_40

    iget-object p0, p0, Lu6/d;->e:Lg1/w;

    invoke-virtual {p0, v0}, Lg1/w;->h(Lo1/k;)V

    return p1

    :catchall_40
    move-exception p1

    goto :goto_49

    :catchall_42
    move-exception p1

    :try_start_43
    iget-object p2, p0, Lu6/d;->a:Lg1/q;

    invoke-virtual {p2}, Lg1/q;->i()V

    throw p1
    :try_end_49
    .catchall {:try_start_43 .. :try_end_49} :catchall_40

    :goto_49
    iget-object p0, p0, Lu6/d;->e:Lg1/w;

    invoke-virtual {p0, v0}, Lg1/w;->h(Lo1/k;)V

    throw p1
.end method

.method public c(JJI)I
    .registers 10

    iget-object v0, p0, Lu6/d;->a:Lg1/q;

    invoke-virtual {v0}, Lg1/q;->d()V

    iget-object v0, p0, Lu6/d;->d:Lg1/w;

    invoke-virtual {v0}, Lg1/w;->b()Lo1/k;

    move-result-object v0

    const/4 v1, 0x1

    int-to-long v2, p5

    invoke-interface {v0, v1, v2, v3}, Lo1/i;->P(IJ)V

    const/4 p5, 0x2

    invoke-interface {v0, p5, p1, p2}, Lo1/i;->P(IJ)V

    const/4 p1, 0x3

    invoke-interface {v0, p1, p3, p4}, Lo1/i;->P(IJ)V

    :try_start_18
    iget-object p1, p0, Lu6/d;->a:Lg1/q;

    invoke-virtual {p1}, Lg1/q;->e()V
    :try_end_1d
    .catchall {:try_start_18 .. :try_end_1d} :catchall_31

    :try_start_1d
    invoke-interface {v0}, Lo1/k;->v()I

    move-result p1

    iget-object p2, p0, Lu6/d;->a:Lg1/q;

    invoke-virtual {p2}, Lg1/q;->z()V
    :try_end_26
    .catchall {:try_start_1d .. :try_end_26} :catchall_33

    :try_start_26
    iget-object p2, p0, Lu6/d;->a:Lg1/q;

    invoke-virtual {p2}, Lg1/q;->i()V
    :try_end_2b
    .catchall {:try_start_26 .. :try_end_2b} :catchall_31

    iget-object p0, p0, Lu6/d;->d:Lg1/w;

    invoke-virtual {p0, v0}, Lg1/w;->h(Lo1/k;)V

    return p1

    :catchall_31
    move-exception p1

    goto :goto_3a

    :catchall_33
    move-exception p1

    :try_start_34
    iget-object p2, p0, Lu6/d;->a:Lg1/q;

    invoke-virtual {p2}, Lg1/q;->i()V

    throw p1
    :try_end_3a
    .catchall {:try_start_34 .. :try_end_3a} :catchall_31

    :goto_3a
    iget-object p0, p0, Lu6/d;->d:Lg1/w;

    invoke-virtual {p0, v0}, Lg1/w;->h(Lo1/k;)V

    throw p1
.end method

.method public d(Lcom/nothing/wallpaper/db/WallpaperRequestIndex;)V
    .registers 3

    iget-object v0, p0, Lu6/d;->a:Lg1/q;

    invoke-virtual {v0}, Lg1/q;->d()V

    iget-object v0, p0, Lu6/d;->a:Lg1/q;

    invoke-virtual {v0}, Lg1/q;->e()V

    :try_start_a
    iget-object v0, p0, Lu6/d;->b:Lg1/i;

    invoke-virtual {v0, p1}, Lg1/i;->j(Ljava/lang/Object;)V

    iget-object p1, p0, Lu6/d;->a:Lg1/q;

    invoke-virtual {p1}, Lg1/q;->z()V
    :try_end_14
    .catchall {:try_start_a .. :try_end_14} :catchall_1a

    iget-object p0, p0, Lu6/d;->a:Lg1/q;

    invoke-virtual {p0}, Lg1/q;->i()V

    return-void

    :catchall_1a
    move-exception p1

    iget-object p0, p0, Lu6/d;->a:Lg1/q;

    invoke-virtual {p0}, Lg1/q;->i()V

    throw p1
.end method
