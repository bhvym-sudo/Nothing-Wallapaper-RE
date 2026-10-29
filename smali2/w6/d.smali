.class public final Lw6/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lw6/c;

.field private final b:Lw6/b;


# direct methods
.method public constructor <init>(Lw6/c;Lw6/b;)V
    .registers 4

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "image"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw6/d;->a:Lw6/c;

    iput-object p2, p0, Lw6/d;->b:Lw6/b;

    return-void
.end method

.method public static synthetic b(Lw6/d;Lw6/c;Lw6/b;ILjava/lang/Object;)Lw6/d;
    .registers 5

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_6

    iget-object p1, p0, Lw6/d;->a:Lw6/c;

    :cond_6
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_c

    iget-object p2, p0, Lw6/d;->b:Lw6/b;

    :cond_c
    invoke-virtual {p0, p1, p2}, Lw6/d;->a(Lw6/c;Lw6/b;)Lw6/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lw6/c;Lw6/b;)Lw6/d;
    .registers 3

    const-string p0, "request"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "image"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lw6/d;

    invoke-direct {p0, p1, p2}, Lw6/d;-><init>(Lw6/c;Lw6/b;)V

    return-object p0
.end method

.method public final c()Lw6/b;
    .registers 1

    iget-object p0, p0, Lw6/d;->b:Lw6/b;

    return-object p0
.end method

.method public final d()Lw6/c;
    .registers 1

    iget-object p0, p0, Lw6/d;->a:Lw6/c;

    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_4

    return v0

    :cond_4
    instance-of v1, p1, Lw6/d;

    const/4 v2, 0x0

    if-nez v1, :cond_a

    return v2

    :cond_a
    check-cast p1, Lw6/d;

    iget-object v1, p0, Lw6/d;->a:Lw6/c;

    iget-object v3, p1, Lw6/d;->a:Lw6/c;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    return v2

    :cond_17
    iget-object p0, p0, Lw6/d;->b:Lw6/b;

    iget-object p1, p1, Lw6/d;->b:Lw6/b;

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_22

    return v2

    :cond_22
    return v0
.end method

.method public hashCode()I
    .registers 2

    iget-object v0, p0, Lw6/d;->a:Lw6/c;

    invoke-virtual {v0}, Lw6/c;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object p0, p0, Lw6/d;->b:Lw6/b;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .registers 4

    iget-object v0, p0, Lw6/d;->a:Lw6/c;

    iget-object p0, p0, Lw6/d;->b:Lw6/b;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Result(request="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", image="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
