.class public final LX8/i$d;
.super Le9/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LX8/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "d"
.end annotation


# instance fields
.field final synthetic o:LX8/i;


# direct methods
.method public constructor <init>(LX8/i;)V
    .registers 2

    iput-object p1, p0, LX8/i$d;->o:LX8/i;

    invoke-direct {p0}, Le9/c;-><init>()V

    return-void
.end method


# virtual methods
.method protected B()V
    .registers 3

    iget-object v0, p0, LX8/i$d;->o:LX8/i;

    sget-object v1, LX8/b;->A:LX8/b;

    invoke-virtual {v0, v1}, LX8/i;->f(LX8/b;)V

    iget-object p0, p0, LX8/i$d;->o:LX8/i;

    invoke-virtual {p0}, LX8/i;->g()LX8/f;

    move-result-object p0

    invoke-virtual {p0}, LX8/f;->s1()V

    return-void
.end method

.method public final C()V
    .registers 2

    invoke-virtual {p0}, Le9/c;->w()Z

    move-result v0

    if-nez v0, :cond_7

    return-void

    :cond_7
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LX8/i$d;->x(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p0

    throw p0
.end method

.method protected x(Ljava/io/IOException;)Ljava/io/IOException;
    .registers 3

    new-instance p0, Ljava/net/SocketTimeoutException;

    const-string v0, "timeout"

    invoke-direct {p0, v0}, Ljava/net/SocketTimeoutException;-><init>(Ljava/lang/String;)V

    if-eqz p1, :cond_c

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    :cond_c
    return-object p0
.end method
