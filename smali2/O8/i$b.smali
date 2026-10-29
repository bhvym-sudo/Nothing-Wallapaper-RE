.class final synthetic LO8/i$b;
.super Lkotlin/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LO8/i;->s()Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# static fields
.field public static final q:LO8/i$b;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, LO8/i$b;

    invoke-direct {v0}, LO8/i$b;-><init>()V

    sput-object v0, LO8/i$b;->q:LO8/i$b;

    return-void
.end method

.method constructor <init>()V
    .registers 7

    const-string v4, "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;"

    const/4 v5, 0x1

    const/4 v1, 0x2

    const-class v2, LO8/j;

    const-string v3, "createSegment"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/l;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final g(JLO8/k;)LO8/k;
    .registers 4

    invoke-static {p1, p2, p3}, LO8/j;->a(JLO8/k;)LO8/k;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 5

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    check-cast p2, LO8/k;

    invoke-virtual {p0, v0, v1, p2}, LO8/i$b;->g(JLO8/k;)LO8/k;

    move-result-object p0

    return-object p0
.end method
