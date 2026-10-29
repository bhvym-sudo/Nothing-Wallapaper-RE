.class public final enum Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nothing/cardwidget/battery/BatteryConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "BatteryState"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lo8/a;

.field private static final synthetic $VALUES:[Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;

.field public static final enum INIT_IN_CASE:Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;

.field public static final enum NORMAL:Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;

.field public static final enum OUT_OF_CASE:Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;

.field public static final enum OUT_OF_CASE_COUNTING:Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;


# direct methods
.method private static final synthetic $values()[Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;
    .registers 4

    sget-object v0, Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;->INIT_IN_CASE:Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;

    sget-object v1, Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;->OUT_OF_CASE:Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;

    sget-object v2, Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;->OUT_OF_CASE_COUNTING:Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;

    sget-object v3, Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;->NORMAL:Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;

    filled-new-array {v0, v1, v2, v3}, [Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .registers 3

    new-instance v0, Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;

    const-string v1, "INIT_IN_CASE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;->INIT_IN_CASE:Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;

    new-instance v0, Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;

    const-string v1, "OUT_OF_CASE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;->OUT_OF_CASE:Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;

    new-instance v0, Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;

    const-string v1, "OUT_OF_CASE_COUNTING"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;->OUT_OF_CASE_COUNTING:Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;

    new-instance v0, Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;

    const-string v1, "NORMAL"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;->NORMAL:Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;

    invoke-static {}, Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;->$values()[Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;

    move-result-object v0

    sput-object v0, Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;->$VALUES:[Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;

    invoke-static {v0}, Lo8/b;->a([Ljava/lang/Enum;)Lo8/a;

    move-result-object v0

    sput-object v0, Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;->$ENTRIES:Lo8/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static getEntries()Lo8/a;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo8/a;"
        }
    .end annotation

    sget-object v0, Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;->$ENTRIES:Lo8/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;
    .registers 2

    const-class v0, Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;

    return-object p0
.end method

.method public static values()[Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;
    .registers 1

    sget-object v0, Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;->$VALUES:[Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;

    return-object v0
.end method
