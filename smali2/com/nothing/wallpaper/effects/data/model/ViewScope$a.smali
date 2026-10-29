.class public final Lcom/nothing/wallpaper/effects/data/model/ViewScope$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nothing/wallpaper/effects/data/model/ViewScope;
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
.method public final a(Landroid/os/Parcel;)Lcom/nothing/wallpaper/effects/data/model/ViewScope;
    .registers 5

    const-string p0, "parcel"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    const-class v1, Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Landroid/graphics/PointF;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/graphics/Point;

    invoke-direct {p0, v0, v2, p1}, Lcom/nothing/wallpaper/effects/data/model/ViewScope;-><init>(FLandroid/graphics/PointF;Landroid/graphics/Point;)V

    return-object p0
.end method

.method public final b(I)[Lcom/nothing/wallpaper/effects/data/model/ViewScope;
    .registers 2

    new-array p0, p1, [Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    return-object p0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/effects/data/model/ViewScope$a;->a(Landroid/os/Parcel;)Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/effects/data/model/ViewScope$a;->b(I)[Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    move-result-object p0

    return-object p0
.end method
