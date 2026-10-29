.class public final LS8/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP8/w;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LS8/a$a;
    }
.end annotation


# static fields
.field public static final a:LS8/a$a;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LS8/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LS8/a$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LS8/a;->a:LS8/a$a;

    return-void
.end method

.method public constructor <init>(LP8/c;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LP8/w$a;)LP8/D;
    .registers 7

    const-string p0, "chain"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LP8/w$a;->call()LP8/e;

    move-result-object p0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    new-instance v2, LS8/b$b;

    invoke-interface {p1}, LP8/w$a;->b()LP8/B;

    move-result-object v3

    const/4 v4, 0x0

    invoke-direct {v2, v0, v1, v3, v4}, LS8/b$b;-><init>(JLP8/B;LP8/D;)V

    invoke-virtual {v2}, LS8/b$b;->b()LS8/b;

    move-result-object v0

    invoke-virtual {v0}, LS8/b;->b()LP8/B;

    move-result-object v1

    invoke-virtual {v0}, LS8/b;->a()LP8/D;

    move-result-object v0

    instance-of v2, p0, LU8/e;

    if-eqz v2, :cond_2b

    move-object v2, p0

    check-cast v2, LU8/e;

    goto :goto_2c

    :cond_2b
    move-object v2, v4

    :goto_2c
    if-eqz v2, :cond_34

    invoke-virtual {v2}, LU8/e;->p()LP8/r;

    move-result-object v2

    if-nez v2, :cond_36

    :cond_34
    sget-object v2, LP8/r;->b:LP8/r;

    :cond_36
    if-nez v1, :cond_75

    if-nez v0, :cond_75

    new-instance v0, LP8/D$a;

    invoke-direct {v0}, LP8/D$a;-><init>()V

    invoke-interface {p1}, LP8/w$a;->b()LP8/B;

    move-result-object p1

    invoke-virtual {v0, p1}, LP8/D$a;->r(LP8/B;)LP8/D$a;

    move-result-object p1

    sget-object v0, LP8/A;->t:LP8/A;

    invoke-virtual {p1, v0}, LP8/D$a;->p(LP8/A;)LP8/D$a;

    move-result-object p1

    const/16 v0, 0x1f8

    invoke-virtual {p1, v0}, LP8/D$a;->g(I)LP8/D$a;

    move-result-object p1

    const-string v0, "Unsatisfiable Request (only-if-cached)"

    invoke-virtual {p1, v0}, LP8/D$a;->m(Ljava/lang/String;)LP8/D$a;

    move-result-object p1

    sget-object v0, LQ8/d;->c:LP8/E;

    invoke-virtual {p1, v0}, LP8/D$a;->b(LP8/E;)LP8/D$a;

    move-result-object p1

    const-wide/16 v0, -0x1

    invoke-virtual {p1, v0, v1}, LP8/D$a;->s(J)LP8/D$a;

    move-result-object p1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, LP8/D$a;->q(J)LP8/D$a;

    move-result-object p1

    invoke-virtual {p1}, LP8/D$a;->c()LP8/D;

    move-result-object p1

    invoke-virtual {v2, p0, p1}, LP8/r;->z(LP8/e;LP8/D;)V

    return-object p1

    :cond_75
    if-nez v1, :cond_90

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {v0}, LP8/D;->U()LP8/D$a;

    move-result-object p1

    sget-object v1, LS8/a;->a:LS8/a$a;

    invoke-static {v1, v0}, LS8/a$a;->b(LS8/a$a;LP8/D;)LP8/D;

    move-result-object v0

    invoke-virtual {p1, v0}, LP8/D$a;->d(LP8/D;)LP8/D$a;

    move-result-object p1

    invoke-virtual {p1}, LP8/D$a;->c()LP8/D;

    move-result-object p1

    invoke-virtual {v2, p0, p1}, LP8/r;->b(LP8/e;LP8/D;)V

    return-object p1

    :cond_90
    if-eqz v0, :cond_95

    invoke-virtual {v2, p0, v0}, LP8/r;->a(LP8/e;LP8/D;)V

    :cond_95
    invoke-interface {p1, v1}, LP8/w$a;->a(LP8/B;)LP8/D;

    move-result-object p0

    if-eqz v0, :cond_f6

    if-eqz p0, :cond_ed

    invoke-virtual {p0}, LP8/D;->j()I

    move-result p1

    const/16 v1, 0x130

    if-eq p1, v1, :cond_a6

    goto :goto_ed

    :cond_a6
    invoke-virtual {v0}, LP8/D;->U()LP8/D$a;

    move-result-object p1

    sget-object v1, LS8/a;->a:LS8/a$a;

    invoke-virtual {v0}, LP8/D;->I()LP8/u;

    move-result-object v2

    invoke-virtual {p0}, LP8/D;->I()LP8/u;

    move-result-object v3

    invoke-static {v1, v2, v3}, LS8/a$a;->a(LS8/a$a;LP8/u;LP8/u;)LP8/u;

    move-result-object v2

    invoke-virtual {p1, v2}, LP8/D$a;->k(LP8/u;)LP8/D$a;

    move-result-object p1

    invoke-virtual {p0}, LP8/D;->w0()J

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, LP8/D$a;->s(J)LP8/D$a;

    move-result-object p1

    invoke-virtual {p0}, LP8/D;->q0()J

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, LP8/D$a;->q(J)LP8/D$a;

    move-result-object p1

    invoke-static {v1, v0}, LS8/a$a;->b(LS8/a$a;LP8/D;)LP8/D;

    move-result-object v0

    invoke-virtual {p1, v0}, LP8/D$a;->d(LP8/D;)LP8/D$a;

    move-result-object p1

    invoke-static {v1, p0}, LS8/a$a;->b(LS8/a$a;LP8/D;)LP8/D;

    move-result-object v0

    invoke-virtual {p1, v0}, LP8/D$a;->n(LP8/D;)LP8/D$a;

    move-result-object p1

    invoke-virtual {p1}, LP8/D$a;->c()LP8/D;

    invoke-virtual {p0}, LP8/D;->a()LP8/E;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {p0}, LP8/E;->close()V

    invoke-static {v4}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    throw v4

    :cond_ed
    :goto_ed
    invoke-virtual {v0}, LP8/D;->a()LP8/E;

    move-result-object p1

    if-eqz p1, :cond_f6

    invoke-static {p1}, LQ8/d;->m(Ljava/io/Closeable;)V

    :cond_f6
    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {p0}, LP8/D;->U()LP8/D$a;

    move-result-object p1

    sget-object v1, LS8/a;->a:LS8/a$a;

    invoke-static {v1, v0}, LS8/a$a;->b(LS8/a$a;LP8/D;)LP8/D;

    move-result-object v0

    invoke-virtual {p1, v0}, LP8/D$a;->d(LP8/D;)LP8/D$a;

    move-result-object p1

    invoke-static {v1, p0}, LS8/a$a;->b(LS8/a$a;LP8/D;)LP8/D;

    move-result-object p0

    invoke-virtual {p1, p0}, LP8/D$a;->n(LP8/D;)LP8/D$a;

    move-result-object p0

    invoke-virtual {p0}, LP8/D$a;->c()LP8/D;

    move-result-object p0

    return-object p0
.end method
