.class public abstract LF8/H0;
.super LF8/I;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, LF8/I;-><init>()V

    return-void
.end method


# virtual methods
.method public j1(ILjava/lang/String;)LF8/I;
    .registers 3

    invoke-static {p1}, LK8/l;->a(I)V

    invoke-static {p0, p2}, LK8/l;->b(LF8/I;Ljava/lang/String;)LF8/I;

    move-result-object p0

    return-object p0
.end method

.method public abstract l1()LF8/H0;
.end method

.method protected final m1()Ljava/lang/String;
    .registers 3

    invoke-static {}, LF8/b0;->c()LF8/H0;

    move-result-object v0

    if-ne p0, v0, :cond_9

    const-string p0, "Dispatchers.Main"

    return-object p0

    :cond_9
    const/4 v1, 0x0

    :try_start_a
    invoke-virtual {v0}, LF8/H0;->l1()LF8/H0;

    move-result-object v0
    :try_end_e
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_a .. :try_end_e} :catch_f

    goto :goto_10

    :catch_f
    move-object v0, v1

    :goto_10
    if-ne p0, v0, :cond_15

    const-string p0, "Dispatchers.Main.immediate"

    return-object p0

    :cond_15
    return-object v1
.end method
