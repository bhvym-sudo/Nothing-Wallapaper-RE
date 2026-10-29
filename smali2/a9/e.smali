.class public abstract La9/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(Ljava/util/logging/LogRecord;)I
    .registers 1

    invoke-static {p0}, La9/e;->b(Ljava/util/logging/LogRecord;)I

    move-result p0

    return p0
.end method

.method private static final b(Ljava/util/logging/LogRecord;)I
    .registers 4

    invoke-virtual {p0}, Ljava/util/logging/LogRecord;->getLevel()Ljava/util/logging/Level;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/logging/Level;->intValue()I

    move-result v0

    sget-object v1, Ljava/util/logging/Level;->INFO:Ljava/util/logging/Level;

    invoke-virtual {v1}, Ljava/util/logging/Level;->intValue()I

    move-result v2

    if-le v0, v2, :cond_12

    const/4 p0, 0x5

    return p0

    :cond_12
    invoke-virtual {p0}, Ljava/util/logging/LogRecord;->getLevel()Ljava/util/logging/Level;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/logging/Level;->intValue()I

    move-result p0

    invoke-virtual {v1}, Ljava/util/logging/Level;->intValue()I

    move-result v0

    if-ne p0, v0, :cond_22

    const/4 p0, 0x4

    return p0

    :cond_22
    const/4 p0, 0x3

    return p0
.end method
