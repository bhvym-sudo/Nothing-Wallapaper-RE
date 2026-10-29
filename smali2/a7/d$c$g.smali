.class public final La7/d$c$g;
.super La7/d$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La7/d$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "g"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "La7/d$c$g;",
            ">;"
        }
    .end annotation
.end field

.field public static final v:La7/d$c$g;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, La7/d$c$g;

    invoke-direct {v0}, La7/d$c$g;-><init>()V

    sput-object v0, La7/d$c$g;->v:La7/d$c$g;

    new-instance v0, La7/d$c$g$a;

    invoke-direct {v0}, La7/d$c$g$a;-><init>()V

    sput-object v0, La7/d$c$g;->CREATOR:Landroid/os/Parcelable$Creator;

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
