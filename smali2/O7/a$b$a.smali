.class public final LO7/a$b$a;
.super LO7/a$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LO7/a$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "LO7/a$b$a;",
            ">;"
        }
    .end annotation
.end field

.field public static final q:LO7/a$b$a;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, LO7/a$b$a;

    invoke-direct {v0}, LO7/a$b$a;-><init>()V

    sput-object v0, LO7/a$b$a;->q:LO7/a$b$a;

    new-instance v0, LO7/a$b$a$a;

    invoke-direct {v0}, LO7/a$b$a$a;-><init>()V

    sput-object v0, LO7/a$b$a;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>()V
    .registers 2

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LO7/a$b;-><init>(Lkotlin/jvm/internal/h;)V

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
