.class public final LV8/h;
.super LP8/E;
.source "SourceFile"


# instance fields
.field private final s:Ljava/lang/String;

.field private final t:J

.field private final u:Le9/g;


# direct methods
.method public constructor <init>(Ljava/lang/String;JLe9/g;)V
    .registers 6

    const-string v0, "source"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LP8/E;-><init>()V

    iput-object p1, p0, LV8/h;->s:Ljava/lang/String;

    iput-wide p2, p0, LV8/h;->t:J

    iput-object p4, p0, LV8/h;->u:Le9/g;

    return-void
.end method


# virtual methods
.method public f()J
    .registers 3

    iget-wide v0, p0, LV8/h;->t:J

    return-wide v0
.end method

.method public g()LP8/x;
    .registers 2

    iget-object p0, p0, LV8/h;->s:Ljava/lang/String;

    if-eqz p0, :cond_b

    sget-object v0, LP8/x;->e:LP8/x$a;

    invoke-virtual {v0, p0}, LP8/x$a;->b(Ljava/lang/String;)LP8/x;

    move-result-object p0

    return-object p0

    :cond_b
    const/4 p0, 0x0

    return-object p0
.end method

.method public u()Le9/g;
    .registers 1

    iget-object p0, p0, LV8/h;->u:Le9/g;

    return-object p0
.end method
