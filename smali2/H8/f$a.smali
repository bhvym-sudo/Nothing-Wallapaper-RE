.class final synthetic LH8/f$a;
.super Lkotlin/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH8/f;->y()LC8/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# static fields
.field public static final q:LH8/f$a;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, LH8/f$a;

    invoke-direct {v0}, LH8/f$a;-><init>()V

    sput-object v0, LH8/f$a;->q:LH8/f$a;

    return-void
.end method

.method constructor <init>()V
    .registers 7

    const-string v4, "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;"

    const/4 v5, 0x1

    const/4 v1, 0x2

    const-class v2, LH8/f;

    const-string v3, "createSegment"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/l;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final g(JLH8/l;)LH8/l;
    .registers 4

    invoke-static {p1, p2, p3}, LH8/f;->c(JLH8/l;)LH8/l;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 5

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    check-cast p2, LH8/l;

    invoke-virtual {p0, v0, v1, p2}, LH8/f$a;->g(JLH8/l;)LH8/l;

    move-result-object p0

    return-object p0
.end method
