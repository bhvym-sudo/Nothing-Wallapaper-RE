.class public final Lz6/b$c$a;
.super Le9/j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz6/b$c;->k(I)Le9/B;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private r:Z

.field final synthetic s:Lz6/b;

.field final synthetic t:Lz6/b$c;


# direct methods
.method constructor <init>(Le9/B;Lz6/b;Lz6/b$c;)V
    .registers 4

    iput-object p2, p0, Lz6/b$c$a;->s:Lz6/b;

    iput-object p3, p0, Lz6/b$c$a;->t:Lz6/b$c;

    invoke-direct {p0, p1}, Le9/j;-><init>(Le9/B;)V

    return-void
.end method


# virtual methods
.method public close()V
    .registers 3

    invoke-super {p0}, Le9/j;->close()V

    iget-boolean v0, p0, Lz6/b$c$a;->r:Z

    if-nez v0, :cond_30

    const/4 v0, 0x1

    iput-boolean v0, p0, Lz6/b$c$a;->r:Z

    iget-object v0, p0, Lz6/b$c$a;->s:Lz6/b;

    iget-object p0, p0, Lz6/b$c$a;->t:Lz6/b$c;

    monitor-enter v0

    :try_start_f
    invoke-virtual {p0}, Lz6/b$c;->f()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {p0, v1}, Lz6/b$c;->n(I)V

    invoke-virtual {p0}, Lz6/b$c;->f()I

    move-result v1

    if-nez v1, :cond_2a

    invoke-virtual {p0}, Lz6/b$c;->i()Z

    move-result v1

    if-eqz v1, :cond_2a

    invoke-virtual {v0, p0}, Lz6/b;->g1(Lz6/b$c;)Z

    goto :goto_2a

    :catchall_28
    move-exception p0

    goto :goto_2e

    :cond_2a
    :goto_2a
    sget-object p0, Lh8/A;->a:Lh8/A;
    :try_end_2c
    .catchall {:try_start_f .. :try_end_2c} :catchall_28

    monitor-exit v0

    return-void

    :goto_2e
    monitor-exit v0

    throw p0

    :cond_30
    return-void
.end method
