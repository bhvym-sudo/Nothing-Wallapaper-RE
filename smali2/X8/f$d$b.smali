.class public final LX8/f$d$b;
.super LT8/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LX8/f$d;->b(ZIILjava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic e:LX8/f;

.field final synthetic f:LX8/i;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLX8/f;LX8/i;)V
    .registers 5

    iput-object p3, p0, LX8/f$d$b;->e:LX8/f;

    iput-object p4, p0, LX8/f$d$b;->f:LX8/i;

    invoke-direct {p0, p1, p2}, LT8/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public f()J
    .registers 5

    :try_start_0
    iget-object v0, p0, LX8/f$d$b;->e:LX8/f;

    invoke-virtual {v0}, LX8/f;->T0()LX8/f$c;

    move-result-object v0

    iget-object v1, p0, LX8/f$d$b;->f:LX8/i;

    invoke-virtual {v0, v1}, LX8/f$c;->c(LX8/i;)V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_b} :catch_c

    goto :goto_35

    :catch_c
    move-exception v0

    sget-object v1, LZ8/h;->a:LZ8/h$a;

    invoke-virtual {v1}, LZ8/h$a;->g()LZ8/h;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Http2Connection.Listener failure for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, LX8/f$d$b;->e:LX8/f;

    invoke-virtual {v3}, LX8/f;->O0()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x4

    invoke-virtual {v1, v2, v3, v0}, LZ8/h;->j(Ljava/lang/String;ILjava/lang/Throwable;)V

    :try_start_2e
    iget-object p0, p0, LX8/f$d$b;->f:LX8/i;

    sget-object v1, LX8/b;->t:LX8/b;

    invoke-virtual {p0, v1, v0}, LX8/i;->d(LX8/b;Ljava/io/IOException;)V
    :try_end_35
    .catch Ljava/io/IOException; {:try_start_2e .. :try_end_35} :catch_35

    :catch_35
    :goto_35
    const-wide/16 v0, -0x1

    return-wide v0
.end method
