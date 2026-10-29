.class Lg9/i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg9/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg9/i;->a(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lg9/y;)Lg9/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/reflect/Type;

.field final synthetic b:Ljava/util/concurrent/Executor;

.field final synthetic c:Lg9/i;


# direct methods
.method constructor <init>(Lg9/i;Ljava/lang/reflect/Type;Ljava/util/concurrent/Executor;)V
    .registers 4

    iput-object p1, p0, Lg9/i$a;->c:Lg9/i;

    iput-object p2, p0, Lg9/i$a;->a:Ljava/lang/reflect/Type;

    iput-object p3, p0, Lg9/i$a;->b:Ljava/util/concurrent/Executor;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/reflect/Type;
    .registers 1

    iget-object p0, p0, Lg9/i$a;->a:Ljava/lang/reflect/Type;

    return-object p0
.end method

.method public bridge synthetic b(Lg9/d;)Ljava/lang/Object;
    .registers 2

    invoke-virtual {p0, p1}, Lg9/i$a;->c(Lg9/d;)Lg9/d;

    move-result-object p0

    return-object p0
.end method

.method public c(Lg9/d;)Lg9/d;
    .registers 3

    iget-object p0, p0, Lg9/i$a;->b:Ljava/util/concurrent/Executor;

    if-nez p0, :cond_5

    return-object p1

    :cond_5
    new-instance v0, Lg9/i$b;

    invoke-direct {v0, p0, p1}, Lg9/i$b;-><init>(Ljava/util/concurrent/Executor;Lg9/d;)V

    return-object v0
.end method
