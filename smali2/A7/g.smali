.class public final enum LA7/g;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum q:LA7/g;

.field public static final enum r:LA7/g;

.field private static final synthetic s:[LA7/g;

.field private static final synthetic t:Lo8/a;


# direct methods
.method static constructor <clinit>()V
    .registers 3

    new-instance v0, LA7/g;

    const-string v1, "ON"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LA7/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, LA7/g;->q:LA7/g;

    new-instance v0, LA7/g;

    const-string v1, "OFF"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LA7/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, LA7/g;->r:LA7/g;

    invoke-static {}, LA7/g;->d()[LA7/g;

    move-result-object v0

    sput-object v0, LA7/g;->s:[LA7/g;

    invoke-static {v0}, Lo8/b;->a([Ljava/lang/Enum;)Lo8/a;

    move-result-object v0

    sput-object v0, LA7/g;->t:Lo8/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .registers 3

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic d()[LA7/g;
    .registers 2

    sget-object v0, LA7/g;->q:LA7/g;

    sget-object v1, LA7/g;->r:LA7/g;

    filled-new-array {v0, v1}, [LA7/g;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LA7/g;
    .registers 2

    const-class v0, LA7/g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LA7/g;

    return-object p0
.end method

.method public static values()[LA7/g;
    .registers 1

    sget-object v0, LA7/g;->s:[LA7/g;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LA7/g;

    return-object v0
.end method
