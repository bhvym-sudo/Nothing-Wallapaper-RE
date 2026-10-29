.class final LW6/x$d$a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LW6/x$d$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic q:LW6/x;


# direct methods
.method constructor <init>(LW6/x;)V
    .registers 2

    iput-object p1, p0, LW6/x$d$a$a$a;->q:LW6/x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(ILm8/e;)Ljava/lang/Object;
    .registers 4

    iget-object p2, p0, LW6/x$d$a$a$a;->q:LW6/x;

    invoke-static {p2}, LW6/x;->d1(LW6/x;)I

    move-result p2

    if-eq p1, p2, :cond_12

    iget-object p2, p0, LW6/x$d$a$a$a;->q:LW6/x;

    invoke-static {p2}, LW6/x;->c1(LW6/x;)LZ6/d;

    move-result-object p2

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, LZ6/d;->q(IZ)V

    :cond_12
    iget-object p2, p0, LW6/x$d$a$a$a;->q:LW6/x;

    invoke-static {p2, p1}, LW6/x;->j1(LW6/x;I)V

    iget-object p0, p0, LW6/x$d$a$a$a;->q:LW6/x;

    invoke-static {p0}, LW6/x;->k1(LW6/x;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public bridge synthetic b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1, p2}, LW6/x$d$a$a$a;->a(ILm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
