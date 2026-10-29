.class public abstract LJ8/q$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJ8/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static synthetic a(LJ8/q;Lm8/i;ILH8/a;ILjava/lang/Object;)LI8/f;
    .registers 6

    if-nez p5, :cond_18

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_8

    sget-object p1, Lm8/j;->q:Lm8/j;

    :cond_8
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_d

    const/4 p2, -0x3

    :cond_d
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_13

    sget-object p3, LH8/a;->q:LH8/a;

    :cond_13
    invoke-interface {p0, p1, p2, p3}, LJ8/q;->e(Lm8/i;ILH8/a;)LI8/f;

    move-result-object p0

    return-object p0

    :cond_18
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: fuse"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
