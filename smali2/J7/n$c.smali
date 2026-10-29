.class public final LJ7/n$c;
.super LJ7/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJ7/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "LJ7/n$c;",
            ">;"
        }
    .end annotation
.end field

.field public static final q:LJ7/n$c;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, LJ7/n$c;

    invoke-direct {v0}, LJ7/n$c;-><init>()V

    sput-object v0, LJ7/n$c;->q:LJ7/n$c;

    new-instance v0, LJ7/n$c$a;

    invoke-direct {v0}, LJ7/n$c$a;-><init>()V

    sput-object v0, LJ7/n$c;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>()V
    .registers 2

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LJ7/n;-><init>(Lkotlin/jvm/internal/h;)V

    return-void
.end method


# virtual methods
.method public final describeContents()I
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_4

    return v0

    :cond_4
    instance-of p0, p1, LJ7/n$c;

    if-nez p0, :cond_a

    const/4 p0, 0x0

    return p0

    :cond_a
    return v0
.end method

.method public hashCode()I
    .registers 1

    const p0, 0x1a69e840

    return p0
.end method

.method public toString()Ljava/lang/String;
    .registers 1

    const-string p0, "ShortCutPicker"

    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 3

    const-string p0, "dest"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x1

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
