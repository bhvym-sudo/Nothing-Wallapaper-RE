.class final Li8/c$d;
.super Li8/c;
.source "SourceFile"

# interfaces
.implements Ljava/util/RandomAccess;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li8/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "d"
.end annotation


# instance fields
.field private final r:Li8/c;

.field private final s:I

.field private t:I


# direct methods
.method public constructor <init>(Li8/c;II)V
    .registers 5

    const-string v0, "list"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Li8/c;-><init>()V

    iput-object p1, p0, Li8/c$d;->r:Li8/c;

    iput p2, p0, Li8/c$d;->s:I

    sget-object v0, Li8/c;->q:Li8/c$a;

    invoke-virtual {p1}, Li8/b;->size()I

    move-result p1

    invoke-virtual {v0, p2, p3, p1}, Li8/c$a;->d(III)V

    sub-int/2addr p3, p2

    iput p3, p0, Li8/c$d;->t:I

    return-void
.end method


# virtual methods
.method public b()I
    .registers 1

    iget p0, p0, Li8/c$d;->t:I

    return p0
.end method

.method public get(I)Ljava/lang/Object;
    .registers 4

    sget-object v0, Li8/c;->q:Li8/c$a;

    iget v1, p0, Li8/c$d;->t:I

    invoke-virtual {v0, p1, v1}, Li8/c$a;->b(II)V

    iget-object v0, p0, Li8/c$d;->r:Li8/c;

    iget p0, p0, Li8/c$d;->s:I

    add-int/2addr p0, p1

    invoke-virtual {v0, p0}, Li8/c;->get(I)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
