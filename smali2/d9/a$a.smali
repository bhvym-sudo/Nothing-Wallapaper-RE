.class public final enum Ld9/a$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld9/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field public static final enum q:Ld9/a$a;

.field public static final enum r:Ld9/a$a;

.field public static final enum s:Ld9/a$a;

.field public static final enum t:Ld9/a$a;

.field private static final synthetic u:[Ld9/a$a;


# direct methods
.method static constructor <clinit>()V
    .registers 3

    new-instance v0, Ld9/a$a;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ld9/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ld9/a$a;->q:Ld9/a$a;

    new-instance v0, Ld9/a$a;

    const-string v1, "BASIC"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ld9/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ld9/a$a;->r:Ld9/a$a;

    new-instance v0, Ld9/a$a;

    const-string v1, "HEADERS"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ld9/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ld9/a$a;->s:Ld9/a$a;

    new-instance v0, Ld9/a$a;

    const-string v1, "BODY"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Ld9/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ld9/a$a;->t:Ld9/a$a;

    invoke-static {}, Ld9/a$a;->d()[Ld9/a$a;

    move-result-object v0

    sput-object v0, Ld9/a$a;->u:[Ld9/a$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .registers 3

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic d()[Ld9/a$a;
    .registers 4

    sget-object v0, Ld9/a$a;->q:Ld9/a$a;

    sget-object v1, Ld9/a$a;->r:Ld9/a$a;

    sget-object v2, Ld9/a$a;->s:Ld9/a$a;

    sget-object v3, Ld9/a$a;->t:Ld9/a$a;

    filled-new-array {v0, v1, v2, v3}, [Ld9/a$a;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ld9/a$a;
    .registers 2

    const-class v0, Ld9/a$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ld9/a$a;

    return-object p0
.end method

.method public static values()[Ld9/a$a;
    .registers 1

    sget-object v0, Ld9/a$a;->u:[Ld9/a$a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ld9/a$a;

    return-object v0
.end method
