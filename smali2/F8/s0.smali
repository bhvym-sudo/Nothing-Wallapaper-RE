.class final LF8/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF8/t0;


# instance fields
.field private final q:LF8/I0;


# direct methods
.method public constructor <init>(LF8/I0;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF8/s0;->q:LF8/I0;

    return-void
.end method


# virtual methods
.method public a()Z
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public b()LF8/I0;
    .registers 1

    iget-object p0, p0, LF8/s0;->q:LF8/I0;

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .registers 1

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
