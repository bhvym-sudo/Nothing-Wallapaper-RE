.class public final LW6/e$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LW6/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:Z

.field private final b:Landroid/view/animation/Animation;


# direct methods
.method public constructor <init>(ZLandroid/view/animation/Animation;)V
    .registers 4

    const-string v0, "animation"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LW6/e$b;->a:Z

    iput-object p2, p0, LW6/e$b;->b:Landroid/view/animation/Animation;

    return-void
.end method


# virtual methods
.method public final a()Landroid/view/animation/Animation;
    .registers 1

    iget-object p0, p0, LW6/e$b;->b:Landroid/view/animation/Animation;

    return-object p0
.end method

.method public final b()Z
    .registers 1

    iget-boolean p0, p0, LW6/e$b;->a:Z

    return p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_4

    return v0

    :cond_4
    instance-of v1, p1, LW6/e$b;

    const/4 v2, 0x0

    if-nez v1, :cond_a

    return v2

    :cond_a
    check-cast p1, LW6/e$b;

    iget-boolean v1, p0, LW6/e$b;->a:Z

    iget-boolean v3, p1, LW6/e$b;->a:Z

    if-eq v1, v3, :cond_13

    return v2

    :cond_13
    iget-object p0, p0, LW6/e$b;->b:Landroid/view/animation/Animation;

    iget-object p1, p1, LW6/e$b;->b:Landroid/view/animation/Animation;

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1e

    return v2

    :cond_1e
    return v0
.end method

.method public hashCode()I
    .registers 2

    iget-boolean v0, p0, LW6/e$b;->a:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object p0, p0, LW6/e$b;->b:Landroid/view/animation/Animation;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .registers 4

    iget-boolean v0, p0, LW6/e$b;->a:Z

    iget-object p0, p0, LW6/e$b;->b:Landroid/view/animation/Animation;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ViewAnimation(visible="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", animation="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
