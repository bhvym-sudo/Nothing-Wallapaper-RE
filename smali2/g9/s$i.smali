.class final Lg9/s$i;
.super Lg9/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg9/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "i"
.end annotation


# instance fields
.field private final a:Ljava/lang/reflect/Method;

.field private final b:I

.field private final c:LP8/u;

.field private final d:Lg9/h;


# direct methods
.method constructor <init>(Ljava/lang/reflect/Method;ILP8/u;Lg9/h;)V
    .registers 5

    invoke-direct {p0}, Lg9/s;-><init>()V

    iput-object p1, p0, Lg9/s$i;->a:Ljava/lang/reflect/Method;

    iput p2, p0, Lg9/s$i;->b:I

    iput-object p3, p0, Lg9/s$i;->c:LP8/u;

    iput-object p4, p0, Lg9/s$i;->d:Lg9/h;

    return-void
.end method


# virtual methods
.method a(Lg9/v;Ljava/lang/Object;)V
    .registers 6

    if-nez p2, :cond_3

    return-void

    :cond_3
    :try_start_3
    iget-object v0, p0, Lg9/s$i;->d:Lg9/h;

    invoke-interface {v0, p2}, Lg9/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LP8/C;
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_b} :catch_11

    iget-object p0, p0, Lg9/s$i;->c:LP8/u;

    invoke-virtual {p1, p0, v0}, Lg9/v;->d(LP8/u;LP8/C;)V

    return-void

    :catch_11
    move-exception p1

    iget-object v0, p0, Lg9/s$i;->a:Ljava/lang/reflect/Method;

    iget p0, p0, Lg9/s$i;->b:I

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to convert "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " to RequestBody"

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p0, p2, p1}, Lg9/C;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0
.end method
