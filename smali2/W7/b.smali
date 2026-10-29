.class public final enum LW7/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum q:LW7/b;

.field public static final enum r:LW7/b;

.field public static final enum s:LW7/b;

.field private static final synthetic t:[LW7/b;

.field private static final synthetic u:Lo8/a;


# direct methods
.method static constructor <clinit>()V
    .registers 3

    new-instance v0, LW7/b;

    const-string v1, "Normal"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LW7/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LW7/b;->q:LW7/b;

    new-instance v0, LW7/b;

    const-string v1, "Warning"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LW7/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LW7/b;->r:LW7/b;

    new-instance v0, LW7/b;

    const-string v1, "Prioritised"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LW7/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LW7/b;->s:LW7/b;

    invoke-static {}, LW7/b;->d()[LW7/b;

    move-result-object v0

    sput-object v0, LW7/b;->t:[LW7/b;

    invoke-static {v0}, Lo8/b;->a([Ljava/lang/Enum;)Lo8/a;

    move-result-object v0

    sput-object v0, LW7/b;->u:Lo8/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .registers 3

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic d()[LW7/b;
    .registers 3

    sget-object v0, LW7/b;->q:LW7/b;

    sget-object v1, LW7/b;->r:LW7/b;

    sget-object v2, LW7/b;->s:LW7/b;

    filled-new-array {v0, v1, v2}, [LW7/b;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LW7/b;
    .registers 2

    const-class v0, LW7/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LW7/b;

    return-object p0
.end method

.method public static values()[LW7/b;
    .registers 1

    sget-object v0, LW7/b;->t:[LW7/b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LW7/b;

    return-object v0
.end method
