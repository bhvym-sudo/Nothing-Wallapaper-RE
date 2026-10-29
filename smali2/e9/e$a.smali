.class public final Le9/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le9/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public q:Le9/e;

.field private r:Le9/w;

.field public s:J

.field public t:[B

.field public u:I

.field public v:I


# direct methods
.method public constructor <init>()V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Le9/e$a;->s:J

    const/4 v0, -0x1

    iput v0, p0, Le9/e$a;->u:I

    iput v0, p0, Le9/e$a;->v:I

    return-void
.end method


# virtual methods
.method public final a(Le9/w;)V
    .registers 2

    iput-object p1, p0, Le9/e$a;->r:Le9/w;

    return-void
.end method

.method public close()V
    .registers 4

    iget-object v0, p0, Le9/e$a;->q:Le9/e;

    if-eqz v0, :cond_16

    const/4 v0, 0x0

    iput-object v0, p0, Le9/e$a;->q:Le9/e;

    invoke-virtual {p0, v0}, Le9/e$a;->a(Le9/w;)V

    const-wide/16 v1, -0x1

    iput-wide v1, p0, Le9/e$a;->s:J

    iput-object v0, p0, Le9/e$a;->t:[B

    const/4 v0, -0x1

    iput v0, p0, Le9/e$a;->u:I

    iput v0, p0, Le9/e$a;->v:I

    return-void

    :cond_16
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "not attached to a buffer"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
