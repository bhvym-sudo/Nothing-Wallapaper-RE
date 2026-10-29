.class public abstract Lh8/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh8/x$a;
    }
.end annotation


# static fields
.field public static final q:Lh8/x$a;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lh8/x$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lh8/x$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lh8/x;->q:Lh8/x$a;

    return-void
.end method

.method public static d(J)J
    .registers 2

    return-wide p0
.end method

.method public static final e(JJ)Z
    .registers 4

    cmp-long p0, p0, p2

    if-nez p0, :cond_6

    const/4 p0, 0x1

    return p0

    :cond_6
    const/4 p0, 0x0

    return p0
.end method

.method public static f(J)I
    .registers 2

    invoke-static {p0, p1}, Ljava/lang/Long;->hashCode(J)I

    move-result p0

    return p0
.end method
