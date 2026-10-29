.class public final enum LP8/G;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LP8/G$a;
    }
.end annotation


# static fields
.field public static final r:LP8/G$a;

.field public static final enum s:LP8/G;

.field public static final enum t:LP8/G;

.field public static final enum u:LP8/G;

.field public static final enum v:LP8/G;

.field public static final enum w:LP8/G;

.field private static final synthetic x:[LP8/G;


# instance fields
.field private final q:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .registers 4

    new-instance v0, LP8/G;

    const/4 v1, 0x0

    const-string v2, "TLSv1.3"

    const-string v3, "TLS_1_3"

    invoke-direct {v0, v3, v1, v2}, LP8/G;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LP8/G;->s:LP8/G;

    new-instance v0, LP8/G;

    const/4 v1, 0x1

    const-string v2, "TLSv1.2"

    const-string v3, "TLS_1_2"

    invoke-direct {v0, v3, v1, v2}, LP8/G;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LP8/G;->t:LP8/G;

    new-instance v0, LP8/G;

    const/4 v1, 0x2

    const-string v2, "TLSv1.1"

    const-string v3, "TLS_1_1"

    invoke-direct {v0, v3, v1, v2}, LP8/G;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LP8/G;->u:LP8/G;

    new-instance v0, LP8/G;

    const/4 v1, 0x3

    const-string v2, "TLSv1"

    const-string v3, "TLS_1_0"

    invoke-direct {v0, v3, v1, v2}, LP8/G;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LP8/G;->v:LP8/G;

    new-instance v0, LP8/G;

    const/4 v1, 0x4

    const-string v2, "SSLv3"

    const-string v3, "SSL_3_0"

    invoke-direct {v0, v3, v1, v2}, LP8/G;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LP8/G;->w:LP8/G;

    invoke-static {}, LP8/G;->d()[LP8/G;

    move-result-object v0

    sput-object v0, LP8/G;->x:[LP8/G;

    new-instance v0, LP8/G$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LP8/G$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LP8/G;->r:LP8/G$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .registers 4

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, LP8/G;->q:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic d()[LP8/G;
    .registers 5

    sget-object v0, LP8/G;->s:LP8/G;

    sget-object v1, LP8/G;->t:LP8/G;

    sget-object v2, LP8/G;->u:LP8/G;

    sget-object v3, LP8/G;->v:LP8/G;

    sget-object v4, LP8/G;->w:LP8/G;

    filled-new-array {v0, v1, v2, v3, v4}, [LP8/G;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LP8/G;
    .registers 2

    const-class v0, LP8/G;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LP8/G;

    return-object p0
.end method

.method public static values()[LP8/G;
    .registers 1

    sget-object v0, LP8/G;->x:[LP8/G;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LP8/G;

    return-object v0
.end method


# virtual methods
.method public final e()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, LP8/G;->q:Ljava/lang/String;

    return-object p0
.end method
