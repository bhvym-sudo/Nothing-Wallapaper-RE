.class final LF8/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF8/k;


# instance fields
.field private final q:LF8/d0;


# direct methods
.method public constructor <init>(LF8/d0;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF8/e0;->q:LF8/d0;

    return-void
.end method


# virtual methods
.method public e(Ljava/lang/Throwable;)V
    .registers 2

    iget-object p0, p0, LF8/e0;->q:LF8/d0;

    invoke-interface {p0}, LF8/d0;->dispose()V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DisposeOnCancel["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, LF8/e0;->q:LF8/d0;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p0, 0x5d

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
