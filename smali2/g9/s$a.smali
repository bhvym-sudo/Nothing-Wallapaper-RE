.class Lg9/s$a;
.super Lg9/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg9/s;->c()Lg9/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lg9/s;


# direct methods
.method constructor <init>(Lg9/s;)V
    .registers 2

    iput-object p1, p0, Lg9/s$a;->a:Lg9/s;

    invoke-direct {p0}, Lg9/s;-><init>()V

    return-void
.end method


# virtual methods
.method bridge synthetic a(Lg9/v;Ljava/lang/Object;)V
    .registers 3

    check-cast p2, Ljava/lang/Iterable;

    invoke-virtual {p0, p1, p2}, Lg9/s$a;->d(Lg9/v;Ljava/lang/Iterable;)V

    return-void
.end method

.method d(Lg9/v;Ljava/lang/Iterable;)V
    .registers 5

    if-nez p2, :cond_3

    goto :goto_17

    :cond_3
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_7
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_17

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lg9/s$a;->a:Lg9/s;

    invoke-virtual {v1, p1, v0}, Lg9/s;->a(Lg9/v;Ljava/lang/Object;)V

    goto :goto_7

    :cond_17
    :goto_17
    return-void
.end method
