.class public final LX8/f$d$c;
.super LT8/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LX8/f$d;->k(ZII)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic e:LX8/f;

.field final synthetic f:I

.field final synthetic g:I


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLX8/f;II)V
    .registers 6

    iput-object p3, p0, LX8/f$d$c;->e:LX8/f;

    iput p4, p0, LX8/f$d$c;->f:I

    iput p5, p0, LX8/f$d$c;->g:I

    invoke-direct {p0, p1, p2}, LT8/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public f()J
    .registers 4

    iget-object v0, p0, LX8/f$d$c;->e:LX8/f;

    iget v1, p0, LX8/f$d$c;->f:I

    iget p0, p0, LX8/f$d$c;->g:I

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1, p0}, LX8/f;->B1(ZII)V

    const-wide/16 v0, -0x1

    return-wide v0
.end method
