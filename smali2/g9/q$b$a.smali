.class Lg9/q$b$a;
.super Le9/j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg9/q$b;-><init>(LP8/E;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic r:Lg9/q$b;


# direct methods
.method constructor <init>(Lg9/q$b;Le9/B;)V
    .registers 3

    iput-object p1, p0, Lg9/q$b$a;->r:Lg9/q$b;

    invoke-direct {p0, p2}, Le9/j;-><init>(Le9/B;)V

    return-void
.end method


# virtual methods
.method public e1(Le9/e;J)J
    .registers 4

    :try_start_0
    invoke-super {p0, p1, p2, p3}, Le9/j;->e1(Le9/e;J)J

    move-result-wide p0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_4} :catch_5

    return-wide p0

    :catch_5
    move-exception p1

    iget-object p0, p0, Lg9/q$b$a;->r:Lg9/q$b;

    iput-object p1, p0, Lg9/q$b;->u:Ljava/io/IOException;

    throw p1
.end method
