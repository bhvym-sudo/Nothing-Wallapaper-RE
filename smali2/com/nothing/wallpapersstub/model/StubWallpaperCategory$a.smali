.class public final Lcom/nothing/wallpapersstub/model/StubWallpaperCategory$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/os/Parcel;)Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;
    .registers 10

    const-string p0, "parcel"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p0

    if-nez p0, :cond_1e

    const/4 p0, 0x0

    move-object v5, p0

    goto :goto_37

    :cond_1e
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v5, 0x0

    :goto_28
    if-eq v5, p0, :cond_36

    sget-object v6, Lcom/nothing/wallpapersstub/model/StubWallpaperInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v6, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_28

    :cond_36
    move-object v5, v0

    :goto_37
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v6

    const-class p0, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;

    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->readBundle(Ljava/lang/ClassLoader;)Landroid/os/Bundle;

    move-result-object v7

    new-instance v0, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;

    invoke-direct/range {v0 .. v7}, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;ILandroid/os/Bundle;)V

    return-object v0
.end method

.method public final b(I)[Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;
    .registers 2

    new-array p0, p1, [Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;

    return-object p0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    invoke-virtual {p0, p1}, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory$a;->a(Landroid/os/Parcel;)Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    invoke-virtual {p0, p1}, Lcom/nothing/wallpapersstub/model/StubWallpaperCategory$a;->b(I)[Lcom/nothing/wallpapersstub/model/StubWallpaperCategory;

    move-result-object p0

    return-object p0
.end method
