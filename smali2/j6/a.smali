.class public final Lj6/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj6/a$a;,
        Lj6/a$b;,
        Lj6/a$c;
    }
.end annotation


# static fields
.field public static final a:Lj6/a;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, Lj6/a;

    invoke-direct {v0}, Lj6/a;-><init>()V

    sput-object v0, Lj6/a;->a:Lj6/a;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .registers 13

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    mul-int p0, v3, v7

    new-array v1, p0, [I

    new-array v8, p0, [I

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    move v6, v3

    move-object v0, p1

    invoke-virtual/range {v0 .. v7}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    move-object p1, v1

    move-object v0, p2

    move-object v1, v8

    invoke-virtual/range {v0 .. v7}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v3, v7, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    const-string v2, "createBitmap(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, v1

    new-array v1, p0, [I

    :goto_2a
    if-ge v4, p0, :cond_49

    aget v5, p1, v4

    aget v6, v2, v4

    invoke-static {v6}, Landroid/graphics/Color;->red(I)I

    move-result v6

    invoke-static {v5}, Landroid/graphics/Color;->red(I)I

    move-result v8

    invoke-static {v5}, Landroid/graphics/Color;->green(I)I

    move-result v9

    invoke-static {v5}, Landroid/graphics/Color;->blue(I)I

    move-result v5

    invoke-static {v6, v8, v9, v5}, Landroid/graphics/Color;->argb(IIII)I

    move-result v5

    aput v5, v1, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_2a

    :cond_49
    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    move v6, v3

    invoke-virtual/range {v0 .. v7}, Landroid/graphics/Bitmap;->setPixels([IIIIIII)V

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->recycle()V

    return-object v0
.end method

.method private final b(Landroid/content/Context;Landroid/graphics/Bitmap;F)Landroid/graphics/Bitmap;
    .registers 7

    const p0, 0x3dcccccd    # 0.1f

    const/high16 v0, 0x41c80000    # 25.0f

    invoke-static {p3, p0, v0}, LB8/h;->l(FFF)F

    move-result p0

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result p3

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {p3, v0, v1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object p3

    const-string v0, "createBitmap(...)"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    :try_start_1d
    invoke-static {p1}, Landroid/renderscript/RenderScript;->create(Landroid/content/Context;)Landroid/renderscript/RenderScript;

    move-result-object v0

    invoke-static {v0, p2}, Landroid/renderscript/Allocation;->createFromBitmap(Landroid/renderscript/RenderScript;Landroid/graphics/Bitmap;)Landroid/renderscript/Allocation;

    move-result-object p1

    invoke-virtual {p1}, Landroid/renderscript/Allocation;->getType()Landroid/renderscript/Type;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/renderscript/Allocation;->createTyped(Landroid/renderscript/RenderScript;Landroid/renderscript/Type;)Landroid/renderscript/Allocation;

    move-result-object v1

    invoke-static {v0}, Landroid/renderscript/Element;->U8_4(Landroid/renderscript/RenderScript;)Landroid/renderscript/Element;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/renderscript/ScriptIntrinsicBlur;->create(Landroid/renderscript/RenderScript;Landroid/renderscript/Element;)Landroid/renderscript/ScriptIntrinsicBlur;

    move-result-object v2

    invoke-virtual {v2, p0}, Landroid/renderscript/ScriptIntrinsicBlur;->setRadius(F)V

    invoke-virtual {v2, p1}, Landroid/renderscript/ScriptIntrinsicBlur;->setInput(Landroid/renderscript/Allocation;)V

    invoke-virtual {v2, v1}, Landroid/renderscript/ScriptIntrinsicBlur;->forEach(Landroid/renderscript/Allocation;)V

    invoke-virtual {v1, p3}, Landroid/renderscript/Allocation;->copyTo(Landroid/graphics/Bitmap;)V
    :try_end_41
    .catch Ljava/lang/Exception; {:try_start_1d .. :try_end_41} :catch_49
    .catchall {:try_start_1d .. :try_end_41} :catchall_47

    if-eqz v0, :cond_46

    invoke-virtual {v0}, Landroid/renderscript/RenderScript;->destroy()V

    :cond_46
    return-object p3

    :catchall_47
    move-exception p0

    goto :goto_6a

    :catch_49
    move-exception p0

    :try_start_4a
    const-string p1, "BitmapEdgeRefineUtil"

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p3

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "blurAlphaChannel error: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {p1, p3, p0}, Lcom/nothing/wallpaper/common/log/c;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_64
    .catchall {:try_start_4a .. :try_end_64} :catchall_47

    if-eqz v0, :cond_69

    invoke-virtual {v0}, Landroid/renderscript/RenderScript;->destroy()V

    :cond_69
    return-object p2

    :goto_6a
    if-eqz v0, :cond_6f

    invoke-virtual {v0}, Landroid/renderscript/RenderScript;->destroy()V

    :cond_6f
    throw p0
.end method

.method private final c([III)[I
    .registers 13

    mul-int p0, p2, p3

    new-array v0, p0, [I

    const/4 v1, 0x0

    move v2, v1

    :goto_6
    const v3, 0x7fffffff

    if-ge v2, p0, :cond_10

    aput v3, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    :cond_10
    move v2, v1

    :goto_11
    if-ge v2, p3, :cond_a3

    move v4, v1

    :goto_14
    if-ge v4, p2, :cond_9f

    mul-int v5, v2, p2

    add-int/2addr v5, v4

    aget v6, p1, v5

    invoke-static {v6}, Landroid/graphics/Color;->alpha(I)I

    move-result v6

    if-lez v6, :cond_9b

    if-eqz v4, :cond_99

    add-int/lit8 v6, p2, -0x1

    if-eq v4, v6, :cond_99

    if-eqz v2, :cond_99

    add-int/lit8 v6, p3, -0x1

    if-ne v2, v6, :cond_2f

    goto/16 :goto_99

    :cond_2f
    add-int/lit8 v6, v5, -0x1

    aget v6, p1, v6

    invoke-static {v6}, Landroid/graphics/Color;->alpha(I)I

    move-result v6

    if-eqz v6, :cond_99

    add-int/lit8 v6, v5, 0x1

    aget v6, p1, v6

    invoke-static {v6}, Landroid/graphics/Color;->alpha(I)I

    move-result v6

    if-eqz v6, :cond_99

    sub-int v6, v5, p2

    aget v6, p1, v6

    invoke-static {v6}, Landroid/graphics/Color;->alpha(I)I

    move-result v6

    if-eqz v6, :cond_99

    add-int v6, v5, p2

    aget v6, p1, v6

    invoke-static {v6}, Landroid/graphics/Color;->alpha(I)I

    move-result v6

    if-nez v6, :cond_58

    goto :goto_99

    :cond_58
    if-lez v4, :cond_65

    add-int/lit8 v6, v5, -0x1

    aget v6, v0, v6

    add-int/lit8 v6, v6, 0x1

    invoke-static {v3, v6}, Ljava/lang/Math;->min(II)I

    move-result v6

    goto :goto_66

    :cond_65
    move v6, v3

    :goto_66
    if-lez v2, :cond_72

    sub-int v7, v5, p2

    aget v7, v0, v7

    add-int/lit8 v7, v7, 0x1

    invoke-static {v6, v7}, Ljava/lang/Math;->min(II)I

    move-result v6

    :cond_72
    if-lez v4, :cond_82

    if-lez v2, :cond_82

    sub-int v7, v5, p2

    add-int/lit8 v7, v7, -0x1

    aget v7, v0, v7

    add-int/lit8 v7, v7, 0x1

    invoke-static {v6, v7}, Ljava/lang/Math;->min(II)I

    move-result v6

    :cond_82
    add-int/lit8 v7, p2, -0x1

    if-ge v4, v7, :cond_94

    if-lez v2, :cond_94

    sub-int v7, v5, p2

    add-int/lit8 v7, v7, 0x1

    aget v7, v0, v7

    add-int/lit8 v7, v7, 0x1

    invoke-static {v6, v7}, Ljava/lang/Math;->min(II)I

    move-result v6

    :cond_94
    if-ge v6, v3, :cond_9b

    aput v6, v0, v5

    goto :goto_9b

    :cond_99
    :goto_99
    aput v1, v0, v5

    :cond_9b
    :goto_9b
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_14

    :cond_9f
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_11

    :cond_a3
    add-int/lit8 p3, p3, -0x1

    move p1, p3

    :goto_a6
    const/4 v2, -0x1

    if-ge v2, p1, :cond_f5

    add-int/lit8 v4, p2, -0x1

    move v5, v4

    :goto_ac
    if-ge v2, v5, :cond_f2

    mul-int v6, p1, p2

    add-int/2addr v6, v5

    aget v7, v0, v6

    if-ge v7, v3, :cond_ef

    if-ge v5, v4, :cond_c1

    add-int/lit8 v8, v6, 0x1

    aget v8, v0, v8

    add-int/lit8 v8, v8, 0x1

    invoke-static {v7, v8}, Ljava/lang/Math;->min(II)I

    move-result v7

    :cond_c1
    if-ge p1, p3, :cond_cd

    add-int v8, v6, p2

    aget v8, v0, v8

    add-int/lit8 v8, v8, 0x1

    invoke-static {v7, v8}, Ljava/lang/Math;->min(II)I

    move-result v7

    :cond_cd
    if-ge v5, v4, :cond_dd

    if-ge p1, p3, :cond_dd

    add-int v8, v6, p2

    add-int/lit8 v8, v8, 0x1

    aget v8, v0, v8

    add-int/lit8 v8, v8, 0x1

    invoke-static {v7, v8}, Ljava/lang/Math;->min(II)I

    move-result v7

    :cond_dd
    if-lez v5, :cond_ed

    if-ge p1, p3, :cond_ed

    add-int v8, v6, p2

    add-int/lit8 v8, v8, -0x1

    aget v8, v0, v8

    add-int/lit8 v8, v8, 0x1

    invoke-static {v7, v8}, Ljava/lang/Math;->min(II)I

    move-result v7

    :cond_ed
    aput v7, v0, v6

    :cond_ef
    add-int/lit8 v5, v5, -0x1

    goto :goto_ac

    :cond_f2
    add-int/lit8 p1, p1, -0x1

    goto :goto_a6

    :cond_f5
    :goto_f5
    if-ge v1, p0, :cond_100

    aget p1, v0, v1

    if-ne p1, v3, :cond_fd

    aput v2, v0, v1

    :cond_fd
    add-int/lit8 v1, v1, 0x1

    goto :goto_f5

    :cond_100
    return-object v0
.end method

.method private final d(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Ljava/nio/FloatBuffer;Lj6/a$c;)Landroid/graphics/Bitmap;
    .registers 32

    move-object/from16 v0, p0

    invoke-virtual/range {p2 .. p2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    invoke-virtual/range {p2 .. p2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v8

    mul-int v9, v4, v8

    new-array v2, v9, [I

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v3, 0x0

    move v7, v4

    move-object/from16 v1, p2

    invoke-virtual/range {v1 .. v8}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    move-object v13, v2

    if-eqz p1, :cond_39

    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v1

    if-nez v1, :cond_39

    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    if-ne v1, v4, :cond_39

    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    if-ne v1, v8, :cond_39

    new-array v2, v9, [I

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v3, 0x0

    move v7, v4

    move-object/from16 v1, p1

    invoke-virtual/range {v1 .. v8}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    move-object v1, v2

    goto :goto_3a

    :cond_39
    const/4 v1, 0x0

    :goto_3a
    invoke-virtual/range {p4 .. p4}, Lj6/a$c;->a()I

    move-result v2

    const/16 v3, 0xfe

    const/4 v15, 0x0

    invoke-static {v2, v15, v3}, LB8/h;->m(III)I

    move-result v6

    invoke-virtual/range {p4 .. p4}, Lj6/a$c;->g()I

    move-result v2

    const/4 v3, 0x2

    rem-int/2addr v2, v3

    const/4 v5, 0x1

    if-nez v2, :cond_54

    invoke-virtual/range {p4 .. p4}, Lj6/a$c;->g()I

    move-result v2

    add-int/2addr v2, v5

    goto :goto_58

    :cond_54
    invoke-virtual/range {p4 .. p4}, Lj6/a$c;->g()I

    move-result v2

    :goto_58
    const/16 v7, 0x9

    const/4 v10, 0x3

    invoke-static {v2, v10, v7}, LB8/h;->m(III)I

    move-result v2

    div-int/2addr v2, v3

    invoke-virtual/range {p4 .. p4}, Lj6/a$c;->d()I

    move-result v7

    const/4 v11, 0x6

    invoke-static {v7, v15, v11}, LB8/h;->m(III)I

    move-result v7

    invoke-virtual/range {p4 .. p4}, Lj6/a$c;->f()I

    move-result v11

    invoke-static {v11, v5, v10}, LB8/h;->m(III)I

    move-result v10

    invoke-virtual/range {p4 .. p4}, Lj6/a$c;->l()Z

    move-result v16

    invoke-virtual/range {p4 .. p4}, Lj6/a$c;->q()I

    move-result v11

    const/16 v12, 0x8

    invoke-static {v11, v5, v12}, LB8/h;->m(III)I

    move-result v11

    new-array v12, v9, [Z

    move v3, v15

    :goto_82
    if-ge v3, v9, :cond_92

    aget v17, v13, v3

    ushr-int/lit8 v14, v17, 0x18

    if-le v14, v6, :cond_8c

    move v14, v5

    goto :goto_8d

    :cond_8c
    move v14, v15

    :goto_8d
    aput-boolean v14, v12, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_82

    :cond_92
    new-array v3, v9, [Z

    move v9, v15

    :goto_95
    if-ge v9, v8, :cond_df

    mul-int v14, v9, v4

    move/from16 v17, v15

    :goto_9b
    if-ge v15, v4, :cond_d8

    add-int v18, v14, v15

    aget-boolean v19, v12, v18

    if-eqz v19, :cond_d1

    if-lez v15, :cond_ae

    add-int/lit8 v19, v18, -0x1

    aget-boolean v19, v12, v19

    if-nez v19, :cond_ae

    move/from16 v19, v5

    goto :goto_ce

    :cond_ae
    move/from16 v19, v5

    add-int/lit8 v5, v4, -0x1

    if-ge v15, v5, :cond_bb

    add-int/lit8 v5, v18, 0x1

    aget-boolean v5, v12, v5

    if-nez v5, :cond_bb

    goto :goto_ce

    :cond_bb
    if-lez v9, :cond_c4

    sub-int v5, v18, v4

    aget-boolean v5, v12, v5

    if-nez v5, :cond_c4

    goto :goto_ce

    :cond_c4
    add-int/lit8 v5, v8, -0x1

    if-ge v9, v5, :cond_d3

    add-int v5, v18, v4

    aget-boolean v5, v12, v5

    if-nez v5, :cond_d3

    :goto_ce
    aput-boolean v19, v3, v18

    goto :goto_d3

    :cond_d1
    move/from16 v19, v5

    :cond_d3
    :goto_d3
    add-int/lit8 v15, v15, 0x1

    move/from16 v5, v19

    goto :goto_9b

    :cond_d8
    move/from16 v19, v5

    add-int/lit8 v9, v9, 0x1

    move/from16 v15, v17

    goto :goto_95

    :cond_df
    move/from16 v19, v5

    move/from16 v17, v15

    if-gtz v7, :cond_e7

    :goto_e5
    move-object v14, v3

    goto :goto_ec

    :cond_e7
    invoke-direct {v0, v3, v4, v8, v7}, Lj6/a;->e([ZIII)[Z

    move-result-object v3

    goto :goto_e5

    :goto_ec
    move/from16 v5, v17

    :goto_ee
    move-object v3, v12

    if-ge v5, v10, :cond_18f

    invoke-virtual {v3}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v7

    move-object v12, v7

    check-cast v12, [Z

    move/from16 v7, v17

    :goto_fa
    if-ge v7, v8, :cond_181

    mul-int v9, v7, v4

    move/from16 v15, v17

    :goto_100
    if-ge v15, v4, :cond_171

    add-int v18, v9, v15

    aget-boolean v20, v14, v18

    if-eqz v20, :cond_15c

    neg-int v0, v2

    move-object/from16 v22, v1

    move-object/from16 v23, v3

    if-gt v0, v2, :cond_144

    move/from16 v20, v17

    move/from16 v21, v20

    move v1, v0

    :goto_114
    add-int v3, v7, v1

    if-ltz v3, :cond_136

    if-ge v3, v8, :cond_136

    mul-int/2addr v3, v4

    if-gt v0, v2, :cond_136

    move/from16 v24, v0

    move/from16 v25, v3

    :goto_121
    add-int v3, v15, v0

    if-ltz v3, :cond_131

    if-ge v3, v4, :cond_131

    add-int/lit8 v21, v21, 0x1

    add-int v3, v25, v3

    aget-boolean v3, v23, v3

    if-eqz v3, :cond_131

    add-int/lit8 v20, v20, 0x1

    :cond_131
    if-eq v0, v2, :cond_138

    add-int/lit8 v0, v0, 0x1

    goto :goto_121

    :cond_136
    move/from16 v24, v0

    :cond_138
    if-eq v1, v2, :cond_13f

    add-int/lit8 v1, v1, 0x1

    move/from16 v0, v24

    goto :goto_114

    :cond_13f
    move/from16 v1, v20

    move/from16 v0, v21

    goto :goto_147

    :cond_144
    move/from16 v0, v17

    move v1, v0

    :goto_147
    invoke-virtual/range {p4 .. p4}, Lj6/a$c;->r()I

    move-result v3

    move/from16 v20, v2

    move/from16 v2, v19

    invoke-static {v3, v2, v0}, LB8/h;->m(III)I

    move-result v0

    if-lt v1, v0, :cond_157

    move v0, v2

    goto :goto_159

    :cond_157
    move/from16 v0, v17

    :goto_159
    aput-boolean v0, v12, v18

    goto :goto_164

    :cond_15c
    move-object/from16 v22, v1

    move/from16 v20, v2

    move-object/from16 v23, v3

    move/from16 v2, v19

    :goto_164
    add-int/lit8 v15, v15, 0x1

    move-object/from16 v0, p0

    move/from16 v19, v2

    move/from16 v2, v20

    move-object/from16 v1, v22

    move-object/from16 v3, v23

    goto :goto_100

    :cond_171
    move-object/from16 v22, v1

    move/from16 v20, v2

    move-object/from16 v23, v3

    move/from16 v2, v19

    add-int/lit8 v7, v7, 0x1

    move-object/from16 v0, p0

    move/from16 v2, v20

    goto/16 :goto_fa

    :cond_181
    move-object/from16 v22, v1

    move/from16 v20, v2

    move/from16 v2, v19

    add-int/lit8 v5, v5, 0x1

    move-object/from16 v0, p0

    move/from16 v2, v20

    goto/16 :goto_ee

    :cond_18f
    move-object/from16 v22, v1

    move-object/from16 v23, v3

    invoke-virtual/range {p4 .. p4}, Lj6/a$c;->h()Z

    move-result v0

    if-eqz v0, :cond_1c6

    if-eqz v22, :cond_1c6

    invoke-virtual/range {p4 .. p4}, Lj6/a$c;->b()I

    move-result v7

    move v5, v8

    invoke-virtual/range {p4 .. p4}, Lj6/a$c;->o()I

    move-result v8

    invoke-virtual/range {p4 .. p4}, Lj6/a$c;->p()I

    move-result v9

    invoke-virtual/range {p4 .. p4}, Lj6/a$c;->c()F

    move-result v10

    move v0, v11

    invoke-virtual/range {p4 .. p4}, Lj6/a$c;->s()I

    move-result v11

    invoke-virtual/range {p4 .. p4}, Lj6/a$c;->n()F

    move-result v12

    const/4 v15, 0x2

    move-object/from16 v2, p3

    move/from16 v26, v0

    move-object/from16 v1, v22

    move-object/from16 v3, v23

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v12}, Lj6/a;->o([ILjava/nio/FloatBuffer;[ZIIIIIIFIF)[Z

    move-result-object v3

    move v8, v5

    goto :goto_1cd

    :cond_1c6
    move-object/from16 v0, p0

    move/from16 v26, v11

    move-object/from16 v3, v23

    const/4 v15, 0x2

    :goto_1cd
    if-eqz v16, :cond_1d4

    invoke-direct {v0, v3, v4, v8}, Lj6/a;->g([ZII)[I

    move-result-object v0

    goto :goto_1d5

    :cond_1d4
    const/4 v0, 0x0

    :goto_1d5
    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v4, v8, v1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v1

    const-string v2, "createBitmap(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v13}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [I

    move/from16 v5, v17

    :goto_1e8
    if-ge v5, v8, :cond_29b

    mul-int v6, v5, v4

    move/from16 v7, v17

    :goto_1ee
    if-ge v7, v4, :cond_28e

    add-int v9, v6, v7

    aget-boolean v10, v3, v9

    if-nez v10, :cond_202

    aput v17, v2, v9

    :goto_1f8
    move-object/from16 p1, v0

    move-object/from16 p2, v1

    :cond_1fc
    move/from16 v12, v17

    move/from16 v11, v26

    goto/16 :goto_281

    :cond_202
    aget-boolean v10, v14, v9

    if-nez v10, :cond_207

    goto :goto_1f8

    :cond_207
    move/from16 v11, v17

    move v12, v11

    const/4 v10, -0x1

    :goto_20b
    if-ge v10, v15, :cond_23d

    add-int v15, v5, v10

    if-ltz v15, :cond_231

    if-ge v15, v8, :cond_231

    mul-int/2addr v15, v4

    move-object/from16 p1, v0

    move-object/from16 p2, v1

    const/4 v1, -0x1

    :goto_219
    const/4 v0, 0x2

    if-ge v1, v0, :cond_235

    add-int v0, v7, v1

    if-ltz v0, :cond_22e

    if-ge v0, v4, :cond_22e

    add-int/2addr v0, v15

    aget-boolean v19, v3, v0

    if-eqz v19, :cond_22e

    aget v0, v13, v0

    ushr-int/lit8 v0, v0, 0x18

    add-int/2addr v12, v0

    add-int/lit8 v11, v11, 0x1

    :cond_22e
    add-int/lit8 v1, v1, 0x1

    goto :goto_219

    :cond_231
    move-object/from16 p1, v0

    move-object/from16 p2, v1

    :cond_235
    add-int/lit8 v10, v10, 0x1

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    const/4 v15, 0x2

    goto :goto_20b

    :cond_23d
    move-object/from16 p1, v0

    move-object/from16 p2, v1

    if-lez v11, :cond_1fc

    div-int/2addr v12, v11

    const/16 v0, 0xff

    move/from16 v1, v17

    invoke-static {v12, v1, v0}, LB8/h;->m(III)I

    move-result v10

    if-eqz v16, :cond_273

    invoke-static/range {p1 .. p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    aget v1, p1, v9

    move/from16 v11, v26

    if-ltz v1, :cond_265

    if-gt v1, v11, :cond_265

    add-int/lit8 v1, v1, 0x1

    mul-int/2addr v1, v0

    add-int/lit8 v12, v11, 0x1

    div-int/2addr v1, v12

    const/4 v12, 0x0

    invoke-static {v1, v12, v0}, LB8/h;->m(III)I

    move-result v0

    goto :goto_266

    :cond_265
    const/4 v12, 0x0

    :goto_266
    aget v1, v13, v9

    ushr-int/lit8 v1, v1, 0x18

    invoke-static {v10, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v10

    goto :goto_276

    :cond_273
    move/from16 v11, v26

    const/4 v12, 0x0

    :goto_276
    aget v0, v13, v9

    const v1, 0xffffff

    and-int/2addr v0, v1

    shl-int/lit8 v1, v10, 0x18

    or-int/2addr v0, v1

    aput v0, v2, v9

    :goto_281
    add-int/lit8 v7, v7, 0x1

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move/from16 v26, v11

    move/from16 v17, v12

    const/4 v15, 0x2

    goto/16 :goto_1ee

    :cond_28e
    move-object/from16 p1, v0

    move-object/from16 p2, v1

    move/from16 v12, v17

    move/from16 v11, v26

    add-int/lit8 v5, v5, 0x1

    const/4 v15, 0x2

    goto/16 :goto_1e8

    :cond_29b
    move-object/from16 p2, v1

    const/4 v0, 0x0

    const/4 v5, 0x0

    move-object v1, v2

    const/4 v2, 0x0

    move v6, v4

    move v3, v4

    move v7, v8

    move v4, v0

    move-object/from16 v0, p2

    invoke-virtual/range {v0 .. v7}, Landroid/graphics/Bitmap;->setPixels([IIIIIII)V

    return-object v0
.end method

.method private final e([ZIII)[Z
    .registers 15

    invoke-virtual {p1}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Z

    const/4 v0, 0x6

    const/4 v1, 0x1

    invoke-static {p4, v1, v0}, LB8/h;->m(III)I

    move-result p4

    const/4 v0, 0x0

    move v2, v0

    :goto_e
    if-ge v2, p3, :cond_42

    mul-int v3, v2, p2

    move v4, v0

    :goto_13
    if-ge v4, p2, :cond_3f

    add-int v5, v3, v4

    aget-boolean v5, p1, v5

    if-eqz v5, :cond_3c

    neg-int v5, p4

    if-gt v5, p4, :cond_3c

    move v6, v5

    :goto_1f
    add-int v7, v2, v6

    if-ltz v7, :cond_37

    if-ge v7, p3, :cond_37

    mul-int/2addr v7, p2

    if-gt v5, p4, :cond_37

    move v8, v5

    :goto_29
    add-int v9, v4, v8

    if-ltz v9, :cond_32

    if-ge v9, p2, :cond_32

    add-int/2addr v9, v7

    aput-boolean v1, p0, v9

    :cond_32
    if-eq v8, p4, :cond_37

    add-int/lit8 v8, v8, 0x1

    goto :goto_29

    :cond_37
    if-eq v6, p4, :cond_3c

    add-int/lit8 v6, v6, 0x1

    goto :goto_1f

    :cond_3c
    add-int/lit8 v4, v4, 0x1

    goto :goto_13

    :cond_3f
    add-int/lit8 v2, v2, 0x1

    goto :goto_e

    :cond_42
    return-object p0
.end method

.method private final f(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
    .registers 21

    move/from16 v0, p2

    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    mul-int v9, v3, v7

    new-array v2, v9, [I

    const/4 v5, 0x0

    const/4 v6, 0x0

    move v4, v3

    const/4 v3, 0x0

    move v8, v7

    move v7, v4

    move-object/from16 v1, p1

    invoke-virtual/range {v1 .. v8}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v4, v8, v1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v1

    const-string v3, "createBitmap(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, v1

    new-array v1, v9, [I

    move v6, v5

    :goto_28
    if-ge v6, v9, :cond_2f

    aput v5, v1, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_28

    :cond_2f
    move v6, v5

    :goto_30
    if-ge v6, v8, :cond_ee

    move v7, v5

    :goto_33
    if-ge v7, v4, :cond_e0

    mul-int v9, v6, v4

    add-int/2addr v9, v7

    aget v10, v2, v9

    invoke-static {v10}, Landroid/graphics/Color;->alpha(I)I

    move-result v10

    if-lez v10, :cond_cc

    neg-int v10, v0

    if-gt v10, v0, :cond_cc

    move v11, v10

    :goto_44
    if-gt v10, v0, :cond_b6

    move v12, v10

    :goto_47
    add-int v13, v7, v12

    add-int v14, v6, v11

    if-ltz v13, :cond_a1

    if-ge v13, v4, :cond_a1

    if-ltz v14, :cond_a1

    if-ge v14, v8, :cond_a1

    mul-int/2addr v14, v4

    add-int/2addr v14, v13

    aget v13, v1, v14

    invoke-static {v13}, Landroid/graphics/Color;->alpha(I)I

    move-result v13

    if-nez v13, :cond_a1

    mul-int v13, v12, v12

    mul-int v15, v11, v11

    add-int/2addr v13, v15

    move v15, v6

    int-to-double v5, v13

    invoke-static {v5, v6}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v5

    double-to-float v5, v5

    int-to-float v6, v0

    cmpg-float v13, v5, v6

    if-gtz v13, :cond_77

    div-float/2addr v5, v6

    const v6, 0x3e99999a    # 0.3f

    mul-float/2addr v5, v6

    const/high16 v6, 0x3f800000    # 1.0f

    sub-float/2addr v6, v5

    goto :goto_78

    :cond_77
    const/4 v6, 0x0

    :goto_78
    aget v5, v2, v9

    invoke-static {v5}, Landroid/graphics/Color;->red(I)I

    move-result v13

    move-object/from16 p1, v1

    invoke-static {v5}, Landroid/graphics/Color;->green(I)I

    move-result v1

    move-object/from16 v16, v2

    invoke-static {v5}, Landroid/graphics/Color;->blue(I)I

    move-result v2

    invoke-static {v5}, Landroid/graphics/Color;->alpha(I)I

    move-result v5

    int-to-float v5, v5

    mul-float/2addr v5, v6

    float-to-int v5, v5

    const/16 v6, 0xff

    move-object/from16 v17, v3

    const/4 v3, 0x0

    invoke-static {v5, v3, v6}, LB8/h;->m(III)I

    move-result v5

    invoke-static {v5, v13, v1, v2}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    aput v1, p1, v14

    goto :goto_a9

    :cond_a1
    move-object/from16 p1, v1

    move-object/from16 v16, v2

    move-object/from16 v17, v3

    move v3, v5

    move v15, v6

    :goto_a9
    if-eq v12, v0, :cond_be

    add-int/lit8 v12, v12, 0x1

    move-object/from16 v1, p1

    move v5, v3

    move v6, v15

    move-object/from16 v2, v16

    move-object/from16 v3, v17

    goto :goto_47

    :cond_b6
    move-object/from16 p1, v1

    move-object/from16 v16, v2

    move-object/from16 v17, v3

    move v3, v5

    move v15, v6

    :cond_be
    if-eq v11, v0, :cond_d4

    add-int/lit8 v11, v11, 0x1

    move-object/from16 v1, p1

    move v5, v3

    move v6, v15

    move-object/from16 v2, v16

    move-object/from16 v3, v17

    goto/16 :goto_44

    :cond_cc
    move-object/from16 p1, v1

    move-object/from16 v16, v2

    move-object/from16 v17, v3

    move v3, v5

    move v15, v6

    :cond_d4
    add-int/lit8 v7, v7, 0x1

    move-object/from16 v1, p1

    move v5, v3

    move v6, v15

    move-object/from16 v2, v16

    move-object/from16 v3, v17

    goto/16 :goto_33

    :cond_e0
    move-object/from16 p1, v1

    move-object/from16 v16, v2

    move-object/from16 v17, v3

    move v3, v5

    move v15, v6

    add-int/lit8 v6, v15, 0x1

    move-object/from16 v3, v17

    goto/16 :goto_30

    :cond_ee
    move-object/from16 p1, v1

    move-object/from16 v17, v3

    const/4 v0, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    move v6, v4

    move v3, v4

    move v7, v8

    move v4, v0

    move-object/from16 v0, v17

    invoke-virtual/range {v0 .. v7}, Landroid/graphics/Bitmap;->setPixels([IIIIIII)V

    return-object v0
.end method

.method private final g([ZII)[I
    .registers 14

    mul-int p0, p2, p3

    new-array v0, p0, [I

    const/4 v1, 0x0

    move v2, v1

    :goto_6
    const v3, 0x7fffffff

    if-ge v2, p0, :cond_10

    aput v3, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    :cond_10
    move v2, v1

    :goto_11
    const/4 v4, -0x1

    if-ge v2, p3, :cond_4f

    mul-int v5, v2, p2

    move v6, v1

    :goto_17
    if-ge v6, p2, :cond_4c

    add-int v7, v5, v6

    aget-boolean v8, p1, v7

    if-nez v8, :cond_22

    aput v4, v0, v7

    goto :goto_49

    :cond_22
    if-eqz v6, :cond_47

    add-int/lit8 v8, p2, -0x1

    if-eq v6, v8, :cond_47

    if-eqz v2, :cond_47

    add-int/lit8 v8, p3, -0x1

    if-ne v2, v8, :cond_2f

    goto :goto_47

    :cond_2f
    add-int/lit8 v8, v7, -0x1

    aget-boolean v8, p1, v8

    if-eqz v8, :cond_47

    add-int/lit8 v8, v7, 0x1

    aget-boolean v8, p1, v8

    if-eqz v8, :cond_47

    sub-int v8, v7, p2

    aget-boolean v8, p1, v8

    if-eqz v8, :cond_47

    add-int v8, v7, p2

    aget-boolean v8, p1, v8

    if-nez v8, :cond_49

    :cond_47
    :goto_47
    aput v1, v0, v7

    :cond_49
    :goto_49
    add-int/lit8 v6, v6, 0x1

    goto :goto_17

    :cond_4c
    add-int/lit8 v2, v2, 0x1

    goto :goto_11

    :cond_4f
    move p1, v1

    :goto_50
    if-ge p1, p3, :cond_aa

    mul-int v2, p1, p2

    move v5, v1

    :goto_55
    if-ge v5, p2, :cond_a7

    add-int v6, v2, v5

    aget v7, v0, v6

    if-ltz v7, :cond_a4

    if-nez v7, :cond_60

    goto :goto_a4

    :cond_60
    if-lez v5, :cond_6e

    add-int/lit8 v8, v6, -0x1

    aget v8, v0, v8

    if-ltz v8, :cond_6e

    add-int/lit8 v8, v8, 0x1

    invoke-static {v7, v8}, Ljava/lang/Math;->min(II)I

    move-result v7

    :cond_6e
    if-lez p1, :cond_7c

    sub-int v8, v6, p2

    aget v8, v0, v8

    if-ltz v8, :cond_7c

    add-int/lit8 v8, v8, 0x1

    invoke-static {v7, v8}, Ljava/lang/Math;->min(II)I

    move-result v7

    :cond_7c
    if-lez v5, :cond_8e

    if-lez p1, :cond_8e

    sub-int v8, v6, p2

    add-int/lit8 v8, v8, -0x1

    aget v8, v0, v8

    if-ltz v8, :cond_8e

    add-int/lit8 v8, v8, 0x1

    invoke-static {v7, v8}, Ljava/lang/Math;->min(II)I

    move-result v7

    :cond_8e
    add-int/lit8 v8, p2, -0x1

    if-ge v5, v8, :cond_a2

    if-lez p1, :cond_a2

    sub-int v8, v6, p2

    add-int/lit8 v8, v8, 0x1

    aget v8, v0, v8

    if-ltz v8, :cond_a2

    add-int/lit8 v8, v8, 0x1

    invoke-static {v7, v8}, Ljava/lang/Math;->min(II)I

    move-result v7

    :cond_a2
    aput v7, v0, v6

    :cond_a4
    :goto_a4
    add-int/lit8 v5, v5, 0x1

    goto :goto_55

    :cond_a7
    add-int/lit8 p1, p1, 0x1

    goto :goto_50

    :cond_aa
    add-int/lit8 p3, p3, -0x1

    move p1, p3

    :goto_ad
    if-ge v4, p1, :cond_107

    mul-int v2, p1, p2

    add-int/lit8 v5, p2, -0x1

    move v6, v5

    :goto_b4
    if-ge v4, v6, :cond_104

    add-int v7, v2, v6

    aget v8, v0, v7

    if-ltz v8, :cond_101

    if-nez v8, :cond_bf

    goto :goto_101

    :cond_bf
    if-ge v6, v5, :cond_cd

    add-int/lit8 v9, v7, 0x1

    aget v9, v0, v9

    if-ltz v9, :cond_cd

    add-int/lit8 v9, v9, 0x1

    invoke-static {v8, v9}, Ljava/lang/Math;->min(II)I

    move-result v8

    :cond_cd
    if-ge p1, p3, :cond_db

    add-int v9, v7, p2

    aget v9, v0, v9

    if-ltz v9, :cond_db

    add-int/lit8 v9, v9, 0x1

    invoke-static {v8, v9}, Ljava/lang/Math;->min(II)I

    move-result v8

    :cond_db
    if-ge v6, v5, :cond_ed

    if-ge p1, p3, :cond_ed

    add-int v9, v7, p2

    add-int/lit8 v9, v9, 0x1

    aget v9, v0, v9

    if-ltz v9, :cond_ed

    add-int/lit8 v9, v9, 0x1

    invoke-static {v8, v9}, Ljava/lang/Math;->min(II)I

    move-result v8

    :cond_ed
    if-lez v6, :cond_ff

    if-ge p1, p3, :cond_ff

    add-int v9, v7, p2

    add-int/lit8 v9, v9, -0x1

    aget v9, v0, v9

    if-ltz v9, :cond_ff

    add-int/lit8 v9, v9, 0x1

    invoke-static {v8, v9}, Ljava/lang/Math;->min(II)I

    move-result v8

    :cond_ff
    aput v8, v0, v7

    :cond_101
    :goto_101
    add-int/lit8 v6, v6, -0x1

    goto :goto_b4

    :cond_104
    add-int/lit8 p1, p1, -0x1

    goto :goto_ad

    :cond_107
    move p1, v1

    :goto_108
    if-ge p1, p0, :cond_113

    aget p2, v0, p1

    if-ne p2, v3, :cond_110

    aput v1, v0, p1

    :cond_110
    add-int/lit8 p1, p1, 0x1

    goto :goto_108

    :cond_113
    return-object v0
.end method

.method private static final h(Landroid/content/Context;Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
    .registers 19

    move/from16 v0, p2

    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v8

    mul-int v9, v4, v8

    new-array v2, v9, [I

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v3, 0x0

    move v7, v4

    move-object/from16 v1, p1

    invoke-virtual/range {v1 .. v8}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    sget-object v1, Lj6/a;->a:Lj6/a;

    invoke-direct {v1, v2, v4, v8}, Lj6/a;->c([III)[I

    move-result-object v1

    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v4, v8, v3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v3

    const-string v5, "createBitmap(...)"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-array v5, v9, [I

    move v7, v6

    :goto_2b
    if-ge v7, v8, :cond_6b

    move v9, v6

    :goto_2e
    if-ge v9, v4, :cond_68

    mul-int v10, v7, v4

    add-int/2addr v10, v9

    aget v11, v1, v10

    if-gez v11, :cond_3a

    aput v6, v5, v10

    goto :goto_65

    :cond_3a
    if-gt v11, v0, :cond_61

    int-to-float v11, v11

    int-to-float v12, v0

    div-float/2addr v11, v12

    aget v12, v2, v10

    invoke-static {v12}, Landroid/graphics/Color;->red(I)I

    move-result v13

    invoke-static {v12}, Landroid/graphics/Color;->green(I)I

    move-result v14

    invoke-static {v12}, Landroid/graphics/Color;->blue(I)I

    move-result v15

    invoke-static {v12}, Landroid/graphics/Color;->alpha(I)I

    move-result v12

    int-to-float v12, v12

    mul-float/2addr v12, v11

    float-to-int v11, v12

    const/16 v12, 0xff

    invoke-static {v11, v6, v12}, LB8/h;->m(III)I

    move-result v11

    invoke-static {v11, v13, v14, v15}, Landroid/graphics/Color;->argb(IIII)I

    move-result v11

    aput v11, v5, v10

    goto :goto_65

    :cond_61
    aget v11, v2, v10

    aput v11, v5, v10

    :goto_65
    add-int/lit8 v9, v9, 0x1

    goto :goto_2e

    :cond_68
    add-int/lit8 v7, v7, 0x1

    goto :goto_2b

    :cond_6b
    const/4 v1, 0x0

    const/4 v6, 0x0

    move-object v2, v5

    move v5, v1

    move-object v1, v3

    const/4 v3, 0x0

    move v7, v4

    invoke-virtual/range {v1 .. v8}, Landroid/graphics/Bitmap;->setPixels([IIIIIII)V

    sget-object v2, Lj6/a;->a:Lj6/a;

    invoke-direct {v2, v1}, Lj6/a;->j(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v3

    int-to-float v0, v0

    const/high16 v4, 0x3f000000    # 0.5f

    mul-float/2addr v0, v4

    move-object/from16 v4, p0

    invoke-direct {v2, v4, v3, v0}, Lj6/a;->b(Landroid/content/Context;Landroid/graphics/Bitmap;F)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-direct {v2, v1, v0}, Lj6/a;->a(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method private final i(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
    .registers 20

    move/from16 v0, p2

    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    mul-int v9, v3, v7

    new-array v2, v9, [I

    const/4 v5, 0x0

    const/4 v6, 0x0

    move v4, v3

    const/4 v3, 0x0

    move v8, v7

    move v7, v4

    move-object/from16 v1, p1

    invoke-virtual/range {v1 .. v8}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v4, v8, v1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v1

    const-string v3, "createBitmap(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-array v3, v9, [I

    move v6, v5

    :goto_27
    if-ge v6, v8, :cond_78

    move v7, v5

    :goto_2a
    if-ge v7, v4, :cond_75

    mul-int v9, v6, v4

    add-int/2addr v9, v7

    aget v10, v2, v9

    invoke-static {v10}, Landroid/graphics/Color;->alpha(I)I

    move-result v10

    if-nez v10, :cond_3a

    aput v5, v3, v9

    goto :goto_72

    :cond_3a
    neg-int v10, v0

    move v11, v5

    if-gt v10, v0, :cond_69

    move v12, v10

    :goto_3f
    if-gt v10, v0, :cond_62

    move v13, v10

    :goto_42
    add-int v14, v7, v13

    add-int v15, v6, v12

    const/16 v16, 0x1

    if-ltz v14, :cond_5a

    if-ge v14, v4, :cond_5a

    if-ltz v15, :cond_5a

    if-ge v15, v8, :cond_5a

    mul-int/2addr v15, v4

    add-int/2addr v15, v14

    aget v14, v2, v15

    invoke-static {v14}, Landroid/graphics/Color;->alpha(I)I

    move-result v14

    if-nez v14, :cond_5d

    :cond_5a
    move/from16 v11, v16

    goto :goto_62

    :cond_5d
    if-eq v13, v0, :cond_62

    add-int/lit8 v13, v13, 0x1

    goto :goto_42

    :cond_62
    :goto_62
    if-nez v11, :cond_69

    if-eq v12, v0, :cond_69

    add-int/lit8 v12, v12, 0x1

    goto :goto_3f

    :cond_69
    if-eqz v11, :cond_6e

    aput v5, v3, v9

    goto :goto_72

    :cond_6e
    aget v10, v2, v9

    aput v10, v3, v9

    :goto_72
    add-int/lit8 v7, v7, 0x1

    goto :goto_2a

    :cond_75
    add-int/lit8 v6, v6, 0x1

    goto :goto_27

    :cond_78
    const/4 v0, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    move v6, v4

    move v7, v4

    move v4, v0

    move-object v0, v1

    move-object v1, v3

    move v3, v7

    move v7, v8

    invoke-virtual/range {v0 .. v7}, Landroid/graphics/Bitmap;->setPixels([IIIIIII)V

    return-object v0
.end method

.method private final j(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .registers 10

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    mul-int p0, v3, v7

    new-array v1, p0, [I

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    move v6, v3

    move-object v0, p1

    invoke-virtual/range {v0 .. v7}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    sget-object p1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v3, v7, p1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    const-string p1, "createBitmap(...)"

    invoke-static {v0, p1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    move-object p1, v1

    new-array v1, p0, [I

    :goto_22
    if-ge v2, p0, :cond_33

    aget v4, p1, v2

    invoke-static {v4}, Landroid/graphics/Color;->alpha(I)I

    move-result v4

    invoke-static {v4, v4, v4, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v4

    aput v4, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_22

    :cond_33
    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    move v6, v3

    invoke-virtual/range {v0 .. v7}, Landroid/graphics/Bitmap;->setPixels([IIIIIII)V

    return-object v0
.end method

.method private final k([I[ZIIII)Lj6/a$b;
    .registers 16

    new-instance p0, Lj6/a$b;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {p0, v0}, Lj6/a$b;-><init>(Ljava/util/List;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Lh8/o;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-direct {v1, p3, p4}, Lh8/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1f
    :goto_1f
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result p3

    if-nez p3, :cond_a8

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p3

    const/4 p4, 0x1

    sub-int/2addr p3, p4

    invoke-interface {v0, p3}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lh8/o;

    invoke-virtual {p3}, Lh8/o;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-virtual {p3}, Lh8/o;->b()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    mul-int v2, p3, p5

    add-int/2addr v2, v1

    if-ltz v1, :cond_1f

    if-ge v1, p5, :cond_1f

    if-ltz p3, :cond_1f

    if-ge p3, p6, :cond_1f

    aget-boolean v3, p2, v2

    if-eqz v3, :cond_55

    goto :goto_1f

    :cond_55
    aget v3, p1, v2

    invoke-static {v3}, Landroid/graphics/Color;->alpha(I)I

    move-result v3

    if-nez v3, :cond_5e

    goto :goto_1f

    :cond_5e
    aput-boolean p4, p2, v2

    invoke-virtual {p0}, Lj6/a$b;->a()Ljava/util/List;

    move-result-object p4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {p4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 p4, -0x1

    move v2, p4

    :goto_6d
    const/4 v3, 0x2

    if-ge v2, v3, :cond_1f

    move v4, p4

    :goto_71
    if-ge v4, v3, :cond_a5

    if-nez v4, :cond_77

    if-eqz v2, :cond_a2

    :cond_77
    add-int v5, v1, v4

    add-int v6, p3, v2

    if-ltz v5, :cond_a2

    if-ge v5, p5, :cond_a2

    if-ltz v6, :cond_a2

    if-ge v6, p6, :cond_a2

    mul-int v7, v6, p5

    add-int/2addr v7, v5

    aget-boolean v8, p2, v7

    if-nez v8, :cond_a2

    aget v7, p1, v7

    invoke-static {v7}, Landroid/graphics/Color;->alpha(I)I

    move-result v7

    if-lez v7, :cond_a2

    new-instance v7, Lh8/o;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-direct {v7, v5, v6}, Lh8/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_a2
    add-int/lit8 v4, v4, 0x1

    goto :goto_71

    :cond_a5
    add-int/lit8 v2, v2, 0x1

    goto :goto_6d

    :cond_a8
    return-object p0
.end method

.method private static final l(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
    .registers 3

    rem-int/lit8 v0, p1, 0x2

    if-nez v0, :cond_6

    add-int/lit8 p1, p1, 0x1

    :cond_6
    div-int/lit8 p1, p1, 0x2

    sget-object v0, Lj6/a;->a:Lj6/a;

    invoke-direct {v0, p0, p1}, Lj6/a;->i(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    move-result-object p0

    invoke-direct {v0, p0, p1}, Lj6/a;->f(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    move-result-object p0

    invoke-direct {v0, p0, p1}, Lj6/a;->f(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    move-result-object p0

    invoke-direct {v0, p0, p1}, Lj6/a;->i(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method private final m(IIIIIIIII)F
    .registers 10

    sub-int/2addr p1, p4

    int-to-float p0, p1

    sub-int/2addr p2, p5

    int-to-float p1, p2

    sub-int/2addr p3, p6

    int-to-float p2, p3

    mul-float/2addr p0, p0

    int-to-float p3, p7

    const/high16 p4, 0x40000000    # 2.0f

    mul-float/2addr p3, p4

    div-float/2addr p0, p3

    mul-float/2addr p1, p1

    int-to-float p3, p8

    div-float/2addr p1, p3

    add-float/2addr p0, p1

    mul-float/2addr p2, p2

    int-to-float p1, p9

    div-float/2addr p2, p1

    add-float/2addr p0, p2

    return p0
.end method

.method public static final n(Landroid/content/Context;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Ljava/nio/FloatBuffer;Lj6/a$c;)Landroid/graphics/Bitmap;
    .registers 8

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extractedBitmap"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    const-string v1, "BitmapEdgeRefineUtil"

    if-eqz v0, :cond_1d

    const-string p0, "refineExtractedImage, bitmap is recycled!"

    invoke-static {v1, p0}, Lcom/nothing/wallpaper/common/log/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    return-object p2

    :cond_1d
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    const/4 v2, 0x0

    invoke-virtual {p2, v0, v2}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    move-result-object v0

    :try_start_24
    invoke-virtual {p4}, Lj6/a$c;->j()Z

    move-result v2

    if-eqz v2, :cond_4c

    sget-object v2, Lj6/a;->a:Lj6/a;

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-direct {v2, p1, v0, p3, p4}, Lj6/a;->d(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Ljava/nio/FloatBuffer;Lj6/a$c;)Landroid/graphics/Bitmap;

    move-result-object p1
    :try_end_33
    .catch Ljava/lang/Exception; {:try_start_24 .. :try_end_33} :catch_49

    :try_start_33
    invoke-static {v0, p2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_47

    invoke-static {v0, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_47

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_42
    .catch Ljava/lang/Exception; {:try_start_33 .. :try_end_42} :catch_43

    goto :goto_47

    :catch_43
    move-exception p0

    move-object v0, p1

    goto/16 :goto_bd

    :cond_47
    :goto_47
    move-object v0, p1

    goto :goto_4c

    :catch_49
    move-exception p0

    goto/16 :goto_bd

    :cond_4c
    :goto_4c
    :try_start_4c
    invoke-virtual {p4}, Lj6/a$c;->i()Z

    move-result p1

    if-eqz p1, :cond_6d

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {p4}, Lj6/a$c;->t()F

    move-result p1

    invoke-static {v0, p1}, Lj6/a;->q(Landroid/graphics/Bitmap;F)Landroid/graphics/Bitmap;

    move-result-object p1
    :try_end_5d
    .catch Ljava/lang/Exception; {:try_start_4c .. :try_end_5d} :catch_49

    :try_start_5d
    invoke-static {v0, p2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_6c

    invoke-static {v0, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_6c

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_6c
    .catch Ljava/lang/Exception; {:try_start_5d .. :try_end_6c} :catch_43

    :cond_6c
    move-object v0, p1

    :cond_6d
    :try_start_6d
    invoke-virtual {p4}, Lj6/a$c;->m()Z

    move-result p1

    if-eqz p1, :cond_8e

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {p4}, Lj6/a$c;->u()I

    move-result p1

    invoke-static {v0, p1}, Lj6/a;->l(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    move-result-object p1
    :try_end_7e
    .catch Ljava/lang/Exception; {:try_start_6d .. :try_end_7e} :catch_49

    :try_start_7e
    invoke-static {v0, p2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_8d

    invoke-static {v0, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_8d

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_8d
    .catch Ljava/lang/Exception; {:try_start_7e .. :try_end_8d} :catch_43

    :cond_8d
    move-object v0, p1

    :cond_8e
    :try_start_8e
    invoke-virtual {p4}, Lj6/a$c;->k()Z

    move-result p1

    if-eqz p1, :cond_b4

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {p4}, Lj6/a$c;->e()I

    move-result p1

    invoke-static {p0, v0, p1}, Lj6/a;->h(Landroid/content/Context;Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    move-result-object p0
    :try_end_9f
    .catch Ljava/lang/Exception; {:try_start_8e .. :try_end_9f} :catch_49

    :try_start_9f
    invoke-static {v0, p2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b3

    invoke-static {v0, p0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b3

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_ae
    .catch Ljava/lang/Exception; {:try_start_9f .. :try_end_ae} :catch_af

    goto :goto_b3

    :catch_af
    move-exception p1

    move-object v0, p0

    move-object p0, p1

    goto :goto_bd

    :cond_b3
    :goto_b3
    move-object v0, p0

    :cond_b4
    :try_start_b4
    const-string p0, "\u56fe\u7247\u4f18\u5316\u5b8c\u6210"

    invoke-static {v1, p0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_b9
    .catch Ljava/lang/Exception; {:try_start_b4 .. :try_end_b9} :catch_49

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    return-object v0

    :goto_bd
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "refineExtractedImage error: "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1, p0}, Lcom/nothing/wallpaper/common/log/c;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {v0, p2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_de

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    :cond_de
    return-object p2
.end method

.method private final o([ILjava/nio/FloatBuffer;[ZIIIIIIFIF)[Z
    .registers 45

    move-object/from16 v0, p0

    move-object/from16 v10, p3

    move/from16 v1, p4

    move/from16 v2, p5

    move/from16 v3, p11

    mul-int v11, v1, v2

    invoke-static/range {p4 .. p5}, Ljava/lang/Math;->min(II)I

    move-result v4

    div-int/lit8 v4, v4, 0x2

    const/16 v5, 0x200

    const/4 v6, 0x1

    invoke-static {v4, v6, v5}, LB8/h;->m(III)I

    move-result v4

    move/from16 v5, p9

    invoke-static {v5, v6, v4}, LB8/h;->m(III)I

    move-result v12

    const/16 v4, 0x1e

    move/from16 v5, p7

    invoke-static {v5, v6, v4}, LB8/h;->m(III)I

    move-result v5

    move/from16 v7, p8

    invoke-static {v7, v6, v4}, LB8/h;->m(III)I

    move-result v4

    invoke-direct {v0, v10, v1, v2}, Lj6/a;->g([ZII)[I

    move-result-object v13

    invoke-direct {v0, v10, v1, v2, v5}, Lj6/a;->e([ZIII)[Z

    move-result-object v1

    new-instance v14, Lj6/a$a;

    const/16 v28, 0x7f

    const/16 v29, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const-wide/16 v18, 0x0

    const-wide/16 v20, 0x0

    const-wide/16 v22, 0x0

    const-wide/16 v24, 0x0

    const-wide/16 v26, 0x0

    invoke-direct/range {v14 .. v29}, Lj6/a$a;-><init>(IJJJJJJILkotlin/jvm/internal/h;)V

    new-instance v15, Lj6/a$a;

    const/16 v29, 0x7f

    const/16 v30, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0x0

    const-wide/16 v25, 0x0

    const-wide/16 v27, 0x0

    invoke-direct/range {v15 .. v30}, Lj6/a$a;-><init>(IJJJJJJILkotlin/jvm/internal/h;)V

    move/from16 v2, v16

    move v5, v2

    move v6, v5

    :goto_66
    if-ge v2, v11, :cond_d7

    if-ge v5, v3, :cond_9b

    aget-boolean v7, v1, v2

    if-eqz v7, :cond_9b

    aget-boolean v7, v10, v2

    if-nez v7, :cond_9b

    aget v7, p1, v2

    invoke-direct {v0, v7}, Lj6/a;->r(I)Lh8/u;

    move-result-object v7

    invoke-virtual {v7}, Lh8/u;->a()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    invoke-virtual {v7}, Lh8/u;->b()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Number;

    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    move-result v9

    invoke-virtual {v7}, Lh8/u;->c()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    invoke-virtual {v14, v8, v9, v7}, Lj6/a$a;->a(III)V

    add-int/lit8 v5, v5, 0x1

    :cond_9b
    if-ge v6, v3, :cond_d0

    aget-boolean v7, v10, v2

    if-eqz v7, :cond_d0

    aget v7, v13, v2

    if-ltz v7, :cond_d0

    if-gt v7, v4, :cond_d0

    aget v7, p1, v2

    invoke-direct {v0, v7}, Lj6/a;->r(I)Lh8/u;

    move-result-object v7

    invoke-virtual {v7}, Lh8/u;->a()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    invoke-virtual {v7}, Lh8/u;->b()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Number;

    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    move-result v9

    invoke-virtual {v7}, Lh8/u;->c()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    invoke-virtual {v15, v8, v9, v7}, Lj6/a$a;->a(III)V

    add-int/lit8 v6, v6, 0x1

    :cond_d0
    if-lt v5, v3, :cond_d4

    if-ge v6, v3, :cond_d7

    :cond_d4
    add-int/lit8 v2, v2, 0x1

    goto :goto_66

    :cond_d7
    invoke-virtual {v14}, Lj6/a$a;->b()I

    move-result v1

    const/16 v2, 0xc8

    if-lt v1, v2, :cond_266

    invoke-virtual {v15}, Lj6/a$a;->b()I

    move-result v1

    if-ge v1, v2, :cond_e7

    goto/16 :goto_266

    :cond_e7
    invoke-virtual {v14}, Lj6/a$a;->g()J

    move-result-wide v1

    invoke-virtual {v14}, Lj6/a$a;->b()I

    move-result v3

    int-to-long v3, v3

    div-long/2addr v1, v3

    long-to-int v4, v1

    invoke-virtual {v14}, Lj6/a$a;->c()J

    move-result-wide v1

    invoke-virtual {v14}, Lj6/a$a;->b()I

    move-result v3

    int-to-long v5, v3

    div-long/2addr v1, v5

    long-to-int v5, v1

    invoke-virtual {v14}, Lj6/a$a;->e()J

    move-result-wide v1

    invoke-virtual {v14}, Lj6/a$a;->b()I

    move-result v3

    int-to-long v6, v3

    div-long/2addr v1, v6

    long-to-int v6, v1

    invoke-virtual {v15}, Lj6/a$a;->g()J

    move-result-wide v1

    invoke-virtual {v15}, Lj6/a$a;->b()I

    move-result v3

    int-to-long v7, v3

    div-long/2addr v1, v7

    long-to-int v1, v1

    invoke-virtual {v15}, Lj6/a$a;->c()J

    move-result-wide v2

    invoke-virtual {v15}, Lj6/a$a;->b()I

    move-result v7

    int-to-long v7, v7

    div-long/2addr v2, v7

    long-to-int v2, v2

    invoke-virtual {v15}, Lj6/a$a;->e()J

    move-result-wide v7

    invoke-virtual {v15}, Lj6/a$a;->b()I

    move-result v3

    move v9, v1

    move/from16 v17, v2

    int-to-long v1, v3

    div-long/2addr v7, v1

    long-to-int v1, v7

    invoke-virtual {v14}, Lj6/a$a;->g()J

    move-result-wide v2

    invoke-virtual {v14}, Lj6/a$a;->h()J

    move-result-wide v7

    move/from16 v18, v1

    invoke-virtual {v14}, Lj6/a$a;->b()I

    move-result v1

    invoke-static {v2, v3, v7, v8, v1}, Lj6/a;->p(JJI)I

    move-result v7

    invoke-virtual {v14}, Lj6/a$a;->c()J

    move-result-wide v1

    move v8, v4

    invoke-virtual {v14}, Lj6/a$a;->d()J

    move-result-wide v3

    move/from16 v19, v5

    invoke-virtual {v14}, Lj6/a$a;->b()I

    move-result v5

    invoke-static {v1, v2, v3, v4, v5}, Lj6/a;->p(JJI)I

    move-result v1

    invoke-virtual {v14}, Lj6/a$a;->e()J

    move-result-wide v2

    invoke-virtual {v14}, Lj6/a$a;->f()J

    move-result-wide v4

    invoke-virtual {v14}, Lj6/a$a;->b()I

    move-result v14

    invoke-static {v2, v3, v4, v5, v14}, Lj6/a;->p(JJI)I

    move-result v2

    invoke-virtual {v15}, Lj6/a$a;->g()J

    move-result-wide v3

    move/from16 p4, v1

    move/from16 p5, v2

    invoke-virtual {v15}, Lj6/a$a;->h()J

    move-result-wide v1

    invoke-virtual {v15}, Lj6/a$a;->b()I

    move-result v5

    invoke-static {v3, v4, v1, v2, v5}, Lj6/a;->p(JJI)I

    move-result v14

    invoke-virtual {v15}, Lj6/a$a;->c()J

    move-result-wide v1

    invoke-virtual {v15}, Lj6/a$a;->d()J

    move-result-wide v3

    invoke-virtual {v15}, Lj6/a$a;->b()I

    move-result v5

    invoke-static {v1, v2, v3, v4, v5}, Lj6/a;->p(JJI)I

    move-result v20

    invoke-virtual {v15}, Lj6/a$a;->e()J

    move-result-wide v1

    invoke-virtual {v15}, Lj6/a$a;->f()J

    move-result-wide v3

    invoke-virtual {v15}, Lj6/a$a;->b()I

    move-result v5

    invoke-static {v1, v2, v3, v4, v5}, Lj6/a;->p(JJI)I

    move-result v15

    invoke-virtual {v10}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v21, v1

    check-cast v21, [Z

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    move/from16 v3, p10

    invoke-static {v3, v1, v2}, LB8/h;->l(FFF)F

    move-result v22

    move/from16 v1, v16

    :goto_1a8
    if-ge v1, v11, :cond_265

    if-eqz p2, :cond_1b7

    invoke-virtual/range {p2 .. p2}, Ljava/nio/FloatBuffer;->get()F

    move-result v3

    :goto_1b0
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    move-object/from16 v23, v3

    goto :goto_1ba

    :cond_1b7
    const/high16 v3, -0x40800000    # -1.0f

    goto :goto_1b0

    :goto_1ba
    aget-boolean v3, v10, v1

    if-eqz v3, :cond_237

    aget v3, v13, v1

    if-ltz v3, :cond_237

    if-gt v3, v12, :cond_237

    aget v3, p1, v1

    ushr-int/lit8 v4, v3, 0x18

    move/from16 v5, p6

    if-le v4, v5, :cond_237

    invoke-direct {v0, v3}, Lj6/a;->r(I)Lh8/u;

    move-result-object v3

    invoke-virtual {v3}, Lh8/u;->a()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-virtual {v3}, Lh8/u;->b()Ljava/lang/Object;

    move-result-object v24

    check-cast v24, Ljava/lang/Number;

    invoke-virtual/range {v24 .. v24}, Ljava/lang/Number;->intValue()I

    move-result v24

    invoke-virtual {v3}, Lh8/u;->c()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    move/from16 v5, v24

    move/from16 v24, v2

    move v2, v5

    move/from16 v25, v1

    move v1, v4

    move v4, v8

    move/from16 v5, v19

    move/from16 v8, p4

    move/from16 v19, v18

    move/from16 v18, v17

    move/from16 v17, v9

    move/from16 v9, p5

    invoke-direct/range {v0 .. v9}, Lj6/a;->m(IIIIIIIII)F

    move-result v26

    move/from16 v31, v14

    move v14, v4

    move/from16 v4, v17

    move/from16 v17, v7

    move/from16 v7, v31

    move/from16 v31, v19

    move/from16 v19, v5

    move/from16 v5, v18

    move/from16 v18, v8

    move/from16 v8, v20

    move/from16 v20, v9

    move v9, v15

    move v15, v6

    move/from16 v6, v31

    invoke-direct/range {v0 .. v9}, Lj6/a;->m(IIIIIIIII)F

    move-result v1

    add-float v2, v22, v24

    mul-float v26, v26, v2

    cmpg-float v0, v26, v1

    if-gez v0, :cond_24c

    invoke-virtual/range {v23 .. v23}, Ljava/lang/Float;->floatValue()F

    move-result v0

    cmpg-float v0, v0, p12

    if-gez v0, :cond_24c

    aput-boolean v16, v21, v25

    goto :goto_24c

    :cond_237
    move/from16 v25, v1

    move/from16 v24, v2

    move v4, v9

    move v9, v15

    move/from16 v5, v17

    move v15, v6

    move/from16 v17, v7

    move v7, v14

    move/from16 v6, v18

    move/from16 v18, p4

    move v14, v8

    move/from16 v8, v20

    move/from16 v20, p5

    :cond_24c
    :goto_24c
    add-int/lit8 v1, v25, 0x1

    move-object/from16 v0, p0

    move/from16 p4, v18

    move/from16 p5, v20

    move/from16 v2, v24

    move/from16 v18, v6

    move/from16 v20, v8

    move v8, v14

    move v6, v15

    move v14, v7

    move v15, v9

    move/from16 v7, v17

    move v9, v4

    move/from16 v17, v5

    goto/16 :goto_1a8

    :cond_265
    return-object v21

    :cond_266
    :goto_266
    return-object v10
.end method

.method private static final p(JJI)I
    .registers 7

    long-to-double p0, p0

    int-to-double v0, p4

    div-double/2addr p0, v0

    long-to-double p2, p2

    div-double/2addr p2, v0

    mul-double/2addr p0, p0

    sub-double/2addr p2, p0

    const-wide/high16 p0, 0x4030000000000000L    # 16.0

    invoke-static {p2, p3, p0, p1}, LB8/h;->d(DD)D

    move-result-wide p0

    double-to-int p0, p0

    return p0
.end method

.method private static final q(Landroid/graphics/Bitmap;F)Landroid/graphics/Bitmap;
    .registers 14

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    mul-int v8, v3, v7

    int-to-float v0, v8

    mul-float/2addr v0, p1

    float-to-int p1, v0

    new-array v1, v8, [I

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    move v6, v3

    move-object v0, p0

    invoke-virtual/range {v0 .. v7}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    new-array v2, v8, [Z

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    const/4 v10, 0x0

    move v4, v10

    :goto_20
    if-ge v4, v7, :cond_5a

    move v5, v3

    move v3, v10

    :goto_24
    if-ge v3, v5, :cond_56

    mul-int v0, v4, v5

    add-int/2addr v0, v3

    aget-boolean v6, v2, v0

    if-nez v6, :cond_4e

    aget v0, v1, v0

    invoke-static {v0}, Landroid/graphics/Color;->alpha(I)I

    move-result v0

    if-lez v0, :cond_4e

    sget-object v0, Lj6/a;->a:Lj6/a;

    move v6, v7

    invoke-direct/range {v0 .. v6}, Lj6/a;->k([I[ZIIII)Lj6/a$b;

    move-result-object v0

    move v7, v5

    move v5, v3

    move v3, v7

    move v7, v6

    invoke-virtual {v0}, Lj6/a$b;->a()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-lt v6, p1, :cond_51

    invoke-interface {v9, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_51

    :cond_4e
    move v11, v5

    move v5, v3

    move v3, v11

    :cond_51
    :goto_51
    add-int/lit8 v0, v5, 0x1

    move v5, v3

    move v3, v0

    goto :goto_24

    :cond_56
    move v3, v5

    add-int/lit8 v4, v4, 0x1

    goto :goto_20

    :cond_5a
    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    move-result p1

    const-string v0, "BitmapEdgeRefineUtil"

    if-eqz p1, :cond_68

    const-string p1, "\u672a\u627e\u5230\u4efb\u4f55\u8fde\u901a\u57df"

    invoke-static {v0, p1}, Lcom/nothing/wallpaper/common/log/c;->o(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0

    :cond_68
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_74

    const/4 p1, 0x0

    goto :goto_a5

    :cond_74
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_80

    :goto_7e
    move-object p1, v2

    goto :goto_a5

    :cond_80
    move-object v4, v2

    check-cast v4, Lj6/a$b;

    invoke-virtual {v4}, Lj6/a$b;->a()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    :cond_8b
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lj6/a$b;

    invoke-virtual {v6}, Lj6/a$b;->a()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-ge v4, v6, :cond_9e

    move-object v2, v5

    move v4, v6

    :cond_9e
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_8b

    goto :goto_7e

    :goto_a5
    check-cast p1, Lj6/a$b;

    if-nez p1, :cond_aa

    return-object p0

    :cond_aa
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result p0

    invoke-virtual {p1}, Lj6/a$b;->a()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "\u627e\u5230 "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " \u4e2a\u8fde\u901a\u57df\uff0c\u6700\u5927\u8fde\u901a\u57df\u9762\u79ef: "

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v3, v7, p0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    const-string p0, "createBitmap(...)"

    invoke-static {v0, p0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v5, v1

    new-array v1, v8, [I

    move p0, v10

    :goto_e1
    if-ge p0, v8, :cond_e8

    aput v10, v1, p0

    add-int/lit8 p0, p0, 0x1

    goto :goto_e1

    :cond_e8
    invoke-virtual {p1}, Lj6/a$b;->a()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_f0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_105

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    aget v2, v5, p1

    aput v2, v1, p1

    goto :goto_f0

    :cond_105
    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    move v6, v3

    invoke-virtual/range {v0 .. v7}, Landroid/graphics/Bitmap;->setPixels([IIIIIII)V

    return-object v0
.end method

.method private final r(I)Lh8/u;
    .registers 8

    shr-int/lit8 p0, p1, 0x10

    const/16 v0, 0xff

    and-int/2addr p0, v0

    shr-int/lit8 v1, p1, 0x8

    and-int/2addr v1, v0

    and-int/2addr p1, v0

    int-to-float p0, p0

    const v2, 0x3e991687    # 0.299f

    mul-float/2addr v2, p0

    int-to-float v1, v1

    const v3, 0x3f1645a2    # 0.587f

    mul-float/2addr v3, v1

    add-float/2addr v2, v3

    int-to-float p1, p1

    const v3, 0x3de978d5    # 0.114f

    mul-float/2addr v3, p1

    add-float/2addr v2, v3

    float-to-int v2, v2

    const v3, -0x41d2f1aa    # -0.169f

    mul-float/2addr v3, p0

    const v4, 0x3ea978d5    # 0.331f

    mul-float/2addr v4, v1

    sub-float/2addr v3, v4

    const/high16 v4, 0x3f000000    # 0.5f

    mul-float v5, p1, v4

    add-float/2addr v3, v5

    const/high16 v5, 0x43000000    # 128.0f

    add-float/2addr v3, v5

    float-to-int v3, v3

    mul-float/2addr p0, v4

    const v4, 0x3ed6872b    # 0.419f

    mul-float/2addr v1, v4

    sub-float/2addr p0, v1

    const v1, 0x3da5e354    # 0.081f

    mul-float/2addr p1, v1

    sub-float/2addr p0, p1

    add-float/2addr p0, v5

    float-to-int p0, p0

    new-instance p1, Lh8/u;

    const/4 v1, 0x0

    invoke-static {v2, v1, v0}, LB8/h;->m(III)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v3, v1, v0}, LB8/h;->m(III)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {p0, v1, v0}, LB8/h;->m(III)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-direct {p1, v2, v3, p0}, Lh8/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method
