.class public final Lj6/a$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj6/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field private final a:Z

.field private final b:I

.field private final c:I

.field private final d:I

.field private final e:I

.field private final f:I

.field private final g:Z

.field private final h:I

.field private final i:Z

.field private final j:I

.field private final k:I

.field private final l:I

.field private final m:F

.field private final n:F

.field private final o:I

.field private final p:I

.field private final q:I

.field private final r:F

.field private final s:Z

.field private final t:Z

.field private final u:Z


# direct methods
.method public constructor <init>(ZIIIIIZIZIIIFFIIIFZZZ)V
    .registers 22

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p1, p0, Lj6/a$c;->a:Z

    .line 3
    iput p2, p0, Lj6/a$c;->b:I

    .line 4
    iput p3, p0, Lj6/a$c;->c:I

    .line 5
    iput p4, p0, Lj6/a$c;->d:I

    .line 6
    iput p5, p0, Lj6/a$c;->e:I

    .line 7
    iput p6, p0, Lj6/a$c;->f:I

    .line 8
    iput-boolean p7, p0, Lj6/a$c;->g:Z

    .line 9
    iput p8, p0, Lj6/a$c;->h:I

    .line 10
    iput-boolean p9, p0, Lj6/a$c;->i:Z

    .line 11
    iput p10, p0, Lj6/a$c;->j:I

    .line 12
    iput p11, p0, Lj6/a$c;->k:I

    .line 13
    iput p12, p0, Lj6/a$c;->l:I

    .line 14
    iput p13, p0, Lj6/a$c;->m:F

    .line 15
    iput p14, p0, Lj6/a$c;->n:F

    .line 16
    iput p15, p0, Lj6/a$c;->o:I

    move/from16 p1, p16

    .line 17
    iput p1, p0, Lj6/a$c;->p:I

    move/from16 p1, p17

    .line 18
    iput p1, p0, Lj6/a$c;->q:I

    move/from16 p1, p18

    .line 19
    iput p1, p0, Lj6/a$c;->r:F

    move/from16 p1, p19

    .line 20
    iput-boolean p1, p0, Lj6/a$c;->s:Z

    move/from16 p1, p20

    .line 21
    iput-boolean p1, p0, Lj6/a$c;->t:Z

    move/from16 p1, p21

    .line 22
    iput-boolean p1, p0, Lj6/a$c;->u:Z

    return-void
.end method

.method public synthetic constructor <init>(ZIIIIIZIZIIIFFIIIFZZZILkotlin/jvm/internal/h;)V
    .registers 47

    move/from16 v0, p22

    and-int/lit8 v1, v0, 0x1

    const/4 v2, 0x1

    if-eqz v1, :cond_9

    move v1, v2

    goto :goto_b

    :cond_9
    move/from16 v1, p1

    :goto_b
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_12

    const/16 v3, 0x8

    goto :goto_14

    :cond_12
    move/from16 v3, p2

    :goto_14
    and-int/lit8 v4, v0, 0x4

    if-eqz v4, :cond_1a

    move v4, v2

    goto :goto_1c

    :cond_1a
    move/from16 v4, p3

    :goto_1c
    and-int/lit8 v5, v0, 0x8

    if-eqz v5, :cond_22

    const/4 v5, 0x3

    goto :goto_24

    :cond_22
    move/from16 v5, p4

    :goto_24
    and-int/lit8 v7, v0, 0x10

    if-eqz v7, :cond_2a

    const/4 v7, 0x5

    goto :goto_2c

    :cond_2a
    move/from16 v7, p5

    :goto_2c
    and-int/lit8 v9, v0, 0x20

    if-eqz v9, :cond_32

    move v9, v2

    goto :goto_34

    :cond_32
    move/from16 v9, p6

    :goto_34
    and-int/lit8 v10, v0, 0x40

    if-eqz v10, :cond_3a

    move v10, v2

    goto :goto_3c

    :cond_3a
    move/from16 v10, p7

    :goto_3c
    and-int/lit16 v11, v0, 0x80

    if-eqz v11, :cond_42

    const/4 v11, 0x3

    goto :goto_44

    :cond_42
    move/from16 v11, p8

    :goto_44
    and-int/lit16 v12, v0, 0x100

    if-eqz v12, :cond_49

    goto :goto_4b

    :cond_49
    move/from16 v2, p9

    :goto_4b
    and-int/lit16 v12, v0, 0x200

    if-eqz v12, :cond_51

    const/4 v12, 0x6

    goto :goto_53

    :cond_51
    move/from16 v12, p10

    :goto_53
    and-int/lit16 v13, v0, 0x400

    if-eqz v13, :cond_59

    const/4 v13, 0x4

    goto :goto_5b

    :cond_59
    move/from16 v13, p11

    :goto_5b
    and-int/lit16 v14, v0, 0x800

    if-eqz v14, :cond_62

    const/16 v14, 0xa

    goto :goto_64

    :cond_62
    move/from16 v14, p12

    :goto_64
    and-int/lit16 v15, v0, 0x1000

    if-eqz v15, :cond_6c

    const v15, 0x3e19999a    # 0.15f

    goto :goto_6e

    :cond_6c
    move/from16 v15, p13

    :goto_6e
    and-int/lit16 v6, v0, 0x2000

    if-eqz v6, :cond_75

    const/high16 v6, 0x3f800000    # 1.0f

    goto :goto_77

    :cond_75
    move/from16 v6, p14

    :goto_77
    and-int/lit16 v8, v0, 0x4000

    if-eqz v8, :cond_7e

    const/16 v8, 0x4e20

    goto :goto_80

    :cond_7e
    move/from16 v8, p15

    :goto_80
    const v16, 0x8000

    and-int v16, v0, v16

    if-eqz v16, :cond_8a

    const/16 v16, 0x5

    goto :goto_8c

    :cond_8a
    move/from16 v16, p16

    :goto_8c
    const/high16 v17, 0x10000

    and-int v17, v0, v17

    if-eqz v17, :cond_95

    const/16 v17, 0x3

    goto :goto_97

    :cond_95
    move/from16 v17, p17

    :goto_97
    const/high16 v18, 0x20000

    and-int v18, v0, v18

    if-eqz v18, :cond_a1

    const v18, 0x3c23d70a    # 0.01f

    goto :goto_a3

    :cond_a1
    move/from16 v18, p18

    :goto_a3
    const/high16 v19, 0x40000

    and-int v19, v0, v19

    const/16 v20, 0x0

    if-eqz v19, :cond_ae

    move/from16 v19, v20

    goto :goto_b0

    :cond_ae
    move/from16 v19, p19

    :goto_b0
    const/high16 v21, 0x80000

    and-int v21, v0, v21

    if-eqz v21, :cond_b9

    move/from16 v21, v20

    goto :goto_bb

    :cond_b9
    move/from16 v21, p20

    :goto_bb
    const/high16 v22, 0x100000

    and-int v0, v0, v22

    if-eqz v0, :cond_ee

    move/from16 p22, v20

    :goto_c3
    move-object/from16 p1, p0

    move/from16 p2, v1

    move/from16 p10, v2

    move/from16 p3, v3

    move/from16 p4, v4

    move/from16 p5, v5

    move/from16 p15, v6

    move/from16 p6, v7

    move/from16 p16, v8

    move/from16 p7, v9

    move/from16 p8, v10

    move/from16 p9, v11

    move/from16 p11, v12

    move/from16 p12, v13

    move/from16 p13, v14

    move/from16 p14, v15

    move/from16 p17, v16

    move/from16 p18, v17

    move/from16 p19, v18

    move/from16 p20, v19

    move/from16 p21, v21

    goto :goto_f1

    :cond_ee
    move/from16 p22, p21

    goto :goto_c3

    .line 23
    :goto_f1
    invoke-direct/range {p1 .. p22}, Lj6/a$c;-><init>(ZIIIIIZIZIIIFFIIIFZZZ)V

    return-void
.end method


# virtual methods
.method public final a()I
    .registers 1

    iget p0, p0, Lj6/a$c;->b:I

    return p0
.end method

.method public final b()I
    .registers 1

    iget p0, p0, Lj6/a$c;->j:I

    return p0
.end method

.method public final c()F
    .registers 1

    iget p0, p0, Lj6/a$c;->m:F

    return p0
.end method

.method public final d()I
    .registers 1

    iget p0, p0, Lj6/a$c;->c:I

    return p0
.end method

.method public final e()I
    .registers 1

    iget p0, p0, Lj6/a$c;->q:I

    return p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_4

    return v0

    :cond_4
    instance-of v1, p1, Lj6/a$c;

    const/4 v2, 0x0

    if-nez v1, :cond_a

    return v2

    :cond_a
    check-cast p1, Lj6/a$c;

    iget-boolean v1, p0, Lj6/a$c;->a:Z

    iget-boolean v3, p1, Lj6/a$c;->a:Z

    if-eq v1, v3, :cond_13

    return v2

    :cond_13
    iget v1, p0, Lj6/a$c;->b:I

    iget v3, p1, Lj6/a$c;->b:I

    if-eq v1, v3, :cond_1a

    return v2

    :cond_1a
    iget v1, p0, Lj6/a$c;->c:I

    iget v3, p1, Lj6/a$c;->c:I

    if-eq v1, v3, :cond_21

    return v2

    :cond_21
    iget v1, p0, Lj6/a$c;->d:I

    iget v3, p1, Lj6/a$c;->d:I

    if-eq v1, v3, :cond_28

    return v2

    :cond_28
    iget v1, p0, Lj6/a$c;->e:I

    iget v3, p1, Lj6/a$c;->e:I

    if-eq v1, v3, :cond_2f

    return v2

    :cond_2f
    iget v1, p0, Lj6/a$c;->f:I

    iget v3, p1, Lj6/a$c;->f:I

    if-eq v1, v3, :cond_36

    return v2

    :cond_36
    iget-boolean v1, p0, Lj6/a$c;->g:Z

    iget-boolean v3, p1, Lj6/a$c;->g:Z

    if-eq v1, v3, :cond_3d

    return v2

    :cond_3d
    iget v1, p0, Lj6/a$c;->h:I

    iget v3, p1, Lj6/a$c;->h:I

    if-eq v1, v3, :cond_44

    return v2

    :cond_44
    iget-boolean v1, p0, Lj6/a$c;->i:Z

    iget-boolean v3, p1, Lj6/a$c;->i:Z

    if-eq v1, v3, :cond_4b

    return v2

    :cond_4b
    iget v1, p0, Lj6/a$c;->j:I

    iget v3, p1, Lj6/a$c;->j:I

    if-eq v1, v3, :cond_52

    return v2

    :cond_52
    iget v1, p0, Lj6/a$c;->k:I

    iget v3, p1, Lj6/a$c;->k:I

    if-eq v1, v3, :cond_59

    return v2

    :cond_59
    iget v1, p0, Lj6/a$c;->l:I

    iget v3, p1, Lj6/a$c;->l:I

    if-eq v1, v3, :cond_60

    return v2

    :cond_60
    iget v1, p0, Lj6/a$c;->m:F

    iget v3, p1, Lj6/a$c;->m:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_6b

    return v2

    :cond_6b
    iget v1, p0, Lj6/a$c;->n:F

    iget v3, p1, Lj6/a$c;->n:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_76

    return v2

    :cond_76
    iget v1, p0, Lj6/a$c;->o:I

    iget v3, p1, Lj6/a$c;->o:I

    if-eq v1, v3, :cond_7d

    return v2

    :cond_7d
    iget v1, p0, Lj6/a$c;->p:I

    iget v3, p1, Lj6/a$c;->p:I

    if-eq v1, v3, :cond_84

    return v2

    :cond_84
    iget v1, p0, Lj6/a$c;->q:I

    iget v3, p1, Lj6/a$c;->q:I

    if-eq v1, v3, :cond_8b

    return v2

    :cond_8b
    iget v1, p0, Lj6/a$c;->r:F

    iget v3, p1, Lj6/a$c;->r:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_96

    return v2

    :cond_96
    iget-boolean v1, p0, Lj6/a$c;->s:Z

    iget-boolean v3, p1, Lj6/a$c;->s:Z

    if-eq v1, v3, :cond_9d

    return v2

    :cond_9d
    iget-boolean v1, p0, Lj6/a$c;->t:Z

    iget-boolean v3, p1, Lj6/a$c;->t:Z

    if-eq v1, v3, :cond_a4

    return v2

    :cond_a4
    iget-boolean p0, p0, Lj6/a$c;->u:Z

    iget-boolean p1, p1, Lj6/a$c;->u:Z

    if-eq p0, p1, :cond_ab

    return v2

    :cond_ab
    return v0
.end method

.method public final f()I
    .registers 1

    iget p0, p0, Lj6/a$c;->f:I

    return p0
.end method

.method public final g()I
    .registers 1

    iget p0, p0, Lj6/a$c;->d:I

    return p0
.end method

.method public final h()Z
    .registers 1

    iget-boolean p0, p0, Lj6/a$c;->i:Z

    return p0
.end method

.method public hashCode()I
    .registers 3

    iget-boolean v0, p0, Lj6/a$c;->a:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lj6/a$c;->b:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lj6/a$c;->c:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lj6/a$c;->d:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lj6/a$c;->e:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lj6/a$c;->f:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lj6/a$c;->g:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lj6/a$c;->h:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lj6/a$c;->i:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lj6/a$c;->j:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lj6/a$c;->k:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lj6/a$c;->l:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lj6/a$c;->m:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lj6/a$c;->n:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lj6/a$c;->o:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lj6/a$c;->p:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lj6/a$c;->q:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lj6/a$c;->r:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lj6/a$c;->s:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lj6/a$c;->t:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean p0, p0, Lj6/a$c;->u:Z

    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method

.method public final i()Z
    .registers 1

    iget-boolean p0, p0, Lj6/a$c;->u:Z

    return p0
.end method

.method public final j()Z
    .registers 1

    iget-boolean p0, p0, Lj6/a$c;->a:Z

    return p0
.end method

.method public final k()Z
    .registers 1

    iget-boolean p0, p0, Lj6/a$c;->t:Z

    return p0
.end method

.method public final l()Z
    .registers 1

    iget-boolean p0, p0, Lj6/a$c;->g:Z

    return p0
.end method

.method public final m()Z
    .registers 1

    iget-boolean p0, p0, Lj6/a$c;->s:Z

    return p0
.end method

.method public final n()F
    .registers 1

    iget p0, p0, Lj6/a$c;->n:F

    return p0
.end method

.method public final o()I
    .registers 1

    iget p0, p0, Lj6/a$c;->k:I

    return p0
.end method

.method public final p()I
    .registers 1

    iget p0, p0, Lj6/a$c;->l:I

    return p0
.end method

.method public final q()I
    .registers 1

    iget p0, p0, Lj6/a$c;->h:I

    return p0
.end method

.method public final r()I
    .registers 1

    iget p0, p0, Lj6/a$c;->e:I

    return p0
.end method

.method public final s()I
    .registers 1

    iget p0, p0, Lj6/a$c;->o:I

    return p0
.end method

.method public final t()F
    .registers 1

    iget p0, p0, Lj6/a$c;->r:F

    return p0
.end method

.method public toString()Ljava/lang/String;
    .registers 23

    move-object/from16 v0, p0

    iget-boolean v1, v0, Lj6/a$c;->a:Z

    iget v2, v0, Lj6/a$c;->b:I

    iget v3, v0, Lj6/a$c;->c:I

    iget v4, v0, Lj6/a$c;->d:I

    iget v5, v0, Lj6/a$c;->e:I

    iget v6, v0, Lj6/a$c;->f:I

    iget-boolean v7, v0, Lj6/a$c;->g:Z

    iget v8, v0, Lj6/a$c;->h:I

    iget-boolean v9, v0, Lj6/a$c;->i:Z

    iget v10, v0, Lj6/a$c;->j:I

    iget v11, v0, Lj6/a$c;->k:I

    iget v12, v0, Lj6/a$c;->l:I

    iget v13, v0, Lj6/a$c;->m:F

    iget v14, v0, Lj6/a$c;->n:F

    iget v15, v0, Lj6/a$c;->o:I

    move/from16 v16, v15

    iget v15, v0, Lj6/a$c;->p:I

    move/from16 v17, v15

    iget v15, v0, Lj6/a$c;->q:I

    move/from16 v18, v15

    iget v15, v0, Lj6/a$c;->r:F

    move/from16 v19, v15

    iget-boolean v15, v0, Lj6/a$c;->s:Z

    move/from16 v20, v15

    iget-boolean v15, v0, Lj6/a$c;->t:Z

    iget-boolean v0, v0, Lj6/a$c;->u:Z

    move/from16 p0, v0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move/from16 v21, v15

    const-string v15, "RefineConfig(enableEdgeDenoiseOnly="

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", alphaThreshold="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", edgeBandRadius="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", edgeKernelSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", majorityThreshold="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", edgeIterations="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", enableLinearAlphaTransition="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", linearAlphaWidth="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", enableBackgroundLeakRemoval="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", bgSampleRadius="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", fgSampleWidth="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", leakCheckDistance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", bgVsFgMargin="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", fgMaxConfidence="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", maxSamples="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", morphologyKernelSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", edgeFeatherRadius="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", minComponentAreaRatio="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", enableMorphologySmooth="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", enableEdgeFeather="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", enableComponentCleanup="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, p0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u()I
    .registers 1

    iget p0, p0, Lj6/a$c;->p:I

    return p0
.end method
