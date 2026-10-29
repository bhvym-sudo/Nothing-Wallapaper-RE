.class public final LJ7/n$b;
.super LJ7/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJ7/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "LJ7/n$b;",
            ">;"
        }
    .end annotation
.end field

.field public static final q:LJ7/n$b;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, LJ7/n$b;

    invoke-direct {v0}, LJ7/n$b;-><init>()V

    sput-object v0, LJ7/n$b;->q:LJ7/n$b;

    new-instance v0, LJ7/n$b$a;

    invoke-direct {v0}, LJ7/n$b$a;-><init>()V

    sput-object v0, LJ7/n$b;->CREATOR:Landroid/os/Parcelable$Creator;

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
    instance-of p0, p1, LJ7/n$b;

    if-nez p0, :cond_a

    const/4 p0, 0x0

    return p0

    :cond_a
    return v0
.end method

.method public hashCode()I
    .registers 1

    const p0, -0x615a8ea4

    return p0
.end method

.method public toString()Ljava/lang/String;
    .registers 1

    const-string p0, "Preview"

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
