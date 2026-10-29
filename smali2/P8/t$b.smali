.class final LP8/t$b;
.super Lkotlin/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lv8/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP8/t;-><init>(LP8/G;LP8/i;Ljava/util/List;Lv8/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic r:Lv8/a;


# direct methods
.method constructor <init>(Lv8/a;)V
    .registers 2

    iput-object p1, p0, LP8/t$b;->r:Lv8/a;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/o;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .registers 1

    :try_start_0
    iget-object p0, p0, LP8/t$b;->r:Lv8/a;

    invoke-interface {p0}, Lv8/a;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;
    :try_end_8
    .catch Ljavax/net/ssl/SSLPeerUnverifiedException; {:try_start_0 .. :try_end_8} :catch_9

    return-object p0

    :catch_9
    invoke-static {}, Li8/s;->l()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .registers 1

    invoke-virtual {p0}, LP8/t$b;->a()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method
