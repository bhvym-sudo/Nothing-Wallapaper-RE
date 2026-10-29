.class final LP8/g$c;
.super Lkotlin/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lv8/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP8/g;->a(Ljava/lang/String;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic r:LP8/g;

.field final synthetic s:Ljava/util/List;

.field final synthetic t:Ljava/lang/String;


# direct methods
.method constructor <init>(LP8/g;Ljava/util/List;Ljava/lang/String;)V
    .registers 4

    iput-object p1, p0, LP8/g$c;->r:LP8/g;

    iput-object p2, p0, LP8/g$c;->s:Ljava/util/List;

    iput-object p3, p0, LP8/g$c;->t:Ljava/lang/String;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/o;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .registers 4

    iget-object v0, p0, LP8/g$c;->r:LP8/g;

    invoke-virtual {v0}, LP8/g;->d()Lc9/c;

    move-result-object v0

    if-eqz v0, :cond_12

    iget-object v1, p0, LP8/g$c;->s:Ljava/util/List;

    iget-object v2, p0, LP8/g$c;->t:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lc9/c;->a(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_14

    :cond_12
    iget-object v0, p0, LP8/g$c;->s:Ljava/util/List;

    :cond_14
    check-cast v0, Ljava/lang/Iterable;

    new-instance p0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Li8/s;->u(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {p0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_25
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/security/cert/Certificate;

    const-string v2, "null cannot be cast to non-null type java.security.cert.X509Certificate"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/security/cert/X509Certificate;

    invoke-interface {p0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_25

    :cond_3c
    return-object p0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .registers 1

    invoke-virtual {p0}, LP8/g$c;->a()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method
