.class final LI8/w$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI8/w$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic q:Lkotlin/jvm/internal/E;

.field final synthetic r:LF8/L;

.field final synthetic s:LF8/v;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/E;LF8/L;LF8/v;)V
    .registers 4

    iput-object p1, p0, LI8/w$b$a;->q:Lkotlin/jvm/internal/E;

    iput-object p2, p0, LI8/w$b$a;->r:LF8/L;

    iput-object p3, p0, LI8/w$b$a;->s:LF8/v;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
    .registers 5

    iget-object p2, p0, LI8/w$b$a;->q:Lkotlin/jvm/internal/E;

    iget-object v0, p2, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    check-cast v0, LI8/A;

    if-eqz v0, :cond_c

    invoke-interface {v0, p1}, LI8/A;->setValue(Ljava/lang/Object;)V

    goto :goto_26

    :cond_c
    iget-object v0, p0, LI8/w$b$a;->r:LF8/L;

    iget-object p0, p0, LI8/w$b$a;->s:LF8/v;

    invoke-static {p1}, LI8/Q;->a(Ljava/lang/Object;)LI8/A;

    move-result-object p1

    new-instance v1, LI8/C;

    invoke-interface {v0}, LF8/L;->w0()Lm8/i;

    move-result-object v0

    invoke-static {v0}, LF8/A0;->k(Lm8/i;)LF8/x0;

    move-result-object v0

    invoke-direct {v1, p1, v0}, LI8/C;-><init>(LI8/O;LF8/x0;)V

    invoke-interface {p0, v1}, LF8/v;->B0(Ljava/lang/Object;)Z

    iput-object p1, p2, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    :goto_26
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
