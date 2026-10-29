.class public final enum Lh8/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum q:Lh8/b;

.field public static final enum r:Lh8/b;

.field public static final enum s:Lh8/b;

.field private static final synthetic t:[Lh8/b;

.field private static final synthetic u:Lo8/a;


# direct methods
.method static constructor <clinit>()V
    .registers 3

    new-instance v0, Lh8/b;

    const-string v1, "WARNING"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lh8/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lh8/b;->q:Lh8/b;

    new-instance v0, Lh8/b;

    const-string v1, "ERROR"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lh8/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lh8/b;->r:Lh8/b;

    new-instance v0, Lh8/b;

    const-string v1, "HIDDEN"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lh8/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lh8/b;->s:Lh8/b;

    invoke-static {}, Lh8/b;->d()[Lh8/b;

    move-result-object v0

    sput-object v0, Lh8/b;->t:[Lh8/b;

    invoke-static {v0}, Lo8/b;->a([Ljava/lang/Enum;)Lo8/a;

    move-result-object v0

    sput-object v0, Lh8/b;->u:Lo8/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .registers 3

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic d()[Lh8/b;
    .registers 3

    sget-object v0, Lh8/b;->q:Lh8/b;

    sget-object v1, Lh8/b;->r:Lh8/b;

    sget-object v2, Lh8/b;->s:Lh8/b;

    filled-new-array {v0, v1, v2}, [Lh8/b;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lh8/b;
    .registers 2

    const-class v0, Lh8/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lh8/b;

    return-object p0
.end method

.method public static values()[Lh8/b;
    .registers 1

    sget-object v0, Lh8/b;->t:[Lh8/b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lh8/b;

    return-object v0
.end method
