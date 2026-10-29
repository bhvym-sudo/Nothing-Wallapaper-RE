.class public abstract Ls6/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls6/a$a;,
        Ls6/a$b;,
        Ls6/a$c;,
        Ls6/a$d;,
        Ls6/a$e;
    }
.end annotation


# instance fields
.field private final q:I


# direct methods
.method private constructor <init>(I)V
    .registers 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ls6/a;->q:I

    return-void
.end method

.method public synthetic constructor <init>(ILkotlin/jvm/internal/h;)V
    .registers 3

    .line 1
    invoke-direct {p0, p1}, Ls6/a;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .registers 2

    check-cast p1, Ls6/a;

    invoke-virtual {p0, p1}, Ls6/a;->d(Ls6/a;)I

    move-result p0

    return p0
.end method

.method public d(Ls6/a;)I
    .registers 3

    const-string v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget p0, p0, Ls6/a;->q:I

    iget p1, p1, Ls6/a;->q:I

    sub-int/2addr p0, p1

    return p0
.end method

.method public final e()Ls6/a$e;
    .registers 5

    instance-of v0, p0, Ls6/a$b;

    if-eqz v0, :cond_7

    sget-object p0, Ls6/a$e$d;->s:Ls6/a$e$d;

    return-object p0

    :cond_7
    instance-of v0, p0, Ls6/a$a;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_14

    new-instance p0, Ls6/a$e$b;

    invoke-direct {p0, v3, v2, v1}, Ls6/a$e$b;-><init>(ZILkotlin/jvm/internal/h;)V

    return-object p0

    :cond_14
    instance-of v0, p0, Ls6/a$d;

    if-eqz v0, :cond_1e

    new-instance p0, Ls6/a$e$e;

    invoke-direct {p0, v3, v2, v1}, Ls6/a$e$e;-><init>(ZILkotlin/jvm/internal/h;)V

    return-object p0

    :cond_1e
    instance-of p0, p0, Ls6/a$c;

    if-eqz p0, :cond_25

    sget-object p0, Ls6/a$e$a;->s:Ls6/a$e$a;

    return-object p0

    :cond_25
    new-instance p0, Lh8/m;

    invoke-direct {p0}, Lh8/m;-><init>()V

    throw p0
.end method

.method public toString()Ljava/lang/String;
    .registers 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/F;->b(Ljava/lang/Class;)LC8/c;

    move-result-object p0

    invoke-interface {p0}, LC8/c;->b()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_10

    const-string p0, "Event"

    :cond_10
    return-object p0
.end method
