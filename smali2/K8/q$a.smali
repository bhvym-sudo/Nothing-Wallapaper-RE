.class public final LK8/q$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LK8/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .registers 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/h;)V
    .registers 2

    .line 1
    invoke-direct {p0}, LK8/q$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(J)I
    .registers 5

    const-wide/high16 v0, 0x2000000000000000L

    and-long p0, p1, v0

    const-wide/16 v0, 0x0

    cmp-long p0, p0, v0

    if-eqz p0, :cond_c

    const/4 p0, 0x2

    return p0

    :cond_c
    const/4 p0, 0x1

    return p0
.end method

.method public final b(JI)J
    .registers 6

    const-wide/32 v0, 0x3fffffff

    invoke-virtual {p0, p1, p2, v0, v1}, LK8/q$a;->d(JJ)J

    move-result-wide p0

    int-to-long p2, p3

    or-long/2addr p0, p2

    return-wide p0
.end method

.method public final c(JI)J
    .registers 6

    const-wide v0, 0xfffffffc0000000L

    invoke-virtual {p0, p1, p2, v0, v1}, LK8/q$a;->d(JJ)J

    move-result-wide p0

    int-to-long p2, p3

    const/16 v0, 0x1e

    shl-long/2addr p2, v0

    or-long/2addr p0, p2

    return-wide p0
.end method

.method public final d(JJ)J
    .registers 5

    not-long p3, p3

    and-long p0, p1, p3

    return-wide p0
.end method
