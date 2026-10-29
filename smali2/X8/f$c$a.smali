.class public final LX8/f$c$a;
.super LX8/f$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LX8/f$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    invoke-direct {p0}, LX8/f$c;-><init>()V

    return-void
.end method


# virtual methods
.method public c(LX8/i;)V
    .registers 3

    const-string p0, "stream"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, LX8/b;->z:LX8/b;

    const/4 v0, 0x0

    invoke-virtual {p1, p0, v0}, LX8/i;->d(LX8/b;Ljava/io/IOException;)V

    return-void
.end method
