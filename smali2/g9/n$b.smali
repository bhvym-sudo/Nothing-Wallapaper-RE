.class final Lg9/n$b;
.super Lg9/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg9/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field private final d:Lg9/e;

.field private final e:Z

.field private final f:Z


# direct methods
.method constructor <init>(Lg9/w;LP8/e$a;Lg9/h;Lg9/e;ZZ)V
    .registers 7

    invoke-direct {p0, p1, p2, p3}, Lg9/n;-><init>(Lg9/w;LP8/e$a;Lg9/h;)V

    iput-object p4, p0, Lg9/n$b;->d:Lg9/e;

    iput-boolean p5, p0, Lg9/n$b;->e:Z

    iput-boolean p6, p0, Lg9/n$b;->f:Z

    return-void
.end method


# virtual methods
.method protected c(Lg9/d;[Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    iget-object v0, p0, Lg9/n$b;->d:Lg9/e;

    invoke-interface {v0, p1}, Lg9/e;->b(Lg9/d;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg9/d;

    array-length v0, p2

    add-int/lit8 v0, v0, -0x1

    aget-object p2, p2, v0

    check-cast p2, Lm8/e;

    :try_start_f
    iget-boolean v0, p0, Lg9/n$b;->f:Z

    if-eqz v0, :cond_1a

    invoke-static {p1, p2}, Lg9/p;->d(Lg9/d;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :catchall_18
    move-exception p0

    goto :goto_28

    :cond_1a
    iget-boolean p0, p0, Lg9/n$b;->e:Z

    if-eqz p0, :cond_23

    invoke-static {p1, p2}, Lg9/p;->b(Lg9/d;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_23
    invoke-static {p1, p2}, Lg9/p;->a(Lg9/d;Lm8/e;)Ljava/lang/Object;

    move-result-object p0
    :try_end_27
    .catch Ljava/lang/VirtualMachineError; {:try_start_f .. :try_end_27} :catch_2d
    .catch Ljava/lang/ThreadDeath; {:try_start_f .. :try_end_27} :catch_2d
    .catch Ljava/lang/LinkageError; {:try_start_f .. :try_end_27} :catch_2d
    .catchall {:try_start_f .. :try_end_27} :catchall_18

    return-object p0

    :goto_28
    invoke-static {p0, p2}, Lg9/p;->e(Ljava/lang/Throwable;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :catch_2d
    move-exception p0

    throw p0
.end method
