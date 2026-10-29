.class public final Lcom/nothing/cardwidget/battery/BatteryConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;
    }
.end annotation


# static fields
.field public static final ALPHA_BATTERY_PROGRESSBAR:D = 102.0

.field public static final CARD_DEFAULT_HEIGHT:F = 172.0f

.field public static final DEFAULT_PACKAGE_NAME:Ljava/lang/String; = "com.nothing.hearthstone"

.field public static final DURATION_CHARGING_ANIMATION:J = 0x190L

.field public static final DURATION_DEBOUNCE_UPDATE_INDICATOR:J = 0x320L

.field public static final DURATION_TASK_AWAITING:J = 0x7530L

.field public static final INSTANCE:Lcom/nothing/cardwidget/battery/BatteryConfig;

.field public static final LOW_BATTERY:I = 0x14

.field public static final SIZE_BROADER_AOD:F = 1.0f

.field public static final SIZE_DEVICE_ICON_HEIGHT:I = 0x1e

.field public static final SIZE_DEVICE_ICON_WIDTH:I = 0x32

.field public static final SIZE_INDICATOR:I = 0x10

.field public static final SIZE_ITEM_CONTAINER:I = 0x46

.field public static final SIZE_LEVEL_TEXT:F = 76.0f

.field public static final SIZE_MARGIN_10DP:I = 0xa

.field public static final SIZE_MARGIN_16DP:I = 0x10

.field public static final SIZE_MARGIN_3DP:I = 0x3

.field public static final SIZE_MARGIN_48DP:I = 0x30

.field public static final SIZE_MARGIN_4DP:I = 0x4

.field public static final SIZE_MARGIN_6DP:I = 0x6

.field public static final SIZE_NO_PERMISSION_TEXT:F = 51.0f

.field public static final SIZE_PERMISSION_HEIGHT:I = 0x20

.field public static final SIZE_PERMISSION_WIDTH:I = 0x12

.field public static final SMALL_1x1_HEIGHT:F = 72.0f

.field public static final VALUE_DEVICE_TRANSLATION_Y:F = -22.0f


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, Lcom/nothing/cardwidget/battery/BatteryConfig;

    invoke-direct {v0}, Lcom/nothing/cardwidget/battery/BatteryConfig;-><init>()V

    sput-object v0, Lcom/nothing/cardwidget/battery/BatteryConfig;->INSTANCE:Lcom/nothing/cardwidget/battery/BatteryConfig;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getDeviceIcon(LM5/a;Landroid/content/Context;Z)Landroid/graphics/drawable/Drawable;
    .registers 6

    const-string p0, "com.nothing.hearthstone"

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    :try_start_d
    sget-object v1, Lh8/q;->r:Lh8/q$a;

    invoke-virtual {p2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p2

    invoke-virtual {p2, p0}, Landroid/content/pm/PackageManager;->getResourcesForApplication(Ljava/lang/String;)Landroid/content/res/Resources;

    move-result-object p2

    const-string v1, "getResourcesForApplication(...)"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LM5/a;->i()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_31

    sget-object v1, Lcom/nothing/cardwidget/battery/BatteryConfig;->INSTANCE:Lcom/nothing/cardwidget/battery/BatteryConfig;

    invoke-virtual {v1, p3}, Lcom/nothing/cardwidget/battery/BatteryConfig;->toInt(Z)I

    move-result p3

    invoke-static {p1, p3}, Li8/s;->V(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    goto :goto_32

    :catchall_2f
    move-exception p0

    goto :goto_45

    :cond_31
    move-object p1, v0

    :goto_32
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p3, "drawable"

    invoke-virtual {p2, p1, p3, p0}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    invoke-static {p2, p0, v0}, Ls0/h;->e(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    invoke-static {p0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_44
    .catchall {:try_start_d .. :try_end_44} :catchall_2f

    goto :goto_4f

    :goto_45
    sget-object p1, Lh8/q;->r:Lh8/q$a;

    invoke-static {p0}, Lh8/r;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    :goto_4f
    invoke-static {p0}, Lh8/q;->f(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_56

    goto :goto_57

    :cond_56
    move-object v0, p0

    :goto_57
    check-cast v0, Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final isLowBattery(LM5/a;)Z
    .registers 3

    const-string p0, "<this>"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LM5/a;->b()Ljava/lang/String;

    move-result-object p0

    const-string v0, "LOW"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_28

    invoke-virtual {p1}, LM5/a;->b()Ljava/lang/String;

    move-result-object p0

    const-string v0, "NORMAL"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_26

    invoke-virtual {p1}, LM5/a;->l()I

    move-result p0

    const/16 p1, 0x14

    if-gt p0, p1, :cond_26

    goto :goto_28

    :cond_26
    const/4 p0, 0x0

    return p0

    :cond_28
    :goto_28
    const/4 p0, 0x1

    return p0
.end method

.method public final toInt(Z)I
    .registers 2

    return p1
.end method
