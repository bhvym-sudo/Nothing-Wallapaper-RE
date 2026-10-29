.class LJ6/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJ6/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)LJ6/a;
    .registers 2

    new-instance p0, LJ6/a;

    invoke-direct {p0, p1}, LJ6/a;-><init>(Landroid/os/Parcel;)V

    return-object p0
.end method

.method public b(I)[LJ6/a;
    .registers 2

    new-array p0, p1, [LJ6/a;

    return-object p0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    invoke-virtual {p0, p1}, LJ6/a$a;->a(Landroid/os/Parcel;)LJ6/a;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    invoke-virtual {p0, p1}, LJ6/a$a;->b(I)[LJ6/a;

    move-result-object p0

    return-object p0
.end method
