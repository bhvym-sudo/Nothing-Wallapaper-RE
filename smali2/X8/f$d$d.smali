.class public final LX8/f$d$d;
.super LT8/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LX8/f$d;->i(ZLX8/m;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic e:LX8/f$d;

.field final synthetic f:Z

.field final synthetic g:LX8/m;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLX8/f$d;ZLX8/m;)V
    .registers 6

    iput-object p3, p0, LX8/f$d$d;->e:LX8/f$d;

    iput-boolean p4, p0, LX8/f$d$d;->f:Z

    iput-object p5, p0, LX8/f$d$d;->g:LX8/m;

    invoke-direct {p0, p1, p2}, LT8/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public f()J
    .registers 3

    iget-object v0, p0, LX8/f$d$d;->e:LX8/f$d;

    iget-boolean v1, p0, LX8/f$d$d;->f:Z

    iget-object p0, p0, LX8/f$d$d;->g:LX8/m;

    invoke-virtual {v0, v1, p0}, LX8/f$d;->q(ZLX8/m;)V

    const-wide/16 v0, -0x1

    return-wide v0
.end method
