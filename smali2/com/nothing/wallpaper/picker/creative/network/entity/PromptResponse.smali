.class public final Lcom/nothing/wallpaper/picker/creative/network/entity/PromptResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# instance fields
.field private final localLanguageCode:Ljava/lang/String;

.field private final promptSets:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/nothing/wallpaper/picker/creative/model/PromptCategory;",
            ">;"
        }
    .end annotation
.end field

.field private final version:I


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/util/List;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/nothing/wallpaper/picker/creative/model/PromptCategory;",
            ">;)V"
        }
    .end annotation

    const-string v0, "localLanguageCode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/nothing/wallpaper/picker/creative/network/entity/PromptResponse;->version:I

    iput-object p2, p0, Lcom/nothing/wallpaper/picker/creative/network/entity/PromptResponse;->localLanguageCode:Ljava/lang/String;

    iput-object p3, p0, Lcom/nothing/wallpaper/picker/creative/network/entity/PromptResponse;->promptSets:Ljava/util/List;

    return-void
.end method

.method public static synthetic copy$default(Lcom/nothing/wallpaper/picker/creative/network/entity/PromptResponse;ILjava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lcom/nothing/wallpaper/picker/creative/network/entity/PromptResponse;
    .registers 6

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_6

    iget p1, p0, Lcom/nothing/wallpaper/picker/creative/network/entity/PromptResponse;->version:I

    :cond_6
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_c

    iget-object p2, p0, Lcom/nothing/wallpaper/picker/creative/network/entity/PromptResponse;->localLanguageCode:Ljava/lang/String;

    :cond_c
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_12

    iget-object p3, p0, Lcom/nothing/wallpaper/picker/creative/network/entity/PromptResponse;->promptSets:Ljava/util/List;

    :cond_12
    invoke-virtual {p0, p1, p2, p3}, Lcom/nothing/wallpaper/picker/creative/network/entity/PromptResponse;->copy(ILjava/lang/String;Ljava/util/List;)Lcom/nothing/wallpaper/picker/creative/network/entity/PromptResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .registers 1

    iget p0, p0, Lcom/nothing/wallpaper/picker/creative/network/entity/PromptResponse;->version:I

    return p0
.end method

.method public final component2()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/creative/network/entity/PromptResponse;->localLanguageCode:Ljava/lang/String;

    return-object p0
.end method

.method public final component3()Ljava/util/List;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/nothing/wallpaper/picker/creative/model/PromptCategory;",
            ">;"
        }
    .end annotation

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/creative/network/entity/PromptResponse;->promptSets:Ljava/util/List;

    return-object p0
.end method

.method public final copy(ILjava/lang/String;Ljava/util/List;)Lcom/nothing/wallpaper/picker/creative/network/entity/PromptResponse;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/nothing/wallpaper/picker/creative/model/PromptCategory;",
            ">;)",
            "Lcom/nothing/wallpaper/picker/creative/network/entity/PromptResponse;"
        }
    .end annotation

    const-string p0, "localLanguageCode"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lcom/nothing/wallpaper/picker/creative/network/entity/PromptResponse;

    invoke-direct {p0, p1, p2, p3}, Lcom/nothing/wallpaper/picker/creative/network/entity/PromptResponse;-><init>(ILjava/lang/String;Ljava/util/List;)V

    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_4

    return v0

    :cond_4
    instance-of v1, p1, Lcom/nothing/wallpaper/picker/creative/network/entity/PromptResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_a

    return v2

    :cond_a
    check-cast p1, Lcom/nothing/wallpaper/picker/creative/network/entity/PromptResponse;

    iget v1, p0, Lcom/nothing/wallpaper/picker/creative/network/entity/PromptResponse;->version:I

    iget v3, p1, Lcom/nothing/wallpaper/picker/creative/network/entity/PromptResponse;->version:I

    if-eq v1, v3, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lcom/nothing/wallpaper/picker/creative/network/entity/PromptResponse;->localLanguageCode:Ljava/lang/String;

    iget-object v3, p1, Lcom/nothing/wallpaper/picker/creative/network/entity/PromptResponse;->localLanguageCode:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1e

    return v2

    :cond_1e
    iget-object p0, p0, Lcom/nothing/wallpaper/picker/creative/network/entity/PromptResponse;->promptSets:Ljava/util/List;

    iget-object p1, p1, Lcom/nothing/wallpaper/picker/creative/network/entity/PromptResponse;->promptSets:Ljava/util/List;

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_29

    return v2

    :cond_29
    return v0
.end method

.method public final getLocalLanguageCode()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/creative/network/entity/PromptResponse;->localLanguageCode:Ljava/lang/String;

    return-object p0
.end method

.method public final getPromptSets()Ljava/util/List;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/nothing/wallpaper/picker/creative/model/PromptCategory;",
            ">;"
        }
    .end annotation

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/creative/network/entity/PromptResponse;->promptSets:Ljava/util/List;

    return-object p0
.end method

.method public final getVersion()I
    .registers 1

    iget p0, p0, Lcom/nothing/wallpaper/picker/creative/network/entity/PromptResponse;->version:I

    return p0
.end method

.method public hashCode()I
    .registers 3

    iget v0, p0, Lcom/nothing/wallpaper/picker/creative/network/entity/PromptResponse;->version:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/nothing/wallpaper/picker/creative/network/entity/PromptResponse;->localLanguageCode:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/creative/network/entity/PromptResponse;->promptSets:Ljava/util/List;

    if-nez p0, :cond_17

    const/4 p0, 0x0

    goto :goto_1b

    :cond_17
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p0

    :goto_1b
    add-int/2addr v0, p0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .registers 5

    iget v0, p0, Lcom/nothing/wallpaper/picker/creative/network/entity/PromptResponse;->version:I

    iget-object v1, p0, Lcom/nothing/wallpaper/picker/creative/network/entity/PromptResponse;->localLanguageCode:Ljava/lang/String;

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/creative/network/entity/PromptResponse;->promptSets:Ljava/util/List;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "PromptResponse(version="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", localLanguageCode="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", promptSets="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
