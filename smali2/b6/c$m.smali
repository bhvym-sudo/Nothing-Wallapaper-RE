.class public final enum Lb6/c$m;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb6/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401c
    name = "m"
.end annotation


# static fields
.field public static final enum q:Lb6/c$m;

.field public static final enum r:Lb6/c$m;

.field private static final synthetic s:[Lb6/c$m;


# direct methods
.method static constructor <clinit>()V
    .registers 3

    new-instance v0, Lb6/c$m;

    const-string v1, "WHEN_NECESSARY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lb6/c$m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lb6/c$m;->q:Lb6/c$m;

    new-instance v0, Lb6/c$m;

    const-string v1, "NEVER"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lb6/c$m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lb6/c$m;->r:Lb6/c$m;

    invoke-static {}, Lb6/c$m;->d()[Lb6/c$m;

    move-result-object v0

    sput-object v0, Lb6/c$m;->s:[Lb6/c$m;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .registers 3

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static synthetic d()[Lb6/c$m;
    .registers 2

    sget-object v0, Lb6/c$m;->q:Lb6/c$m;

    sget-object v1, Lb6/c$m;->r:Lb6/c$m;

    filled-new-array {v0, v1}, [Lb6/c$m;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lb6/c$m;
    .registers 2

    const-class v0, Lb6/c$m;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lb6/c$m;

    return-object p0
.end method

.method public static values()[Lb6/c$m;
    .registers 1

    sget-object v0, Lb6/c$m;->s:[Lb6/c$m;

    invoke-virtual {v0}, [Lb6/c$m;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lb6/c$m;

    return-object v0
.end method
