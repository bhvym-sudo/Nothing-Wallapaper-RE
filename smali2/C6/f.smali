.class public final LC6/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lw6/c;

.field private final b:LC6/i;

.field private final c:LC6/b;

.field private final d:LC6/e;


# direct methods
.method public constructor <init>(Lw6/c;LC6/i;LC6/b;)V
    .registers 5

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bitmap"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requestFrom"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LC6/f;->a:Lw6/c;

    iput-object p2, p0, LC6/f;->b:LC6/i;

    iput-object p3, p0, LC6/f;->c:LC6/b;

    invoke-virtual {p1}, Lw6/c;->b()LE6/a$a;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {p1}, LE6/a$a;->b()LC6/e;

    move-result-object p1

    iput-object p1, p0, LC6/f;->d:LC6/e;

    return-void
.end method


# virtual methods
.method public final a()LC6/i;
    .registers 1

    iget-object p0, p0, LC6/f;->b:LC6/i;

    return-object p0
.end method

.method public final b()LC6/e;
    .registers 1

    iget-object p0, p0, LC6/f;->d:LC6/e;

    return-object p0
.end method

.method public final c()Lw6/c;
    .registers 1

    iget-object p0, p0, LC6/f;->a:Lw6/c;

    return-object p0
.end method

.method public final d()LC6/b;
    .registers 1

    iget-object p0, p0, LC6/f;->c:LC6/b;

    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_4

    return v0

    :cond_4
    instance-of v1, p1, LC6/f;

    const/4 v2, 0x0

    if-nez v1, :cond_a

    return v2

    :cond_a
    check-cast p1, LC6/f;

    iget-object v1, p0, LC6/f;->a:Lw6/c;

    iget-object v3, p1, LC6/f;->a:Lw6/c;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    return v2

    :cond_17
    iget-object v1, p0, LC6/f;->b:LC6/i;

    iget-object v3, p1, LC6/f;->b:LC6/i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_22

    return v2

    :cond_22
    iget-object p0, p0, LC6/f;->c:LC6/b;

    iget-object p1, p1, LC6/f;->c:LC6/b;

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2d

    return v2

    :cond_2d
    return v0
.end method

.method public hashCode()I
    .registers 3

    iget-object v0, p0, LC6/f;->a:Lw6/c;

    invoke-virtual {v0}, Lw6/c;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LC6/f;->b:LC6/i;

    invoke-virtual {v1}, LC6/i;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object p0, p0, LC6/f;->c:LC6/b;

    invoke-virtual {p0}, LC6/b;->hashCode()I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .registers 5

    iget-object v0, p0, LC6/f;->a:Lw6/c;

    iget-object v1, p0, LC6/f;->b:LC6/i;

    iget-object p0, p0, LC6/f;->c:LC6/b;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "EffectCroppedBitmap(request="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", bitmap="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", requestFrom="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
