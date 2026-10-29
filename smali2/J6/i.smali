.class public final LJ6/i;
.super Lg3/x;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJ6/i$a;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "LJ6/i;",
            ">;"
        }
    .end annotation
.end field

.field public static final F:LJ6/i$a;


# instance fields
.field private final A:Ljava/lang/String;

.field private final B:Ljava/lang/String;

.field private C:Ljava/util/List;

.field private D:Lb3/o;

.field private E:Z

.field private final w:Ljava/lang/String;

.field private final x:Ljava/lang/String;

.field private final y:Ljava/lang/String;

.field private final z:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LJ6/i$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LJ6/i$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LJ6/i;->F:LJ6/i$a;

    new-instance v0, LJ6/i$b;

    invoke-direct {v0}, LJ6/i$b;-><init>()V

    sput-object v0, LJ6/i;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .registers 8

    const-string v0, "wallpaperId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "collectionId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "filePath"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitle"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lg3/x;-><init>()V

    iput-object p1, p0, LJ6/i;->w:Ljava/lang/String;

    iput-object p2, p0, LJ6/i;->x:Ljava/lang/String;

    iput-object p3, p0, LJ6/i;->y:Ljava/lang/String;

    iput-object p4, p0, LJ6/i;->z:Ljava/lang/String;

    iput-object p5, p0, LJ6/i;->A:Ljava/lang/String;

    iput-object p6, p0, LJ6/i;->B:Ljava/lang/String;

    return-void
.end method

.method public static final y(Landroid/content/Context;)Ljava/lang/String;
    .registers 2

    sget-object v0, LJ6/i;->F:LJ6/i$a;

    invoke-virtual {v0, p0}, LJ6/i$a;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final A(Z)V
    .registers 2

    iput-boolean p1, p0, LJ6/i;->E:Z

    return-void
.end method

.method public c(Landroid/content/Context;)Ljava/lang/String;
    .registers 2

    iget-object p0, p0, LJ6/i;->B:Ljava/lang/String;

    return-object p0
.end method

.method public d(Landroid/content/Context;)Lcom/android/wallpaper/asset/a;
    .registers 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LJ6/i;->D:Lb3/o;

    if-eqz p1, :cond_a

    return-object p1

    :cond_a
    new-instance p1, Lb3/o;

    new-instance v0, Ljava/io/File;

    iget-object v1, p0, LJ6/i;->y:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v0}, Lb3/o;-><init>(Ljava/io/File;)V

    iput-object p1, p0, LJ6/i;->D:Lb3/o;

    return-object p1
.end method

.method public e(Landroid/content/Context;)Ljava/util/List;
    .registers 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LJ6/i;->C:Ljava/util/List;

    if-nez p1, :cond_30

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, p0, LJ6/i;->z:Ljava/lang/String;

    if-eqz v0, :cond_1e

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_19

    goto :goto_1e

    :cond_19
    iget-object v0, p0, LJ6/i;->z:Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1e
    :goto_1e
    iget-object v0, p0, LJ6/i;->A:Ljava/lang/String;

    if-eqz v0, :cond_2e

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_29

    goto :goto_2e

    :cond_29
    iget-object v0, p0, LJ6/i;->A:Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2e
    :goto_2e
    iput-object p1, p0, LJ6/i;->C:Ljava/util/List;

    :cond_30
    return-object p1
.end method

.method public g(Landroid/content/Context;)Ljava/lang/String;
    .registers 2

    iget-object p0, p0, LJ6/i;->x:Ljava/lang/String;

    return-object p0
.end method

.method public o(Landroid/content/Context;)Lcom/android/wallpaper/asset/a;
    .registers 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LJ6/i;->d(Landroid/content/Context;)Lcom/android/wallpaper/asset/a;

    move-result-object p0

    return-object p0
.end method

.method public r()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, LJ6/i;->w:Ljava/lang/String;

    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 3

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, LJ6/i;->w:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, LJ6/i;->x:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, LJ6/i;->y:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, LJ6/i;->z:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, LJ6/i;->A:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p0, p0, LJ6/i;->B:Ljava/lang/String;

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

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

.method public final z()Z
    .registers 1

    iget-boolean p0, p0, LJ6/i;->E:Z

    return p0
.end method
