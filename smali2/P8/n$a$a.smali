.class final LP8/n$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP8/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP8/n$a;
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
.method public a(LP8/v;Ljava/util/List;)V
    .registers 3

    const-string p0, "url"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "cookies"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public b(LP8/v;)Ljava/util/List;
    .registers 2

    const-string p0, "url"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Li8/s;->l()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method
