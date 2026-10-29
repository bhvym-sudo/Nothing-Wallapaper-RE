.class public final Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final collectionId:Ljava/lang/String;

.field private final coverPriority:I

.field private final drawableResId:Ljava/lang/String;

.field private final extra:Landroid/os/Bundle;

.field private final gridPriority:I

.field private final packageName:Ljava/lang/String;

.field private final subtitle1ResId:Ljava/lang/String;

.field private final supportDepth:Z

.field private final titleResId:Ljava/lang/String;

.field private final wallpaperId:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo$a;

    invoke-direct {v0}, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo$a;-><init>()V

    sput-object v0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZLandroid/os/Bundle;)V
    .registers 11

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->packageName:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->drawableResId:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->wallpaperId:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->collectionId:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->titleResId:Ljava/lang/String;

    .line 7
    iput-object p6, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->subtitle1ResId:Ljava/lang/String;

    .line 8
    iput p7, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->coverPriority:I

    .line 9
    iput p8, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->gridPriority:I

    .line 10
    iput-boolean p9, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->supportDepth:Z

    .line 11
    iput-object p10, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->extra:Landroid/os/Bundle;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZLandroid/os/Bundle;ILkotlin/jvm/internal/h;)V
    .registers 14

    and-int/lit8 p12, p11, 0x40

    const/4 v0, 0x0

    if-eqz p12, :cond_6

    move p7, v0

    :cond_6
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_b

    move p8, v0

    :cond_b
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_10

    move p9, v0

    :cond_10
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_15

    const/4 p10, 0x0

    .line 12
    :cond_15
    invoke-direct/range {p0 .. p10}, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZLandroid/os/Bundle;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZLandroid/os/Bundle;ILjava/lang/Object;)Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;
    .registers 13

    and-int/lit8 p12, p11, 0x1

    if-eqz p12, :cond_6

    iget-object p1, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->packageName:Ljava/lang/String;

    :cond_6
    and-int/lit8 p12, p11, 0x2

    if-eqz p12, :cond_c

    iget-object p2, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->drawableResId:Ljava/lang/String;

    :cond_c
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_12

    iget-object p3, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->wallpaperId:Ljava/lang/String;

    :cond_12
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_18

    iget-object p4, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->collectionId:Ljava/lang/String;

    :cond_18
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_1e

    iget-object p5, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->titleResId:Ljava/lang/String;

    :cond_1e
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_24

    iget-object p6, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->subtitle1ResId:Ljava/lang/String;

    :cond_24
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_2a

    iget p7, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->coverPriority:I

    :cond_2a
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_30

    iget p8, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->gridPriority:I

    :cond_30
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_36

    iget-boolean p9, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->supportDepth:Z

    :cond_36
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_3c

    iget-object p10, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->extra:Landroid/os/Bundle;

    :cond_3c
    move p11, p9

    move-object p12, p10

    move p9, p7

    move p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p12}, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZLandroid/os/Bundle;)Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->packageName:Ljava/lang/String;

    return-object p0
.end method

.method public final component10()Landroid/os/Bundle;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->extra:Landroid/os/Bundle;

    return-object p0
.end method

.method public final component2()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->drawableResId:Ljava/lang/String;

    return-object p0
.end method

.method public final component3()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->wallpaperId:Ljava/lang/String;

    return-object p0
.end method

.method public final component4()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->collectionId:Ljava/lang/String;

    return-object p0
.end method

.method public final component5()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->titleResId:Ljava/lang/String;

    return-object p0
.end method

.method public final component6()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->subtitle1ResId:Ljava/lang/String;

    return-object p0
.end method

.method public final component7()I
    .registers 1

    iget p0, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->coverPriority:I

    return p0
.end method

.method public final component8()I
    .registers 1

    iget p0, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->gridPriority:I

    return p0
.end method

.method public final component9()Z
    .registers 1

    iget-boolean p0, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->supportDepth:Z

    return p0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZLandroid/os/Bundle;)Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;
    .registers 11

    new-instance p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;

    invoke-direct/range {p0 .. p10}, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZLandroid/os/Bundle;)V

    return-object p0
.end method

.method public final describeContents()I
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_4

    return v0

    :cond_4
    instance-of v1, p1, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;

    const/4 v2, 0x0

    if-nez v1, :cond_a

    return v2

    :cond_a
    check-cast p1, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;

    iget-object v1, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->packageName:Ljava/lang/String;

    iget-object v3, p1, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->packageName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    return v2

    :cond_17
    iget-object v1, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->drawableResId:Ljava/lang/String;

    iget-object v3, p1, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->drawableResId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_22

    return v2

    :cond_22
    iget-object v1, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->wallpaperId:Ljava/lang/String;

    iget-object v3, p1, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->wallpaperId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2d

    return v2

    :cond_2d
    iget-object v1, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->collectionId:Ljava/lang/String;

    iget-object v3, p1, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->collectionId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_38

    return v2

    :cond_38
    iget-object v1, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->titleResId:Ljava/lang/String;

    iget-object v3, p1, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->titleResId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_43

    return v2

    :cond_43
    iget-object v1, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->subtitle1ResId:Ljava/lang/String;

    iget-object v3, p1, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->subtitle1ResId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4e

    return v2

    :cond_4e
    iget v1, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->coverPriority:I

    iget v3, p1, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->coverPriority:I

    if-eq v1, v3, :cond_55

    return v2

    :cond_55
    iget v1, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->gridPriority:I

    iget v3, p1, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->gridPriority:I

    if-eq v1, v3, :cond_5c

    return v2

    :cond_5c
    iget-boolean v1, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->supportDepth:Z

    iget-boolean v3, p1, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->supportDepth:Z

    if-eq v1, v3, :cond_63

    return v2

    :cond_63
    iget-object p0, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->extra:Landroid/os/Bundle;

    iget-object p1, p1, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->extra:Landroid/os/Bundle;

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_6e

    return v2

    :cond_6e
    return v0
.end method

.method public final getCollectionId()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->collectionId:Ljava/lang/String;

    return-object p0
.end method

.method public final getCoverPriority()I
    .registers 1

    iget p0, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->coverPriority:I

    return p0
.end method

.method public final getDrawableResId()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->drawableResId:Ljava/lang/String;

    return-object p0
.end method

.method public final getExtra()Landroid/os/Bundle;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->extra:Landroid/os/Bundle;

    return-object p0
.end method

.method public final getGridPriority()I
    .registers 1

    iget p0, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->gridPriority:I

    return p0
.end method

.method public final getPackageName()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->packageName:Ljava/lang/String;

    return-object p0
.end method

.method public final getSubtitle1ResId()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->subtitle1ResId:Ljava/lang/String;

    return-object p0
.end method

.method public final getSupportDepth()Z
    .registers 1

    iget-boolean p0, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->supportDepth:Z

    return p0
.end method

.method public final getTitleResId()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->titleResId:Ljava/lang/String;

    return-object p0
.end method

.method public final getWallpaperId()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->wallpaperId:Ljava/lang/String;

    return-object p0
.end method

.method public hashCode()I
    .registers 4

    iget-object v0, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->packageName:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_7

    move v0, v1

    goto :goto_b

    :cond_7
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_b
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->drawableResId:Ljava/lang/String;

    if-nez v2, :cond_13

    move v2, v1

    goto :goto_17

    :cond_13
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_17
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->wallpaperId:Ljava/lang/String;

    if-nez v2, :cond_20

    move v2, v1

    goto :goto_24

    :cond_20
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_24
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->collectionId:Ljava/lang/String;

    if-nez v2, :cond_2d

    move v2, v1

    goto :goto_31

    :cond_2d
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_31
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->titleResId:Ljava/lang/String;

    if-nez v2, :cond_3a

    move v2, v1

    goto :goto_3e

    :cond_3a
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3e
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->subtitle1ResId:Ljava/lang/String;

    if-nez v2, :cond_47

    move v2, v1

    goto :goto_4b

    :cond_47
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4b
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->coverPriority:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->gridPriority:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->supportDepth:Z

    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object p0, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->extra:Landroid/os/Bundle;

    if-nez p0, :cond_6e

    goto :goto_72

    :cond_6e
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_72
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .registers 12

    iget-object v0, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->packageName:Ljava/lang/String;

    iget-object v1, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->drawableResId:Ljava/lang/String;

    iget-object v2, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->wallpaperId:Ljava/lang/String;

    iget-object v3, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->collectionId:Ljava/lang/String;

    iget-object v4, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->titleResId:Ljava/lang/String;

    iget-object v5, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->subtitle1ResId:Ljava/lang/String;

    iget v6, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->coverPriority:I

    iget v7, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->gridPriority:I

    iget-boolean v8, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->supportDepth:Z

    iget-object p0, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->extra:Landroid/os/Bundle;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "StubWallpaperInfo(packageName="

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", drawableResId="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", wallpaperId="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", collectionId="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", titleResId="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", subtitle1ResId="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", coverPriority="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", gridPriority="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", supportDepth="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", extra="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v9, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 3

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->packageName:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->drawableResId:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->wallpaperId:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->collectionId:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->titleResId:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->subtitle1ResId:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget p2, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->coverPriority:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->gridPriority:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->supportDepth:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p0, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->extra:Landroid/os/Bundle;

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V

    return-void
.end method
