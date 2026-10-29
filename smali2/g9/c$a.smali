.class final Lg9/c$a;
.super Lg9/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg9/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    invoke-direct {p0}, Lg9/c;-><init>()V

    return-void
.end method


# virtual methods
.method a(Ljava/util/concurrent/Executor;)Ljava/util/List;
    .registers 3

    new-instance p0, Lg9/g;

    invoke-direct {p0}, Lg9/g;-><init>()V

    new-instance v0, Lg9/i;

    invoke-direct {v0, p1}, Lg9/i;-><init>(Ljava/util/concurrent/Executor;)V

    filled-new-array {p0, v0}, [Lg9/e$a;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method b()Ljava/util/List;
    .registers 1

    new-instance p0, Lg9/r;

    invoke-direct {p0}, Lg9/r;-><init>()V

    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method
