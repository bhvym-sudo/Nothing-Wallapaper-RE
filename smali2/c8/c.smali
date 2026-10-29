.class public Lc8/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()I
    .registers 6

    const/4 v0, 0x0

    :try_start_1
    iget-object p0, p0, Lc8/c;->b:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    move v1, v0

    :cond_8
    :goto_8
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_34

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La8/e;

    iget-object v3, v2, La8/e;->a:La8/b;

    iget-object v3, v3, La8/b;->a:Ljava/lang/String;

    const-string v4, "continuous"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2a

    iget-object v2, v2, La8/e;->a:La8/b;

    iget v3, v2, La8/b;->b:I

    iget v2, v2, La8/b;->c:I

    add-int/2addr v3, v2

    goto :goto_30

    :catch_28
    move-exception p0

    goto :goto_35

    :cond_2a
    iget-object v2, v2, La8/e;->a:La8/b;

    iget v2, v2, La8/b;->b:I
    :try_end_2e
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_2e} :catch_28

    add-int/lit8 v3, v2, 0x30

    :goto_30
    if-le v3, v1, :cond_8

    move v1, v3

    goto :goto_8

    :cond_34
    return v1

    :goto_35
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    return v0
.end method
