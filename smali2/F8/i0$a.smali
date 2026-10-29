.class final LF8/i0$a;
.super LF8/i0$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF8/i0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field private final s:LF8/l;

.field final synthetic t:LF8/i0;


# direct methods
.method public constructor <init>(LF8/i0;JLF8/l;)V
    .registers 5

    iput-object p1, p0, LF8/i0$a;->t:LF8/i0;

    invoke-direct {p0, p2, p3}, LF8/i0$c;-><init>(J)V

    iput-object p4, p0, LF8/i0$a;->s:LF8/l;

    return-void
.end method


# virtual methods
.method public run()V
    .registers 3

    iget-object v0, p0, LF8/i0$a;->s:LF8/l;

    iget-object p0, p0, LF8/i0$a;->t:LF8/i0;

    sget-object v1, Lh8/A;->a:Lh8/A;

    invoke-interface {v0, p0, v1}, LF8/l;->q(LF8/I;Ljava/lang/Object;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, LF8/i0$c;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, LF8/i0$a;->s:LF8/l;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
