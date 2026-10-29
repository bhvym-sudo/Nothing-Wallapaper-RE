.class public final Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthOn;
.super Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DepthOn"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthOn;",
            ">;"
        }
    .end annotation
.end field

.field public static final INSTANCE:Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthOn;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthOn;

    invoke-direct {v0}, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthOn;-><init>()V

    sput-object v0, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthOn;->INSTANCE:Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthOn;

    new-instance v0, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthOn$a;

    invoke-direct {v0}, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthOn$a;-><init>()V

    sput-object v0, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthOn;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>()V
    .registers 2

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState;-><init>(Lkotlin/jvm/internal/h;)V

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
