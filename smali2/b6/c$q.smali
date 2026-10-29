.class final enum Lb6/c$q;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb6/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "q"
.end annotation


# static fields
.field public static final enum q:Lb6/c$q;

.field public static final enum r:Lb6/c$q;

.field public static final enum s:Lb6/c$q;

.field public static final enum t:Lb6/c$q;

.field private static final synthetic u:[Lb6/c$q;


# direct methods
.method static constructor <clinit>()V
    .registers 3

    new-instance v0, Lb6/c$q;

    const-string v1, "RESTRUCTURE_BEFORE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lb6/c$q;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lb6/c$q;->q:Lb6/c$q;

    new-instance v0, Lb6/c$q;

    const-string v1, "RESTRUCTURE_AFTER"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lb6/c$q;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lb6/c$q;->r:Lb6/c$q;

    new-instance v0, Lb6/c$q;

    const-string v1, "SKIP_IF_EMPTY"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lb6/c$q;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lb6/c$q;->s:Lb6/c$q;

    new-instance v0, Lb6/c$q;

    const-string v1, "RESIZE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lb6/c$q;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lb6/c$q;->t:Lb6/c$q;

    invoke-static {}, Lb6/c$q;->d()[Lb6/c$q;

    move-result-object v0

    sput-object v0, Lb6/c$q;->u:[Lb6/c$q;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .registers 3

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static synthetic d()[Lb6/c$q;
    .registers 4

    sget-object v0, Lb6/c$q;->q:Lb6/c$q;

    sget-object v1, Lb6/c$q;->r:Lb6/c$q;

    sget-object v2, Lb6/c$q;->s:Lb6/c$q;

    sget-object v3, Lb6/c$q;->t:Lb6/c$q;

    filled-new-array {v0, v1, v2, v3}, [Lb6/c$q;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lb6/c$q;
    .registers 2

    const-class v0, Lb6/c$q;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lb6/c$q;

    return-object p0
.end method

.method public static values()[Lb6/c$q;
    .registers 1

    sget-object v0, Lb6/c$q;->u:[Lb6/c$q;

    invoke-virtual {v0}, [Lb6/c$q;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lb6/c$q;

    return-object v0
.end method
