.class public final enum LA7/f;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum q:LA7/f;

.field public static final enum r:LA7/f;

.field public static final enum s:LA7/f;

.field private static final synthetic t:[LA7/f;

.field private static final synthetic u:Lo8/a;


# direct methods
.method static constructor <clinit>()V
    .registers 3

    new-instance v0, LA7/f;

    const-string v1, "SWITCH"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LA7/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, LA7/f;->q:LA7/f;

    new-instance v0, LA7/f;

    const-string v1, "SIZE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LA7/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, LA7/f;->r:LA7/f;

    new-instance v0, LA7/f;

    const-string v1, "ALIGN"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LA7/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, LA7/f;->s:LA7/f;

    invoke-static {}, LA7/f;->d()[LA7/f;

    move-result-object v0

    sput-object v0, LA7/f;->t:[LA7/f;

    invoke-static {v0}, Lo8/b;->a([Ljava/lang/Enum;)Lo8/a;

    move-result-object v0

    sput-object v0, LA7/f;->u:Lo8/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .registers 3

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic d()[LA7/f;
    .registers 3

    sget-object v0, LA7/f;->q:LA7/f;

    sget-object v1, LA7/f;->r:LA7/f;

    sget-object v2, LA7/f;->s:LA7/f;

    filled-new-array {v0, v1, v2}, [LA7/f;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LA7/f;
    .registers 2

    const-class v0, LA7/f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LA7/f;

    return-object p0
.end method

.method public static values()[LA7/f;
    .registers 1

    sget-object v0, LA7/f;->t:[LA7/f;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LA7/f;

    return-object v0
.end method
