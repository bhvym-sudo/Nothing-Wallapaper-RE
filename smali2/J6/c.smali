.class public final LJ6/c;
.super Lg3/x;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJ6/c$a;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "LJ6/c;",
            ">;"
        }
    .end annotation
.end field

.field public static final G:LJ6/c$a;


# instance fields
.field private final A:I

.field private final B:I

.field private final C:I

.field private D:Ljava/util/List;

.field private E:Ljava/lang/String;

.field private F:Lh6/c;

.field private final w:Ljava/lang/String;

.field private final x:Ljava/lang/String;

.field private final y:I

.field private final z:I


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LJ6/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LJ6/c$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LJ6/c;->G:LJ6/c$a;

    new-instance v0, LJ6/c$b;

    invoke-direct {v0}, LJ6/c$b;-><init>()V

    sput-object v0, LJ6/c;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;IIIII)V
    .registers 9

    const-string v0, "wallpaperId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "collectionId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lg3/x;-><init>()V

    .line 3
    iput-object p1, p0, LJ6/c;->w:Ljava/lang/String;

    .line 4
    iput-object p2, p0, LJ6/c;->x:Ljava/lang/String;

    .line 5
    iput p3, p0, LJ6/c;->y:I

    .line 6
    iput p4, p0, LJ6/c;->z:I

    .line 7
    iput p5, p0, LJ6/c;->A:I

    .line 8
    iput p6, p0, LJ6/c;->B:I

    .line 9
    iput p7, p0, LJ6/c;->C:I

    const/4 p1, 0x0

    .line 10
    iput-boolean p1, p0, Lg3/x;->t:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;IIIIIILkotlin/jvm/internal/h;)V
    .registers 11

    and-int/lit8 p9, p8, 0x10

    const/4 v0, 0x0

    if-eqz p9, :cond_6

    move p5, v0

    :cond_6
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_b

    move p6, v0

    :cond_b
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_10

    move p7, v0

    .line 1
    :cond_10
    invoke-direct/range {p0 .. p7}, LJ6/c;-><init>(Ljava/lang/String;Ljava/lang/String;IIIII)V

    return-void
.end method

.method private final y(Landroid/content/Context;)Landroid/content/res/Resources;
    .registers 2

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    const-string p1, "getResources(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method


# virtual methods
.method public c(Landroid/content/Context;)Ljava/lang/String;
    .registers 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, LJ6/c;->C:I

    if-nez v0, :cond_b

    const/4 p0, 0x0

    return-object p0

    :cond_b
    iget-object v0, p0, LJ6/c;->E:Ljava/lang/String;

    if-nez v0, :cond_21

    invoke-direct {p0, p1}, LJ6/c;->y(Landroid/content/Context;)Landroid/content/res/Resources;

    move-result-object p1

    iget v0, p0, LJ6/c;->C:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LJ6/c;->E:Ljava/lang/String;

    const-string p0, "also(...)"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_21
    return-object v0
.end method

.method public d(Landroid/content/Context;)Lcom/android/wallpaper/asset/a;
    .registers 5

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LJ6/c;->F:Lh6/c;

    if-eqz v0, :cond_a

    return-object v0

    :cond_a
    new-instance v0, Lh6/c;

    invoke-direct {p0, p1}, LJ6/c;->y(Landroid/content/Context;)Landroid/content/res/Resources;

    move-result-object p1

    iget v1, p0, LJ6/c;->y:I

    iget-object v2, p0, LJ6/c;->w:Ljava/lang/String;

    invoke-direct {v0, p1, v1, v2}, Lh6/c;-><init>(Landroid/content/res/Resources;ILjava/lang/String;)V

    iput-object v0, p0, LJ6/c;->F:Lh6/c;

    return-object v0
.end method

.method public e(Landroid/content/Context;)Ljava/util/List;
    .registers 5

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LJ6/c;->D:Ljava/util/List;

    if-nez v0, :cond_40

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {p0, p1}, LJ6/c;->y(Landroid/content/Context;)Landroid/content/res/Resources;

    move-result-object p1

    iget v1, p0, LJ6/c;->z:I

    const-string v2, "getString(...)"

    if-eqz v1, :cond_22

    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_22
    iget v1, p0, LJ6/c;->A:I

    if-eqz v1, :cond_30

    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_30
    iget v1, p0, LJ6/c;->B:I

    if-eqz v1, :cond_3e

    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3e
    iput-object v0, p0, LJ6/c;->D:Ljava/util/List;

    :cond_40
    return-object v0
.end method

.method public g(Landroid/content/Context;)Ljava/lang/String;
    .registers 2

    iget-object p0, p0, LJ6/c;->x:Ljava/lang/String;

    return-object p0
.end method

.method public o(Landroid/content/Context;)Lcom/android/wallpaper/asset/a;
    .registers 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LJ6/c;->d(Landroid/content/Context;)Lcom/android/wallpaper/asset/a;

    move-result-object p0

    return-object p0
.end method

.method public r()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, LJ6/c;->w:Ljava/lang/String;

    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 3

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, LJ6/c;->w:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, LJ6/c;->x:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget p2, p0, LJ6/c;->y:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, LJ6/c;->z:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, LJ6/c;->A:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, LJ6/c;->B:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p0, p0, LJ6/c;->C:I

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method

.method public x(Landroid/app/Activity;Lg3/j;IZ)V
    .registers 5

    if-eqz p1, :cond_d

    if-eqz p2, :cond_9

    invoke-interface {p2, p1, p0, p4}, Lg3/j;->b(Landroid/content/Context;Lg3/x;Z)Landroid/content/Intent;

    move-result-object p0

    goto :goto_a

    :cond_9
    const/4 p0, 0x0

    :goto_a
    invoke-virtual {p1, p0, p3}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    :cond_d
    return-void
.end method
