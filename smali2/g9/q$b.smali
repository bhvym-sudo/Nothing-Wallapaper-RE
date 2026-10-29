.class final Lg9/q$b;
.super LP8/E;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg9/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field private final s:LP8/E;

.field private final t:Le9/g;

.field u:Ljava/io/IOException;


# direct methods
.method constructor <init>(LP8/E;)V
    .registers 3

    invoke-direct {p0}, LP8/E;-><init>()V

    iput-object p1, p0, Lg9/q$b;->s:LP8/E;

    new-instance v0, Lg9/q$b$a;

    invoke-virtual {p1}, LP8/E;->u()Le9/g;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Lg9/q$b$a;-><init>(Lg9/q$b;Le9/B;)V

    invoke-static {v0}, Le9/o;->d(Le9/B;)Le9/g;

    move-result-object p1

    iput-object p1, p0, Lg9/q$b;->t:Le9/g;

    return-void
.end method


# virtual methods
.method public close()V
    .registers 1

    iget-object p0, p0, Lg9/q$b;->s:LP8/E;

    invoke-virtual {p0}, LP8/E;->close()V

    return-void
.end method

.method public f()J
    .registers 3

    iget-object p0, p0, Lg9/q$b;->s:LP8/E;

    invoke-virtual {p0}, LP8/E;->f()J

    move-result-wide v0

    return-wide v0
.end method

.method public g()LP8/x;
    .registers 1

    iget-object p0, p0, Lg9/q$b;->s:LP8/E;

    invoke-virtual {p0}, LP8/E;->g()LP8/x;

    move-result-object p0

    return-object p0
.end method

.method public u()Le9/g;
    .registers 1

    iget-object p0, p0, Lg9/q$b;->t:Le9/g;

    return-object p0
.end method

.method z()V
    .registers 1

    iget-object p0, p0, Lg9/q$b;->u:Ljava/io/IOException;

    if-nez p0, :cond_5

    return-void

    :cond_5
    throw p0
.end method
