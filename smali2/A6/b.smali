.class public final LA6/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LA6/b;

.field public static b:Landroid/content/Context;

.field private static final c:Lq6/b;

.field private static d:LB6/a;

.field private static e:LF8/x0;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LA6/b;

    invoke-direct {v0}, LA6/b;-><init>()V

    sput-object v0, LA6/b;->a:LA6/b;

    new-instance v1, Lq6/b;

    invoke-direct {v1, v0}, Lq6/b;-><init>(Ljava/lang/Object;)V

    sput-object v1, LA6/b;->c:Lq6/b;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LK1/a;)Lh3/a0;
    .registers 1

    invoke-static {p0}, LA6/b;->f(LK1/a;)Lh3/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b()Lq6/b;
    .registers 1

    sget-object v0, LA6/b;->c:Lq6/b;

    return-object v0
.end method

.method public static final synthetic c(LA6/b;)Z
    .registers 1

    invoke-direct {p0}, LA6/b;->j()Z

    move-result p0

    return p0
.end method

.method public static synthetic e(LA6/b;ILm8/e;ILjava/lang/Object;)Ljava/lang/Object;
    .registers 5

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_5

    const/4 p1, 0x0

    :cond_5
    invoke-virtual {p0, p1, p2}, LA6/b;->d(ILm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final f(LK1/a;)Lh3/a0;
    .registers 6

    new-instance v0, Lh3/a0;

    sget-object v1, LA6/b;->a:LA6/b;

    invoke-virtual {v1}, LA6/b;->h()Landroid/content/Context;

    move-result-object v2

    invoke-interface {p0, v2}, Lh3/H;->A(Landroid/content/Context;)Lh3/U;

    move-result-object v2

    invoke-virtual {v1}, LA6/b;->h()Landroid/content/Context;

    move-result-object v3

    invoke-interface {p0, v3}, Lh3/H;->f(Landroid/content/Context;)Lh3/W;

    move-result-object v3

    invoke-virtual {v1}, LA6/b;->h()Landroid/content/Context;

    move-result-object v4

    invoke-interface {p0, v4}, Lh3/H;->q(Landroid/content/Context;)Lh3/S;

    move-result-object v4

    invoke-virtual {v1}, LA6/b;->h()Landroid/content/Context;

    move-result-object v1

    invoke-interface {p0, v1}, Lh3/H;->k(Landroid/content/Context;)Lh3/c;

    move-result-object p0

    invoke-direct {v0, v2, v3, v4, p0}, Lh3/a0;-><init>(Lh3/U;Lh3/W;Lh3/S;Lh3/c;)V

    return-object v0
.end method

.method private static final g(Lh8/h;)Lh3/a0;
    .registers 1

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lh3/a0;

    return-object p0
.end method

.method private final j()Z
    .registers 3

    invoke-virtual {p0}, LA6/b;->h()Landroid/content/Context;

    move-result-object p0

    const-string v0, "wallpaper"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    const-string v0, "null cannot be cast to non-null type android.app.WallpaperManager"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Landroid/app/WallpaperManager;

    invoke-virtual {p0}, Landroid/app/WallpaperManager;->getWallpaperInfo()Landroid/app/WallpaperInfo;

    move-result-object v0

    if-eqz v0, :cond_26

    invoke-static {v0}, LG6/e;->h(Landroid/app/WallpaperInfo;)Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_26

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Landroid/app/WallpaperManager;->getWallpaperId(I)I

    move-result p0

    if-lez p0, :cond_26

    return v1

    :cond_26
    const/4 p0, 0x0

    return p0
.end method

.method private final o(Lh3/a0;Lg3/x;Landroid/graphics/Bitmap;Landroid/app/WallpaperColors;Lx6/k;ILm8/e;)Ljava/lang/Object;
    .registers 17

    new-instance p0, Lm8/k;

    invoke-static/range {p7 .. p7}, Ln8/b;->c(Lm8/e;)Lm8/e;

    move-result-object v0

    invoke-direct {p0, v0}, Lm8/k;-><init>(Lm8/e;)V

    new-instance v8, LA6/b$c;

    invoke-direct {v8, p2, p0, p5, p6}, LA6/b$c;-><init>(Lg3/x;Lm8/e;Lx6/k;I)V

    const/4 v2, 0x0

    const/4 v6, 0x0

    move-object v1, p1

    move-object v3, p2

    move-object v5, p3

    move-object v7, p4

    move v4, p6

    invoke-virtual/range {v1 .. v8}, Lh3/a0;->q(Landroid/app/Activity;Lg3/x;ILandroid/graphics/Bitmap;LJ6/e;Landroid/app/WallpaperColors;Lh3/U$a;)V

    invoke-virtual {p0}, Lm8/k;->b()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_25

    invoke-static/range {p7 .. p7}, Lkotlin/coroutines/jvm/internal/h;->c(Lm8/e;)V

    :cond_25
    return-object p0
.end method

.method private final p()Z
    .registers 2

    invoke-virtual {p0}, LA6/b;->k()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-direct {p0}, LA6/b;->j()Z

    move-result p0

    if-nez p0, :cond_e

    const/4 p0, 0x1

    return p0

    :cond_e
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final d(ILm8/e;)Ljava/lang/Object;
    .registers 35

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, LA6/b$a;

    if-eqz v2, :cond_18

    move-object v2, v1

    check-cast v2, LA6/b$a;

    iget v3, v2, LA6/b$a;->C:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_18

    sub-int/2addr v3, v4

    iput v3, v2, LA6/b$a;->C:I

    :goto_16
    move-object v10, v2

    goto :goto_1e

    :cond_18
    new-instance v2, LA6/b$a;

    invoke-direct {v2, v0, v1}, LA6/b$a;-><init>(LA6/b;Lm8/e;)V

    goto :goto_16

    :goto_1e
    iget-object v1, v10, LA6/b$a;->A:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v2

    iget v3, v10, LA6/b$a;->C:I

    const/4 v4, 0x1

    const-string v5, "."

    const/4 v6, 0x2

    if-eqz v3, :cond_70

    if-eq v3, v4, :cond_3c

    if-ne v3, v6, :cond_34

    invoke-static {v1}, Lh8/r;->b(Ljava/lang/Object;)V

    return-object v1

    :cond_34
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3c
    iget-wide v3, v10, LA6/b$a;->z:J

    iget v0, v10, LA6/b$a;->y:I

    iget-object v9, v10, LA6/b$a;->x:Ljava/lang/Object;

    check-cast v9, Lx6/k;

    iget-object v11, v10, LA6/b$a;->w:Ljava/lang/Object;

    check-cast v11, LC6/j;

    iget-object v12, v10, LA6/b$a;->v:Ljava/lang/Object;

    check-cast v12, Lh8/h;

    iget-object v13, v10, LA6/b$a;->u:Ljava/lang/Object;

    check-cast v13, LC6/g;

    iget-object v14, v10, LA6/b$a;->t:Ljava/lang/Object;

    check-cast v14, Ljava/lang/String;

    iget-object v15, v10, LA6/b$a;->s:Ljava/lang/Object;

    check-cast v15, Lh3/W;

    iget-object v6, v10, LA6/b$a;->r:Ljava/lang/Object;

    check-cast v6, LK1/a;

    const/16 v16, 0x0

    iget-object v7, v10, LA6/b$a;->q:Ljava/lang/Object;

    check-cast v7, LA6/b;

    invoke-static {v1}, Lh8/r;->b(Ljava/lang/Object;)V

    move-object v8, v9

    move v9, v0

    move-object v0, v2

    move-object v2, v6

    move-wide/from16 v30, v3

    move-object v3, v7

    :goto_6c
    move-wide/from16 v6, v30

    goto/16 :goto_18a

    :cond_70
    const/16 v16, 0x0

    invoke-static {v1}, Lh8/r;->b(Ljava/lang/Object;)V

    invoke-virtual {v0}, LA6/b;->h()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lx0/l;->a(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_8b

    sget-object v0, LA6/b;->c:Lq6/b;

    const-string v1, "user not unlocked, couldn\'t read wallpaper SP."

    invoke-virtual {v0, v1}, Lq6/b;->c(Ljava/lang/String;)V

    invoke-static/range {v16 .. v16}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :cond_8b
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    sget-object v1, LA6/b;->c:Lq6/b;

    const-string v3, "start run blur daemon."

    invoke-virtual {v1, v3}, Lq6/b;->c(Ljava/lang/String;)V

    invoke-static {}, Lh3/I;->a()Lh3/H;

    move-result-object v3

    const-string v9, "null cannot be cast to non-null type com.android.customization.module.CustomizationInjector"

    invoke-static {v3, v9}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, LK1/a;

    invoke-virtual {v0}, LA6/b;->h()Landroid/content/Context;

    move-result-object v9

    invoke-interface {v3, v9}, Lh3/H;->f(Landroid/content/Context;)Lh3/W;

    move-result-object v15

    invoke-interface {v15}, Lh3/W;->R()Ljava/lang/String;

    move-result-object v14

    sget-object v9, LC6/g;->e:LC6/g$a;

    invoke-virtual {v9, v14}, LC6/g$a;->a(Ljava/lang/String;)LC6/g;

    move-result-object v13

    new-instance v9, LA6/a;

    invoke-direct {v9, v3}, LA6/a;-><init>(LK1/a;)V

    invoke-static {v9}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object v12

    if-nez v13, :cond_c8

    const-string v0, "run blur daemon but can\'t get homeLiveEffectInfo."

    invoke-virtual {v1, v0}, Lq6/b;->c(Ljava/lang/String;)V

    invoke-static/range {v16 .. v16}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :cond_c8
    invoke-virtual {v13}, LC6/g;->f()LC6/j;

    move-result-object v11

    if-eqz v11, :cond_d3

    invoke-virtual {v11}, LC6/j;->b()Landroid/graphics/PointF;

    move-result-object v9

    goto :goto_d4

    :cond_d3
    const/4 v9, 0x0

    :goto_d4
    if-eqz v11, :cond_dd

    invoke-virtual {v11}, LC6/j;->d()Landroid/graphics/Point;

    move-result-object v17

    move-object/from16 v21, v17

    goto :goto_df

    :cond_dd
    const/16 v21, 0x0

    :goto_df
    if-eqz v11, :cond_275

    if-eqz v9, :cond_275

    if-nez v21, :cond_e7

    goto/16 :goto_275

    :cond_e7
    new-instance v4, Lx6/k;

    invoke-virtual {v0}, LA6/b;->h()Landroid/content/Context;

    move-result-object v8

    invoke-interface {v3, v8}, LK1/a;->o(Landroid/content/Context;)Lx6/q;

    move-result-object v8

    move-object/from16 v27, v2

    invoke-virtual {v0}, LA6/b;->h()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v0}, LA6/b;->h()Landroid/content/Context;

    move-result-object v18

    move-wide/from16 v28, v6

    invoke-static/range {v18 .. v18}, LG6/e;->c(Landroid/content/Context;)Lx6/c;

    move-result-object v6

    invoke-virtual {v13}, LC6/g;->d()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v4, v8, v2, v6, v7}, Lx6/k;-><init>(Lx6/q;Landroid/content/Context;Lcom/android/wallpaper/asset/a;Ljava/lang/String;)V

    invoke-virtual {v4}, Lx6/k;->q()Lw6/d;

    move-result-object v2

    invoke-virtual {v2}, Lw6/d;->c()Lw6/b;

    move-result-object v2

    move/from16 v7, v16

    const/4 v6, 0x2

    const/4 v8, 0x0

    invoke-static {v2, v7, v7, v6, v8}, LG6/a;->c(Lw6/b;ZZILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v19

    if-nez v19, :cond_136

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "run blur daemon but can\'t get rawBitmap from Manager for EffectInfo: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lq6/b;->c(Ljava/lang/String;)V

    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :cond_136
    new-instance v18, LD6/k;

    invoke-virtual {v0}, LA6/b;->h()Landroid/content/Context;

    move-result-object v20

    const/16 v25, 0x10

    const/16 v26, 0x0

    const/high16 v22, 0x3f800000    # 1.0f

    const/16 v23, 0x0

    const/16 v24, 0x0

    invoke-direct/range {v18 .. v26}, LD6/k;-><init>(Landroid/graphics/Bitmap;Landroid/content/Context;Landroid/graphics/Point;FLg3/x;ZILkotlin/jvm/internal/h;)V

    move-object/from16 v1, v18

    move-object/from16 v8, v21

    new-instance v2, Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    invoke-virtual {v11}, LC6/j;->c()F

    move-result v6

    invoke-direct {v2, v6, v9, v8}, Lcom/nothing/wallpaper/effects/data/model/ViewScope;-><init>(FLandroid/graphics/PointF;Landroid/graphics/Point;)V

    sget-object v6, LC6/a;->q:LC6/a;

    invoke-static {v6}, Li8/s;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    iput-object v0, v10, LA6/b$a;->q:Ljava/lang/Object;

    iput-object v3, v10, LA6/b$a;->r:Ljava/lang/Object;

    iput-object v15, v10, LA6/b$a;->s:Ljava/lang/Object;

    iput-object v14, v10, LA6/b$a;->t:Ljava/lang/Object;

    iput-object v13, v10, LA6/b$a;->u:Ljava/lang/Object;

    iput-object v12, v10, LA6/b$a;->v:Ljava/lang/Object;

    iput-object v11, v10, LA6/b$a;->w:Ljava/lang/Object;

    iput-object v4, v10, LA6/b$a;->x:Ljava/lang/Object;

    move/from16 v7, p1

    iput v7, v10, LA6/b$a;->y:I

    move-wide/from16 v8, v28

    iput-wide v8, v10, LA6/b$a;->z:J

    const/4 v0, 0x1

    iput v0, v10, LA6/b$a;->C:I

    invoke-virtual {v1, v2, v6, v10}, LD6/k;->f(Lcom/nothing/wallpaper/effects/data/model/ViewScope;Ljava/util/List;Lm8/e;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v0, v27

    if-ne v1, v0, :cond_181

    goto/16 :goto_253

    :cond_181
    move-wide/from16 v30, v8

    move v9, v7

    move-object v2, v3

    move-object v8, v4

    move-object/from16 v3, p0

    goto/16 :goto_6c

    :goto_18a
    check-cast v1, Ljava/util/List;

    if-eqz v1, :cond_255

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_194
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1b4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v17, v4

    check-cast v17, LC6/b;

    move-object/from16 p0, v1

    invoke-virtual/range {v17 .. v17}, LC6/b;->c()LC6/a;

    move-result-object v1

    move-object/from16 p1, v2

    sget-object v2, LC6/a;->q:LC6/a;

    if-ne v1, v2, :cond_1af

    goto :goto_1b7

    :cond_1af
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    goto :goto_194

    :cond_1b4
    move-object/from16 p1, v2

    const/4 v4, 0x0

    :goto_1b7
    check-cast v4, LC6/b;

    if-eqz v4, :cond_255

    invoke-virtual {v4}, LC6/b;->a()LC6/i;

    move-result-object v1

    invoke-virtual {v1}, LC6/i;->e()I

    move-result v2

    invoke-virtual {v1}, LC6/i;->d()I

    move-result v5

    sget-object v14, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v2, v5, v14}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v2

    const-string v5, "createBitmap(...)"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v13}, LC6/g;->e()LE6/a$a;

    move-result-object v5

    if-eqz v5, :cond_1f0

    new-instance v4, Lw6/a;

    invoke-interface/range {p1 .. p1}, LK1/a;->B()Ljava/util/List;

    move-result-object v14

    invoke-direct {v4, v14, v8}, Lw6/a;-><init>(Ljava/util/List;Lx6/k;)V

    new-instance v14, Lw6/c;

    invoke-direct {v14, v11, v5}, Lw6/c;-><init>(LC6/j;LE6/a$a;)V

    sget-object v5, LC6/i;->h:LC6/i$a;

    invoke-virtual {v5, v2}, LC6/i$a;->a(Landroid/graphics/Bitmap;)LC6/i;

    move-result-object v5

    invoke-virtual {v4, v14, v1, v5}, Lw6/a;->c(Lw6/c;LC6/i;LC6/i;)V

    goto :goto_1f8

    :cond_1f0
    invoke-virtual {v4}, LC6/b;->a()LC6/i;

    move-result-object v1

    invoke-virtual {v1}, LC6/i;->a()Landroid/graphics/Bitmap;

    move-result-object v2

    :goto_1f8
    new-instance v5, LA6/d;

    invoke-interface {v15}, Lh3/W;->S()Ljava/util/List;

    move-result-object v1

    invoke-interface {v15}, Lh3/W;->u()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v15}, Lh3/W;->H()Ljava/lang/String;

    move-result-object v11

    invoke-interface {v15}, Lh3/W;->J()Ljava/lang/String;

    move-result-object v14

    invoke-direct {v5, v1, v4, v11, v14}, LA6/d;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v5, v13}, Lg3/x;->v(LC6/g;)V

    sget-object v1, LA6/b;->c:Lq6/b;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v13

    sub-long/2addr v13, v6

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "bitmap build success,consume "

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v6, ", start set."

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lq6/b;->a(Ljava/lang/String;)V

    invoke-static {v12}, LA6/b;->g(Lh8/h;)Lh3/a0;

    move-result-object v4

    invoke-interface {v15}, Lh3/W;->z()Landroid/app/WallpaperColors;

    move-result-object v7

    const/4 v1, 0x0

    iput-object v1, v10, LA6/b$a;->q:Ljava/lang/Object;

    iput-object v1, v10, LA6/b$a;->r:Ljava/lang/Object;

    iput-object v1, v10, LA6/b$a;->s:Ljava/lang/Object;

    iput-object v1, v10, LA6/b$a;->t:Ljava/lang/Object;

    iput-object v1, v10, LA6/b$a;->u:Ljava/lang/Object;

    iput-object v1, v10, LA6/b$a;->v:Ljava/lang/Object;

    iput-object v1, v10, LA6/b$a;->w:Ljava/lang/Object;

    iput-object v1, v10, LA6/b$a;->x:Ljava/lang/Object;

    const/4 v6, 0x2

    iput v6, v10, LA6/b$a;->C:I

    move-object v6, v2

    invoke-direct/range {v3 .. v10}, LA6/b;->o(Lh3/a0;Lg3/x;Landroid/graphics/Bitmap;Landroid/app/WallpaperColors;Lx6/k;ILm8/e;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_254

    :goto_253
    return-object v0

    :cond_254
    return-object v1

    :cond_255
    sget-object v0, LA6/b;->c:Lq6/b;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "run blur daemon but get croppedBitmap failed for EffectInfo: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lq6/b;->c(Ljava/lang/String;)V

    const/16 v16, 0x0

    invoke-static/range {v16 .. v16}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :cond_275
    :goto_275
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "run blur daemon but can\'t get scope or viewSize or center from EffectInfo: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lq6/b;->c(Ljava/lang/String;)V

    const/16 v16, 0x0

    invoke-static/range {v16 .. v16}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public final h()Landroid/content/Context;
    .registers 1

    sget-object p0, LA6/b;->b:Landroid/content/Context;

    if-eqz p0, :cond_5

    return-object p0

    :cond_5
    const-string p0, "appContext"

    invoke-static {p0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public final i(Landroid/app/Application;)V
    .registers 3

    const-string v0, "app"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LA6/b;->n(Landroid/content/Context;)V

    sget-object p1, Li6/o;->a:Li6/o;

    invoke-virtual {p0}, LA6/b;->h()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1, v0}, Li6/o;->a(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_22

    sget-object p1, LA6/b;->c:Lq6/b;

    const-string v0, "in blur progress, try register BlurDaemon."

    invoke-virtual {p1, v0}, Lq6/b;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, LA6/b;->h()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p0, p1}, LA6/b;->m(Landroid/content/Context;)V

    :cond_22
    return-void
.end method

.method public final k()Z
    .registers 3

    invoke-virtual {p0}, LA6/b;->h()Landroid/content/Context;

    move-result-object p0

    const-string v0, "wallpaper"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    const-string v0, "null cannot be cast to non-null type android.app.WallpaperManager"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Landroid/app/WallpaperManager;

    invoke-virtual {p0}, Landroid/app/WallpaperManager;->getWallpaperInfo()Landroid/app/WallpaperInfo;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_20

    invoke-static {p0}, LG6/e;->h(Landroid/app/WallpaperInfo;)Z

    move-result p0

    const/4 v1, 0x1

    if-ne p0, v1, :cond_20

    return v1

    :cond_20
    return v0
.end method

.method public final declared-synchronized l()V
    .registers 10

    monitor-enter p0

    :try_start_1
    invoke-direct {p0}, LA6/b;->j()Z

    move-result v0

    sget-object v1, LA6/b;->c:Lq6/b;

    invoke-direct {p0}, LA6/b;->p()Z

    move-result v2

    invoke-virtual {p0}, LA6/b;->k()Z

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "onWallpaperChanged: shouldRunDaemon="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", isBlurRunning="

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", isBlurDamaged="

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lq6/b;->a(Ljava/lang/String;)V

    if-eqz v0, :cond_c3

    sget-object v0, LA6/b;->e:LF8/x0;

    const/4 v2, 0x0

    if-eqz v0, :cond_46

    invoke-interface {v0}, LF8/x0;->a()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_47

    :catchall_43
    move-exception v0

    goto/16 :goto_c5

    :cond_46
    move-object v0, v2

    :goto_47
    sget-object v3, LA6/b;->e:LF8/x0;

    if-eqz v3, :cond_54

    invoke-interface {v3}, LF8/x0;->O0()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    goto :goto_55

    :cond_54
    move-object v3, v2

    :goto_55
    sget-object v4, LA6/b;->e:LF8/x0;

    if-eqz v4, :cond_62

    invoke-interface {v4}, LF8/x0;->isCancelled()Z

    move-result v4

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    goto :goto_63

    :cond_62
    move-object v4, v2

    :goto_63
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "blur damaged, build job, last job: isActive="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " isCompleted="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " isCancel="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lq6/b;->a(Ljava/lang/String;)V

    sget-object v0, LA6/b;->e:LF8/x0;

    if-eqz v0, :cond_93

    if-eqz v0, :cond_c3

    invoke-interface {v0}, LF8/x0;->a()Z

    move-result v0

    if-nez v0, :cond_c3

    :cond_93
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "run a new job, thread:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lq6/b;->a(Ljava/lang/String;)V

    sget-object v3, LF8/r0;->q:LF8/r0;

    invoke-static {}, LF8/b0;->b()LF8/I;

    move-result-object v4

    new-instance v6, LA6/b$b;

    invoke-direct {v6, v2}, LA6/b$b;-><init>(Lm8/e;)V

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    move-result-object v0

    sput-object v0, LA6/b;->e:LF8/x0;
    :try_end_c3
    .catchall {:try_start_1 .. :try_end_c3} :catchall_43

    :cond_c3
    monitor-exit p0

    return-void

    :goto_c5
    :try_start_c5
    monitor-exit p0
    :try_end_c6
    .catchall {:try_start_c5 .. :try_end_c6} :catchall_43

    throw v0
.end method

.method public final declared-synchronized m(Landroid/content/Context;)V
    .registers 5

    monitor-enter p0

    :try_start_1
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p0, p1}, LA6/b;->n(Landroid/content/Context;)V

    sget-object p1, LA6/b;->d:LB6/a;

    if-nez p1, :cond_32

    sget-object p1, LA6/b;->c:Lq6/b;

    const-string v0, "register daemon blur."

    invoke-virtual {p1, v0}, Lq6/b;->a(Ljava/lang/String;)V

    new-instance p1, LB6/a;

    invoke-direct {p1}, LB6/a;-><init>()V

    sput-object p1, LA6/b;->d:LB6/a;

    invoke-virtual {p0}, LA6/b;->h()Landroid/content/Context;

    move-result-object p1

    sget-object v0, LA6/b;->d:LB6/a;

    new-instance v1, Landroid/content/IntentFilter;

    const-string v2, "android.intent.action.WALLPAPER_CHANGED"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    goto :goto_32

    :catchall_30
    move-exception p1

    goto :goto_44

    :cond_32
    :goto_32
    invoke-direct {p0}, LA6/b;->j()Z

    move-result p1

    if-eqz p1, :cond_42

    sget-object p1, LA6/b;->c:Lq6/b;

    const-string v0, "register but blur damaged, run daemon task."

    invoke-virtual {p1, v0}, Lq6/b;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, LA6/b;->l()V
    :try_end_42
    .catchall {:try_start_1 .. :try_end_42} :catchall_30

    :cond_42
    monitor-exit p0

    return-void

    :goto_44
    :try_start_44
    monitor-exit p0
    :try_end_45
    .catchall {:try_start_44 .. :try_end_45} :catchall_30

    throw p1
.end method

.method public final n(Landroid/content/Context;)V
    .registers 2

    const-string p0, "<set-?>"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p1, LA6/b;->b:Landroid/content/Context;

    return-void
.end method
