.class public final enum LP8/A;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LP8/A$a;
    }
.end annotation


# static fields
.field public static final r:LP8/A$a;

.field public static final enum s:LP8/A;

.field public static final enum t:LP8/A;

.field public static final enum u:LP8/A;

.field public static final enum v:LP8/A;

.field public static final enum w:LP8/A;

.field public static final enum x:LP8/A;

.field private static final synthetic y:[LP8/A;


# instance fields
.field private final q:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .registers 4

    new-instance v0, LP8/A;

    const/4 v1, 0x0

    const-string v2, "http/1.0"

    const-string v3, "HTTP_1_0"

    invoke-direct {v0, v3, v1, v2}, LP8/A;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LP8/A;->s:LP8/A;

    new-instance v0, LP8/A;

    const/4 v1, 0x1

    const-string v2, "http/1.1"

    const-string v3, "HTTP_1_1"

    invoke-direct {v0, v3, v1, v2}, LP8/A;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LP8/A;->t:LP8/A;

    new-instance v0, LP8/A;

    const/4 v1, 0x2

    const-string v2, "spdy/3.1"

    const-string v3, "SPDY_3"

    invoke-direct {v0, v3, v1, v2}, LP8/A;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LP8/A;->u:LP8/A;

    new-instance v0, LP8/A;

    const/4 v1, 0x3

    const-string v2, "h2"

    const-string v3, "HTTP_2"

    invoke-direct {v0, v3, v1, v2}, LP8/A;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LP8/A;->v:LP8/A;

    new-instance v0, LP8/A;

    const/4 v1, 0x4

    const-string v2, "h2_prior_knowledge"

    const-string v3, "H2_PRIOR_KNOWLEDGE"

    invoke-direct {v0, v3, v1, v2}, LP8/A;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LP8/A;->w:LP8/A;

    new-instance v0, LP8/A;

    const/4 v1, 0x5

    const-string v2, "quic"

    const-string v3, "QUIC"

    invoke-direct {v0, v3, v1, v2}, LP8/A;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LP8/A;->x:LP8/A;

    invoke-static {}, LP8/A;->d()[LP8/A;

    move-result-object v0

    sput-object v0, LP8/A;->y:[LP8/A;

    new-instance v0, LP8/A$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LP8/A$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LP8/A;->r:LP8/A$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .registers 4

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, LP8/A;->q:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic d()[LP8/A;
    .registers 6

    sget-object v0, LP8/A;->s:LP8/A;

    sget-object v1, LP8/A;->t:LP8/A;

    sget-object v2, LP8/A;->u:LP8/A;

    sget-object v3, LP8/A;->v:LP8/A;

    sget-object v4, LP8/A;->w:LP8/A;

    sget-object v5, LP8/A;->x:LP8/A;

    filled-new-array/range {v0 .. v5}, [LP8/A;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic e(LP8/A;)Ljava/lang/String;
    .registers 1

    iget-object p0, p0, LP8/A;->q:Ljava/lang/String;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)LP8/A;
    .registers 2

    const-class v0, LP8/A;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LP8/A;

    return-object p0
.end method

.method public static values()[LP8/A;
    .registers 1

    sget-object v0, LP8/A;->y:[LP8/A;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LP8/A;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, LP8/A;->q:Ljava/lang/String;

    return-object p0
.end method
