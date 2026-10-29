.class public LJ6/a;
.super Lg3/k;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "LJ6/a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private B:Ljava/util/List;

.field private C:Ljava/lang/String;

.field private D:Ljava/lang/String;

.field private E:Ljava/lang/String;

.field private F:Lg3/x;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, LJ6/a$a;

    invoke-direct {v0}, LJ6/a$a;-><init>()V

    sput-object v0, LJ6/a;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/app/WallpaperInfo;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LC6/g;Lg3/x$a;)V
    .registers 8

    .line 1
    invoke-direct {p0, p1}, Lg3/k;-><init>(Landroid/app/WallpaperInfo;)V

    .line 2
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 3
    iput-object p2, p0, LJ6/a;->B:Ljava/util/List;

    .line 4
    iput-object p3, p0, LJ6/a;->C:Ljava/lang/String;

    .line 5
    iput-object p4, p0, LJ6/a;->D:Ljava/lang/String;

    .line 6
    iput-object p5, p0, LJ6/a;->E:Ljava/lang/String;

    .line 7
    invoke-virtual {p0, p6}, Lg3/x;->v(LC6/g;)V

    if-eqz p7, :cond_17

    .line 8
    iput-object p7, p0, Lg3/x;->q:Lg3/x$a;

    :cond_17
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .registers 3

    .line 14
    invoke-direct {p0, p1}, Lg3/k;-><init>(Landroid/os/Parcel;)V

    .line 15
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LJ6/a;->B:Ljava/util/List;

    .line 16
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readStringList(Ljava/util/List;)V

    .line 17
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LJ6/a;->C:Ljava/lang/String;

    .line 18
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LJ6/a;->D:Ljava/lang/String;

    .line 19
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LJ6/a;->E:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lg3/x;Landroid/app/WallpaperInfo;LC6/g;Lg3/x$a;)V
    .registers 5

    .line 9
    invoke-direct {p0, p2}, Lg3/k;-><init>(Landroid/app/WallpaperInfo;)V

    .line 10
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, LJ6/a;->B:Ljava/util/List;

    .line 11
    iput-object p1, p0, LJ6/a;->F:Lg3/x;

    .line 12
    invoke-virtual {p0, p3}, Lg3/x;->v(LC6/g;)V

    if-eqz p4, :cond_13

    .line 13
    iput-object p4, p0, Lg3/x;->q:Lg3/x$a;

    :cond_13
    return-void
.end method


# virtual methods
.method public c(Landroid/content/Context;)Ljava/lang/String;
    .registers 3

    iget-object v0, p0, LJ6/a;->F:Lg3/x;

    if-eqz v0, :cond_9

    invoke-virtual {v0, p1}, Lg3/x;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_9
    iget-object p0, p0, LJ6/a;->C:Ljava/lang/String;

    return-object p0
.end method

.method public e(Landroid/content/Context;)Ljava/util/List;
    .registers 3

    iget-object v0, p0, LJ6/a;->F:Lg3/x;

    if-eqz v0, :cond_9

    invoke-virtual {v0, p1}, Lg3/x;->e(Landroid/content/Context;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_9
    iget-object p0, p0, LJ6/a;->B:Ljava/util/List;

    return-object p0
.end method

.method public f()I
    .registers 2

    iget-object v0, p0, LJ6/a;->F:Lg3/x;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Lg3/x;->f()I

    move-result p0

    return p0

    :cond_9
    invoke-super {p0}, Lg3/x;->f()I

    move-result p0

    return p0
.end method

.method public g(Landroid/content/Context;)Ljava/lang/String;
    .registers 3

    iget-object v0, p0, LJ6/a;->F:Lg3/x;

    if-eqz v0, :cond_9

    invoke-virtual {v0, p1}, Lg3/x;->g(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_9
    iget-object p0, p0, LJ6/a;->D:Ljava/lang/String;

    return-object p0
.end method

.method public r()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, LJ6/a;->F:Lg3/x;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Lg3/x;->r()Ljava/lang/String;

    move-result-object v0

    goto :goto_b

    :cond_9
    iget-object v0, p0, LJ6/a;->E:Ljava/lang/String;

    :goto_b
    if-nez v0, :cond_12

    invoke-super {p0}, Lg3/k;->r()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_12
    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .registers 3

    invoke-super {p0, p1, p2}, Lg3/k;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object p2, p0, LJ6/a;->B:Ljava/util/List;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    iget-object p2, p0, LJ6/a;->C:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, LJ6/a;->D:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p0, p0, LJ6/a;->E:Ljava/lang/String;

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
