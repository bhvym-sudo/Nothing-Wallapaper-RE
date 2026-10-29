.class public final Lcom/nothing/wallpaper/picker/creative/model/PromptCategory$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nothing/wallpaper/picker/creative/model/PromptCategory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/os/Parcel;)Lcom/nothing/wallpaper/picker/creative/model/PromptCategory;
    .registers 6

    const-string p0, "parcel"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v2, 0x0

    :goto_13
    if-eq v2, v0, :cond_21

    sget-object v3, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v3, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_13

    :cond_21
    new-instance p1, Lcom/nothing/wallpaper/picker/creative/model/PromptCategory;

    invoke-direct {p1, p0, v1}, Lcom/nothing/wallpaper/picker/creative/model/PromptCategory;-><init>(Ljava/lang/String;Ljava/util/List;)V

    return-object p1
.end method

.method public final b(I)[Lcom/nothing/wallpaper/picker/creative/model/PromptCategory;
    .registers 2

    new-array p0, p1, [Lcom/nothing/wallpaper/picker/creative/model/PromptCategory;

    return-object p0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/picker/creative/model/PromptCategory$a;->a(Landroid/os/Parcel;)Lcom/nothing/wallpaper/picker/creative/model/PromptCategory;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/picker/creative/model/PromptCategory$a;->b(I)[Lcom/nothing/wallpaper/picker/creative/model/PromptCategory;

    move-result-object p0

    return-object p0
.end method
