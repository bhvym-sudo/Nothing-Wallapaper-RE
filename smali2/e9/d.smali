.class final Le9/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le9/z;


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public Z(Le9/e;J)V
    .registers 4

    const-string p0, "source"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2, p3}, Le9/e;->skip(J)V

    return-void
.end method

.method public close()V
    .registers 1

    return-void
.end method

.method public e()Le9/C;
    .registers 1

    sget-object p0, Le9/C;->e:Le9/C;

    return-object p0
.end method

.method public flush()V
    .registers 1

    return-void
.end method
