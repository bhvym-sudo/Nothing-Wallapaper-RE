.class public final LP8/C$a$b;
.super LP8/C;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP8/C$a;->e([BLP8/x;II)LP8/C;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic b:LP8/x;

.field final synthetic c:I

.field final synthetic d:[B

.field final synthetic e:I


# direct methods
.method constructor <init>(LP8/x;I[BI)V
    .registers 5

    iput-object p1, p0, LP8/C$a$b;->b:LP8/x;

    iput p2, p0, LP8/C$a$b;->c:I

    iput-object p3, p0, LP8/C$a$b;->d:[B

    iput p4, p0, LP8/C$a$b;->e:I

    invoke-direct {p0}, LP8/C;-><init>()V

    return-void
.end method


# virtual methods
.method public a()J
    .registers 3

    iget p0, p0, LP8/C$a$b;->c:I

    int-to-long v0, p0

    return-wide v0
.end method

.method public b()LP8/x;
    .registers 1

    iget-object p0, p0, LP8/C$a$b;->b:LP8/x;

    return-object p0
.end method

.method public g(Le9/f;)V
    .registers 4

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LP8/C$a$b;->d:[B

    iget v1, p0, LP8/C$a$b;->e:I

    iget p0, p0, LP8/C$a$b;->c:I

    invoke-interface {p1, v0, v1, p0}, Le9/f;->k0([BII)Le9/f;

    return-void
.end method
