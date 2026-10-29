.class public final LV5/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:I

.field private final b:I

.field private final c:I

.field private final d:LF2/e;

.field private final e:LF2/e;

.field public f:Z

.field public final g:[[Z


# direct methods
.method public constructor <init>(III)V
    .registers 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LV5/b;->a:I

    iput p2, p0, LV5/b;->b:I

    iput p3, p0, LV5/b;->c:I

    new-instance v0, LF2/e;

    invoke-direct {v0, p1, p2}, LF2/e;-><init>(II)V

    iput-object v0, p0, LV5/b;->d:LF2/e;

    new-instance p2, LF2/e;

    invoke-direct {p2, p1, p3}, LF2/e;-><init>(II)V

    iput-object p2, p0, LV5/b;->e:LF2/e;

    iget-object p1, v0, LF2/e;->c:[[Z

    const-string p2, "cells"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LV5/b;->g:[[Z

    return-void
.end method

.method private final f()LF2/e;
    .registers 2

    iget-boolean v0, p0, LV5/b;->f:Z

    if-eqz v0, :cond_7

    iget-object p0, p0, LV5/b;->d:LF2/e;

    return-object p0

    :cond_7
    iget-object p0, p0, LV5/b;->e:LF2/e;

    return-object p0
.end method


# virtual methods
.method public final a()V
    .registers 2

    iget-object v0, p0, LV5/b;->d:LF2/e;

    invoke-virtual {v0}, LF2/e;->b()V

    iget-object p0, p0, LV5/b;->e:LF2/e;

    invoke-virtual {p0}, LF2/e;->b()V

    return-void
.end method

.method public final b(LV5/b;)V
    .registers 4

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LV5/b;->d:LF2/e;

    iget-object v1, p1, LV5/b;->d:LF2/e;

    invoke-virtual {v0, v1}, LF2/e;->c(LF2/e;)V

    iget-object p0, p0, LV5/b;->e:LF2/e;

    iget-object p1, p1, LV5/b;->e:LF2/e;

    invoke-virtual {p0, p1}, LF2/e;->c(LF2/e;)V

    return-void
.end method

.method public final c([III)Z
    .registers 5

    const-string v0, "vacantOut"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LV5/b;->f()LF2/e;

    move-result-object p0

    invoke-virtual {p0, p1, p2, p3}, LF2/e;->d([III)Z

    move-result p0

    return p0
.end method

.method public final d()[[Z
    .registers 2

    invoke-direct {p0}, LV5/b;->f()LF2/e;

    move-result-object p0

    iget-object p0, p0, LF2/e;->c:[[Z

    const-string v0, "cells"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final e()I
    .registers 2

    iget-boolean v0, p0, LV5/b;->f:Z

    if-eqz v0, :cond_7

    iget p0, p0, LV5/b;->b:I

    return p0

    :cond_7
    iget p0, p0, LV5/b;->c:I

    return p0
.end method

.method public final g(IIII)Z
    .registers 5

    invoke-direct {p0}, LV5/b;->f()LF2/e;

    move-result-object p0

    invoke-virtual {p0, p1, p2, p3, p4}, LF2/e;->e(IIII)Z

    move-result p0

    return p0
.end method

.method public final h(IIII)Z
    .registers 5

    invoke-direct {p0}, LV5/b;->f()LF2/e;

    move-result-object p0

    invoke-virtual {p0, p1, p2, p3, p4}, LF2/e;->f(IIII)Z

    move-result p0

    return p0
.end method

.method public final i(IIIIZ)V
    .registers 12

    iget-object v0, p0, LV5/b;->d:LF2/e;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v5}, LF2/e;->g(IIIIZ)V

    iget-object p0, p0, LV5/b;->e:LF2/e;

    invoke-virtual/range {p0 .. p5}, LF2/e;->g(IIIIZ)V

    return-void
.end method

.method public final j(LC2/b;Z)V
    .registers 4

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LV5/b;->d:LF2/e;

    invoke-virtual {v0, p1, p2}, LF2/e;->h(LC2/b;Z)V

    iget-object p0, p0, LV5/b;->e:LF2/e;

    invoke-virtual {p0, p1, p2}, LF2/e;->h(LC2/b;Z)V

    return-void
.end method

.method public final k(LF2/b;Z)V
    .registers 4

    const-string v0, "cell"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LV5/b;->d:LF2/e;

    invoke-virtual {v0, p1, p2}, LF2/e;->i(LF2/b;Z)V

    iget-object p0, p0, LV5/b;->e:LF2/e;

    invoke-virtual {p0, p1, p2}, LF2/e;->i(LF2/b;Z)V

    return-void
.end method

.method public final l(Landroid/graphics/Rect;Z)V
    .registers 4

    const-string v0, "r"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LV5/b;->d:LF2/e;

    invoke-virtual {v0, p1, p2}, LF2/e;->j(Landroid/graphics/Rect;Z)V

    iget-object p0, p0, LV5/b;->e:LF2/e;

    invoke-virtual {p0, p1, p2}, LF2/e;->j(Landroid/graphics/Rect;Z)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 5

    iget-object v0, p0, LV5/b;->d:LF2/e;

    iget-object v1, p0, LV5/b;->e:LF2/e;

    invoke-direct {p0}, LV5/b;->f()LF2/e;

    move-result-object p0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "occupied4X4="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " \n occupied4X2="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " \n curOccupied="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
