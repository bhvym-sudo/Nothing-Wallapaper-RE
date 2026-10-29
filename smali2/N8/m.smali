.class public final enum LN8/m;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum q:LN8/m;

.field public static final enum r:LN8/m;

.field public static final enum s:LN8/m;

.field public static final enum t:LN8/m;

.field private static final synthetic u:[LN8/m;

.field private static final synthetic v:Lo8/a;


# direct methods
.method static constructor <clinit>()V
    .registers 3

    new-instance v0, LN8/m;

    const-string v1, "SUCCESSFUL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LN8/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, LN8/m;->q:LN8/m;

    new-instance v0, LN8/m;

    const-string v1, "REREGISTER"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LN8/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, LN8/m;->r:LN8/m;

    new-instance v0, LN8/m;

    const-string v1, "CANCELLED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LN8/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, LN8/m;->s:LN8/m;

    new-instance v0, LN8/m;

    const-string v1, "ALREADY_SELECTED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LN8/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, LN8/m;->t:LN8/m;

    invoke-static {}, LN8/m;->d()[LN8/m;

    move-result-object v0

    sput-object v0, LN8/m;->u:[LN8/m;

    invoke-static {v0}, Lo8/b;->a([Ljava/lang/Enum;)Lo8/a;

    move-result-object v0

    sput-object v0, LN8/m;->v:Lo8/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .registers 3

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic d()[LN8/m;
    .registers 4

    sget-object v0, LN8/m;->q:LN8/m;

    sget-object v1, LN8/m;->r:LN8/m;

    sget-object v2, LN8/m;->s:LN8/m;

    sget-object v3, LN8/m;->t:LN8/m;

    filled-new-array {v0, v1, v2, v3}, [LN8/m;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LN8/m;
    .registers 2

    const-class v0, LN8/m;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LN8/m;

    return-object p0
.end method

.method public static values()[LN8/m;
    .registers 1

    sget-object v0, LN8/m;->u:[LN8/m;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LN8/m;

    return-object v0
.end method
