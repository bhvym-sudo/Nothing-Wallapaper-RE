.class public final enum Ln8/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum q:Ln8/a;

.field public static final enum r:Ln8/a;

.field public static final enum s:Ln8/a;

.field private static final synthetic t:[Ln8/a;

.field private static final synthetic u:Lo8/a;


# direct methods
.method static constructor <clinit>()V
    .registers 3

    new-instance v0, Ln8/a;

    const-string v1, "COROUTINE_SUSPENDED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ln8/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln8/a;->q:Ln8/a;

    new-instance v0, Ln8/a;

    const-string v1, "UNDECIDED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ln8/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln8/a;->r:Ln8/a;

    new-instance v0, Ln8/a;

    const-string v1, "RESUMED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ln8/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln8/a;->s:Ln8/a;

    invoke-static {}, Ln8/a;->d()[Ln8/a;

    move-result-object v0

    sput-object v0, Ln8/a;->t:[Ln8/a;

    invoke-static {v0}, Lo8/b;->a([Ljava/lang/Enum;)Lo8/a;

    move-result-object v0

    sput-object v0, Ln8/a;->u:Lo8/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .registers 3

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic d()[Ln8/a;
    .registers 3

    sget-object v0, Ln8/a;->q:Ln8/a;

    sget-object v1, Ln8/a;->r:Ln8/a;

    sget-object v2, Ln8/a;->s:Ln8/a;

    filled-new-array {v0, v1, v2}, [Ln8/a;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ln8/a;
    .registers 2

    const-class v0, Ln8/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ln8/a;

    return-object p0
.end method

.method public static values()[Ln8/a;
    .registers 1

    sget-object v0, Ln8/a;->t:[Ln8/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ln8/a;

    return-object v0
.end method
