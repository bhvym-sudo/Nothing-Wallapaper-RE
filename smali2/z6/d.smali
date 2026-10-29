.class public Lz6/d;
.super Le9/i;
.source "SourceFile"


# instance fields
.field private final r:Lv8/l;

.field private s:Z


# direct methods
.method public constructor <init>(Le9/z;Lv8/l;)V
    .registers 4

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onException"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Le9/i;-><init>(Le9/z;)V

    iput-object p2, p0, Lz6/d;->r:Lv8/l;

    return-void
.end method


# virtual methods
.method public Z(Le9/e;J)V
    .registers 5

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lz6/d;->s:Z

    if-eqz v0, :cond_d

    invoke-virtual {p1, p2, p3}, Le9/e;->skip(J)V

    return-void

    :cond_d
    :try_start_d
    invoke-super {p0, p1, p2, p3}, Le9/i;->Z(Le9/e;J)V
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_10} :catch_11

    return-void

    :catch_11
    move-exception p1

    const/4 p2, 0x1

    iput-boolean p2, p0, Lz6/d;->s:Z

    iget-object p0, p0, Lz6/d;->r:Lv8/l;

    invoke-interface {p0, p1}, Lv8/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public close()V
    .registers 3

    iget-boolean v0, p0, Lz6/d;->s:Z

    if-eqz v0, :cond_5

    goto :goto_12

    :cond_5
    :try_start_5
    invoke-super {p0}, Le9/i;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_8} :catch_9

    return-void

    :catch_9
    move-exception v0

    const/4 v1, 0x1

    iput-boolean v1, p0, Lz6/d;->s:Z

    iget-object p0, p0, Lz6/d;->r:Lv8/l;

    invoke-interface {p0, v0}, Lv8/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_12
    return-void
.end method

.method public flush()V
    .registers 3

    iget-boolean v0, p0, Lz6/d;->s:Z

    if-eqz v0, :cond_5

    goto :goto_12

    :cond_5
    :try_start_5
    invoke-super {p0}, Le9/i;->flush()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_8} :catch_9

    return-void

    :catch_9
    move-exception v0

    const/4 v1, 0x1

    iput-boolean v1, p0, Lz6/d;->s:Z

    iget-object p0, p0, Lz6/d;->r:Lv8/l;

    invoke-interface {p0, v0}, Lv8/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_12
    return-void
.end method
