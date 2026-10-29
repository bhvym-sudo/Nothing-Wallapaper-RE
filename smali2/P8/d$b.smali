.class public final LP8/d$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP8/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
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
    invoke-direct {p0}, LP8/d$b;-><init>()V

    return-void
.end method

.method private final a(Ljava/lang/String;Ljava/lang/String;I)I
    .registers 8

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p0

    :goto_4
    if-ge p3, p0, :cond_17

    invoke-virtual {p1, p3}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p2, v0, v3, v1, v2}, LE8/i;->R(Ljava/lang/CharSequence;CZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_14

    return p3

    :cond_14
    add-int/lit8 p3, p3, 0x1

    goto :goto_4

    :cond_17
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p0

    return p0
.end method


# virtual methods
.method public final b(LP8/u;)LP8/d;
    .registers 34

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "headers"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, LP8/u;->size()I

    move-result v2

    const/4 v5, 0x1

    move v8, v5

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, -0x1

    const/4 v13, -0x1

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, -0x1

    const/16 v18, -0x1

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    :goto_23
    if-ge v7, v2, :cond_19b

    invoke-virtual {v1, v7}, LP8/u;->b(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v7}, LP8/u;->m(I)Ljava/lang/String;

    move-result-object v6

    const-string v4, "Cache-Control"

    invoke-static {v3, v4, v5}, LE8/i;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_3b

    if-eqz v9, :cond_39

    :goto_37
    const/4 v8, 0x0

    goto :goto_44

    :cond_39
    move-object v9, v6

    goto :goto_44

    :cond_3b
    const-string v4, "Pragma"

    invoke-static {v3, v4, v5}, LE8/i;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v3

    if-eqz v3, :cond_18e

    goto :goto_37

    :goto_44
    const/4 v3, 0x0

    :goto_45
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v3, v4, :cond_18e

    const-string v4, "=,;"

    invoke-direct {v0, v6, v4, v3}, LP8/d$b;->a(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v4

    invoke-virtual {v6, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    move/from16 v29, v5

    const-string v5, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, LE8/i;->N0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v1

    if-eq v4, v1, :cond_cc

    invoke-virtual {v6, v4}, Ljava/lang/String;->charAt(I)C

    move-result v1

    move/from16 v30, v2

    const/16 v2, 0x2c

    if-eq v1, v2, :cond_7c

    invoke-virtual {v6, v4}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x3b

    if-ne v1, v2, :cond_7e

    :cond_7c
    :goto_7c
    move-object v2, v6

    goto :goto_cf

    :cond_7e
    add-int/lit8 v4, v4, 0x1

    invoke-static {v6, v4}, LQ8/d;->D(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_b5

    invoke-virtual {v6, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v4, 0x22

    if-ne v2, v4, :cond_b5

    add-int/lit8 v25, v1, 0x1

    const/16 v27, 0x4

    const/16 v28, 0x0

    const/16 v24, 0x22

    const/16 v26, 0x0

    move-object/from16 v23, v6

    invoke-static/range {v23 .. v28}, LE8/i;->c0(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result v1

    move-object/from16 v2, v23

    move/from16 v4, v25

    invoke-virtual {v2, v4, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v5}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    add-int/lit8 v1, v1, 0x1

    move-object/from16 v31, v4

    move v4, v1

    move-object/from16 v1, v31

    goto :goto_d2

    :cond_b5
    move-object v2, v6

    const-string v4, ",;"

    invoke-direct {v0, v2, v4, v1}, LP8/d$b;->a(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v4

    invoke-virtual {v2, v1, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v5}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, LE8/i;->N0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_d2

    :cond_cc
    move/from16 v30, v2

    goto :goto_7c

    :goto_cf
    add-int/lit8 v4, v4, 0x1

    const/4 v1, 0x0

    :goto_d2
    const-string v5, "no-cache"

    move/from16 v6, v29

    invoke-static {v5, v3, v6}, LE8/i;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v5

    if-eqz v5, :cond_e6

    move-object/from16 v1, p1

    move v3, v4

    move v5, v6

    move v10, v5

    :goto_e1
    move-object v6, v2

    move/from16 v2, v30

    goto/16 :goto_45

    :cond_e6
    const-string v5, "no-store"

    invoke-static {v5, v3, v6}, LE8/i;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v5

    if-eqz v5, :cond_f4

    move-object/from16 v1, p1

    move v3, v4

    move v5, v6

    move v11, v5

    goto :goto_e1

    :cond_f4
    const-string v5, "max-age"

    invoke-static {v5, v3, v6}, LE8/i;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v5

    if-eqz v5, :cond_106

    const/4 v5, -0x1

    invoke-static {v1, v5}, LQ8/d;->V(Ljava/lang/String;I)I

    move-result v12

    :cond_101
    :goto_101
    move-object/from16 v1, p1

    move v3, v4

    move v5, v6

    goto :goto_e1

    :cond_106
    const-string v5, "s-maxage"

    invoke-static {v5, v3, v6}, LE8/i;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v5

    if-eqz v5, :cond_114

    const/4 v5, -0x1

    invoke-static {v1, v5}, LQ8/d;->V(Ljava/lang/String;I)I

    move-result v13

    goto :goto_101

    :cond_114
    const-string v5, "private"

    invoke-static {v5, v3, v6}, LE8/i;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v5

    if-eqz v5, :cond_122

    move-object/from16 v1, p1

    move v3, v4

    move v5, v6

    move v14, v5

    goto :goto_e1

    :cond_122
    const-string v5, "public"

    invoke-static {v5, v3, v6}, LE8/i;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v5

    if-eqz v5, :cond_130

    move-object/from16 v1, p1

    move v3, v4

    move v5, v6

    move v15, v5

    goto :goto_e1

    :cond_130
    const-string v5, "must-revalidate"

    invoke-static {v5, v3, v6}, LE8/i;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v5

    if-eqz v5, :cond_13f

    move-object/from16 v1, p1

    move v3, v4

    move v5, v6

    move/from16 v16, v5

    goto :goto_e1

    :cond_13f
    const-string v5, "max-stale"

    invoke-static {v5, v3, v6}, LE8/i;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v5

    if-eqz v5, :cond_14f

    const v3, 0x7fffffff

    invoke-static {v1, v3}, LQ8/d;->V(Ljava/lang/String;I)I

    move-result v17

    goto :goto_101

    :cond_14f
    const-string v5, "min-fresh"

    invoke-static {v5, v3, v6}, LE8/i;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v5

    if-eqz v5, :cond_15d

    const/4 v5, -0x1

    invoke-static {v1, v5}, LQ8/d;->V(Ljava/lang/String;I)I

    move-result v18

    goto :goto_101

    :cond_15d
    const/4 v5, -0x1

    const-string v1, "only-if-cached"

    invoke-static {v1, v3, v6}, LE8/i;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_16e

    move-object/from16 v1, p1

    move v3, v4

    move v5, v6

    move/from16 v19, v5

    goto/16 :goto_e1

    :cond_16e
    const-string v1, "no-transform"

    invoke-static {v1, v3, v6}, LE8/i;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_17e

    move-object/from16 v1, p1

    move v3, v4

    move v5, v6

    move/from16 v20, v5

    goto/16 :goto_e1

    :cond_17e
    const-string v1, "immutable"

    invoke-static {v1, v3, v6}, LE8/i;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_101

    move-object/from16 v1, p1

    move v3, v4

    move v5, v6

    move/from16 v21, v5

    goto/16 :goto_e1

    :cond_18e
    move/from16 v30, v2

    move v6, v5

    const/4 v5, -0x1

    add-int/lit8 v7, v7, 0x1

    move-object/from16 v1, p1

    move v5, v6

    move/from16 v2, v30

    goto/16 :goto_23

    :cond_19b
    if-nez v8, :cond_1a0

    const/16 v22, 0x0

    goto :goto_1a2

    :cond_1a0
    move-object/from16 v22, v9

    :goto_1a2
    new-instance v9, LP8/d;

    const/16 v23, 0x0

    invoke-direct/range {v9 .. v23}, LP8/d;-><init>(ZZIIZZZIIZZZLjava/lang/String;Lkotlin/jvm/internal/h;)V

    return-object v9
.end method
