.class Lg9/y$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg9/y;->b(Ljava/lang/Class;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private final a:[Ljava/lang/Object;

.field final synthetic b:Ljava/lang/Class;

.field final synthetic c:Lg9/y;


# direct methods
.method constructor <init>(Lg9/y;Ljava/lang/Class;)V
    .registers 3

    iput-object p1, p0, Lg9/y$a;->c:Lg9/y;

    iput-object p2, p0, Lg9/y$a;->b:Ljava/lang/Class;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    iput-object p1, p0, Lg9/y$a;->a:[Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .registers 6

    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Ljava/lang/Object;

    if-ne v0, v1, :cond_d

    invoke-virtual {p2, p0, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_d
    if-eqz p3, :cond_10

    goto :goto_12

    :cond_10
    iget-object p3, p0, Lg9/y$a;->a:[Ljava/lang/Object;

    :goto_12
    sget-object v0, Lg9/t;->b:Lg9/u;

    invoke-virtual {v0, p2}, Lg9/u;->c(Ljava/lang/reflect/Method;)Z

    move-result v1

    if-eqz v1, :cond_21

    iget-object p0, p0, Lg9/y$a;->b:Ljava/lang/Class;

    invoke-virtual {v0, p2, p0, p1, p3}, Lg9/u;->b(Ljava/lang/reflect/Method;Ljava/lang/Class;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_21
    iget-object v0, p0, Lg9/y$a;->c:Lg9/y;

    iget-object p0, p0, Lg9/y$a;->b:Ljava/lang/Class;

    invoke-virtual {v0, p0, p2}, Lg9/y;->c(Ljava/lang/Class;Ljava/lang/reflect/Method;)Lg9/z;

    move-result-object p0

    invoke-virtual {p0, p1, p3}, Lg9/z;->a(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
