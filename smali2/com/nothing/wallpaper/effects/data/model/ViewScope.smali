.class public final Lcom/nothing/wallpaper/effects/data/model/ViewScope;
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
            "Lcom/nothing/wallpaper/effects/data/model/ViewScope;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final center:Landroid/graphics/PointF;

.field private reason:Ljava/lang/String;

.field private final scale:F

.field private final viewSize:Landroid/graphics/Point;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, Lcom/nothing/wallpaper/effects/data/model/ViewScope$a;

    invoke-direct {v0}, Lcom/nothing/wallpaper/effects/data/model/ViewScope$a;-><init>()V

    sput-object v0, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(FLandroid/graphics/PointF;Landroid/graphics/Point;)V
    .registers 5

    const-string v0, "center"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewSize"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->scale:F

    iput-object p2, p0, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->center:Landroid/graphics/PointF;

    iput-object p3, p0, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->viewSize:Landroid/graphics/Point;

    return-void
.end method

.method public static synthetic copy$default(Lcom/nothing/wallpaper/effects/data/model/ViewScope;FLandroid/graphics/PointF;Landroid/graphics/Point;ILjava/lang/Object;)Lcom/nothing/wallpaper/effects/data/model/ViewScope;
    .registers 6

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_6

    iget p1, p0, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->scale:F

    :cond_6
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_c

    iget-object p2, p0, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->center:Landroid/graphics/PointF;

    :cond_c
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_12

    iget-object p3, p0, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->viewSize:Landroid/graphics/Point;

    :cond_12
    invoke-virtual {p0, p1, p2, p3}, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->copy(FLandroid/graphics/PointF;Landroid/graphics/Point;)Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()F
    .registers 1

    iget p0, p0, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->scale:F

    return p0
.end method

.method public final component2()Landroid/graphics/PointF;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->center:Landroid/graphics/PointF;

    return-object p0
.end method

.method public final component3()Landroid/graphics/Point;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->viewSize:Landroid/graphics/Point;

    return-object p0
.end method

.method public final copy(FLandroid/graphics/PointF;Landroid/graphics/Point;)Lcom/nothing/wallpaper/effects/data/model/ViewScope;
    .registers 4

    const-string p0, "center"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "viewSize"

    invoke-static {p3, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    invoke-direct {p0, p1, p2, p3}, Lcom/nothing/wallpaper/effects/data/model/ViewScope;-><init>(FLandroid/graphics/PointF;Landroid/graphics/Point;)V

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
    instance-of v1, p1, Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    const/4 v2, 0x0

    if-nez v1, :cond_a

    return v2

    :cond_a
    check-cast p1, Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    iget v1, p0, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->scale:F

    iget v3, p1, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->scale:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_17

    return v2

    :cond_17
    iget-object v1, p0, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->center:Landroid/graphics/PointF;

    iget-object v3, p1, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->center:Landroid/graphics/PointF;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_22

    return v2

    :cond_22
    iget-object p0, p0, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->viewSize:Landroid/graphics/Point;

    iget-object p1, p1, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->viewSize:Landroid/graphics/Point;

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2d

    return v2

    :cond_2d
    return v0
.end method

.method public final getCenter()Landroid/graphics/PointF;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->center:Landroid/graphics/PointF;

    return-object p0
.end method

.method public final getReason()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->reason:Ljava/lang/String;

    return-object p0
.end method

.method public final getScale()F
    .registers 1

    iget p0, p0, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->scale:F

    return p0
.end method

.method public final getViewSize()Landroid/graphics/Point;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->viewSize:Landroid/graphics/Point;

    return-object p0
.end method

.method public hashCode()I
    .registers 3

    iget v0, p0, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->scale:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->center:Landroid/graphics/PointF;

    invoke-virtual {v1}, Landroid/graphics/PointF;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object p0, p0, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->viewSize:Landroid/graphics/Point;

    invoke-virtual {p0}, Landroid/graphics/Point;->hashCode()I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method

.method public final setReason(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->reason:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 6

    iget v0, p0, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->scale:F

    iget-object v1, p0, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->center:Landroid/graphics/PointF;

    iget-object v2, p0, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->viewSize:Landroid/graphics/Point;

    iget-object p0, p0, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->reason:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "ViewScope(scale="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", center="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", viewSize="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", reason="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 4

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->scale:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    iget-object v0, p0, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->center:Landroid/graphics/PointF;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object p0, p0, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->viewSize:Landroid/graphics/Point;

    invoke-virtual {p1, p0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method
