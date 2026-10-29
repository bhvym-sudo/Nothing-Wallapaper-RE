.class public final LF8/I0;
.super LK8/n;
.source "SourceFile"

# interfaces
.implements LF8/t0;


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, LK8/n;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Z
    .registers 1

    const/4 p0, 0x1

    return p0
.end method

.method public b()LF8/I0;
    .registers 1

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .registers 1

    invoke-super {p0}, LK8/o;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
