.class public final Lj7/j$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj7/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .registers 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/h;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Lj7/j$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState;)Z
    .registers 5

    const-string p0, "depthState"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p0, p1, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthNotApplicable;

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p0, :cond_1c

    move-object p0, p1

    check-cast p0, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthNotApplicable;

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthNotApplicable;->getReason()Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;

    move-result-object p0

    sget-object v2, Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;->NO_OVERLAP:Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;

    if-eq p0, v2, :cond_1a

    sget-object v2, Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;->OVERLAP_TOO_MUCH:Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;

    if-ne p0, v2, :cond_1c

    :cond_1a
    move p0, v0

    goto :goto_1d

    :cond_1c
    move p0, v1

    :goto_1d
    instance-of v2, p1, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthOn;

    if-nez v2, :cond_29

    instance-of p1, p1, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthOff;

    if-nez p1, :cond_29

    if-eqz p0, :cond_28

    goto :goto_29

    :cond_28
    return v1

    :cond_29
    :goto_29
    return v0
.end method

.method public final b(Landroid/content/Context;)Z
    .registers 3

    const-string p0, "context"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p0

    const-string p1, "depth_effect_state"

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Landroid/provider/Settings$Secure;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result p0

    const/4 p1, 0x1

    if-ne p0, p1, :cond_14

    return p1

    :cond_14
    return v0
.end method

.method public final c(Landroid/content/Context;Z)V
    .registers 3

    const-string p0, "context"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p0

    const-string p1, "depth_effect_state"

    invoke-static {p0, p1, p2}, Landroid/provider/Settings$Secure;->putInt(Landroid/content/ContentResolver;Ljava/lang/String;I)Z

    return-void
.end method
