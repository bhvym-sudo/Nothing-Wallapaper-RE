.class public Lc8/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La8/c;


# instance fields
.field public a:Lc8/b;

.field public b:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()I
    .registers 1

    iget-object p0, p0, Lc8/a;->a:Lc8/b;

    iget p0, p0, Lc8/b;->a:I

    return p0
.end method

.method public c()I
    .registers 7

    const/4 v0, 0x0

    :try_start_1
    iget-object p0, p0, Lc8/a;->b:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lc8/c;

    iget-object v1, p0, Lc8/c;->b:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move v2, v0

    :cond_16
    :goto_16
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_42

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, La8/e;

    iget-object v4, v3, La8/e;->a:La8/b;

    iget-object v4, v4, La8/b;->a:Ljava/lang/String;

    const-string v5, "continuous"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_38

    iget-object v3, v3, La8/e;->a:La8/b;

    iget v4, v3, La8/b;->b:I

    iget v3, v3, La8/b;->c:I

    add-int/2addr v4, v3

    goto :goto_3e

    :catch_36
    move-exception p0

    goto :goto_46

    :cond_38
    iget-object v3, v3, La8/e;->a:La8/b;

    iget v3, v3, La8/b;->b:I

    add-int/lit8 v4, v3, 0x30

    :goto_3e
    if-le v4, v2, :cond_16

    move v2, v4

    goto :goto_16

    :cond_42
    iget p0, p0, Lc8/c;->a:I
    :try_end_44
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_44} :catch_36

    add-int/2addr v2, p0

    return v2

    :goto_46
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    return v0
.end method

.method public d(I)I
    .registers 7

    const/4 v0, 0x0

    move v1, v0

    :goto_2
    :try_start_2
    iget-object v2, p0, Lc8/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_62

    move v2, v0

    :goto_b
    iget-object v3, p0, Lc8/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc8/c;

    iget-object v3, v3, Lc8/c;->b:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_5b

    iget-object v3, p0, Lc8/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc8/c;

    iget v3, v3, Lc8/c;->a:I

    if-gt v3, p1, :cond_49

    iget-object v3, p0, Lc8/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc8/c;

    iget v3, v3, Lc8/c;->a:I

    iget-object v4, p0, Lc8/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lc8/c;

    iget-object v4, v4, Lc8/c;->b:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, La8/e;

    iget-object v4, v4, La8/e;->a:La8/b;

    iget v4, v4, La8/b;->b:I

    add-int/2addr v3, v4

    if-lt v3, p1, :cond_49

    return v1

    :cond_49
    iget-object v3, p0, Lc8/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc8/c;

    iget v3, v3, Lc8/c;->a:I
    :try_end_53
    .catchall {:try_start_2 .. :try_end_53} :catchall_5e

    if-le v3, p1, :cond_58

    add-int/lit8 v1, v1, -0x1

    return v1

    :cond_58
    add-int/lit8 v2, v2, 0x1

    goto :goto_b

    :cond_5b
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :catchall_5e
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_62
    const/high16 p0, -0x80000000

    return p0
.end method
