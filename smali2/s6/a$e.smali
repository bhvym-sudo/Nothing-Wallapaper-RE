.class public abstract Ls6/a$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls6/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls6/a$e$a;,
        Ls6/a$e$b;,
        Ls6/a$e$c;,
        Ls6/a$e$d;,
        Ls6/a$e$e;
    }
.end annotation


# instance fields
.field private final q:I

.field private final r:Z


# direct methods
.method private constructor <init>(IZ)V
    .registers 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ls6/a$e;->q:I

    iput-boolean p2, p0, Ls6/a$e;->r:Z

    return-void
.end method

.method public synthetic constructor <init>(IZILkotlin/jvm/internal/h;)V
    .registers 5

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_5

    const/4 p2, 0x0

    :cond_5
    const/4 p3, 0x0

    .line 3
    invoke-direct {p0, p1, p2, p3}, Ls6/a$e;-><init>(IZLkotlin/jvm/internal/h;)V

    return-void
.end method

.method public synthetic constructor <init>(IZLkotlin/jvm/internal/h;)V
    .registers 4

    .line 1
    invoke-direct {p0, p1, p2}, Ls6/a$e;-><init>(IZ)V

    return-void
.end method


# virtual methods
.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .registers 2

    check-cast p1, Ls6/a$e;

    invoke-virtual {p0, p1}, Ls6/a$e;->d(Ls6/a$e;)I

    move-result p0

    return p0
.end method

.method public d(Ls6/a$e;)I
    .registers 5

    const-string v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Ls6/a$e$b;

    const/4 v1, -0x1

    if-eqz v0, :cond_2d

    instance-of v0, p1, Ls6/a$e$b;

    if-eqz v0, :cond_2d

    check-cast p0, Ls6/a$e$b;

    invoke-virtual {p0}, Ls6/a$e$b;->k()Z

    move-result v0

    check-cast p1, Ls6/a$e$b;

    invoke-virtual {p1}, Ls6/a$e$b;->k()Z

    move-result v2

    if-ne v0, v2, :cond_1e

    const/4 p0, 0x0

    return p0

    :cond_1e
    invoke-virtual {p0}, Ls6/a$e$b;->k()Z

    move-result p0

    if-eqz p0, :cond_2c

    invoke-virtual {p1}, Ls6/a$e$b;->k()Z

    move-result p0

    if-nez p0, :cond_2c

    const/4 p0, 0x1

    return p0

    :cond_2c
    return v1

    :cond_2d
    instance-of v0, p0, Ls6/a$e$e;

    if-eqz v0, :cond_3f

    move-object v0, p0

    check-cast v0, Ls6/a$e$e;

    invoke-virtual {v0}, Ls6/a$e$e;->i()Z

    move-result v0

    if-eqz v0, :cond_3f

    instance-of v0, p1, Ls6/a$e$d;

    if-eqz v0, :cond_3f

    return v1

    :cond_3f
    iget p0, p0, Ls6/a$e;->q:I

    iget p1, p1, Ls6/a$e;->q:I

    sub-int/2addr p0, p1

    return p0
.end method

.method public e()Z
    .registers 1

    iget-boolean p0, p0, Ls6/a$e;->r:Z

    return p0
.end method

.method public final f()Z
    .registers 2

    sget-object v0, Ls6/a$e$d;->s:Ls6/a$e$d;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    instance-of p0, p0, Ls6/a$e$b;

    if-eqz p0, :cond_d

    goto :goto_f

    :cond_d
    const/4 p0, 0x0

    return p0

    :cond_f
    :goto_f
    const/4 p0, 0x1

    return p0
.end method

.method public final g()Ls6/a$e;
    .registers 2

    instance-of v0, p0, Ls6/a$e$b;

    if-eqz v0, :cond_11

    check-cast p0, Ls6/a$e$b;

    invoke-virtual {p0}, Ls6/a$e$b;->k()Z

    move-result v0

    if-nez v0, :cond_11

    invoke-virtual {p0}, Ls6/a$e$b;->i()Ls6/a$e$b;

    move-result-object p0

    return-object p0

    :cond_11
    const/4 p0, 0x0

    return-object p0
.end method

.method public final h(Ls6/a$e;)Z
    .registers 3

    const-string v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ls6/a$e;->f()Z

    move-result v0

    if-eqz v0, :cond_18

    instance-of v0, p1, Ls6/a$e$e;

    if-eqz v0, :cond_18

    move-object v0, p1

    check-cast v0, Ls6/a$e$e;

    invoke-virtual {v0}, Ls6/a$e$e;->i()Z

    move-result v0

    if-nez v0, :cond_28

    :cond_18
    instance-of v0, p0, Ls6/a$e$e;

    if-eqz v0, :cond_2a

    check-cast p0, Ls6/a$e$e;

    invoke-virtual {p0}, Ls6/a$e$e;->i()Z

    move-result p0

    if-eqz p0, :cond_2a

    instance-of p0, p1, Ls6/a$e$d;

    if-eqz p0, :cond_2a

    :cond_28
    const/4 p0, 0x1

    return p0

    :cond_2a
    const/4 p0, 0x0

    return p0
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

    const-string p0, "State"

    :cond_10
    return-object p0
.end method
