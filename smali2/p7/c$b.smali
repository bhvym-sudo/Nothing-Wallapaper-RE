.class public final Lp7/c$b;
.super Lp7/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp7/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp7/c$b$a;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lp7/c$b;",
            ">;"
        }
    .end annotation
.end field

.field public static final x:Lp7/c$b$a;


# instance fields
.field private final t:Z

.field private final u:I

.field private final v:Z

.field private final w:Z


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lp7/c$b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lp7/c$b$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lp7/c$b;->x:Lp7/c$b$a;

    new-instance v0, Lp7/c$b$b;

    invoke-direct {v0}, Lp7/c$b$b;-><init>()V

    sput-object v0, Lp7/c$b;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ZIZZ)V
    .registers 6

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lp7/c;-><init>(Lkotlin/jvm/internal/h;)V

    .line 3
    iput-boolean p1, p0, Lp7/c$b;->t:Z

    .line 4
    iput p2, p0, Lp7/c$b;->u:I

    .line 5
    iput-boolean p3, p0, Lp7/c$b;->v:Z

    .line 6
    iput-boolean p4, p0, Lp7/c$b;->w:Z

    return-void
.end method

.method public synthetic constructor <init>(ZIZZILkotlin/jvm/internal/h;)V
    .registers 8

    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x1

    if-eqz p6, :cond_6

    move p1, v0

    :cond_6
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_b

    move p3, v0

    :cond_b
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_10

    move p4, v0

    .line 1
    :cond_10
    invoke-direct {p0, p1, p2, p3, p4}, Lp7/c$b;-><init>(ZIZZ)V

    return-void
.end method

.method public static synthetic l(Lp7/c$b;ZIZZILjava/lang/Object;)Lp7/c$b;
    .registers 7

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_6

    iget-boolean p1, p0, Lp7/c$b;->t:Z

    :cond_6
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_c

    iget p2, p0, Lp7/c$b;->u:I

    :cond_c
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_12

    iget-boolean p3, p0, Lp7/c$b;->v:Z

    :cond_12
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_18

    iget-boolean p4, p0, Lp7/c$b;->w:Z

    :cond_18
    invoke-virtual {p0, p1, p2, p3, p4}, Lp7/c$b;->k(ZIZZ)Lp7/c$b;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()Lp7/c;
    .registers 8

    invoke-virtual {p0}, Lp7/c$b;->f()Z

    move-result v0

    iget p0, p0, Lp7/c$b;->u:I

    if-eqz v0, :cond_c

    and-int/lit8 p0, p0, -0x2

    :goto_a
    move v2, p0

    goto :goto_11

    :cond_c
    and-int/lit8 p0, p0, -0x3

    or-int/lit8 p0, p0, 0x1

    goto :goto_a

    :goto_11
    if-nez v2, :cond_1c

    new-instance p0, Lp7/c$d;

    const/4 v0, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v2, v2, v0, v1}, Lp7/c$d;-><init>(ZZILkotlin/jvm/internal/h;)V

    return-object p0

    :cond_1c
    new-instance v0, Lp7/c$b;

    const/16 v5, 0xd

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Lp7/c$b;-><init>(ZIZZILkotlin/jvm/internal/h;)V

    return-object v0
.end method

.method public b()Lp7/c;
    .registers 9

    invoke-virtual {p0}, Lp7/c$b;->g()Z

    move-result v0

    if-eqz v0, :cond_c

    iget v0, p0, Lp7/c$b;->u:I

    and-int/lit8 v0, v0, -0x5

    :goto_a
    move v3, v0

    goto :goto_11

    :cond_c
    iget v0, p0, Lp7/c$b;->u:I

    or-int/lit8 v0, v0, 0x4

    goto :goto_a

    :goto_11
    if-nez v3, :cond_21

    new-instance v0, Lp7/c$d;

    invoke-virtual {p0}, Lp7/c$b;->e()Z

    move-result v1

    invoke-virtual {p0}, Lp7/c$b;->d()Z

    move-result p0

    invoke-direct {v0, v1, p0}, Lp7/c$d;-><init>(ZZ)V

    return-object v0

    :cond_21
    invoke-virtual {p0}, Lp7/c$b;->f()Z

    move-result v0

    xor-int/lit8 v2, v0, 0x1

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v7}, Lp7/c$b;->l(Lp7/c$b;ZIZZILjava/lang/Object;)Lp7/c$b;

    move-result-object p0

    return-object p0
.end method

.method public c(ZZ)Lp7/c;
    .registers 13

    if-nez p1, :cond_7

    if-nez p2, :cond_7

    sget-object p0, Lp7/c$c;->t:Lp7/c$c;

    return-object p0

    :cond_7
    iget v0, p0, Lp7/c$b;->u:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_21

    const/4 v2, 0x4

    if-eq v0, v2, :cond_24

    const/4 p0, 0x5

    if-eq v0, p0, :cond_21

    new-instance v2, Lp7/c$b;

    and-int/lit8 p0, v0, -0x3

    or-int/lit8 v4, p0, 0x1

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v3, 0x0

    move v6, p1

    move v5, p2

    invoke-direct/range {v2 .. v8}, Lp7/c$b;-><init>(ZIZZILkotlin/jvm/internal/h;)V

    return-object v2

    :cond_21
    move v7, p1

    move v6, p2

    goto :goto_30

    :cond_24
    move v7, p1

    move v6, p2

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v3, p0

    invoke-static/range {v3 .. v9}, Lp7/c$b;->l(Lp7/c$b;ZIZZILjava/lang/Object;)Lp7/c$b;

    move-result-object p0

    return-object p0

    :goto_30
    new-instance v3, Lp7/c$b;

    and-int/lit8 p0, v0, -0x2

    or-int/lit8 v5, p0, 0x2

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v3 .. v9}, Lp7/c$b;-><init>(ZIZZILkotlin/jvm/internal/h;)V

    return-object v3
.end method

.method public d()Z
    .registers 1

    iget-boolean p0, p0, Lp7/c$b;->w:Z

    return p0
.end method

.method public final describeContents()I
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public e()Z
    .registers 1

    iget-boolean p0, p0, Lp7/c$b;->v:Z

    return p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_4

    return v0

    :cond_4
    instance-of v1, p1, Lp7/c$b;

    const/4 v2, 0x0

    if-nez v1, :cond_a

    return v2

    :cond_a
    check-cast p1, Lp7/c$b;

    iget-boolean v1, p0, Lp7/c$b;->t:Z

    iget-boolean v3, p1, Lp7/c$b;->t:Z

    if-eq v1, v3, :cond_13

    return v2

    :cond_13
    iget v1, p0, Lp7/c$b;->u:I

    iget v3, p1, Lp7/c$b;->u:I

    if-eq v1, v3, :cond_1a

    return v2

    :cond_1a
    iget-boolean v1, p0, Lp7/c$b;->v:Z

    iget-boolean v3, p1, Lp7/c$b;->v:Z

    if-eq v1, v3, :cond_21

    return v2

    :cond_21
    iget-boolean p0, p0, Lp7/c$b;->w:Z

    iget-boolean p1, p1, Lp7/c$b;->w:Z

    if-eq p0, p1, :cond_28

    return v2

    :cond_28
    return v0
.end method

.method public f()Z
    .registers 2

    iget p0, p0, Lp7/c$b;->u:I

    const/4 v0, 0x1

    and-int/2addr p0, v0

    if-eqz p0, :cond_7

    return v0

    :cond_7
    const/4 p0, 0x0

    return p0
.end method

.method public g()Z
    .registers 1

    iget p0, p0, Lp7/c$b;->u:I

    and-int/lit8 p0, p0, 0x4

    if-eqz p0, :cond_8

    const/4 p0, 0x1

    return p0

    :cond_8
    const/4 p0, 0x0

    return p0
.end method

.method public hashCode()I
    .registers 3

    iget-boolean v0, p0, Lp7/c$b;->t:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lp7/c$b;->u:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lp7/c$b;->v:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean p0, p0, Lp7/c$b;->w:Z

    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method

.method public final k(ZIZZ)Lp7/c$b;
    .registers 5

    new-instance p0, Lp7/c$b;

    invoke-direct {p0, p1, p2, p3, p4}, Lp7/c$b;-><init>(ZIZZ)V

    return-object p0
.end method

.method public final m()Z
    .registers 1

    iget-boolean p0, p0, Lp7/c$b;->t:Z

    return p0
.end method

.method public toString()Ljava/lang/String;
    .registers 6

    iget-boolean v0, p0, Lp7/c$b;->t:Z

    iget v1, p0, Lp7/c$b;->u:I

    iget-boolean v2, p0, Lp7/c$b;->v:Z

    iget-boolean p0, p0, Lp7/c$b;->w:Z

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Effect(blurChange="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", effectType="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", selectedLock="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", selectedHome="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 3

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean p2, p0, Lp7/c$b;->t:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lp7/c$b;->u:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lp7/c$b;->v:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p0, p0, Lp7/c$b;->w:Z

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
