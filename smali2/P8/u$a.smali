.class public final LP8/u$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP8/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/util/List;


# direct methods
.method public constructor <init>()V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, LP8/u$a;->a:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;)LP8/u$a;
    .registers 4

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LP8/u;->r:LP8/u$b;

    invoke-static {v0, p1}, LP8/u$b;->a(LP8/u$b;Ljava/lang/String;)V

    invoke-static {v0, p2, p1}, LP8/u$b;->b(LP8/u$b;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, LP8/u$a;->d(Ljava/lang/String;Ljava/lang/String;)LP8/u$a;

    return-object p0
.end method

.method public final b(LP8/u;)LP8/u$a;
    .registers 6

    const-string v0, "headers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LP8/u;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_a
    if-ge v1, v0, :cond_1a

    invoke-virtual {p1, v1}, LP8/u;->b(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v1}, LP8/u;->m(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v2, v3}, LP8/u$a;->d(Ljava/lang/String;Ljava/lang/String;)LP8/u$a;

    add-int/lit8 v1, v1, 0x1

    goto :goto_a

    :cond_1a
    return-object p0
.end method

.method public final c(Ljava/lang/String;)LP8/u$a;
    .registers 9

    const-string v0, "line"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/16 v2, 0x3a

    const/4 v3, 0x1

    const/4 v4, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v6}, LE8/i;->c0(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result p1

    const/4 v0, -0x1

    const-string v2, "this as java.lang.String).substring(startIndex)"

    if-eq p1, v0, :cond_2a

    invoke-virtual {v1, v4, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const-string v4, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    add-int/2addr p1, v3

    invoke-virtual {v1, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, p1}, LP8/u$a;->d(Ljava/lang/String;Ljava/lang/String;)LP8/u$a;

    return-object p0

    :cond_2a
    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result p1

    const/16 v0, 0x3a

    const-string v4, ""

    if-ne p1, v0, :cond_3f

    invoke-virtual {v1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v4, p1}, LP8/u$a;->d(Ljava/lang/String;Ljava/lang/String;)LP8/u$a;

    return-object p0

    :cond_3f
    invoke-virtual {p0, v4, v1}, LP8/u$a;->d(Ljava/lang/String;Ljava/lang/String;)LP8/u$a;

    return-object p0
.end method

.method public final d(Ljava/lang/String;Ljava/lang/String;)LP8/u$a;
    .registers 4

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LP8/u$a;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, LP8/u$a;->a:Ljava/util/List;

    invoke-static {p2}, LE8/i;->N0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final e(Ljava/lang/String;Ljava/lang/String;)LP8/u$a;
    .registers 4

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LP8/u;->r:LP8/u$b;

    invoke-static {v0, p1}, LP8/u$b;->a(LP8/u$b;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, LP8/u$a;->d(Ljava/lang/String;Ljava/lang/String;)LP8/u$a;

    return-object p0
.end method

.method public final f()LP8/u;
    .registers 3

    new-instance v0, LP8/u;

    iget-object p0, p0, LP8/u$a;->a:Ljava/util/List;

    check-cast p0, Ljava/util/Collection;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    invoke-interface {p0, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/lang/String;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LP8/u;-><init>([Ljava/lang/String;Lkotlin/jvm/internal/h;)V

    return-object v0
.end method

.method public final g()Ljava/util/List;
    .registers 1

    iget-object p0, p0, LP8/u$a;->a:Ljava/util/List;

    return-object p0
.end method

.method public final h(Ljava/lang/String;)LP8/u$a;
    .registers 5

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    :goto_6
    iget-object v1, p0, LP8/u$a;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_2c

    iget-object v1, p0, LP8/u$a;->a:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const/4 v2, 0x1

    invoke-static {p1, v1, v2}, LE8/i;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_29

    iget-object v1, p0, LP8/u$a;->a:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    iget-object v1, p0, LP8/u$a;->a:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    add-int/lit8 v0, v0, -0x2

    :cond_29
    add-int/lit8 v0, v0, 0x2

    goto :goto_6

    :cond_2c
    return-object p0
.end method

.method public final i(Ljava/lang/String;Ljava/lang/String;)LP8/u$a;
    .registers 4

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LP8/u;->r:LP8/u$b;

    invoke-static {v0, p1}, LP8/u$b;->a(LP8/u$b;Ljava/lang/String;)V

    invoke-static {v0, p2, p1}, LP8/u$b;->b(LP8/u$b;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LP8/u$a;->h(Ljava/lang/String;)LP8/u$a;

    invoke-virtual {p0, p1, p2}, LP8/u$a;->d(Ljava/lang/String;Ljava/lang/String;)LP8/u$a;

    return-object p0
.end method
