.class public final enum Lh8/l;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum q:Lh8/l;

.field public static final enum r:Lh8/l;

.field public static final enum s:Lh8/l;

.field private static final synthetic t:[Lh8/l;

.field private static final synthetic u:Lo8/a;


# direct methods
.method static constructor <clinit>()V
    .registers 3

    new-instance v0, Lh8/l;

    const-string v1, "SYNCHRONIZED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lh8/l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lh8/l;->q:Lh8/l;

    new-instance v0, Lh8/l;

    const-string v1, "PUBLICATION"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lh8/l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lh8/l;->r:Lh8/l;

    new-instance v0, Lh8/l;

    const-string v1, "NONE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lh8/l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lh8/l;->s:Lh8/l;

    invoke-static {}, Lh8/l;->d()[Lh8/l;

    move-result-object v0

    sput-object v0, Lh8/l;->t:[Lh8/l;

    invoke-static {v0}, Lo8/b;->a([Ljava/lang/Enum;)Lo8/a;

    move-result-object v0

    sput-object v0, Lh8/l;->u:Lo8/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .registers 3

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic d()[Lh8/l;
    .registers 3

    sget-object v0, Lh8/l;->q:Lh8/l;

    sget-object v1, Lh8/l;->r:Lh8/l;

    sget-object v2, Lh8/l;->s:Lh8/l;

    filled-new-array {v0, v1, v2}, [Lh8/l;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lh8/l;
    .registers 2

    const-class v0, Lh8/l;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lh8/l;

    return-object p0
.end method

.method public static values()[Lh8/l;
    .registers 1

    sget-object v0, Lh8/l;->t:[Lh8/l;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lh8/l;

    return-object v0
.end method
