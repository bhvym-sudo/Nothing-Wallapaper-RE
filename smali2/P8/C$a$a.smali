.class public final LP8/C$a$a;
.super LP8/C;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP8/C$a;->d(Le9/h;LP8/x;)LP8/C;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic b:LP8/x;

.field final synthetic c:Le9/h;


# direct methods
.method constructor <init>(LP8/x;Le9/h;)V
    .registers 3

    iput-object p1, p0, LP8/C$a$a;->b:LP8/x;

    iput-object p2, p0, LP8/C$a$a;->c:Le9/h;

    invoke-direct {p0}, LP8/C;-><init>()V

    return-void
.end method


# virtual methods
.method public a()J
    .registers 3

    iget-object p0, p0, LP8/C$a$a;->c:Le9/h;

    invoke-virtual {p0}, Le9/h;->v()I

    move-result p0

    int-to-long v0, p0

    return-wide v0
.end method

.method public b()LP8/x;
    .registers 1

    iget-object p0, p0, LP8/C$a$a;->b:LP8/x;

    return-object p0
.end method

.method public g(Le9/f;)V
    .registers 3

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, LP8/C$a$a;->c:Le9/h;

    invoke-interface {p1, p0}, Le9/f;->s0(Le9/h;)Le9/f;

    return-void
.end method
