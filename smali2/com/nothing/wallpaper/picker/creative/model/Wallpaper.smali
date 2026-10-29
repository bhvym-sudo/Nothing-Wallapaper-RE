.class public final Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;
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
            "Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private id:J

.field private link:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, Lcom/nothing/wallpaper/picker/creative/model/Wallpaper$a;

    invoke-direct {v0}, Lcom/nothing/wallpaper/picker/creative/model/Wallpaper$a;-><init>()V

    sput-object v0, Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(JLjava/lang/String;)V
    .registers 5

    const-string v0, "link"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;->id:J

    iput-object p3, p0, Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;->link:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;JLjava/lang/String;ILjava/lang/Object;)Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;
    .registers 6

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_6

    iget-wide p1, p0, Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;->id:J

    :cond_6
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_c

    iget-object p3, p0, Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;->link:Ljava/lang/String;

    :cond_c
    invoke-virtual {p0, p1, p2, p3}, Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;->copy(JLjava/lang/String;)Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .registers 3

    iget-wide v0, p0, Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;->id:J

    return-wide v0
.end method

.method public final component2()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;->link:Ljava/lang/String;

    return-object p0
.end method

.method public final copy(JLjava/lang/String;)Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;
    .registers 4

    const-string p0, "link"

    invoke-static {p3, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;

    invoke-direct {p0, p1, p2, p3}, Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;-><init>(JLjava/lang/String;)V

    return-object p0
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
    instance-of v1, p1, Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;

    const/4 v2, 0x0

    if-nez v1, :cond_a

    return v2

    :cond_a
    check-cast p1, Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;

    iget-wide v3, p0, Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;->id:J

    iget-wide v5, p1, Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;->id:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_15

    return v2

    :cond_15
    iget-object p0, p0, Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;->link:Ljava/lang/String;

    iget-object p1, p1, Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;->link:Ljava/lang/String;

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_20

    return v2

    :cond_20
    return v0
.end method

.method public final getId()J
    .registers 3

    iget-wide v0, p0, Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;->id:J

    return-wide v0
.end method

.method public final getLink()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;->link:Ljava/lang/String;

    return-object p0
.end method

.method public hashCode()I
    .registers 3

    iget-wide v0, p0, Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;->id:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;->link:Ljava/lang/String;

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method

.method public final setId(J)V
    .registers 3

    iput-wide p1, p0, Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;->id:J

    return-void
.end method

.method public final setLink(Ljava/lang/String;)V
    .registers 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;->link:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 5

    iget-wide v0, p0, Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;->id:J

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;->link:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Wallpaper(id="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", link="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 5

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-wide v0, p0, Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;->id:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;->link:Ljava/lang/String;

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
