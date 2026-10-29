.class public final LU8/i;
.super Ljava/lang/RuntimeException;
.source "SourceFile"


# instance fields
.field private final q:Ljava/io/IOException;

.field private r:Ljava/io/IOException;


# direct methods
.method public constructor <init>(Ljava/io/IOException;)V
    .registers 3

    const-string v0, "firstConnectException"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    iput-object p1, p0, LU8/i;->q:Ljava/io/IOException;

    iput-object p1, p0, LU8/i;->r:Ljava/io/IOException;

    return-void
.end method


# virtual methods
.method public final a(Ljava/io/IOException;)V
    .registers 3

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LU8/i;->q:Ljava/io/IOException;

    invoke-static {v0, p1}, Lh8/c;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    iput-object p1, p0, LU8/i;->r:Ljava/io/IOException;

    return-void
.end method

.method public final b()Ljava/io/IOException;
    .registers 1

    iget-object p0, p0, LU8/i;->q:Ljava/io/IOException;

    return-object p0
.end method

.method public final c()Ljava/io/IOException;
    .registers 1

    iget-object p0, p0, LU8/i;->r:Ljava/io/IOException;

    return-object p0
.end method
