.class public final enum LF8/N;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF8/N$a;
    }
.end annotation


# static fields
.field public static final enum q:LF8/N;

.field public static final enum r:LF8/N;

.field public static final enum s:LF8/N;

.field public static final enum t:LF8/N;

.field private static final synthetic u:[LF8/N;

.field private static final synthetic v:Lo8/a;


# direct methods
.method static constructor <clinit>()V
    .registers 3

    new-instance v0, LF8/N;

    const-string v1, "DEFAULT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LF8/N;-><init>(Ljava/lang/String;I)V

    sput-object v0, LF8/N;->q:LF8/N;

    new-instance v0, LF8/N;

    const-string v1, "LAZY"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LF8/N;-><init>(Ljava/lang/String;I)V

    sput-object v0, LF8/N;->r:LF8/N;

    new-instance v0, LF8/N;

    const-string v1, "ATOMIC"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LF8/N;-><init>(Ljava/lang/String;I)V

    sput-object v0, LF8/N;->s:LF8/N;

    new-instance v0, LF8/N;

    const-string v1, "UNDISPATCHED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LF8/N;-><init>(Ljava/lang/String;I)V

    sput-object v0, LF8/N;->t:LF8/N;

    invoke-static {}, LF8/N;->d()[LF8/N;

    move-result-object v0

    sput-object v0, LF8/N;->u:[LF8/N;

    invoke-static {v0}, Lo8/b;->a([Ljava/lang/Enum;)Lo8/a;

    move-result-object v0

    sput-object v0, LF8/N;->v:Lo8/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .registers 3

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic d()[LF8/N;
    .registers 4

    sget-object v0, LF8/N;->q:LF8/N;

    sget-object v1, LF8/N;->r:LF8/N;

    sget-object v2, LF8/N;->s:LF8/N;

    sget-object v3, LF8/N;->t:LF8/N;

    filled-new-array {v0, v1, v2, v3}, [LF8/N;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LF8/N;
    .registers 2

    const-class v0, LF8/N;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LF8/N;

    return-object p0
.end method

.method public static values()[LF8/N;
    .registers 1

    sget-object v0, LF8/N;->u:[LF8/N;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LF8/N;

    return-object v0
.end method


# virtual methods
.method public final e(Lv8/p;Ljava/lang/Object;Lm8/e;)V
    .registers 5

    sget-object v0, LF8/N$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_23

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1f

    const/4 v0, 0x3

    if-eq p0, v0, :cond_1b

    const/4 p1, 0x4

    if-ne p0, p1, :cond_15

    return-void

    :cond_15
    new-instance p0, Lh8/m;

    invoke-direct {p0}, Lh8/m;-><init>()V

    throw p0

    :cond_1b
    invoke-static {p1, p2, p3}, LL8/b;->a(Lv8/p;Ljava/lang/Object;Lm8/e;)V

    return-void

    :cond_1f
    invoke-static {p1, p2, p3}, Lm8/g;->a(Lv8/p;Ljava/lang/Object;Lm8/e;)V

    return-void

    :cond_23
    invoke-static {p1, p2, p3}, LL8/a;->c(Lv8/p;Ljava/lang/Object;Lm8/e;)V

    return-void
.end method

.method public final f()Z
    .registers 2

    sget-object v0, LF8/N;->r:LF8/N;

    if-ne p0, v0, :cond_6

    const/4 p0, 0x1

    return p0

    :cond_6
    const/4 p0, 0x0

    return p0
.end method
