.class public final enum Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "OpaquePercentage"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lo8/a;

.field private static final synthetic $VALUES:[Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;

.field public static final enum EXCEEDED:Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;

.field public static final enum NO_OPAQUE:Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;

.field public static final enum SATISFIED:Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;


# direct methods
.method private static final synthetic $values()[Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;
    .registers 3

    sget-object v0, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;->NO_OPAQUE:Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;

    sget-object v1, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;->SATISFIED:Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;

    sget-object v2, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;->EXCEEDED:Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;

    filled-new-array {v0, v1, v2}, [Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .registers 3

    new-instance v0, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;

    const-string v1, "NO_OPAQUE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;->NO_OPAQUE:Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;

    new-instance v0, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;

    const-string v1, "SATISFIED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;->SATISFIED:Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;

    new-instance v0, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;

    const-string v1, "EXCEEDED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;->EXCEEDED:Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;

    invoke-static {}, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;->$values()[Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;

    move-result-object v0

    sput-object v0, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;->$VALUES:[Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;

    invoke-static {v0}, Lo8/b;->a([Ljava/lang/Enum;)Lo8/a;

    move-result-object v0

    sput-object v0, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;->$ENTRIES:Lo8/a;

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

    sget-object v0, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;->$ENTRIES:Lo8/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;
    .registers 2

    const-class v0, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;

    return-object p0
.end method

.method public static values()[Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;
    .registers 1

    sget-object v0, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;->$VALUES:[Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;

    return-object v0
.end method
