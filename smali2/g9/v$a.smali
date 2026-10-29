.class Lg9/v$a;
.super LP8/C;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg9/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private final b:LP8/C;

.field private final c:LP8/x;


# direct methods
.method constructor <init>(LP8/C;LP8/x;)V
    .registers 3

    invoke-direct {p0}, LP8/C;-><init>()V

    iput-object p1, p0, Lg9/v$a;->b:LP8/C;

    iput-object p2, p0, Lg9/v$a;->c:LP8/x;

    return-void
.end method


# virtual methods
.method public a()J
    .registers 3

    iget-object p0, p0, Lg9/v$a;->b:LP8/C;

    invoke-virtual {p0}, LP8/C;->a()J

    move-result-wide v0

    return-wide v0
.end method

.method public b()LP8/x;
    .registers 1

    iget-object p0, p0, Lg9/v$a;->c:LP8/x;

    return-object p0
.end method

.method public g(Le9/f;)V
    .registers 2

    iget-object p0, p0, Lg9/v$a;->b:LP8/C;

    invoke-virtual {p0, p1}, LP8/C;->g(Le9/f;)V

    return-void
.end method
