.class public final LS5/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LS5/b$a;
    }
.end annotation


# static fields
.field public static final d:LS5/b$a;

.field private static final e:Ljava/util/List;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:I

.field private final c:I


# direct methods
.method static constructor <clinit>()V
    .registers 6

    new-instance v0, LS5/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LS5/b$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LS5/b;->d:LS5/b$a;

    new-instance v0, LS5/b;

    const/4 v1, 0x0

    sget v2, Lcom/android/launcher3/p;->g:I

    const-string v3, "com.nothing.hearthstone"

    invoke-direct {v0, v3, v1, v2}, LS5/b;-><init>(Ljava/lang/String;II)V

    new-instance v1, LS5/b;

    sget v2, Lcom/android/launcher3/p;->h:I

    const-string v3, "com.android.systemui"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v2}, LS5/b;-><init>(Ljava/lang/String;II)V

    new-instance v2, LS5/b;

    const-string v3, "com.nothing.weather"

    sget v5, Lcom/android/launcher3/p;->i:I

    invoke-direct {v2, v3, v4, v5}, LS5/b;-><init>(Ljava/lang/String;II)V

    filled-new-array {v0, v1, v2}, [LS5/b;

    move-result-object v0

    invoke-static {v0}, Li8/s;->n([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, LS5/b;->e:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .registers 5

    const-string v0, "pkgName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LS5/b;->a:Ljava/lang/String;

    iput p2, p0, LS5/b;->b:I

    iput p3, p0, LS5/b;->c:I

    return-void
.end method

.method public static final synthetic a()Ljava/util/List;
    .registers 1

    sget-object v0, LS5/b;->e:Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public final b()I
    .registers 1

    iget p0, p0, LS5/b;->b:I

    return p0
.end method

.method public final c()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, LS5/b;->a:Ljava/lang/String;

    return-object p0
.end method

.method public final d()I
    .registers 1

    iget p0, p0, LS5/b;->c:I

    return p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_4

    return v0

    :cond_4
    instance-of v1, p1, LS5/b;

    const/4 v2, 0x0

    if-nez v1, :cond_a

    return v2

    :cond_a
    check-cast p1, LS5/b;

    iget-object v1, p0, LS5/b;->a:Ljava/lang/String;

    iget-object v3, p1, LS5/b;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    return v2

    :cond_17
    iget v1, p0, LS5/b;->b:I

    iget v3, p1, LS5/b;->b:I

    if-eq v1, v3, :cond_1e

    return v2

    :cond_1e
    iget p0, p0, LS5/b;->c:I

    iget p1, p1, LS5/b;->c:I

    if-eq p0, p1, :cond_25

    return v2

    :cond_25
    return v0
.end method

.method public hashCode()I
    .registers 3

    iget-object v0, p0, LS5/b;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LS5/b;->b:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget p0, p0, LS5/b;->c:I

    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .registers 5

    iget-object v0, p0, LS5/b;->a:Ljava/lang/String;

    iget v1, p0, LS5/b;->b:I

    iget p0, p0, LS5/b;->c:I

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "GroupIconInfo(pkgName="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", groupId="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", resInt="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
