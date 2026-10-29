.class public final LZ8/h$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LZ8/h;
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
    invoke-direct {p0}, LZ8/h$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(LZ8/h$a;)LZ8/h;
    .registers 1

    invoke-direct {p0}, LZ8/h$a;->f()LZ8/h;

    move-result-object p0

    return-object p0
.end method

.method private final d()LZ8/h;
    .registers 1

    sget-object p0, La9/c;->a:La9/c;

    invoke-virtual {p0}, La9/c;->b()V

    sget-object p0, LZ8/a;->e:LZ8/a$a;

    invoke-virtual {p0}, LZ8/a$a;->a()LZ8/h;

    move-result-object p0

    if-nez p0, :cond_16

    sget-object p0, LZ8/b;->f:LZ8/b$a;

    invoke-virtual {p0}, LZ8/b$a;->a()LZ8/h;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    :cond_16
    return-object p0
.end method

.method private final e()LZ8/h;
    .registers 2

    invoke-direct {p0}, LZ8/h$a;->j()Z

    move-result v0

    if-eqz v0, :cond_f

    sget-object v0, LZ8/d;->e:LZ8/d$a;

    invoke-virtual {v0}, LZ8/d$a;->b()LZ8/d;

    move-result-object v0

    if-eqz v0, :cond_f

    return-object v0

    :cond_f
    invoke-direct {p0}, LZ8/h$a;->i()Z

    move-result v0

    if-eqz v0, :cond_1e

    sget-object v0, LZ8/c;->e:LZ8/c$a;

    invoke-virtual {v0}, LZ8/c$a;->a()LZ8/c;

    move-result-object v0

    if-eqz v0, :cond_1e

    return-object v0

    :cond_1e
    invoke-direct {p0}, LZ8/h$a;->k()Z

    move-result p0

    if-eqz p0, :cond_2d

    sget-object p0, LZ8/g;->e:LZ8/g$a;

    invoke-virtual {p0}, LZ8/g$a;->a()LZ8/g;

    move-result-object p0

    if-eqz p0, :cond_2d

    return-object p0

    :cond_2d
    sget-object p0, LZ8/f;->d:LZ8/f$a;

    invoke-virtual {p0}, LZ8/f$a;->a()LZ8/f;

    move-result-object p0

    if-eqz p0, :cond_36

    return-object p0

    :cond_36
    sget-object p0, LZ8/e;->i:LZ8/e$b;

    invoke-virtual {p0}, LZ8/e$b;->a()LZ8/h;

    move-result-object p0

    if-eqz p0, :cond_3f

    return-object p0

    :cond_3f
    new-instance p0, LZ8/h;

    invoke-direct {p0}, LZ8/h;-><init>()V

    return-object p0
.end method

.method private final f()LZ8/h;
    .registers 2

    invoke-virtual {p0}, LZ8/h$a;->h()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-direct {p0}, LZ8/h$a;->d()LZ8/h;

    move-result-object p0

    return-object p0

    :cond_b
    invoke-direct {p0}, LZ8/h$a;->e()LZ8/h;

    move-result-object p0

    return-object p0
.end method

.method private final i()Z
    .registers 2

    invoke-static {}, Ljava/security/Security;->getProviders()[Ljava/security/Provider;

    move-result-object p0

    const/4 v0, 0x0

    aget-object p0, p0, v0

    invoke-virtual {p0}, Ljava/security/Provider;->getName()Ljava/lang/String;

    move-result-object p0

    const-string v0, "BC"

    invoke-static {v0, p0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private final j()Z
    .registers 2

    invoke-static {}, Ljava/security/Security;->getProviders()[Ljava/security/Provider;

    move-result-object p0

    const/4 v0, 0x0

    aget-object p0, p0, v0

    invoke-virtual {p0}, Ljava/security/Provider;->getName()Ljava/lang/String;

    move-result-object p0

    const-string v0, "Conscrypt"

    invoke-static {v0, p0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private final k()Z
    .registers 2

    invoke-static {}, Ljava/security/Security;->getProviders()[Ljava/security/Provider;

    move-result-object p0

    const/4 v0, 0x0

    aget-object p0, p0, v0

    invoke-virtual {p0}, Ljava/security/Provider;->getName()Ljava/lang/String;

    move-result-object p0

    const-string v0, "OpenJSSE"

    invoke-static {v0, p0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final b(Ljava/util/List;)Ljava/util/List;
    .registers 5

    const-string p0, "protocols"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_10
    :goto_10
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_25

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LP8/A;

    sget-object v2, LP8/A;->s:LP8/A;

    if-eq v1, v2, :cond_10

    invoke-interface {p0, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_10

    :cond_25
    new-instance p1, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-static {p0, v0}, Li8/s;->u(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_34
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_48

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LP8/A;

    invoke-virtual {v0}, LP8/A;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_34

    :cond_48
    return-object p1
.end method

.method public final c(Ljava/util/List;)[B
    .registers 4

    const-string v0, "protocols"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Le9/e;

    invoke-direct {v0}, Le9/e;-><init>()V

    invoke-virtual {p0, p1}, LZ8/h$a;->b(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_12
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_29

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {v0, v1}, Le9/e;->m1(I)Le9/e;

    invoke-virtual {v0, p1}, Le9/e;->u1(Ljava/lang/String;)Le9/e;

    goto :goto_12

    :cond_29
    invoke-virtual {v0}, Le9/e;->t0()[B

    move-result-object p0

    return-object p0
.end method

.method public final g()LZ8/h;
    .registers 1

    invoke-static {}, LZ8/h;->a()LZ8/h;

    move-result-object p0

    return-object p0
.end method

.method public final h()Z
    .registers 2

    const-string p0, "java.vm.name"

    invoke-static {p0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "Dalvik"

    invoke-static {v0, p0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method
