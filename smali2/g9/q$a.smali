.class Lg9/q$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP8/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg9/q;->g(Lg9/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lg9/f;

.field final synthetic b:Lg9/q;


# direct methods
.method constructor <init>(Lg9/q;Lg9/f;)V
    .registers 3

    iput-object p1, p0, Lg9/q$a;->b:Lg9/q;

    iput-object p2, p0, Lg9/q$a;->a:Lg9/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private c(Ljava/lang/Throwable;)V
    .registers 3

    :try_start_0
    iget-object v0, p0, Lg9/q$a;->a:Lg9/f;

    iget-object p0, p0, Lg9/q$a;->b:Lg9/q;

    invoke-interface {v0, p0, p1}, Lg9/f;->a(Lg9/d;Ljava/lang/Throwable;)V
    :try_end_7
    .catchall {:try_start_0 .. :try_end_7} :catchall_8

    return-void

    :catchall_8
    move-exception p0

    invoke-static {p0}, Lg9/C;->t(Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method


# virtual methods
.method public a(LP8/e;LP8/D;)V
    .registers 3

    :try_start_0
    iget-object p1, p0, Lg9/q$a;->b:Lg9/q;

    invoke-virtual {p1, p2}, Lg9/q;->h(LP8/D;)Lg9/x;

    move-result-object p1
    :try_end_6
    .catchall {:try_start_0 .. :try_end_6} :catchall_16

    :try_start_6
    iget-object p2, p0, Lg9/q$a;->a:Lg9/f;

    iget-object p0, p0, Lg9/q$a;->b:Lg9/q;

    invoke-interface {p2, p0, p1}, Lg9/f;->b(Lg9/d;Lg9/x;)V
    :try_end_d
    .catchall {:try_start_6 .. :try_end_d} :catchall_e

    return-void

    :catchall_e
    move-exception p0

    invoke-static {p0}, Lg9/C;->t(Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    return-void

    :catchall_16
    move-exception p1

    invoke-static {p1}, Lg9/C;->t(Ljava/lang/Throwable;)V

    invoke-direct {p0, p1}, Lg9/q$a;->c(Ljava/lang/Throwable;)V

    return-void
.end method

.method public b(LP8/e;Ljava/io/IOException;)V
    .registers 3

    invoke-direct {p0, p2}, Lg9/q$a;->c(Ljava/lang/Throwable;)V

    return-void
.end method
