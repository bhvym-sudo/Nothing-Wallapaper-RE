.class public final Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$ModuleUnavailable;
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
    name = "ModuleUnavailable"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$ModuleUnavailable;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final isInstalling:Z


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$ModuleUnavailable$a;

    invoke-direct {v0}, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$ModuleUnavailable$a;-><init>()V

    sput-object v0, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$ModuleUnavailable;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Z)V
    .registers 3

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState;-><init>(Lkotlin/jvm/internal/h;)V

    iput-boolean p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$ModuleUnavailable;->isInstalling:Z

    return-void
.end method

.method public static synthetic copy$default(Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$ModuleUnavailable;ZILjava/lang/Object;)Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$ModuleUnavailable;
    .registers 4

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_6

    iget-boolean p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$ModuleUnavailable;->isInstalling:Z

    :cond_6
    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$ModuleUnavailable;->copy(Z)Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$ModuleUnavailable;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .registers 1

    iget-boolean p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$ModuleUnavailable;->isInstalling:Z

    return p0
.end method

.method public final copy(Z)Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$ModuleUnavailable;
    .registers 2

    new-instance p0, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$ModuleUnavailable;

    invoke-direct {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$ModuleUnavailable;-><init>(Z)V

    return-object p0
.end method

.method public final describeContents()I
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 5

    const/4 v0, 0x1

    if-ne p0, p1, :cond_4

    return v0

    :cond_4
    instance-of v1, p1, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$ModuleUnavailable;

    const/4 v2, 0x0

    if-nez v1, :cond_a

    return v2

    :cond_a
    check-cast p1, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$ModuleUnavailable;

    iget-boolean p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$ModuleUnavailable;->isInstalling:Z

    iget-boolean p1, p1, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$ModuleUnavailable;->isInstalling:Z

    if-eq p0, p1, :cond_13

    return v2

    :cond_13
    return v0
.end method

.method public hashCode()I
    .registers 1

    iget-boolean p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$ModuleUnavailable;->isInstalling:Z

    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result p0

    return p0
.end method

.method public final isInstalling()Z
    .registers 1

    iget-boolean p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$ModuleUnavailable;->isInstalling:Z

    return p0
.end method

.method public toString()Ljava/lang/String;
    .registers 3

    iget-boolean p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$ModuleUnavailable;->isInstalling:Z

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ModuleUnavailable(isInstalling="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 3

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$ModuleUnavailable;->isInstalling:Z

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
