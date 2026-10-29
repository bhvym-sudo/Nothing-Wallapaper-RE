.class final LX8/l$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LX8/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LX8/l$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ILe9/g;IZ)Z
    .registers 5

    const-string p0, "source"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    int-to-long p0, p3

    invoke-interface {p2, p0, p1}, Le9/g;->skip(J)V

    const/4 p0, 0x1

    return p0
.end method

.method public b(ILX8/b;)V
    .registers 3

    const-string p0, "errorCode"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public c(ILjava/util/List;)Z
    .registers 3

    const-string p0, "requestHeaders"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x1

    return p0
.end method

.method public d(ILjava/util/List;Z)Z
    .registers 4

    const-string p0, "responseHeaders"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x1

    return p0
.end method
