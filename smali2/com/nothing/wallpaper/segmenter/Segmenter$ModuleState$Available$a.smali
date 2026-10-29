.class public final Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState$Available$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState$Available;
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
.method public final a(Landroid/os/Parcel;)Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState$Available;
    .registers 2

    const-string p0, "parcel"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    sget-object p0, Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState$Available;->INSTANCE:Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState$Available;

    return-object p0
.end method

.method public final b(I)[Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState$Available;
    .registers 2

    new-array p0, p1, [Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState$Available;

    return-object p0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState$Available$a;->a(Landroid/os/Parcel;)Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState$Available;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState$Available$a;->b(I)[Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState$Available;

    move-result-object p0

    return-object p0
.end method
