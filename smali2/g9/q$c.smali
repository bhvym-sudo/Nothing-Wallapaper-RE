.class final Lg9/q$c;
.super LP8/E;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg9/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "c"
.end annotation


# instance fields
.field private final s:LP8/x;

.field private final t:J


# direct methods
.method constructor <init>(LP8/x;J)V
    .registers 4

    invoke-direct {p0}, LP8/E;-><init>()V

    iput-object p1, p0, Lg9/q$c;->s:LP8/x;

    iput-wide p2, p0, Lg9/q$c;->t:J

    return-void
.end method


# virtual methods
.method public f()J
    .registers 3

    iget-wide v0, p0, Lg9/q$c;->t:J

    return-wide v0
.end method

.method public g()LP8/x;
    .registers 1

    iget-object p0, p0, Lg9/q$c;->s:LP8/x;

    return-object p0
.end method

.method public u()Le9/g;
    .registers 2

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Cannot read raw response body of a converted body."

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
