.class public final Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;
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
            "Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final collectionId:Ljava/lang/String;

.field private final extra:Landroid/os/Bundle;

.field private final featuredThumbnailIndex:I

.field private final priority:I

.field private final thumbRes:Ljava/lang/String;

.field private final title:Ljava/lang/String;

.field private final wallpapers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory$a;

    invoke-direct {v0}, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory$a;-><init>()V

    sput-object v0, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;ILandroid/os/Bundle;)V
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;",
            ">;I",
            "Landroid/os/Bundle;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->title:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->collectionId:Ljava/lang/String;

    .line 4
    iput p3, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->featuredThumbnailIndex:I

    .line 5
    iput-object p4, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->thumbRes:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->wallpapers:Ljava/util/List;

    .line 7
    iput p6, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->priority:I

    .line 8
    iput-object p7, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->extra:Landroid/os/Bundle;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;ILandroid/os/Bundle;ILkotlin/jvm/internal/h;)V
    .registers 11

    and-int/lit8 p9, p8, 0x4

    const/4 v0, 0x0

    if-eqz p9, :cond_6

    move p3, v0

    :cond_6
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_b

    move p6, v0

    :cond_b
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_10

    const/4 p7, 0x0

    .line 9
    :cond_10
    invoke-direct/range {p0 .. p7}, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;ILandroid/os/Bundle;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;ILandroid/os/Bundle;ILjava/lang/Object;)Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;
    .registers 10

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_6

    iget-object p1, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->title:Ljava/lang/String;

    :cond_6
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_c

    iget-object p2, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->collectionId:Ljava/lang/String;

    :cond_c
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_12

    iget p3, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->featuredThumbnailIndex:I

    :cond_12
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_18

    iget-object p4, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->thumbRes:Ljava/lang/String;

    :cond_18
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_1e

    iget-object p5, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->wallpapers:Ljava/util/List;

    :cond_1e
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_24

    iget p6, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->priority:I

    :cond_24
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_2a

    iget-object p7, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->extra:Landroid/os/Bundle;

    :cond_2a
    move p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->copy(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;ILandroid/os/Bundle;)Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->title:Ljava/lang/String;

    return-object p0
.end method

.method public final component2()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->collectionId:Ljava/lang/String;

    return-object p0
.end method

.method public final component3()I
    .registers 1

    iget p0, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->featuredThumbnailIndex:I

    return p0
.end method

.method public final component4()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->thumbRes:Ljava/lang/String;

    return-object p0
.end method

.method public final component5()Ljava/util/List;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;",
            ">;"
        }
    .end annotation

    iget-object p0, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->wallpapers:Ljava/util/List;

    return-object p0
.end method

.method public final component6()I
    .registers 1

    iget p0, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->priority:I

    return p0
.end method

.method public final component7()Landroid/os/Bundle;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->extra:Landroid/os/Bundle;

    return-object p0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;ILandroid/os/Bundle;)Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;",
            ">;I",
            "Landroid/os/Bundle;",
            ")",
            "Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;"
        }
    .end annotation

    new-instance p0, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;

    invoke-direct/range {p0 .. p7}, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;ILandroid/os/Bundle;)V

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
    instance-of v1, p1, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;

    const/4 v2, 0x0

    if-nez v1, :cond_a

    return v2

    :cond_a
    check-cast p1, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;

    iget-object v1, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    return v2

    :cond_17
    iget-object v1, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->collectionId:Ljava/lang/String;

    iget-object v3, p1, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->collectionId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_22

    return v2

    :cond_22
    iget v1, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->featuredThumbnailIndex:I

    iget v3, p1, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->featuredThumbnailIndex:I

    if-eq v1, v3, :cond_29

    return v2

    :cond_29
    iget-object v1, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->thumbRes:Ljava/lang/String;

    iget-object v3, p1, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->thumbRes:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_34

    return v2

    :cond_34
    iget-object v1, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->wallpapers:Ljava/util/List;

    iget-object v3, p1, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->wallpapers:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3f

    return v2

    :cond_3f
    iget v1, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->priority:I

    iget v3, p1, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->priority:I

    if-eq v1, v3, :cond_46

    return v2

    :cond_46
    iget-object p0, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->extra:Landroid/os/Bundle;

    iget-object p1, p1, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->extra:Landroid/os/Bundle;

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_51

    return v2

    :cond_51
    return v0
.end method

.method public final getCollectionId()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->collectionId:Ljava/lang/String;

    return-object p0
.end method

.method public final getExtra()Landroid/os/Bundle;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->extra:Landroid/os/Bundle;

    return-object p0
.end method

.method public final getFeaturedThumbnailIndex()I
    .registers 1

    iget p0, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->featuredThumbnailIndex:I

    return p0
.end method

.method public final getPriority()I
    .registers 1

    iget p0, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->priority:I

    return p0
.end method

.method public final getThumbRes()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->thumbRes:Ljava/lang/String;

    return-object p0
.end method

.method public final getTitle()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->title:Ljava/lang/String;

    return-object p0
.end method

.method public final getWallpapers()Ljava/util/List;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;",
            ">;"
        }
    .end annotation

    iget-object p0, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->wallpapers:Ljava/util/List;

    return-object p0
.end method

.method public hashCode()I
    .registers 4

    iget-object v0, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->title:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_7

    move v0, v1

    goto :goto_b

    :cond_7
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_b
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->collectionId:Ljava/lang/String;

    if-nez v2, :cond_13

    move v2, v1

    goto :goto_17

    :cond_13
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_17
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->featuredThumbnailIndex:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->thumbRes:Ljava/lang/String;

    if-nez v2, :cond_29

    move v2, v1

    goto :goto_2d

    :cond_29
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2d
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->wallpapers:Ljava/util/List;

    if-nez v2, :cond_36

    move v2, v1

    goto :goto_3a

    :cond_36
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3a
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->priority:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object p0, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->extra:Landroid/os/Bundle;

    if-nez p0, :cond_4b

    goto :goto_4f

    :cond_4b
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_4f
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .registers 9

    iget-object v0, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->title:Ljava/lang/String;

    iget-object v1, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->collectionId:Ljava/lang/String;

    iget v2, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->featuredThumbnailIndex:I

    iget-object v3, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->thumbRes:Ljava/lang/String;

    iget-object v4, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->wallpapers:Ljava/util/List;

    iget v5, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->priority:I

    iget-object p0, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->extra:Landroid/os/Bundle;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "StubWallpaperCategory(title="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", collectionId="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", featuredThumbnailIndex="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", thumbRes="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", wallpapers="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", priority="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", extra="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 5

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->title:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->collectionId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget v0, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->featuredThumbnailIndex:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->thumbRes:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->wallpapers:Ljava/util/List;

    if-nez v0, :cond_22

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_41

    :cond_22
    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_31
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_41

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;

    invoke-virtual {v1, p1, p2}, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_31

    :cond_41
    :goto_41
    iget p2, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->priority:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p0, p0, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;->extra:Landroid/os/Bundle;

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V

    return-void
.end method
