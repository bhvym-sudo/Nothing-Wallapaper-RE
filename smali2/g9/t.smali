.class abstract Lg9/t;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final a:Ljava/util/concurrent/Executor;

.field static final b:Lg9/u;

.field static final c:Lg9/c;


# direct methods
.method static constructor <clinit>()V
    .registers 3

    const-string v0, "java.vm.name"

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    const-string v2, "RoboVM"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_41

    const-string v2, "Dalvik"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2b

    sput-object v1, Lg9/t;->a:Ljava/util/concurrent/Executor;

    new-instance v0, Lg9/u$b;

    invoke-direct {v0}, Lg9/u$b;-><init>()V

    sput-object v0, Lg9/t;->b:Lg9/u;

    new-instance v0, Lg9/c$a;

    invoke-direct {v0}, Lg9/c$a;-><init>()V

    sput-object v0, Lg9/t;->c:Lg9/c;

    return-void

    :cond_2b
    new-instance v0, Lg9/a;

    invoke-direct {v0}, Lg9/a;-><init>()V

    sput-object v0, Lg9/t;->a:Ljava/util/concurrent/Executor;

    new-instance v0, Lg9/u$a;

    invoke-direct {v0}, Lg9/u$a;-><init>()V

    sput-object v0, Lg9/t;->b:Lg9/u;

    new-instance v0, Lg9/c$a;

    invoke-direct {v0}, Lg9/c$a;-><init>()V

    sput-object v0, Lg9/t;->c:Lg9/c;

    return-void

    :cond_41
    sput-object v1, Lg9/t;->a:Ljava/util/concurrent/Executor;

    new-instance v0, Lg9/u;

    invoke-direct {v0}, Lg9/u;-><init>()V

    sput-object v0, Lg9/t;->b:Lg9/u;

    new-instance v0, Lg9/c;

    invoke-direct {v0}, Lg9/c;-><init>()V

    sput-object v0, Lg9/t;->c:Lg9/c;

    return-void
.end method
