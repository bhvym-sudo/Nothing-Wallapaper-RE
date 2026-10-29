.class public final LX8/f$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LX8/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Z

.field private final b:LT8/e;

.field public c:Ljava/net/Socket;

.field public d:Ljava/lang/String;

.field public e:Le9/g;

.field public f:Le9/f;

.field private g:LX8/f$c;

.field private h:LX8/l;

.field private i:I


# direct methods
.method public constructor <init>(ZLT8/e;)V
    .registers 4

    const-string v0, "taskRunner"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LX8/f$a;->a:Z

    iput-object p2, p0, LX8/f$a;->b:LT8/e;

    sget-object p1, LX8/f$c;->b:LX8/f$c;

    iput-object p1, p0, LX8/f$a;->g:LX8/f$c;

    sget-object p1, LX8/l;->b:LX8/l;

    iput-object p1, p0, LX8/f$a;->h:LX8/l;

    return-void
.end method


# virtual methods
.method public final a()LX8/f;
    .registers 2

    new-instance v0, LX8/f;

    invoke-direct {v0, p0}, LX8/f;-><init>(LX8/f$a;)V

    return-object v0
.end method

.method public final b()Z
    .registers 1

    iget-boolean p0, p0, LX8/f$a;->a:Z

    return p0
.end method

.method public final c()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, LX8/f$a;->d:Ljava/lang/String;

    if-eqz p0, :cond_5

    return-object p0

    :cond_5
    const-string p0, "connectionName"

    invoke-static {p0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public final d()LX8/f$c;
    .registers 1

    iget-object p0, p0, LX8/f$a;->g:LX8/f$c;

    return-object p0
.end method

.method public final e()I
    .registers 1

    iget p0, p0, LX8/f$a;->i:I

    return p0
.end method

.method public final f()LX8/l;
    .registers 1

    iget-object p0, p0, LX8/f$a;->h:LX8/l;

    return-object p0
.end method

.method public final g()Le9/f;
    .registers 1

    iget-object p0, p0, LX8/f$a;->f:Le9/f;

    if-eqz p0, :cond_5

    return-object p0

    :cond_5
    const-string p0, "sink"

    invoke-static {p0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public final h()Ljava/net/Socket;
    .registers 1

    iget-object p0, p0, LX8/f$a;->c:Ljava/net/Socket;

    if-eqz p0, :cond_5

    return-object p0

    :cond_5
    const-string p0, "socket"

    invoke-static {p0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public final i()Le9/g;
    .registers 1

    iget-object p0, p0, LX8/f$a;->e:Le9/g;

    if-eqz p0, :cond_5

    return-object p0

    :cond_5
    const-string p0, "source"

    invoke-static {p0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public final j()LT8/e;
    .registers 1

    iget-object p0, p0, LX8/f$a;->b:LT8/e;

    return-object p0
.end method

.method public final k(LX8/f$c;)LX8/f$a;
    .registers 3

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LX8/f$a;->g:LX8/f$c;

    return-object p0
.end method

.method public final l(I)LX8/f$a;
    .registers 2

    iput p1, p0, LX8/f$a;->i:I

    return-object p0
.end method

.method public final m(Ljava/lang/String;)V
    .registers 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LX8/f$a;->d:Ljava/lang/String;

    return-void
.end method

.method public final n(Le9/f;)V
    .registers 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LX8/f$a;->f:Le9/f;

    return-void
.end method

.method public final o(Ljava/net/Socket;)V
    .registers 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LX8/f$a;->c:Ljava/net/Socket;

    return-void
.end method

.method public final p(Le9/g;)V
    .registers 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LX8/f$a;->e:Le9/g;

    return-void
.end method

.method public final q(Ljava/net/Socket;Ljava/lang/String;Le9/g;Le9/f;)LX8/f$a;
    .registers 6

    const-string v0, "socket"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "peerName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sink"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LX8/f$a;->o(Ljava/net/Socket;)V

    iget-boolean p1, p0, LX8/f$a;->a:Z

    if-eqz p1, :cond_32

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v0, LQ8/d;->i:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x20

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_43

    :cond_32
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "MockWebServer "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_43
    invoke-virtual {p0, p1}, LX8/f$a;->m(Ljava/lang/String;)V

    invoke-virtual {p0, p3}, LX8/f$a;->p(Le9/g;)V

    invoke-virtual {p0, p4}, LX8/f$a;->n(Le9/f;)V

    return-object p0
.end method
