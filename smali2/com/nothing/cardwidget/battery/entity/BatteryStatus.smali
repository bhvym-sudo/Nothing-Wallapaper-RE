.class public final enum Lcom/nothing/cardwidget/battery/entity/BatteryStatus;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/nothing/cardwidget/battery/entity/BatteryStatus;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lo8/a;

.field private static final synthetic $VALUES:[Lcom/nothing/cardwidget/battery/entity/BatteryStatus;

.field public static final enum CHARGING:Lcom/nothing/cardwidget/battery/entity/BatteryStatus;

.field public static final enum LOW:Lcom/nothing/cardwidget/battery/entity/BatteryStatus;

.field public static final enum NORMAL:Lcom/nothing/cardwidget/battery/entity/BatteryStatus;

.field public static final enum POWER_SAVE:Lcom/nothing/cardwidget/battery/entity/BatteryStatus;


# instance fields
.field private final status:I


# direct methods
.method private static final synthetic $values()[Lcom/nothing/cardwidget/battery/entity/BatteryStatus;
    .registers 4

    sget-object v0, Lcom/nothing/cardwidget/battery/entity/BatteryStatus;->NORMAL:Lcom/nothing/cardwidget/battery/entity/BatteryStatus;

    sget-object v1, Lcom/nothing/cardwidget/battery/entity/BatteryStatus;->LOW:Lcom/nothing/cardwidget/battery/entity/BatteryStatus;

    sget-object v2, Lcom/nothing/cardwidget/battery/entity/BatteryStatus;->POWER_SAVE:Lcom/nothing/cardwidget/battery/entity/BatteryStatus;

    sget-object v3, Lcom/nothing/cardwidget/battery/entity/BatteryStatus;->CHARGING:Lcom/nothing/cardwidget/battery/entity/BatteryStatus;

    filled-new-array {v0, v1, v2, v3}, [Lcom/nothing/cardwidget/battery/entity/BatteryStatus;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .registers 3

    new-instance v0, Lcom/nothing/cardwidget/battery/entity/BatteryStatus;

    const-string v1, "NORMAL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/nothing/cardwidget/battery/entity/BatteryStatus;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/nothing/cardwidget/battery/entity/BatteryStatus;->NORMAL:Lcom/nothing/cardwidget/battery/entity/BatteryStatus;

    new-instance v0, Lcom/nothing/cardwidget/battery/entity/BatteryStatus;

    const-string v1, "LOW"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lcom/nothing/cardwidget/battery/entity/BatteryStatus;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/nothing/cardwidget/battery/entity/BatteryStatus;->LOW:Lcom/nothing/cardwidget/battery/entity/BatteryStatus;

    new-instance v0, Lcom/nothing/cardwidget/battery/entity/BatteryStatus;

    const-string v1, "POWER_SAVE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Lcom/nothing/cardwidget/battery/entity/BatteryStatus;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/nothing/cardwidget/battery/entity/BatteryStatus;->POWER_SAVE:Lcom/nothing/cardwidget/battery/entity/BatteryStatus;

    new-instance v0, Lcom/nothing/cardwidget/battery/entity/BatteryStatus;

    const-string v1, "CHARGING"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v2}, Lcom/nothing/cardwidget/battery/entity/BatteryStatus;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/nothing/cardwidget/battery/entity/BatteryStatus;->CHARGING:Lcom/nothing/cardwidget/battery/entity/BatteryStatus;

    invoke-static {}, Lcom/nothing/cardwidget/battery/entity/BatteryStatus;->$values()[Lcom/nothing/cardwidget/battery/entity/BatteryStatus;

    move-result-object v0

    sput-object v0, Lcom/nothing/cardwidget/battery/entity/BatteryStatus;->$VALUES:[Lcom/nothing/cardwidget/battery/entity/BatteryStatus;

    invoke-static {v0}, Lo8/b;->a([Ljava/lang/Enum;)Lo8/a;

    move-result-object v0

    sput-object v0, Lcom/nothing/cardwidget/battery/entity/BatteryStatus;->$ENTRIES:Lo8/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/nothing/cardwidget/battery/entity/BatteryStatus;->status:I

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

    sget-object v0, Lcom/nothing/cardwidget/battery/entity/BatteryStatus;->$ENTRIES:Lo8/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/nothing/cardwidget/battery/entity/BatteryStatus;
    .registers 2

    const-class v0, Lcom/nothing/cardwidget/battery/entity/BatteryStatus;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/nothing/cardwidget/battery/entity/BatteryStatus;

    return-object p0
.end method

.method public static values()[Lcom/nothing/cardwidget/battery/entity/BatteryStatus;
    .registers 1

    sget-object v0, Lcom/nothing/cardwidget/battery/entity/BatteryStatus;->$VALUES:[Lcom/nothing/cardwidget/battery/entity/BatteryStatus;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/nothing/cardwidget/battery/entity/BatteryStatus;

    return-object v0
.end method


# virtual methods
.method public final getStatus()I
    .registers 1

    iget p0, p0, Lcom/nothing/cardwidget/battery/entity/BatteryStatus;->status:I

    return p0
.end method
