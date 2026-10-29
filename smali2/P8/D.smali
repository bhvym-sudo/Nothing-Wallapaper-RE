.class public final LP8/D;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LP8/D$a;
    }
.end annotation


# instance fields
.field private final A:J

.field private final B:J

.field private final C:LU8/c;

.field private D:LP8/d;

.field private final q:LP8/B;

.field private final r:LP8/A;

.field private final s:Ljava/lang/String;

.field private final t:I

.field private final u:LP8/t;

.field private final v:LP8/u;

.field private final w:LP8/E;

.field private final x:LP8/D;

.field private final y:LP8/D;

.field private final z:LP8/D;


# direct methods
.method public constructor <init>(LP8/B;LP8/A;Ljava/lang/String;ILP8/t;LP8/u;LP8/E;LP8/D;LP8/D;LP8/D;JJLU8/c;)V
    .registers 17

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "protocol"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "headers"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LP8/D;->q:LP8/B;

    iput-object p2, p0, LP8/D;->r:LP8/A;

    iput-object p3, p0, LP8/D;->s:Ljava/lang/String;

    iput p4, p0, LP8/D;->t:I

    iput-object p5, p0, LP8/D;->u:LP8/t;

    iput-object p6, p0, LP8/D;->v:LP8/u;

    iput-object p7, p0, LP8/D;->w:LP8/E;

    iput-object p8, p0, LP8/D;->x:LP8/D;

    iput-object p9, p0, LP8/D;->y:LP8/D;

    iput-object p10, p0, LP8/D;->z:LP8/D;

    iput-wide p11, p0, LP8/D;->A:J

    iput-wide p13, p0, LP8/D;->B:J

    move-object/from16 p1, p15

    iput-object p1, p0, LP8/D;->C:LU8/c;

    return-void
.end method

.method public static synthetic G(LP8/D;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;
    .registers 5

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_5

    const/4 p2, 0x0

    :cond_5
    invoke-virtual {p0, p1, p2}, LP8/D;->B(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final B(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .registers 4

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, LP8/D;->v:LP8/u;

    invoke-virtual {p0, p1}, LP8/u;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_e

    return-object p2

    :cond_e
    return-object p0
.end method

.method public final I()LP8/u;
    .registers 1

    iget-object p0, p0, LP8/D;->v:LP8/u;

    return-object p0
.end method

.method public final K()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, LP8/D;->s:Ljava/lang/String;

    return-object p0
.end method

.method public final Q()LP8/D;
    .registers 1

    iget-object p0, p0, LP8/D;->x:LP8/D;

    return-object p0
.end method

.method public final U()LP8/D$a;
    .registers 2

    new-instance v0, LP8/D$a;

    invoke-direct {v0, p0}, LP8/D$a;-><init>(LP8/D;)V

    return-object v0
.end method

.method public final Y()LP8/D;
    .registers 1

    iget-object p0, p0, LP8/D;->z:LP8/D;

    return-object p0
.end method

.method public final a()LP8/E;
    .registers 1

    iget-object p0, p0, LP8/D;->w:LP8/E;

    return-object p0
.end method

.method public final b()LP8/d;
    .registers 3

    iget-object v0, p0, LP8/D;->D:LP8/d;

    if-nez v0, :cond_e

    sget-object v0, LP8/d;->n:LP8/d$b;

    iget-object v1, p0, LP8/D;->v:LP8/u;

    invoke-virtual {v0, v1}, LP8/d$b;->b(LP8/u;)LP8/d;

    move-result-object v0

    iput-object v0, p0, LP8/D;->D:LP8/d;

    :cond_e
    return-object v0
.end method

.method public final b0()LP8/A;
    .registers 1

    iget-object p0, p0, LP8/D;->r:LP8/A;

    return-object p0
.end method

.method public close()V
    .registers 2

    iget-object p0, p0, LP8/D;->w:LP8/E;

    if-eqz p0, :cond_8

    invoke-virtual {p0}, LP8/E;->close()V

    return-void

    :cond_8
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "response is not eligible for a body and must not be closed"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final f()LP8/D;
    .registers 1

    iget-object p0, p0, LP8/D;->y:LP8/D;

    return-object p0
.end method

.method public final g()Ljava/util/List;
    .registers 3

    iget-object v0, p0, LP8/D;->v:LP8/u;

    iget p0, p0, LP8/D;->t:I

    const/16 v1, 0x191

    if-eq p0, v1, :cond_14

    const/16 v1, 0x197

    if-eq p0, v1, :cond_11

    invoke-static {}, Li8/s;->l()Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_11
    const-string p0, "Proxy-Authenticate"

    goto :goto_16

    :cond_14
    const-string p0, "WWW-Authenticate"

    :goto_16
    invoke-static {v0, p0}, LV8/e;->a(LP8/u;Ljava/lang/String;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public final isSuccessful()Z
    .registers 3

    iget p0, p0, LP8/D;->t:I

    const/16 v0, 0xc8

    const/4 v1, 0x0

    if-gt v0, p0, :cond_d

    const/16 v0, 0x12c

    if-ge p0, v0, :cond_d

    const/4 p0, 0x1

    return p0

    :cond_d
    return v1
.end method

.method public final j()I
    .registers 1

    iget p0, p0, LP8/D;->t:I

    return p0
.end method

.method public final q0()J
    .registers 3

    iget-wide v0, p0, LP8/D;->B:J

    return-wide v0
.end method

.method public final t0()LP8/B;
    .registers 1

    iget-object p0, p0, LP8/D;->q:LP8/B;

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .registers 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Response{protocol="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LP8/D;->r:LP8/A;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", code="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LP8/D;->t:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", message="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LP8/D;->s:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, LP8/D;->q:LP8/B;

    invoke-virtual {p0}, LP8/B;->j()LP8/v;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p0, 0x7d

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final u()LU8/c;
    .registers 1

    iget-object p0, p0, LP8/D;->C:LU8/c;

    return-object p0
.end method

.method public final w0()J
    .registers 3

    iget-wide v0, p0, LP8/D;->A:J

    return-wide v0
.end method

.method public final z()LP8/t;
    .registers 1

    iget-object p0, p0, LP8/D;->u:LP8/t;

    return-object p0
.end method
