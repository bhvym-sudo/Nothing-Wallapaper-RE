.class public final LX8/g$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LX8/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .registers 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/h;)V
    .registers 2

    .line 1
    invoke-direct {p0}, LX8/g$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LP8/B;)Ljava/util/List;
    .registers 7

    const-string p0, "request"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LP8/B;->e()LP8/u;

    move-result-object p0

    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p0}, LP8/u;->size()I

    move-result v1

    add-int/lit8 v1, v1, 0x4

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v1, LX8/c;

    sget-object v2, LX8/c;->g:Le9/h;

    invoke-virtual {p1}, LP8/B;->g()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, LX8/c;-><init>(Le9/h;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, LX8/c;

    sget-object v2, LX8/c;->h:Le9/h;

    sget-object v3, LV8/i;->a:LV8/i;

    invoke-virtual {p1}, LP8/B;->j()LP8/v;

    move-result-object v4

    invoke-virtual {v3, v4}, LV8/i;->c(LP8/v;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, LX8/c;-><init>(Le9/h;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v1, "Host"

    invoke-virtual {p1, v1}, LP8/B;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_48

    new-instance v2, LX8/c;

    sget-object v3, LX8/c;->j:Le9/h;

    invoke-direct {v2, v3, v1}, LX8/c;-><init>(Le9/h;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_48
    new-instance v1, LX8/c;

    sget-object v2, LX8/c;->i:Le9/h;

    invoke-virtual {p1}, LP8/B;->j()LP8/v;

    move-result-object p1

    invoke-virtual {p1}, LP8/v;->r()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, v2, p1}, LX8/c;-><init>(Le9/h;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, LP8/u;->size()I

    move-result p1

    const/4 v1, 0x0

    :goto_5f
    if-ge v1, p1, :cond_a2

    invoke-virtual {p0, v1}, LP8/u;->b(I)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v4, "US"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "this as java.lang.String).toLowerCase(locale)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LX8/g;->i()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_93

    const-string v3, "te"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_9f

    invoke-virtual {p0, v1}, LP8/u;->m(I)Ljava/lang/String;

    move-result-object v3

    const-string v4, "trailers"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_9f

    :cond_93
    new-instance v3, LX8/c;

    invoke-virtual {p0, v1}, LP8/u;->m(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v2, v4}, LX8/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_9f
    add-int/lit8 v1, v1, 0x1

    goto :goto_5f

    :cond_a2
    return-object v0
.end method

.method public final b(LP8/u;LP8/A;)LP8/D$a;
    .registers 9

    const-string p0, "headerBlock"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "protocol"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, LP8/u$a;

    invoke-direct {p0}, LP8/u$a;-><init>()V

    invoke-virtual {p1}, LP8/u;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_15
    if-ge v2, v0, :cond_4f

    invoke-virtual {p1, v2}, LP8/u;->b(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v2}, LP8/u;->m(I)Ljava/lang/String;

    move-result-object v4

    const-string v5, ":status"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3f

    sget-object v1, LV8/k;->d:LV8/k$a;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "HTTP/1.1 "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, LV8/k$a;->a(Ljava/lang/String;)LV8/k;

    move-result-object v1

    goto :goto_4c

    :cond_3f
    invoke-static {}, LX8/g;->j()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_4c

    invoke-virtual {p0, v3, v4}, LP8/u$a;->d(Ljava/lang/String;Ljava/lang/String;)LP8/u$a;

    :cond_4c
    :goto_4c
    add-int/lit8 v2, v2, 0x1

    goto :goto_15

    :cond_4f
    if-eqz v1, :cond_6f

    new-instance p1, LP8/D$a;

    invoke-direct {p1}, LP8/D$a;-><init>()V

    invoke-virtual {p1, p2}, LP8/D$a;->p(LP8/A;)LP8/D$a;

    move-result-object p1

    iget p2, v1, LV8/k;->b:I

    invoke-virtual {p1, p2}, LP8/D$a;->g(I)LP8/D$a;

    move-result-object p1

    iget-object p2, v1, LV8/k;->c:Ljava/lang/String;

    invoke-virtual {p1, p2}, LP8/D$a;->m(Ljava/lang/String;)LP8/D$a;

    move-result-object p1

    invoke-virtual {p0}, LP8/u$a;->f()LP8/u;

    move-result-object p0

    invoke-virtual {p1, p0}, LP8/D$a;->k(LP8/u;)LP8/D$a;

    move-result-object p0

    return-object p0

    :cond_6f
    new-instance p0, Ljava/net/ProtocolException;

    const-string p1, "Expected \':status\' header not present"

    invoke-direct {p0, p1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
