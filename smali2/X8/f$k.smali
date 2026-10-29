.class public final LX8/f$k;
.super LT8/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LX8/f;->D1(ILX8/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic e:LX8/f;

.field final synthetic f:I

.field final synthetic g:LX8/b;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLX8/f;ILX8/b;)V
    .registers 6

    iput-object p3, p0, LX8/f$k;->e:LX8/f;

    iput p4, p0, LX8/f$k;->f:I

    iput-object p5, p0, LX8/f$k;->g:LX8/b;

    invoke-direct {p0, p1, p2}, LT8/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public f()J
    .registers 4

    :try_start_0
    iget-object v0, p0, LX8/f$k;->e:LX8/f;

    iget v1, p0, LX8/f$k;->f:I

    iget-object v2, p0, LX8/f$k;->g:LX8/b;

    invoke-virtual {v0, v1, v2}, LX8/f;->C1(ILX8/b;)V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_9} :catch_a

    goto :goto_10

    :catch_a
    move-exception v0

    iget-object p0, p0, LX8/f$k;->e:LX8/f;

    invoke-static {p0, v0}, LX8/f;->a(LX8/f;Ljava/io/IOException;)V

    :goto_10
    const-wide/16 v0, -0x1

    return-wide v0
.end method
