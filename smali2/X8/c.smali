.class public final LX8/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LX8/c$a;
    }
.end annotation


# static fields
.field public static final d:LX8/c$a;

.field public static final e:Le9/h;

.field public static final f:Le9/h;

.field public static final g:Le9/h;

.field public static final h:Le9/h;

.field public static final i:Le9/h;

.field public static final j:Le9/h;


# instance fields
.field public final a:Le9/h;

.field public final b:Le9/h;

.field public final c:I


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LX8/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LX8/c$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LX8/c;->d:LX8/c$a;

    sget-object v0, Le9/h;->t:Le9/h$a;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Le9/h$a;->c(Ljava/lang/String;)Le9/h;

    move-result-object v1

    sput-object v1, LX8/c;->e:Le9/h;

    const-string v1, ":status"

    invoke-virtual {v0, v1}, Le9/h$a;->c(Ljava/lang/String;)Le9/h;

    move-result-object v1

    sput-object v1, LX8/c;->f:Le9/h;

    const-string v1, ":method"

    invoke-virtual {v0, v1}, Le9/h$a;->c(Ljava/lang/String;)Le9/h;

    move-result-object v1

    sput-object v1, LX8/c;->g:Le9/h;

    const-string v1, ":path"

    invoke-virtual {v0, v1}, Le9/h$a;->c(Ljava/lang/String;)Le9/h;

    move-result-object v1

    sput-object v1, LX8/c;->h:Le9/h;

    const-string v1, ":scheme"

    invoke-virtual {v0, v1}, Le9/h$a;->c(Ljava/lang/String;)Le9/h;

    move-result-object v1

    sput-object v1, LX8/c;->i:Le9/h;

    const-string v1, ":authority"

    invoke-virtual {v0, v1}, Le9/h$a;->c(Ljava/lang/String;)Le9/h;

    move-result-object v0

    sput-object v0, LX8/c;->j:Le9/h;

    return-void
.end method

.method public constructor <init>(Le9/h;Le9/h;)V
    .registers 4

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LX8/c;->a:Le9/h;

    .line 3
    iput-object p2, p0, LX8/c;->b:Le9/h;

    .line 4
    invoke-virtual {p1}, Le9/h;->v()I

    move-result p1

    add-int/lit8 p1, p1, 0x20

    invoke-virtual {p2}, Le9/h;->v()I

    move-result p2

    add-int/2addr p1, p2

    iput p1, p0, LX8/c;->c:I

    return-void
.end method

.method public constructor <init>(Le9/h;Ljava/lang/String;)V
    .registers 4

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    sget-object v0, Le9/h;->t:Le9/h$a;

    invoke-virtual {v0, p2}, Le9/h$a;->c(Ljava/lang/String;)Le9/h;

    move-result-object p2

    invoke-direct {p0, p1, p2}, LX8/c;-><init>(Le9/h;Le9/h;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .registers 4

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    sget-object v0, Le9/h;->t:Le9/h$a;

    invoke-virtual {v0, p1}, Le9/h$a;->c(Ljava/lang/String;)Le9/h;

    move-result-object p1

    invoke-virtual {v0, p2}, Le9/h$a;->c(Ljava/lang/String;)Le9/h;

    move-result-object p2

    invoke-direct {p0, p1, p2}, LX8/c;-><init>(Le9/h;Le9/h;)V

    return-void
.end method


# virtual methods
.method public final a()Le9/h;
    .registers 1

    iget-object p0, p0, LX8/c;->a:Le9/h;

    return-object p0
.end method

.method public final b()Le9/h;
    .registers 1

    iget-object p0, p0, LX8/c;->b:Le9/h;

    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_4

    return v0

    :cond_4
    instance-of v1, p1, LX8/c;

    const/4 v2, 0x0

    if-nez v1, :cond_a

    return v2

    :cond_a
    check-cast p1, LX8/c;

    iget-object v1, p0, LX8/c;->a:Le9/h;

    iget-object v3, p1, LX8/c;->a:Le9/h;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    return v2

    :cond_17
    iget-object p0, p0, LX8/c;->b:Le9/h;

    iget-object p1, p1, LX8/c;->b:Le9/h;

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_22

    return v2

    :cond_22
    return v0
.end method

.method public hashCode()I
    .registers 2

    iget-object v0, p0, LX8/c;->a:Le9/h;

    invoke-virtual {v0}, Le9/h;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object p0, p0, LX8/c;->b:Le9/h;

    invoke-virtual {p0}, Le9/h;->hashCode()I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .registers 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, LX8/c;->a:Le9/h;

    invoke-virtual {v1}, Le9/h;->y()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, LX8/c;->b:Le9/h;

    invoke-virtual {p0}, Le9/h;->y()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
