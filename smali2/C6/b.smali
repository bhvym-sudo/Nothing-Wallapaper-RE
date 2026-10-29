.class public final LC6/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/nothing/wallpaper/effects/data/model/ViewScope;

.field private final b:LC6/a;

.field private final c:LC6/d;

.field private final d:LC6/i;


# direct methods
.method public constructor <init>(Lcom/nothing/wallpaper/effects/data/model/ViewScope;LC6/a;LC6/d;LC6/i;)V
    .registers 6

    const-string v0, "viewScope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rect"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bitmap"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LC6/b;->a:Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    iput-object p2, p0, LC6/b;->b:LC6/a;

    iput-object p3, p0, LC6/b;->c:LC6/d;

    iput-object p4, p0, LC6/b;->d:LC6/i;

    return-void
.end method


# virtual methods
.method public final a()LC6/i;
    .registers 1

    iget-object p0, p0, LC6/b;->d:LC6/i;

    return-object p0
.end method

.method public final b()LC6/d;
    .registers 1

    iget-object p0, p0, LC6/b;->c:LC6/d;

    return-object p0
.end method

.method public final c()LC6/a;
    .registers 1

    iget-object p0, p0, LC6/b;->b:LC6/a;

    return-object p0
.end method

.method public final d()Lcom/nothing/wallpaper/effects/data/model/ViewScope;
    .registers 1

    iget-object p0, p0, LC6/b;->a:Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_4

    return v0

    :cond_4
    instance-of v1, p1, LC6/b;

    const/4 v2, 0x0

    if-nez v1, :cond_a

    return v2

    :cond_a
    check-cast p1, LC6/b;

    iget-object v1, p0, LC6/b;->a:Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    iget-object v3, p1, LC6/b;->a:Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    return v2

    :cond_17
    iget-object v1, p0, LC6/b;->b:LC6/a;

    iget-object v3, p1, LC6/b;->b:LC6/a;

    if-eq v1, v3, :cond_1e

    return v2

    :cond_1e
    iget-object v1, p0, LC6/b;->c:LC6/d;

    iget-object v3, p1, LC6/b;->c:LC6/d;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_29

    return v2

    :cond_29
    iget-object p0, p0, LC6/b;->d:LC6/i;

    iget-object p1, p1, LC6/b;->d:LC6/i;

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_34

    return v2

    :cond_34
    return v0
.end method

.method public hashCode()I
    .registers 3

    iget-object v0, p0, LC6/b;->a:Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    invoke-virtual {v0}, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LC6/b;->b:LC6/a;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LC6/b;->c:LC6/d;

    invoke-virtual {v1}, LC6/d;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object p0, p0, LC6/b;->d:LC6/i;

    invoke-virtual {p0}, LC6/i;->hashCode()I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .registers 6

    iget-object v0, p0, LC6/b;->a:Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    iget-object v1, p0, LC6/b;->b:LC6/a;

    iget-object v2, p0, LC6/b;->c:LC6/d;

    iget-object p0, p0, LC6/b;->d:LC6/i;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "CroppedBitmap(viewScope="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", type="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", rect="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", bitmap="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, "}])"

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
