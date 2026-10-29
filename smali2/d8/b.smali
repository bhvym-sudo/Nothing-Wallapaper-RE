.class public abstract Ld8/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static a(I)I
    .registers 3

    const/16 v0, 0x64

    const/16 v1, 0x32

    if-le p0, v1, :cond_9

    if-ge p0, v0, :cond_9

    return v1

    :cond_9
    if-le p0, v0, :cond_d

    add-int/lit8 p0, p0, -0x32

    :cond_d
    return p0
.end method

.method public static b(Lb8/a;)Ljava/lang/String;
    .registers 10

    const-string v0, "Intensity"

    const-string v1, "Frequency"

    const-string v2, "continuous"

    :try_start_6
    new-instance v3, Lorg/json/JSONStringer;

    invoke-direct {v3}, Lorg/json/JSONStringer;-><init>()V

    invoke-virtual {v3}, Lorg/json/JSONStringer;->object()Lorg/json/JSONStringer;

    const-string v4, "Metadata"

    invoke-virtual {v3, v4}, Lorg/json/JSONStringer;->key(Ljava/lang/String;)Lorg/json/JSONStringer;

    move-result-object v4

    invoke-virtual {v4}, Lorg/json/JSONStringer;->object()Lorg/json/JSONStringer;

    move-result-object v4

    const-string v5, "Created"

    invoke-virtual {v4, v5}, Lorg/json/JSONStringer;->key(Ljava/lang/String;)Lorg/json/JSONStringer;

    move-result-object v4

    iget-object v5, p0, Lb8/a;->a:Lb8/b;

    iget-object v5, v5, Lb8/b;->b:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lorg/json/JSONStringer;->value(Ljava/lang/Object;)Lorg/json/JSONStringer;

    move-result-object v4

    const-string v5, "Description"

    invoke-virtual {v4, v5}, Lorg/json/JSONStringer;->key(Ljava/lang/String;)Lorg/json/JSONStringer;

    move-result-object v4

    iget-object v5, p0, Lb8/a;->a:Lb8/b;

    iget-object v5, v5, Lb8/b;->c:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lorg/json/JSONStringer;->value(Ljava/lang/Object;)Lorg/json/JSONStringer;

    move-result-object v4

    const-string v5, "Version"

    invoke-virtual {v4, v5}, Lorg/json/JSONStringer;->key(Ljava/lang/String;)Lorg/json/JSONStringer;

    move-result-object v4

    iget-object v5, p0, Lb8/a;->a:Lb8/b;

    iget v5, v5, Lb8/b;->a:I

    int-to-long v5, v5

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONStringer;->value(J)Lorg/json/JSONStringer;

    move-result-object v4

    invoke-virtual {v4}, Lorg/json/JSONStringer;->endObject()Lorg/json/JSONStringer;

    const-string v4, "Pattern"

    invoke-virtual {v3, v4}, Lorg/json/JSONStringer;->key(Ljava/lang/String;)Lorg/json/JSONStringer;

    move-result-object v4

    invoke-virtual {v4}, Lorg/json/JSONStringer;->array()Lorg/json/JSONStringer;

    iget-object p0, p0, Lb8/a;->b:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_55
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_12c

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, La8/e;

    invoke-virtual {v3}, Lorg/json/JSONStringer;->object()Lorg/json/JSONStringer;

    const-string v5, "Event"

    invoke-virtual {v3, v5}, Lorg/json/JSONStringer;->key(Ljava/lang/String;)Lorg/json/JSONStringer;

    move-result-object v5

    invoke-virtual {v5}, Lorg/json/JSONStringer;->object()Lorg/json/JSONStringer;

    move-result-object v5

    const-string v6, "Type"

    invoke-virtual {v5, v6}, Lorg/json/JSONStringer;->key(Ljava/lang/String;)Lorg/json/JSONStringer;

    move-result-object v5

    iget-object v6, v4, La8/e;->a:La8/b;

    iget-object v6, v6, La8/b;->a:Ljava/lang/String;

    invoke-virtual {v5, v6}, Lorg/json/JSONStringer;->value(Ljava/lang/Object;)Lorg/json/JSONStringer;

    move-result-object v5

    const-string v6, "RelativeTime"

    invoke-virtual {v5, v6}, Lorg/json/JSONStringer;->key(Ljava/lang/String;)Lorg/json/JSONStringer;

    move-result-object v5

    iget-object v6, v4, La8/e;->a:La8/b;

    iget v6, v6, La8/b;->b:I

    int-to-long v6, v6

    invoke-virtual {v5, v6, v7}, Lorg/json/JSONStringer;->value(J)Lorg/json/JSONStringer;

    iget-object v5, v4, La8/e;->a:La8/b;

    iget-object v5, v5, La8/b;->a:Ljava/lang/String;

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_a2

    const-string v5, "Duration"

    invoke-virtual {v3, v5}, Lorg/json/JSONStringer;->key(Ljava/lang/String;)Lorg/json/JSONStringer;

    move-result-object v5

    iget-object v6, v4, La8/e;->a:La8/b;

    iget v6, v6, La8/b;->c:I

    int-to-long v6, v6

    invoke-virtual {v5, v6, v7}, Lorg/json/JSONStringer;->value(J)Lorg/json/JSONStringer;

    :cond_a2
    const-string v5, "Parameters"

    invoke-virtual {v3, v5}, Lorg/json/JSONStringer;->key(Ljava/lang/String;)Lorg/json/JSONStringer;

    move-result-object v5

    invoke-virtual {v5}, Lorg/json/JSONStringer;->object()Lorg/json/JSONStringer;

    move-result-object v5

    invoke-virtual {v5, v1}, Lorg/json/JSONStringer;->key(Ljava/lang/String;)Lorg/json/JSONStringer;

    move-result-object v5

    iget-object v6, v4, La8/e;->a:La8/b;

    iget-object v6, v6, La8/b;->e:La8/d;

    iget v6, v6, La8/d;->b:I

    int-to-long v6, v6

    invoke-virtual {v5, v6, v7}, Lorg/json/JSONStringer;->value(J)Lorg/json/JSONStringer;

    move-result-object v5

    invoke-virtual {v5, v0}, Lorg/json/JSONStringer;->key(Ljava/lang/String;)Lorg/json/JSONStringer;

    move-result-object v5

    iget-object v6, v4, La8/e;->a:La8/b;

    iget-object v6, v6, La8/b;->e:La8/d;

    iget v6, v6, La8/d;->a:I

    int-to-long v6, v6

    invoke-virtual {v5, v6, v7}, Lorg/json/JSONStringer;->value(J)Lorg/json/JSONStringer;

    iget-object v5, v4, La8/e;->a:La8/b;

    iget-object v5, v5, La8/b;->a:Ljava/lang/String;

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_11f

    const-string v5, "Curve"

    invoke-virtual {v3, v5}, Lorg/json/JSONStringer;->key(Ljava/lang/String;)Lorg/json/JSONStringer;

    move-result-object v5

    invoke-virtual {v5}, Lorg/json/JSONStringer;->array()Lorg/json/JSONStringer;

    iget-object v4, v4, La8/e;->a:La8/b;

    iget-object v4, v4, La8/b;->e:La8/d;

    iget-object v4, v4, La8/d;->c:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_e6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_11c

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, La8/a;

    invoke-virtual {v3}, Lorg/json/JSONStringer;->object()Lorg/json/JSONStringer;

    move-result-object v6

    invoke-virtual {v6, v1}, Lorg/json/JSONStringer;->key(Ljava/lang/String;)Lorg/json/JSONStringer;

    move-result-object v6

    iget v7, v5, La8/a;->c:I

    int-to-long v7, v7

    invoke-virtual {v6, v7, v8}, Lorg/json/JSONStringer;->value(J)Lorg/json/JSONStringer;

    move-result-object v6

    invoke-virtual {v6, v0}, Lorg/json/JSONStringer;->key(Ljava/lang/String;)Lorg/json/JSONStringer;

    move-result-object v6

    iget-wide v7, v5, La8/a;->b:D

    invoke-virtual {v6, v7, v8}, Lorg/json/JSONStringer;->value(D)Lorg/json/JSONStringer;

    move-result-object v6

    const-string v7, "Time"

    invoke-virtual {v6, v7}, Lorg/json/JSONStringer;->key(Ljava/lang/String;)Lorg/json/JSONStringer;

    move-result-object v6

    iget v5, v5, La8/a;->a:I

    int-to-long v7, v5

    invoke-virtual {v6, v7, v8}, Lorg/json/JSONStringer;->value(J)Lorg/json/JSONStringer;

    move-result-object v5

    invoke-virtual {v5}, Lorg/json/JSONStringer;->endObject()Lorg/json/JSONStringer;

    goto :goto_e6

    :cond_11c
    invoke-virtual {v3}, Lorg/json/JSONStringer;->endArray()Lorg/json/JSONStringer;

    :cond_11f
    invoke-virtual {v3}, Lorg/json/JSONStringer;->endObject()Lorg/json/JSONStringer;

    move-result-object v4

    invoke-virtual {v4}, Lorg/json/JSONStringer;->endObject()Lorg/json/JSONStringer;

    move-result-object v4

    invoke-virtual {v4}, Lorg/json/JSONStringer;->endObject()Lorg/json/JSONStringer;

    goto/16 :goto_55

    :cond_12c
    invoke-virtual {v3}, Lorg/json/JSONStringer;->endArray()Lorg/json/JSONStringer;

    move-result-object p0

    invoke-virtual {p0}, Lorg/json/JSONStringer;->endObject()Lorg/json/JSONStringer;

    invoke-virtual {v3}, Lorg/json/JSONStringer;->toString()Ljava/lang/String;

    move-result-object p0
    :try_end_137
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_137} :catch_138

    return-object p0

    :catch_138
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    const/4 p0, 0x0

    return-object p0
.end method

.method public static c(Lc8/a;)Ljava/lang/String;
    .registers 11

    const-string v0, "Intensity"

    const-string v1, "Frequency"

    const-string v2, "continuous"

    :try_start_6
    new-instance v3, Lorg/json/JSONStringer;

    invoke-direct {v3}, Lorg/json/JSONStringer;-><init>()V

    invoke-virtual {v3}, Lorg/json/JSONStringer;->object()Lorg/json/JSONStringer;

    const-string v4, "Metadata"

    invoke-virtual {v3, v4}, Lorg/json/JSONStringer;->key(Ljava/lang/String;)Lorg/json/JSONStringer;

    move-result-object v4

    invoke-virtual {v4}, Lorg/json/JSONStringer;->object()Lorg/json/JSONStringer;

    move-result-object v4

    const-string v5, "Created"

    invoke-virtual {v4, v5}, Lorg/json/JSONStringer;->key(Ljava/lang/String;)Lorg/json/JSONStringer;

    move-result-object v4

    iget-object v5, p0, Lc8/a;->a:Lc8/b;

    iget-object v5, v5, Lc8/b;->b:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lorg/json/JSONStringer;->value(Ljava/lang/Object;)Lorg/json/JSONStringer;

    move-result-object v4

    const-string v5, "Description"

    invoke-virtual {v4, v5}, Lorg/json/JSONStringer;->key(Ljava/lang/String;)Lorg/json/JSONStringer;

    move-result-object v4

    iget-object v5, p0, Lc8/a;->a:Lc8/b;

    iget-object v5, v5, Lc8/b;->c:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lorg/json/JSONStringer;->value(Ljava/lang/Object;)Lorg/json/JSONStringer;

    move-result-object v4

    const-string v5, "Version"

    invoke-virtual {v4, v5}, Lorg/json/JSONStringer;->key(Ljava/lang/String;)Lorg/json/JSONStringer;

    move-result-object v4

    iget-object v5, p0, Lc8/a;->a:Lc8/b;

    iget v5, v5, Lc8/b;->a:I

    int-to-long v5, v5

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONStringer;->value(J)Lorg/json/JSONStringer;

    move-result-object v4

    invoke-virtual {v4}, Lorg/json/JSONStringer;->endObject()Lorg/json/JSONStringer;

    const-string v4, "PatternList"

    invoke-virtual {v3, v4}, Lorg/json/JSONStringer;->key(Ljava/lang/String;)Lorg/json/JSONStringer;

    move-result-object v4

    invoke-virtual {v4}, Lorg/json/JSONStringer;->array()Lorg/json/JSONStringer;

    iget-object p0, p0, Lc8/a;->b:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_55
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_170

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lc8/c;

    invoke-virtual {v3}, Lorg/json/JSONStringer;->object()Lorg/json/JSONStringer;

    move-result-object v5

    const-string v6, "AbsoluteTime"

    invoke-virtual {v5, v6}, Lorg/json/JSONStringer;->key(Ljava/lang/String;)Lorg/json/JSONStringer;

    move-result-object v5

    iget v6, v4, Lc8/c;->a:I

    int-to-long v6, v6

    invoke-virtual {v5, v6, v7}, Lorg/json/JSONStringer;->value(J)Lorg/json/JSONStringer;

    move-result-object v5

    const-string v6, "Pattern"

    invoke-virtual {v5, v6}, Lorg/json/JSONStringer;->key(Ljava/lang/String;)Lorg/json/JSONStringer;

    move-result-object v5

    invoke-virtual {v5}, Lorg/json/JSONStringer;->array()Lorg/json/JSONStringer;

    iget-object v4, v4, Lc8/c;->b:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_81
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_167

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, La8/e;

    invoke-virtual {v3}, Lorg/json/JSONStringer;->object()Lorg/json/JSONStringer;

    const-string v6, "Event"

    invoke-virtual {v3, v6}, Lorg/json/JSONStringer;->key(Ljava/lang/String;)Lorg/json/JSONStringer;

    move-result-object v6

    invoke-virtual {v6}, Lorg/json/JSONStringer;->object()Lorg/json/JSONStringer;

    move-result-object v6

    const-string v7, "Index"

    invoke-virtual {v6, v7}, Lorg/json/JSONStringer;->key(Ljava/lang/String;)Lorg/json/JSONStringer;

    move-result-object v6

    iget-object v7, v5, La8/e;->a:La8/b;

    iget v7, v7, La8/b;->d:I

    int-to-long v7, v7

    invoke-virtual {v6, v7, v8}, Lorg/json/JSONStringer;->value(J)Lorg/json/JSONStringer;

    move-result-object v6

    const-string v7, "RelativeTime"

    invoke-virtual {v6, v7}, Lorg/json/JSONStringer;->key(Ljava/lang/String;)Lorg/json/JSONStringer;

    move-result-object v6

    iget-object v7, v5, La8/e;->a:La8/b;

    iget v7, v7, La8/b;->b:I

    int-to-long v7, v7

    invoke-virtual {v6, v7, v8}, Lorg/json/JSONStringer;->value(J)Lorg/json/JSONStringer;

    move-result-object v6

    const-string v7, "Type"

    invoke-virtual {v6, v7}, Lorg/json/JSONStringer;->key(Ljava/lang/String;)Lorg/json/JSONStringer;

    move-result-object v6

    iget-object v7, v5, La8/e;->a:La8/b;

    iget-object v7, v7, La8/b;->a:Ljava/lang/String;

    invoke-virtual {v6, v7}, Lorg/json/JSONStringer;->value(Ljava/lang/Object;)Lorg/json/JSONStringer;

    iget-object v6, v5, La8/e;->a:La8/b;

    iget-object v6, v6, La8/b;->a:Ljava/lang/String;

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_dd

    const-string v6, "Duration"

    invoke-virtual {v3, v6}, Lorg/json/JSONStringer;->key(Ljava/lang/String;)Lorg/json/JSONStringer;

    move-result-object v6

    iget-object v7, v5, La8/e;->a:La8/b;

    iget v7, v7, La8/b;->c:I

    int-to-long v7, v7

    invoke-virtual {v6, v7, v8}, Lorg/json/JSONStringer;->value(J)Lorg/json/JSONStringer;

    :cond_dd
    const-string v6, "Parameters"

    invoke-virtual {v3, v6}, Lorg/json/JSONStringer;->key(Ljava/lang/String;)Lorg/json/JSONStringer;

    move-result-object v6

    invoke-virtual {v6}, Lorg/json/JSONStringer;->object()Lorg/json/JSONStringer;

    move-result-object v6

    invoke-virtual {v6, v1}, Lorg/json/JSONStringer;->key(Ljava/lang/String;)Lorg/json/JSONStringer;

    move-result-object v6

    iget-object v7, v5, La8/e;->a:La8/b;

    iget-object v7, v7, La8/b;->e:La8/d;

    iget v7, v7, La8/d;->b:I

    int-to-long v7, v7

    invoke-virtual {v6, v7, v8}, Lorg/json/JSONStringer;->value(J)Lorg/json/JSONStringer;

    move-result-object v6

    invoke-virtual {v6, v0}, Lorg/json/JSONStringer;->key(Ljava/lang/String;)Lorg/json/JSONStringer;

    move-result-object v6

    iget-object v7, v5, La8/e;->a:La8/b;

    iget-object v7, v7, La8/b;->e:La8/d;

    iget v7, v7, La8/d;->a:I

    int-to-long v7, v7

    invoke-virtual {v6, v7, v8}, Lorg/json/JSONStringer;->value(J)Lorg/json/JSONStringer;

    iget-object v6, v5, La8/e;->a:La8/b;

    iget-object v6, v6, La8/b;->a:Ljava/lang/String;

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_15a

    const-string v6, "Curve"

    invoke-virtual {v3, v6}, Lorg/json/JSONStringer;->key(Ljava/lang/String;)Lorg/json/JSONStringer;

    move-result-object v6

    invoke-virtual {v6}, Lorg/json/JSONStringer;->array()Lorg/json/JSONStringer;

    iget-object v5, v5, La8/e;->a:La8/b;

    iget-object v5, v5, La8/b;->e:La8/d;

    iget-object v5, v5, La8/d;->c:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_121
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_157

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, La8/a;

    invoke-virtual {v3}, Lorg/json/JSONStringer;->object()Lorg/json/JSONStringer;

    move-result-object v7

    invoke-virtual {v7, v1}, Lorg/json/JSONStringer;->key(Ljava/lang/String;)Lorg/json/JSONStringer;

    move-result-object v7

    iget v8, v6, La8/a;->c:I

    int-to-long v8, v8

    invoke-virtual {v7, v8, v9}, Lorg/json/JSONStringer;->value(J)Lorg/json/JSONStringer;

    move-result-object v7

    invoke-virtual {v7, v0}, Lorg/json/JSONStringer;->key(Ljava/lang/String;)Lorg/json/JSONStringer;

    move-result-object v7

    iget-wide v8, v6, La8/a;->b:D

    invoke-virtual {v7, v8, v9}, Lorg/json/JSONStringer;->value(D)Lorg/json/JSONStringer;

    move-result-object v7

    const-string v8, "Time"

    invoke-virtual {v7, v8}, Lorg/json/JSONStringer;->key(Ljava/lang/String;)Lorg/json/JSONStringer;

    move-result-object v7

    iget v6, v6, La8/a;->a:I

    int-to-long v8, v6

    invoke-virtual {v7, v8, v9}, Lorg/json/JSONStringer;->value(J)Lorg/json/JSONStringer;

    move-result-object v6

    invoke-virtual {v6}, Lorg/json/JSONStringer;->endObject()Lorg/json/JSONStringer;

    goto :goto_121

    :cond_157
    invoke-virtual {v3}, Lorg/json/JSONStringer;->endArray()Lorg/json/JSONStringer;

    :cond_15a
    invoke-virtual {v3}, Lorg/json/JSONStringer;->endObject()Lorg/json/JSONStringer;

    move-result-object v5

    invoke-virtual {v5}, Lorg/json/JSONStringer;->endObject()Lorg/json/JSONStringer;

    move-result-object v5

    invoke-virtual {v5}, Lorg/json/JSONStringer;->endObject()Lorg/json/JSONStringer;

    goto/16 :goto_81

    :cond_167
    invoke-virtual {v3}, Lorg/json/JSONStringer;->endArray()Lorg/json/JSONStringer;

    move-result-object v4

    invoke-virtual {v4}, Lorg/json/JSONStringer;->endObject()Lorg/json/JSONStringer;

    goto/16 :goto_55

    :cond_170
    invoke-virtual {v3}, Lorg/json/JSONStringer;->endArray()Lorg/json/JSONStringer;

    move-result-object p0

    invoke-virtual {p0}, Lorg/json/JSONStringer;->endObject()Lorg/json/JSONStringer;

    invoke-virtual {v3}, Lorg/json/JSONStringer;->toString()Ljava/lang/String;

    move-result-object p0
    :try_end_17b
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_17b} :catch_17c

    return-object p0

    :catch_17c
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    const/4 p0, 0x0

    return-object p0
.end method

.method public static d(Lc8/c;Z)Ljava/lang/String;
    .registers 4

    new-instance v0, Lc8/a;

    invoke-direct {v0}, Lc8/a;-><init>()V

    new-instance v1, Lc8/b;

    invoke-direct {v1}, Lc8/b;-><init>()V

    iput-object v1, v0, Lc8/a;->a:Lc8/b;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lc8/a;->b:Ljava/util/ArrayList;

    if-eqz p1, :cond_27

    new-instance p1, Lc8/c;

    invoke-direct {p1}, Lc8/c;-><init>()V

    const/4 v1, 0x0

    iput v1, p1, Lc8/c;->a:I

    iget-object p0, p0, Lc8/c;->b:Ljava/util/ArrayList;

    iput-object p0, p1, Lc8/c;->b:Ljava/util/ArrayList;

    iget-object p0, v0, Lc8/a;->b:Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2a

    :cond_27
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_2a
    invoke-static {v0}, Ld8/b;->c(Lc8/a;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static e(Ljava/lang/String;)Ljava/lang/String;
    .registers 3

    :try_start_0
    invoke-static {p0}, Ld8/b;->m(Ljava/lang/String;)Lb8/a;

    move-result-object p0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_4} :catch_5

    goto :goto_a

    :catch_5
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    const/4 p0, 0x0

    :goto_a
    if-eqz p0, :cond_40

    iget-object v0, p0, Lb8/a;->b:Ljava/util/ArrayList;

    if-eqz v0, :cond_40

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_17

    goto :goto_40

    :cond_17
    new-instance v0, Lc8/a;

    invoke-direct {v0}, Lc8/a;-><init>()V

    new-instance v1, Lc8/b;

    invoke-direct {v1}, Lc8/b;-><init>()V

    iput-object v1, v0, Lc8/a;->a:Lc8/b;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lc8/a;->b:Ljava/util/ArrayList;

    new-instance v1, Lc8/c;

    invoke-direct {v1}, Lc8/c;-><init>()V

    iget-object p0, p0, Lb8/a;->b:Ljava/util/ArrayList;

    iput-object p0, v1, Lc8/c;->b:Ljava/util/ArrayList;

    const/4 p0, 0x0

    iput p0, v1, Lc8/c;->a:I

    iget-object p0, v0, Lc8/a;->b:Ljava/util/ArrayList;

    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v0}, Ld8/b;->c(Lc8/a;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_40
    :goto_40
    const-string p0, "HEFileUtils"

    const-string v0, " , convertHe10ToHe20, invalid HE1.0 string!"

    invoke-static {p0, v0}, Ld8/d$a;->d(Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, ""

    return-object p0
.end method

.method public static f(Ljava/lang/String;III)Ljava/lang/String;
    .registers 22

    move/from16 v0, p1

    move/from16 v1, p2

    move/from16 v2, p3

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "overwriteBaseFrequencyAndIntensityOfHe20String, deltaFreq:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ", deltaIntensity:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ", majorCoreVersion:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "HEFileUtils"

    invoke-static {v4, v3}, Ld8/d$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v3, 0x100

    const/16 v5, 0xff

    if-nez v1, :cond_3c

    if-eq v5, v0, :cond_36

    if-ne v3, v0, :cond_3c

    :cond_36
    const-string v0, "overwriteBaseFrequencyAndIntensityOfHe20String, do nothing!"

    :goto_38
    invoke-static {v4, v0}, Ld8/d$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0

    :cond_3c
    const-wide/16 v6, 0x0

    if-eq v5, v0, :cond_4c

    if-ne v3, v0, :cond_43

    goto :goto_4c

    :cond_43
    int-to-double v8, v0

    const-wide v10, 0x406ff00000000000L    # 255.5

    sub-double/2addr v8, v10

    div-double/2addr v8, v10

    goto :goto_4d

    :cond_4c
    :goto_4c
    move-wide v8, v6

    :goto_4d
    int-to-double v0, v1

    const-wide/high16 v10, 0x4059000000000000L    # 100.0

    div-double/2addr v0, v10

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "overwriteBaseFrequencyAndIntensityOfHe20String, freqRatio:"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v5, ", intensityRatio:"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v8, v9}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v4, v3}, Ld8/d$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static/range {p0 .. p0}, Ld8/b;->p(Ljava/lang/String;)Lc8/a;

    move-result-object v3

    invoke-static {v3}, Le8/d;->d(La8/c;)Z

    move-result v5

    if-nez v5, :cond_7a

    const-string v0, "overwriteBaseFrequencyAndIntensityOfHe20String, do nothing as invalid he20String"

    goto :goto_38

    :cond_7a
    iget-object v5, v3, Lc8/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_80
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_12d

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lc8/c;

    iget-object v10, v10, Lc8/c;->b:Ljava/util/ArrayList;

    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_92
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_80

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, La8/e;

    iget-object v12, v11, La8/e;->a:La8/b;

    iget-object v12, v12, La8/b;->a:Ljava/lang/String;

    const-string v13, "transient"

    invoke-virtual {v13, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_eb

    iget-object v12, v11, La8/e;->a:La8/b;

    iget-object v12, v12, La8/b;->e:La8/d;

    iget v13, v12, La8/d;->b:I

    if-nez v13, :cond_bc

    iget v14, v12, La8/d;->a:I

    if-nez v14, :cond_bc

    const-string v11, "overwriteBaseFrequencyAndIntensityOfHe20String, ignore placeholder event!"

    invoke-static {v4, v11}, Ld8/d$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_92

    :cond_bc
    const/16 v14, 0x18

    if-lt v2, v14, :cond_da

    cmpl-double v14, v0, v6

    if-ltz v14, :cond_cd

    int-to-double v14, v13

    rsub-int v13, v13, 0x96

    move-wide/from16 v16, v6

    int-to-double v6, v13

    mul-double/2addr v6, v0

    add-double/2addr v14, v6

    goto :goto_d6

    :cond_cd
    move-wide/from16 v16, v6

    int-to-double v6, v13

    add-int/lit8 v13, v13, 0x32

    int-to-double v13, v13

    mul-double/2addr v13, v0

    add-double v14, v6, v13

    :goto_d6
    double-to-int v6, v14

    :goto_d7
    iput v6, v12, La8/d;->b:I

    goto :goto_111

    :cond_da
    move-wide/from16 v16, v6

    cmpl-double v6, v0, v16

    if-ltz v6, :cond_e7

    int-to-double v6, v13

    rsub-int/lit8 v13, v13, 0x64

    :goto_e3
    int-to-double v13, v13

    mul-double/2addr v13, v0

    add-double/2addr v6, v13

    goto :goto_e9

    :cond_e7
    int-to-double v6, v13

    goto :goto_e3

    :goto_e9
    double-to-int v6, v6

    goto :goto_d7

    :cond_eb
    move-wide/from16 v16, v6

    iget-object v6, v11, La8/e;->a:La8/b;

    iget-object v6, v6, La8/b;->a:Ljava/lang/String;

    const-string v7, "continuous"

    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_111

    iget-object v6, v11, La8/e;->a:La8/b;

    iget-object v6, v6, La8/b;->e:La8/d;

    cmpl-double v7, v0, v16

    if-ltz v7, :cond_10a

    iget v7, v6, La8/d;->b:I

    int-to-double v12, v7

    rsub-int/lit8 v7, v7, 0x64

    :goto_106
    int-to-double v14, v7

    mul-double/2addr v14, v0

    add-double/2addr v12, v14

    goto :goto_10e

    :cond_10a
    iget v7, v6, La8/d;->b:I

    int-to-double v12, v7

    goto :goto_106

    :goto_10e
    double-to-int v7, v12

    iput v7, v6, La8/d;->b:I

    :cond_111
    :goto_111
    iget-object v6, v11, La8/e;->a:La8/b;

    iget-object v6, v6, La8/b;->e:La8/d;

    cmpl-double v7, v8, v16

    if-ltz v7, :cond_122

    iget v7, v6, La8/d;->a:I

    int-to-double v11, v7

    rsub-int/lit8 v7, v7, 0x64

    :goto_11e
    int-to-double v13, v7

    mul-double/2addr v13, v8

    add-double/2addr v11, v13

    goto :goto_126

    :cond_122
    iget v7, v6, La8/d;->a:I

    int-to-double v11, v7

    goto :goto_11e

    :goto_126
    double-to-int v7, v11

    iput v7, v6, La8/d;->a:I

    move-wide/from16 v6, v16

    goto/16 :goto_92

    :cond_12d
    invoke-static {v3}, Ld8/b;->c(Lc8/a;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "overwriteBaseFrequencyAndIntensityOfHe20String, result:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1}, Ld8/d$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static g(Ljava/lang/String;Z)Ljava/lang/String;
    .registers 7

    if-eqz p1, :cond_6

    invoke-static {p0}, Ld8/b;->s(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    :cond_6
    invoke-static {p0}, Ld8/b;->u(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x0

    const-string v0, "HEFileUtils"

    if-eqz p0, :cond_c5

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_17

    goto/16 :goto_c5

    :cond_17
    invoke-static {p0}, Ld8/b;->p(Ljava/lang/String;)Lc8/a;

    move-result-object p0

    invoke-static {p0}, La8/c;->b(La8/c;)Z

    move-result v1

    if-nez v1, :cond_27

    const-string p0, "convertHE20ToHE10, empty HeRoot"

    :goto_23
    invoke-static {v0, p0}, Ld8/d$a;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-object p1

    :cond_27
    iget-object p1, p0, Lc8/a;->b:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc8/c;

    iget-object p1, p1, Lc8/c;->b:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_36
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_54

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La8/e;

    iget-object v2, v2, La8/e;->a:La8/b;

    iget v3, v2, La8/b;->b:I

    iget-object v4, p0, Lc8/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lc8/c;

    iget v4, v4, Lc8/c;->a:I

    add-int/2addr v3, v4

    iput v3, v2, La8/b;->b:I

    goto :goto_36

    :cond_54
    new-instance p1, Lb8/a;

    invoke-direct {p1}, Lb8/a;-><init>()V

    new-instance v2, Lb8/b;

    invoke-direct {v2}, Lb8/b;-><init>()V

    iput-object v2, p1, Lb8/a;->a:Lb8/b;

    iget-object p0, p0, Lc8/a;->b:Ljava/util/ArrayList;

    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lc8/c;

    iget-object p0, p0, Lc8/c;->b:Ljava/util/ArrayList;

    iput-object p0, p1, Lb8/a;->b:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_70
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_ac

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La8/e;

    iget-object v3, v2, La8/e;->a:La8/b;

    if-eqz v3, :cond_70

    iget-object v3, v3, La8/b;->a:Ljava/lang/String;

    const-string v4, "continuous"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_70

    iget-object v2, v2, La8/e;->a:La8/b;

    iget-object v2, v2, La8/b;->e:La8/d;

    iget v3, v2, La8/d;->b:I

    const/4 v4, -0x1

    if-ne v4, v3, :cond_70

    const/16 v3, 0x38

    iput v3, v2, La8/d;->b:I

    iget-object v2, v2, La8/d;->c:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_9d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_70

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, La8/a;

    iput v1, v3, La8/a;->c:I

    goto :goto_9d

    :cond_ac
    invoke-static {p1}, Ld8/b;->b(Lb8/a;)Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "convertHE20ToHE10 result:"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Ld8/d$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0

    :cond_c5
    :goto_c5
    const-string p0, "convertHE20ToHE10, null after trim"

    goto/16 :goto_23
.end method

.method private static h(Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .registers 16

    if-eqz p0, :cond_ef

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_a

    goto/16 :goto_ef

    :cond_a
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "trimTo4p size:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v3, "HEFileUtils"

    invoke-static {v3, v1}, Ld8/d$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    if-lez v0, :cond_2a

    const/4 v1, 0x4

    if-gt v0, v1, :cond_2a

    return-object p0

    :cond_2a
    new-instance v1, La8/a;

    invoke-direct {v1}, La8/a;-><init>()V

    add-int/lit8 v4, v0, -0x2

    div-int/lit8 v5, v4, 0x2

    const/4 v6, 0x1

    move v7, v6

    :goto_35
    if-gt v7, v5, :cond_61

    iget v8, v1, La8/a;->a:I

    invoke-virtual {p0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, La8/a;

    iget v9, v9, La8/a;->a:I

    add-int/2addr v8, v9

    iput v8, v1, La8/a;->a:I

    iget-wide v8, v1, La8/a;->b:D

    invoke-virtual {p0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, La8/a;

    iget-wide v10, v10, La8/a;->b:D

    add-double/2addr v8, v10

    iput-wide v8, v1, La8/a;->b:D

    iget v8, v1, La8/a;->c:I

    invoke-virtual {p0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, La8/a;

    iget v9, v9, La8/a;->c:I

    add-int/2addr v8, v9

    iput v8, v1, La8/a;->c:I

    add-int/lit8 v7, v7, 0x1

    goto :goto_35

    :cond_61
    iget v7, v1, La8/a;->a:I

    div-int/2addr v7, v5

    iput v7, v1, La8/a;->a:I

    iget-wide v7, v1, La8/a;->b:D

    int-to-double v9, v5

    div-double/2addr v7, v9

    iput-wide v7, v1, La8/a;->b:D

    const-wide/high16 v9, 0x4024000000000000L    # 10.0

    mul-double/2addr v7, v9

    invoke-static {v7, v8}, Ljava/lang/Math;->round(D)J

    move-result-wide v7

    long-to-double v7, v7

    div-double/2addr v7, v9

    iput-wide v7, v1, La8/a;->b:D

    iget v7, v1, La8/a;->c:I

    div-int/2addr v7, v5

    iput v7, v1, La8/a;->c:I

    new-instance v7, La8/a;

    invoke-direct {v7}, La8/a;-><init>()V

    add-int/lit8 v8, v5, 0x1

    :goto_83
    if-gt v8, v4, :cond_af

    iget v11, v7, La8/a;->a:I

    invoke-virtual {p0, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, La8/a;

    iget v12, v12, La8/a;->a:I

    add-int/2addr v11, v12

    iput v11, v7, La8/a;->a:I

    iget-wide v11, v7, La8/a;->b:D

    invoke-virtual {p0, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, La8/a;

    iget-wide v13, v13, La8/a;->b:D

    add-double/2addr v11, v13

    iput-wide v11, v7, La8/a;->b:D

    iget v11, v7, La8/a;->c:I

    invoke-virtual {p0, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, La8/a;

    iget v12, v12, La8/a;->c:I

    add-int/2addr v11, v12

    iput v11, v7, La8/a;->c:I

    add-int/lit8 v8, v8, 0x1

    goto :goto_83

    :cond_af
    iget v8, v7, La8/a;->a:I

    sub-int/2addr v4, v5

    div-int/2addr v8, v4

    iput v8, v7, La8/a;->a:I

    iget-wide v11, v7, La8/a;->b:D

    int-to-double v13, v4

    div-double/2addr v11, v13

    iput-wide v11, v7, La8/a;->b:D

    mul-double/2addr v11, v9

    invoke-static {v11, v12}, Ljava/lang/Math;->round(D)J

    move-result-wide v11

    long-to-double v11, v11

    div-double/2addr v11, v9

    iput-wide v11, v7, La8/a;->b:D

    iget v5, v7, La8/a;->c:I

    div-int/2addr v5, v4

    iput v5, v7, La8/a;->c:I

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Ld8/d$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    sub-int/2addr v0, v6

    invoke-virtual {p0, v6, v0}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    invoke-virtual {p0, v6, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    const/4 v0, 0x2

    invoke-virtual {p0, v0, v7}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    return-object p0

    :cond_ef
    :goto_ef
    const/4 p0, 0x0

    return-object p0
.end method

.method public static i(Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .registers 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-string v3, "HEFileUtils"

    if-eqz v0, :cond_21d

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-eqz v4, :cond_21d

    if-eqz v1, :cond_21d

    if-nez v2, :cond_16

    goto/16 :goto_21d

    :cond_16
    const/4 v4, 0x1

    invoke-static {v0, v4}, Ld8/b;->r(Ljava/lang/String;I)La8/c;

    move-result-object v0

    invoke-static {v0}, La8/c;->b(La8/c;)Z

    move-result v5

    if-nez v5, :cond_27

    const-string v0, "convertHE10StringToGoogleWaveform, invalid heRoot!"

    invoke-static {v3, v0}, Ld8/d$a;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_27
    invoke-interface {v0}, La8/c;->a()I

    move-result v5

    if-eq v4, v5, :cond_46

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "convertHE10StringToGoogleWaveform, invalid HE version:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v0}, La8/c;->a()I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Ld8/d$a;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_46
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    new-instance v5, Ljava/lang/Long;

    const-wide/16 v6, 0x0

    invoke-direct {v5, v6, v7}, Ljava/lang/Long;-><init>(J)V

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v5, 0x0

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    check-cast v0, Lb8/a;

    iget-object v0, v0, Lb8/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_66
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_18f

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, La8/e;

    if-eqz v8, :cond_7c

    iget-object v9, v8, La8/e;->a:La8/b;

    if-eqz v9, :cond_7c

    iget-object v10, v9, La8/b;->e:La8/d;

    if-nez v10, :cond_82

    :cond_7c
    move/from16 v16, v4

    move/from16 p0, v5

    goto/16 :goto_10b

    :cond_82
    iget-object v9, v9, La8/b;->a:Ljava/lang/String;

    const-string v10, "transient"

    invoke-virtual {v10, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    const-wide/high16 v12, 0x4059000000000000L    # 100.0

    const-wide/high16 v14, 0x3ff0000000000000L    # 1.0

    if-eqz v9, :cond_111

    iget-object v9, v8, La8/e;->a:La8/b;

    iget v9, v9, La8/b;->b:I

    move/from16 v16, v4

    move/from16 p0, v5

    int-to-long v4, v9

    cmp-long v4, v4, v6

    if-lez v4, :cond_cd

    new-instance v4, Ljava/lang/Long;

    const-wide v17, 0x406fe00000000000L    # 255.0

    int-to-long v10, v9

    invoke-direct {v4, v10, v11}, Ljava/lang/Long;-><init>(J)V

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    sub-long/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static/range {p0 .. p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Long;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    add-long/2addr v6, v4

    goto :goto_d2

    :cond_cd
    const-wide v17, 0x406fe00000000000L    # 255.0

    :goto_d2
    new-instance v4, Ljava/lang/Long;

    iget-object v5, v8, La8/e;->a:La8/b;

    iget-object v5, v5, La8/b;->e:La8/d;

    iget v9, v5, La8/d;->a:I

    iget v5, v5, La8/d;->b:I

    invoke-static {v9, v5}, Ld8/b;->l(II)I

    move-result v5

    int-to-long v9, v5

    invoke-direct {v4, v9, v10}, Ljava/lang/Long;-><init>(J)V

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v4, v8, La8/e;->a:La8/b;

    iget-object v4, v4, La8/b;->e:La8/d;

    iget v4, v4, La8/d;->a:I

    :goto_ed
    int-to-double v4, v4

    mul-double/2addr v4, v14

    div-double/2addr v4, v12

    mul-double v4, v4, v17

    double-to-int v4, v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Long;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    add-long/2addr v6, v4

    :cond_10b
    :goto_10b
    move/from16 v5, p0

    move/from16 v4, v16

    goto/16 :goto_66

    :cond_111
    move/from16 v16, v4

    move/from16 p0, v5

    const-wide v17, 0x406fe00000000000L    # 255.0

    iget-object v4, v8, La8/e;->a:La8/b;

    iget-object v4, v4, La8/b;->a:Ljava/lang/String;

    const-string v5, "continuous"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_188

    iget-object v4, v8, La8/e;->a:La8/b;

    iget-object v4, v4, La8/b;->e:La8/d;

    iget-object v4, v4, La8/d;->c:Ljava/util/ArrayList;

    if-eqz v4, :cond_10b

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/4 v5, 0x4

    if-eq v5, v4, :cond_136

    goto :goto_10b

    :cond_136
    iget-object v4, v8, La8/e;->a:La8/b;

    iget v4, v4, La8/b;->b:I

    int-to-long v9, v4

    cmp-long v5, v9, v6

    if-lez v5, :cond_169

    new-instance v5, Ljava/lang/Long;

    int-to-long v9, v4

    invoke-direct {v5, v9, v10}, Ljava/lang/Long;-><init>(J)V

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    sub-long/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static/range {p0 .. p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Long;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    add-long/2addr v6, v4

    :cond_169
    new-instance v4, Ljava/lang/Long;

    iget-object v5, v8, La8/e;->a:La8/b;

    iget v5, v5, La8/b;->c:I

    invoke-static {v5}, Ld8/b;->a(I)I

    move-result v5

    int-to-long v9, v5

    invoke-direct {v4, v9, v10}, Ljava/lang/Long;-><init>(J)V

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v4, v8, La8/e;->a:La8/b;

    iget-object v4, v4, La8/b;->e:La8/d;

    iget v5, v4, La8/d;->a:I

    iget v4, v4, La8/d;->b:I

    invoke-static {v5, v4}, Ld8/b;->k(II)I

    move-result v4

    goto/16 :goto_ed

    :cond_188
    const-string v4, "unknown type!"

    invoke-static {v3, v4}, Ld8/d$a;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_10b

    :cond_18f
    invoke-static {}, Ld8/d;->d()Z

    move-result v0

    if-eqz v0, :cond_21c

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-string v4, ""

    move-object v5, v4

    :goto_19c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const-string v7, ","

    if-eqz v6, :cond_1c1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Long;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/Long;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    goto :goto_19c

    :cond_1c1
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1c5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1e8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    goto :goto_1c5

    :cond_1e8
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "timings size:"

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",amplitudes size:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\n timings:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n amplitudes:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Ld8/d$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_21c
    return-void

    :cond_21d
    :goto_21d
    const-string v0, "convertHE10StringToWaveformParams(), invalid parameters."

    invoke-static {v3, v0}, Ld8/d$a;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static j(Ljava/lang/String;IIIIIZ)[I
    .registers 28

    move/from16 v0, p1

    move/from16 v1, p2

    move/from16 v2, p3

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    const-string v4, "convertHEStringToIntArray, skip unknown type:"

    const/16 v6, 0x1000

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const-string v7, "continuous"

    const/16 v8, 0x1001

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const-string v9, "transient"

    const/4 v12, 0x4

    const/16 v15, 0x18

    const/16 v5, 0x10

    const-wide/high16 v16, 0x4059000000000000L    # 100.0

    const/4 v10, 0x0

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    const/16 v18, 0x0

    const-string v14, "HEFileUtils"

    const/4 v13, 0x1

    if-eq v0, v13, :cond_275

    const/4 v11, 0x2

    if-eq v0, v11, :cond_34

    return-object v18

    :cond_34
    if-le v15, v1, :cond_37

    return-object v18

    :cond_37
    :try_start_37
    invoke-static/range {p0 .. p0}, Ld8/b;->p(Ljava/lang/String;)Lc8/a;

    move-result-object v0

    iget-object v15, v0, Lc8/a;->b:Ljava/util/ArrayList;

    if-eqz v15, :cond_26f

    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    move-result v15

    if-lez v15, :cond_26f

    iget-object v15, v0, Lc8/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v15, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lc8/c;

    iget-object v15, v15, Lc8/c;->b:Ljava/util/ArrayList;

    if-eqz v15, :cond_26f

    iget-object v15, v0, Lc8/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v15, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lc8/c;

    iget-object v15, v15, Lc8/c;->b:Ljava/util/ArrayList;

    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    move-result v15

    if-gtz v15, :cond_63

    goto/16 :goto_26f

    :cond_63
    iget-object v15, v0, Lc8/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    move-result v15

    if-le v15, v12, :cond_74

    const-string v10, "convertHEStringToIntArray, HE20 with more than 4 pattern!"

    invoke-static {v14, v10}, Ld8/d$a;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_74

    :catchall_71
    move-exception v0

    goto/16 :goto_451

    :cond_74
    :goto_74
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static/range {p5 .. p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v10, 0xffff

    and-int/2addr v10, v15

    shl-int/2addr v15, v5

    const/high16 v19, -0x10000

    and-int v15, v15, v19

    or-int/2addr v10, v15

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, v0, Lc8/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v10, 0x0

    :goto_a8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_454

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lc8/c;

    add-int/lit8 v19, v10, 0x1

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget v10, v15, Lc8/c;->a:I

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v10, v15, Lc8/c;->b:Ljava/util/ArrayList;

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v10

    if-gt v10, v5, :cond_d5

    iget-object v10, v15, Lc8/c;->b:Ljava/util/ArrayList;

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v10

    goto :goto_d6

    :cond_d5
    move v10, v5

    :goto_d6
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v11, 0x0

    :goto_de
    if-ge v11, v10, :cond_26a

    iget-object v5, v15, Lc8/c;->b:Ljava/util/ArrayList;

    invoke-virtual {v5, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, La8/e;

    iget-object v12, v5, La8/e;->a:La8/b;

    iget-object v12, v12, La8/b;->a:Ljava/lang/String;

    invoke-virtual {v9, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_14a

    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v12, 0x5

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v3, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v12, v5, La8/e;->a:La8/b;

    iget v12, v12, La8/b;->d:I

    if-eqz p6, :cond_10c

    if-nez v12, :cond_107

    const/4 v12, 0x0

    goto :goto_10c

    :cond_107
    if-ne v13, v12, :cond_10b

    const/4 v12, 0x2

    goto :goto_10c

    :cond_10b
    move v12, v13

    :cond_10c
    :goto_10c
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v3, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v12, v5, La8/e;->a:La8/b;

    iget v12, v12, La8/b;->b:I

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v3, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v12, v5, La8/e;->a:La8/b;

    iget-object v12, v12, La8/b;->e:La8/d;

    iget v12, v12, La8/d;->a:I

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v3, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v12, v5, La8/e;->a:La8/b;

    iget-object v12, v12, La8/b;->e:La8/d;

    iget v12, v12, La8/d;->b:I

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v3, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v5, v5, La8/e;->a:La8/b;

    iget v5, v5, La8/b;->c:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 p0, v0

    :cond_145
    move/from16 p4, v10

    move v13, v11

    goto/16 :goto_25e

    :cond_14a
    iget-object v12, v5, La8/e;->a:La8/b;

    iget-object v12, v12, La8/b;->a:Ljava/lang/String;

    invoke-virtual {v7, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_246

    iget-object v12, v5, La8/e;->a:La8/b;

    iget-object v12, v12, La8/b;->e:La8/d;

    iget-object v12, v12, La8/d;->c:Ljava/util/ArrayList;

    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v12

    const/4 v13, 0x4

    if-gt v13, v12, :cond_165

    const/16 v13, 0x10

    if-ge v13, v12, :cond_16c

    :cond_165
    move-object/from16 p0, v0

    move/from16 p4, v10

    move v13, v11

    goto/16 :goto_234

    :cond_16c
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    mul-int/lit8 v13, v12, 0x3

    add-int/lit8 v13, v13, 0x6

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-virtual {v3, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v13, v5, La8/e;->a:La8/b;

    iget v13, v13, La8/b;->d:I

    move-object/from16 p0, v0

    if-eqz p6, :cond_18c

    if-nez v13, :cond_186

    const/4 v13, 0x0

    goto :goto_18c

    :cond_186
    const/4 v0, 0x1

    if-ne v0, v13, :cond_18b

    const/4 v13, 0x2

    goto :goto_18c

    :cond_18b
    const/4 v13, 0x1

    :cond_18c
    :goto_18c
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, v5, La8/e;->a:La8/b;

    iget v0, v0, La8/b;->b:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, v5, La8/e;->a:La8/b;

    iget-object v0, v0, La8/b;->e:La8/d;

    iget v0, v0, La8/d;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/16 v0, 0x20

    if-gt v1, v0, :cond_1c3

    const/16 v13, 0x10

    if-gt v2, v13, :cond_1c3

    iget-object v13, v5, La8/e;->a:La8/b;

    iget-object v13, v13, La8/b;->e:La8/d;

    iget v13, v13, La8/d;->b:I

    const/4 v0, -0x1

    if-ne v0, v13, :cond_1be

    const/16 v13, 0x38

    :cond_1be
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_1cd

    :cond_1c3
    iget-object v0, v5, La8/e;->a:La8/b;

    iget-object v0, v0, La8/b;->e:La8/d;

    iget v0, v0, La8/d;->b:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :goto_1cd
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, v5, La8/e;->a:La8/b;

    iget v0, v0, La8/b;->c:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, v5, La8/e;->a:La8/b;

    iget-object v0, v0, La8/b;->e:La8/d;

    iget-object v0, v0, La8/d;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1ec
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_145

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, La8/a;

    iget v13, v12, La8/a;->a:I

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-virtual {v3, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 p4, v10

    move v13, v11

    iget-wide v10, v12, La8/a;->b:D

    mul-double v10, v10, v16

    double-to-int v10, v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/16 v10, 0x20

    if-gt v1, v10, :cond_22a

    const/16 v11, 0x10

    if-gt v2, v11, :cond_22a

    iget-object v11, v5, La8/e;->a:La8/b;

    iget-object v11, v11, La8/b;->e:La8/d;

    iget v11, v11, La8/d;->b:I

    const/4 v10, -0x1

    if-ne v10, v11, :cond_223

    const/4 v10, 0x0

    goto :goto_225

    :cond_223
    iget v10, v12, La8/a;->c:I

    :goto_225
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    goto :goto_22d

    :cond_22a
    iget v10, v12, La8/a;->c:I

    goto :goto_225

    :goto_22d
    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v10, p4

    move v11, v13

    goto :goto_1ec

    :goto_234
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "convertHEStringToIntArray, curvePointCount:"

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :goto_241
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_25b

    :cond_246
    move-object/from16 p0, v0

    move/from16 p4, v10

    move v13, v11

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, v5, La8/e;->a:La8/b;

    iget-object v5, v5, La8/b;->a:Ljava/lang/String;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_241

    :goto_25b
    invoke-static {v14, v0}, Ld8/d$a;->d(Ljava/lang/String;Ljava/lang/String;)V

    :goto_25e
    add-int/lit8 v11, v13, 0x1

    move-object/from16 v0, p0

    move/from16 v10, p4

    const/16 v5, 0x10

    const/4 v12, 0x4

    const/4 v13, 0x1

    goto/16 :goto_de

    :cond_26a
    move/from16 v10, v19

    const/4 v11, 0x2

    goto/16 :goto_a8

    :cond_26f
    :goto_26f
    const-string v0, "convertHEStringToIntArray, empty HE20!"

    invoke-static {v14, v0}, Ld8/d$a;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-object v18

    :cond_275
    invoke-static/range {p0 .. p0}, Ld8/b;->m(Ljava/lang/String;)Lb8/a;

    move-result-object v0

    iget-object v2, v0, Lb8/a;->b:Ljava/util/ArrayList;

    if-nez v2, :cond_289

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-gtz v2, :cond_289

    const-string v0, "convertHEStringToIntArray, empty HE10!"

    invoke-static {v14, v0}, Ld8/d$a;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-object v18

    :cond_289
    const/4 v2, 0x3

    if-le v15, v1, :cond_293

    const/16 v20, 0x1

    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    goto :goto_297

    :cond_293
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    :goto_297
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v5, v0, Lb8/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v5

    const/16 v13, 0x10

    if-gt v5, v13, :cond_2ab

    iget-object v5, v0, Lb8/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v13

    goto :goto_2ad

    :cond_2ab
    const/16 v13, 0x10

    :goto_2ad
    const/4 v5, 0x0

    :goto_2ae
    if-ge v5, v13, :cond_454

    iget-object v10, v0, Lb8/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v10, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, La8/e;

    iget-object v12, v10, La8/e;->a:La8/b;

    iget-object v12, v12, La8/b;->a:Ljava/lang/String;

    invoke-virtual {v9, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_31c

    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v12, v10, La8/e;->a:La8/b;

    iget v12, v12, La8/b;->b:I

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v3, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v12, v10, La8/e;->a:La8/b;

    iget-object v12, v12, La8/b;->e:La8/d;

    iget v12, v12, La8/d;->a:I

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v3, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v12, v10, La8/e;->a:La8/b;

    iget-object v12, v12, La8/b;->e:La8/d;

    iget v12, v12, La8/d;->b:I

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v3, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v10, v10, La8/e;->a:La8/b;

    iget v10, v10, La8/b;->c:I

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-le v15, v1, :cond_30b

    const/4 v10, 0x0

    :goto_2f8
    const/16 v12, 0xc

    if-ge v10, v12, :cond_302

    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v10, v10, 0x1

    goto :goto_2f8

    :cond_302
    move-object/from16 p1, v0

    move/from16 p0, v2

    :goto_306
    move v15, v5

    move-object v2, v6

    const/4 v6, -0x1

    goto/16 :goto_444

    :cond_30b
    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v10, 0x0

    :goto_312
    const/16 v12, 0x30

    if-ge v10, v12, :cond_302

    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v10, v10, 0x1

    goto :goto_312

    :cond_31c
    iget-object v12, v10, La8/e;->a:La8/b;

    iget-object v12, v12, La8/b;->a:Ljava/lang/String;

    invoke-virtual {v7, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_427

    iget-object v12, v10, La8/e;->a:La8/b;

    iget-object v12, v12, La8/b;->e:La8/d;

    iget-object v12, v12, La8/d;->c:Ljava/util/ArrayList;

    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v12

    move/from16 p0, v2

    const/4 v2, 0x4

    if-le v15, v1, :cond_33b

    if-ne v2, v12, :cond_338

    goto :goto_33b

    :cond_338
    :goto_338
    move-object/from16 p1, v0

    goto :goto_306

    :cond_33b
    :goto_33b
    if-gt v15, v1, :cond_344

    if-gt v2, v12, :cond_338

    const/16 v2, 0x10

    if-ge v2, v12, :cond_346

    goto :goto_338

    :cond_344
    const/16 v2, 0x10

    :cond_346
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v2, v10, La8/e;->a:La8/b;

    iget v2, v2, La8/b;->b:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v2, v10, La8/e;->a:La8/b;

    iget-object v2, v2, La8/b;->e:La8/d;

    iget v2, v2, La8/d;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v2, v10, La8/e;->a:La8/b;

    iget-object v2, v2, La8/b;->e:La8/d;

    iget v2, v2, La8/d;->b:I

    const/4 v15, -0x1

    if-ne v15, v2, :cond_36c

    const/16 v2, 0x38

    :cond_36c
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v2, v10, La8/e;->a:La8/b;

    iget v2, v2, La8/b;->c:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/16 v2, 0x18

    if-le v2, v1, :cond_3ca

    iget-object v12, v10, La8/e;->a:La8/b;

    iget-object v12, v12, La8/b;->e:La8/d;

    iget-object v12, v12, La8/d;->c:Ljava/util/ArrayList;

    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_38c
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_338

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, La8/a;

    iget v2, v15, La8/a;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 p1, v0

    iget-wide v0, v15, La8/a;->b:D

    mul-double v0, v0, v16

    double-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, v10, La8/e;->a:La8/b;

    iget-object v0, v0, La8/b;->e:La8/d;

    iget v0, v0, La8/d;->b:I

    const/4 v1, -0x1

    if-ne v1, v0, :cond_3ba

    const/4 v0, 0x0

    goto :goto_3bc

    :cond_3ba
    iget v0, v15, La8/a;->c:I

    :goto_3bc
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, p1

    move/from16 v1, p2

    const/16 v2, 0x18

    goto :goto_38c

    :cond_3ca
    move-object/from16 p1, v0

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, v10, La8/e;->a:La8/b;

    iget-object v0, v0, La8/b;->e:La8/d;

    iget-object v0, v0, La8/d;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3dd
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_417

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La8/a;

    iget v2, v1, La8/a;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v15, v5

    move-object v2, v6

    iget-wide v5, v1, La8/a;->b:D

    mul-double v5, v5, v16

    double-to-int v5, v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v5, v10, La8/e;->a:La8/b;

    iget-object v5, v5, La8/b;->e:La8/d;

    iget v5, v5, La8/d;->b:I

    const/4 v6, -0x1

    if-ne v6, v5, :cond_40b

    const/4 v1, 0x0

    goto :goto_40d

    :cond_40b
    iget v1, v1, La8/a;->c:I

    :goto_40d
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object v6, v2

    move v5, v15

    goto :goto_3dd

    :cond_417
    move v15, v5

    move-object v2, v6

    const/4 v6, -0x1

    const/4 v0, 0x0

    :goto_41b
    rsub-int/lit8 v1, v12, 0x10

    mul-int/lit8 v1, v1, 0x3

    if-ge v0, v1, :cond_444

    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_41b

    :cond_427
    move-object/from16 p1, v0

    move/from16 p0, v2

    move v15, v5

    move-object v2, v6

    const/4 v6, -0x1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v10, La8/e;->a:La8/b;

    iget-object v1, v1, La8/b;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v14, v0}, Ld8/d$a;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_444
    .catchall {:try_start_37 .. :try_end_444} :catchall_71

    :cond_444
    :goto_444
    add-int/lit8 v5, v15, 0x1

    const/16 v15, 0x18

    move-object/from16 v0, p1

    move/from16 v1, p2

    move-object v6, v2

    move/from16 v2, p0

    goto/16 :goto_2ae

    :goto_451
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_454
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_45b

    return-object v18

    :cond_45b
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v0, v0, [I

    const/4 v10, 0x0

    :goto_462
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v10, v1, :cond_477

    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    aput v1, v0, v10

    add-int/lit8 v10, v10, 0x1

    goto :goto_462

    :cond_477
    return-object v0
.end method

.method private static k(II)I
    .registers 4

    const/4 v0, -0x1

    const/16 v1, 0x64

    if-ne v0, p1, :cond_6

    goto :goto_f

    :cond_6
    const/16 v0, 0x1e

    if-le v0, p1, :cond_c

    const/4 p0, 0x0

    return p0

    :cond_c
    if-lt v1, p1, :cond_f

    return p0

    :cond_f
    :goto_f
    return v1
.end method

.method private static l(II)I
    .registers 6

    const/16 v0, 0x29

    const/16 v1, 0x64

    const/16 v2, 0xf

    const/16 v3, 0x32

    if-lt p1, v0, :cond_23

    const/16 v0, 0x44

    if-gt p1, v0, :cond_23

    if-lez p0, :cond_13

    if-ge p0, v3, :cond_13

    return v2

    :cond_13
    const/16 p1, 0x4b

    if-lt p0, v3, :cond_1c

    if-ge p0, p1, :cond_1c

    const/16 p0, 0x14

    return p0

    :cond_1c
    if-lt p0, p1, :cond_2f

    if-gt p0, v1, :cond_2f

    const/16 p0, 0x1e

    return p0

    :cond_23
    if-lez p0, :cond_2a

    if-ge p0, v3, :cond_2a

    const/16 p0, 0xa

    return p0

    :cond_2a
    if-lt p0, v3, :cond_2f

    if-gt p0, v1, :cond_2f

    return v2

    :cond_2f
    const/4 p0, 0x0

    return p0
.end method

.method public static m(Ljava/lang/String;)Lb8/a;
    .registers 14

    const-string v0, "Intensity"

    const-string v1, "Frequency"

    const-string v2, "continuous"

    :try_start_6
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    new-instance p0, Lb8/a;

    invoke-direct {p0}, Lb8/a;-><init>()V

    new-instance v4, Lb8/b;

    invoke-direct {v4}, Lb8/b;-><init>()V

    iput-object v4, p0, Lb8/a;->a:Lb8/b;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, p0, Lb8/a;->b:Ljava/util/ArrayList;

    const-string v4, "Pattern"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v3

    const/4 v4, 0x0

    move v5, v4

    :goto_26
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v6

    if-ge v5, v6, :cond_e5

    invoke-virtual {v3, v5}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lorg/json/JSONObject;

    new-instance v7, La8/e;

    invoke-direct {v7}, La8/e;-><init>()V

    new-instance v8, La8/b;

    invoke-direct {v8}, La8/b;-><init>()V

    iput-object v8, v7, La8/e;->a:La8/b;

    const-string v8, "Event"

    invoke-virtual {v6, v8}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v6

    iget-object v8, v7, La8/e;->a:La8/b;

    const-string v9, "Type"

    invoke-virtual {v6, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    iput-object v9, v8, La8/b;->a:Ljava/lang/String;

    iget-object v8, v7, La8/e;->a:La8/b;

    iget-object v8, v8, La8/b;->a:Ljava/lang/String;

    invoke-virtual {v2, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_62

    iget-object v8, v7, La8/e;->a:La8/b;

    const-string v9, "Duration"

    invoke-virtual {v6, v9}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v9

    iput v9, v8, La8/b;->c:I

    :cond_62
    iget-object v8, v7, La8/e;->a:La8/b;

    const-string v9, "RelativeTime"

    invoke-virtual {v6, v9}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v9

    iput v9, v8, La8/b;->b:I

    const-string v8, "Parameters"

    invoke-virtual {v6, v8}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v6

    iget-object v8, v7, La8/e;->a:La8/b;

    new-instance v9, La8/d;

    invoke-direct {v9}, La8/d;-><init>()V

    iput-object v9, v8, La8/b;->e:La8/d;

    iget-object v8, v7, La8/e;->a:La8/b;

    iget-object v8, v8, La8/b;->e:La8/d;

    invoke-virtual {v6, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v9

    iput v9, v8, La8/d;->b:I

    iget-object v8, v7, La8/e;->a:La8/b;

    iget-object v8, v8, La8/b;->e:La8/d;

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v9

    iput v9, v8, La8/d;->a:I

    iget-object v8, v7, La8/e;->a:La8/b;

    iget-object v8, v8, La8/b;->e:La8/d;

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    iput-object v9, v8, La8/d;->c:Ljava/util/ArrayList;

    iget-object v8, v7, La8/e;->a:La8/b;

    iget-object v8, v8, La8/b;->a:Ljava/lang/String;

    invoke-virtual {v2, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_dc

    const-string v8, "Curve"

    invoke-virtual {v6, v8}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v6

    move v8, v4

    :goto_ab
    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    move-result v9

    if-ge v8, v9, :cond_dc

    invoke-virtual {v6, v8}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lorg/json/JSONObject;

    new-instance v10, La8/a;

    invoke-direct {v10}, La8/a;-><init>()V

    invoke-virtual {v9, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v11

    iput v11, v10, La8/a;->c:I

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v11

    iput-wide v11, v10, La8/a;->b:D

    const-string v11, "Time"

    invoke-virtual {v9, v11}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v9

    iput v9, v10, La8/a;->a:I

    iget-object v9, v7, La8/e;->a:La8/b;

    iget-object v9, v9, La8/b;->e:La8/d;

    iget-object v9, v9, La8/d;->c:Ljava/util/ArrayList;

    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v8, v8, 0x1

    goto :goto_ab

    :cond_dc
    iget-object v6, p0, Lb8/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_e1
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_e1} :catch_e6

    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_26

    :cond_e5
    return-object p0

    :catch_e6
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    const/4 p0, 0x0

    return-object p0
.end method

.method public static n(Ljava/lang/String;I)Ljava/lang/String;
    .registers 10

    if-nez p1, :cond_3

    return-object p0

    :cond_3
    :try_start_3
    invoke-static {p0}, Ld8/b;->p(Ljava/lang/String;)Lc8/a;

    move-result-object p0
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_7} :catch_8

    goto :goto_d

    :catch_8
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    const/4 p0, 0x0

    :goto_d
    const-string v0, ""

    const-string v1, "HEFileUtils"

    if-eqz p0, :cond_149

    iget-object v2, p0, Lc8/a;->b:Ljava/util/ArrayList;

    if-eqz v2, :cond_149

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-nez v2, :cond_1f

    goto/16 :goto_149

    :cond_1f
    iget-object v2, p0, Lc8/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_25
    :goto_25
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5f

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc8/c;

    iget-object v4, v3, Lc8/c;->b:Ljava/util/ArrayList;

    if-nez v4, :cond_36

    goto :goto_25

    :cond_36
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_3a
    :goto_3a
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_25

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, La8/e;

    iget-object v6, v5, La8/e;->a:La8/b;

    if-nez v6, :cond_4b

    goto :goto_3a

    :cond_4b
    iget v6, v6, La8/b;->b:I

    iget v7, v3, Lc8/c;->a:I

    add-int/2addr v6, v7

    if-lt v6, p1, :cond_3a

    iget-object v2, v3, Lc8/c;->b:Ljava/util/ArrayList;

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v2

    iget-object v4, p0, Lc8/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v3

    goto :goto_61

    :cond_5f
    const/4 v2, -0x1

    move v3, v2

    :goto_61
    if-ltz v3, :cond_148

    if-gez v2, :cond_67

    goto/16 :goto_148

    :cond_67
    iget-object v0, p0, Lc8/a;->b:Ljava/util/ArrayList;

    const/4 v4, 0x0

    invoke-virtual {v0, v4, v3}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lc8/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc8/c;

    iget-object v0, v0, Lc8/c;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v4, v2}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "  generatePartialHe20String, targetPatternListItemIndex:"

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ",targetPatterItemIndex:"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ", PatternList size:"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lc8/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ",Pattern size:"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lc8/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc8/c;

    iget-object v3, v3, Lc8/c;->b:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Ld8/d$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lc8/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_c8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_102

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc8/c;

    iget-object v3, v1, Lc8/c;->b:Ljava/util/ArrayList;

    if-nez v3, :cond_d9

    goto :goto_c8

    :cond_d9
    iget v5, v1, Lc8/c;->a:I

    if-ge v5, p1, :cond_fe

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_e1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_fb

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, La8/e;

    iget-object v5, v5, La8/e;->a:La8/b;

    if-nez v5, :cond_f2

    goto :goto_e1

    :cond_f2
    iget v6, v5, La8/b;->b:I

    iget v7, v1, Lc8/c;->a:I

    add-int/2addr v6, v7

    sub-int/2addr v6, p1

    iput v6, v5, La8/b;->b:I

    goto :goto_e1

    :cond_fb
    iput v4, v1, Lc8/c;->a:I

    goto :goto_c8

    :cond_fe
    sub-int/2addr v5, p1

    iput v5, v1, Lc8/c;->a:I

    goto :goto_c8

    :cond_102
    if-nez v2, :cond_143

    iget-object p1, p0, Lc8/a;->b:Ljava/util/ArrayList;

    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc8/c;

    iget p1, p1, Lc8/c;->a:I

    if-eqz p1, :cond_143

    new-instance p1, Lc8/c;

    invoke-direct {p1}, Lc8/c;-><init>()V

    iput v4, p1, Lc8/c;->a:I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p1, Lc8/c;->b:Ljava/util/ArrayList;

    new-instance v0, La8/b;

    invoke-direct {v0}, La8/b;-><init>()V

    new-instance v1, La8/d;

    invoke-direct {v1}, La8/d;-><init>()V

    iput-object v1, v0, La8/b;->e:La8/d;

    iput v4, v1, La8/d;->a:I

    iput v4, v1, La8/d;->b:I

    const-string v1, "transient"

    iput-object v1, v0, La8/b;->a:Ljava/lang/String;

    new-instance v1, La8/e;

    invoke-direct {v1}, La8/e;-><init>()V

    iput-object v0, v1, La8/e;->a:La8/b;

    iget-object v0, p1, Lc8/c;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lc8/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v4, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    :cond_143
    invoke-static {p0}, Ld8/b;->c(Lc8/a;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_148
    :goto_148
    return-object v0

    :cond_149
    :goto_149
    const-string p0, "  generatePartialHe20String, source HE invalid!"

    invoke-static {v1, p0}, Ld8/d$a;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static o(Ljava/lang/String;I)I
    .registers 4

    const/4 v0, 0x0

    if-eqz p0, :cond_1a

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_a

    goto :goto_1a

    :cond_a
    invoke-static {p0, p1}, Ld8/b;->r(Ljava/lang/String;I)La8/c;

    move-result-object p0

    invoke-static {p0}, Le8/d;->d(La8/c;)Z

    move-result p1

    if-nez p1, :cond_15

    return v0

    :cond_15
    invoke-interface {p0}, La8/c;->c()I

    move-result p0

    return p0

    :cond_1a
    :goto_1a
    return v0
.end method

.method public static p(Ljava/lang/String;)Lc8/a;
    .registers 18

    const-string v0, "Intensity"

    const-string v1, "Frequency"

    const-string v2, "continuous"

    invoke-static/range {p0 .. p0}, Ld8/b;->q(Ljava/lang/String;)I

    move-result v3

    const/4 v4, 0x2

    const/4 v5, 0x0

    if-eq v4, v3, :cond_f

    return-object v5

    :cond_f
    :try_start_f
    new-instance v3, Lorg/json/JSONObject;

    move-object/from16 v4, p0

    invoke-direct {v3, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    new-instance v4, Lc8/a;

    invoke-direct {v4}, Lc8/a;-><init>()V

    new-instance v6, Lc8/b;

    invoke-direct {v6}, Lc8/b;-><init>()V

    iput-object v6, v4, Lc8/a;->a:Lc8/b;

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iput-object v6, v4, Lc8/a;->b:Ljava/util/ArrayList;

    const-string v6, "PatternList"

    invoke-virtual {v3, v6}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v3

    const/4 v7, 0x0

    :goto_30
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v8

    if-ge v7, v8, :cond_154

    invoke-virtual {v3, v7}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lorg/json/JSONObject;

    new-instance v9, Lc8/c;

    invoke-direct {v9}, Lc8/c;-><init>()V

    const-string v10, "AbsoluteTime"

    invoke-virtual {v8, v10}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v10

    iput v10, v9, Lc8/c;->a:I

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    iput-object v10, v9, Lc8/c;->b:Ljava/util/ArrayList;

    const-string v10, "Pattern"

    invoke-virtual {v8, v10}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v8

    const/4 v10, 0x0

    :goto_57
    invoke-virtual {v8}, Lorg/json/JSONArray;->length()I

    move-result v11

    if-ge v10, v11, :cond_146

    invoke-virtual {v8, v10}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lorg/json/JSONObject;

    new-instance v12, La8/e;

    invoke-direct {v12}, La8/e;-><init>()V

    new-instance v13, La8/b;

    invoke-direct {v13}, La8/b;-><init>()V

    iput-object v13, v12, La8/e;->a:La8/b;

    const-string v13, "Event"

    invoke-virtual {v11, v13}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v11

    iget-object v13, v12, La8/e;->a:La8/b;

    const-string v14, "Type"

    invoke-virtual {v11, v14}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    iput-object v14, v13, La8/b;->a:Ljava/lang/String;

    iget-object v13, v12, La8/e;->a:La8/b;

    iget-object v13, v13, La8/b;->a:Ljava/lang/String;

    invoke-virtual {v2, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_99

    iget-object v13, v12, La8/e;->a:La8/b;

    const-string v14, "Duration"

    invoke-virtual {v11, v14}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v14

    iput v14, v13, La8/b;->c:I
    :try_end_93
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_93} :catch_94

    goto :goto_ab

    :catch_94
    move-exception v0

    move-object/from16 v16, v5

    goto/16 :goto_155

    :cond_99
    const-string v13, "transient"

    :try_start_9b
    iget-object v14, v12, La8/e;->a:La8/b;

    iget-object v14, v14, La8/b;->a:Ljava/lang/String;

    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_ab

    iget-object v13, v12, La8/e;->a:La8/b;

    const/16 v14, 0x30

    iput v14, v13, La8/b;->c:I

    :cond_ab
    :goto_ab
    iget-object v13, v12, La8/e;->a:La8/b;

    const-string v14, "RelativeTime"

    invoke-virtual {v11, v14}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v14

    iput v14, v13, La8/b;->b:I

    iget-object v13, v12, La8/e;->a:La8/b;

    const-string v14, "Index"

    invoke-virtual {v11, v14}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v14

    iput v14, v13, La8/b;->d:I

    const-string v13, "Parameters"

    invoke-virtual {v11, v13}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v11

    iget-object v13, v12, La8/e;->a:La8/b;

    new-instance v14, La8/d;

    invoke-direct {v14}, La8/d;-><init>()V

    iput-object v14, v13, La8/b;->e:La8/d;

    iget-object v13, v12, La8/e;->a:La8/b;

    iget-object v13, v13, La8/b;->e:La8/d;

    invoke-virtual {v11, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v14

    iput v14, v13, La8/d;->b:I

    iget-object v13, v12, La8/e;->a:La8/b;

    iget-object v13, v13, La8/b;->e:La8/d;

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v14

    iput v14, v13, La8/d;->a:I

    iget-object v13, v12, La8/e;->a:La8/b;

    iget-object v13, v13, La8/b;->e:La8/d;

    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    iput-object v14, v13, La8/d;->c:Ljava/util/ArrayList;

    iget-object v13, v12, La8/e;->a:La8/b;

    iget-object v13, v13, La8/b;->a:Ljava/lang/String;

    invoke-virtual {v2, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_137

    const-string v13, "Curve"

    invoke-virtual {v11, v13}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v11

    const/4 v13, 0x0

    :goto_fe
    invoke-virtual {v11}, Lorg/json/JSONArray;->length()I

    move-result v14

    if-ge v13, v14, :cond_137

    invoke-virtual {v11, v13}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lorg/json/JSONObject;

    new-instance v15, La8/a;

    invoke-direct {v15}, La8/a;-><init>()V
    :try_end_10f
    .catch Ljava/lang/Exception; {:try_start_9b .. :try_end_10f} :catch_94

    move-object/from16 v16, v5

    :try_start_111
    invoke-virtual {v14, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v5

    iput v5, v15, La8/a;->c:I

    move v5, v7

    invoke-virtual {v14, v0}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v6

    iput-wide v6, v15, La8/a;->b:D

    const-string v6, "Time"

    invoke-virtual {v14, v6}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v6

    iput v6, v15, La8/a;->a:I

    iget-object v6, v12, La8/e;->a:La8/b;

    iget-object v6, v6, La8/b;->e:La8/d;

    iget-object v6, v6, La8/d;->c:Ljava/util/ArrayList;

    invoke-virtual {v6, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v13, v13, 0x1

    move v7, v5

    move-object/from16 v5, v16

    goto :goto_fe

    :catch_135
    move-exception v0

    goto :goto_155

    :cond_137
    move-object/from16 v16, v5

    move v5, v7

    iget-object v6, v9, Lc8/c;->b:Ljava/util/ArrayList;

    invoke-virtual {v6, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v10, v10, 0x1

    move v7, v5

    move-object/from16 v5, v16

    goto/16 :goto_57

    :cond_146
    move-object/from16 v16, v5

    move v5, v7

    iget-object v6, v4, Lc8/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_14e
    .catch Ljava/lang/Exception; {:try_start_111 .. :try_end_14e} :catch_135

    add-int/lit8 v7, v5, 0x1

    move-object/from16 v5, v16

    goto/16 :goto_30

    :cond_154
    return-object v4

    :goto_155
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    return-object v16
.end method

.method public static q(Ljava/lang/String;)I
    .registers 4

    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v1, "Metadata"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "Version"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result p0
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_11} :catch_12

    return p0

    :catch_12
    move-exception v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getHeVersion ERROR, heString:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v1, "HEFileUtils"

    invoke-static {v1, p0}, Ld8/d$a;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    const/4 p0, 0x0

    return p0
.end method

.method public static r(Ljava/lang/String;I)La8/c;
    .registers 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getHeRootFromHeString, HE version:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "HEFileUtils"

    invoke-static {v1, v0}, Ld8/d$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eq p1, v0, :cond_28

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1e

    return-object v1

    :cond_1e
    :try_start_1e
    invoke-static {p0}, Ld8/b;->p(Ljava/lang/String;)Lc8/a;

    move-result-object p0
    :try_end_22
    .catch Ljava/lang/Exception; {:try_start_1e .. :try_end_22} :catch_23

    return-object p0

    :catch_23
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    return-object v1

    :cond_28
    :try_start_28
    invoke-static {p0}, Ld8/b;->m(Ljava/lang/String;)Lb8/a;

    move-result-object p0
    :try_end_2c
    .catch Ljava/lang/Exception; {:try_start_28 .. :try_end_2c} :catch_2d

    return-object p0

    :catch_2d
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    return-object v1
.end method

.method public static s(Ljava/lang/String;)Ljava/lang/String;
    .registers 6

    :try_start_0
    invoke-static {p0}, Ld8/b;->p(Ljava/lang/String;)Lc8/a;

    move-result-object p0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_4} :catch_5

    goto :goto_a

    :catch_5
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    const/4 p0, 0x0

    :goto_a
    invoke-static {p0}, Le8/d;->d(La8/c;)Z

    move-result v0

    if-nez v0, :cond_1a

    const-string p0, "HEFileUtils"

    const-string v0, " , trim16pTo4p, invalid HE2.0 string!"

    invoke-static {p0, v0}, Ld8/d$a;->d(Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, ""

    return-object p0

    :cond_1a
    iget-object v0, p0, Lc8/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_20
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_69

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc8/c;

    iget-object v1, v1, Lc8/c;->b:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_32
    :goto_32
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_20

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La8/e;

    iget-object v3, v2, La8/e;->a:La8/b;

    iget-object v3, v3, La8/b;->e:La8/d;

    iget-object v4, v3, La8/d;->c:Ljava/util/ArrayList;

    invoke-static {v4}, Ld8/b;->h(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object v4

    iput-object v4, v3, La8/d;->c:Ljava/util/ArrayList;

    iget-object v3, v2, La8/e;->a:La8/b;

    iget-object v3, v3, La8/b;->a:Ljava/lang/String;

    const-string v4, "transient"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_32

    iget-object v2, v2, La8/e;->a:La8/b;

    iget-object v2, v2, La8/b;->e:La8/d;

    iget v3, v2, La8/d;->b:I

    if-gez v3, :cond_62

    const/4 v3, 0x0

    iput v3, v2, La8/d;->b:I

    goto :goto_32

    :cond_62
    const/16 v4, 0x64

    if-le v3, v4, :cond_32

    iput v4, v2, La8/d;->b:I

    goto :goto_32

    :cond_69
    invoke-static {p0}, Ld8/b;->c(Lc8/a;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static t(Ljava/lang/String;I)Ljava/lang/String;
    .registers 9

    :try_start_0
    invoke-static {p0}, Ld8/b;->p(Ljava/lang/String;)Lc8/a;

    move-result-object p0

    const/4 v0, 0x0

    move v1, v0

    :goto_6
    iget-object v2, p0, Lc8/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_11e

    move v2, v0

    :goto_f
    iget-object v3, p0, Lc8/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc8/c;

    iget-object v3, v3, Lc8/c;->b:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_116

    iget-object v3, p0, Lc8/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc8/c;

    iget v3, v3, Lc8/c;->a:I

    if-gt v3, p1, :cond_bb

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

    if-lt v3, p1, :cond_bb

    new-instance v3, Lc8/a;

    invoke-direct {v3}, Lc8/a;-><init>()V

    new-instance v4, Lc8/b;

    invoke-direct {v4}, Lc8/b;-><init>()V

    iput-object v4, v3, Lc8/a;->a:Lc8/b;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, v3, Lc8/a;->b:Ljava/util/ArrayList;

    new-instance v4, Lc8/c;

    invoke-direct {v4}, Lc8/c;-><init>()V

    iput v0, v4, Lc8/c;->a:I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, v4, Lc8/c;->b:Ljava/util/ArrayList;

    iget-object v5, p0, Lc8/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lc8/c;

    iget-object v5, v5, Lc8/c;->b:Ljava/util/ArrayList;

    iget-object v6, p0, Lc8/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lc8/c;

    iget-object v6, v6, Lc8/c;->b:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v6

    invoke-virtual {v5, v2, v6}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v0, v4, Lc8/c;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_92
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_b1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La8/e;

    iget-object v2, v2, La8/e;->a:La8/b;

    iget v5, v2, La8/b;->b:I

    iget-object v6, p0, Lc8/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lc8/c;

    iget v6, v6, Lc8/c;->a:I

    add-int/2addr v5, v6

    sub-int/2addr v5, p1

    iput v5, v2, La8/b;->b:I

    goto :goto_92

    :cond_b1
    iget-object p0, v3, Lc8/a;->b:Ljava/util/ArrayList;

    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v3}, Ld8/b;->c(Lc8/a;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_bb
    iget-object v3, p0, Lc8/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc8/c;

    iget v3, v3, Lc8/c;->a:I

    if-le v3, p1, :cond_112

    new-instance p0, Lc8/a;

    invoke-direct {p0}, Lc8/a;-><init>()V

    new-instance p1, Lc8/b;

    invoke-direct {p1}, Lc8/b;-><init>()V

    iput-object p1, p0, Lc8/a;->a:Lc8/b;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lc8/a;->b:Ljava/util/ArrayList;

    new-instance p1, Lc8/c;

    invoke-direct {p1}, Lc8/c;-><init>()V

    iput v0, p1, Lc8/c;->a:I

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p1, Lc8/c;->b:Ljava/util/ArrayList;

    new-instance v1, La8/b;

    invoke-direct {v1}, La8/b;-><init>()V

    new-instance v2, La8/d;

    invoke-direct {v2}, La8/d;-><init>()V

    iput-object v2, v1, La8/b;->e:La8/d;

    iput v0, v2, La8/d;->a:I

    iput v0, v2, La8/d;->b:I

    const-string v0, "transient"

    iput-object v0, v1, La8/b;->a:Ljava/lang/String;

    new-instance v0, La8/e;

    invoke-direct {v0}, La8/e;-><init>()V

    iput-object v1, v0, La8/e;->a:La8/b;

    iget-object v1, p1, Lc8/c;->b:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lc8/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {p0}, Ld8/b;->c(Lc8/a;)Ljava/lang/String;

    move-result-object p0
    :try_end_111
    .catchall {:try_start_0 .. :try_end_111} :catchall_11a

    return-object p0

    :cond_112
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_f

    :cond_116
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_6

    :catchall_11a
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_11e
    const/4 p0, 0x0

    return-object p0
.end method

.method public static u(Ljava/lang/String;)Ljava/lang/String;
    .registers 20

    move-object/from16 v1, p0

    const-string v0, "transient"

    const-string v2, "trimOverlapEvent_in.he"

    invoke-static {v2, v1}, Ld8/d;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v1}, Ld8/b;->p(Ljava/lang/String;)Lc8/a;

    move-result-object v2

    invoke-static {v2}, Le8/d;->d(La8/c;)Z

    move-result v3

    if-nez v3, :cond_14

    return-object v1

    :cond_14
    :try_start_14
    iget-object v3, v2, Lc8/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_163

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lc8/c;

    iget-object v5, v4, Lc8/c;->b:Ljava/util/ArrayList;

    if-nez v5, :cond_2b

    goto :goto_1a

    :cond_2b
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_2f
    :goto_2f
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const/4 v7, 0x2

    if-eqz v6, :cond_49

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, La8/e;

    iget-object v6, v6, La8/e;->a:La8/b;

    iget v6, v6, La8/b;->d:I

    if-ne v7, v6, :cond_2f

    invoke-interface {v5}, Ljava/util/Iterator;->remove()V

    goto :goto_2f

    :catchall_46
    move-exception v0

    goto/16 :goto_16d

    :cond_49
    iget-object v5, v4, Lc8/c;->b:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v5

    const/4 v6, 0x1

    if-ne v6, v5, :cond_53

    goto :goto_1a

    :cond_53
    iget-object v5, v4, Lc8/c;->b:Ljava/util/ArrayList;

    new-instance v8, Ld8/b$a;

    invoke-direct {v8}, Ld8/b$a;-><init>()V

    invoke-static {v5, v8}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    const/4 v5, 0x0

    move v8, v5

    move v9, v6

    :goto_60
    iget-object v10, v4, Lc8/c;->b:Ljava/util/ArrayList;

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v10

    sub-int/2addr v10, v6

    if-gt v8, v10, :cond_13f

    iget-object v10, v4, Lc8/c;->b:Ljava/util/ArrayList;

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v10

    sub-int/2addr v10, v6

    if-gt v9, v10, :cond_13f

    iget-object v10, v4, Lc8/c;->b:Ljava/util/ArrayList;

    invoke-virtual {v10, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, La8/e;

    iget-object v10, v10, La8/e;->a:La8/b;

    iget-object v11, v4, Lc8/c;->b:Ljava/util/ArrayList;

    invoke-virtual {v11, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, La8/e;

    iget-object v11, v11, La8/e;->a:La8/b;

    iget-object v12, v10, La8/b;->a:Ljava/lang/String;

    invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    const/16 v13, 0x30

    if-eqz v12, :cond_92

    move v12, v13

    goto :goto_94

    :cond_92
    iget v12, v10, La8/b;->c:I

    :goto_94
    iget-object v14, v11, La8/b;->a:Ljava/lang/String;

    invoke-virtual {v0, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_9e

    move v14, v13

    goto :goto_a0

    :cond_9e
    iget v14, v11, La8/b;->c:I

    :goto_a0
    iget v15, v11, La8/b;->b:I

    iget v6, v10, La8/b;->b:I
    :try_end_a4
    .catchall {:try_start_14 .. :try_end_a4} :catchall_46

    add-int/2addr v6, v12

    if-ge v15, v6, :cond_12f

    const-string v6, "continuous"

    :try_start_a9
    iget-object v15, v11, La8/b;->a:Ljava/lang/String;

    invoke-virtual {v6, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_b9

    iget v6, v11, La8/b;->b:I

    add-int/2addr v6, v14

    iget v14, v10, La8/b;->b:I

    add-int/2addr v14, v12

    if-gt v6, v14, :cond_bf

    :cond_b9
    :goto_b9
    move-object/from16 v17, v0

    move v14, v5

    move/from16 v16, v7

    goto :goto_120

    :cond_bf
    sub-int/2addr v6, v14

    if-gt v6, v13, :cond_c3

    goto :goto_b9

    :cond_c3
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    new-instance v13, La8/a;

    invoke-direct {v13}, La8/a;-><init>()V

    iput v5, v13, La8/a;->a:I

    const-wide/16 v14, 0x0

    iput-wide v14, v13, La8/a;->b:D

    iput v5, v13, La8/a;->c:I

    move/from16 v16, v7

    new-instance v7, La8/a;

    invoke-direct {v7}, La8/a;-><init>()V

    div-int/lit8 v14, v6, 0x3

    iput v14, v7, La8/a;->a:I

    const-wide/high16 v14, 0x3ff0000000000000L    # 1.0

    iput-wide v14, v7, La8/a;->b:D

    iput v5, v7, La8/a;->c:I

    new-instance v5, La8/a;

    invoke-direct {v5}, La8/a;-><init>()V

    div-int/lit8 v18, v6, 0x3

    mul-int/lit8 v14, v18, 0x2

    iput v14, v5, La8/a;->a:I

    const-wide/high16 v14, 0x3ff0000000000000L    # 1.0

    iput-wide v14, v5, La8/a;->b:D

    const/4 v14, 0x0

    iput v14, v5, La8/a;->c:I

    new-instance v15, La8/a;

    invoke-direct {v15}, La8/a;-><init>()V

    iput v6, v15, La8/a;->a:I

    move-object/from16 v17, v0

    const-wide/16 v0, 0x0

    iput-wide v0, v15, La8/a;->b:D

    iput v14, v15, La8/a;->c:I

    invoke-virtual {v8, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v8, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput v6, v11, La8/b;->c:I

    iget v0, v10, La8/b;->b:I

    add-int/2addr v0, v12

    iput v0, v11, La8/b;->b:I

    iget-object v0, v11, La8/b;->e:La8/d;

    iput-object v8, v0, La8/d;->c:Ljava/util/ArrayList;

    move v8, v9

    goto :goto_123

    :goto_120
    const/4 v0, -0x1

    iput v0, v11, La8/b;->d:I

    :goto_123
    add-int/lit8 v9, v9, 0x1

    move-object/from16 v1, p0

    move v5, v14

    move/from16 v7, v16

    move-object/from16 v0, v17

    const/4 v6, 0x1

    goto/16 :goto_60

    :cond_12f
    move-object/from16 v17, v0

    move v14, v5

    move/from16 v16, v7

    add-int/lit8 v0, v9, 0x1

    move-object/from16 v1, p0

    move v8, v9

    const/4 v6, 0x1

    move v9, v0

    move-object/from16 v0, v17

    goto/16 :goto_60

    :cond_13f
    move-object/from16 v17, v0

    iget-object v0, v4, Lc8/c;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_147
    :goto_147
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_15d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La8/e;

    iget-object v1, v1, La8/e;->a:La8/b;

    iget v1, v1, La8/b;->d:I

    if-gez v1, :cond_147

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_147

    :cond_15d
    move-object/from16 v1, p0

    move-object/from16 v0, v17

    goto/16 :goto_1a

    :cond_163
    invoke-static {v2}, Ld8/b;->c(Lc8/a;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "trimOverlapEvent_out.he"

    invoke-static {v1, v0}, Ld8/d;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_16c
    .catchall {:try_start_a9 .. :try_end_16c} :catchall_46

    return-object v0

    :goto_16d
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "trimOverlapEvent "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "HEFileUtils"

    invoke-static {v1, v0}, Ld8/d$a;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method
