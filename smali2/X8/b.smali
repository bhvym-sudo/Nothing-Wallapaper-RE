.class public final enum LX8/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LX8/b$a;
    }
.end annotation


# static fields
.field public static final enum A:LX8/b;

.field public static final enum B:LX8/b;

.field public static final enum C:LX8/b;

.field public static final enum D:LX8/b;

.field public static final enum E:LX8/b;

.field public static final enum F:LX8/b;

.field private static final synthetic G:[LX8/b;

.field public static final r:LX8/b$a;

.field public static final enum s:LX8/b;

.field public static final enum t:LX8/b;

.field public static final enum u:LX8/b;

.field public static final enum v:LX8/b;

.field public static final enum w:LX8/b;

.field public static final enum x:LX8/b;

.field public static final enum y:LX8/b;

.field public static final enum z:LX8/b;


# instance fields
.field private final q:I


# direct methods
.method static constructor <clinit>()V
    .registers 3

    new-instance v0, LX8/b;

    const-string v1, "NO_ERROR"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, LX8/b;-><init>(Ljava/lang/String;II)V

    sput-object v0, LX8/b;->s:LX8/b;

    new-instance v0, LX8/b;

    const-string v1, "PROTOCOL_ERROR"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, LX8/b;-><init>(Ljava/lang/String;II)V

    sput-object v0, LX8/b;->t:LX8/b;

    new-instance v0, LX8/b;

    const-string v1, "INTERNAL_ERROR"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, LX8/b;-><init>(Ljava/lang/String;II)V

    sput-object v0, LX8/b;->u:LX8/b;

    new-instance v0, LX8/b;

    const-string v1, "FLOW_CONTROL_ERROR"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v2}, LX8/b;-><init>(Ljava/lang/String;II)V

    sput-object v0, LX8/b;->v:LX8/b;

    new-instance v0, LX8/b;

    const-string v1, "SETTINGS_TIMEOUT"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2, v2}, LX8/b;-><init>(Ljava/lang/String;II)V

    sput-object v0, LX8/b;->w:LX8/b;

    new-instance v0, LX8/b;

    const-string v1, "STREAM_CLOSED"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2, v2}, LX8/b;-><init>(Ljava/lang/String;II)V

    sput-object v0, LX8/b;->x:LX8/b;

    new-instance v0, LX8/b;

    const-string v1, "FRAME_SIZE_ERROR"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2, v2}, LX8/b;-><init>(Ljava/lang/String;II)V

    sput-object v0, LX8/b;->y:LX8/b;

    new-instance v0, LX8/b;

    const-string v1, "REFUSED_STREAM"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2, v2}, LX8/b;-><init>(Ljava/lang/String;II)V

    sput-object v0, LX8/b;->z:LX8/b;

    new-instance v0, LX8/b;

    const-string v1, "CANCEL"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2, v2}, LX8/b;-><init>(Ljava/lang/String;II)V

    sput-object v0, LX8/b;->A:LX8/b;

    new-instance v0, LX8/b;

    const-string v1, "COMPRESSION_ERROR"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2, v2}, LX8/b;-><init>(Ljava/lang/String;II)V

    sput-object v0, LX8/b;->B:LX8/b;

    new-instance v0, LX8/b;

    const-string v1, "CONNECT_ERROR"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2, v2}, LX8/b;-><init>(Ljava/lang/String;II)V

    sput-object v0, LX8/b;->C:LX8/b;

    new-instance v0, LX8/b;

    const-string v1, "ENHANCE_YOUR_CALM"

    const/16 v2, 0xb

    invoke-direct {v0, v1, v2, v2}, LX8/b;-><init>(Ljava/lang/String;II)V

    sput-object v0, LX8/b;->D:LX8/b;

    new-instance v0, LX8/b;

    const-string v1, "INADEQUATE_SECURITY"

    const/16 v2, 0xc

    invoke-direct {v0, v1, v2, v2}, LX8/b;-><init>(Ljava/lang/String;II)V

    sput-object v0, LX8/b;->E:LX8/b;

    new-instance v0, LX8/b;

    const-string v1, "HTTP_1_1_REQUIRED"

    const/16 v2, 0xd

    invoke-direct {v0, v1, v2, v2}, LX8/b;-><init>(Ljava/lang/String;II)V

    sput-object v0, LX8/b;->F:LX8/b;

    invoke-static {}, LX8/b;->d()[LX8/b;

    move-result-object v0

    sput-object v0, LX8/b;->G:[LX8/b;

    new-instance v0, LX8/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LX8/b$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LX8/b;->r:LX8/b$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .registers 4

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, LX8/b;->q:I

    return-void
.end method

.method private static final synthetic d()[LX8/b;
    .registers 14

    sget-object v0, LX8/b;->s:LX8/b;

    sget-object v1, LX8/b;->t:LX8/b;

    sget-object v2, LX8/b;->u:LX8/b;

    sget-object v3, LX8/b;->v:LX8/b;

    sget-object v4, LX8/b;->w:LX8/b;

    sget-object v5, LX8/b;->x:LX8/b;

    sget-object v6, LX8/b;->y:LX8/b;

    sget-object v7, LX8/b;->z:LX8/b;

    sget-object v8, LX8/b;->A:LX8/b;

    sget-object v9, LX8/b;->B:LX8/b;

    sget-object v10, LX8/b;->C:LX8/b;

    sget-object v11, LX8/b;->D:LX8/b;

    sget-object v12, LX8/b;->E:LX8/b;

    sget-object v13, LX8/b;->F:LX8/b;

    filled-new-array/range {v0 .. v13}, [LX8/b;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LX8/b;
    .registers 2

    const-class v0, LX8/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LX8/b;

    return-object p0
.end method

.method public static values()[LX8/b;
    .registers 1

    sget-object v0, LX8/b;->G:[LX8/b;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LX8/b;

    return-object v0
.end method


# virtual methods
.method public final e()I
    .registers 1

    iget p0, p0, LX8/b;->q:I

    return p0
.end method
