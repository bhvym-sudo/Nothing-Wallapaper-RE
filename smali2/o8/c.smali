.class final Lo8/c;
.super Li8/c;
.source "SourceFile"

# interfaces
.implements Lo8/a;
.implements Ljava/io/Serializable;


# instance fields
.field private final r:[Ljava/lang/Enum;


# direct methods
.method public constructor <init>([Ljava/lang/Enum;)V
    .registers 3

    const-string v0, "entries"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Li8/c;-><init>()V

    iput-object p1, p0, Lo8/c;->r:[Ljava/lang/Enum;

    return-void
.end method


# virtual methods
.method public b()I
    .registers 1

    iget-object p0, p0, Lo8/c;->r:[Ljava/lang/Enum;

    array-length p0, p0

    return p0
.end method

.method public final bridge contains(Ljava/lang/Object;)Z
    .registers 3

    instance-of v0, p1, Ljava/lang/Enum;

    if-nez v0, :cond_6

    const/4 p0, 0x0

    return p0

    :cond_6
    check-cast p1, Ljava/lang/Enum;

    invoke-virtual {p0, p1}, Lo8/c;->g(Ljava/lang/Enum;)Z

    move-result p0

    return p0
.end method

.method public g(Ljava/lang/Enum;)Z
    .registers 3

    const-string v0, "element"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lo8/c;->r:[Ljava/lang/Enum;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    invoke-static {p0, v0}, Li8/m;->I([Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Enum;

    if-ne p0, p1, :cond_15

    const/4 p0, 0x1

    return p0

    :cond_15
    const/4 p0, 0x0

    return p0
.end method

.method public bridge synthetic get(I)Ljava/lang/Object;
    .registers 2

    invoke-virtual {p0, p1}, Lo8/c;->m(I)Ljava/lang/Enum;

    move-result-object p0

    return-object p0
.end method

.method public final bridge indexOf(Ljava/lang/Object;)I
    .registers 3

    instance-of v0, p1, Ljava/lang/Enum;

    if-nez v0, :cond_6

    const/4 p0, -0x1

    return p0

    :cond_6
    check-cast p1, Ljava/lang/Enum;

    invoke-virtual {p0, p1}, Lo8/c;->n(Ljava/lang/Enum;)I

    move-result p0

    return p0
.end method

.method public final bridge lastIndexOf(Ljava/lang/Object;)I
    .registers 3

    instance-of v0, p1, Ljava/lang/Enum;

    if-nez v0, :cond_6

    const/4 p0, -0x1

    return p0

    :cond_6
    check-cast p1, Ljava/lang/Enum;

    invoke-virtual {p0, p1}, Lo8/c;->o(Ljava/lang/Enum;)I

    move-result p0

    return p0
.end method

.method public m(I)Ljava/lang/Enum;
    .registers 4

    sget-object v0, Li8/c;->q:Li8/c$a;

    iget-object v1, p0, Lo8/c;->r:[Ljava/lang/Enum;

    array-length v1, v1

    invoke-virtual {v0, p1, v1}, Li8/c$a;->b(II)V

    iget-object p0, p0, Lo8/c;->r:[Ljava/lang/Enum;

    aget-object p0, p0, p1

    return-object p0
.end method

.method public n(Ljava/lang/Enum;)I
    .registers 3

    const-string v0, "element"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    iget-object p0, p0, Lo8/c;->r:[Ljava/lang/Enum;

    invoke-static {p0, v0}, Li8/m;->I([Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Enum;

    if-ne p0, p1, :cond_14

    return v0

    :cond_14
    const/4 p0, -0x1

    return p0
.end method

.method public o(Ljava/lang/Enum;)I
    .registers 3

    const-string v0, "element"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lo8/c;->indexOf(Ljava/lang/Object;)I

    move-result p0

    return p0
.end method
