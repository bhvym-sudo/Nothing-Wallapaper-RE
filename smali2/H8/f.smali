.class public abstract LH8/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LH8/l;

.field public static final b:I

.field private static final c:I

.field public static final d:LK8/D;

.field private static final e:LK8/D;

.field private static final f:LK8/D;

.field private static final g:LK8/D;

.field private static final h:LK8/D;

.field private static final i:LK8/D;

.field private static final j:LK8/D;

.field private static final k:LK8/D;

.field private static final l:LK8/D;

.field private static final m:LK8/D;

.field private static final n:LK8/D;

.field private static final o:LK8/D;

.field private static final p:LK8/D;

.field private static final q:LK8/D;

.field private static final r:LK8/D;

.field private static final s:LK8/D;


# direct methods
.method static constructor <clinit>()V
    .registers 7

    new-instance v0, LH8/l;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-wide/16 v1, -0x1

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, LH8/l;-><init>(JLH8/l;LH8/e;I)V

    sput-object v0, LH8/f;->a:LH8/l;

    const/16 v5, 0xc

    const/4 v6, 0x0

    const-string v1, "kotlinx.coroutines.bufferedChannel.segmentSize"

    const/16 v2, 0x20

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, LK8/E;->g(Ljava/lang/String;IIIILjava/lang/Object;)I

    move-result v0

    sput v0, LH8/f;->b:I

    const-string v1, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations"

    const/16 v2, 0x2710

    invoke-static/range {v1 .. v6}, LK8/E;->g(Ljava/lang/String;IIIILjava/lang/Object;)I

    move-result v0

    sput v0, LH8/f;->c:I

    new-instance v0, LK8/D;

    const-string v1, "BUFFERED"

    invoke-direct {v0, v1}, LK8/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LH8/f;->d:LK8/D;

    new-instance v0, LK8/D;

    const-string v1, "SHOULD_BUFFER"

    invoke-direct {v0, v1}, LK8/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LH8/f;->e:LK8/D;

    new-instance v0, LK8/D;

    const-string v1, "S_RESUMING_BY_RCV"

    invoke-direct {v0, v1}, LK8/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LH8/f;->f:LK8/D;

    new-instance v0, LK8/D;

    const-string v1, "RESUMING_BY_EB"

    invoke-direct {v0, v1}, LK8/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LH8/f;->g:LK8/D;

    new-instance v0, LK8/D;

    const-string v1, "POISONED"

    invoke-direct {v0, v1}, LK8/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LH8/f;->h:LK8/D;

    new-instance v0, LK8/D;

    const-string v1, "DONE_RCV"

    invoke-direct {v0, v1}, LK8/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LH8/f;->i:LK8/D;

    new-instance v0, LK8/D;

    const-string v1, "INTERRUPTED_SEND"

    invoke-direct {v0, v1}, LK8/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LH8/f;->j:LK8/D;

    new-instance v0, LK8/D;

    const-string v1, "INTERRUPTED_RCV"

    invoke-direct {v0, v1}, LK8/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LH8/f;->k:LK8/D;

    new-instance v0, LK8/D;

    const-string v1, "CHANNEL_CLOSED"

    invoke-direct {v0, v1}, LK8/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LH8/f;->l:LK8/D;

    new-instance v0, LK8/D;

    const-string v1, "SUSPEND"

    invoke-direct {v0, v1}, LK8/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LH8/f;->m:LK8/D;

    new-instance v0, LK8/D;

    const-string v1, "SUSPEND_NO_WAITER"

    invoke-direct {v0, v1}, LK8/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LH8/f;->n:LK8/D;

    new-instance v0, LK8/D;

    const-string v1, "FAILED"

    invoke-direct {v0, v1}, LK8/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LH8/f;->o:LK8/D;

    new-instance v0, LK8/D;

    const-string v1, "NO_RECEIVE_RESULT"

    invoke-direct {v0, v1}, LK8/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LH8/f;->p:LK8/D;

    new-instance v0, LK8/D;

    const-string v1, "CLOSE_HANDLER_CLOSED"

    invoke-direct {v0, v1}, LK8/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LH8/f;->q:LK8/D;

    new-instance v0, LK8/D;

    const-string v1, "CLOSE_HANDLER_INVOKED"

    invoke-direct {v0, v1}, LK8/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LH8/f;->r:LK8/D;

    new-instance v0, LK8/D;

    const-string v1, "NO_CLOSE_CAUSE"

    invoke-direct {v0, v1}, LK8/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LH8/f;->s:LK8/D;

    return-void
.end method

.method private static final A(I)J
    .registers 3

    if-eqz p0, :cond_f

    const v0, 0x7fffffff

    if-eq p0, v0, :cond_9

    int-to-long v0, p0

    return-wide v0

    :cond_9
    const-wide v0, 0x7fffffffffffffffL

    return-wide v0

    :cond_f
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method private static final B(LF8/l;Ljava/lang/Object;Lv8/q;)Z
    .registers 4

    const/4 v0, 0x0

    invoke-interface {p0, p1, v0, p2}, LF8/l;->r(Ljava/lang/Object;Ljava/lang/Object;Lv8/q;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_c

    invoke-interface {p0, p1}, LF8/l;->t(Ljava/lang/Object;)V

    const/4 p0, 0x1

    return p0

    :cond_c
    const/4 p0, 0x0

    return p0
.end method

.method static synthetic C(LF8/l;Ljava/lang/Object;Lv8/q;ILjava/lang/Object;)Z
    .registers 5

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_5

    const/4 p2, 0x0

    :cond_5
    invoke-static {p0, p1, p2}, LH8/f;->B(LF8/l;Ljava/lang/Object;Lv8/q;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic a(JZ)J
    .registers 3

    invoke-static {p0, p1, p2}, LH8/f;->v(JZ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final synthetic b(JI)J
    .registers 3

    invoke-static {p0, p1, p2}, LH8/f;->w(JI)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final synthetic c(JLH8/l;)LH8/l;
    .registers 3

    invoke-static {p0, p1, p2}, LH8/f;->x(JLH8/l;)LH8/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d()LK8/D;
    .registers 1

    sget-object v0, LH8/f;->q:LK8/D;

    return-object v0
.end method

.method public static final synthetic e()LK8/D;
    .registers 1

    sget-object v0, LH8/f;->r:LK8/D;

    return-object v0
.end method

.method public static final synthetic f()LK8/D;
    .registers 1

    sget-object v0, LH8/f;->i:LK8/D;

    return-object v0
.end method

.method public static final synthetic g()I
    .registers 1

    sget v0, LH8/f;->c:I

    return v0
.end method

.method public static final synthetic h()LK8/D;
    .registers 1

    sget-object v0, LH8/f;->o:LK8/D;

    return-object v0
.end method

.method public static final synthetic i()LK8/D;
    .registers 1

    sget-object v0, LH8/f;->k:LK8/D;

    return-object v0
.end method

.method public static final synthetic j()LK8/D;
    .registers 1

    sget-object v0, LH8/f;->j:LK8/D;

    return-object v0
.end method

.method public static final synthetic k()LK8/D;
    .registers 1

    sget-object v0, LH8/f;->e:LK8/D;

    return-object v0
.end method

.method public static final synthetic l()LK8/D;
    .registers 1

    sget-object v0, LH8/f;->s:LK8/D;

    return-object v0
.end method

.method public static final synthetic m()LK8/D;
    .registers 1

    sget-object v0, LH8/f;->p:LK8/D;

    return-object v0
.end method

.method public static final synthetic n()LH8/l;
    .registers 1

    sget-object v0, LH8/f;->a:LH8/l;

    return-object v0
.end method

.method public static final synthetic o()LK8/D;
    .registers 1

    sget-object v0, LH8/f;->h:LK8/D;

    return-object v0
.end method

.method public static final synthetic p()LK8/D;
    .registers 1

    sget-object v0, LH8/f;->g:LK8/D;

    return-object v0
.end method

.method public static final synthetic q()LK8/D;
    .registers 1

    sget-object v0, LH8/f;->f:LK8/D;

    return-object v0
.end method

.method public static final synthetic r()LK8/D;
    .registers 1

    sget-object v0, LH8/f;->m:LK8/D;

    return-object v0
.end method

.method public static final synthetic s()LK8/D;
    .registers 1

    sget-object v0, LH8/f;->n:LK8/D;

    return-object v0
.end method

.method public static final synthetic t(I)J
    .registers 3

    invoke-static {p0}, LH8/f;->A(I)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final synthetic u(LF8/l;Ljava/lang/Object;Lv8/q;)Z
    .registers 3

    invoke-static {p0, p1, p2}, LH8/f;->B(LF8/l;Ljava/lang/Object;Lv8/q;)Z

    move-result p0

    return p0
.end method

.method private static final v(JZ)J
    .registers 5

    if-eqz p2, :cond_5

    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    goto :goto_7

    :cond_5
    const-wide/16 v0, 0x0

    :goto_7
    add-long/2addr v0, p0

    return-wide v0
.end method

.method private static final w(JI)J
    .registers 5

    int-to-long v0, p2

    const/16 p2, 0x3c

    shl-long/2addr v0, p2

    add-long/2addr v0, p0

    return-wide v0
.end method

.method private static final x(JLH8/l;)LH8/l;
    .registers 9

    new-instance v0, LH8/l;

    invoke-virtual {p2}, LH8/l;->y()LH8/e;

    move-result-object v4

    const/4 v5, 0x0

    move-wide v1, p0

    move-object v3, p2

    invoke-direct/range {v0 .. v5}, LH8/l;-><init>(JLH8/l;LH8/e;I)V

    return-object v0
.end method

.method public static final y()LC8/e;
    .registers 1

    sget-object v0, LH8/f$a;->q:LH8/f$a;

    return-object v0
.end method

.method public static final z()LK8/D;
    .registers 1

    sget-object v0, LH8/f;->l:LK8/D;

    return-object v0
.end method
