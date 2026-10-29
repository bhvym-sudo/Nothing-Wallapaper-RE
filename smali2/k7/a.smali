.class public final enum Lk7/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum q:Lk7/a;

.field public static final enum r:Lk7/a;

.field private static final synthetic s:[Lk7/a;

.field private static final synthetic t:Lo8/a;


# direct methods
.method static constructor <clinit>()V
    .registers 3

    new-instance v0, Lk7/a;

    const-string v1, "Glass"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lk7/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lk7/a;->q:Lk7/a;

    new-instance v0, Lk7/a;

    const-string v1, "Blur"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lk7/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lk7/a;->r:Lk7/a;

    invoke-static {}, Lk7/a;->d()[Lk7/a;

    move-result-object v0

    sput-object v0, Lk7/a;->s:[Lk7/a;

    invoke-static {v0}, Lo8/b;->a([Ljava/lang/Enum;)Lo8/a;

    move-result-object v0

    sput-object v0, Lk7/a;->t:Lo8/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .registers 3

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic d()[Lk7/a;
    .registers 2

    sget-object v0, Lk7/a;->q:Lk7/a;

    sget-object v1, Lk7/a;->r:Lk7/a;

    filled-new-array {v0, v1}, [Lk7/a;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lk7/a;
    .registers 2

    const-class v0, Lk7/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lk7/a;

    return-object p0
.end method

.method public static values()[Lk7/a;
    .registers 1

    sget-object v0, Lk7/a;->s:[Lk7/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lk7/a;

    return-object v0
.end method
