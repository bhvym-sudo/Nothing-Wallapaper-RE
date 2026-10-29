.class public final enum Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lo8/a;

.field private static final synthetic $VALUES:[Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;

.field public static final enum APPLIED_GLASS_EFFECT:Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;

.field public static final enum EXTENDED_WIDGET:Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;

.field public static final enum NOT_SUPPORT:Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;

.field public static final enum NO_OVERLAP:Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;

.field public static final enum NO_SUBJECT:Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;

.field public static final enum OVERLAP_TOO_MUCH:Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;


# direct methods
.method private static final synthetic $values()[Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;
    .registers 6

    sget-object v0, Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;->NOT_SUPPORT:Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;

    sget-object v1, Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;->NO_SUBJECT:Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;

    sget-object v2, Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;->NO_OVERLAP:Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;

    sget-object v3, Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;->OVERLAP_TOO_MUCH:Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;

    sget-object v4, Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;->APPLIED_GLASS_EFFECT:Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;

    sget-object v5, Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;->EXTENDED_WIDGET:Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;

    filled-new-array/range {v0 .. v5}, [Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .registers 3

    new-instance v0, Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;

    const-string v1, "NOT_SUPPORT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;->NOT_SUPPORT:Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;

    new-instance v0, Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;

    const-string v1, "NO_SUBJECT"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;->NO_SUBJECT:Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;

    new-instance v0, Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;

    const-string v1, "NO_OVERLAP"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;->NO_OVERLAP:Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;

    new-instance v0, Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;

    const-string v1, "OVERLAP_TOO_MUCH"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;->OVERLAP_TOO_MUCH:Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;

    new-instance v0, Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;

    const-string v1, "APPLIED_GLASS_EFFECT"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;->APPLIED_GLASS_EFFECT:Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;

    new-instance v0, Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;

    const-string v1, "EXTENDED_WIDGET"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;->EXTENDED_WIDGET:Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;

    invoke-static {}, Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;->$values()[Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;

    move-result-object v0

    sput-object v0, Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;->$VALUES:[Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;

    invoke-static {v0}, Lo8/b;->a([Ljava/lang/Enum;)Lo8/a;

    move-result-object v0

    sput-object v0, Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;->$ENTRIES:Lo8/a;

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

    sget-object v0, Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;->$ENTRIES:Lo8/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;
    .registers 2

    const-class v0, Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;

    return-object p0
.end method

.method public static values()[Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;
    .registers 1

    sget-object v0, Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;->$VALUES:[Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;

    return-object v0
.end method
