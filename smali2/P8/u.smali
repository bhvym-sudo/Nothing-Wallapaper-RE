.class public final LP8/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;
.implements Lw8/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LP8/u$a;,
        LP8/u$b;
    }
.end annotation


# static fields
.field public static final r:LP8/u$b;


# instance fields
.field private final q:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LP8/u$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LP8/u$b;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LP8/u;->r:LP8/u$b;

    return-void
.end method

.method private constructor <init>([Ljava/lang/String;)V
    .registers 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LP8/u;->q:[Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>([Ljava/lang/String;Lkotlin/jvm/internal/h;)V
    .registers 3

    .line 1
    invoke-direct {p0, p1}, LP8/u;-><init>([Ljava/lang/String;)V

    return-void
.end method

.method public static final varargs g([Ljava/lang/String;)LP8/u;
    .registers 2

    sget-object v0, LP8/u;->r:LP8/u$b;

    invoke-virtual {v0, p0}, LP8/u$b;->g([Ljava/lang/String;)LP8/u;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ljava/lang/String;
    .registers 3

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LP8/u;->r:LP8/u$b;

    iget-object p0, p0, LP8/u;->q:[Ljava/lang/String;

    invoke-static {v0, p0, p1}, LP8/u$b;->c(LP8/u$b;[Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final b(I)Ljava/lang/String;
    .registers 2

    iget-object p0, p0, LP8/u;->q:[Ljava/lang/String;

    mul-int/lit8 p1, p1, 0x2

    aget-object p0, p0, p1

    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 3

    instance-of v0, p1, LP8/u;

    if-eqz v0, :cond_12

    iget-object p0, p0, LP8/u;->q:[Ljava/lang/String;

    check-cast p1, LP8/u;

    iget-object p1, p1, LP8/u;->q:[Ljava/lang/String;

    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_12

    const/4 p0, 0x1

    return p0

    :cond_12
    const/4 p0, 0x0

    return p0
.end method

.method public final f()LP8/u$a;
    .registers 3

    new-instance v0, LP8/u$a;

    invoke-direct {v0}, LP8/u$a;-><init>()V

    invoke-virtual {v0}, LP8/u$a;->g()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    iget-object p0, p0, LP8/u;->q:[Ljava/lang/String;

    invoke-static {v1, p0}, Li8/s;->A(Ljava/util/Collection;[Ljava/lang/Object;)Z

    return-object v0
.end method

.method public hashCode()I
    .registers 1

    iget-object p0, p0, LP8/u;->q:[Ljava/lang/String;

    invoke-static {p0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public iterator()Ljava/util/Iterator;
    .registers 6

    invoke-virtual {p0}, LP8/u;->size()I

    move-result v0

    new-array v1, v0, [Lh8/o;

    const/4 v2, 0x0

    :goto_7
    if-ge v2, v0, :cond_1a

    invoke-virtual {p0, v2}, LP8/u;->b(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v2}, LP8/u;->m(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object v3

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_7

    :cond_1a
    invoke-static {v1}, Lkotlin/jvm/internal/c;->a([Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method

.method public final m(I)Ljava/lang/String;
    .registers 2

    iget-object p0, p0, LP8/u;->q:[Ljava/lang/String;

    mul-int/lit8 p1, p1, 0x2

    add-int/lit8 p1, p1, 0x1

    aget-object p0, p0, p1

    return-object p0
.end method

.method public final n(Ljava/lang/String;)Ljava/util/List;
    .registers 7

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LP8/u;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_b
    if-ge v2, v0, :cond_2a

    invoke-virtual {p0, v2}, LP8/u;->b(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    invoke-static {p1, v3, v4}, LE8/i;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v3

    if-eqz v3, :cond_27

    if-nez v1, :cond_20

    new-instance v1, Ljava/util/ArrayList;

    const/4 v3, 0x2

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    :cond_20
    invoke-virtual {p0, v2}, LP8/u;->m(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_27
    add-int/lit8 v2, v2, 0x1

    goto :goto_b

    :cond_2a
    if-eqz v1, :cond_36

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    const-string p1, "{\n      Collections.unmodifiableList(result)\n    }"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    :cond_36
    invoke-static {}, Li8/s;->l()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public final size()I
    .registers 1

    iget-object p0, p0, LP8/u;->q:[Ljava/lang/String;

    array-length p0, p0

    div-int/lit8 p0, p0, 0x2

    return p0
.end method

.method public toString()Ljava/lang/String;
    .registers 7

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, LP8/u;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_a
    if-ge v2, v1, :cond_2f

    invoke-virtual {p0, v2}, LP8/u;->b(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v2}, LP8/u;->m(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ": "

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v3}, LQ8/d;->G(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_24

    const-string v4, "\u2588\u2588"

    :cond_24
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\n"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_a

    :cond_2f
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "StringBuilder().apply(builderAction).toString()"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
