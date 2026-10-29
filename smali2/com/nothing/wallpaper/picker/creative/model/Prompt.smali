.class public final Lcom/nothing/wallpaper/picker/creative/model/Prompt;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/nothing/wallpaper/picker/creative/model/Prompt;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final photoLink:Ljava/lang/String;

.field private final promptWordEn:Ljava/lang/String;

.field private final promptWordForLocale:Ljava/lang/String;

.field private final promptWordId:J


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, Lcom/nothing/wallpaper/picker/creative/model/Prompt$a;

    invoke-direct {v0}, Lcom/nothing/wallpaper/picker/creative/model/Prompt$a;-><init>()V

    sput-object v0, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .registers 7

    const-string v0, "promptWordEn"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "photoLink"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "promptWordForLocale"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->promptWordId:J

    iput-object p3, p0, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->promptWordEn:Ljava/lang/String;

    iput-object p4, p0, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->photoLink:Ljava/lang/String;

    iput-object p5, p0, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->promptWordForLocale:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/nothing/wallpaper/picker/creative/model/Prompt;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/nothing/wallpaper/picker/creative/model/Prompt;
    .registers 14

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_6

    iget-wide p1, p0, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->promptWordId:J

    :cond_6
    move-wide v1, p1

    and-int/lit8 p1, p6, 0x2

    if-eqz p1, :cond_d

    iget-object p3, p0, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->promptWordEn:Ljava/lang/String;

    :cond_d
    move-object v3, p3

    and-int/lit8 p1, p6, 0x4

    if-eqz p1, :cond_14

    iget-object p4, p0, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->photoLink:Ljava/lang/String;

    :cond_14
    move-object v4, p4

    and-int/lit8 p1, p6, 0x8

    if-eqz p1, :cond_1b

    iget-object p5, p0, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->promptWordForLocale:Ljava/lang/String;

    :cond_1b
    move-object v0, p0

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->copy(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .registers 3

    iget-wide v0, p0, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->promptWordId:J

    return-wide v0
.end method

.method public final component2()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->promptWordEn:Ljava/lang/String;

    return-object p0
.end method

.method public final component3()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->photoLink:Ljava/lang/String;

    return-object p0
.end method

.method public final component4()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->promptWordForLocale:Ljava/lang/String;

    return-object p0
.end method

.method public final copy(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/nothing/wallpaper/picker/creative/model/Prompt;
    .registers 12

    const-string p0, "promptWordEn"

    invoke-static {p3, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "photoLink"

    invoke-static {p4, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "promptWordForLocale"

    invoke-static {p5, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    move-wide v1, p1

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/nothing/wallpaper/picker/creative/model/Prompt;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public final describeContents()I
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 9

    const/4 v0, 0x1

    if-ne p0, p1, :cond_4

    return v0

    :cond_4
    instance-of v1, p1, Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    const/4 v2, 0x0

    if-nez v1, :cond_a

    return v2

    :cond_a
    check-cast p1, Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    iget-wide v3, p0, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->promptWordId:J

    iget-wide v5, p1, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->promptWordId:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->promptWordEn:Ljava/lang/String;

    iget-object v3, p1, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->promptWordEn:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_20

    return v2

    :cond_20
    iget-object v1, p0, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->photoLink:Ljava/lang/String;

    iget-object v3, p1, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->photoLink:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2b

    return v2

    :cond_2b
    iget-object p0, p0, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->promptWordForLocale:Ljava/lang/String;

    iget-object p1, p1, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->promptWordForLocale:Ljava/lang/String;

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_36

    return v2

    :cond_36
    return v0
.end method

.method public final getPhotoLink()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->photoLink:Ljava/lang/String;

    return-object p0
.end method

.method public final getPromptWordEn()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->promptWordEn:Ljava/lang/String;

    return-object p0
.end method

.method public final getPromptWordForLocale()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->promptWordForLocale:Ljava/lang/String;

    return-object p0
.end method

.method public final getPromptWordId()J
    .registers 3

    iget-wide v0, p0, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->promptWordId:J

    return-wide v0
.end method

.method public hashCode()I
    .registers 3

    iget-wide v0, p0, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->promptWordId:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->promptWordEn:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->photoLink:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->promptWordForLocale:Ljava/lang/String;

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .registers 7

    iget-wide v0, p0, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->promptWordId:J

    iget-object v2, p0, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->promptWordEn:Ljava/lang/String;

    iget-object v3, p0, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->photoLink:Ljava/lang/String;

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->promptWordForLocale:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Prompt(promptWordId="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", promptWordEn="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", photoLink="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", promptWordForLocale="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 5

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-wide v0, p0, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->promptWordId:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-object p2, p0, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->promptWordEn:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->photoLink:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->promptWordForLocale:Ljava/lang/String;

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
