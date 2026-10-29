.class public final Lg9/r;
.super Lg9/h$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg9/r$a;
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    invoke-direct {p0}, Lg9/h$a;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lg9/y;)Lg9/h;
    .registers 5

    invoke-static {p1}, Lg9/h$a;->b(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object p0

    const-class v0, Ljava/util/Optional;

    if-eq p0, v0, :cond_a

    const/4 p0, 0x0

    return-object p0

    :cond_a
    const/4 p0, 0x0

    check-cast p1, Ljava/lang/reflect/ParameterizedType;

    invoke-static {p0, p1}, Lg9/h$a;->a(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object p0

    invoke-virtual {p3, p0, p2}, Lg9/y;->h(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lg9/h;

    move-result-object p0

    new-instance p1, Lg9/r$a;

    invoke-direct {p1, p0}, Lg9/r$a;-><init>(Lg9/h;)V

    return-object p1
.end method
