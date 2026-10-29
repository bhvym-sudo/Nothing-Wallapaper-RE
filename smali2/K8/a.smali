.class public abstract LK8/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LK8/D;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LK8/D;

    const-string v1, "CLOSED"

    invoke-direct {v0, v1}, LK8/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LK8/a;->a:LK8/D;

    return-void
.end method

.method public static final synthetic a()LK8/D;
    .registers 1

    sget-object v0, LK8/a;->a:LK8/D;

    return-object v0
.end method

.method public static final b(LK8/b;)LK8/b;
    .registers 3

    :cond_0
    :goto_0
    invoke-static {p0}, LK8/b;->a(LK8/b;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, LK8/a;->a()LK8/D;

    move-result-object v1

    if-ne v0, v1, :cond_b

    return-object p0

    :cond_b
    check-cast v0, LK8/b;

    if-nez v0, :cond_16

    invoke-virtual {p0}, LK8/b;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_16
    move-object p0, v0

    goto :goto_0
.end method

.method public static final c(LK8/A;JLv8/p;)Ljava/lang/Object;
    .registers 8

    :cond_0
    :goto_0
    iget-wide v0, p0, LK8/A;->s:J

    cmp-long v0, v0, p1

    if-ltz v0, :cond_12

    invoke-virtual {p0}, LK8/A;->k()Z

    move-result v0

    if-eqz v0, :cond_d

    goto :goto_12

    :cond_d
    invoke-static {p0}, LK8/B;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_12
    :goto_12
    invoke-static {p0}, LK8/b;->a(LK8/b;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, LK8/a;->a()LK8/D;

    move-result-object v1

    if-ne v0, v1, :cond_23

    sget-object p0, LK8/a;->a:LK8/D;

    invoke-static {p0}, LK8/B;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_23
    check-cast v0, LK8/b;

    check-cast v0, LK8/A;

    if-eqz v0, :cond_2b

    :cond_29
    :goto_29
    move-object p0, v0

    goto :goto_0

    :cond_2b
    iget-wide v0, p0, LK8/A;->s:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p3, v0, p0}, Lv8/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LK8/A;

    invoke-virtual {p0, v0}, LK8/b;->o(LK8/b;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, LK8/A;->k()Z

    move-result v1

    if-eqz v1, :cond_29

    invoke-virtual {p0}, LK8/b;->n()V

    goto :goto_29
.end method
