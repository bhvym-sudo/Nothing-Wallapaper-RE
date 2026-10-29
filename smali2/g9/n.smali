.class abstract Lg9/n;
.super Lg9/z;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg9/n$b;,
        Lg9/n$c;,
        Lg9/n$a;
    }
.end annotation


# instance fields
.field private final a:Lg9/w;

.field private final b:LP8/e$a;

.field private final c:Lg9/h;


# direct methods
.method constructor <init>(Lg9/w;LP8/e$a;Lg9/h;)V
    .registers 4

    invoke-direct {p0}, Lg9/z;-><init>()V

    iput-object p1, p0, Lg9/n;->a:Lg9/w;

    iput-object p2, p0, Lg9/n;->b:LP8/e$a;

    iput-object p3, p0, Lg9/n;->c:Lg9/h;

    return-void
.end method

.method private static d(Lg9/y;Ljava/lang/reflect/Method;Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lg9/e;
    .registers 4

    :try_start_0
    invoke-virtual {p0, p2, p3}, Lg9/y;->a(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lg9/e;

    move-result-object p0
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_4} :catch_5

    return-object p0

    :catch_5
    move-exception p0

    const-string p3, "Unable to create call adapter for %s"

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p0, p3, p2}, Lg9/C;->o(Ljava/lang/reflect/Method;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0
.end method

.method private static e(Lg9/y;Ljava/lang/reflect/Method;Ljava/lang/reflect/Type;)Lg9/h;
    .registers 4

    invoke-virtual {p1}, Ljava/lang/reflect/AccessibleObject;->getAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object v0

    :try_start_4
    invoke-virtual {p0, p2, v0}, Lg9/y;->h(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lg9/h;

    move-result-object p0
    :try_end_8
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_8} :catch_9

    return-object p0

    :catch_9
    move-exception p0

    const-string v0, "Unable to create converter for %s"

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p0, v0, p2}, Lg9/C;->o(Ljava/lang/reflect/Method;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0
.end method

.method static f(Lg9/y;Ljava/lang/reflect/Method;Lg9/w;)Lg9/n;
    .registers 14

    iget-boolean v0, p2, Lg9/w;->l:Z

    invoke-virtual {p1}, Ljava/lang/reflect/AccessibleObject;->getAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object v1

    const-class v2, Lg9/x;

    const/4 v3, 0x0

    if-eqz v0, :cond_5a

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    move-result-object v4

    array-length v5, v4

    const/4 v6, 0x1

    sub-int/2addr v5, v6

    aget-object v4, v4, v5

    check-cast v4, Ljava/lang/reflect/ParameterizedType;

    invoke-static {v3, v4}, Lg9/C;->f(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lg9/C;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v5

    const-class v7, Lg9/d;

    if-ne v5, v2, :cond_2e

    instance-of v5, v4, Ljava/lang/reflect/ParameterizedType;

    if-eqz v5, :cond_2e

    check-cast v4, Ljava/lang/reflect/ParameterizedType;

    invoke-static {v3, v4}, Lg9/C;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v4

    move v5, v3

    goto :goto_39

    :cond_2e
    invoke-static {v4}, Lg9/C;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v5

    if-eq v5, v7, :cond_49

    invoke-static {v4}, Lg9/C;->m(Ljava/lang/reflect/Type;)Z

    move-result v5

    move v6, v3

    :goto_39
    new-instance v8, Lg9/C$b;

    const/4 v9, 0x0

    filled-new-array {v4}, [Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-direct {v8, v9, v7, v4}, Lg9/C$b;-><init>(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V

    invoke-static {v1}, Lg9/B;->a([Ljava/lang/annotation/Annotation;)[Ljava/lang/annotation/Annotation;

    move-result-object v1

    move v10, v5

    goto :goto_60

    :cond_49
    check-cast v4, Ljava/lang/reflect/ParameterizedType;

    invoke-static {v3, v4}, Lg9/C;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string p2, "Suspend functions should not return Call, as they already execute asynchronously.\nChange its return type to %s"

    invoke-static {p1, p2, p0}, Lg9/C;->n(Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_5a
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getGenericReturnType()Ljava/lang/reflect/Type;

    move-result-object v8

    move v6, v3

    move v10, v6

    :goto_60
    invoke-static {p0, p1, v8, v1}, Lg9/n;->d(Lg9/y;Ljava/lang/reflect/Method;Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lg9/e;

    move-result-object v8

    invoke-interface {v8}, Lg9/e;->a()Ljava/lang/reflect/Type;

    move-result-object v1

    const-class v4, LP8/D;

    if-eq v1, v4, :cond_b8

    if-eq v1, v2, :cond_af

    iget-object v2, p2, Lg9/w;->d:Ljava/lang/String;

    const-string v4, "HEAD"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_90

    const-class v2, Ljava/lang/Void;

    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_90

    invoke-static {v1}, Lg9/C;->m(Ljava/lang/reflect/Type;)Z

    move-result v2

    if-eqz v2, :cond_87

    goto :goto_90

    :cond_87
    const-string p0, "HEAD method must use Void or Unit as response type."

    new-array p2, v3, [Ljava/lang/Object;

    invoke-static {p1, p0, p2}, Lg9/C;->n(Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_90
    :goto_90
    invoke-static {p0, p1, v1}, Lg9/n;->e(Lg9/y;Ljava/lang/reflect/Method;Ljava/lang/reflect/Type;)Lg9/h;

    move-result-object v7

    iget-object p0, p0, Lg9/y;->b:LP8/e$a;

    if-nez v0, :cond_9e

    new-instance p1, Lg9/n$a;

    invoke-direct {p1, p2, p0, v7, v8}, Lg9/n$a;-><init>(Lg9/w;LP8/e$a;Lg9/h;Lg9/e;)V

    return-object p1

    :cond_9e
    if-eqz v6, :cond_a6

    new-instance p1, Lg9/n$c;

    invoke-direct {p1, p2, p0, v7, v8}, Lg9/n$c;-><init>(Lg9/w;LP8/e$a;Lg9/h;Lg9/e;)V

    return-object p1

    :cond_a6
    new-instance v4, Lg9/n$b;

    const/4 v9, 0x0

    move-object v6, p0

    move-object v5, p2

    invoke-direct/range {v4 .. v10}, Lg9/n$b;-><init>(Lg9/w;LP8/e$a;Lg9/h;Lg9/e;ZZ)V

    return-object v4

    :cond_af
    const-string p0, "Response must include generic type (e.g., Response<String>)"

    new-array p2, v3, [Ljava/lang/Object;

    invoke-static {p1, p0, p2}, Lg9/C;->n(Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_b8
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "\'"

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v1}, Lg9/C;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "\' is not a valid response body type. Did you mean ResponseBody?"

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-array p2, v3, [Ljava/lang/Object;

    invoke-static {p1, p0, p2}, Lg9/C;->n(Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0
.end method


# virtual methods
.method final a(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    .registers 9

    new-instance v0, Lg9/q;

    iget-object v1, p0, Lg9/n;->a:Lg9/w;

    iget-object v4, p0, Lg9/n;->b:LP8/e$a;

    iget-object v5, p0, Lg9/n;->c:Lg9/h;

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v0 .. v5}, Lg9/q;-><init>(Lg9/w;Ljava/lang/Object;[Ljava/lang/Object;LP8/e$a;Lg9/h;)V

    invoke-virtual {p0, v0, v3}, Lg9/n;->c(Lg9/d;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method protected abstract c(Lg9/d;[Ljava/lang/Object;)Ljava/lang/Object;
.end method
