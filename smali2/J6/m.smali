.class public final LJ6/m;
.super Lg3/x;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJ6/m$a;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "LJ6/m;",
            ">;"
        }
    .end annotation
.end field

.field public static final z:LJ6/m$a;


# instance fields
.field private final w:I

.field private final x:I

.field private final y:I


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LJ6/m$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LJ6/m$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LJ6/m;->z:LJ6/m$a;

    new-instance v0, LJ6/m$b;

    invoke-direct {v0}, LJ6/m$b;-><init>()V

    sput-object v0, LJ6/m;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(III)V
    .registers 4

    .line 2
    invoke-direct {p0}, Lg3/x;-><init>()V

    .line 3
    iput p1, p0, LJ6/m;->w:I

    .line 4
    iput p2, p0, LJ6/m;->x:I

    .line 5
    iput p3, p0, LJ6/m;->y:I

    return-void
.end method

.method public synthetic constructor <init>(IIIILkotlin/jvm/internal/h;)V
    .registers 6

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_5

    const/4 p3, 0x1

    .line 1
    :cond_5
    invoke-direct {p0, p1, p2, p3}, LJ6/m;-><init>(III)V

    return-void
.end method


# virtual methods
.method public final A()I
    .registers 1

    iget p0, p0, LJ6/m;->x:I

    return p0
.end method

.method public B(Landroid/content/Context;)Ljava/lang/Void;
    .registers 2

    const/4 p0, 0x0

    return-object p0
.end method

.method public final C()I
    .registers 1

    iget p0, p0, LJ6/m;->w:I

    return p0
.end method

.method public bridge synthetic d(Landroid/content/Context;)Lcom/android/wallpaper/asset/a;
    .registers 2

    invoke-virtual {p0, p1}, LJ6/m;->y(Landroid/content/Context;)Ljava/lang/Void;

    move-result-object p0

    check-cast p0, Lcom/android/wallpaper/asset/a;

    return-object p0
.end method

.method public e(Landroid/content/Context;)Ljava/util/List;
    .registers 2

    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    return-object p0
.end method

.method public g(Landroid/content/Context;)Ljava/lang/String;
    .registers 2

    iget p0, p0, LJ6/m;->y:I

    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic o(Landroid/content/Context;)Lcom/android/wallpaper/asset/a;
    .registers 2

    invoke-virtual {p0, p1}, LJ6/m;->B(Landroid/content/Context;)Ljava/lang/Void;

    move-result-object p0

    check-cast p0, Lcom/android/wallpaper/asset/a;

    return-object p0
.end method

.method public r()Ljava/lang/String;
    .registers 1

    iget p0, p0, LJ6/m;->y:I

    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 3

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget p2, p0, LJ6/m;->w:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, LJ6/m;->x:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p0, p0, LJ6/m;->y:I

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method

.method public x(Landroid/app/Activity;Lg3/j;IZ)V
    .registers 5

    return-void
.end method

.method public y(Landroid/content/Context;)Ljava/lang/Void;
    .registers 2

    const/4 p0, 0x0

    return-object p0
.end method

.method public final z()I
    .registers 1

    iget p0, p0, LJ6/m;->y:I

    return p0
.end method
