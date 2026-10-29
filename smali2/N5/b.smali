.class public final LN5/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LN5/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LN5/b$a;
    }
.end annotation


# static fields
.field public static final m:LN5/b$a;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Landroid/graphics/drawable/Icon;

.field private final e:Landroid/graphics/drawable/Icon;

.field private final f:I

.field private final g:Ljava/lang/String;

.field private final h:Landroid/app/PendingIntent;

.field private final i:B

.field private final j:Ljava/lang/String;

.field private final k:Ljava/lang/String;

.field private final l:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LN5/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LN5/b$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LN5/b;->m:LN5/b$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/drawable/Icon;Landroid/graphics/drawable/Icon;ILjava/lang/String;Landroid/app/PendingIntent;BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .registers 14

    const-string v0, "musicName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LN5/b;->a:Ljava/lang/String;

    .line 3
    iput-object p2, p0, LN5/b;->b:Ljava/lang/String;

    .line 4
    iput-object p3, p0, LN5/b;->c:Ljava/lang/String;

    .line 5
    iput-object p4, p0, LN5/b;->d:Landroid/graphics/drawable/Icon;

    .line 6
    iput-object p5, p0, LN5/b;->e:Landroid/graphics/drawable/Icon;

    .line 7
    iput p6, p0, LN5/b;->f:I

    .line 8
    iput-object p7, p0, LN5/b;->g:Ljava/lang/String;

    .line 9
    iput-object p8, p0, LN5/b;->h:Landroid/app/PendingIntent;

    .line 10
    iput-byte p9, p0, LN5/b;->i:B

    .line 11
    iput-object p10, p0, LN5/b;->j:Ljava/lang/String;

    .line 12
    iput-object p11, p0, LN5/b;->k:Ljava/lang/String;

    .line 13
    iput-object p12, p0, LN5/b;->l:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/drawable/Icon;Landroid/graphics/drawable/Icon;ILjava/lang/String;Landroid/app/PendingIntent;BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/h;)V
    .registers 30

    move/from16 v0, p13

    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_9

    const/4 v1, 0x0

    move v8, v1

    goto :goto_b

    :cond_9
    move/from16 v8, p6

    :goto_b
    and-int/lit16 v1, v0, 0x80

    const/4 v2, 0x0

    if-eqz v1, :cond_12

    move-object v10, v2

    goto :goto_14

    :cond_12
    move-object/from16 v10, p8

    :goto_14
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_1c

    const/16 v1, -0x80

    move v11, v1

    goto :goto_1e

    :cond_1c
    move/from16 v11, p9

    :goto_1e
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_24

    move-object v12, v2

    goto :goto_26

    :cond_24
    move-object/from16 v12, p10

    :goto_26
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_2c

    move-object v13, v2

    goto :goto_2e

    :cond_2c
    move-object/from16 v13, p11

    :goto_2e
    and-int/lit16 v0, v0, 0x800

    if-eqz v0, :cond_41

    move-object v14, v2

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v9, p7

    move-object v2, p0

    goto :goto_50

    :cond_41
    move-object/from16 v14, p12

    move-object v2, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v9, p7

    .line 14
    :goto_50
    invoke-direct/range {v2 .. v14}, LN5/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/drawable/Icon;Landroid/graphics/drawable/Icon;ILjava/lang/String;Landroid/app/PendingIntent;BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a()Landroid/graphics/drawable/Icon;
    .registers 1

    iget-object p0, p0, LN5/b;->d:Landroid/graphics/drawable/Icon;

    return-object p0
.end method

.method public final b()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, LN5/b;->j:Ljava/lang/String;

    return-object p0
.end method

.method public final c()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, LN5/b;->k:Ljava/lang/String;

    return-object p0
.end method

.method public final d()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, LN5/b;->l:Ljava/lang/String;

    return-object p0
.end method

.method public final e()I
    .registers 4

    iget-object v0, p0, LN5/b;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    iget-object v1, p0, LN5/b;->b:Ljava/lang/String;

    const/4 v2, 0x0

    if-eqz v1, :cond_10

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_11

    :cond_10
    move v1, v2

    :goto_11
    mul-int/lit8 v1, v1, 0x1f

    add-int/2addr v0, v1

    iget-object v1, p0, LN5/b;->d:Landroid/graphics/drawable/Icon;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    mul-int/lit8 v1, v1, 0x1f

    add-int/2addr v0, v1

    iget-object v1, p0, LN5/b;->c:Ljava/lang/String;

    if-eqz v1, :cond_2a

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_2b

    :cond_2a
    move v1, v2

    :goto_2b
    mul-int/lit8 v1, v1, 0x1f

    add-int/2addr v0, v1

    iget-object v1, p0, LN5/b;->g:Ljava/lang/String;

    if-eqz v1, :cond_37

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_38

    :cond_37
    move v1, v2

    :goto_38
    mul-int/lit8 v1, v1, 0x1f

    add-int/2addr v0, v1

    iget-object v1, p0, LN5/b;->j:Ljava/lang/String;

    if-eqz v1, :cond_44

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_45

    :cond_44
    move v1, v2

    :goto_45
    mul-int/lit8 v1, v1, 0x1f

    add-int/2addr v0, v1

    iget-object v1, p0, LN5/b;->k:Ljava/lang/String;

    if-eqz v1, :cond_51

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_52

    :cond_51
    move v1, v2

    :goto_52
    mul-int/lit8 v1, v1, 0x1f

    add-int/2addr v0, v1

    iget-object p0, p0, LN5/b;->l:Ljava/lang/String;

    if-eqz p0, :cond_5d

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :cond_5d
    mul-int/lit8 v2, v2, 0x1f

    add-int/2addr v0, v2

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_4

    return v0

    :cond_4
    instance-of v1, p1, LN5/b;

    const/4 v2, 0x0

    if-nez v1, :cond_a

    return v2

    :cond_a
    check-cast p1, LN5/b;

    iget-object v1, p0, LN5/b;->a:Ljava/lang/String;

    iget-object v3, p1, LN5/b;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    return v2

    :cond_17
    iget-object v1, p0, LN5/b;->b:Ljava/lang/String;

    iget-object v3, p1, LN5/b;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_22

    return v2

    :cond_22
    iget-object v1, p0, LN5/b;->c:Ljava/lang/String;

    iget-object v3, p1, LN5/b;->c:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2d

    return v2

    :cond_2d
    iget-object v1, p0, LN5/b;->d:Landroid/graphics/drawable/Icon;

    iget-object v3, p1, LN5/b;->d:Landroid/graphics/drawable/Icon;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_38

    return v2

    :cond_38
    iget-object v1, p0, LN5/b;->e:Landroid/graphics/drawable/Icon;

    iget-object v3, p1, LN5/b;->e:Landroid/graphics/drawable/Icon;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_43

    return v2

    :cond_43
    iget v1, p0, LN5/b;->f:I

    iget v3, p1, LN5/b;->f:I

    if-eq v1, v3, :cond_4a

    return v2

    :cond_4a
    iget-object v1, p0, LN5/b;->g:Ljava/lang/String;

    iget-object v3, p1, LN5/b;->g:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_55

    return v2

    :cond_55
    iget-object v1, p0, LN5/b;->h:Landroid/app/PendingIntent;

    iget-object v3, p1, LN5/b;->h:Landroid/app/PendingIntent;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_60

    return v2

    :cond_60
    iget-byte v1, p0, LN5/b;->i:B

    iget-byte v3, p1, LN5/b;->i:B

    if-eq v1, v3, :cond_67

    return v2

    :cond_67
    iget-object v1, p0, LN5/b;->j:Ljava/lang/String;

    iget-object v3, p1, LN5/b;->j:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_72

    return v2

    :cond_72
    iget-object v1, p0, LN5/b;->k:Ljava/lang/String;

    iget-object v3, p1, LN5/b;->k:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7d

    return v2

    :cond_7d
    iget-object p0, p0, LN5/b;->l:Ljava/lang/String;

    iget-object p1, p1, LN5/b;->l:Ljava/lang/String;

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_88

    return v2

    :cond_88
    return v0
.end method

.method public final f()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, LN5/b;->c:Ljava/lang/String;

    return-object p0
.end method

.method public final g()Landroid/graphics/drawable/Icon;
    .registers 1

    iget-object p0, p0, LN5/b;->e:Landroid/graphics/drawable/Icon;

    return-object p0
.end method

.method public final h()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, LN5/b;->b:Ljava/lang/String;

    return-object p0
.end method

.method public hashCode()I
    .registers 4

    iget-object v0, p0, LN5/b;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LN5/b;->b:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_f

    move v1, v2

    goto :goto_13

    :cond_f
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_13
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LN5/b;->c:Ljava/lang/String;

    if-nez v1, :cond_1c

    move v1, v2

    goto :goto_20

    :cond_1c
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_20
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LN5/b;->d:Landroid/graphics/drawable/Icon;

    if-nez v1, :cond_29

    move v1, v2

    goto :goto_2d

    :cond_29
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2d
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LN5/b;->e:Landroid/graphics/drawable/Icon;

    if-nez v1, :cond_36

    move v1, v2

    goto :goto_3a

    :cond_36
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_3a
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LN5/b;->f:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LN5/b;->g:Ljava/lang/String;

    if-nez v1, :cond_4c

    move v1, v2

    goto :goto_50

    :cond_4c
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_50
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LN5/b;->h:Landroid/app/PendingIntent;

    if-nez v1, :cond_59

    move v1, v2

    goto :goto_5d

    :cond_59
    invoke-virtual {v1}, Landroid/app/PendingIntent;->hashCode()I

    move-result v1

    :goto_5d
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-byte v1, p0, LN5/b;->i:B

    invoke-static {v1}, Ljava/lang/Byte;->hashCode(B)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LN5/b;->j:Ljava/lang/String;

    if-nez v1, :cond_6f

    move v1, v2

    goto :goto_73

    :cond_6f
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_73
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LN5/b;->k:Ljava/lang/String;

    if-nez v1, :cond_7c

    move v1, v2

    goto :goto_80

    :cond_7c
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_80
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object p0, p0, LN5/b;->l:Ljava/lang/String;

    if-nez p0, :cond_88

    goto :goto_8c

    :cond_88
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_8c
    add-int/2addr v0, v2

    return v0
.end method

.method public final i()Landroid/app/PendingIntent;
    .registers 1

    iget-object p0, p0, LN5/b;->h:Landroid/app/PendingIntent;

    return-object p0
.end method

.method public final j()Ljava/lang/String;
    .registers 5

    iget-object v0, p0, LN5/b;->a:Ljava/lang/String;

    iget-object v1, p0, LN5/b;->c:Ljava/lang/String;

    iget-object v2, p0, LN5/b;->b:Ljava/lang/String;

    iget-object p0, p0, LN5/b;->g:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "_"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final k()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, LN5/b;->a:Ljava/lang/String;

    return-object p0
.end method

.method public final l()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, LN5/b;->g:Ljava/lang/String;

    return-object p0
.end method

.method public final m()B
    .registers 1

    iget-byte p0, p0, LN5/b;->i:B

    return p0
.end method

.method public toString()Ljava/lang/String;
    .registers 14

    iget-object v0, p0, LN5/b;->a:Ljava/lang/String;

    iget-object v1, p0, LN5/b;->b:Ljava/lang/String;

    iget-object v2, p0, LN5/b;->c:Ljava/lang/String;

    iget-object v3, p0, LN5/b;->d:Landroid/graphics/drawable/Icon;

    iget-object v4, p0, LN5/b;->e:Landroid/graphics/drawable/Icon;

    iget v5, p0, LN5/b;->f:I

    iget-object v6, p0, LN5/b;->g:Ljava/lang/String;

    iget-object v7, p0, LN5/b;->h:Landroid/app/PendingIntent;

    iget-byte v8, p0, LN5/b;->i:B

    iget-object v9, p0, LN5/b;->j:Ljava/lang/String;

    iget-object v10, p0, LN5/b;->k:Ljava/lang/String;

    iget-object p0, p0, LN5/b;->l:Ljava/lang/String;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "MusicMetaData(musicName="

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", artistName="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", albumName="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", albumIcon="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", appIcon="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", musicDuration="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", packageName="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", launchPendingIntent="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", supportPlaybackActions="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", albumIconUri1="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", albumIconUri2="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", albumIconUri3="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v11, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
