.class public abstract Ld9/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Le9/e;)Z
    .registers 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    :try_start_6
    new-instance v2, Le9/e;

    invoke-direct {v2}, Le9/e;-><init>()V

    invoke-virtual {p0}, Le9/e;->X0()J

    move-result-wide v3

    const-wide/16 v5, 0x40

    invoke-static {v3, v4, v5, v6}, LB8/h;->j(JJ)J

    move-result-wide v5

    const-wide/16 v3, 0x0

    move-object v1, p0

    invoke-virtual/range {v1 .. v6}, Le9/e;->Q(Le9/e;JJ)Le9/e;

    move p0, v0

    :goto_1c
    const/16 v1, 0x10

    if-ge p0, v1, :cond_3b

    invoke-virtual {v2}, Le9/e;->D()Z

    move-result v1

    if-eqz v1, :cond_27

    goto :goto_3b

    :cond_27
    invoke-virtual {v2}, Le9/e;->U0()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Character;->isISOControl(I)Z

    move-result v3

    if-eqz v3, :cond_38

    invoke-static {v1}, Ljava/lang/Character;->isWhitespace(I)Z

    move-result v1
    :try_end_35
    .catch Ljava/io/EOFException; {:try_start_6 .. :try_end_35} :catch_3d

    if-nez v1, :cond_38

    return v0

    :cond_38
    add-int/lit8 p0, p0, 0x1

    goto :goto_1c

    :cond_3b
    :goto_3b
    const/4 p0, 0x1

    return p0

    :catch_3d
    return v0
.end method
