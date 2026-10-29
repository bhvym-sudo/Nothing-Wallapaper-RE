.class public final Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState$Installing;
.super Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Installing"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState$Installing;",
            ">;"
        }
    .end annotation
.end field

.field public static final INSTANCE:Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState$Installing;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState$Installing;

    invoke-direct {v0}, Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState$Installing;-><init>()V

    sput-object v0, Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState$Installing;->INSTANCE:Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState$Installing;

    new-instance v0, Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState$Installing$a;

    invoke-direct {v0}, Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState$Installing$a;-><init>()V

    sput-object v0, Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState$Installing;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>()V
    .registers 2

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState;-><init>(Lkotlin/jvm/internal/h;)V

    return-void
.end method


# virtual methods
.method public final describeContents()I
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 3

    const-string p0, "dest"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x1

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
