.class Ld8/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld8/b;->u(Ljava/lang/String;)Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(La8/e;La8/e;)I
    .registers 3

    iget-object p0, p1, La8/e;->a:La8/b;

    iget p0, p0, La8/b;->b:I

    iget-object p1, p2, La8/e;->a:La8/b;

    iget p1, p1, La8/b;->b:I

    sub-int/2addr p0, p1

    return p0
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .registers 3

    check-cast p1, La8/e;

    check-cast p2, La8/e;

    invoke-virtual {p0, p1, p2}, Ld8/b$a;->a(La8/e;La8/e;)I

    move-result p0

    return p0
.end method
