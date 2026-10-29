.class public final LP8/E$b$a;
.super LP8/E;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP8/E$b;->b(Le9/g;LP8/x;J)LP8/E;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic s:LP8/x;

.field final synthetic t:J

.field final synthetic u:Le9/g;


# direct methods
.method constructor <init>(LP8/x;JLe9/g;)V
    .registers 5

    iput-object p1, p0, LP8/E$b$a;->s:LP8/x;

    iput-wide p2, p0, LP8/E$b$a;->t:J

    iput-object p4, p0, LP8/E$b$a;->u:Le9/g;

    invoke-direct {p0}, LP8/E;-><init>()V

    return-void
.end method


# virtual methods
.method public f()J
    .registers 3

    iget-wide v0, p0, LP8/E$b$a;->t:J

    return-wide v0
.end method

.method public g()LP8/x;
    .registers 1

    iget-object p0, p0, LP8/E$b$a;->s:LP8/x;

    return-object p0
.end method

.method public u()Le9/g;
    .registers 1

    iget-object p0, p0, LP8/E$b$a;->u:Le9/g;

    return-object p0
.end method
