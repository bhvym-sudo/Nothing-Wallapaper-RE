.class public abstract LT8/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Z

.field private c:LT8/d;

.field private d:J


# direct methods
.method public constructor <init>(Ljava/lang/String;Z)V
    .registers 4

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LT8/a;->a:Ljava/lang/String;

    .line 3
    iput-boolean p2, p0, LT8/a;->b:Z

    const-wide/16 p1, -0x1

    .line 4
    iput-wide p1, p0, LT8/a;->d:J

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ZILkotlin/jvm/internal/h;)V
    .registers 5

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_5

    const/4 p2, 0x1

    .line 5
    :cond_5
    invoke-direct {p0, p1, p2}, LT8/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public final a()Z
    .registers 1

    iget-boolean p0, p0, LT8/a;->b:Z

    return p0
.end method

.method public final b()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, LT8/a;->a:Ljava/lang/String;

    return-object p0
.end method

.method public final c()J
    .registers 3

    iget-wide v0, p0, LT8/a;->d:J

    return-wide v0
.end method

.method public final d()LT8/d;
    .registers 1

    iget-object p0, p0, LT8/a;->c:LT8/d;

    return-object p0
.end method

.method public final e(LT8/d;)V
    .registers 3

    const-string v0, "queue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LT8/a;->c:LT8/d;

    if-ne v0, p1, :cond_a

    return-void

    :cond_a
    if-nez v0, :cond_f

    iput-object p1, p0, LT8/a;->c:LT8/d;

    return-void

    :cond_f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "task is in multiple queues"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public abstract f()J
.end method

.method public final g(J)V
    .registers 3

    iput-wide p1, p0, LT8/a;->d:J

    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, LT8/a;->a:Ljava/lang/String;

    return-object p0
.end method
