.class public final Lp7/c$d;
.super Lp7/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp7/c;
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
            "Lp7/c$d;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final t:Z

.field private final u:Z


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, Lp7/c$d$a;

    invoke-direct {v0}, Lp7/c$d$a;-><init>()V

    sput-object v0, Lp7/c$d;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ZZ)V
    .registers 4

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lp7/c;-><init>(Lkotlin/jvm/internal/h;)V

    iput-boolean p1, p0, Lp7/c$d;->t:Z

    iput-boolean p2, p0, Lp7/c$d;->u:Z

    return-void
.end method

.method public synthetic constructor <init>(ZZILkotlin/jvm/internal/h;)V
    .registers 6

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x1

    if-eqz p4, :cond_6

    move p1, v0

    :cond_6
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_b

    move p2, v0

    .line 2
    :cond_b
    invoke-direct {p0, p1, p2}, Lp7/c$d;-><init>(ZZ)V

    return-void
.end method


# virtual methods
.method public b()Lp7/c;
    .registers 8

    new-instance v0, Lp7/c$b;

    invoke-virtual {p0}, Lp7/c$d;->e()Z

    move-result v3

    invoke-virtual {p0}, Lp7/c$d;->d()Z

    move-result v4

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x4

    invoke-direct/range {v0 .. v6}, Lp7/c$b;-><init>(ZIZZILkotlin/jvm/internal/h;)V

    return-object v0
.end method

.method public d()Z
    .registers 1

    iget-boolean p0, p0, Lp7/c$d;->u:Z

    return p0
.end method

.method public final describeContents()I
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public e()Z
    .registers 1

    iget-boolean p0, p0, Lp7/c$d;->t:Z

    return p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_4

    return v0

    :cond_4
    instance-of v1, p1, Lp7/c$d;

    const/4 v2, 0x0

    if-nez v1, :cond_a

    return v2

    :cond_a
    check-cast p1, Lp7/c$d;

    iget-boolean v1, p0, Lp7/c$d;->t:Z

    iget-boolean v3, p1, Lp7/c$d;->t:Z

    if-eq v1, v3, :cond_13

    return v2

    :cond_13
    iget-boolean p0, p0, Lp7/c$d;->u:Z

    iget-boolean p1, p1, Lp7/c$d;->u:Z

    if-eq p0, p1, :cond_1a

    return v2

    :cond_1a
    return v0
.end method

.method public hashCode()I
    .registers 2

    iget-boolean v0, p0, Lp7/c$d;->t:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean p0, p0, Lp7/c$d;->u:Z

    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .registers 4

    iget-boolean v0, p0, Lp7/c$d;->t:Z

    iget-boolean p0, p0, Lp7/c$d;->u:Z

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Selected(selectedLock="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", selectedHome="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 3

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean p2, p0, Lp7/c$d;->t:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p0, p0, Lp7/c$d;->u:Z

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
