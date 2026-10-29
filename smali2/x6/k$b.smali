.class final Lx6/k$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx6/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private final a:Lw6/d;

.field private b:LC6/j;


# direct methods
.method public constructor <init>(Lw6/d;)V
    .registers 3

    const-string v0, "r"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx6/k$b;->a:Lw6/d;

    return-void
.end method


# virtual methods
.method public final a()Lw6/c;
    .registers 3

    invoke-virtual {p0}, Lx6/k$b;->c()Z

    move-result v0

    if-eqz v0, :cond_1b

    new-instance v0, Lw6/c;

    iget-object v1, p0, Lx6/k$b;->b:LC6/j;

    invoke-static {v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget-object p0, p0, Lx6/k$b;->a:Lw6/d;

    invoke-virtual {p0}, Lw6/d;->d()Lw6/c;

    move-result-object p0

    invoke-virtual {p0}, Lw6/c;->b()LE6/a$a;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lw6/c;-><init>(LC6/j;LE6/a$a;)V

    return-object v0

    :cond_1b
    iget-object p0, p0, Lx6/k$b;->a:Lw6/d;

    invoke-virtual {p0}, Lw6/d;->d()Lw6/c;

    move-result-object p0

    return-object p0
.end method

.method public final b()Lw6/d;
    .registers 3

    invoke-virtual {p0}, Lx6/k$b;->c()Z

    move-result v0

    if-eqz v0, :cond_16

    new-instance v0, Lw6/d;

    invoke-virtual {p0}, Lx6/k$b;->a()Lw6/c;

    move-result-object v1

    iget-object p0, p0, Lx6/k$b;->a:Lw6/d;

    invoke-virtual {p0}, Lw6/d;->c()Lw6/b;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lw6/d;-><init>(Lw6/c;Lw6/b;)V

    return-object v0

    :cond_16
    iget-object p0, p0, Lx6/k$b;->a:Lw6/d;

    return-object p0
.end method

.method public final c()Z
    .registers 2

    iget-object v0, p0, Lx6/k$b;->b:LC6/j;

    if-eqz v0, :cond_18

    iget-object v0, p0, Lx6/k$b;->a:Lw6/d;

    invoke-virtual {v0}, Lw6/d;->d()Lw6/c;

    move-result-object v0

    invoke-virtual {v0}, Lw6/c;->c()LC6/j;

    move-result-object v0

    iget-object p0, p0, Lx6/k$b;->b:LC6/j;

    invoke-static {v0, p0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_18

    const/4 p0, 0x1

    return p0

    :cond_18
    const/4 p0, 0x0

    return p0
.end method
