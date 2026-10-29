.class public final Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthNotApplicable;
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
    name = "DepthNotApplicable"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthNotApplicable;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final reason:Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthNotApplicable$a;

    invoke-direct {v0}, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthNotApplicable$a;-><init>()V

    sput-object v0, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthNotApplicable;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;)V
    .registers 3

    const-string v0, "reason"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState;-><init>(Lkotlin/jvm/internal/h;)V

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthNotApplicable;->reason:Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;

    return-void
.end method

.method public static synthetic copy$default(Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthNotApplicable;Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;ILjava/lang/Object;)Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthNotApplicable;
    .registers 4

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_6

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthNotApplicable;->reason:Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;

    :cond_6
    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthNotApplicable;->copy(Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;)Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthNotApplicable;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthNotApplicable;->reason:Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;

    return-object p0
.end method

.method public final copy(Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;)Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthNotApplicable;
    .registers 2

    const-string p0, "reason"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthNotApplicable;

    invoke-direct {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthNotApplicable;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;)V

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
    instance-of v1, p1, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthNotApplicable;

    const/4 v2, 0x0

    if-nez v1, :cond_a

    return v2

    :cond_a
    check-cast p1, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthNotApplicable;

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthNotApplicable;->reason:Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;

    iget-object p1, p1, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthNotApplicable;->reason:Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;

    if-eq p0, p1, :cond_13

    return v2

    :cond_13
    return v0
.end method

.method public final getReason()Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthNotApplicable;->reason:Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;

    return-object p0
.end method

.method public hashCode()I
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthNotApplicable;->reason:Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p0

    return p0
.end method

.method public toString()Ljava/lang/String;
    .registers 3

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthNotApplicable;->reason:Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DepthNotApplicable(reason="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

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

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthNotApplicable;->reason:Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
