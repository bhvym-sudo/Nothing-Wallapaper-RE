.class public abstract LG6/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Z = true

.field private static final b:Z = true


# direct methods
.method static constructor <clinit>()V
    .registers 0

    return-void
.end method

.method public static final a()Z
    .registers 1

    sget-boolean v0, LG6/d;->b:Z

    return v0
.end method

.method public static final b()Z
    .registers 1

    sget-boolean v0, LG6/d;->a:Z

    return v0
.end method
