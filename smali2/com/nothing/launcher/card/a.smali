.class public final Lcom/nothing/launcher/card/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/nothing/launcher/card/a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final q:LF5/m;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, Lcom/nothing/launcher/card/a$a;

    invoke-direct {v0}, Lcom/nothing/launcher/card/a$a;-><init>()V

    sput-object v0, Lcom/nothing/launcher/card/a;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(LF5/m;)V
    .registers 3

    const-string v0, "info"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/nothing/launcher/card/a;->q:LF5/m;

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Lcom/nothing/launcher/card/j;
    .registers 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/nothing/launcher/card/j;->Z:Lcom/nothing/launcher/card/j$a;

    iget-object p0, p0, Lcom/nothing/launcher/card/a;->q:LF5/m;

    invoke-virtual {v0, p1, p0}, Lcom/nothing/launcher/card/j$a;->a(Landroid/content/Context;LF5/m;)Lcom/nothing/launcher/card/j;

    move-result-object p0

    return-object p0
.end method

.method public final b()Z
    .registers 5

    iget-object v0, p0, Lcom/nothing/launcher/card/a;->q:LF5/m;

    invoke-virtual {v0}, LF5/m;->d()I

    move-result v0

    and-int/lit8 v1, v0, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_12

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_12

    move v0, v3

    goto :goto_13

    :cond_12
    move v0, v2

    :goto_13
    iget-object p0, p0, Lcom/nothing/launcher/card/a;->q:LF5/m;

    invoke-virtual {p0}, LF5/m;->m()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_1e

    if-nez v0, :cond_1e

    return v3

    :cond_1e
    return v2
.end method

.method public final describeContents()I
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 4

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lcom/nothing/launcher/card/a;->q:LF5/m;

    invoke-virtual {p1, p0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method
