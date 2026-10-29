.class public final LA6/d;
.super Lg3/x;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LA6/d$b;
    }
.end annotation


# static fields
.field public static final A:LA6/d$b;

.field private static final B:Landroid/os/Parcelable$Creator;


# instance fields
.field private final w:Ljava/util/List;

.field private final x:Ljava/lang/String;

.field private final y:Ljava/lang/String;

.field private final z:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LA6/d$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LA6/d$b;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LA6/d;->A:LA6/d$b;

    new-instance v0, LA6/d$a;

    invoke-direct {v0}, LA6/d$a;-><init>()V

    sput-object v0, LA6/d;->B:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .registers 6

    .line 2
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    invoke-direct {p0, v0}, Lg3/x;-><init>(Landroid/os/Parcel;)V

    .line 3
    iput-object p1, p0, LA6/d;->w:Ljava/util/List;

    .line 4
    iput-object p2, p0, LA6/d;->x:Ljava/lang/String;

    .line 5
    iput-object p3, p0, LA6/d;->y:Ljava/lang/String;

    .line 6
    iput-object p4, p0, LA6/d;->z:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/h;)V
    .registers 8

    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x0

    if-eqz p6, :cond_6

    move-object p1, v0

    :cond_6
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_b

    move-object p2, v0

    :cond_b
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_10

    move-object p3, v0

    :cond_10
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_15

    move-object p4, v0

    .line 1
    :cond_15
    invoke-direct {p0, p1, p2, p3, p4}, LA6/d;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public c(Landroid/content/Context;)Ljava/lang/String;
    .registers 2

    iget-object p0, p0, LA6/d;->x:Ljava/lang/String;

    return-object p0
.end method

.method public d(Landroid/content/Context;)Lcom/android/wallpaper/asset/a;
    .registers 2

    const/4 p0, 0x0

    return-object p0
.end method

.method public e(Landroid/content/Context;)Ljava/util/List;
    .registers 2

    iget-object p0, p0, LA6/d;->w:Ljava/util/List;

    if-eqz p0, :cond_b

    check-cast p0, Ljava/util/Collection;

    invoke-static {p0}, Li8/s;->u0(Ljava/util/Collection;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_b
    const/4 p0, 0x0

    return-object p0
.end method

.method public g(Landroid/content/Context;)Ljava/lang/String;
    .registers 2

    iget-object p0, p0, LA6/d;->y:Ljava/lang/String;

    return-object p0
.end method

.method public o(Landroid/content/Context;)Lcom/android/wallpaper/asset/a;
    .registers 2

    const/4 p0, 0x0

    return-object p0
.end method

.method public r()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, LA6/d;->z:Ljava/lang/String;

    return-object p0
.end method

.method public x(Landroid/app/Activity;Lg3/j;IZ)V
    .registers 5

    const-string p0, "srcActivity"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "factory"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
