.class public final La7/d$c$d;
.super La7/d$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La7/d$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "La7/d$c$d;",
            ">;"
        }
    .end annotation
.end field

.field public static final v:La7/d$c$d;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, La7/d$c$d;

    invoke-direct {v0}, La7/d$c$d;-><init>()V

    sput-object v0, La7/d$c$d;->v:La7/d$c$d;

    new-instance v0, La7/d$c$d$a;

    invoke-direct {v0}, La7/d$c$d$a;-><init>()V

    sput-object v0, La7/d$c$d;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>()V
    .registers 2

    const/4 v0, 0x0

    invoke-direct {p0, v0}, La7/d$c;-><init>(Lkotlin/jvm/internal/h;)V

    return-void
.end method


# virtual methods
.method public final describeContents()I
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 3

    const-string p0, "dest"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x1

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
