.class final Lg9/w$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg9/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# static fields
.field private static final y:Ljava/util/regex/Pattern;

.field private static final z:Ljava/util/regex/Pattern;


# instance fields
.field final a:Lg9/y;

.field final b:Ljava/lang/Class;

.field final c:Ljava/lang/reflect/Method;

.field final d:[Ljava/lang/annotation/Annotation;

.field final e:[[Ljava/lang/annotation/Annotation;

.field final f:[Ljava/lang/reflect/Type;

.field g:Z

.field h:Z

.field i:Z

.field j:Z

.field k:Z

.field l:Z

.field m:Z

.field n:Z

.field o:Ljava/lang/String;

.field p:Z

.field q:Z

.field r:Z

.field s:Ljava/lang/String;

.field t:LP8/u;

.field u:LP8/x;

.field v:Ljava/util/Set;

.field w:[Lg9/s;

.field x:Z


# direct methods
.method static constructor <clinit>()V
    .registers 1

    const-string v0, "\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lg9/w$a;->y:Ljava/util/regex/Pattern;

    const-string v0, "[a-zA-Z][a-zA-Z0-9_-]*"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lg9/w$a;->z:Ljava/util/regex/Pattern;

    return-void
.end method

.method constructor <init>(Lg9/y;Ljava/lang/Class;Ljava/lang/reflect/Method;)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg9/w$a;->a:Lg9/y;

    iput-object p2, p0, Lg9/w$a;->b:Ljava/lang/Class;

    iput-object p3, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    invoke-virtual {p3}, Ljava/lang/reflect/AccessibleObject;->getAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object p1

    iput-object p1, p0, Lg9/w$a;->d:[Ljava/lang/annotation/Annotation;

    invoke-virtual {p3}, Ljava/lang/reflect/Method;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    move-result-object p1

    iput-object p1, p0, Lg9/w$a;->f:[Ljava/lang/reflect/Type;

    invoke-virtual {p3}, Ljava/lang/reflect/Method;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    move-result-object p1

    iput-object p1, p0, Lg9/w$a;->e:[[Ljava/lang/annotation/Annotation;

    return-void
.end method

.method private static a(Ljava/lang/Class;)Ljava/lang/Class;
    .registers 2

    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-ne v0, p0, :cond_7

    const-class p0, Ljava/lang/Boolean;

    return-object p0

    :cond_7
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    if-ne v0, p0, :cond_e

    const-class p0, Ljava/lang/Byte;

    return-object p0

    :cond_e
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    if-ne v0, p0, :cond_15

    const-class p0, Ljava/lang/Character;

    return-object p0

    :cond_15
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    if-ne v0, p0, :cond_1c

    const-class p0, Ljava/lang/Double;

    return-object p0

    :cond_1c
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    if-ne v0, p0, :cond_23

    const-class p0, Ljava/lang/Float;

    return-object p0

    :cond_23
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-ne v0, p0, :cond_2a

    const-class p0, Ljava/lang/Integer;

    return-object p0

    :cond_2a
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-ne v0, p0, :cond_31

    const-class p0, Ljava/lang/Long;

    return-object p0

    :cond_31
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    if-ne v0, p0, :cond_37

    const-class p0, Ljava/lang/Short;

    :cond_37
    return-object p0
.end method

.method private c([Ljava/lang/String;Z)LP8/u;
    .registers 10

    new-instance v0, LP8/u$a;

    invoke-direct {v0}, LP8/u$a;-><init>()V

    array-length v1, p1

    const/4 v2, 0x0

    move v3, v2

    :goto_8
    if-ge v3, v1, :cond_63

    aget-object v4, p1, v3

    const/16 v5, 0x3a

    invoke-virtual {v4, v5}, Ljava/lang/String;->indexOf(I)I

    move-result v5

    const/4 v6, -0x1

    if-eq v5, v6, :cond_56

    if-eqz v5, :cond_56

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v6

    add-int/lit8 v6, v6, -0x1

    if-eq v5, v6, :cond_56

    invoke-virtual {v4, v2, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    add-int/lit8 v5, v5, 0x1

    invoke-virtual {v4, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    const-string v5, "Content-Type"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_4a

    :try_start_35
    invoke-static {v4}, LP8/x;->d(Ljava/lang/String;)LP8/x;

    move-result-object v5

    iput-object v5, p0, Lg9/w$a;->u:LP8/x;
    :try_end_3b
    .catch Ljava/lang/IllegalArgumentException; {:try_start_35 .. :try_end_3b} :catch_3c

    goto :goto_53

    :catch_3c
    move-exception p1

    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    const-string p2, "Malformed content type: %s"

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {p0, p1, p2, v0}, Lg9/C;->o(Ljava/lang/reflect/Method;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_4a
    if-eqz p2, :cond_50

    invoke-virtual {v0, v6, v4}, LP8/u$a;->e(Ljava/lang/String;Ljava/lang/String;)LP8/u$a;

    goto :goto_53

    :cond_50
    invoke-virtual {v0, v6, v4}, LP8/u$a;->a(Ljava/lang/String;Ljava/lang/String;)LP8/u$a;

    :goto_53
    add-int/lit8 v3, v3, 0x1

    goto :goto_8

    :cond_56
    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    const-string p1, "@Headers value must be in the form \"Name: Value\". Found: \"%s\""

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {p0, p1, p2}, Lg9/C;->n(Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_63
    invoke-virtual {v0}, LP8/u$a;->f()LP8/u;

    move-result-object p0

    return-object p0
.end method

.method private d(Ljava/lang/String;Ljava/lang/String;Z)V
    .registers 5

    iget-object v0, p0, Lg9/w$a;->o:Ljava/lang/String;

    if-nez v0, :cond_49

    iput-object p1, p0, Lg9/w$a;->o:Ljava/lang/String;

    iput-boolean p3, p0, Lg9/w$a;->p:Z

    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_f

    return-void

    :cond_f
    const/16 p1, 0x3f

    invoke-virtual {p2, p1}, Ljava/lang/String;->indexOf(I)I

    move-result p1

    const/4 p3, -0x1

    if-eq p1, p3, :cond_40

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p3

    add-int/lit8 p3, p3, -0x1

    if-ge p1, p3, :cond_40

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {p2, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    sget-object p3, Lg9/w$a;->y:Ljava/util/regex/Pattern;

    invoke-virtual {p3, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p3

    invoke-virtual {p3}, Ljava/util/regex/Matcher;->find()Z

    move-result p3

    if-nez p3, :cond_33

    goto :goto_40

    :cond_33
    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    const-string p2, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query."

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0, p2, p1}, Lg9/C;->n(Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_40
    :goto_40
    iput-object p2, p0, Lg9/w$a;->s:Ljava/lang/String;

    invoke-static {p2}, Lg9/w$a;->h(Ljava/lang/String;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lg9/w$a;->v:Ljava/util/Set;

    return-void

    :cond_49
    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    const-string p2, "Only one HTTP method is allowed. Found: %s and %s."

    filled-new-array {v0, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0, p2, p1}, Lg9/C;->n(Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0
.end method

.method private e(Ljava/lang/annotation/Annotation;)V
    .registers 6

    instance-of v0, p1, Li9/b;

    const/4 v1, 0x0

    if-eqz v0, :cond_11

    check-cast p1, Li9/b;

    invoke-interface {p1}, Li9/b;->value()Ljava/lang/String;

    move-result-object p1

    const-string v0, "DELETE"

    invoke-direct {p0, v0, p1, v1}, Lg9/w$a;->d(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void

    :cond_11
    instance-of v0, p1, Li9/f;

    if-eqz v0, :cond_21

    check-cast p1, Li9/f;

    invoke-interface {p1}, Li9/f;->value()Ljava/lang/String;

    move-result-object p1

    const-string v0, "GET"

    invoke-direct {p0, v0, p1, v1}, Lg9/w$a;->d(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void

    :cond_21
    instance-of v0, p1, Li9/g;

    if-eqz v0, :cond_31

    check-cast p1, Li9/g;

    invoke-interface {p1}, Li9/g;->value()Ljava/lang/String;

    move-result-object p1

    const-string v0, "HEAD"

    invoke-direct {p0, v0, p1, v1}, Lg9/w$a;->d(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void

    :cond_31
    instance-of v0, p1, Li9/n;

    const/4 v2, 0x1

    if-eqz v0, :cond_42

    check-cast p1, Li9/n;

    invoke-interface {p1}, Li9/n;->value()Ljava/lang/String;

    move-result-object p1

    const-string v0, "PATCH"

    invoke-direct {p0, v0, p1, v2}, Lg9/w$a;->d(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void

    :cond_42
    instance-of v0, p1, Li9/o;

    if-eqz v0, :cond_52

    check-cast p1, Li9/o;

    invoke-interface {p1}, Li9/o;->value()Ljava/lang/String;

    move-result-object p1

    const-string v0, "POST"

    invoke-direct {p0, v0, p1, v2}, Lg9/w$a;->d(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void

    :cond_52
    instance-of v0, p1, Li9/p;

    if-eqz v0, :cond_62

    check-cast p1, Li9/p;

    invoke-interface {p1}, Li9/p;->value()Ljava/lang/String;

    move-result-object p1

    const-string v0, "PUT"

    invoke-direct {p0, v0, p1, v2}, Lg9/w$a;->d(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void

    :cond_62
    instance-of v0, p1, Li9/m;

    if-eqz v0, :cond_72

    check-cast p1, Li9/m;

    invoke-interface {p1}, Li9/m;->value()Ljava/lang/String;

    move-result-object p1

    const-string v0, "OPTIONS"

    invoke-direct {p0, v0, p1, v1}, Lg9/w$a;->d(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void

    :cond_72
    instance-of v0, p1, Li9/h;

    if-eqz v0, :cond_88

    check-cast p1, Li9/h;

    invoke-interface {p1}, Li9/h;->method()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Li9/h;->path()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1}, Li9/h;->hasBody()Z

    move-result p1

    invoke-direct {p0, v0, v1, p1}, Lg9/w$a;->d(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void

    :cond_88
    instance-of v0, p1, Li9/k;

    if-eqz v0, :cond_ab

    check-cast p1, Li9/k;

    invoke-interface {p1}, Li9/k;->value()[Ljava/lang/String;

    move-result-object v0

    array-length v2, v0

    if-eqz v2, :cond_a0

    invoke-interface {p1}, Li9/k;->allowUnsafeNonAsciiValues()Z

    move-result p1

    invoke-direct {p0, v0, p1}, Lg9/w$a;->c([Ljava/lang/String;Z)LP8/u;

    move-result-object p1

    iput-object p1, p0, Lg9/w$a;->t:LP8/u;

    return-void

    :cond_a0
    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    const-string p1, "@Headers annotation is empty."

    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p0, p1, v0}, Lg9/C;->n(Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_ab
    instance-of v0, p1, Li9/l;

    const-string v3, "Only one encoding annotation is allowed."

    if-eqz v0, :cond_c1

    iget-boolean p1, p0, Lg9/w$a;->q:Z

    if-nez p1, :cond_b8

    iput-boolean v2, p0, Lg9/w$a;->r:Z

    return-void

    :cond_b8
    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    new-array p1, v1, [Ljava/lang/Object;

    invoke-static {p0, v3, p1}, Lg9/C;->n(Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_c1
    instance-of p1, p1, Li9/e;

    if-eqz p1, :cond_d5

    iget-boolean p1, p0, Lg9/w$a;->r:Z

    if-nez p1, :cond_cc

    iput-boolean v2, p0, Lg9/w$a;->q:Z

    return-void

    :cond_cc
    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    new-array p1, v1, [Ljava/lang/Object;

    invoke-static {p0, v3, p1}, Lg9/C;->n(Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_d5
    return-void
.end method

.method private f(ILjava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Z)Lg9/s;
    .registers 11

    const/4 v0, 0x0

    const/4 v1, 0x0

    if-eqz p3, :cond_23

    array-length v2, p3

    move v3, v0

    move-object v4, v1

    :goto_7
    if-ge v3, v2, :cond_24

    aget-object v5, p3, v3

    invoke-direct {p0, p1, p2, p3, v5}, Lg9/w$a;->g(ILjava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Ljava/lang/annotation/Annotation;)Lg9/s;

    move-result-object v5

    if-nez v5, :cond_12

    goto :goto_15

    :cond_12
    if-nez v4, :cond_18

    move-object v4, v5

    :goto_15
    add-int/lit8 v3, v3, 0x1

    goto :goto_7

    :cond_18
    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    const-string p2, "Multiple Retrofit annotations found, only one allowed."

    new-array p3, v0, [Ljava/lang/Object;

    invoke-static {p0, p1, p2, p3}, Lg9/C;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_23
    move-object v4, v1

    :cond_24
    if-nez v4, :cond_3f

    if-eqz p4, :cond_34

    :try_start_28
    invoke-static {p2}, Lg9/C;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object p2

    const-class p3, Lm8/e;

    if-ne p2, p3, :cond_34

    const/4 p2, 0x1

    iput-boolean p2, p0, Lg9/w$a;->x:Z
    :try_end_33
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_28 .. :try_end_33} :catch_34

    return-object v1

    :catch_34
    :cond_34
    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    const-string p2, "No Retrofit annotation found."

    new-array p3, v0, [Ljava/lang/Object;

    invoke-static {p0, p1, p2, p3}, Lg9/C;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_3f
    return-object v4
.end method

.method private g(ILjava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Ljava/lang/annotation/Annotation;)Lg9/s;
    .registers 15

    instance-of v0, p4, Li9/y;

    const-string v1, "@Path parameters may not be used with @Url."

    const-class v2, Ljava/lang/String;

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v0, :cond_9b

    invoke-direct {p0, p1, p2}, Lg9/w$a;->j(ILjava/lang/reflect/Type;)V

    iget-boolean p3, p0, Lg9/w$a;->n:Z

    if-nez p3, :cond_90

    iget-boolean p3, p0, Lg9/w$a;->j:Z

    if-nez p3, :cond_87

    iget-boolean p3, p0, Lg9/w$a;->k:Z

    if-nez p3, :cond_7c

    iget-boolean p3, p0, Lg9/w$a;->l:Z

    if-nez p3, :cond_71

    iget-boolean p3, p0, Lg9/w$a;->m:Z

    if-nez p3, :cond_66

    iget-object p3, p0, Lg9/w$a;->s:Ljava/lang/String;

    if-nez p3, :cond_57

    iput-boolean v3, p0, Lg9/w$a;->n:Z

    const-class p3, LP8/v;

    if-eq p2, p3, :cond_4f

    if-eq p2, v2, :cond_4f

    const-class p3, Ljava/net/URI;

    if-eq p2, p3, :cond_4f

    instance-of p3, p2, Ljava/lang/Class;

    if-eqz p3, :cond_44

    check-cast p2, Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    const-string p3, "android.net.Uri"

    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_44

    goto :goto_4f

    :cond_44
    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    const-string p2, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type."

    new-array p3, v4, [Ljava/lang/Object;

    invoke-static {p0, p1, p2, p3}, Lg9/C;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_4f
    :goto_4f
    new-instance p2, Lg9/s$p;

    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    invoke-direct {p2, p0, p1}, Lg9/s$p;-><init>(Ljava/lang/reflect/Method;I)V

    return-object p2

    :cond_57
    iget-object p2, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    iget-object p0, p0, Lg9/w$a;->o:Ljava/lang/String;

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string p3, "@Url cannot be used with @%s URL"

    invoke-static {p2, p1, p3, p0}, Lg9/C;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_66
    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    const-string p2, "A @Url parameter must not come after a @QueryMap."

    new-array p3, v4, [Ljava/lang/Object;

    invoke-static {p0, p1, p2, p3}, Lg9/C;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_71
    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    const-string p2, "A @Url parameter must not come after a @QueryName."

    new-array p3, v4, [Ljava/lang/Object;

    invoke-static {p0, p1, p2, p3}, Lg9/C;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_7c
    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    const-string p2, "A @Url parameter must not come after a @Query."

    new-array p3, v4, [Ljava/lang/Object;

    invoke-static {p0, p1, p2, p3}, Lg9/C;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_87
    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    new-array p2, v4, [Ljava/lang/Object;

    invoke-static {p0, p1, v1, p2}, Lg9/C;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_90
    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    const-string p2, "Multiple @Url method annotations found."

    new-array p3, v4, [Ljava/lang/Object;

    invoke-static {p0, p1, p2, p3}, Lg9/C;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_9b
    instance-of v0, p4, Li9/s;

    if-eqz v0, :cond_10d

    invoke-direct {p0, p1, p2}, Lg9/w$a;->j(ILjava/lang/reflect/Type;)V

    iget-boolean v0, p0, Lg9/w$a;->k:Z

    if-nez v0, :cond_102

    iget-boolean v0, p0, Lg9/w$a;->l:Z

    if-nez v0, :cond_f7

    iget-boolean v0, p0, Lg9/w$a;->m:Z

    if-nez v0, :cond_ec

    iget-boolean v0, p0, Lg9/w$a;->n:Z

    if-nez v0, :cond_e3

    iget-object v0, p0, Lg9/w$a;->s:Ljava/lang/String;

    if-eqz v0, :cond_d4

    iput-boolean v3, p0, Lg9/w$a;->j:Z

    check-cast p4, Li9/s;

    invoke-interface {p4}, Li9/s;->value()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, p1, v3}, Lg9/w$a;->i(ILjava/lang/String;)V

    iget-object v0, p0, Lg9/w$a;->a:Lg9/y;

    invoke-virtual {v0, p2, p3}, Lg9/y;->i(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lg9/h;

    move-result-object v4

    new-instance v0, Lg9/s$k;

    iget-object v1, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    invoke-interface {p4}, Li9/s;->encoded()Z

    move-result v5

    move v2, p1

    invoke-direct/range {v0 .. v5}, Lg9/s$k;-><init>(Ljava/lang/reflect/Method;ILjava/lang/String;Lg9/h;Z)V

    return-object v0

    :cond_d4
    iget-object p2, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    iget-object p0, p0, Lg9/w$a;->o:Ljava/lang/String;

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string p3, "@Path can only be used with relative url on @%s"

    invoke-static {p2, p1, p3, p0}, Lg9/C;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_e3
    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    new-array p2, v4, [Ljava/lang/Object;

    invoke-static {p0, p1, v1, p2}, Lg9/C;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_ec
    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    const-string p2, "A @Path parameter must not come after a @QueryMap."

    new-array p3, v4, [Ljava/lang/Object;

    invoke-static {p0, p1, p2, p3}, Lg9/C;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_f7
    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    const-string p2, "A @Path parameter must not come after a @QueryName."

    new-array p3, v4, [Ljava/lang/Object;

    invoke-static {p0, p1, p2, p3}, Lg9/C;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_102
    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    const-string p2, "A @Path parameter must not come after a @Query."

    new-array p3, v4, [Ljava/lang/Object;

    invoke-static {p0, p1, p2, p3}, Lg9/C;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_10d
    instance-of v0, p4, Li9/t;

    const-string v1, "<String>)"

    const-string v5, " must include generic type (e.g., "

    const-class v6, Ljava/lang/Iterable;

    if-eqz v0, :cond_19a

    invoke-direct {p0, p1, p2}, Lg9/w$a;->j(ILjava/lang/reflect/Type;)V

    check-cast p4, Li9/t;

    invoke-interface {p4}, Li9/t;->value()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p4}, Li9/t;->encoded()Z

    move-result p4

    invoke-static {p2}, Lg9/C;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v2

    iput-boolean v3, p0, Lg9/w$a;->k:Z

    invoke-virtual {v6, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-eqz v3, :cond_170

    instance-of v3, p2, Ljava/lang/reflect/ParameterizedType;

    if-eqz v3, :cond_14a

    check-cast p2, Ljava/lang/reflect/ParameterizedType;

    invoke-static {v4, p2}, Lg9/C;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object p1

    iget-object p0, p0, Lg9/w$a;->a:Lg9/y;

    invoke-virtual {p0, p1, p3}, Lg9/y;->i(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lg9/h;

    move-result-object p0

    new-instance p1, Lg9/s$l;

    invoke-direct {p1, v0, p0, p4}, Lg9/s$l;-><init>(Ljava/lang/String;Lg9/h;Z)V

    invoke-virtual {p1}, Lg9/s;->c()Lg9/s;

    move-result-object p0

    return-object p0

    :cond_14a
    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    new-array p3, v4, [Ljava/lang/Object;

    invoke-static {p0, p1, p2, p3}, Lg9/C;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_170
    invoke-virtual {v2}, Ljava/lang/Class;->isArray()Z

    move-result p1

    if-eqz p1, :cond_18e

    invoke-virtual {v2}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1}, Lg9/w$a;->a(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p1

    iget-object p0, p0, Lg9/w$a;->a:Lg9/y;

    invoke-virtual {p0, p1, p3}, Lg9/y;->i(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lg9/h;

    move-result-object p0

    new-instance p1, Lg9/s$l;

    invoke-direct {p1, v0, p0, p4}, Lg9/s$l;-><init>(Ljava/lang/String;Lg9/h;Z)V

    invoke-virtual {p1}, Lg9/s;->b()Lg9/s;

    move-result-object p0

    return-object p0

    :cond_18e
    iget-object p0, p0, Lg9/w$a;->a:Lg9/y;

    invoke-virtual {p0, p2, p3}, Lg9/y;->i(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lg9/h;

    move-result-object p0

    new-instance p1, Lg9/s$l;

    invoke-direct {p1, v0, p0, p4}, Lg9/s$l;-><init>(Ljava/lang/String;Lg9/h;Z)V

    return-object p1

    :cond_19a
    instance-of v0, p4, Li9/v;

    if-eqz v0, :cond_21d

    invoke-direct {p0, p1, p2}, Lg9/w$a;->j(ILjava/lang/reflect/Type;)V

    check-cast p4, Li9/v;

    invoke-interface {p4}, Li9/v;->encoded()Z

    move-result p4

    invoke-static {p2}, Lg9/C;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v0

    iput-boolean v3, p0, Lg9/w$a;->l:Z

    invoke-virtual {v6, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2

    if-eqz v2, :cond_1f3

    instance-of v2, p2, Ljava/lang/reflect/ParameterizedType;

    if-eqz v2, :cond_1cd

    check-cast p2, Ljava/lang/reflect/ParameterizedType;

    invoke-static {v4, p2}, Lg9/C;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object p1

    iget-object p0, p0, Lg9/w$a;->a:Lg9/y;

    invoke-virtual {p0, p1, p3}, Lg9/y;->i(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lg9/h;

    move-result-object p0

    new-instance p1, Lg9/s$n;

    invoke-direct {p1, p0, p4}, Lg9/s$n;-><init>(Lg9/h;Z)V

    invoke-virtual {p1}, Lg9/s;->c()Lg9/s;

    move-result-object p0

    return-object p0

    :cond_1cd
    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    new-array p3, v4, [Ljava/lang/Object;

    invoke-static {p0, p1, p2, p3}, Lg9/C;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_1f3
    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    move-result p1

    if-eqz p1, :cond_211

    invoke-virtual {v0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1}, Lg9/w$a;->a(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p1

    iget-object p0, p0, Lg9/w$a;->a:Lg9/y;

    invoke-virtual {p0, p1, p3}, Lg9/y;->i(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lg9/h;

    move-result-object p0

    new-instance p1, Lg9/s$n;

    invoke-direct {p1, p0, p4}, Lg9/s$n;-><init>(Lg9/h;Z)V

    invoke-virtual {p1}, Lg9/s;->b()Lg9/s;

    move-result-object p0

    return-object p0

    :cond_211
    iget-object p0, p0, Lg9/w$a;->a:Lg9/y;

    invoke-virtual {p0, p2, p3}, Lg9/y;->i(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lg9/h;

    move-result-object p0

    new-instance p1, Lg9/s$n;

    invoke-direct {p1, p0, p4}, Lg9/s$n;-><init>(Lg9/h;Z)V

    return-object p1

    :cond_21d
    instance-of v0, p4, Li9/u;

    const-string v7, "Map must include generic types (e.g., Map<String, String>)"

    const-class v8, Ljava/util/Map;

    if-eqz v0, :cond_28a

    invoke-direct {p0, p1, p2}, Lg9/w$a;->j(ILjava/lang/reflect/Type;)V

    invoke-static {p2}, Lg9/C;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v0

    iput-boolean v3, p0, Lg9/w$a;->m:Z

    invoke-virtual {v8, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_27f

    invoke-static {p2, v0, v8}, Lg9/C;->i(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    move-result-object p2

    instance-of v0, p2, Ljava/lang/reflect/ParameterizedType;

    if-eqz v0, :cond_276

    check-cast p2, Ljava/lang/reflect/ParameterizedType;

    invoke-static {v4, p2}, Lg9/C;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v0

    if-ne v2, v0, :cond_25c

    invoke-static {v3, p2}, Lg9/C;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object p2

    iget-object v0, p0, Lg9/w$a;->a:Lg9/y;

    invoke-virtual {v0, p2, p3}, Lg9/y;->i(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lg9/h;

    move-result-object p2

    new-instance p3, Lg9/s$m;

    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    check-cast p4, Li9/u;

    invoke-interface {p4}, Li9/u;->encoded()Z

    move-result p4

    invoke-direct {p3, p0, p1, p2, p4}, Lg9/s$m;-><init>(Ljava/lang/reflect/Method;ILg9/h;Z)V

    return-object p3

    :cond_25c
    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "@QueryMap keys must be of type String: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    new-array p3, v4, [Ljava/lang/Object;

    invoke-static {p0, p1, p2, p3}, Lg9/C;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_276
    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    new-array p2, v4, [Ljava/lang/Object;

    invoke-static {p0, p1, v7, p2}, Lg9/C;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_27f
    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    const-string p2, "@QueryMap parameter type must be Map."

    new-array p3, v4, [Ljava/lang/Object;

    invoke-static {p0, p1, p2, p3}, Lg9/C;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_28a
    instance-of v0, p4, Li9/i;

    if-eqz v0, :cond_317

    invoke-direct {p0, p1, p2}, Lg9/w$a;->j(ILjava/lang/reflect/Type;)V

    check-cast p4, Li9/i;

    invoke-interface {p4}, Li9/i;->value()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2}, Lg9/C;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v6, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-eqz v3, :cond_2e5

    instance-of v3, p2, Ljava/lang/reflect/ParameterizedType;

    if-eqz v3, :cond_2bf

    check-cast p2, Ljava/lang/reflect/ParameterizedType;

    invoke-static {v4, p2}, Lg9/C;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object p1

    iget-object p0, p0, Lg9/w$a;->a:Lg9/y;

    invoke-virtual {p0, p1, p3}, Lg9/y;->i(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lg9/h;

    move-result-object p0

    new-instance p1, Lg9/s$f;

    invoke-interface {p4}, Li9/i;->allowUnsafeNonAsciiValues()Z

    move-result p2

    invoke-direct {p1, v0, p0, p2}, Lg9/s$f;-><init>(Ljava/lang/String;Lg9/h;Z)V

    invoke-virtual {p1}, Lg9/s;->c()Lg9/s;

    move-result-object p0

    return-object p0

    :cond_2bf
    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    new-array p3, v4, [Ljava/lang/Object;

    invoke-static {p0, p1, p2, p3}, Lg9/C;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_2e5
    invoke-virtual {v2}, Ljava/lang/Class;->isArray()Z

    move-result p1

    if-eqz p1, :cond_307

    invoke-virtual {v2}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1}, Lg9/w$a;->a(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p1

    iget-object p0, p0, Lg9/w$a;->a:Lg9/y;

    invoke-virtual {p0, p1, p3}, Lg9/y;->i(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lg9/h;

    move-result-object p0

    new-instance p1, Lg9/s$f;

    invoke-interface {p4}, Li9/i;->allowUnsafeNonAsciiValues()Z

    move-result p2

    invoke-direct {p1, v0, p0, p2}, Lg9/s$f;-><init>(Ljava/lang/String;Lg9/h;Z)V

    invoke-virtual {p1}, Lg9/s;->b()Lg9/s;

    move-result-object p0

    return-object p0

    :cond_307
    iget-object p0, p0, Lg9/w$a;->a:Lg9/y;

    invoke-virtual {p0, p2, p3}, Lg9/y;->i(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lg9/h;

    move-result-object p0

    new-instance p1, Lg9/s$f;

    invoke-interface {p4}, Li9/i;->allowUnsafeNonAsciiValues()Z

    move-result p2

    invoke-direct {p1, v0, p0, p2}, Lg9/s$f;-><init>(Ljava/lang/String;Lg9/h;Z)V

    return-object p1

    :cond_317
    instance-of v0, p4, Li9/j;

    if-eqz v0, :cond_38a

    const-class v0, LP8/u;

    if-ne p2, v0, :cond_327

    new-instance p2, Lg9/s$h;

    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    invoke-direct {p2, p0, p1}, Lg9/s$h;-><init>(Ljava/lang/reflect/Method;I)V

    return-object p2

    :cond_327
    invoke-direct {p0, p1, p2}, Lg9/w$a;->j(ILjava/lang/reflect/Type;)V

    invoke-static {p2}, Lg9/C;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_37f

    invoke-static {p2, v0, v8}, Lg9/C;->i(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    move-result-object p2

    instance-of v0, p2, Ljava/lang/reflect/ParameterizedType;

    if-eqz v0, :cond_376

    check-cast p2, Ljava/lang/reflect/ParameterizedType;

    invoke-static {v4, p2}, Lg9/C;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v0

    if-ne v2, v0, :cond_35c

    invoke-static {v3, p2}, Lg9/C;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object p2

    iget-object v0, p0, Lg9/w$a;->a:Lg9/y;

    invoke-virtual {v0, p2, p3}, Lg9/y;->i(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lg9/h;

    move-result-object p2

    new-instance p3, Lg9/s$g;

    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    check-cast p4, Li9/j;

    invoke-interface {p4}, Li9/j;->allowUnsafeNonAsciiValues()Z

    move-result p4

    invoke-direct {p3, p0, p1, p2, p4}, Lg9/s$g;-><init>(Ljava/lang/reflect/Method;ILg9/h;Z)V

    return-object p3

    :cond_35c
    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "@HeaderMap keys must be of type String: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    new-array p3, v4, [Ljava/lang/Object;

    invoke-static {p0, p1, p2, p3}, Lg9/C;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_376
    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    new-array p2, v4, [Ljava/lang/Object;

    invoke-static {p0, p1, v7, p2}, Lg9/C;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_37f
    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    const-string p2, "@HeaderMap parameter type must be Map or Headers."

    new-array p3, v4, [Ljava/lang/Object;

    invoke-static {p0, p1, p2, p3}, Lg9/C;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_38a
    instance-of v0, p4, Li9/c;

    if-eqz v0, :cond_420

    invoke-direct {p0, p1, p2}, Lg9/w$a;->j(ILjava/lang/reflect/Type;)V

    iget-boolean v0, p0, Lg9/w$a;->q:Z

    if-eqz v0, :cond_415

    check-cast p4, Li9/c;

    invoke-interface {p4}, Li9/c;->value()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p4}, Li9/c;->encoded()Z

    move-result p4

    iput-boolean v3, p0, Lg9/w$a;->g:Z

    invoke-static {p2}, Lg9/C;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v6, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-eqz v3, :cond_3eb

    instance-of v3, p2, Ljava/lang/reflect/ParameterizedType;

    if-eqz v3, :cond_3c5

    check-cast p2, Ljava/lang/reflect/ParameterizedType;

    invoke-static {v4, p2}, Lg9/C;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object p1

    iget-object p0, p0, Lg9/w$a;->a:Lg9/y;

    invoke-virtual {p0, p1, p3}, Lg9/y;->i(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lg9/h;

    move-result-object p0

    new-instance p1, Lg9/s$d;

    invoke-direct {p1, v0, p0, p4}, Lg9/s$d;-><init>(Ljava/lang/String;Lg9/h;Z)V

    invoke-virtual {p1}, Lg9/s;->c()Lg9/s;

    move-result-object p0

    return-object p0

    :cond_3c5
    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    new-array p3, v4, [Ljava/lang/Object;

    invoke-static {p0, p1, p2, p3}, Lg9/C;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_3eb
    invoke-virtual {v2}, Ljava/lang/Class;->isArray()Z

    move-result p1

    if-eqz p1, :cond_409

    invoke-virtual {v2}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1}, Lg9/w$a;->a(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p1

    iget-object p0, p0, Lg9/w$a;->a:Lg9/y;

    invoke-virtual {p0, p1, p3}, Lg9/y;->i(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lg9/h;

    move-result-object p0

    new-instance p1, Lg9/s$d;

    invoke-direct {p1, v0, p0, p4}, Lg9/s$d;-><init>(Ljava/lang/String;Lg9/h;Z)V

    invoke-virtual {p1}, Lg9/s;->b()Lg9/s;

    move-result-object p0

    return-object p0

    :cond_409
    iget-object p0, p0, Lg9/w$a;->a:Lg9/y;

    invoke-virtual {p0, p2, p3}, Lg9/y;->i(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lg9/h;

    move-result-object p0

    new-instance p1, Lg9/s$d;

    invoke-direct {p1, v0, p0, p4}, Lg9/s$d;-><init>(Ljava/lang/String;Lg9/h;Z)V

    return-object p1

    :cond_415
    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    const-string p2, "@Field parameters can only be used with form encoding."

    new-array p3, v4, [Ljava/lang/Object;

    invoke-static {p0, p1, p2, p3}, Lg9/C;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_420
    instance-of v0, p4, Li9/d;

    if-eqz v0, :cond_498

    invoke-direct {p0, p1, p2}, Lg9/w$a;->j(ILjava/lang/reflect/Type;)V

    iget-boolean v0, p0, Lg9/w$a;->q:Z

    if-eqz v0, :cond_48d

    invoke-static {p2}, Lg9/C;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_482

    invoke-static {p2, v0, v8}, Lg9/C;->i(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    move-result-object p2

    instance-of v0, p2, Ljava/lang/reflect/ParameterizedType;

    if-eqz v0, :cond_479

    check-cast p2, Ljava/lang/reflect/ParameterizedType;

    invoke-static {v4, p2}, Lg9/C;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v0

    if-ne v2, v0, :cond_45f

    invoke-static {v3, p2}, Lg9/C;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object p2

    iget-object v0, p0, Lg9/w$a;->a:Lg9/y;

    invoke-virtual {v0, p2, p3}, Lg9/y;->i(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lg9/h;

    move-result-object p2

    iput-boolean v3, p0, Lg9/w$a;->g:Z

    new-instance p3, Lg9/s$e;

    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    check-cast p4, Li9/d;

    invoke-interface {p4}, Li9/d;->encoded()Z

    move-result p4

    invoke-direct {p3, p0, p1, p2, p4}, Lg9/s$e;-><init>(Ljava/lang/reflect/Method;ILg9/h;Z)V

    return-object p3

    :cond_45f
    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "@FieldMap keys must be of type String: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    new-array p3, v4, [Ljava/lang/Object;

    invoke-static {p0, p1, p2, p3}, Lg9/C;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_479
    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    new-array p2, v4, [Ljava/lang/Object;

    invoke-static {p0, p1, v7, p2}, Lg9/C;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_482
    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    const-string p2, "@FieldMap parameter type must be Map."

    new-array p3, v4, [Ljava/lang/Object;

    invoke-static {p0, p1, p2, p3}, Lg9/C;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_48d
    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    const-string p2, "@FieldMap parameters can only be used with form encoding."

    new-array p3, v4, [Ljava/lang/Object;

    invoke-static {p0, p1, p2, p3}, Lg9/C;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_498
    instance-of v0, p4, Li9/q;

    const-class v9, LP8/y$c;

    if-eqz v0, :cond_61b

    invoke-direct {p0, p1, p2}, Lg9/w$a;->j(ILjava/lang/reflect/Type;)V

    iget-boolean v0, p0, Lg9/w$a;->r:Z

    if-eqz v0, :cond_610

    check-cast p4, Li9/q;

    iput-boolean v3, p0, Lg9/w$a;->h:Z

    invoke-interface {p4}, Li9/q;->value()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2}, Lg9/C;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_53b

    invoke-virtual {v6, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p3

    const-string p4, "@Part annotation must supply a name or use MultipartBody.Part parameter type."

    if-eqz p3, :cond_509

    instance-of p3, p2, Ljava/lang/reflect/ParameterizedType;

    if-eqz p3, :cond_4e3

    check-cast p2, Ljava/lang/reflect/ParameterizedType;

    invoke-static {v4, p2}, Lg9/C;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object p2

    invoke-static {p2}, Lg9/C;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {v9, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p2

    if-eqz p2, :cond_4da

    sget-object p0, Lg9/s$o;->a:Lg9/s$o;

    invoke-virtual {p0}, Lg9/s;->c()Lg9/s;

    move-result-object p0

    return-object p0

    :cond_4da
    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    new-array p2, v4, [Ljava/lang/Object;

    invoke-static {p0, p1, p4, p2}, Lg9/C;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_4e3
    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    new-array p3, v4, [Ljava/lang/Object;

    invoke-static {p0, p1, p2, p3}, Lg9/C;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_509
    invoke-virtual {v2}, Ljava/lang/Class;->isArray()Z

    move-result p2

    if-eqz p2, :cond_529

    invoke-virtual {v2}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {v9, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p2

    if-eqz p2, :cond_520

    sget-object p0, Lg9/s$o;->a:Lg9/s$o;

    invoke-virtual {p0}, Lg9/s;->b()Lg9/s;

    move-result-object p0

    return-object p0

    :cond_520
    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    new-array p2, v4, [Ljava/lang/Object;

    invoke-static {p0, p1, p4, p2}, Lg9/C;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_529
    invoke-virtual {v9, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p2

    if-eqz p2, :cond_532

    sget-object p0, Lg9/s$o;->a:Lg9/s$o;

    return-object p0

    :cond_532
    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    new-array p2, v4, [Ljava/lang/Object;

    invoke-static {p0, p1, p4, p2}, Lg9/C;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_53b
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "form-data; name=\""

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\""

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v3, "Content-Transfer-Encoding"

    invoke-interface {p4}, Li9/q;->encoding()Ljava/lang/String;

    move-result-object p4

    const-string v7, "Content-Disposition"

    filled-new-array {v7, v0, v3, p4}, [Ljava/lang/String;

    move-result-object p4

    invoke-static {p4}, LP8/u;->g([Ljava/lang/String;)LP8/u;

    move-result-object p4

    invoke-virtual {v6, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    const-string v3, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation."

    if-eqz v0, :cond_5c0

    instance-of v0, p2, Ljava/lang/reflect/ParameterizedType;

    if-eqz v0, :cond_59a

    check-cast p2, Ljava/lang/reflect/ParameterizedType;

    invoke-static {v4, p2}, Lg9/C;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object p2

    invoke-static {p2}, Lg9/C;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-nez v0, :cond_591

    iget-object v0, p0, Lg9/w$a;->a:Lg9/y;

    iget-object v1, p0, Lg9/w$a;->d:[Ljava/lang/annotation/Annotation;

    invoke-virtual {v0, p2, p3, v1}, Lg9/y;->g(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lg9/h;

    move-result-object p2

    new-instance p3, Lg9/s$i;

    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    invoke-direct {p3, p0, p1, p4, p2}, Lg9/s$i;-><init>(Ljava/lang/reflect/Method;ILP8/u;Lg9/h;)V

    invoke-virtual {p3}, Lg9/s;->c()Lg9/s;

    move-result-object p0

    return-object p0

    :cond_591
    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    new-array p2, v4, [Ljava/lang/Object;

    invoke-static {p0, p1, v3, p2}, Lg9/C;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_59a
    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    new-array p3, v4, [Ljava/lang/Object;

    invoke-static {p0, p1, p2, p3}, Lg9/C;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_5c0
    invoke-virtual {v2}, Ljava/lang/Class;->isArray()Z

    move-result v0

    if-eqz v0, :cond_5f1

    invoke-virtual {v2}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object p2

    invoke-static {p2}, Lg9/w$a;->a(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {v9, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-nez v0, :cond_5e8

    iget-object v0, p0, Lg9/w$a;->a:Lg9/y;

    iget-object v1, p0, Lg9/w$a;->d:[Ljava/lang/annotation/Annotation;

    invoke-virtual {v0, p2, p3, v1}, Lg9/y;->g(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lg9/h;

    move-result-object p2

    new-instance p3, Lg9/s$i;

    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    invoke-direct {p3, p0, p1, p4, p2}, Lg9/s$i;-><init>(Ljava/lang/reflect/Method;ILP8/u;Lg9/h;)V

    invoke-virtual {p3}, Lg9/s;->b()Lg9/s;

    move-result-object p0

    return-object p0

    :cond_5e8
    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    new-array p2, v4, [Ljava/lang/Object;

    invoke-static {p0, p1, v3, p2}, Lg9/C;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_5f1
    invoke-virtual {v9, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-nez v0, :cond_607

    iget-object v0, p0, Lg9/w$a;->a:Lg9/y;

    iget-object v1, p0, Lg9/w$a;->d:[Ljava/lang/annotation/Annotation;

    invoke-virtual {v0, p2, p3, v1}, Lg9/y;->g(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lg9/h;

    move-result-object p2

    new-instance p3, Lg9/s$i;

    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    invoke-direct {p3, p0, p1, p4, p2}, Lg9/s$i;-><init>(Ljava/lang/reflect/Method;ILP8/u;Lg9/h;)V

    return-object p3

    :cond_607
    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    new-array p2, v4, [Ljava/lang/Object;

    invoke-static {p0, p1, v3, p2}, Lg9/C;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_610
    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    const-string p2, "@Part parameters can only be used with multipart encoding."

    new-array p3, v4, [Ljava/lang/Object;

    invoke-static {p0, p1, p2, p3}, Lg9/C;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_61b
    instance-of v0, p4, Li9/r;

    if-eqz v0, :cond_6aa

    invoke-direct {p0, p1, p2}, Lg9/w$a;->j(ILjava/lang/reflect/Type;)V

    iget-boolean v0, p0, Lg9/w$a;->r:Z

    if-eqz v0, :cond_69f

    iput-boolean v3, p0, Lg9/w$a;->h:Z

    invoke-static {p2}, Lg9/C;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_694

    invoke-static {p2, v0, v8}, Lg9/C;->i(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    move-result-object p2

    instance-of v0, p2, Ljava/lang/reflect/ParameterizedType;

    if-eqz v0, :cond_68b

    check-cast p2, Ljava/lang/reflect/ParameterizedType;

    invoke-static {v4, p2}, Lg9/C;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v0

    if-ne v2, v0, :cond_671

    invoke-static {v3, p2}, Lg9/C;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object p2

    invoke-static {p2}, Lg9/C;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-nez v0, :cond_666

    iget-object v0, p0, Lg9/w$a;->a:Lg9/y;

    iget-object v1, p0, Lg9/w$a;->d:[Ljava/lang/annotation/Annotation;

    invoke-virtual {v0, p2, p3, v1}, Lg9/y;->g(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lg9/h;

    move-result-object p2

    check-cast p4, Li9/r;

    new-instance p3, Lg9/s$j;

    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    invoke-interface {p4}, Li9/r;->encoding()Ljava/lang/String;

    move-result-object p4

    invoke-direct {p3, p0, p1, p2, p4}, Lg9/s$j;-><init>(Ljava/lang/reflect/Method;ILg9/h;Ljava/lang/String;)V

    return-object p3

    :cond_666
    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    const-string p2, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead."

    new-array p3, v4, [Ljava/lang/Object;

    invoke-static {p0, p1, p2, p3}, Lg9/C;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_671
    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "@PartMap keys must be of type String: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    new-array p3, v4, [Ljava/lang/Object;

    invoke-static {p0, p1, p2, p3}, Lg9/C;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_68b
    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    new-array p2, v4, [Ljava/lang/Object;

    invoke-static {p0, p1, v7, p2}, Lg9/C;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_694
    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    const-string p2, "@PartMap parameter type must be Map."

    new-array p3, v4, [Ljava/lang/Object;

    invoke-static {p0, p1, p2, p3}, Lg9/C;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_69f
    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    const-string p2, "@PartMap parameters can only be used with multipart encoding."

    new-array p3, v4, [Ljava/lang/Object;

    invoke-static {p0, p1, p2, p3}, Lg9/C;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_6aa
    instance-of v0, p4, Li9/a;

    if-eqz v0, :cond_6f4

    invoke-direct {p0, p1, p2}, Lg9/w$a;->j(ILjava/lang/reflect/Type;)V

    iget-boolean p4, p0, Lg9/w$a;->q:Z

    if-nez p4, :cond_6e9

    iget-boolean p4, p0, Lg9/w$a;->r:Z

    if-nez p4, :cond_6e9

    iget-boolean p4, p0, Lg9/w$a;->i:Z

    if-nez p4, :cond_6de

    :try_start_6bd
    iget-object p4, p0, Lg9/w$a;->a:Lg9/y;

    iget-object v0, p0, Lg9/w$a;->d:[Ljava/lang/annotation/Annotation;

    invoke-virtual {p4, p2, p3, v0}, Lg9/y;->g(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lg9/h;

    move-result-object p2
    :try_end_6c5
    .catch Ljava/lang/RuntimeException; {:try_start_6bd .. :try_end_6c5} :catch_6cf

    iput-boolean v3, p0, Lg9/w$a;->i:Z

    new-instance p3, Lg9/s$c;

    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    invoke-direct {p3, p0, p1, p2}, Lg9/s$c;-><init>(Ljava/lang/reflect/Method;ILg9/h;)V

    return-object p3

    :catch_6cf
    move-exception v0

    move-object p3, v0

    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    const-string p4, "Unable to create @Body converter for %s"

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {p0, p3, p1, p4, p2}, Lg9/C;->q(Ljava/lang/reflect/Method;Ljava/lang/Throwable;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_6de
    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    const-string p2, "Multiple @Body method annotations found."

    new-array p3, v4, [Ljava/lang/Object;

    invoke-static {p0, p1, p2, p3}, Lg9/C;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_6e9
    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    const-string p2, "@Body parameters cannot be used with form or multi-part encoding."

    new-array p3, v4, [Ljava/lang/Object;

    invoke-static {p0, p1, p2, p3}, Lg9/C;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_6f4
    instance-of p3, p4, Li9/x;

    if-eqz p3, :cond_752

    invoke-direct {p0, p1, p2}, Lg9/w$a;->j(ILjava/lang/reflect/Type;)V

    invoke-static {p2}, Lg9/C;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object p2

    add-int/lit8 p3, p1, -0x1

    :goto_701
    if-ltz p3, :cond_74c

    iget-object p4, p0, Lg9/w$a;->w:[Lg9/s;

    aget-object p4, p4, p3

    instance-of v0, p4, Lg9/s$q;

    if-eqz v0, :cond_749

    check-cast p4, Lg9/s$q;

    iget-object p4, p4, Lg9/s$q;->a:Ljava/lang/Class;

    invoke-virtual {p4, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p4

    if-nez p4, :cond_716

    goto :goto_749

    :cond_716
    iget-object p4, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "@Tag type "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " is duplicate of "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p2, Lg9/t;->b:Lg9/u;

    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    invoke-virtual {p2, p0, p3}, Lg9/u;->a(Ljava/lang/reflect/Method;I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " and would always overwrite its value."

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-array p2, v4, [Ljava/lang/Object;

    invoke-static {p4, p1, p0, p2}, Lg9/C;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_749
    :goto_749
    add-int/lit8 p3, p3, -0x1

    goto :goto_701

    :cond_74c
    new-instance p0, Lg9/s$q;

    invoke-direct {p0, p2}, Lg9/s$q;-><init>(Ljava/lang/Class;)V

    return-object p0

    :cond_752
    const/4 p0, 0x0

    return-object p0
.end method

.method static h(Ljava/lang/String;)Ljava/util/Set;
    .registers 3

    sget-object v0, Lg9/w$a;->y:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    :goto_b
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    move-result v1

    if-eqz v1, :cond_1a

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_b

    :cond_1a
    return-object v0
.end method

.method private i(ILjava/lang/String;)V
    .registers 4

    sget-object v0, Lg9/w$a;->z:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_24

    iget-object v0, p0, Lg9/w$a;->v:Ljava/util/Set;

    invoke-interface {v0, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_15

    return-void

    :cond_15
    iget-object v0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    iget-object p0, p0, Lg9/w$a;->s:Ljava/lang/String;

    filled-new-array {p0, p2}, [Ljava/lang/Object;

    move-result-object p0

    const-string p2, "URL \"%s\" does not contain \"{%s}\"."

    invoke-static {v0, p1, p2, p0}, Lg9/C;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_24
    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    sget-object v0, Lg9/w$a;->y:Ljava/util/regex/Pattern;

    invoke-virtual {v0}, Ljava/util/regex/Pattern;->pattern()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0, p2}, [Ljava/lang/Object;

    move-result-object p2

    const-string v0, "@Path parameter name must match %s. Found: %s"

    invoke-static {p0, p1, v0, p2}, Lg9/C;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0
.end method

.method private j(ILjava/lang/reflect/Type;)V
    .registers 4

    invoke-static {p2}, Lg9/C;->j(Ljava/lang/reflect/Type;)Z

    move-result v0

    if-nez v0, :cond_7

    return-void

    :cond_7
    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    const-string v0, "Parameter type must not include a type variable or wildcard: %s"

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {p0, p1, v0, p2}, Lg9/C;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0
.end method


# virtual methods
.method b()Lg9/w;
    .registers 9

    iget-object v0, p0, Lg9/w$a;->d:[Ljava/lang/annotation/Annotation;

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_5
    if-ge v3, v1, :cond_f

    aget-object v4, v0, v3

    invoke-direct {p0, v4}, Lg9/w$a;->e(Ljava/lang/annotation/Annotation;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    :cond_f
    iget-object v0, p0, Lg9/w$a;->o:Ljava/lang/String;

    if-eqz v0, :cond_ba

    iget-boolean v0, p0, Lg9/w$a;->p:Z

    if-nez v0, :cond_36

    iget-boolean v0, p0, Lg9/w$a;->r:Z

    if-nez v0, :cond_2b

    iget-boolean v0, p0, Lg9/w$a;->q:Z

    if-nez v0, :cond_20

    goto :goto_36

    :cond_20
    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    const-string v0, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST)."

    new-array v1, v2, [Ljava/lang/Object;

    invoke-static {p0, v0, v1}, Lg9/C;->n(Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_2b
    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    const-string v0, "Multipart can only be specified on HTTP methods with request body (e.g., @POST)."

    new-array v1, v2, [Ljava/lang/Object;

    invoke-static {p0, v0, v1}, Lg9/C;->n(Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_36
    :goto_36
    iget-object v0, p0, Lg9/w$a;->e:[[Ljava/lang/annotation/Annotation;

    array-length v0, v0

    new-array v1, v0, [Lg9/s;

    iput-object v1, p0, Lg9/w$a;->w:[Lg9/s;

    add-int/lit8 v1, v0, -0x1

    move v3, v2

    :goto_40
    if-ge v3, v0, :cond_5a

    iget-object v4, p0, Lg9/w$a;->w:[Lg9/s;

    iget-object v5, p0, Lg9/w$a;->f:[Ljava/lang/reflect/Type;

    aget-object v5, v5, v3

    iget-object v6, p0, Lg9/w$a;->e:[[Ljava/lang/annotation/Annotation;

    aget-object v6, v6, v3

    if-ne v3, v1, :cond_50

    const/4 v7, 0x1

    goto :goto_51

    :cond_50
    move v7, v2

    :goto_51
    invoke-direct {p0, v3, v5, v6, v7}, Lg9/w$a;->f(ILjava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Z)Lg9/s;

    move-result-object v5

    aput-object v5, v4, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_40

    :cond_5a
    iget-object v0, p0, Lg9/w$a;->s:Ljava/lang/String;

    if-nez v0, :cond_72

    iget-boolean v0, p0, Lg9/w$a;->n:Z

    if-eqz v0, :cond_63

    goto :goto_72

    :cond_63
    iget-object v0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    iget-object p0, p0, Lg9/w$a;->o:Ljava/lang/String;

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string v1, "Missing either @%s URL or @Url parameter."

    invoke-static {v0, v1, p0}, Lg9/C;->n(Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_72
    :goto_72
    iget-boolean v0, p0, Lg9/w$a;->q:Z

    if-nez v0, :cond_8e

    iget-boolean v1, p0, Lg9/w$a;->r:Z

    if-nez v1, :cond_8e

    iget-boolean v1, p0, Lg9/w$a;->p:Z

    if-nez v1, :cond_8e

    iget-boolean v1, p0, Lg9/w$a;->i:Z

    if-nez v1, :cond_83

    goto :goto_8e

    :cond_83
    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    const-string v0, "Non-body HTTP method cannot contain @Body."

    new-array v1, v2, [Ljava/lang/Object;

    invoke-static {p0, v0, v1}, Lg9/C;->n(Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_8e
    :goto_8e
    if-eqz v0, :cond_a0

    iget-boolean v0, p0, Lg9/w$a;->g:Z

    if-eqz v0, :cond_95

    goto :goto_a0

    :cond_95
    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    const-string v0, "Form-encoded method must contain at least one @Field."

    new-array v1, v2, [Ljava/lang/Object;

    invoke-static {p0, v0, v1}, Lg9/C;->n(Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_a0
    :goto_a0
    iget-boolean v0, p0, Lg9/w$a;->r:Z

    if-eqz v0, :cond_b4

    iget-boolean v0, p0, Lg9/w$a;->h:Z

    if-eqz v0, :cond_a9

    goto :goto_b4

    :cond_a9
    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    const-string v0, "Multipart method must contain at least one @Part."

    new-array v1, v2, [Ljava/lang/Object;

    invoke-static {p0, v0, v1}, Lg9/C;->n(Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_b4
    :goto_b4
    new-instance v0, Lg9/w;

    invoke-direct {v0, p0}, Lg9/w;-><init>(Lg9/w$a;)V

    return-object v0

    :cond_ba
    iget-object p0, p0, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    const-string v0, "HTTP method annotation is required (e.g., @GET, @POST, etc.)."

    new-array v1, v2, [Ljava/lang/Object;

    invoke-static {p0, v0, v1}, Lg9/C;->n(Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0
.end method
