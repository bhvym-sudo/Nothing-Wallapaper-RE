.class final Lg9/b;
.super Lg9/h$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg9/b$d;,
        Lg9/b$a;,
        Lg9/b$c;,
        Lg9/b$b;,
        Lg9/b$e;,
        Lg9/b$f;
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    invoke-direct {p0}, Lg9/h$a;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;Lg9/y;)Lg9/h;
    .registers 5

    const-class p0, LP8/C;

    invoke-static {p1}, Lg9/C;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p0

    if-eqz p0, :cond_f

    sget-object p0, Lg9/b$b;->a:Lg9/b$b;

    return-object p0

    :cond_f
    const/4 p0, 0x0

    return-object p0
.end method

.method public d(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lg9/y;)Lg9/h;
    .registers 4

    const-class p0, LP8/E;

    if-ne p1, p0, :cond_12

    const-class p0, Li9/w;

    invoke-static {p2, p0}, Lg9/C;->l([Ljava/lang/annotation/Annotation;Ljava/lang/Class;)Z

    move-result p0

    if-eqz p0, :cond_f

    sget-object p0, Lg9/b$c;->a:Lg9/b$c;

    return-object p0

    :cond_f
    sget-object p0, Lg9/b$a;->a:Lg9/b$a;

    return-object p0

    :cond_12
    const-class p0, Ljava/lang/Void;

    if-ne p1, p0, :cond_19

    sget-object p0, Lg9/b$f;->a:Lg9/b$f;

    return-object p0

    :cond_19
    invoke-static {p1}, Lg9/C;->m(Ljava/lang/reflect/Type;)Z

    move-result p0

    if-eqz p0, :cond_22

    sget-object p0, Lg9/b$e;->a:Lg9/b$e;

    return-object p0

    :cond_22
    const/4 p0, 0x0

    return-object p0
.end method
