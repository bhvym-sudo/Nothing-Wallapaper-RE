.class abstract LE8/r;
.super LE8/q;
.source "SourceFile"


# direct methods
.method public static n(Ljava/lang/String;)Ljava/lang/Double;
    .registers 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    :try_start_6
    sget-object v1, LE8/h;->b:LE8/g;

    invoke-virtual {v1, p0}, LE8/g;->a(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_17

    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0
    :try_end_16
    .catch Ljava/lang/NumberFormatException; {:try_start_6 .. :try_end_16} :catch_17

    return-object p0

    :catch_17
    :cond_17
    return-object v0
.end method

.method public static o(Ljava/lang/String;)Ljava/lang/Float;
    .registers 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    :try_start_6
    sget-object v1, LE8/h;->b:LE8/g;

    invoke-virtual {v1, p0}, LE8/g;->a(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_17

    invoke-static {p0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0
    :try_end_16
    .catch Ljava/lang/NumberFormatException; {:try_start_6 .. :try_end_16} :catch_17

    return-object p0

    :catch_17
    :cond_17
    return-object v0
.end method
