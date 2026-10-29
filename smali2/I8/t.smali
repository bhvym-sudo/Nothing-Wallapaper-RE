.class abstract synthetic LI8/t;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LI8/f;I)LI8/f;
    .registers 3

    if-ltz p1, :cond_8

    new-instance v0, LI8/t$a;

    invoke-direct {v0, p0, p1}, LI8/t$a;-><init>(LI8/f;I)V

    return-object v0

    :cond_8
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Drop count should be non-negative, but had "

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final b(LI8/f;Lv8/p;)LI8/f;
    .registers 3

    new-instance v0, LI8/t$c;

    invoke-direct {v0, p0, p1}, LI8/t$c;-><init>(LI8/f;Lv8/p;)V

    return-object v0
.end method

.method public static final c(LI8/f;Lv8/p;)LI8/f;
    .registers 3

    new-instance v0, LI8/t$e;

    invoke-direct {v0, p0, p1}, LI8/t$e;-><init>(LI8/f;Lv8/p;)V

    return-object v0
.end method
