.class public final Lcom/nothing/wallpaper/segmenter/Segmenter$FailReason$SubjectTransparent;
.super Lcom/nothing/wallpaper/segmenter/Segmenter$FailReason;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nothing/wallpaper/segmenter/Segmenter$FailReason;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "SubjectTransparent"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/nothing/wallpaper/segmenter/Segmenter$FailReason$SubjectTransparent;",
            ">;"
        }
    .end annotation
.end field

.field public static final INSTANCE:Lcom/nothing/wallpaper/segmenter/Segmenter$FailReason$SubjectTransparent;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, Lcom/nothing/wallpaper/segmenter/Segmenter$FailReason$SubjectTransparent;

    invoke-direct {v0}, Lcom/nothing/wallpaper/segmenter/Segmenter$FailReason$SubjectTransparent;-><init>()V

    sput-object v0, Lcom/nothing/wallpaper/segmenter/Segmenter$FailReason$SubjectTransparent;->INSTANCE:Lcom/nothing/wallpaper/segmenter/Segmenter$FailReason$SubjectTransparent;

    new-instance v0, Lcom/nothing/wallpaper/segmenter/Segmenter$FailReason$SubjectTransparent$a;

    invoke-direct {v0}, Lcom/nothing/wallpaper/segmenter/Segmenter$FailReason$SubjectTransparent$a;-><init>()V

    sput-object v0, Lcom/nothing/wallpaper/segmenter/Segmenter$FailReason$SubjectTransparent;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>()V
    .registers 2

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/nothing/wallpaper/segmenter/Segmenter$FailReason;-><init>(Lkotlin/jvm/internal/h;)V

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
