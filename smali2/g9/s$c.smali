.class final Lg9/s$c;
.super Lg9/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg9/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "c"
.end annotation


# instance fields
.field private final a:Ljava/lang/reflect/Method;

.field private final b:I

.field private final c:Lg9/h;


# direct methods
.method constructor <init>(Ljava/lang/reflect/Method;ILg9/h;)V
    .registers 4

    invoke-direct {p0}, Lg9/s;-><init>()V

    iput-object p1, p0, Lg9/s$c;->a:Ljava/lang/reflect/Method;

    iput p2, p0, Lg9/s$c;->b:I

    iput-object p3, p0, Lg9/s$c;->c:Lg9/h;

    return-void
.end method


# virtual methods
.method a(Lg9/v;Ljava/lang/Object;)V
    .registers 7

    const/4 v0, 0x0

    if-eqz p2, :cond_31

    :try_start_3
    iget-object v1, p0, Lg9/s$c;->c:Lg9/h;

    invoke-interface {v1, p2}, Lg9/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LP8/C;
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_b} :catch_f

    invoke-virtual {p1, v1}, Lg9/v;->l(LP8/C;)V

    return-void

    :catch_f
    move-exception p1

    iget-object v1, p0, Lg9/s$c;->a:Ljava/lang/reflect/Method;

    iget p0, p0, Lg9/s$c;->b:I

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unable to convert "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " to RequestBody"

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v1, p1, p0, p2, v0}, Lg9/C;->q(Ljava/lang/reflect/Method;Ljava/lang/Throwable;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_31
    iget-object p1, p0, Lg9/s$c;->a:Ljava/lang/reflect/Method;

    iget p0, p0, Lg9/s$c;->b:I

    const-string p2, "Body parameter value must not be null."

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, p0, p2, v0}, Lg9/C;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0
.end method
