.class public final LI8/H;
.super LJ8/d;
.source "SourceFile"


# instance fields
.field public a:J

.field public b:Lm8/e;


# direct methods
.method public constructor <init>()V
    .registers 3

    invoke-direct {p0}, LJ8/d;-><init>()V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, LI8/H;->a:J

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Z
    .registers 2

    check-cast p1, LI8/F;

    invoke-virtual {p0, p1}, LI8/H;->c(LI8/F;)Z

    move-result p0

    return p0
.end method

.method public bridge synthetic b(Ljava/lang/Object;)[Lm8/e;
    .registers 2

    check-cast p1, LI8/F;

    invoke-virtual {p0, p1}, LI8/H;->d(LI8/F;)[Lm8/e;

    move-result-object p0

    return-object p0
.end method

.method public c(LI8/F;)Z
    .registers 6

    iget-wide v0, p0, LI8/H;->a:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-ltz v0, :cond_a

    const/4 p0, 0x0

    return p0

    :cond_a
    invoke-virtual {p1}, LI8/F;->a0()J

    move-result-wide v0

    iput-wide v0, p0, LI8/H;->a:J

    const/4 p0, 0x1

    return p0
.end method

.method public d(LI8/F;)[Lm8/e;
    .registers 6

    iget-wide v0, p0, LI8/H;->a:J

    const-wide/16 v2, -0x1

    iput-wide v2, p0, LI8/H;->a:J

    const/4 v2, 0x0

    iput-object v2, p0, LI8/H;->b:Lm8/e;

    invoke-virtual {p1, v0, v1}, LI8/F;->Z(J)[Lm8/e;

    move-result-object p0

    return-object p0
.end method
