.class final LW6/U$d$a$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LW6/U$d$a$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic q:LW6/U;


# direct methods
.method constructor <init>(LW6/U;)V
    .registers 2

    iput-object p1, p0, LW6/U$d$a$c$a;->q:LW6/U;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(ILm8/e;)Ljava/lang/Object;
    .registers 5

    iget-object p2, p0, LW6/U$d$a$c$a;->q:LW6/U;

    invoke-static {p2}, LW6/U;->q1(LW6/U;)LT6/b;

    move-result-object p2

    if-nez p2, :cond_e

    const-string p2, "subjectAdapter"

    invoke-static {p2}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 p2, 0x0

    :cond_e
    invoke-virtual {p2}, LT6/b;->getItemCount()I

    move-result p2

    if-ge p1, p2, :cond_2c

    iget-object p2, p0, LW6/U$d$a$c$a;->q:LW6/U;

    invoke-static {p2}, LW6/U;->s1(LW6/U;)I

    move-result p2

    if-eq p2, p1, :cond_2c

    iget-object p2, p0, LW6/U$d$a$c$a;->q:LW6/U;

    invoke-static {p2}, LW6/U;->r1(LW6/U;)LZ6/d;

    move-result-object p2

    iget-object v0, p0, LW6/U$d$a$c$a;->q:LW6/U;

    invoke-static {v0}, LW6/U;->s1(LW6/U;)I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p2, v0, v1}, LZ6/d;->q(IZ)V

    :cond_2c
    iget-object p0, p0, LW6/U$d$a$c$a;->q:LW6/U;

    invoke-static {p0, p1}, LW6/U;->x1(LW6/U;I)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public bridge synthetic b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1, p2}, LW6/U$d$a$c$a;->a(ILm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
