.class public final Le9/r$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le9/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .registers 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/h;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Le9/r$a;-><init>()V

    return-void
.end method

.method private final a(JLe9/e;ILjava/util/List;IILjava/util/List;)V
    .registers 28

    move-object/from16 v0, p0

    move-object/from16 v9, p3

    move/from16 v10, p4

    move-object/from16 v5, p5

    move/from16 v1, p6

    move/from16 v11, p7

    move-object/from16 v8, p8

    const-string v2, "Failed requirement."

    if-ge v1, v11, :cond_1a3

    move v3, v1

    :goto_13
    if-ge v3, v11, :cond_2a

    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Le9/h;

    invoke-virtual {v4}, Le9/h;->v()I

    move-result v4

    if-lt v4, v10, :cond_24

    add-int/lit8 v3, v3, 0x1

    goto :goto_13

    :cond_24
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2a
    invoke-interface/range {p5 .. p6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le9/h;

    add-int/lit8 v3, v11, -0x1

    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Le9/h;

    invoke-virtual {v2}, Le9/h;->v()I

    move-result v4

    if-ne v10, v4, :cond_54

    invoke-interface {v8, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    add-int/lit8 v1, v1, 0x1

    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Le9/h;

    move v6, v1

    move v1, v2

    move-object v2, v4

    goto :goto_56

    :cond_54
    move v6, v1

    const/4 v1, -0x1

    :goto_56
    invoke-virtual {v2, v10}, Le9/h;->h(I)B

    move-result v4

    invoke-virtual {v3, v10}, Le9/h;->h(I)B

    move-result v7

    const/4 v13, 0x2

    if-eq v4, v7, :cond_11b

    add-int/lit8 v2, v6, 0x1

    const/4 v3, 0x1

    :goto_64
    if-ge v2, v11, :cond_83

    add-int/lit8 v4, v2, -0x1

    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Le9/h;

    invoke-virtual {v4, v10}, Le9/h;->h(I)B

    move-result v4

    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Le9/h;

    invoke-virtual {v7, v10}, Le9/h;->h(I)B

    move-result v7

    if-eq v4, v7, :cond_80

    add-int/lit8 v3, v3, 0x1

    :cond_80
    add-int/lit8 v2, v2, 0x1

    goto :goto_64

    :cond_83
    invoke-direct {v0, v9}, Le9/r$a;->c(Le9/e;)J

    move-result-wide v14

    add-long v14, p1, v14

    const/16 v16, -0x1

    int-to-long v12, v13

    add-long/2addr v14, v12

    mul-int/lit8 v2, v3, 0x2

    int-to-long v12, v2

    add-long/2addr v14, v12

    invoke-virtual {v9, v3}, Le9/e;->p1(I)Le9/e;

    invoke-virtual {v9, v1}, Le9/e;->p1(I)Le9/e;

    move v1, v6

    :goto_98
    if-ge v1, v11, :cond_bc

    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le9/h;

    invoke-virtual {v2, v10}, Le9/h;->h(I)B

    move-result v2

    if-eq v1, v6, :cond_b4

    add-int/lit8 v3, v1, -0x1

    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Le9/h;

    invoke-virtual {v3, v10}, Le9/h;->h(I)B

    move-result v3

    if-eq v2, v3, :cond_b9

    :cond_b4
    and-int/lit16 v2, v2, 0xff

    invoke-virtual {v9, v2}, Le9/e;->p1(I)Le9/e;

    :cond_b9
    add-int/lit8 v1, v1, 0x1

    goto :goto_98

    :cond_bc
    new-instance v3, Le9/e;

    invoke-direct {v3}, Le9/e;-><init>()V

    :goto_c1
    if-ge v6, v11, :cond_117

    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le9/h;

    invoke-virtual {v1, v10}, Le9/h;->h(I)B

    move-result v1

    add-int/lit8 v2, v6, 0x1

    move v4, v2

    :goto_d0
    if-ge v4, v11, :cond_e3

    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Le9/h;

    invoke-virtual {v7, v10}, Le9/h;->h(I)B

    move-result v7

    if-eq v1, v7, :cond_e0

    move v7, v4

    goto :goto_e4

    :cond_e0
    add-int/lit8 v4, v4, 0x1

    goto :goto_d0

    :cond_e3
    move v7, v11

    :goto_e4
    if-ne v2, v7, :cond_103

    add-int/lit8 v1, v10, 0x1

    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le9/h;

    invoke-virtual {v2}, Le9/h;->v()I

    move-result v2

    if-ne v1, v2, :cond_103

    invoke-interface {v8, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-virtual {v9, v1}, Le9/e;->p1(I)Le9/e;

    move-wide v1, v14

    goto :goto_114

    :cond_103
    invoke-direct {v0, v3}, Le9/r$a;->c(Le9/e;)J

    move-result-wide v1

    add-long/2addr v1, v14

    long-to-int v1, v1

    mul-int/lit8 v1, v1, -0x1

    invoke-virtual {v9, v1}, Le9/e;->p1(I)Le9/e;

    add-int/lit8 v4, v10, 0x1

    move-wide v1, v14

    invoke-direct/range {v0 .. v8}, Le9/r$a;->a(JLe9/e;ILjava/util/List;IILjava/util/List;)V

    :goto_114
    move-wide v14, v1

    move v6, v7

    goto :goto_c1

    :cond_117
    invoke-virtual {v9, v3}, Le9/e;->l1(Le9/B;)J

    return-void

    :cond_11b
    const/16 v16, -0x1

    invoke-virtual {v2}, Le9/h;->v()I

    move-result v4

    invoke-virtual {v3}, Le9/h;->v()I

    move-result v7

    invoke-static {v4, v7}, Ljava/lang/Math;->min(II)I

    move-result v4

    const/4 v7, 0x0

    move v12, v10

    :goto_12b
    if-ge v12, v4, :cond_13c

    invoke-virtual {v2, v12}, Le9/h;->h(I)B

    move-result v14

    invoke-virtual {v3, v12}, Le9/h;->h(I)B

    move-result v15

    if-ne v14, v15, :cond_13c

    add-int/lit8 v7, v7, 0x1

    add-int/lit8 v12, v12, 0x1

    goto :goto_12b

    :cond_13c
    invoke-direct {v0, v9}, Le9/r$a;->c(Le9/e;)J

    move-result-wide v3

    add-long v3, p1, v3

    int-to-long v12, v13

    add-long/2addr v3, v12

    int-to-long v12, v7

    add-long/2addr v3, v12

    const-wide/16 v12, 0x1

    add-long/2addr v3, v12

    neg-int v12, v7

    invoke-virtual {v9, v12}, Le9/e;->p1(I)Le9/e;

    invoke-virtual {v9, v1}, Le9/e;->p1(I)Le9/e;

    add-int v1, v10, v7

    :goto_152
    if-ge v10, v1, :cond_160

    invoke-virtual {v2, v10}, Le9/h;->h(I)B

    move-result v7

    and-int/lit16 v7, v7, 0xff

    invoke-virtual {v9, v7}, Le9/e;->p1(I)Le9/e;

    add-int/lit8 v10, v10, 0x1

    goto :goto_152

    :cond_160
    add-int/lit8 v2, v6, 0x1

    if-ne v2, v11, :cond_186

    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le9/h;

    invoke-virtual {v0}, Le9/h;->v()I

    move-result v0

    if-ne v1, v0, :cond_17e

    invoke-interface {v8, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {v9, v0}, Le9/e;->p1(I)Le9/e;

    return-void

    :cond_17e
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Check failed."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_186
    move-wide/from16 v17, v3

    move v4, v1

    move-wide/from16 v1, v17

    new-instance v3, Le9/e;

    invoke-direct {v3}, Le9/e;-><init>()V

    invoke-direct {v0, v3}, Le9/r$a;->c(Le9/e;)J

    move-result-wide v12

    add-long/2addr v12, v1

    long-to-int v7, v12

    mul-int/lit8 v7, v7, -0x1

    invoke-virtual {v9, v7}, Le9/e;->p1(I)Le9/e;

    move v7, v11

    invoke-direct/range {v0 .. v8}, Le9/r$a;->a(JLe9/e;ILjava/util/List;IILjava/util/List;)V

    invoke-virtual {v9, v3}, Le9/e;->l1(Le9/B;)J

    return-void

    :cond_1a3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method static synthetic b(Le9/r$a;JLe9/e;ILjava/util/List;IILjava/util/List;ILjava/lang/Object;)V
    .registers 20

    and-int/lit8 v0, p9, 0x1

    if-eqz v0, :cond_6

    const-wide/16 p1, 0x0

    :cond_6
    move-wide v1, p1

    and-int/lit8 p1, p9, 0x4

    const/4 p2, 0x0

    if-eqz p1, :cond_e

    move v4, p2

    goto :goto_f

    :cond_e
    move v4, p4

    :goto_f
    and-int/lit8 p1, p9, 0x10

    if-eqz p1, :cond_15

    move v6, p2

    goto :goto_16

    :cond_15
    move v6, p6

    :goto_16
    and-int/lit8 p1, p9, 0x20

    if-eqz p1, :cond_25

    invoke-interface {p5}, Ljava/util/List;->size()I

    move-result p1

    move v7, p1

    :goto_1f
    move-object v0, p0

    move-object v3, p3

    move-object v5, p5

    move-object/from16 v8, p8

    goto :goto_28

    :cond_25
    move/from16 v7, p7

    goto :goto_1f

    :goto_28
    invoke-direct/range {v0 .. v8}, Le9/r$a;->a(JLe9/e;ILjava/util/List;IILjava/util/List;)V

    return-void
.end method

.method private final c(Le9/e;)J
    .registers 4

    invoke-virtual {p1}, Le9/e;->X0()J

    move-result-wide p0

    const/4 v0, 0x4

    int-to-long v0, v0

    div-long/2addr p0, v0

    return-wide p0
.end method


# virtual methods
.method public final varargs d([Le9/h;)Le9/r;
    .registers 18

    move-object/from16 v0, p1

    const-string v1, "byteStrings"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, -0x1

    const/4 v4, 0x0

    if-nez v1, :cond_19

    new-instance v0, Le9/r;

    new-array v1, v4, [Le9/h;

    filled-new-array {v4, v3}, [I

    move-result-object v3

    invoke-direct {v0, v1, v3, v2}, Le9/r;-><init>([Le9/h;[ILkotlin/jvm/internal/h;)V

    return-object v0

    :cond_19
    invoke-static {v0}, Li8/m;->Z([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-static {v5}, Li8/s;->x(Ljava/util/List;)V

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v1

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13, v1}, Ljava/util/ArrayList;-><init>(I)V

    move v6, v4

    :goto_2a
    if-ge v6, v1, :cond_36

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v13, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_2a

    :cond_36
    array-length v1, v0

    move v3, v4

    move v11, v3

    :goto_39
    if-ge v3, v1, :cond_52

    aget-object v6, v0, v3

    add-int/lit8 v12, v11, 0x1

    const/4 v9, 0x6

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Li8/s;->k(Ljava/util/List;Ljava/lang/Comparable;IIILjava/lang/Object;)I

    move-result v6

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v13, v6, v7}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    move v11, v12

    goto :goto_39

    :cond_52
    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le9/h;

    invoke-virtual {v1}, Le9/h;->v()I

    move-result v1

    if-lez v1, :cond_104

    move v1, v4

    :goto_5f
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v3

    if-ge v1, v3, :cond_cd

    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Le9/h;

    add-int/lit8 v6, v1, 0x1

    move v7, v6

    :goto_6e
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v8

    if-ge v7, v8, :cond_cb

    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Le9/h;

    invoke-virtual {v8, v3}, Le9/h;->w(Le9/h;)Z

    move-result v9

    if-eqz v9, :cond_cb

    invoke-virtual {v8}, Le9/h;->v()I

    move-result v9

    invoke-virtual {v3}, Le9/h;->v()I

    move-result v10

    if-eq v9, v10, :cond_b0

    invoke-interface {v13, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    invoke-interface {v13, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Number;

    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    move-result v9

    if-le v8, v9, :cond_ad

    invoke-interface {v5, v7}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    invoke-interface {v13, v7}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    goto :goto_6e

    :cond_ad
    add-int/lit8 v7, v7, 0x1

    goto :goto_6e

    :cond_b0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "duplicate option: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_cb
    move v1, v6

    goto :goto_5f

    :cond_cd
    new-instance v8, Le9/e;

    invoke-direct {v8}, Le9/e;-><init>()V

    const/16 v14, 0x35

    const/4 v15, 0x0

    const-wide/16 v6, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v10, v5

    move-object/from16 v5, p0

    invoke-static/range {v5 .. v15}, Le9/r$a;->b(Le9/r$a;JLe9/e;ILjava/util/List;IILjava/util/List;ILjava/lang/Object;)V

    invoke-direct {v5, v8}, Le9/r$a;->c(Le9/e;)J

    move-result-wide v5

    long-to-int v1, v5

    new-array v3, v1, [I

    :goto_e7
    if-ge v4, v1, :cond_f2

    invoke-virtual {v8}, Le9/e;->readInt()I

    move-result v5

    aput v5, v3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_e7

    :cond_f2
    new-instance v1, Le9/r;

    array-length v4, v0

    invoke-static {v0, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    const-string v4, "copyOf(...)"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, [Le9/h;

    invoke-direct {v1, v0, v3, v2}, Le9/r;-><init>([Le9/h;[ILkotlin/jvm/internal/h;)V

    return-object v1

    :cond_104
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "the empty byte string is not a supported option"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
