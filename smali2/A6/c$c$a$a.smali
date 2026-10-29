.class public final LA6/c$c$a$a;
.super Li6/g$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LA6/c$c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic q:LA6/c;

.field final synthetic r:Ljava/io/File;

.field final synthetic s:LF8/l;


# direct methods
.method constructor <init>(LA6/c;Ljava/io/File;LF8/l;)V
    .registers 4

    iput-object p1, p0, LA6/c$c$a$a;->q:LA6/c;

    iput-object p2, p0, LA6/c$c$a$a;->r:Ljava/io/File;

    iput-object p3, p0, LA6/c$c$a$a;->s:LF8/l;

    invoke-direct {p0}, Li6/g$a;-><init>()V

    return-void
.end method


# virtual methods
.method public P(Z)V
    .registers 4

    iget-object v0, p0, LA6/c$c$a$a;->q:LA6/c;

    iget-object v1, p0, LA6/c$c$a$a;->r:Ljava/io/File;

    invoke-static {v0, v1}, LA6/c;->z(LA6/c;Ljava/io/File;)V

    iget-object v0, p0, LA6/c$c$a$a;->s:LF8/l;

    invoke-interface {v0}, LF8/l;->a()Z

    move-result v0

    if-eqz v0, :cond_39

    iget-object v0, p0, LA6/c$c$a$a;->q:LA6/c;

    invoke-static {v0}, LA6/c;->g(LA6/c;)Lq6/b;

    move-result-object v0

    const-string v1, "blur done."

    invoke-virtual {v0, v1}, Lq6/b;->a(Ljava/lang/String;)V

    iget-object p0, p0, LA6/c$c$a$a;->s:LF8/l;

    if-eqz p1, :cond_27

    sget-object p1, Lh8/q;->r:Lh8/q$a;

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    :goto_22
    invoke-static {p1}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_35

    :cond_27
    sget-object p1, Lh8/q;->r:Lh8/q$a;

    new-instance p1, Ljava/lang/Exception;

    const-string v0, "blur done failed."

    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lh8/r;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_22

    :goto_35
    invoke-interface {p0, p1}, Lm8/e;->resumeWith(Ljava/lang/Object;)V

    return-void

    :cond_39
    iget-object p0, p0, LA6/c$c$a$a;->q:LA6/c;

    invoke-static {p0}, LA6/c;->g(LA6/c;)Lq6/b;

    move-result-object p0

    const-string p1, "blur done but cancel."

    invoke-virtual {p0, p1}, Lq6/b;->a(Ljava/lang/String;)V

    return-void
.end method
