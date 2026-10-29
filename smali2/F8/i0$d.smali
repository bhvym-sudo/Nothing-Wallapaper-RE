.class public final LF8/i0$d;
.super LK8/M;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF8/i0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# instance fields
.field public c:J


# direct methods
.method public constructor <init>(J)V
    .registers 3

    invoke-direct {p0}, LK8/M;-><init>()V

    iput-wide p1, p0, LF8/i0$d;->c:J

    return-void
.end method
