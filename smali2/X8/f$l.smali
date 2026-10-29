.class public final LX8/f$l;
.super LT8/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LX8/f;->E1(IJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic e:LX8/f;

.field final synthetic f:I

.field final synthetic g:J


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLX8/f;IJ)V
    .registers 7

    iput-object p3, p0, LX8/f$l;->e:LX8/f;

    iput p4, p0, LX8/f$l;->f:I

    iput-wide p5, p0, LX8/f$l;->g:J

    invoke-direct {p0, p1, p2}, LT8/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public f()J
    .registers 5

    :try_start_0
    iget-object v0, p0, LX8/f$l;->e:LX8/f;

    invoke-virtual {v0}, LX8/f;->i1()LX8/j;

    move-result-object v0

    iget v1, p0, LX8/f$l;->f:I

    iget-wide v2, p0, LX8/f$l;->g:J

    invoke-virtual {v0, v1, v2, v3}, LX8/j;->U(IJ)V
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_d} :catch_e

    goto :goto_14

    :catch_e
    move-exception v0

    iget-object p0, p0, LX8/f$l;->e:LX8/f;

    invoke-static {p0, v0}, LX8/f;->a(LX8/f;Ljava/io/IOException;)V

    :goto_14
    const-wide/16 v0, -0x1

    return-wide v0
.end method
