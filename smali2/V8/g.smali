.class public final LV8/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP8/w$a;


# instance fields
.field private final a:LU8/e;

.field private final b:Ljava/util/List;

.field private final c:I

.field private final d:LU8/c;

.field private final e:LP8/B;

.field private final f:I

.field private final g:I

.field private final h:I

.field private i:I


# direct methods
.method public constructor <init>(LU8/e;Ljava/util/List;ILU8/c;LP8/B;III)V
    .registers 10

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "interceptors"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "request"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LV8/g;->a:LU8/e;

    iput-object p2, p0, LV8/g;->b:Ljava/util/List;

    iput p3, p0, LV8/g;->c:I

    iput-object p4, p0, LV8/g;->d:LU8/c;

    iput-object p5, p0, LV8/g;->e:LP8/B;

    iput p6, p0, LV8/g;->f:I

    iput p7, p0, LV8/g;->g:I

    iput p8, p0, LV8/g;->h:I

    return-void
.end method

.method public static synthetic e(LV8/g;ILU8/c;LP8/B;IIIILjava/lang/Object;)LV8/g;
    .registers 9

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_6

    iget p1, p0, LV8/g;->c:I

    :cond_6
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_c

    iget-object p2, p0, LV8/g;->d:LU8/c;

    :cond_c
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_12

    iget-object p3, p0, LV8/g;->e:LP8/B;

    :cond_12
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_18

    iget p4, p0, LV8/g;->f:I

    :cond_18
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_1e

    iget p5, p0, LV8/g;->g:I

    :cond_1e
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_24

    iget p6, p0, LV8/g;->h:I

    :cond_24
    move p7, p5

    move p8, p6

    move-object p5, p3

    move p6, p4

    move p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, LV8/g;->d(ILU8/c;LP8/B;III)LV8/g;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(LP8/B;)LP8/D;
    .registers 15

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, LV8/g;->c:I

    iget-object v1, p0, LV8/g;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_10e

    iget v0, p0, LV8/g;->i:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, LV8/g;->i:I

    iget-object v0, p0, LV8/g;->d:LU8/c;

    const-string v2, " must call proceed() exactly once"

    const-string v3, "network interceptor "

    if-eqz v0, :cond_7c

    invoke-virtual {v0}, LU8/c;->j()LU8/d;

    move-result-object v0

    invoke-virtual {p1}, LP8/B;->j()LP8/v;

    move-result-object v4

    invoke-virtual {v0, v4}, LU8/d;->g(LP8/v;)Z

    move-result v0

    if-eqz v0, :cond_55

    iget v0, p0, LV8/g;->i:I

    if-ne v0, v1, :cond_30

    goto :goto_7c

    :cond_30
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, LV8/g;->b:Ljava/util/List;

    iget p0, p0, LV8/g;->c:I

    sub-int/2addr p0, v1

    invoke-interface {v0, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_55
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, LV8/g;->b:Ljava/util/List;

    iget p0, p0, LV8/g;->c:I

    sub-int/2addr p0, v1

    invoke-interface {v0, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " must retain the same host and port"

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7c
    :goto_7c
    iget v0, p0, LV8/g;->c:I

    add-int/lit8 v5, v0, 0x1

    const/16 v11, 0x3a

    const/4 v12, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v4, p0

    move-object v7, p1

    invoke-static/range {v4 .. v12}, LV8/g;->e(LV8/g;ILU8/c;LP8/B;IIIILjava/lang/Object;)LV8/g;

    move-result-object p0

    iget-object p1, v4, LV8/g;->b:Ljava/util/List;

    iget v0, v4, LV8/g;->c:I

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LP8/w;

    invoke-interface {p1, p0}, LP8/w;->a(LP8/w$a;)LP8/D;

    move-result-object v0

    const-string v5, "interceptor "

    if-eqz v0, :cond_f4

    iget-object v6, v4, LV8/g;->d:LU8/c;

    if-eqz v6, :cond_cf

    iget v6, v4, LV8/g;->c:I

    add-int/2addr v6, v1

    iget-object v4, v4, LV8/g;->b:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v6, v4, :cond_cf

    iget p0, p0, LV8/g;->i:I

    if-ne p0, v1, :cond_b3

    goto :goto_cf

    :cond_b3
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_cf
    :goto_cf
    invoke-virtual {v0}, LP8/D;->a()LP8/E;

    move-result-object p0

    if-eqz p0, :cond_d6

    return-object v0

    :cond_d6
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " returned a response with no body"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_f4
    new-instance p0, Ljava/lang/NullPointerException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " returned null"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_10e
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Check failed."

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public b()LP8/B;
    .registers 1

    iget-object p0, p0, LV8/g;->e:LP8/B;

    return-object p0
.end method

.method public c()LP8/j;
    .registers 1

    iget-object p0, p0, LV8/g;->d:LU8/c;

    if-eqz p0, :cond_9

    invoke-virtual {p0}, LU8/c;->h()LU8/f;

    move-result-object p0

    return-object p0

    :cond_9
    const/4 p0, 0x0

    return-object p0
.end method

.method public call()LP8/e;
    .registers 1

    iget-object p0, p0, LV8/g;->a:LU8/e;

    return-object p0
.end method

.method public final d(ILU8/c;LP8/B;III)LV8/g;
    .registers 17

    const-string v0, "request"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, LV8/g;

    iget-object v2, p0, LV8/g;->a:LU8/e;

    iget-object v3, p0, LV8/g;->b:Ljava/util/List;

    move v4, p1

    move-object v5, p2

    move-object v6, p3

    move v7, p4

    move v8, p5

    move/from16 v9, p6

    invoke-direct/range {v1 .. v9}, LV8/g;-><init>(LU8/e;Ljava/util/List;ILU8/c;LP8/B;III)V

    return-object v1
.end method

.method public final f()LU8/e;
    .registers 1

    iget-object p0, p0, LV8/g;->a:LU8/e;

    return-object p0
.end method

.method public final g()I
    .registers 1

    iget p0, p0, LV8/g;->f:I

    return p0
.end method

.method public final h()LU8/c;
    .registers 1

    iget-object p0, p0, LV8/g;->d:LU8/c;

    return-object p0
.end method

.method public final i()I
    .registers 1

    iget p0, p0, LV8/g;->g:I

    return p0
.end method

.method public final j()LP8/B;
    .registers 1

    iget-object p0, p0, LV8/g;->e:LP8/B;

    return-object p0
.end method

.method public final k()I
    .registers 1

    iget p0, p0, LV8/g;->h:I

    return p0
.end method

.method public l()I
    .registers 1

    iget p0, p0, LV8/g;->g:I

    return p0
.end method
