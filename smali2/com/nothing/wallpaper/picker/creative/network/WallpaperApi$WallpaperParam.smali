.class public final Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperParam;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "WallpaperParam"
.end annotation


# instance fields
.field private final clue:I

.field private final promptSet:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$PromptParam;",
            ">;"
        }
    .end annotation
.end field

.field private final pseudoUserId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;ILjava/util/List;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/List<",
            "Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$PromptParam;",
            ">;)V"
        }
    .end annotation

    const-string v0, "pseudoUserId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "promptSet"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperParam;->pseudoUserId:Ljava/lang/String;

    iput p2, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperParam;->clue:I

    iput-object p3, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperParam;->promptSet:Ljava/util/List;

    return-void
.end method

.method public static synthetic copy$default(Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperParam;Ljava/lang/String;ILjava/util/List;ILjava/lang/Object;)Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperParam;
    .registers 6

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_6

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperParam;->pseudoUserId:Ljava/lang/String;

    :cond_6
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_c

    iget p2, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperParam;->clue:I

    :cond_c
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_12

    iget-object p3, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperParam;->promptSet:Ljava/util/List;

    :cond_12
    invoke-virtual {p0, p1, p2, p3}, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperParam;->copy(Ljava/lang/String;ILjava/util/List;)Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperParam;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperParam;->pseudoUserId:Ljava/lang/String;

    return-object p0
.end method

.method public final component2()I
    .registers 1

    iget p0, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperParam;->clue:I

    return p0
.end method

.method public final component3()Ljava/util/List;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$PromptParam;",
            ">;"
        }
    .end annotation

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperParam;->promptSet:Ljava/util/List;

    return-object p0
.end method

.method public final copy(Ljava/lang/String;ILjava/util/List;)Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperParam;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/List<",
            "Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$PromptParam;",
            ">;)",
            "Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperParam;"
        }
    .end annotation

    const-string p0, "pseudoUserId"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "promptSet"

    invoke-static {p3, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperParam;

    invoke-direct {p0, p1, p2, p3}, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperParam;-><init>(Ljava/lang/String;ILjava/util/List;)V

    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_4

    return v0

    :cond_4
    instance-of v1, p1, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperParam;

    const/4 v2, 0x0

    if-nez v1, :cond_a

    return v2

    :cond_a
    check-cast p1, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperParam;

    iget-object v1, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperParam;->pseudoUserId:Ljava/lang/String;

    iget-object v3, p1, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperParam;->pseudoUserId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    return v2

    :cond_17
    iget v1, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperParam;->clue:I

    iget v3, p1, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperParam;->clue:I

    if-eq v1, v3, :cond_1e

    return v2

    :cond_1e
    iget-object p0, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperParam;->promptSet:Ljava/util/List;

    iget-object p1, p1, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperParam;->promptSet:Ljava/util/List;

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_29

    return v2

    :cond_29
    return v0
.end method

.method public final getClue()I
    .registers 1

    iget p0, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperParam;->clue:I

    return p0
.end method

.method public final getPromptSet()Ljava/util/List;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$PromptParam;",
            ">;"
        }
    .end annotation

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperParam;->promptSet:Ljava/util/List;

    return-object p0
.end method

.method public final getPseudoUserId()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperParam;->pseudoUserId:Ljava/lang/String;

    return-object p0
.end method

.method public hashCode()I
    .registers 3

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperParam;->pseudoUserId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperParam;->clue:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperParam;->promptSet:Ljava/util/List;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .registers 5

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperParam;->pseudoUserId:Ljava/lang/String;

    iget v1, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperParam;->clue:I

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperParam;->promptSet:Ljava/util/List;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WallpaperParam(pseudoUserId="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", clue="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", promptSet="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
