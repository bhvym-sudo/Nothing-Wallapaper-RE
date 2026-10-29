.class public final LB8/g;
.super LB8/e;
.source "SourceFile"

# interfaces
.implements LB8/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LB8/g$a;
    }
.end annotation


# static fields
.field public static final u:LB8/g$a;

.field private static final v:LB8/g;


# direct methods
.method static constructor <clinit>()V
    .registers 3

    new-instance v0, LB8/g$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LB8/g$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LB8/g;->u:LB8/g$a;

    new-instance v0, LB8/g;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LB8/g;-><init>(II)V

    sput-object v0, LB8/g;->v:LB8/g;

    return-void
.end method

.method public constructor <init>(II)V
    .registers 4

    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, v0}, LB8/e;-><init>(III)V

    return-void
.end method

.method public static final synthetic p()LB8/g;
    .registers 1

    sget-object v0, LB8/g;->v:LB8/g;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/Comparable;
    .registers 1

    invoke-virtual {p0}, LB8/g;->s()Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic b(Ljava/lang/Comparable;)Z
    .registers 2

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, LB8/g;->q(I)Z

    move-result p0

    return p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 4

    instance-of v0, p1, LB8/g;

    if-eqz v0, :cond_2b

    invoke-virtual {p0}, LB8/g;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_13

    move-object v0, p1

    check-cast v0, LB8/g;

    invoke-virtual {v0}, LB8/g;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_29

    :cond_13
    invoke-virtual {p0}, LB8/e;->g()I

    move-result v0

    check-cast p1, LB8/g;

    invoke-virtual {p1}, LB8/e;->g()I

    move-result v1

    if-ne v0, v1, :cond_2b

    invoke-virtual {p0}, LB8/e;->m()I

    move-result p0

    invoke-virtual {p1}, LB8/e;->m()I

    move-result p1

    if-ne p0, p1, :cond_2b

    :cond_29
    const/4 p0, 0x1

    return p0

    :cond_2b
    const/4 p0, 0x0

    return p0
.end method

.method public bridge synthetic f()Ljava/lang/Comparable;
    .registers 1

    invoke-virtual {p0}, LB8/g;->r()Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public hashCode()I
    .registers 2

    invoke-virtual {p0}, LB8/g;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_8

    const/4 p0, -0x1

    return p0

    :cond_8
    invoke-virtual {p0}, LB8/e;->g()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, LB8/e;->m()I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method

.method public isEmpty()Z
    .registers 2

    invoke-virtual {p0}, LB8/e;->g()I

    move-result v0

    invoke-virtual {p0}, LB8/e;->m()I

    move-result p0

    if-le v0, p0, :cond_c

    const/4 p0, 0x1

    return p0

    :cond_c
    const/4 p0, 0x0

    return p0
.end method

.method public q(I)Z
    .registers 3

    invoke-virtual {p0}, LB8/e;->g()I

    move-result v0

    if-gt v0, p1, :cond_e

    invoke-virtual {p0}, LB8/e;->m()I

    move-result p0

    if-gt p1, p0, :cond_e

    const/4 p0, 0x1

    return p0

    :cond_e
    const/4 p0, 0x0

    return p0
.end method

.method public r()Ljava/lang/Integer;
    .registers 1

    invoke-virtual {p0}, LB8/e;->m()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public s()Ljava/lang/Integer;
    .registers 1

    invoke-virtual {p0}, LB8/e;->g()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .registers 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, LB8/e;->g()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ".."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LB8/e;->m()I

    move-result p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
