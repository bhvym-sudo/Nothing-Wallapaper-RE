.class public final Lg9/x;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final a:LP8/D;

.field private final b:Ljava/lang/Object;

.field private final c:LP8/E;


# direct methods
.method private constructor <init>(LP8/D;Ljava/lang/Object;LP8/E;)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg9/x;->a:LP8/D;

    iput-object p2, p0, Lg9/x;->b:Ljava/lang/Object;

    iput-object p3, p0, Lg9/x;->c:LP8/E;

    return-void
.end method

.method public static c(LP8/E;LP8/D;)Lg9/x;
    .registers 4

    const-string v0, "body == null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "rawResponse == null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-virtual {p1}, LP8/D;->isSuccessful()Z

    move-result v0

    if-nez v0, :cond_17

    new-instance v0, Lg9/x;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1, p0}, Lg9/x;-><init>(LP8/D;Ljava/lang/Object;LP8/E;)V

    return-object v0

    :cond_17
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "rawResponse should not be successful response"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static f(Ljava/lang/Object;LP8/D;)Lg9/x;
    .registers 4

    const-string v0, "rawResponse == null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-virtual {p1}, LP8/D;->isSuccessful()Z

    move-result v0

    if-eqz v0, :cond_12

    new-instance v0, Lg9/x;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p0, v1}, Lg9/x;-><init>(LP8/D;Ljava/lang/Object;LP8/E;)V

    return-object v0

    :cond_12
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "rawResponse must be successful response"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .registers 1

    iget-object p0, p0, Lg9/x;->b:Ljava/lang/Object;

    return-object p0
.end method

.method public b()I
    .registers 1

    iget-object p0, p0, Lg9/x;->a:LP8/D;

    invoke-virtual {p0}, LP8/D;->j()I

    move-result p0

    return p0
.end method

.method public d()Z
    .registers 1

    iget-object p0, p0, Lg9/x;->a:LP8/D;

    invoke-virtual {p0}, LP8/D;->isSuccessful()Z

    move-result p0

    return p0
.end method

.method public e()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lg9/x;->a:LP8/D;

    invoke-virtual {p0}, LP8/D;->K()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lg9/x;->a:LP8/D;

    invoke-virtual {p0}, LP8/D;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
