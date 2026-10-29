.class public final LC6/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx6/p;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LC6/g$a;
    }
.end annotation


# static fields
.field public static final e:LC6/g$a;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:LC6/j;

.field private final c:LE6/a$a;

.field private d:Lx6/p;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LC6/g$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LC6/g$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LC6/g;->e:LC6/g$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;LC6/j;LE6/a$a;)V
    .registers 5

    const-string v0, "image"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LC6/g;->a:Ljava/lang/String;

    iput-object p2, p0, LC6/g;->b:LC6/j;

    iput-object p3, p0, LC6/g;->c:LE6/a$a;

    return-void
.end method


# virtual methods
.method public a()V
    .registers 2

    iget-object v0, p0, LC6/g;->d:Lx6/p;

    if-eqz v0, :cond_7

    invoke-interface {v0}, Lx6/p;->a()V

    :cond_7
    const/4 v0, 0x0

    iput-object v0, p0, LC6/g;->d:Lx6/p;

    return-void
.end method

.method public b(Ljava/util/List;)V
    .registers 3

    iget-object v0, p0, LC6/g;->d:Lx6/p;

    if-eqz v0, :cond_7

    invoke-interface {v0, p1}, Lx6/p;->b(Ljava/util/List;)V

    :cond_7
    const/4 p1, 0x0

    iput-object p1, p0, LC6/g;->d:Lx6/p;

    return-void
.end method

.method public final c()Ljava/lang/String;
    .registers 4

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "image"

    iget-object v2, p0, LC6/g;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v1, p0, LC6/g;->b:LC6/j;

    if-eqz v1, :cond_19

    const-string v2, "scope"

    invoke-virtual {v1}, LC6/j;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_19
    iget-object p0, p0, LC6/g;->c:LE6/a$a;

    if-eqz p0, :cond_26

    const-string v1, "param"

    invoke-virtual {p0}, LE6/a$a;->a()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_26
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "toString(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final d()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, LC6/g;->a:Ljava/lang/String;

    return-object p0
.end method

.method public final e()LE6/a$a;
    .registers 1

    iget-object p0, p0, LC6/g;->c:LE6/a$a;

    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 3

    if-eqz p1, :cond_16

    instance-of v0, p1, LC6/g;

    if-nez v0, :cond_7

    goto :goto_16

    :cond_7
    invoke-virtual {p0}, LC6/g;->c()Ljava/lang/String;

    move-result-object p0

    check-cast p1, LC6/g;

    invoke-virtual {p1}, LC6/g;->c()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0

    :cond_16
    :goto_16
    const/4 p0, 0x0

    return p0
.end method

.method public final f()LC6/j;
    .registers 1

    iget-object p0, p0, LC6/g;->b:LC6/j;

    return-object p0
.end method

.method public final g(Lx6/p;)V
    .registers 2

    iput-object p1, p0, LC6/g;->d:Lx6/p;

    return-void
.end method

.method public hashCode()I
    .registers 4

    iget-object v0, p0, LC6/g;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LC6/g;->b:LC6/j;

    const/4 v2, 0x0

    if-nez v1, :cond_f

    move v1, v2

    goto :goto_13

    :cond_f
    invoke-virtual {v1}, LC6/j;->hashCode()I

    move-result v1

    :goto_13
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object p0, p0, LC6/g;->c:LE6/a$a;

    if-nez p0, :cond_1b

    goto :goto_1f

    :cond_1b
    invoke-virtual {p0}, LE6/a$a;->hashCode()I

    move-result v2

    :goto_1f
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .registers 5

    iget-object v0, p0, LC6/g;->a:Ljava/lang/String;

    iget-object v1, p0, LC6/g;->b:LC6/j;

    iget-object p0, p0, LC6/g;->c:LE6/a$a;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "EffectInfo(image="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", scope="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", params="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
