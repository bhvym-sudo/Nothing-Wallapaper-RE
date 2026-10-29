.class abstract Lg9/z;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static b(Lg9/y;Ljava/lang/Class;Ljava/lang/reflect/Method;)Lg9/z;
    .registers 5

    invoke-static {p0, p1, p2}, Lg9/w;->b(Lg9/y;Ljava/lang/Class;Ljava/lang/reflect/Method;)Lg9/w;

    move-result-object p1

    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getGenericReturnType()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-static {v0}, Lg9/C;->j(Ljava/lang/reflect/Type;)Z

    move-result v1

    if-nez v1, :cond_21

    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    if-eq v0, v1, :cond_17

    invoke-static {p0, p2, p1}, Lg9/n;->f(Lg9/y;Ljava/lang/reflect/Method;Lg9/w;)Lg9/n;

    move-result-object p0

    return-object p0

    :cond_17
    const/4 p0, 0x0

    new-array p0, p0, [Ljava/lang/Object;

    const-string p1, "Service methods cannot return void."

    invoke-static {p2, p1, p0}, Lg9/C;->n(Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_21
    const-string p0, "Method return type must not include a type variable or wildcard: %s"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2, p0, p1}, Lg9/C;->n(Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0
.end method


# virtual methods
.method abstract a(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
.end method
