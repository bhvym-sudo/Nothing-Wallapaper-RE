.class LZ7/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZ7/b;->l(Ljava/lang/String;IIIILf8/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic q:Ljava/lang/String;

.field final synthetic r:I

.field final synthetic s:I

.field final synthetic t:I

.field final synthetic u:I

.field final synthetic v:LZ7/b;


# direct methods
.method constructor <init>(LZ7/b;Ljava/lang/String;IIIILf8/a;)V
    .registers 8

    iput-object p1, p0, LZ7/b$a;->v:LZ7/b;

    iput-object p2, p0, LZ7/b$a;->q:Ljava/lang/String;

    iput p3, p0, LZ7/b$a;->r:I

    iput p4, p0, LZ7/b$a;->s:I

    iput p5, p0, LZ7/b$a;->t:I

    iput p6, p0, LZ7/b$a;->u:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 9

    :try_start_0
    iget-object v0, p0, LZ7/b$a;->v:LZ7/b;

    invoke-static {v0}, LZ7/b;->a(LZ7/b;)I

    move-result v0

    const/16 v1, 0x20

    if-gt v1, v0, :cond_28

    iget-object v0, p0, LZ7/b$a;->v:LZ7/b;

    invoke-static {v0}, LZ7/b;->b(LZ7/b;)I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_28

    iget-object v0, p0, LZ7/b$a;->v:LZ7/b;

    invoke-static {v0}, LZ7/b;->c(LZ7/b;)Le8/f;

    move-result-object v1

    iget-object v2, p0, LZ7/b$a;->q:Ljava/lang/String;

    iget v3, p0, LZ7/b$a;->r:I

    iget v4, p0, LZ7/b$a;->s:I

    iget v5, p0, LZ7/b$a;->t:I

    iget v6, p0, LZ7/b$a;->u:I

    const/4 v7, 0x0

    invoke-virtual/range {v1 .. v7}, Le8/f;->a(Ljava/lang/String;IIIILf8/a;)I

    return-void

    :cond_28
    iget-object v0, p0, LZ7/b$a;->v:LZ7/b;

    invoke-static {v0}, LZ7/b;->d(LZ7/b;)LZ7/a;

    move-result-object v0

    invoke-virtual {v0}, LZ7/a;->b()V

    iget-object v0, p0, LZ7/b$a;->v:LZ7/b;

    invoke-static {v0}, LZ7/b;->d(LZ7/b;)LZ7/a;

    move-result-object v1

    iget-object v2, p0, LZ7/b$a;->q:Ljava/lang/String;

    iget v3, p0, LZ7/b$a;->t:I

    iget v4, p0, LZ7/b$a;->u:I

    iget v5, p0, LZ7/b$a;->r:I

    iget v6, p0, LZ7/b$a;->s:I

    const/4 v7, 0x0

    invoke-virtual/range {v1 .. v7}, LZ7/a;->d(Ljava/lang/String;IIIILf8/a;)V

    iget-object v0, p0, LZ7/b$a;->v:LZ7/b;

    invoke-static {v0}, LZ7/b;->d(LZ7/b;)LZ7/a;

    move-result-object v0

    invoke-virtual {v0}, LZ7/a;->c()V

    iget-object p0, p0, LZ7/b$a;->v:LZ7/b;

    invoke-static {p0}, LZ7/b;->d(LZ7/b;)LZ7/a;

    move-result-object p0

    invoke-virtual {p0}, LZ7/a;->start()V
    :try_end_57
    .catchall {:try_start_0 .. :try_end_57} :catchall_58

    return-void

    :catchall_58
    move-exception v0

    move-object p0, v0

    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method
