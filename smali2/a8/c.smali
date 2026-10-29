.class public interface abstract La8/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static b(La8/c;)Z
    .registers 5

    const/4 v0, 0x0

    if-nez p0, :cond_4

    return v0

    :cond_4
    invoke-interface {p0}, La8/c;->a()I

    move-result v1

    const/4 v2, 0x1

    if-ne v2, v1, :cond_26

    check-cast p0, Lb8/a;

    iget-object v1, p0, Lb8/a;->b:Ljava/util/ArrayList;

    if-eqz v1, :cond_25

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lt v1, v2, :cond_25

    iget-object p0, p0, Lb8/a;->b:Ljava/util/ArrayList;

    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, La8/e;

    iget-object p0, p0, La8/e;->a:La8/b;

    if-nez p0, :cond_24

    goto :goto_25

    :cond_24
    return v2

    :cond_25
    :goto_25
    return v0

    :cond_26
    invoke-interface {p0}, La8/c;->a()I

    move-result v1

    const/4 v3, 0x2

    if-ne v3, v1, :cond_6b

    check-cast p0, Lc8/a;

    iget-object v1, p0, Lc8/a;->b:Ljava/util/ArrayList;

    if-eqz v1, :cond_6b

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lt v1, v2, :cond_6b

    iget-object v1, p0, Lc8/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc8/c;

    iget-object v1, v1, Lc8/c;->b:Ljava/util/ArrayList;

    if-eqz v1, :cond_6b

    iget-object v1, p0, Lc8/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc8/c;

    iget-object v1, v1, Lc8/c;->b:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lt v1, v2, :cond_6b

    iget-object p0, p0, Lc8/a;->b:Ljava/util/ArrayList;

    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lc8/c;

    iget-object p0, p0, Lc8/c;->b:Ljava/util/ArrayList;

    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, La8/e;

    iget-object p0, p0, La8/e;->a:La8/b;

    if-nez p0, :cond_6a

    goto :goto_6b

    :cond_6a
    return v2

    :cond_6b
    :goto_6b
    return v0
.end method


# virtual methods
.method public abstract a()I
.end method

.method public abstract c()I
.end method
