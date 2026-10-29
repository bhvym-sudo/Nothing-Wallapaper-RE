.class public final Lx6/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx6/q;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx6/d$a;,
        Lx6/d$b;
    }
.end annotation


# static fields
.field public static final v:Lx6/d$a;


# instance fields
.field private final q:Lx6/r;

.field private final r:LF8/L;

.field private final s:Ljava/util/Map;

.field private final t:Ljava/util/Map;

.field private final u:Lq6/b;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lx6/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lx6/d$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lx6/d;->v:Lx6/d$a;

    return-void
.end method

.method public constructor <init>(Lx6/r;)V
    .registers 3

    const-string v0, "cache"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx6/d;->q:Lx6/r;

    const/4 p1, 0x0

    const/4 v0, 0x1

    invoke-static {p1, v0, p1}, LF8/T0;->b(LF8/x0;ILjava/lang/Object;)LF8/y;

    move-result-object p1

    invoke-static {}, LF8/b0;->b()LF8/I;

    move-result-object v0

    invoke-interface {p1, v0}, Lm8/i;->z(Lm8/i;)Lm8/i;

    move-result-object p1

    invoke-static {p1}, LF8/M;->a(Lm8/i;)LF8/L;

    move-result-object p1

    iput-object p1, p0, Lx6/d;->r:LF8/L;

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lx6/d;->s:Ljava/util/Map;

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lx6/d;->t:Ljava/util/Map;

    new-instance p1, Lq6/b;

    const-string v0, "EffectImageAsyncCache"

    invoke-direct {p1, v0}, Lq6/b;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lx6/d;->u:Lq6/b;

    return-void
.end method

.method public static final synthetic a(Lx6/d;)Lq6/b;
    .registers 1

    iget-object p0, p0, Lx6/d;->u:Lq6/b;

    return-object p0
.end method

.method public static final synthetic b(Lx6/d;)Ljava/util/Map;
    .registers 1

    iget-object p0, p0, Lx6/d;->t:Ljava/util/Map;

    return-object p0
.end method

.method public static final synthetic f(Lx6/d;)Ljava/util/Map;
    .registers 1

    iget-object p0, p0, Lx6/d;->s:Ljava/util/Map;

    return-object p0
.end method

.method public static final synthetic g(Lx6/d;Lx6/d$b;)V
    .registers 2

    invoke-direct {p0, p1}, Lx6/d;->j(Lx6/d$b;)V

    return-void
.end method

.method private final j(Lx6/d$b;)V
    .registers 16

    invoke-virtual {p1}, Lx6/d$b;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lx6/d$b;->d()Lw6/d;

    move-result-object v3

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v5

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    iget-object v0, p0, Lx6/d;->s:Ljava/util/Map;

    invoke-interface {v0, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lx6/d;->u:Lq6/b;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "launch job id = "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ",key "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "."

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lq6/b;->a(Ljava/lang/String;)V

    iget-object v9, p0, Lx6/d;->r:LF8/L;

    new-instance v0, Lx6/d$c;

    const/4 v8, 0x0

    move-object v1, p0

    move-object v4, p1

    invoke-direct/range {v0 .. v8}, Lx6/d$c;-><init>(Lx6/d;Ljava/lang/String;Lw6/d;Lx6/d$b;IJLm8/e;)V

    const/4 v12, 0x3

    const/4 v13, 0x0

    move-object v8, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v11, v0

    invoke-static/range {v8 .. v13}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    move-result-object p0

    invoke-virtual {v4, p0}, Lx6/d$b;->e(LF8/x0;)V

    return-void
.end method


# virtual methods
.method public declared-synchronized A(Lv8/l;)Ljava/util/List;
    .registers 6

    monitor-enter p0

    :try_start_1
    const-string v0, "filter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lx6/d;->s:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_17
    :goto_17
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_33

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p1, v2}, Lv8/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_17

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_17

    :catchall_31
    move-exception p1

    goto :goto_47

    :cond_33
    iget-object v0, p0, Lx6/d;->q:Lx6/r;

    invoke-interface {v0, p1}, Lx6/r;->A(Lv8/l;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {v1, p1}, Li8/s;->g0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Li8/s;->M(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1
    :try_end_45
    .catchall {:try_start_1 .. :try_end_45} :catchall_31

    monitor-exit p0

    return-object p1

    :goto_47
    :try_start_47
    monitor-exit p0
    :try_end_48
    .catchall {:try_start_47 .. :try_end_48} :catchall_31

    throw p1
.end method

.method public declared-synchronized L(Ljava/lang/String;Lw6/d;Lv8/l;)V
    .registers 7

    monitor-enter p0

    :try_start_1
    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "result"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lx6/d;->s:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx6/d$b;

    if-eqz v0, :cond_60

    invoke-virtual {v0}, Lx6/d$b;->d()Lw6/d;

    move-result-object v1

    if-ne v1, p2, :cond_42

    iget-object p2, p0, Lx6/d;->u:Lq6/b;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "putAsync but the result is already running, skip it, "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lq6/b;->a(Ljava/lang/String;)V

    if-eqz p3, :cond_5e

    invoke-virtual {v0}, Lx6/d$b;->a()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_5e

    :catchall_40
    move-exception p1

    goto :goto_6a

    :cond_42
    new-instance v0, Lx6/d$b;

    invoke-direct {v0, p1, p2, p3}, Lx6/d$b;-><init>(Ljava/lang/String;Lw6/d;Lv8/l;)V

    iget-object p2, p0, Lx6/d;->t:Ljava/util/Map;

    invoke-interface {p2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx6/d$b;

    if-eqz p1, :cond_5e

    invoke-virtual {v0}, Lx6/d$b;->a()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p1}, Lx6/d$b;->a()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p2, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
    :try_end_5e
    .catchall {:try_start_1 .. :try_end_5e} :catchall_40

    :cond_5e
    :goto_5e
    monitor-exit p0

    return-void

    :cond_60
    :try_start_60
    new-instance v0, Lx6/d$b;

    invoke-direct {v0, p1, p2, p3}, Lx6/d$b;-><init>(Ljava/lang/String;Lw6/d;Lv8/l;)V

    invoke-direct {p0, v0}, Lx6/d;->j(Lx6/d$b;)V
    :try_end_68
    .catchall {:try_start_60 .. :try_end_68} :catchall_40

    monitor-exit p0

    return-void

    :goto_6a
    :try_start_6a
    monitor-exit p0
    :try_end_6b
    .catchall {:try_start_6a .. :try_end_6b} :catchall_40

    throw p1
.end method

.method public declared-synchronized V(Ljava/util/List;)V
    .registers 11

    monitor-enter p0

    :try_start_1
    iget-object v0, p0, Lx6/d;->s:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_12
    :goto_12
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_52

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/lang/String;

    const/4 v4, 0x0

    if-eqz p1, :cond_4c

    move-object v5, p1

    check-cast v5, Ljava/lang/Iterable;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_29
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4a

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Ljava/lang/String;

    invoke-static {}, Lx6/o;->e()Lv8/p;

    move-result-object v8

    invoke-interface {v8, v7, v3}, Lv8/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    if-eqz v7, :cond_29

    move-object v4, v6

    goto :goto_4a

    :catchall_48
    move-exception p1

    goto :goto_97

    :cond_4a
    :goto_4a
    check-cast v4, Ljava/lang/String;

    :cond_4c
    if-eqz v4, :cond_12

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_12

    :cond_52
    iget-object v0, p0, Lx6/d;->s:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_63
    :goto_63
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ljava/lang/String;

    invoke-interface {v1, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_63

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_63

    :cond_7a
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_7e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_90

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lx6/d;->s:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_7e

    :cond_90
    iget-object v0, p0, Lx6/d;->q:Lx6/r;

    invoke-interface {v0, p1}, Lx6/r;->V(Ljava/util/List;)V
    :try_end_95
    .catchall {:try_start_1 .. :try_end_95} :catchall_48

    monitor-exit p0

    return-void

    :goto_97
    :try_start_97
    monitor-exit p0
    :try_end_98
    .catchall {:try_start_97 .. :try_end_98} :catchall_48

    throw p1
.end method

.method public W(Ljava/lang/String;)Ljava/io/InputStream;
    .registers 3

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lx6/d;->q:Lx6/r;

    invoke-interface {p0, p1}, Lx6/r;->W(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object p0

    return-object p0
.end method

.method public close()V
    .registers 1

    iget-object p0, p0, Lx6/d;->q:Lx6/r;

    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    return-void
.end method

.method public flush()V
    .registers 1

    iget-object p0, p0, Lx6/d;->q:Lx6/r;

    invoke-interface {p0}, Ljava/io/Flushable;->flush()V

    return-void
.end method

.method public declared-synchronized get(Ljava/lang/String;)Lw6/d;
    .registers 6

    monitor-enter p0

    :try_start_1
    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lx6/d;->s:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx6/d$b;

    if-eqz v0, :cond_33

    iget-object v1, p0, Lx6/d;->u:Lq6/b;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "get result from running jobs for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "."

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lq6/b;->a(Ljava/lang/String;)V

    invoke-virtual {v0}, Lx6/d$b;->d()Lw6/d;

    move-result-object p1
    :try_end_2f
    .catchall {:try_start_1 .. :try_end_2f} :catchall_31

    monitor-exit p0

    return-object p1

    :catchall_31
    move-exception p1

    goto :goto_3b

    :cond_33
    :try_start_33
    iget-object v0, p0, Lx6/d;->q:Lx6/r;

    invoke-interface {v0, p1}, Lx6/r;->get(Ljava/lang/String;)Lw6/d;

    move-result-object p1
    :try_end_39
    .catchall {:try_start_33 .. :try_end_39} :catchall_31

    monitor-exit p0

    return-object p1

    :goto_3b
    :try_start_3b
    monitor-exit p0
    :try_end_3c
    .catchall {:try_start_3b .. :try_end_3c} :catchall_31

    throw p1
.end method

.method public declared-synchronized getCount()I
    .registers 3

    monitor-enter p0

    :try_start_1
    iget-object v0, p0, Lx6/d;->q:Lx6/r;

    invoke-interface {v0}, Lx6/r;->getCount()I

    move-result v0

    iget-object v1, p0, Lx6/d;->s:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v1
    :try_end_d
    .catchall {:try_start_1 .. :try_end_d} :catchall_10

    add-int/2addr v0, v1

    monitor-exit p0

    return v0

    :catchall_10
    move-exception v0

    :try_start_11
    monitor-exit p0
    :try_end_12
    .catchall {:try_start_11 .. :try_end_12} :catchall_10

    throw v0
.end method

.method public j0(Ljava/lang/String;Lw6/d;Lm8/e;)Ljava/lang/Object;
    .registers 4

    iget-object p0, p0, Lx6/d;->q:Lx6/r;

    invoke-interface {p0, p1, p2, p3}, Lx6/r;->j0(Ljava/lang/String;Lw6/d;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public declared-synchronized p(Ljava/lang/String;)V
    .registers 6

    monitor-enter p0

    :try_start_1
    const-string v0, "group"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lx6/d;->u:Lq6/b;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "remove group "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lq6/b;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lx6/d;->s:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_32
    :goto_32
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4f

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lx6/o;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_32

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_32

    :catchall_4d
    move-exception p1

    goto :goto_6a

    :cond_4f
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_53
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_63

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p0, v1}, Lx6/d;->remove(Ljava/lang/String;)Z

    goto :goto_53

    :cond_63
    iget-object v0, p0, Lx6/d;->q:Lx6/r;

    invoke-interface {v0, p1}, Lx6/r;->p(Ljava/lang/String;)V
    :try_end_68
    .catchall {:try_start_1 .. :try_end_68} :catchall_4d

    monitor-exit p0

    return-void

    :goto_6a
    :try_start_6a
    monitor-exit p0
    :try_end_6b
    .catchall {:try_start_6a .. :try_end_6b} :catchall_4d

    throw p1
.end method

.method public declared-synchronized remove(Ljava/lang/String;)Z
    .registers 6

    monitor-enter p0

    :try_start_1
    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lx6/d;->u:Lq6/b;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "remove key "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lq6/b;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lx6/d;->s:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx6/d$b;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_3c

    invoke-virtual {v0}, Lx6/d$b;->b()LF8/x0;

    move-result-object v0

    if-eqz v0, :cond_3a

    const/4 v3, 0x0

    invoke-static {v0, v3, v2, v3}, LF8/x0$a;->a(LF8/x0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    goto :goto_3a

    :catchall_38
    move-exception p1

    goto :goto_4a

    :cond_3a
    :goto_3a
    move v0, v2

    goto :goto_3d

    :cond_3c
    move v0, v1

    :goto_3d
    iget-object v3, p0, Lx6/d;->q:Lx6/r;

    invoke-interface {v3, p1}, Lx6/r;->remove(Ljava/lang/String;)Z

    move-result p1
    :try_end_43
    .catchall {:try_start_1 .. :try_end_43} :catchall_38

    if-nez p1, :cond_47

    if-eqz v0, :cond_48

    :cond_47
    move v1, v2

    :cond_48
    monitor-exit p0

    return v1

    :goto_4a
    :try_start_4a
    monitor-exit p0
    :try_end_4b
    .catchall {:try_start_4a .. :try_end_4b} :catchall_38

    throw p1
.end method

.method public y()Z
    .registers 1

    iget-object p0, p0, Lx6/d;->q:Lx6/r;

    invoke-interface {p0}, Lx6/r;->y()Z

    move-result p0

    return p0
.end method
